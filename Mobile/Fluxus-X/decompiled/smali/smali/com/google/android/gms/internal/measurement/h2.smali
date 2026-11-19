.class public final Lcom/google/android/gms/internal/measurement/h2;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/measurement/h2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:Landroid/os/Bundle;

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/i2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/i2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/h2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/h2;->f:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/measurement/h2;->g:J

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/h2;->h:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/h2;->i:Landroid/os/Bundle;

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/h2;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/h2;->f:J

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/h2;->g:J

    invoke-static {p1, v0, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/h2;->h:Z

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/h2;->i:Landroid/os/Bundle;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/h2;->j:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
