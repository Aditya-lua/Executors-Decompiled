.class public Lwm/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwm/l$a;,
        Lwm/l$b;
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

.method public static synthetic a(Lwm/l$b;Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, Lwm/l;->a:Ljava/lang/String;

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

    invoke-interface {p0, p1}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lg/d;Lwm/l$b;Landroid/app/PendingIntent;)V
    .locals 1

    :try_start_0
    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    new-instance v0, Lg/i$a;

    invoke-direct {v0, p2}, Lg/i$a;-><init>(Landroid/content/IntentSender;)V

    invoke-virtual {v0}, Lg/i$a;->a()Lg/i;

    move-result-object p2

    invoke-virtual {p0, p2}, Lg/d;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p2, Lwm/l;->a:Ljava/lang/String;

    const-string v0, "Error occurred in launching Activity result"

    invoke-static {p2, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p0, "google_auth_api_error"

    invoke-interface {p1, p0}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lwm/l$b;Ljava/lang/Void;)V
    .locals 0

    invoke-interface {p0}, Lwm/l$b;->onSuccess()V

    return-void
.end method

.method public static synthetic d(Lwm/l$b;Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Failure occurred"

    const-string v0, "Failure getting phone number"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_auth_api_error"

    invoke-interface {p0, p1}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public static f()Lwm/l;
    .locals 1

    invoke-static {}, Lwm/l$a;->a()Lwm/l;

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

    invoke-static {p1}, La9/f;->b(Landroid/content/Context;)La9/i;

    move-result-object p1

    invoke-interface {p1, p2}, La9/i;->p(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lwm/l;->a:Ljava/lang/String;

    const-string v0, "Phone Number Hint failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    return-object p1
.end method

.method public g(Landroid/content/Context;Lwm/l$b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lk9/e;->o()Lk9/e;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lwm/l;->h(Landroid/content/Context;Lk9/e;Lwm/l$b;)V

    return-void
.end method

.method public h(Landroid/content/Context;Lk9/e;Lwm/l$b;)V
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

    sget-object p1, Lwm/l;->a:Ljava/lang/String;

    const-string p2, "Telephony is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "telephony_not_available"

    invoke-interface {p3, p1}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Lk9/e;->g(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lwm/l;->a:Ljava/lang/String;

    const-string p2, "GooglePlayServices is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "google_play_services_not_available"

    invoke-interface {p3, p1}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, La9/f;->b(Landroid/content/Context;)La9/i;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ll9/i;

    invoke-virtual {p2, p1, v0}, Lk9/e;->l(Ll9/i;[Ll9/i;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lwm/j;

    invoke-direct {p2, p3}, Lwm/j;-><init>(Lwm/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lwm/k;

    invoke-direct {p2, p3}, Lwm/k;-><init>(Lwm/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object p2, Lwm/l;->a:Ljava/lang/String;

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

    invoke-interface {p3, p1}, Lwm/l$b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public i(Landroid/content/Context;Lg/d;Lwm/l$b;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lg/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg/d<",
            "Lg/i;",
            ">;",
            "Lwm/l$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lwm/l;->a:Ljava/lang/String;

    const-string v1, "Requesting phone number hint"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, La9/d;->A3()La9/d$a;

    move-result-object v0

    invoke-virtual {v0}, La9/d$a;->a()La9/d;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, La9/f;->b(Landroid/content/Context;)La9/i;

    move-result-object p1

    invoke-interface {p1, v0}, La9/i;->d(La9/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lwm/h;

    invoke-direct {v0, p2, p3}, Lwm/h;-><init>(Lg/d;Lwm/l$b;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lwm/i;

    invoke-direct {p2, p3}, Lwm/i;-><init>(Lwm/l$b;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
