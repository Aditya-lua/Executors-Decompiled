.class public Lcom/roblox/client/implementation/AppImplementations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxj/a;
.implements Laj/a;
.implements Lki/a;
.implements Lzg/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppsFlyerManager()Lvi/d;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->I()Lcom/roblox/client/appsflyer/a;

    move-result-object v0

    return-object v0
.end method

.method public getIdentityProtocol()Lim/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lim/f;->z()Lim/f;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionsProtocol()Lom/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lom/s;->f0()Lom/s;

    move-result-object v0

    return-object v0
.end method

.method public getRtcAudioManager(Landroid/content/Context;)Lzg/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lzg/c;

    invoke-direct {v0, p1}, Lzg/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
