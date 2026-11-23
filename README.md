#garmin-tracker

Eine REST-API mit Java und Spring Boot, die über die offizielle Garmin Connect Personal API meine 
eigenen Lauf- und Trainingsdaten abruft.

STATUS: in Arbeit

Motivation

Ich laufe regelmäßig mit der Garmin. Seit Oktober 2026 bietet Garmin mit der Personal API die 
Möglichkeit, auf die eigenen Daten zuzugreifen. Dieses Projekt nutzt das, um ein eigenes Backend
mit Spring Boot zu bauen


Technologien
- Java 25
- Springt Boot (Spring Web, RestClient)
- Maven

Funktioniert nur mit eigener Garmin Personal API Key.

Noch geplant:

- Aktivitäten abrufen und als eigene Datenstruktur zurückgeben.
- Access-Token zwischenspeichern
- Läuf in einer Datenbank speichern
