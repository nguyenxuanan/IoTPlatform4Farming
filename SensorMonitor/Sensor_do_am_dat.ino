/*

Hien tai chi the hien duoc gia tri sensor: 

So lieu thuc te can duoc test trong moi truong thich hop : vi du nh

*/
#define sensorPin A0
int giatriAnalog, giatriDigital;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(sensorPin,INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
    giatriAnalog = analogRead(sensorPin);
    Serial.println(" -----  Sensor value : -----");
    Serial.println(giatriAnalog);
    delay(1000);
}
