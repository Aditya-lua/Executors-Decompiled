.class public Lcom/roblox/client/purchase/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/purchase/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/purchase/a$f;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/roblox/client/purchase/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/a;Lcom/roblox/client/purchase/a$f;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    iput-object p2, p0, Lcom/roblox/client/purchase/a$a;->a:Lcom/roblox/client/purchase/a$f;

    iput-object p3, p0, Lcom/roblox/client/purchase/a$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 8

    invoke-virtual {p1}, Lei/j;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.purchaseflow"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response Str "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "response Code "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lei/j;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "providerPayload"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "user_id"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    const-string v3, "checkout_session_id"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lhj/b;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-direct {v4, v7, v3, v2}, Lhj/b;-><init>(Ljava/lang/Long;Ljava/lang/String;Lcom/roblox/client/purchase/a$d;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Created validatePurchaseResponsePayload, userId: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", checkoutSessionId: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_0
    move-object v2, v4

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v3

    move-object v4, v2

    move-object v2, v3

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "parsing response string failed: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", error: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->G0()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v2}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v2

    invoke-virtual {v2}, Lvi/g;->z()V

    goto :goto_0

    :cond_1
    :goto_2
    invoke-virtual {p1}, Lei/j;->b()I

    move-result p1

    const/16 v3, 0xc8

    if-eq p1, v3, :cond_b

    const/16 v3, 0x1ad

    if-eq p1, v3, :cond_8

    const/16 v0, 0x1f4

    if-eq p1, v0, :cond_7

    const/16 v0, 0x1f7

    if-eq p1, v0, :cond_6

    const/16 v0, 0x190

    if-eq p1, v0, :cond_5

    const/16 v0, 0x191

    if-eq p1, v0, :cond_4

    const/16 v0, 0x193

    if-eq p1, v0, :cond_3

    const/16 v0, 0x194

    if-eq p1, v0, :cond_2

    const-string p1, "Validation unknown error"

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->J()V

    goto/16 :goto_3

    :cond_2
    const-string p1, "{validateModel} is invalid."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->F()V

    goto/16 :goto_3

    :cond_3
    const-string p1, "Unauthorized to make request. XSRF token is needed."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->E()V

    goto/16 :goto_3

    :cond_4
    const-string p1, "Unauthorized to make request. Auth cookie is needed."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->D()V

    goto/16 :goto_3

    :cond_5
    const-string p1, "Service has thrown an uknown exception."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->C()V

    goto :goto_3

    :cond_6
    const-string p1, "Service has been turned off. Header response will include Retry-After in seconds."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->c:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->I()V

    goto :goto_3

    :cond_7
    const-string p1, "Server Error"

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->H()V

    goto :goto_3

    :cond_8
    const-string p1, "Service has been rate limited to user."

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {p1}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object p1

    invoke-virtual {p1}, Lvi/g;->G()V

    :try_start_2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "errors"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_9

    const/4 v0, 0x6

    if-ne p1, v0, :cond_a

    :cond_9
    sget-object p1, Lcom/roblox/client/purchase/a$e;->e:Lcom/roblox/client/purchase/a$e;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    :cond_a
    sget-object p1, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    goto :goto_3

    :cond_b
    const-string p1, "Validation successful"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->c:Lcom/roblox/client/purchase/a;

    invoke-static {v0}, Lcom/roblox/client/purchase/a;->a(Lcom/roblox/client/purchase/a;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->B()V

    :goto_3
    iget-object v0, p0, Lcom/roblox/client/purchase/a$a;->a:Lcom/roblox/client/purchase/a$f;

    if-eqz v0, :cond_c

    iget-object v1, p0, Lcom/roblox/client/purchase/a$a;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1, v2}, Lcom/roblox/client/purchase/a$f;->a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lhj/b;)V

    :cond_c
    return-void
.end method

.method public b(Lei/j;)V
    .locals 0

    return-void
.end method
