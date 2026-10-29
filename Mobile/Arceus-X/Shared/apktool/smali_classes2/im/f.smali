.class public Lim/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lim/f$d;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Lcom/roblox/universalapp/messagebus/Connection;

.field public e:Lcom/roblox/universalapp/messagebus/Connection;

.field public f:Lcom/roblox/universalapp/messagebus/Connection;

.field public g:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Lim/b;

    invoke-direct {v0, p0}, Lim/b;-><init>(Lim/f;)V

    const-string v1, "IdentityProtocol"

    const-string v2, "getSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lim/f;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 5
    new-instance v0, Lim/c;

    invoke-direct {v0, p0}, Lim/c;-><init>(Lim/f;)V

    const-string v2, "supportsGetSMSOTP"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lim/f;->e:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    new-instance v0, Lim/d;

    invoke-direct {v0, p0}, Lim/d;-><init>(Lim/f;)V

    const-string v2, "getPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lim/f;->f:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v0, Lim/e;

    invoke-direct {v0, p0}, Lim/e;-><init>(Lim/f;)V

    const-string v2, "supportsGetPhoneNumber"

    invoke-virtual {p1, v1, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lim/f;->g:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lim/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lim/f;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lim/f;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lim/f;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->l(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Lim/f;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->i(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Lim/f;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->j(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic e(Lim/f;Le/p;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lim/f;->m(Le/p;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static bridge synthetic f(Lim/f;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic g(Lim/f;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lim/f;->v(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static z()Lim/f;
    .locals 1

    invoke-static {}, Lim/f$d;->a()Lim/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public h(Landroid/content/Context;Lql/e;)V
    .locals 6

    if-nez p1, :cond_0

    iget-object v0, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "IdentityProtocol"

    const-string v2, "getSMSOTP"

    const/16 v4, 0xd

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void

    :cond_0
    const-string v0, "IdentityProtocol"

    invoke-virtual {p2, p1, v0}, Lql/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic i(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic j(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->t(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->p(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic l(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lim/f;->s(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic m(Le/p;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-virtual {p2}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lim/f;->r(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public n(Le/p;)V
    .locals 3

    const-string v0, "IdentityProtocol"

    const-string v1, "Registering activity result for IdentityProtocol."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lh/j;

    invoke-direct {v1}, Lh/j;-><init>()V

    new-instance v2, Lim/a;

    invoke-direct {v2, p0, p1}, Lim/a;-><init>(Lim/f;Le/p;)V

    invoke-virtual {p1, v1, v2}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lim/f;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 6

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "result"

    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "IdentityProtocol"

    const-string v2, "getSMSOTP"

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSON exception while handling supports get sms otp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "getSMSOTP"

    invoke-virtual {p0, p1}, Lim/f;->u(Ljava/lang/String;)V

    return-void
.end method

.method public p(Lorg/json/JSONObject;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGetPhoneNumber: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lim/f;->b:Landroid/content/Context;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lim/f;->c:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lim/f;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg/c;

    invoke-static {}, Lim/l;->f()Lim/l;

    move-result-object v0

    iget-object v1, p0, Lim/f;->b:Landroid/content/Context;

    new-instance v2, Lim/f$b;

    invoke-direct {v2, p0}, Lim/f$b;-><init>(Lim/f;)V

    invoke-virtual {v0, v1, p1, v2}, Lim/l;->i(Landroid/content/Context;Lg/c;Lim/l$b;)V

    return-void

    :cond_1
    :goto_0
    const-string p1, "Context or launcher is null while getting phone number!"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    invoke-virtual {p0, p1}, Lim/f;->x(Ljava/lang/String;)V

    return-void
.end method

.method public q(Lorg/json/JSONObject;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGetSMSOTP: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lim/f;->b:Landroid/content/Context;

    new-instance v0, Lql/e;

    invoke-direct {v0}, Lql/e;-><init>()V

    invoke-virtual {p0, p1, v0}, Lim/f;->h(Landroid/content/Context;Lql/e;)V

    return-void
.end method

.method public r(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-static {}, Lim/l;->f()Lim/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lim/l;->e(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lim/f;->x(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public s(Lorg/json/JSONObject;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsGetPhoneNumber: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lim/f;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    const-string p1, "support"

    const/4 v0, 0x0

    const-string v1, "supportsGetPhoneNumber"

    invoke-virtual {p0, v1, p1, v0}, Lim/f;->v(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {}, Lim/l;->f()Lim/l;

    move-result-object p1

    iget-object v0, p0, Lim/f;->b:Landroid/content/Context;

    new-instance v1, Lim/f$c;

    invoke-direct {v1, p0}, Lim/f$c;-><init>(Lim/f;)V

    invoke-virtual {p1, v0, v1}, Lim/l;->g(Landroid/content/Context;Lim/l$b;)V

    return-void
.end method

.method public t(Lorg/json/JSONObject;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSupportsGetSMSOTP: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "IdentityProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lim/f;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    const-string p1, "support"

    const/4 v0, 0x0

    const-string v1, "supportsGetSMSOTP"

    invoke-virtual {p0, v1, p1, v0}, Lim/f;->v(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {}, Lim/l;->f()Lim/l;

    move-result-object p1

    iget-object v0, p0, Lim/f;->b:Landroid/content/Context;

    new-instance v1, Lim/f$a;

    invoke-direct {v1, p0}, Lim/f$a;-><init>(Lim/f;)V

    invoke-virtual {p1, v0, v1}, Lim/l;->g(Landroid/content/Context;Lim/l$b;)V

    return-void
.end method

.method public final u(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v1, "IdentityProtocol"

    const/16 v4, 0xd

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v3, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v0, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "IdentityProtocol"

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v4, 0x0

    move-object v2, p1

    :try_start_1
    invoke-virtual/range {v0 .. v5}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, p1

    goto :goto_0

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "JSON exception in "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ": "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "IdentityProtocol"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v6, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    const-string v7, "IdentityProtocol"

    const/16 v10, 0xd

    move-object v8, v2

    invoke-virtual/range {v6 .. v11}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V

    return-void
.end method

.method public w(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lim/f;->b:Landroid/content/Context;

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "result"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lim/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "IdentityProtocol"

    const-string v3, "getPhoneNumber"

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    const-string v0, "IdentityProtocol"

    const-string v1, "Exception while handling get phone number request"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const-string p1, "getPhoneNumber"

    invoke-virtual {p0, p1}, Lim/f;->u(Ljava/lang/String;)V

    return-void
.end method

.method public y(Lg/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lim/f;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method
