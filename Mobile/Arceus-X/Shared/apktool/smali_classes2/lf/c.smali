.class public abstract Llf/c;
.super Lva/w;
.source "SourceFile"

# interfaces
.implements Llf/d;


# direct methods
.method public static s2(Landroid/os/IBinder;)Llf/d;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.firebase.appindexing.internal.IAppIndexingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Llf/d;

    if-eqz v1, :cond_1

    check-cast v0, Llf/d;

    return-object v0

    :cond_1
    new-instance v0, Llf/b;

    invoke-direct {v0, p0}, Llf/b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
