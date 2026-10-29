.class public abstract Lbe/j0;
.super Lbe/h1;
.source "SourceFile"

# interfaces
.implements Lbe/k0;


# direct methods
.method public static s2(Landroid/os/IBinder;)Lbe/k0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lbe/k0;

    if-eqz v1, :cond_1

    check-cast v0, Lbe/k0;

    return-object v0

    :cond_1
    new-instance v0, Lbe/i0;

    invoke-direct {v0, p0}, Lbe/i0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
