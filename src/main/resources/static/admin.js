/**
 * 
 */
async function loadJobInfoTable(url, table) {
    console.log(url);
    console.log(table)
    const tableBody = table.querySelector("tbody");
    const response = await fetch(url);
    const jobInfoList = await response.json();
    for (const jobInfo of jobInfoList) {
        const rowElement = document.createElement("tr");
        rowElement.appendChild(createTd(jobInfo["jobId"]));
        rowElement.appendChild(createTd(jobInfo["jobStatus"]));

        rowElement.appendChild(createTdWithButton("rollback", "url"));

        tableBody.appendChild(rowElement);
    }
}

function createTd(content) {
    const td = document.createElement("td");
    td.textContent = content;
    return td;
}

function createTdWithButton(content, url) {
    const td = document.createElement("td");
    const btn = document.createElement("input");
    btn.type = "button";
    btn.className = "btn btn-secondary";
    btn.value = content;
    btn.onclick = (function(url) {return function() {callUrl(url);}})(url);
    td.appendChild(btn);
    return td;
}

function callUrl(url) {
    console.log("call this url:" + url);
}

loadJobInfoTable("http://localhost:8080/admin/job", document.querySelector("table"));
console.log("hello shit");