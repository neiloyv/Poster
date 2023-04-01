<#import "parts/common.ftlh" as common>
<#import "parts/login.ftlh" as log>
<@common.page>
    <div>Login page:</div>
    <@log.login "/login" />
    <a href="/registration">Registration</a>
</@common.page>