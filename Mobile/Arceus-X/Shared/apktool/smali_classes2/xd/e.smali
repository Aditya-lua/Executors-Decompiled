.class public abstract Lxd/e;
.super Lxd/b;
.source "SourceFile"

# interfaces
.implements Lxd/f;


# direct methods
.method public static s2(Landroid/os/IBinder;)Lxd/f;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.inappreview.protocol.IInAppReviewService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lxd/f;

    if-eqz v1, :cond_1

    check-cast v0, Lxd/f;

    return-object v0

    :cond_1
    new-instance v0, Lxd/d;

    invoke-direct {v0, p0}, Lxd/d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
