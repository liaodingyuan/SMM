<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>元哈哈的网络爬虫</title>
</head>
<style type="text/css">
.search-field .shadow-x {
	position: absolute;
	top: 0;
	left: 1px;
	width: 438px;
	height: 0;
	border-top: 1px solid #d0d0d0;
	border-bottom: 1px solid #f0f0f0;
	overflow: hidden;
	z-index: 1;
}

.search-field .shadow-y {
	position: absolute;
	top: 0;
	left: 0;
	width: 0;
	height: 30px;
	border-left: 1px solid #d0d0d0;
	border-right: 1px solid #f0f0f0;
	overflow: hidden;
}
</style>
<body>
	<center>
		<h1>元哈哈的搜索引擎</h1>
		<br>
		<div id="search-field" >
			<form id="search-form" action="/startSearch" method="post">
				<div class="search-input">
					<div class="shadow-x"></div>
					<div class="shadow-y"></div>
					<input type="text" name="sourceurl" />
				</div>
				<button type="submit">元哈哈搜索</button>
			</form>
		</div>

	</center>
</body>
</html>
