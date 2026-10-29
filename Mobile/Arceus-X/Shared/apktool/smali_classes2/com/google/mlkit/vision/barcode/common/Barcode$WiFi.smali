.class public Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/barcode/common/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WiFi"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi$EncryptionType;
    }
.end annotation


# static fields
.field public static final TYPE_OPEN:I = 0x1

.field public static final TYPE_WEP:I = 0x3

.field public static final TYPE_WPA:I = 0x2


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zzb:Ljava/lang/String;

    iput p3, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zzc:I

    return-void
.end method


# virtual methods
.method public getEncryptionType()I
    .locals 1
    .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi$EncryptionType;
    .end annotation

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zzc:I

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public getSsid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;->zza:Ljava/lang/String;

    return-object v0
.end method
