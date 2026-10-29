.class public final Lcom/google/android/gms/games/video/VideoCapabilities;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/video/VideoCapabilities;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:[Z

.field public final j:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lra/a;

    invoke-direct {v0}, Lra/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/video/VideoCapabilities;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZ[Z[Z)V
    .locals 0
    .param p4    # [Z
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # [Z
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->f:Z

    iput-boolean p2, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->g:Z

    iput-boolean p3, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->h:Z

    iput-object p4, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->i:[Z

    iput-object p5, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->j:[Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/games/video/VideoCapabilities;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/games/video/VideoCapabilities;

    invoke-virtual {p1}, Lcom/google/android/gms/games/video/VideoCapabilities;->v3()[Z

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->v3()[Z

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/games/video/VideoCapabilities;->w3()[Z

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->w3()[Z

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/games/video/VideoCapabilities;->x3()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->x3()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/games/video/VideoCapabilities;->y3()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->y3()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/games/video/VideoCapabilities;->z3()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->z3()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->v3()[Z

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->w3()[Z

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->x3()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->y3()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->z3()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "SupportedCaptureModes"

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->v3()[Z

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "SupportedQualityLevels"

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->w3()[Z

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->x3()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "CameraSupported"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->y3()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "MicSupported"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->z3()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "StorageWriteSupported"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v3()[Z
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->i:[Z

    return-object v0
.end method

.method public w3()[Z
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->j:[Z

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->x3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->y3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->z3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->v3()[Z

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo9/b;->d(Landroid/os/Parcel;I[ZZ)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/games/video/VideoCapabilities;->w3()[Z

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->d(Landroid/os/Parcel;I[ZZ)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->f:Z

    return v0
.end method

.method public y3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->g:Z

    return v0
.end method

.method public z3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/video/VideoCapabilities;->h:Z

    return v0
.end method
