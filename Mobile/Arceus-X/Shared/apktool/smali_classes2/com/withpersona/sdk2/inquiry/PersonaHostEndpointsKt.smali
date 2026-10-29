.class public final Lcom/withpersona/sdk2/inquiry/PersonaHostEndpointsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/PersonaHostEndpointsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "endpoints",
        "Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;",
        "Lcom/withpersona/sdk2/inquiry/PersonaHost;",
        "getEndpoints",
        "(Lcom/withpersona/sdk2/inquiry/PersonaHost;)Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;",
        "inquiry-dynamic-feature_release"
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
.method public static final getEndpoints(Lcom/withpersona/sdk2/inquiry/PersonaHost;)Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;
    .locals 4
    .param p0    # Lcom/withpersona/sdk2/inquiry/PersonaHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpointsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;

    const-string v0, "https://inquiry-fallback.withpersona-gov.com"

    const-string v1, "https://tg.withpersona-gov.com"

    const-string v2, "https://app.withpersona-gov.com"

    const-string v3, "https://webrtc-consumer.withpersona-gov.com"

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;

    const-string v0, "https://inquiry-fallback.withpersona.com"

    const-string v1, "https://tg.withpersona.com"

    const-string v2, "https://withpersona.com"

    const-string v3, "https://webrtc-consumer.withpersona.com"

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
