.class public final Llm/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "eventName",
        "",
        "Lkotlin/Pair;",
        "customFields",
        "",
        "throttlingHundredthPercentage",
        "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;",
        "universalapp_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Ljava/util/List;I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;I)",
            "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "eventName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customFields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EventIngest"

    invoke-static {v0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "addOSInfo"

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v4, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    const-string v3, "RobloxTelemetry"

    invoke-virtual {p1, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
