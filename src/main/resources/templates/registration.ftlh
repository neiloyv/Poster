<#import "parts/common.ftlh" as common>
<#import "parts/login.ftlh" as log>
<@common.page>
    <div>Add new user:</div>
    ${message?if_exists}
    <@log.login "/registration" />
</@common.page>