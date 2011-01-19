<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>YUI 3.x: CSS Grids Units Example</title>
    <link rel="stylesheet" href="resources/yui/3.3.0/cssreset/reset-min.css" type="text/css">
    <link rel="stylesheet" href="resources/yui/3.3.0/cssfonts/fonts-min.css" type="text/css">
    <link rel="stylesheet" href="resources/yui/3.3.0/cssgrids/grids-min.css" type="text/css">
 	<link rel="stylesheet" href="resources/css/global.css" type="text/css">
<style>
</style>

</head>
<body id="doc">
    <div id="hd">
        <img alt="Foravila den Joan" src="resources/images/foravila-banner.jpg">
        <h1>Bienvenido a la Foravila de´n Joan</h1>
    </div>

    <div class="yui3-g">
        <div class="yui3-u-1-5" id="nav">
            <div class="content">

                <ul>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>

                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                    <li><a href="#">lorem ipsum dolor</a></li>
                </ul>

            </div>
        </div>

        <div class="yui3-u-2-5" id="main">
            <div class="content">
                <p>Cras porta venenatis egestas. Vestibulum pretium massa id turpis varius iaculis. Aliquam nec cursus lorem. Sed aliquet hendrerit sem, et consectetur dolor condimentum quis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse congue sapien a nibh venenatis sit amet aliquet elit suscipit. Curabitur gravida magna ut diam pellentesque et luctus metus auctor. Nam quis hendrerit enim. Donec tincidunt libero a dolor hendrerit at tempus quam venenatis. In quis tempus ipsum. Vestibulum nulla enim, bibendum ut vestibulum at, laoreet a felis.</p>
                <div class="yui3-g thumb-captions">
                    <div class="yui3-u-1-3">
                        <a href="#"><img width="80" height="60" src="http://developer.yahoo.com/yui/docs/assets/examples/exampleimages/small/museum.jpg">

                            Lorem ispum
                        </a>
                    </div>
                    <div class="yui3-u-1-3">
                        <a href="#"><img height="80" width="60" src="http://developer.yahoo.com/yui/docs/assets/examples/exampleimages/small/museum.jpg">
                            Lorem ispum
                        </a>
                    </div>
                    <div class="yui3-u-1-3">
                        <a href="#"><img height="80" width="60" src="http://developer.yahoo.com/yui/docs/assets/examples/exampleimages/small/museum.jpg">

                            Lorem ispum
                        </a>
                    </div>
                </div>

                <div class="yui3-g">
                    <div class="yui3-u-1-2">
                        <p>Cras porta venenatis egestas. Vestibulum pretium massa id turpis varius iaculis. Aliquam nec cursus lorem. Sed aliquet hendrerit sem, et consectetur dolor condimentum quis. Curabitur gravida magna ut diam pellentesque et luctus metus auctor. Nam quis hendrerit enim. </p>
                    </div>

                    <div class="yui3-u-1-2">
                        <p>Suspendisse congue sapien a nibh venenatis sit amet aliquet elit suscipit.  Vestibulum nulla enim, bibendum ut vestibulum at, laoreet a felis.</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="yui3-u-2-5" id="extra">
            <div class="content">

                <div class="yui3-g">
                    <div id="top-stories">
                        <div class="yui3-u-1-2">
                            <ol>
                                <li><a href="#">lorem ipsum dolor</a></li>
                                <li><a href="#">lorem ipsum dolor</a></li>
                                <li><a href="#">lorem ipsum dolor</a></li>

                                <li><a href="#">lorem ipsum dolor</a></li>
                                <li><a href="#">lorem ipsum dolor</a></li>
                            </ol>
                        </div>

                        <div class="yui3-u-1-2">
                            <ol start="6">
                                <li><a href="#">lorem ipsum dolor</a></li>

                                <li><a href="#">lorem ipsum dolor</a></li>
                                <li><a href="#">lorem ipsum dolor</a></li>
                                <li><a href="#">lorem ipsum dolor</a></li>
                            </ol>
                        </div>
                    </div>
                </div>

                <div class="advertisement">
                    <div class="yui3-g">
                        <div class="yui3-u align-stub"></div>
                        <p class="yui3-u-1-2">Nulla venenatis ante in enim ornare dapibus. Integer placerat ligula diam.</p>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <div id="more">
        <div class="yui3-g">
            <ul class="yui3-u-1-4">
                <li><a href="#">lorem</a></li>
                <li><a href="#">ipsum</a></li>
                <li><a href="#">dolor</a></li>

            </ul>

            <ul class="yui3-u-1-4">
                <li><a href="#">lorem</a></li>
                <li><a href="#">ipsum</a></li>
                <li><a href="#">dolor</a></li>
            </ul>

            <ul class="yui3-u-1-4">
                <li><a href="#">lorem</a></li>
                <li><a href="#">ipsum</a></li>
            </ul>
        </div>
    </div>

    <div id="ft">

        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed arcu arcu, volutpat vel volutpat vel, varius ac odio.</p>
    </div>
</body>
</html>
