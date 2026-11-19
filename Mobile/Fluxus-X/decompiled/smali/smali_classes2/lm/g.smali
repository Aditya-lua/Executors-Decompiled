.class public Llm/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llm/g$b;,
        Llm/g$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Lcom/roblox/universalapp/messagebus/Connection;

.field public c:Lcom/roblox/universalapp/messagebus/Connection;

.field public d:Lcom/roblox/universalapp/messagebus/Connection;

.field public e:Lcom/roblox/universalapp/messagebus/Connection;

.field public f:Lcom/roblox/universalapp/messagebus/Connection;

.field public g:Lcom/roblox/universalapp/messagebus/Connection;

.field public h:Z

.field public i:Z

.field public j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llm/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Llm/g;->j:Ljava/util/Set;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Llm/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleConnectingCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/a;

    invoke-direct {v1, p0}, Llm/a;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Llm/g;->g:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleReceiveCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/b;

    invoke-direct {v1, p0}, Llm/b;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Llm/g;->b:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleAnswerCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/c;

    invoke-direct {v1, p0}, Llm/c;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Llm/g;->c:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleEndCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/d;

    invoke-direct {v1, p0}, Llm/d;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Llm/g;->d:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleActiveCallId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/e;

    invoke-direct {v1, p0}, Llm/e;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Llm/g;->e:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getHandleRemovePendingReceivedCall()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Llm/f;

    invoke-direct {v1, p0}, Llm/f;-><init>(Llm/g;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Llm/g;->f:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static synthetic a(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->l(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->n(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic e(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->i(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic f(Llm/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->j(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static x()Llm/g;
    .locals 1

    invoke-static {}, Llm/g$b;->a()Llm/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public g(Llm/g$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llm/g;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Llm/g;->h:Z

    return v0
.end method

.method public final synthetic i(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic j(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->s(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->p(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic l(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->r(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic m(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->o(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic n(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Llm/g;->t(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final o(Lorg/json/JSONObject;)V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, Llm/g;->i:Z

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    monitor-enter p0

    :try_start_0
    new-instance p1, Ljava/util/HashSet;

    iget-object v0, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llm/g$a;

    invoke-interface/range {v1 .. v7}, Llm/g$a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final p(Lorg/json/JSONObject;)V
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llm/g$a;

    invoke-interface {v1, p1}, Llm/g$a;->U(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final q(Lorg/json/JSONObject;)V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Llm/g;->i:Z

    iput-boolean v0, p0, Llm/g;->h:Z

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    monitor-enter p0

    :try_start_0
    new-instance p1, Ljava/util/HashSet;

    iget-object v0, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llm/g$a;

    invoke-interface/range {v1 .. v7}, Llm/g$a;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final r(Lorg/json/JSONObject;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Llm/g;->i:Z

    iput-boolean v0, p0, Llm/g;->h:Z

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallActionKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llm/g$a;

    invoke-interface {v2, p1, v0}, Llm/g$a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final s(Lorg/json/JSONObject;)V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Llm/g;->h:Z

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsDuplicateKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsExpiredKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    monitor-enter p0

    :try_start_0
    new-instance v3, Ljava/util/HashSet;

    iget-object v4, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llm/g$a;

    if-nez v2, :cond_0

    if-nez p1, :cond_0

    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4, v1, v5}, Llm/g$a;->C(Ljava/lang/String;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final t(Lorg/json/JSONObject;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Llm/g;->j:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llm/g$a;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Llm/g$a;->m0(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public u(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerUserIdKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallerCombinedNameKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeUserIdKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCalleeCombinedNameKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getPlaceIdKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p8, p9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getGameInstanceIdKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getReservedServerAccessCodeKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCreatedUtcKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p12, p13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getIsCalleeMicEnabledKey()Ljava/lang/String;

    move-result-object p1

    move/from16 p2, p14

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getNotificationIdKey()Ljava/lang/String;

    move-result-object p1

    move-object/from16 p2, p15

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/call/JNICallProtocol;->receiveCall(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    const-string p2, "CallProtocol"

    const-string p3, "Constructing JSON params for receive call failed with error."

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Llm/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getRejectCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for reject call failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CallProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public w(Llm/g$a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llm/g;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public y(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getCallIdKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Llm/g;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/call/JNICallProtocol;->getSuppressCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for suppress call failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CallProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
