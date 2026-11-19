.class public Lrb/a;
.super Lo9/i;
.source "SourceFile"

# interfaces
.implements Lqb/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo9/i<",
        "Lrb/g;",
        ">;",
        "Lqb/f;"
    }
.end annotation


# static fields
.field public static final synthetic i:I


# instance fields
.field public final e:Z

.field public final f:Lo9/f;

.field public final g:Landroid/os/Bundle;

.field public final h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ZLo9/f;Landroid/os/Bundle;Ll9/h$a;Ll9/h$b;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lo9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ll9/h$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Ll9/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v3, 0x2c

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lo9/i;-><init>(Landroid/content/Context;Landroid/os/Looper;ILo9/f;Ll9/h$a;Ll9/h$b;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lrb/a;->e:Z

    iput-object v4, v0, Lrb/a;->f:Lo9/f;

    iput-object p5, v0, Lrb/a;->g:Landroid/os/Bundle;

    invoke-virtual {v4}, Lo9/f;->k()Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lrb/a;->h:Ljava/lang/Integer;

    return-void
.end method

.method public static g(Lo9/f;)Landroid/os/Bundle;
    .locals 4
    .param p0    # Lo9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lo9/f;->j()Lqb/a;

    invoke-virtual {p0}, Lo9/f;->k()Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "com.google.android.gms.signin.internal.clientRequestedAccount"

    invoke-virtual {p0}, Lo9/f;->a()Landroid/accounts/Account;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz v0, :cond_0

    const-string p0, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, p0, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    const-string p0, "com.google.android.gms.signin.internal.offlineAccessRequested"

    const/4 v0, 0x0

    invoke-virtual {v1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.idTokenRequested"

    invoke-virtual {v1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.serverClientId"

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    const/4 v3, 0x1

    invoke-virtual {v1, p0, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    invoke-virtual {v1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.hostedDomain"

    invoke-virtual {v1, p0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.gms.signin.internal.logSessionId"

    invoke-virtual {v1, p0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    invoke-virtual {v1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v1
.end method


# virtual methods
.method public final a(Lrb/f;)V
    .locals 7

    const-string v0, "Expecting a valid ISignInCallbacks"

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lrb/a;->f:Lo9/f;

    invoke-virtual {v2}, Lo9/f;->c()Landroid/accounts/Account;

    move-result-object v2

    const-string v3, "<<default account>>"

    iget-object v4, v2, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lo9/d;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Le9/c;->b(Landroid/content/Context;)Le9/c;

    move-result-object v3

    invoke-virtual {v3}, Le9/c;->c()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_0
    move-object v3, v1

    :goto_0
    new-instance v4, Lo9/r0;

    iget-object v5, p0, Lrb/a;->h:Ljava/lang/Integer;

    invoke-static {v5}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v4, v2, v5, v3}, Lo9/r0;-><init>(Landroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    invoke-virtual {p0}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lrb/g;

    new-instance v3, Lrb/j;

    invoke-direct {v3, v0, v4}, Lrb/j;-><init>(ILo9/r0;)V

    invoke-virtual {v2, v3, p1}, Lrb/g;->u2(Lrb/j;Lrb/f;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v3, "Remote service probably died when signIn is called"

    const-string v4, "SignInClientImpl"

    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    new-instance v3, Lrb/l;

    new-instance v5, Lk9/b;

    const/16 v6, 0x8

    invoke-direct {v5, v6, v1}, Lk9/b;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {v3, v0, v5, v1}, Lrb/l;-><init>(ILk9/b;Lo9/t0;)V

    invoke-interface {p1, v3}, Lrb/f;->o0(Lrb/l;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    const-string p1, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    invoke-static {v4, p1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, Lo9/d$d;

    invoke-direct {v0, p0}, Lo9/d$d;-><init>(Lo9/d;)V

    invoke-virtual {p0, v0}, Lo9/d;->connect(Lo9/d$c;)V

    return-void
.end method

.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2
    .param p1    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lrb/g;

    if-eqz v1, :cond_1

    check-cast v0, Lrb/g;

    return-object v0

    :cond_1
    new-instance v0, Lrb/g;

    invoke-direct {v0, p1}, Lrb/g;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lrb/a;->f:Lo9/f;

    invoke-virtual {v0}, Lo9/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo9/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lrb/a;->g:Landroid/os/Bundle;

    iget-object v1, p0, Lrb/a;->f:Lo9/f;

    const-string v2, "com.google.android.gms.signin.internal.realClientPackageName"

    invoke-virtual {v1}, Lo9/f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lrb/a;->g:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.signin.service.START"

    return-object v0
.end method

.method public final requiresSignIn()Z
    .locals 1

    iget-boolean v0, p0, Lrb/a;->e:Z

    return v0
.end method
