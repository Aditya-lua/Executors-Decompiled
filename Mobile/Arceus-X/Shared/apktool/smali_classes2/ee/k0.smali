.class public abstract Lee/k0;
.super Lee/b0;
.source "SourceFile"

# interfaces
.implements Lee/l0;


# direct methods
.method public static s2(Landroid/os/IBinder;)Lee/l0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lee/l0;

    if-eqz v1, :cond_1

    check-cast v0, Lee/l0;

    return-object v0

    :cond_1
    new-instance v0, Lee/j0;

    invoke-direct {v0, p0}, Lee/j0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
