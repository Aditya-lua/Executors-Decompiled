.class public Lbacktraceio/library/common/DeviceAttributesHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static uuid:Ljava/lang/String;


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    return-void
.end method

.method private generateDeviceId()Ljava/lang/String;
    .locals 2

    sget-object v0, Lbacktraceio/library/common/DeviceAttributesHelper;->uuid:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/common/DeviceAttributesHelper;->uuid:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    sput-object v0, Lbacktraceio/library/common/DeviceAttributesHelper;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method private getAppUsedStorageSize()Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v3, v1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-wide/16 v3, -0x1

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getBatteryLevel()F
    .locals 4

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    return v0

    :cond_0
    const-string v1, "level"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "scale"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1
.end method

.method private getBatteryState()Lbacktraceio/library/enums/BatteryState;
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/BatteryState;->UNKNOWN:Lbacktraceio/library/enums/BatteryState;

    return-object v0

    :cond_0
    const-string v1, "status"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    sget-object v0, Lbacktraceio/library/enums/BatteryState;->UNKNOWN:Lbacktraceio/library/enums/BatteryState;

    return-object v0

    :cond_1
    sget-object v0, Lbacktraceio/library/enums/BatteryState;->FULL:Lbacktraceio/library/enums/BatteryState;

    return-object v0

    :cond_2
    sget-object v0, Lbacktraceio/library/enums/BatteryState;->UNPLUGGED:Lbacktraceio/library/enums/BatteryState;

    return-object v0

    :cond_3
    sget-object v0, Lbacktraceio/library/enums/BatteryState;->CHARGING:Lbacktraceio/library/enums/BatteryState;

    return-object v0
.end method

.method private getCpuTemperature()F
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    const-string v3, "/sys/class/thermal/thermal_zone0/temp"

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    :catch_0
    return v0
.end method

.method private getGpsStatus()Lbacktraceio/library/enums/GpsStatus;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/GpsStatus;->ENABLED:Lbacktraceio/library/enums/GpsStatus;

    return-object v0

    :cond_0
    sget-object v0, Lbacktraceio/library/enums/GpsStatus;->DISABLED:Lbacktraceio/library/enums/GpsStatus;

    return-object v0
.end method

.method private getLocationServiceStatus()Lbacktraceio/library/enums/LocationStatus;
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "location_mode"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/LocationStatus;->ENABLED:Lbacktraceio/library/enums/LocationStatus;

    return-object v0

    :cond_0
    sget-object v0, Lbacktraceio/library/enums/LocationStatus;->DISABLED:Lbacktraceio/library/enums/LocationStatus;

    return-object v0
.end method

.method private getMemoryInformation()Landroid/app/ActivityManager$MemoryInfo;
    .locals 3

    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    iget-object v1, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const-string v2, "activity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    invoke-virtual {v1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    return-object v0
.end method

.method private getNfcStatus()Lbacktraceio/library/enums/NfcStatus;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/NfcStatus;->NOT_AVAILABLE:Lbacktraceio/library/enums/NfcStatus;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lbacktraceio/library/enums/NfcStatus;->DISABLED:Lbacktraceio/library/enums/NfcStatus;

    return-object v0

    :cond_1
    sget-object v0, Lbacktraceio/library/enums/NfcStatus;->ENABLED:Lbacktraceio/library/enums/NfcStatus;

    return-object v0
.end method

.method private getWifiStatus()Lbacktraceio/library/enums/WifiStatus;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-static {v0}, Lbacktraceio/library/common/PermissionHelper;->isPermissionForAccessWifiStateGranted(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/WifiStatus;->NOT_PERMITTED:Lbacktraceio/library/enums/WifiStatus;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lbacktraceio/library/enums/WifiStatus;->ENABLED:Lbacktraceio/library/enums/WifiStatus;

    return-object v0

    :cond_1
    sget-object v0, Lbacktraceio/library/enums/WifiStatus;->DISABLED:Lbacktraceio/library/enums/WifiStatus;

    return-object v0
.end method

.method private isAirplaneModeOn()Z
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "airplane_mode_on"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v2
.end method

.method private isBluetoothEnabled()Lbacktraceio/library/enums/BluetoothStatus;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    invoke-static {v0}, Lbacktraceio/library/common/PermissionHelper;->isPermissionForBluetoothGranted(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/enums/BluetoothStatus;->NOT_PERMITTED:Lbacktraceio/library/enums/BluetoothStatus;

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const-string v1, "bluetooth"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lbacktraceio/library/enums/BluetoothStatus;->ENABLED:Lbacktraceio/library/enums/BluetoothStatus;

    return-object v0

    :cond_1
    sget-object v0, Lbacktraceio/library/enums/BluetoothStatus;->DISABLED:Lbacktraceio/library/enums/BluetoothStatus;

    return-object v0
.end method

.method private isPowerSavingMode()Z
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/common/DeviceAttributesHelper;->context:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public getDeviceAttributes(Ljava/lang/Boolean;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "guid"

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->generateDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "uname.sysname"

    const-string v2, "Android"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "os.arch"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "uname.machine"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->isAirplaneModeOn()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.airplane_mode"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getLocationServiceStatus()Lbacktraceio/library/enums/LocationStatus;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/LocationStatus;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.location"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getNfcStatus()Lbacktraceio/library/enums/NfcStatus;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/NfcStatus;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.nfc.status"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getGpsStatus()Lbacktraceio/library/enums/GpsStatus;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/GpsStatus;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.gps.enabled"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->isBluetoothEnabled()Lbacktraceio/library/enums/BluetoothStatus;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/BluetoothStatus;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.bluetooth_status"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getCpuTemperature()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.cpu.temperature"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->isPowerSavingMode()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.is_power_saving_mode"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getWifiStatus()Lbacktraceio/library/enums/WifiStatus;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/WifiStatus;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "device.wifi.status"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "app.storage_used"

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getAppUsedStorageSize()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getBatteryLevel()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    const-string v1, "battery.level"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getBatteryState()Lbacktraceio/library/enums/BatteryState;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/enums/BatteryState;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "battery.state"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string v1, "cpu.boottime"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getMemoryInformation()Landroid/app/ActivityManager$MemoryInfo;

    move-result-object p1

    iget-wide v1, p1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "system.memory.total"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "system.memory.free"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    iget-wide v3, p1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const-string v1, "system.memory.active"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
