.class public Lcom/roblox/client/implementation/AppImplementations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfk/a;
.implements Lij/a;
.implements Lsi/a;
.implements Lih/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppsFlyerManager()Ldj/d;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->O()Lcom/roblox/client/appsflyer/a;

    move-result-object v0

    return-object v0
.end method

.method public getIdentityProtocol()Lwm/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lwm/f;->z()Lwm/f;

    move-result-object v0

    return-object v0
.end method

.method public getPermissionsProtocol()Lbn/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lbn/t;->U()Lbn/t;

    move-result-object v0

    return-object v0
.end method

.method public getRtcAudioManager(Landroid/content/Context;)Lih/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lih/c;

    invoke-direct {v0, p1}, Lih/c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
