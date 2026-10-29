.class public final Lcom/appsflyer/internal/AFa1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFd1iSDK;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/appsflyer/internal/AFd1iSDK<",
        "Lcom/appsflyer/internal/AFa1gSDK;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic registerClient(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "found"

    invoke-virtual {v2, p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const-string v0, "is_second_ping"

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz p1, :cond_1

    const-string p1, "click_event"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/appsflyer/share/deeplink/DeepLink;->parse(Lorg/json/JSONObject;)Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/appsflyer/share/deeplink/DeepLink;->setDeferred(Z)Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v1

    :cond_1
    new-instance p1, Lcom/appsflyer/internal/AFa1gSDK;

    invoke-direct {p1, v0, v1}, Lcom/appsflyer/internal/AFa1gSDK;-><init>(ZLcom/appsflyer/share/deeplink/DeepLink;)V

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Lcom/appsflyer/internal/AFa1gSDK;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/appsflyer/internal/AFa1gSDK;-><init>(ZLcom/appsflyer/share/deeplink/DeepLink;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
