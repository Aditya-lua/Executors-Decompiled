.class public Lkm/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkm/f$j;,
        Lkm/f$k;,
        Lkm/f$i;,
        Lkm/f$h;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Landroid/content/Context;

.field public c:Z

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/roblox/universalapp/messagebus/Connection;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/roblox/universalapp/messagebus/Connection;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public i:Lorg/json/JSONObject;

.field public j:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lkm/f$i;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lkm/f$h;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lkm/h;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lkm/f;->c:Z

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lkm/f;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Lkm/f;->e:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lkm/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    iput-boolean v1, p0, Lkm/f;->g:Z

    .line 9
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkm/f;->h:Ljava/lang/Object;

    .line 10
    iput-object v2, p0, Lkm/f;->i:Lorg/json/JSONObject;

    .line 11
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->t()Z

    move-result v1

    const-string v2, "switchToSettingsApp"

    const-string v3, "supportsSwitchToSettingsApp"

    const-string v4, "Linking"

    if-eqz v1, :cond_0

    .line 12
    new-instance v1, Lmm/k;

    new-instance v5, Lkm/b;

    invoke-direct {v5, p0}, Lkm/b;-><init>(Lkm/f;)V

    invoke-direct {v1, v4, v3, v5}, Lmm/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->s(Lmm/k;)V

    .line 13
    new-instance v1, Lmm/k;

    new-instance v3, Lkm/c;

    invoke-direct {v3, p0}, Lkm/c;-><init>(Lkm/f;)V

    invoke-direct {v1, v4, v2, v3}, Lmm/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->s(Lmm/k;)V

    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Lkm/f$a;

    invoke-direct {v1, p0}, Lkm/f$a;-><init>(Lkm/f;)V

    invoke-virtual {v0, v4, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    .line 15
    new-instance v1, Lkm/f$b;

    invoke-direct {v1, p0}, Lkm/f$b;-><init>(Lkm/f;)V

    invoke-virtual {v0, v4, v2, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    .line 16
    :goto_0
    new-instance v0, Lkm/h;

    invoke-direct {v0}, Lkm/h;-><init>()V

    iput-object v0, p0, Lkm/f;->l:Lkm/h;

    .line 17
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lkm/f;->j:Ljava/util/Optional;

    .line 18
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lkm/f;->k:Ljava/util/Optional;

    return-void
.end method

.method public synthetic constructor <init>(Lkm/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkm/f;-><init>()V

    return-void
.end method

.method public static D()Lkm/f;
    .locals 1

    invoke-static {}, Lkm/f$j;->a()Lkm/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Lkm/f;Lorg/json/JSONObject;)Lmm/l;
    .locals 0

    invoke-virtual {p0, p1}, Lkm/f;->s(Lorg/json/JSONObject;)Lmm/l;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lkm/f;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lkm/f;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static bridge synthetic c(Lkm/f;Lorg/json/JSONObject;)Lmm/l;
    .locals 0

    invoke-virtual {p0, p1}, Lkm/f;->s(Lorg/json/JSONObject;)Lmm/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lkm/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public B(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "LinkingProtocol"

    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getEnableTrackingKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iget-object v1, p0, Lkm/f;->j:Ljava/util/Optional;

    invoke-virtual {v1}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkm/f;->j:Ljava/util/Optional;

    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkm/f$i;

    invoke-interface {v1, p1}, Lkm/f$i;->a(Z)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string p1, "Recevied attempt to toggle tracking with no implementation available."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received exception while trying to check enableTracking value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUIDKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getSetUIDId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for UID detection failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LinkingProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public E(Landroid/content/Context;)V
    .locals 5

    iget-boolean p1, p0, Lkm/f;->c:Z

    if-eqz p1, :cond_0

    const-string p1, "LinkingProtocol"

    const-string v0, "Unbalanced calls to start and stop. Already started."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lkm/f;->c:Z

    iget-boolean v0, p0, Lkm/f;->g:Z

    if-nez v0, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lmm/k;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getOpenURLId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkm/d;

    invoke-direct {v4, p0}, Lkm/d;-><init>(Lkm/f;)V

    invoke-direct {v1, v2, v3, v4}, Lmm/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->s(Lmm/k;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getOpenURLId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkm/f$c;

    invoke-direct {v3, p0}, Lkm/f$c;-><init>(Lkm/f;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    :cond_2
    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->g4()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getIsTrackingAvailableId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkm/f$d;

    invoke-direct {v3, p0}, Lkm/f$d;-><init>(Lkm/f;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    iget-object v0, p0, Lkm/f;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getSetTrackingEnabledId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkm/f$e;

    invoke-direct {v3, p0}, Lkm/f$e;-><init>(Lkm/f;)V

    invoke-virtual {v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v0, p0, Lkm/f;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v2, "Linking"

    const-string v3, "adConsentResolved"

    invoke-static {v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkm/f$f;

    invoke-direct {v3, p0}, Lkm/f$f;-><init>(Lkm/f;)V

    invoke-virtual {v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean p1, p0, Lkm/f;->g:Z

    return-void
.end method

.method public F()V
    .locals 4

    iget-boolean v0, p0, Lkm/f;->c:Z

    if-nez v0, :cond_0

    const-string v0, "LinkingProtocol"

    const-string v1, "Unbalanced calls to start and stop. Not started."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkm/f;->c:Z

    iget-object v1, p0, Lkm/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    check-cast v3, Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v3}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkm/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public G(Lorg/json/JSONObject;)Lmm/l;
    .locals 5

    new-instance v0, Lmm/l;

    invoke-direct {v0}, Lmm/l;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSupportsSwitchToSettingsApp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "LinkingProtocol"

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string p1, "support"

    const/4 v3, 0x1

    invoke-virtual {v1, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON exception while handling supports switch to settings app request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iput-object v1, v0, Lmm/l;->a:Lorg/json/JSONObject;

    return-object v0
.end method

.method public H(Lorg/json/JSONObject;)Lmm/l;
    .locals 6

    const-string v0, "route"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "switchToSettingsApp: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "LinkingProtocol"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lmm/l;

    invoke-direct {v1}, Lmm/l;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->V1()Z

    move-result v3
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "android.settings.SETTINGS"

    if-eqz v3, :cond_4

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v3, -0x51863cdb

    if-eq v0, v3, :cond_2

    const v3, -0x21d29fad

    if-eq v0, v3, :cond_1

    const v3, 0x51b6992a

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "microphone"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_1
    const-string v0, "contacts"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_2
    const-string v0, "camera"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "package"

    iget-object v3, p0, Lkm/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-object v5, p1

    :cond_3
    :goto_1
    if-nez v5, :cond_5

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :cond_5
    :goto_2
    const/high16 p1, 0x10000000

    invoke-virtual {v5, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object p1, p0, Lkm/f;->b:Landroid/content/Context;

    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception while handling switch to settings app request: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Activity not found exception while handling switch to settings app request Activity Not Found: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_5
    return-object v1
.end method

.method public I(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lkm/f;->h:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_1

    :try_start_0
    iget-object v1, p0, Lkm/f;->i:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq p1, v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_1
    const-string v1, "url"

    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_2
    const-string p2, "LinkingProtocol"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to update DLIC seed URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeCreateAtIngress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object v0, p2

    :goto_0
    invoke-virtual {p0, v0}, Lkm/f;->z(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse DLIC seed JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LinkingProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2}, Lkm/f;->z(Lorg/json/JSONObject;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeReportReceived(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->g5()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lkm/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeCreateAtIngress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    move-object v0, p2

    :goto_0
    invoke-virtual {p0, v0}, Lkm/f;->z(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse DLIC seed JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LinkingProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2}, Lkm/f;->z(Lorg/json/JSONObject;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeReportReceived(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p3

    invoke-interface {p3}, Lth/i;->g5()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p3

    invoke-interface {p3}, Lth/i;->e()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lkm/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeCreateAtIngress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    move-object p3, p2

    :goto_0
    invoke-virtual {p0, p3}, Lkm/f;->z(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to parse DLIC seed JSON: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "LinkingProtocol"

    invoke-static {p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2}, Lkm/f;->z(Lorg/json/JSONObject;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final g(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lkm/f;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkm/f;->i:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    const-string v2, "dlicSeed"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p1, 0x0

    iput-object p1, p0, Lkm/f;->i:Lorg/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lkm/f;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeCreateAtIngressWithOrigin(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p2}, Lkm/f;->z(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to parse DLIC seed JSON: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "LinkingProtocol"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v0}, Lkm/f;->z(Lorg/json/JSONObject;)V

    :cond_2
    :goto_2
    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeCreateInternalDlic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public j(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->V3()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeDlicGetUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkm/f;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "explicit_report"

    const-string v1, "external_browser_handoff"

    const-string v2, "success"

    invoke-static {p1, v2, v0, v1}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeDlicSetTerminated(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void

    :cond_1
    invoke-static {p1}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeDetectDlic(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p0, v0}, Lkm/f;->g(Lorg/json/JSONObject;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->V3()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lkm/f;->n(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getDetectURLId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for URL detection failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LinkingProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getAttributionUrlKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "attributionAdName"

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    invoke-virtual {p0, v0}, Lkm/f;->g(Lorg/json/JSONObject;)V

    iget-object p1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getDetectURLId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Constructing JSON params for URL detection failed with error: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "LinkingProtocol"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->V3()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lkm/f;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getDetectURLId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Constructing JSON params for URL detection failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LinkingProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final n(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lkm/f;->o(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final o(Ljava/lang/String;Z)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v5, 0x0

    const/16 v6, 0x17

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "roblox://open-external?"

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "url"

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkm/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    new-instance p2, Lkm/a;

    const-string v0, "LinkingProtocol"

    invoke-direct {p2, v0}, Lkm/a;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lkm/f;->b:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lkm/a;->g(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public p(Ljava/lang/String;Lkm/f$k;)V
    .locals 6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->V3()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkm/f;->o(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2, v1}, Lkm/f$k;->a(Z)V

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->G()Z

    move-result v0

    const-string v2, "Failed to construct IsURLRegisteredRequest JSON due to: "

    const-string v3, "LinkingProtocol"

    if-eqz v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, Lmm/b;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getIsURLRegisteredId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkm/e;

    invoke-direct {v3, p2}, Lkm/e;-><init>(Lkm/f$k;)V

    invoke-direct {p1, v1, v2, v0, v3}, Lmm/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lmm/g;)V

    iget-object p2, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p2, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->k(Lmm/b;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lmm/n;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getIsURLRegisteredResponseId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkm/e;

    invoke-direct {v5, p2}, Lkm/e;-><init>(Lkm/f$k;)V

    invoke-direct {v1, v4, v5}, Lmm/n;-><init>(Ljava/lang/String;Lmm/g;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->v(Lmm/n;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p2

    iput-object p2, p0, Lkm/f;->e:Lcom/roblox/universalapp/messagebus/Connection;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getIsURLRegisteredResponseId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkm/f$g;

    invoke-direct {v5, p0, p2}, Lkm/f$g;-><init>(Lkm/f;Lkm/f$k;)V

    invoke-virtual {v0, v4, v5, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->u(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p2

    iput-object p2, p0, Lkm/f;->e:Lcom/roblox/universalapp/messagebus/Connection;

    :goto_0
    :try_start_1
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lkm/f;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getIsURLRegisteredRequestId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final q(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lkm/f;->k:Ljava/util/Optional;

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkm/f;->k:Ljava/util/Optional;

    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkm/f$h;

    invoke-interface {v0, p1}, Lkm/f$h;->a(Lorg/json/JSONObject;)V

    return-void

    :cond_0
    const-string p1, "LinkingProtocol"

    const-string v0, "Received adConsentResolved with no implementation available."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public r(Lorg/json/JSONObject;)Lmm/l;
    .locals 4

    new-instance p1, Lmm/l;

    invoke-direct {p1}, Lmm/l;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getTrackingAvailableKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkm/f;->l:Lkm/h;

    invoke-virtual {v2}, Lkm/h;->a()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "LinkingProtocol"

    const-string v3, "Failed to write failure JSON"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iput-object v0, p1, Lmm/l;->a:Lorg/json/JSONObject;

    return-object p1
.end method

.method public final s(Lorg/json/JSONObject;)Lmm/l;
    .locals 7

    const-string v0, "Failed to write failure JSON with error: "

    const-string v1, "LinkingProtocol"

    new-instance v2, Lmm/l;

    invoke-direct {v2}, Lmm/l;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Opening URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v5, v6, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v5, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p1, p0, Lkm/f;->b:Landroid/content/Context;

    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getSuccessKey()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x1

    invoke-virtual {v3, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Activity not found: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getSuccessKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Retrieving URL from JSON params for Open URL Request failed with error: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_2
    invoke-static {}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->getSuccessKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_2

    :catch_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    iput-object v3, v2, Lmm/l;->a:Lorg/json/JSONObject;

    return-object v2
.end method

.method public t()V
    .locals 2

    iget-object v0, p0, Lkm/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkm/f;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public u(Lkm/f$h;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lkm/f;->k:Ljava/util/Optional;

    return-void
.end method

.method public v(Lkm/f$i;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lkm/f;->j:Ljava/util/Optional;

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeReportReceived(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public x(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/roblox/universalapp/linking/JNILinkingProtocol;->nativeReportReceived(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public y(Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lkm/f;->b:Landroid/content/Context;

    return-void
.end method

.method public final z(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lkm/f;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lkm/f;->i:Lorg/json/JSONObject;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
