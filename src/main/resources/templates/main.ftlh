<#import "parts/common.ftlh" as common>
<#import "parts/login.ftlh" as log>
<@common.page>
    <div>
        <@log.logout />
    </div>
    <div>
        <form method="post" action="add" enctype="multipart/form-data">
            <input type="text" name="text" placeholder="Enter your message:">
            <input type="text" name="tag" placeholder="Tag:">
            <input type="file" name="file">
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
            <button type="submit">Add</button>
        </form>
        <form method="get" action="/main">
            <input type="text" name="filter" value="${filter?if_exists}" placeholder="Enter tag for filtering">
            <button type="submit">Filter</button>
        </form>
    </div>

    <div>List of messages:</div>
    <#list messages as message>
        <div>
            <b>${message.id}</b>
            <span>${message.text}</span>
            <i>${message.tag}</i>
            <strong>${message.authorName}</strong>
            <div>
                <#if message.filename??>
                    <img src="/img/${message.filename}">
                </#if>
            </div>
        </div>
    <#else> No message
    </#list>
</@common.page>