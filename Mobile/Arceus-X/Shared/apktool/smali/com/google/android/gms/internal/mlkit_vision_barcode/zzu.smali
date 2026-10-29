.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public zza:I

.field public zzb:Ljava/lang/String;

.field public zzc:Ljava/lang/String;

.field public zzd:I

.field public zze:[Landroid/graphics/Point;

.field public zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

.field public zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

.field public zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;

.field public zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;

.field public zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;

.field public zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

.field public zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

.field public zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

.field public zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

.field public zzo:[B

.field public zzp:Z

.field public zzq:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I[Landroid/graphics/Point;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;[BZD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzb:Ljava/lang/String;

    iput-object p15, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzo:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzc:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzd:I

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zze:[Landroid/graphics/Point;

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzp:Z

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzq:D

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;

    iput-object p9, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;

    iput-object p11, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

    iput-object p12, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

    iput-object p13, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

    iput-object p14, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zza:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzb:Ljava/lang/String;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzc:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzd:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zze:[Landroid/graphics/Point;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0x10

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzo:[B

    invoke-static {p1, p2, v1, v3}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/16 p2, 0x11

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzp:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x12

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzq:D

    invoke-static {p1, p2, v1, v2}, Lo9/b;->i(Landroid/os/Parcel;ID)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
