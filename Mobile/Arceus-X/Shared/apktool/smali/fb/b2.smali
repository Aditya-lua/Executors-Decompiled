.class public final Lfb/b2;
.super Ln9/e;
.source "SourceFile"


# instance fields
.field public final e:Lfb/p1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lfb/p1;Ll9/e;Ll9/n;)V
    .locals 7

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln9/e;-><init>(Landroid/content/Context;Landroid/os/Looper;ILn9/d;Ll9/e;Ll9/n;)V

    iput-object p4, v0, Lfb/b2;->e:Lfb/p1;

    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.games.internal.connect.IGamesConnectService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lfb/g2;

    if-eqz v1, :cond_1

    check-cast v0, Lfb/g2;

    return-object v0

    :cond_1
    new-instance v0, Lfb/g2;

    invoke-direct {v0, p1}, Lfb/g2;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lfb/b2;->e:Lfb/p1;

    const-string v2, "com.google.android.gms.games.key.API_VERSION"

    iget v3, v1, Lfb/p1;->a:I

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "com.google.android.gms.games.key.gamePackageName"

    iget-object v1, v1, Lfb/p1;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xcb21f40

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.connect.IGamesConnectService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.connect.service.START"

    return-object v0
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
