.class public final Lz/u0$e;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "SourceFile"

# interfaces
.implements Ln0/g1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public final synthetic c:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz/u0$e;->c:Lz/u0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz/u0$e;->b:Z

    iput-object p2, p0, Lz/u0$e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lz/u0$e;->c:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->d:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$e;->c:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->e:Lz/u0$i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lz/u0$e;->c:Lz/u0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz/u0;->M0(Z)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lz/u0$e;->b:Z

    return v0
.end method

.method public onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz/u0$e;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lz/u0$e;->b:Z

    iget-object p1, p0, Lz/u0$e;->c:Lz/u0;

    iget-object p1, p1, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->d:Lz/u0$i;

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lz/u0$e;->c:Lz/u0;

    iget-object p1, p1, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->e:Lz/u0$i;

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    iget-object p1, p0, Lz/u0$e;->c:Lz/u0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz/u0;->M0(Z)V

    return-void
.end method

.method public onCameraUnavailable(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz/u0$e;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lz/u0$e;->b:Z

    return-void
.end method
