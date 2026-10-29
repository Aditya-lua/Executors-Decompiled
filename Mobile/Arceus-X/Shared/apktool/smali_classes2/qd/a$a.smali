.class public abstract Lqd/a$a;
.super Lib/b;
.source "SourceFile"

# interfaces
.implements Lqd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/a$a$a;
    }
.end annotation


# direct methods
.method public static s2(Landroid/os/IBinder;)Lqd/a;
    .locals 2
    .param p0    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.agesignals.protocol.IAgeSignalsService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lqd/a;

    if-eqz v1, :cond_1

    check-cast v0, Lqd/a;

    return-object v0

    :cond_1
    new-instance v0, Lqd/a$a$a;

    invoke-direct {v0, p0}, Lqd/a$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
