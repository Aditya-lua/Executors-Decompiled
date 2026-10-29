.class public Lbm/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbm/t$c;,
        Lbm/t$d;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "t"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Le3/o;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lbm/m;

.field public final c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbm/m;

    invoke-direct {v0}, Lbm/m;-><init>()V

    iput-object v0, p0, Lbm/t;->b:Lbm/m;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lbm/t;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static bridge synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lbm/t;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/app/Activity;Lorg/json/JSONObject;Ljava/lang/String;Lbm/t$d;)V
    .locals 1

    :try_start_0
    const-string v0, "keystore"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p0, Lbm/t;->b:Lbm/m;

    new-instance v0, Lbm/t$c;

    invoke-direct {v0, p4}, Lbm/t$c;-><init>(Lbm/t$d;)V

    invoke-virtual {p3, p1, p2, v0}, Lbm/m;->m(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, p3}, Lbm/t;->e(Lorg/json/JSONObject;Ljava/lang/String;)Le3/b;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lbm/t;->i(Landroid/app/Activity;)Le3/o;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p4, p3}, Lbm/t;->c(Landroid/app/Activity;Le3/b;Lbm/t$d;Le3/o;)V

    return-void

    :cond_1
    const-string p1, ""

    const/4 p2, 0x0

    invoke-interface {p4, p2, p1}, Lbm/t$d;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const/4 p2, 0x3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p2, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public c(Landroid/app/Activity;Le3/b;Lbm/t$d;Le3/o;)V
    .locals 6

    new-instance v3, Landroid/os/CancellationSignal;

    invoke-direct {v3}, Landroid/os/CancellationSignal;-><init>()V

    iget-object v4, p0, Lbm/t;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lbm/t$b;

    invoke-direct {v5, p0, p3}, Lbm/t$b;-><init>(Lbm/t;Lbm/t$d;)V

    move-object v1, p1

    move-object v2, p2

    move-object v0, p4

    invoke-interface/range {v0 .. v5}, Le3/o;->a(Landroid/content/Context;Le3/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V

    return-void
.end method

.method public d(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/t$d;)V
    .locals 2

    :try_start_0
    const-string v0, "credentialType"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "keystore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbm/t;->b:Lbm/m;

    new-instance v1, Lbm/t$c;

    invoke-direct {v1, p3}, Lbm/t$c;-><init>(Lbm/t$d;)V

    invoke-virtual {v0, p1, p2, v1}, Lbm/m;->t(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const/4 p2, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public e(Lorg/json/JSONObject;Ljava/lang/String;)Le3/b;
    .locals 8
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "parameters"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "FIDO2"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lbm/t;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, "publicKey"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->B0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "isSilentPasskeyUpgrade"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    new-instance v1, Le3/i;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Le3/i;-><init>(Ljava/lang/String;[BZLjava/lang/String;ZZ)V

    goto :goto_0

    :cond_0
    new-instance v1, Le3/i;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Le3/i;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "password"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "username"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Le3/g;

    invoke-direct {v1, p2, p1}, Le3/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid create credential request!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "CredentialType not set!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/t$d;)V
    .locals 7

    :try_start_0
    const-string v0, "credentialType"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "keystore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_4

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lbm/t;->b:Lbm/m;

    new-instance v1, Lbm/t$c;

    invoke-direct {v1, p3}, Lbm/t$c;-><init>(Lbm/t$d;)V

    invoke-virtual {v0, p1, p2, v1}, Lbm/m;->y(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    move-object v5, p3

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-virtual {p0, p2}, Lbm/t;->j(Lorg/json/JSONObject;)Le3/k0;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p2}, Lbm/t;->h(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p1}, Lbm/t;->i(Landroid/app/Activity;)Le3/o;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4

    move-object v1, p0

    move-object v2, p1

    move-object v5, p3

    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lbm/t;->g(Landroid/app/Activity;Le3/k0;Ljava/lang/String;Lbm/t$d;Le3/o;)V

    return-void

    :catch_2
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_2
    move-object v5, p3

    goto :goto_1

    :catch_5
    move-exception v0

    goto :goto_2

    :cond_1
    move-object v5, p3

    const-string p1, ""

    const/4 p2, 0x0

    invoke-interface {v5, p2, p1}, Lbm/t$d;->b(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    return-void

    :goto_3
    const/4 p2, 0x3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v5, p2, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public g(Landroid/app/Activity;Le3/k0;Ljava/lang/String;Lbm/t$d;Le3/o;)V
    .locals 6

    new-instance v3, Landroid/os/CancellationSignal;

    invoke-direct {v3}, Landroid/os/CancellationSignal;-><init>()V

    iget-object v4, p0, Lbm/t;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lbm/t$a;

    invoke-direct {v5, p0, p4, p3}, Lbm/t$a;-><init>(Lbm/t;Lbm/t$d;Ljava/lang/String;)V

    move-object v1, p1

    move-object v2, p2

    move-object v0, p5

    invoke-interface/range {v0 .. v5}, Le3/o;->d(Landroid/content/Context;Le3/k0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V

    return-void
.end method

.method public h(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    const-string v0, "credentialType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "FIDO2"

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "password"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const-string p1, "all"

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final i(Landroid/app/Activity;)Le3/o;
    .locals 1

    iget-object v0, p0, Lbm/t;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Le3/o;->create(Landroid/content/Context;)Le3/o;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lbm/t;->a:Ljava/lang/ref/WeakReference;

    :cond_1
    iget-object p1, p0, Lbm/t;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le3/o;

    return-object p1
.end method

.method public j(Lorg/json/JSONObject;)Le3/k0;
    .locals 4

    new-instance v0, Le3/k0$a;

    invoke-direct {v0}, Le3/k0$a;-><init>()V

    invoke-virtual {p0, p1}, Lbm/t;->h(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "FIDO2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "parameters"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_2

    :cond_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "password"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->w0()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    goto :goto_0

    :cond_1
    const-string v2, "username"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance p1, Le3/o0;

    invoke-direct {p1, v2}, Le3/o0;-><init>(Ljava/util/Set;)V

    goto :goto_1

    :cond_3
    new-instance p1, Le3/o0;

    invoke-direct {p1}, Le3/o0;-><init>()V

    :goto_1
    invoke-virtual {v0, p1}, Le3/k0$a;->a(Le3/r;)Le3/k0$a;

    :cond_4
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lbm/t;->n()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "publicKey"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Le3/p0;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Le3/p0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Le3/k0$a;->a(Le3/r;)Le3/k0$a;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->s3()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "deviceBoundOnly"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v0, p1}, Le3/k0$a;->c(Z)Le3/k0$a;

    :cond_5
    invoke-virtual {v0}, Le3/k0$a;->b()Le3/k0;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, Lbm/t;->n()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lbm/t;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public l(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p1}, Lgk/u;->a(Landroid/app/Activity;)Z

    move-result p1

    return p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
