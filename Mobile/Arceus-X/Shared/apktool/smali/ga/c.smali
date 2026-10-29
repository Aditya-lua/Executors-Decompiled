.class public final Lga/c;
.super Ln9/e;
.source "SourceFile"


# instance fields
.field public final e:Lfb/c;

.field public final f:Ljava/lang/String;

.field public g:Lcom/google/android/gms/games/PlayerEntity;

.field public final h:Lga/i;

.field public i:Z

.field public final o:J

.field public final p:Lga/j;

.field public final q:Lda/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lda/o;Ll9/e;Ll9/n;Lga/j;)V
    .locals 7

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln9/e;-><init>(Landroid/content/Context;Landroid/os/Looper;ILn9/d;Ll9/e;Ll9/n;)V

    new-instance p1, Lga/r;

    invoke-direct {p1, p0}, Lga/r;-><init>(Lga/c;)V

    iput-object p1, v0, Lga/c;->e:Lfb/c;

    const/4 p1, 0x0

    iput-boolean p1, v0, Lga/c;->i:Z

    invoke-virtual {v4}, Ln9/d;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lga/c;->f:Ljava/lang/String;

    invoke-static {p7}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lga/j;

    iput-object p1, v0, Lga/c;->p:Lga/j;

    invoke-virtual {v4}, Ln9/d;->f()I

    move-result p1

    invoke-static {p0, p1}, Lga/i;->b(Lga/c;I)Lga/i;

    move-result-object p1

    iput-object p1, v0, Lga/c;->h:Lga/i;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    int-to-long p2, p2

    iput-wide p2, v0, Lga/c;->o:J

    iput-object p4, v0, Lga/c;->q:Lda/o;

    invoke-virtual {v4}, Ln9/d;->i()Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_1

    instance-of p2, v1, Landroid/app/Activity;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v4}, Ln9/d;->i()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lga/i;->f(Landroid/view/View;)V

    return-void
.end method

.method public static k(Landroid/os/RemoteException;)V
    .locals 2

    const-string v0, "GamesGmsClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1, p0}, Lfb/s0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Ln9/e;->getScopes()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final connect(Ln9/c$c;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lga/c;->g:Lcom/google/android/gms/games/PlayerEntity;

    invoke-super {p0, p1}, Ln9/c;->connect(Ln9/c$c;)V

    return-void
.end method

