.class public final Lcom/google/mlkit/vision/barcode/internal/zzn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/barcode/common/internal/BarcodeSource;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;
    .locals 9

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzf()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzd()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zza()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzb()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzc()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zze()I

    move-result v6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzh()Z

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;-><init>(IIIIIIZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getBoundingBox()Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzo()[Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    move v4, v3

    move v5, v4

    move v3, v2

    :goto_0
    array-length v6, v0

    if-ge v1, v6, :cond_0

    aget-object v6, v0, v1

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v7, v6, Landroid/graphics/Point;->y:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget v6, v6, Landroid/graphics/Point;->y:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCalendarEvent()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;
    .locals 9

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zzc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zze()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zzf()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;

    move-result-object v7

    invoke-static {v7}, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxr;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;

    move-result-object v0

    invoke-static {v0}, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxq;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContactInfo()Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;
    .locals 15

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zzb()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zzf()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zze()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zza()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zzd()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxw;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v4 .. v11}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v4

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzb()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzc()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzf()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    move v8, v7

    :goto_1
    array-length v9, v1

    if-ge v8, v9, :cond_2

    aget-object v9, v1, v8

    if-eqz v9, :cond_1

    new-instance v10, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;->zzb()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;->zza()I

    move-result v9

    invoke-direct {v10, v11, v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zze()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;

    move-result-object v1

    move v8, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_4

    move v9, v8

    :goto_2
    array-length v10, v1

    if-ge v9, v10, :cond_4

    aget-object v10, v1, v9

    if-eqz v10, :cond_3

    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zza()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzb()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzd()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v12, v13, v14, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzg()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzg()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxs;->zzd()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxp;

    move-result-object v0

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_7

    :goto_4
    array-length v10, v0

    if-ge v8, v10, :cond_7

    aget-object v10, v0, v8

    if-eqz v10, :cond_6

    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxp;->zza()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxp;->zzb()[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v12, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;-><init>(I[Ljava/lang/String;)V

    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    move-object v8, v1

    invoke-direct/range {v2 .. v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;-><init>(Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2

    :cond_8
    return-object v1
.end method

.method public final getCornerPoints()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzo()[Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public final getDisplayValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDriverLicense()Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zze()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzf()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzh()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzn()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzc()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zza()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzb()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzd()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzm()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzj()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzg()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxt;->zzk()Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v2 .. v16}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final getEmail()Lcom/google/mlkit/vision/barcode/common/Barcode$Email;
    .locals 5

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zza()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxu;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final getFormat()I
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zza()I

    move-result v0

    return v0
.end method

.method public final getGeoPoint()Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;
    .locals 6

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->zza()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->zzb()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;-><init>(DD)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPhone()Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzh()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxx;->zza()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRawBytes()[B
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzn()[B

    move-result-object v0

    return-object v0
.end method

.method public final getRawValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSms()Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzi()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxy;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxy;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxy;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUrl()Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzj()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxz;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxz;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxz;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValueType()I
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzb()I

    move-result v0

    return v0
.end method

.method public final getWifi()Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyb;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzya;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzya;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzya;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzya;->zza()I

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
