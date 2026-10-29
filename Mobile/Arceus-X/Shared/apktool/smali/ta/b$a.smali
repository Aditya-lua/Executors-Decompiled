.class public abstract Lta/b$a;
.super Lgb/b;
.source "SourceFile"

# interfaces
.implements Lta/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lta/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lta/b$a$a;
    }
.end annotation


# direct methods
.method public static u2(Landroid/os/IBinder;)Lta/b;
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
    const-string v0, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lta/b;

    if-eqz v1, :cond_1

    check-cast v0, Lta/b;

    return-object v0

    :cond_1
    new-instance v0, Lta/b$a$a;

    invoke-direct {v0, p0}, Lta/b$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
