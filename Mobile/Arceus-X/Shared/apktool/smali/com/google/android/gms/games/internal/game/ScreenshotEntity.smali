.class public final Lcom/google/android/gms/games/internal/game/ScreenshotEntity;
.super Lcom/google/android/gms/games/internal/zzg;
.source "SourceFile"

# interfaces
.implements Lm9/e;
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "GamesGmsClientImpl.java"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/internal/game/ScreenshotEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Landroid/net/Uri;

.field public final g:I

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lia/c;

    invoke-direct {v0}, Lia/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;II)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zzg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    iput p2, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    iput p3, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;

    iget-object v2, p1, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p1, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget p1, p1, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v2, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    iget v1, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "Uri"

    iget-object v2, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    const-string v2, "Width"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    const-string v2, "Height"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->f:Landroid/net/Uri;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    iget v0, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->g:I

    invoke-static {p1, p2, v0}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x3

    iget v0, p0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;->h:I

    invoke-static {p1, p2, v0}, Lo9/b;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v1}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
