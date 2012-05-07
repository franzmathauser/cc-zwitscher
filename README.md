CloudComputing Vorlesung
========================

Dieses Projekt ist eine Backendkomponente der Zwitscher-Anwendung.

Durch einen REST-Webservice kann sich das Frontend mit Informationen füttern lassen. 

Requires: 
---------
* JDK 1.6
* Maven 3
* evtl. Eclipse ;) 

Entwicklung:
-----------
Eclipse-Projekt generieren:

    $ mvn eclipse:eclipse

WAR-Bauen:
----------

    $ mvn clean package

WAR-Testen:
----------

    $ mvn clean package tomcat:run

Der Initiale-Service kann unter folgender URL erreicht werden.

   http://localhost:9999/cxf/rest/time

Sonstiges
---------
Das Projekt wurde auf dem Archetype "maven-archetype-webapp" aufgebaut

    $ mvn archetype:create -DgroupId=edu.hm.cc.zwitscher -DartifactId=backend -DarchetypeArtifactId=maven-archetype-webapp



