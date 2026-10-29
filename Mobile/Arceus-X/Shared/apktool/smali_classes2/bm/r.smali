.class public Lbm/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbm/r$d;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public final b:Lcom/roblox/universalapp/messagebus/Connection;

.field public final c:Lcom/roblox/universalapp/messagebus/Connection;

.field public final d:Lcom/roblox/universalapp/messagebus/Connection;

.field public final e:Lcom/roblox/universalapp/messagebus/Connection;

.field public f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lbm/t;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Lbm/t;

    invoke-direct {v0}, Lbm/t;-><init>()V

    iput-object v0, p0, Lbm/r;->g:Lbm/t;

    .line 5
    new-instance v0, Lbm/n;

    invoke-direct {v0, p0}, Lbm/n;-><init>(Lbm/r;)V

    const-string v1, "Credentials.isAvailableRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lbm/r;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    new-instance v0, Lbm/o;

    invoke-direct {v0, p0}, Lbm/o;-><init>(Lbm/r;)V

    const-string v1, "Credentials.registerCredentialsRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lbm/r;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    new-instance v0, Lbm/p;

    invoke-direct {v0, p0}, Lbm/p;-><init>(Lbm/r;)V

    const-string v1, "Credentials.getCredentialsRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lbm/r;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 8
    new-instance v0, Lbm/q;

    invoke-direct {v0, p0}, Lbm/q;-><init>(Lbm/r;)V

    const-string v1, "Credentials.deleteKeystoreCredentialsRequest"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lbm/r;->e:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lbm/s;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbm/r;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lbm/r;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->n(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic b(Lbm/r;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->l(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(Lbm/r;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->k(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic d(Lbm/r;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static bridge synthetic e(Lbm/r;ILjava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static y()Lbm/r;
    .locals 1

    invoke-static {}, Lbm/r$d;->a()Lbm/r;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public f(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    const-string p1, ""

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "errorCode"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "errorMsg"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    const-string v1, "CredentialsProtocol"

    const-string v2, "JSON exception on registering credentials: "

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, ""

    const-string v3, "keystore"

    const-string v4, "experimentGroup"

    const-string v5, "userId"

    const-string v6, "userHandle"

    const-string v7, "signature"

    const-string v8, "clientDataJSON"

    const-string v9, "authenticatorData"

    const-string v10, "type"

    const-string v11, "rawId"

    const-string v12, "id"

    const-string v13, "response"

    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_0

    goto/16 :goto_2

    :cond_0
    :try_start_0
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v15, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_1

    move-object/from16 v16, v2

    invoke-virtual {v15, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v12, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_1
    move-object/from16 v16, v2

    :goto_0
    invoke-virtual {v15, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v15, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    invoke-virtual {v15, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v15, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    invoke-virtual {v15, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v15, v13}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    invoke-virtual {v10, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v10, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    invoke-virtual {v10, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v10, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    invoke-virtual {v0, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    const-string v2, "credentialType"

    const-string v6, "username"

    const-string v7, "password"

    if-eqz v1, :cond_c

    :try_start_1
    const-string v8, "all"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    invoke-virtual {v15, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v15, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_b

    invoke-virtual {v14, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v14, v13, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v14

    :cond_b
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_12

    const-string v1, "FIDO2"

    invoke-virtual {v14, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v14, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v14

    :cond_c
    if-eqz v1, :cond_11

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "parameters"

    invoke-virtual {v15, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_e
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_f
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_10
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_12

    const-string v1, "errorCode"

    move-object/from16 v4, v16

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "errorMsg"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v14, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v14, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v14

    :cond_11
    return-object v0

    :goto_1
    const-string v1, "CredentialsProtocol"

    const-string v2, "JSON exception on getting credentials: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_12
    :goto_2
    return-object v14
.end method

.method public final h(ILjava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "errorCode"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string p1, "errorMsg"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    const-string p1, "CredentialsProtocol"

    const-string p2, "JSON exception when creating error response!"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final i(ZZZZZ)Lorg/json/JSONObject;
    .locals 4

    const-string v0, "supportsDeviceBoundOnly"

    const-string v1, "isAvailable"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v3, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->B0()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "supportsSilentPasskeyUpgrade"

    invoke-virtual {v3, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->e3()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "supportsPasskeyCreationOnDevice"

    invoke-virtual {v3, p1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_1
    const-string p1, "FIDO2"

    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p2, "password"

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const/4 p2, 0x1

    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p2, "keystore"

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "JSON exception on checking credentials availability: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CredentialsProtocol"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2
.end method

.method public j(Ljava/lang/ref/WeakReference;Lbm/t;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lbm/t;",
            ")Z"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lbm/t;->k()Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const-string p1, "CredentialsProtocol"

    const-string p2, "Activity is not available!"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic k(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->s(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic l(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->u(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic m(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic n(Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbm/r;->o(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final o(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lbm/r;->g:Lbm/t;

    invoke-virtual {p0, v0, v1}, Lbm/r;->j(Ljava/lang/ref/WeakReference;Lbm/t;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Credentials.deleteKeystoreCredentialsResponse"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lbm/r;->g:Lbm/t;

    iget-object v2, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lbm/r;->p(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public p(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lbm/t;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    new-instance v0, Lbm/r$c;

    invoke-direct {v0, p0, p4}, Lbm/r$c;-><init>(Lbm/r;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    invoke-virtual {p3, p2, p1, v0}, Lbm/t;->d(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/t$d;)V

    return-void
.end method

.method public final q(Lorg/json/JSONObject;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCredentials request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CredentialsProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lbm/r;->g:Lbm/t;

    invoke-virtual {p0, v0, v2}, Lbm/r;->j(Ljava/lang/ref/WeakReference;Lbm/t;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "CredentialManager not available while getting credentials."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Credentials.getCredentialsResponse"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lbm/r;->g:Lbm/t;

    iget-object v2, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lbm/r;->r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public r(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lbm/t;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    new-instance v0, Lbm/r$b;

    invoke-direct {v0, p0, p4}, Lbm/r$b;-><init>(Lbm/r;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    invoke-virtual {p3, p2, p1, v0}, Lbm/t;->f(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/t$d;)V

    return-void
.end method

.method public final s(Lorg/json/JSONObject;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isAvailable request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CredentialsProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lbm/r;->g:Lbm/t;

    iget-object v2, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lbm/r;->t(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public t(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lbm/t;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Lbm/r;->j(Ljava/lang/ref/WeakReference;Lbm/t;)Z

    move-result p1

    const-string v0, "Credentials.isAvailableResponse"

    if-nez p1, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lbm/r;->i(ZZZZZ)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v0, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    invoke-virtual {p3}, Lbm/t;->n()Z

    move-result v2

    invoke-virtual {p3}, Lbm/t;->m()Z

    move-result v4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->e3()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p3, p1}, Lbm/t;->l(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    move v6, v1

    move v3, v2

    move v5, v2

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lbm/r;->i(ZZZZZ)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v0, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final u(Lorg/json/JSONObject;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "registerCredentials request: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CredentialsProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lbm/r;->g:Lbm/t;

    invoke-virtual {p0, v0, v2}, Lbm/r;->j(Ljava/lang/ref/WeakReference;Lbm/t;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "CredentialManager not available while registering credentials."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "Credentials.registerCredentialsResponse"

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lbm/r;->g:Lbm/t;

    iget-object v2, p0, Lbm/r;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-virtual {p0, p1, v0, v1, v2}, Lbm/r;->v(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public v(Lorg/json/JSONObject;Ljava/lang/ref/WeakReference;Lbm/t;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lbm/t;",
            "Lcom/roblox/universalapp/messagebus/MessageBus;",
            ")V"
        }
    .end annotation

    const-string v0, "credentialType"

    const-string v1, "Credentials.registerCredentialsResponse"

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "FIDO2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x5

    if-eqz v3, :cond_1

    invoke-virtual {p3}, Lbm/t;->n()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0, v4, v2}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->y2()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "password"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p2}, Lgk/k;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string p1, "CredentialsProtocol"

    const-string p2, "Password credentials are not supported on TV."

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v4, v2}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_2
    new-instance v1, Lbm/r$a;

    invoke-direct {v1, p0, p4}, Lbm/r$a;-><init>(Lbm/r;Lcom/roblox/universalapp/messagebus/MessageBus;)V

    invoke-virtual {p3, p2, p1, v0, v1}, Lbm/t;->b(Landroid/app/Activity;Lorg/json/JSONObject;Ljava/lang/String;Lbm/t$d;)V

    return-void

    :cond_3
    :goto_0
    :try_start_1
    const-string p1, "Credential type not specified!"

    const/4 p2, 0x3

    invoke-virtual {p0, p2, p1}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x4

    invoke-virtual {p0, p1, v2}, Lbm/r;->h(ILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public w(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 10

    const-string v0, "authenticatorAttachment"

    const-string v1, "attestationObject"

    const-string v2, "clientDataJSON"

    const-string v3, "response"

    const-string v4, "type"

    const-string v5, "rawId"

    const-string v6, "id"

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "register credential result: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "CredentialsProtocol"

    invoke-static {v9, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v6, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    invoke-virtual {v7, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :goto_1
    const-string v0, "JSON exception on registering credentials: "

    invoke-static {v9, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_7
    :goto_2
    return-object v7
.end method

.method public x(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lbm/r;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method
