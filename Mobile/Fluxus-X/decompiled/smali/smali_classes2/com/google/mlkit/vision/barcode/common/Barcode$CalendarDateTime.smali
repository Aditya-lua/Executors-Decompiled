.class public Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/barcode/common/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CalendarDateTime"
.end annotation


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:I

.field private final zzf:I

.field private final zzg:Z

.field private final zzh:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIIIIIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zza:I

    iput p2, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzb:I

    iput p3, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzc:I

    iput p4, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzd:I

    iput p5, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zze:I

    iput p6, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzf:I

    iput-boolean p7, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzg:Z

    iput-object p8, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDay()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzc:I

    return v0
.end method

.method public getHours()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzd:I

    return v0
.end method

.method public getMinutes()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zze:I

    return v0
.end method

.method public getMonth()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzb:I

    return v0
.end method

.method public getRawValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public getSeconds()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzf:I

    return v0
.end method

.method public getYear()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zza:I

    return v0
.end method

.method public isUtc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;->zzg:Z

    return v0
.end method
