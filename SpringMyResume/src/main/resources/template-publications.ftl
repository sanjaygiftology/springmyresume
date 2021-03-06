<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="http://fonts.googleapis.com/css?family=Arvo" rel="stylesheet" type="text/css" />
        <link href="http://fonts.googleapis.com/css?family=Lobster" rel="stylesheet" type="text/css" />
        <link href="../css/style.css" rel="stylesheet" type="text/css" />
<title>Resume of ${name}</title>
</head>
<body>
<div id="bg">
	<div id="outer">
	<#if objective??>
		<div id="objective">
			${objective}
		</div>
	</#if>
	<div id="header">
		<div id="logo">
			<h1>
				<a href="#">${name?capitalize}</a>
			</h1>
		</div>
		<div id="nav">
			<ul>
			<#list menu as menuitem>
				<li>
				<#if menuitem.url??>
					<a href="${menuitem.url}">${menuitem.name}</a>
				</#if>
				</li>
			</#list>
			</ul>						
		</div>
	</div>
	<div id="main">
		<div id="sidebar">
			<ul class="linkedList">
			 <#list menu as menuitem>
				<li>
					<a href="${menuitem.url}">${menuitem.name}</a>
				</li>
			</#list>									
		</div>
		<div id="content">
			<div id="box1">
			<#list publications as pub>
				<table class="CSSTableGenerator">
				<tr>
					<th> Paper </th>
					<th> Conference </th>
					<th> Journal  </th>
					<th>  Year  </th>
					<th>  Details  </th>
				</tr>
				<tr>
					<td>${pub.paperName !}</td>
					<td>${pub.conference !}</td>
					<td>${pub.journal !}</td>
					<td>${pub.year !}</td>
	   				
					
						<td >
							${pub.paperDetails!}
						</td>
						
					</tr>
							
				</table>
						</#list>
			</div>
		</div>
	</div>
	</div>
</div>
</body>
</html>