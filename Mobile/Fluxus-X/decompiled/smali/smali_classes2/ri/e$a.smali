.class public Lri/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lri/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lri/e;


# direct methods
.method public constructor <init>(Lri/e;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lri/e$a;->a:Lri/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lri/e;Lri/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lri/e$a;-><init>(Lri/e;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 23

    move-object/from16 v0, p1

    invoke-virtual {v0}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "rbx.hybrid"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string v4, "request"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "requestType"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "RequestGame"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "placeId"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v14, "WebView"

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v6 .. v22}, Lei/k0;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lei/k0;

    move-result-object v1

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "game_init_params"

    invoke-static {v1}, Lei/k0;->O(Lei/k0;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v1

    const/16 v5, 0x65

    invoke-virtual {v1, v5, v4}, Ldj/e;->f(ILandroid/os/Bundle;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Lal/a;->a(ZLorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v1, "Unsupported launchGame request"

    invoke-static {v2, v1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v1, "launchGame request failed"

    invoke-static {v2, v1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v3}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
