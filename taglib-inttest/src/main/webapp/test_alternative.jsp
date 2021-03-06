<%@ taglib prefix="reevoo" uri="http://reevoo.com/java-taglib/v1" %>
<html>
<head>
    <title>Test page</title>
    <reevoo:cssAssets/>
</head>

<body>
<h1>Test page</h1>

<h2>Valid:</h2>
<reevoo:mark sku="10" trkref="REV" baseURI="http://mark.reevoo.com/reevoomark/embeddable_reviews">
    <p>You should never see this</p>
</reevoo:mark>

<h2>No reviews:</h2>
<reevoo:mark sku="22" trkref="REV" baseURI="http://mark.reevoo.com/reevoomark/embeddable_reviews">
    <p>You should always see this because there are no reviews.</p>
</reevoo:mark>

<h2>404:</h2>
<reevoo:mark sku="no-a-real-sku" trkref="REV" baseURI="http://mark.reevoo.com/reevoomark/embeddable_reviews">
    <p>You should always see this, because there are no reviews.</p>
</reevoo:mark>

<h2>Connect Failure:</h2>
<reevoo:mark sku="10" trkref="REV" baseURI="http://mark.reevoo-bo.com/reevoomark/embeddable_reviews">
    <p>You should always see this, because this mark is pointing to a non-existent server.</p>
</reevoo:mark>

<h2>Retailer Reviews:</h2>
<reevoo:mark trkref="JSP" baseURI="http://mark.reevoo.com/reevoomark/embeddable_reviews">
    <p>You should never see this.</p>
</reevoo:mark>

<reevoo:javascriptAssets trkref="REV"/>
</body>
</html>
