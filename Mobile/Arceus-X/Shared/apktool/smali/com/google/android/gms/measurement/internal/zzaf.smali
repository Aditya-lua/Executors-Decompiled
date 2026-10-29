.class public final Lcom/google/android/gms/measurement/internal/zzaf;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/zzaf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:I

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/g;

    invoke-direct {v0}, Lnb/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzaf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JIJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzaf;->f:J

    iput p3, p0, Lcom/google/android/gms/measurement/internal/zzaf;->g:I

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzaf;->h:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzaf;->f:J

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/measurement/internal/zzaf;->g:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzaf;->h:J

    invoke-static {p1, v0, v1, v2}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
