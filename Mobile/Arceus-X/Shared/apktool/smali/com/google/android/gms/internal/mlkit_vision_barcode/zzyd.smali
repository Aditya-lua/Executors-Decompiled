.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzye;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzye;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;->zza:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;->zzb:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;->zza:I

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyd;->zzb:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