.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.games.internal.IGamesService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lga/h;

    if-eqz v1, :cond_1

    check-cast v0, Lga/h;

    return-object v0

    :cond_1
    new-instance v0, Lga/h;

    invoke-direct {v0, p1}, Lga/h;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final disconnect()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lga/c;->i:Z

    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lga/c;->e:Lfb/c;

    invoke-virtual {v0}, Lfb/c;->a()V

    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lga/h;

    iget-wide v1, p0, Lga/c;->o:J

    invoke-virtual {v0, v1, v2}, Lga/h;->u2(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "GamesGmsClientImpl"

    const-string v1, "Failed to notify client disconnect."

    invoke-static {v0, v1}, Lfb/s0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-super {p0}, Ln9/c;->disconnect()V

    return-void
.end method

.method public final g(Lsb/k;Z)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lga/h;

    new-instance v1, Lga/w;

    invoke-direct {v1, p1}, Lga/w;-><init>(Lsb/k;)V

    invoke-virtual {v0, v1, p2}, Lga/h;->z2(Lga/e;Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-static {p1, p2}, Lda/f;->a(Lsb/k;Ljava/lang/SecurityException;)V

    return-void
.end method

.method public final getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    sget-object v0, Lda/j;->j:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final getConnectionHint()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 7

    invoke-virtual {p0}, Ln9/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "com.google.android.gms.games.key.isHeadless"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v2, p0, Lga/c;->q:Lda/o;

    iget-boolean v4, v2, Lda/o;->b:Z

    const-string v4, "com.google.android.gms.games.key.showConnectingPopup"

    const/4 v5, 0x1

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "com.google.android.gms.games.key.connectingPopupGravity"

    const/16 v5, 0x11

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "com.google.android.gms.games.key.retryingSignIn"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "com.google.android.gms.games.key.sdkVariant"

    iget v5, v2, Lda/o;->e:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "com.google.android.gms.games.key.forceResolveAccountKey"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "com.google.android.gms.games.key.proxyApis"

    iget-object v6, v2, Lda/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v4, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v4, "com.google.android.gms.games.key.unauthenticated"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "com.google.android.gms.games.key.skipPgaCheck"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "com.google.android.gms.games.key.skipWelcomePopup"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "com.google.android.gms.games.key.realClientPackageName"

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "com.google.android.gms.games.key.API_VERSION"

    const/16 v5, 0x9

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "com.google.android.gms.games.key.gameRunToken"

    iget-object v2, v2, Lda/o;->n:Ljava/lang/String;

    invoke-virtual {v1, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "com.google.android.gms.games.key.gamePackageName"

    iget-object v3, p0, Lga/c;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "com.google.android.gms.games.key.desiredLocale"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lga/c;->h:Lga/i;

    new-instance v2, Lcom/google/android/gms/common/internal/BinderWrapper;

    invoke-virtual {v0}, Lga/i;->d()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/IBinder;)V

    const-string v0, "com.google.android.gms.games.key.popupWindowToken"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    invoke-virtual {p0}, Ln9/e;->d()Ln9/d;

    move-result-object v0

    invoke-static {v0}, Lqb/a;->g(Ln9/d;)Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "com.google.android.gms.games.key.signInOptions"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v1
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.service.START"

    return-object v0
.end method

.method public final h(Lsb/k;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lga/v;

    invoke-direct {v0, p1}, Lga/v;-><init>(Lsb/k;)V

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lga/h;

    iget-object v2, p0, Lga/c;->h:Lga/i;

    invoke-virtual {v2}, Lga/i;->d()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v2}, Lga/i;->c()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, p2, v3, v2}, Lga/h;->y2(Lga/e;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-static {p1, p2}, Lda/f;->a(Lsb/k;Ljava/lang/SecurityException;)V

    return-void
.end method

.method public final i(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lga/c;->q:Lda/o;

    iget-object v0, v0, Lda/o;->o:Lga/q;

    invoke-virtual {v0}, Lga/q;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lga/c;->p:Lga/j;

    invoke-virtual {v0}, Lga/j;->b()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lga/h;

    invoke-virtual {v0, p1, p2}, Lga/h;->w2(Landroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, p0, Lga/c;->p:Lga/j;

    invoke-virtual {p1}, Lga/j;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lga/c;->k(Landroid/os/RemoteException;)V

    return-void
.end method

.method public final j()V
    .locals 1

    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lga/h;

    invoke-virtual {v0}, Lga/h;->x2()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lga/c;->k(Landroid/os/RemoteException;)V

    :cond_0
    return-void
.end method

.method public final l(Lga/o;)V
    .locals 1

    iget-object v0, p0, Lga/c;->h:Lga/i;

    invoke-virtual {p1, v0}, Lga/o;->c(Lga/l;)V

    return-void
.end method

.method public final bridge synthetic onConnectedLocked(Landroid/os/IInterface;)V
    .locals 4
    .param p1    # Landroid/os/IInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lga/h;

    invoke-super {p0, p1}, Ln9/c;->onConnectedLocked(Landroid/os/IInterface;)V

    iget-boolean v0, p0, Lga/c;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lga/c;->h:Lga/i;

    invoke-virtual {v0}, Lga/i;->g()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lga/c;->i:Z

    :cond_0
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzaf;

    iget-object v1, p0, Lga/c;->h:Lga/i;

    invoke-virtual {v1}, Lga/i;->e()Lfb/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/games_v2/zzaf;-><init>(Lfb/d;)V

    new-instance v1, Lga/s;

    invoke-direct {v1, v0}, Lga/s;-><init>(Lcom/google/android/gms/internal/games_v2/zzaf;)V

    iget-wide v2, p0, Lga/c;->o:J

    invoke-virtual {p1, v1, v2, v3}, Lga/h;->t2(Lga/g;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lga/c;->k(Landroid/os/RemoteException;)V

    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    invoke-super {p0, p1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lga/c;->i:Z

    return-void
.end method

.method public final onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    const-class v0, Lga/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "show_welcome_popup"

    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lga/c;->i:Z

    const-string v0, "com.google.android.gms.games.current_player"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/PlayerEntity;

    iput-object v0, p0, Lga/c;->g:Lcom/google/android/gms/games/PlayerEntity;

    const-string v0, "com.google.android.gms.games.current_game"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/GameEntity;

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Ln9/c;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void
.end method

.method public final onUserSignOut(Ln9/c$e;)V
    .locals 3
    .param p1    # Ln9/c$e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    new-instance v0, Lga/t;

    invoke-direct {v0, p1}, Lga/t;-><init>(Ln9/c$e;)V

    iget-object v1, p0, Lga/c;->e:Lfb/c;

    invoke-virtual {v1}, Lfb/c;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {p0}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lga/h;

    new-instance v2, Lga/u;

    invoke-direct {v2, v0}, Lga/u;-><init>(Ll9/d;)V

    invoke-virtual {v1, v2}, Lga/h;->v2(Lga/e;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    const/4 v1, 0x4

    :try_start_2
    invoke-static {v1}, Lda/d;->b(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-interface {v0, v1}, Ll9/d;->b(Lcom/google/android/gms/common/api/Status;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    invoke-interface {p1}, Ln9/c$e;->a()V

    return-void
.end method

.method public final requiresAccount()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final requiresSignIn()Z
    .locals 1

    iget-object v0, p0, Lga/c;->q:Lda/o;

    iget-object v0, v0, Lda/o;->o:Lga/q;

    invoke-virtual {v0}, Lga/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
