.class public Lim/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lim/l$a;,
        Lim/l$b;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String; = "l"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lim/l$b;Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, Lim/l;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SignInClient not available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_not_available"

    invoke-interface {p0, p1}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lg/c;Lim/l$b;Landroid/app/PendingIntent;)V
    .locals 1

    :try_start_0
    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    new-instance v0, Landroidx/activity/result/IntentSenderRequest$a;

    invoke-direct {v0, p2}, Landroidx/activity/result/IntentSenderRequest$a;-><init>(Landroid/content/IntentSender;)V

    invoke-virtual {v0}, Landroidx/activity/result/IntentSenderRequest$a;->a()Landroidx/activity/result/IntentSenderRequest;

    move-result-object p2

    invoke-virtual {p0, p2}, Lg/c;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p2, Lim/l;->a:Ljava/lang/String;

    const-string v0, "Error occurred in launching Activity result"

    invoke-static {p2, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p0, "google_auth_api_error"

    invoke-interface {p1, p0}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lim/l$b;Ljava/lang/Void;)V
    .locals 0

    invoke-interface {p0}, Lim/l$b;->onSuccess()V

    return-void
.end method

.method public static synthetic d(Lim/l$b;Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Failure occurred"

    const-string v0, "Failure getting phone number"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_error"

    invoke-interface {p0, p1}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static f()Lim/l;
    .locals 1

    invoke-static {}, Lim/l$a;->a()Lim/l;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lz8/b;->b(Landroid/content/Context;)Lz8/c;

    move-result-object p1

    invoke-interface {p1, p2}, Lz8/c;->o(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lim/l;->a:Ljava/lang/String;

    const-string v0, "Phone Number Hint failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    return-object p1
.end method

.method public g(Landroid/content/Context;Lim/l$b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lj9/c;->o()Lj9/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lim/l;->h(Landroid/content/Context;Lj9/c;Lim/l$b;)V

    return-void
.end method

.method public h(Landroid/content/Context;Lj9/c;Lim/l$b;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lim/l;->a:Ljava/lang/String;

    const-string p2, "Telephony is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "telephony_not_available"

    invoke-interface {p3, p1}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Lj9/c;->g(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lim/l;->a:Ljava/lang/String;

    const-string p2, "GooglePlayServices is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_play_services_not_available"

    invoke-interface {p3, p1}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lz8/b;->b(Landroid/content/Context;)Lz8/c;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Lk9/g;

    invoke-virtual {p2, p1, v0}, Lj9/c;->l(Lk9/g;[Lk9/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lim/j;

    invoke-direct {p2, p3}, Lim/j;-><init>(Lim/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lim/k;

    invoke-direct {p2, p3}, Lim/k;-><init>(Lim/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object p2, Lim/l;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error checking api availability: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_error"

    invoke-interface {p3, p1}, Lim/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public i(Landroid/content/Context;Lg/c;Lim/l$b;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lg/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;",
            "Lim/l$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lim/l;->a:Ljava/lang/String;

    const-string v1, "Requesting phone number hint"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;->v3()Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest$a;->a()Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lz8/b;->b(Landroid/content/Context;)Lz8/c;

    move-result-object p1

    invoke-interface {p1, v0}, Lz8/c;->q(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lim/h;

    invoke-direct {v0, p2, p3}, Lim/h;-><init>(Lg/c;Lim/l$b;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lim/i;

    invoke-direct {p2, p3}, Lim/i;-><init>(Lim/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
