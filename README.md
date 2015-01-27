# Android-Devices-Name
Get marketing name of android device

### Support 7789 devices
## How to use
```java
Device devices = new Device(getResources().openRawResource(R.raw.devices));
devices.getDeviceName(Build.DEVICE + "/" + Build.MODEL);
```
