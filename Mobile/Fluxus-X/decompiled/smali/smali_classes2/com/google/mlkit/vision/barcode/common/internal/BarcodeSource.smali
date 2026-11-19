.class public interface abstract Lcom/google/mlkit/vision/barcode/common/internal/BarcodeSource;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getBoundingBox()Landroid/graphics/Rect;
.end method

.method public abstract getCalendarEvent()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;
.end method

.method public abstract getContactInfo()Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;
.end method

.method public abstract getCornerPoints()[Landroid/graphics/Point;
.end method

.method public abstract getDisplayValue()Ljava/lang/String;
.end method

.method public abstract getDriverLicense()Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;
.end method

.method public abstract getEmail()Lcom/google/mlkit/vision/barcode/common/Barcode$Email;
.end method

.method public abstract getFormat()I
.end method

.method public abstract getGeoPoint()Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;
.end method

.method public abstract getPhone()Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;
.end method

.method public abstract getRawBytes()[B
.end method

.method public abstract getRawValue()Ljava/lang/String;
.end method

.method public abstract getSms()Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;
.end method

.method public abstract getUrl()Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;
.end method

.method public abstract getValueType()I
.end method

.method public abstract getWifi()Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;
.end method
