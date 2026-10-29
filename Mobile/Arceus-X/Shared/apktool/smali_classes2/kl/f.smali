.class public final Lkl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkl/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkl/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lkl/f;",
        "Lkl/a;",
        "<init>",
        "()V",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;",
        "provider",
        "",
        "b",
        "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V",
        "",
        "result",
        "errorClass",
        "",
        "durationMs",
        "a",
        "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;J)V",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;",
        "status",
        "j",
        "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;)Ljava/lang/String;",
        "h",
        "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "Ljt/h;",
        "e",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "launchConfig",
        "c",
        "f",
        "resultConfig",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lkl/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkl/f;

    invoke-direct {v0}, Lkl/f;-><init>()V

    sput-object v0, Lkl/f;->a:Lkl/f;

    new-instance v0, Lkl/d;

    invoke-direct {v0}, Lkl/d;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lkl/f;->b:Ljt/h;

    new-instance v0, Lkl/e;

    invoke-direct {v0}, Lkl/e;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lkl/f;->c:Ljt/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lkl/f;->g()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lkl/f;->i()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final g()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "externalIdentityLaunch"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lsm/a;->c(Ljava/lang/Integer;)V

    const/16 v0, 0x9

    const/16 v2, 0x1d

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Native external identity provider UI was launched"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final i()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "externalIdentityResult"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lsm/a;->c(Ljava/lang/Integer;)V

    const/16 v0, 0x9

    const/16 v2, 0x1d

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Native external identity provider interaction completed"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 5
    .param p1    # Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "result"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkl/f;->f()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v2

    sget-object v3, Lsm/c;->a:Lsm/c;

    new-instance v3, Lsm/c$b;

    invoke-direct {v3}, Lsm/c$b;-><init>()V

    const-string v4, "externalIdentity"

    invoke-interface {v3, v4}, Lsm/b;->d(Ljava/lang/String;)V

    sget-object v4, Lkl/f;->a:Lkl/f;

    invoke-virtual {v4, p1}, Lkl/f;->h(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, v0, p1}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v1, p2}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "errorClass"

    invoke-interface {v3, p1, p3}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    const-string p1, "durationMs"

    invoke-interface {v3, p1, p4, p5}, Lsm/b;->g(Ljava/lang/String;J)V

    invoke-virtual {v3}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p1

    invoke-static {v2, p1}, Lsm/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method

.method public b(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V
    .locals 4
    .param p1    # Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkl/f;->e()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v1

    sget-object v2, Lsm/c;->a:Lsm/c;

    new-instance v2, Lsm/c$b;

    invoke-direct {v2}, Lsm/c$b;-><init>()V

    const-string v3, "externalIdentity"

    invoke-interface {v2, v3}, Lsm/b;->d(Ljava/lang/String;)V

    sget-object v3, Lkl/f;->a:Lkl/f;

    invoke-virtual {v3, p1}, Lkl/f;->h(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v0, p1}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p1

    invoke-static {v1, p1}, Lsm/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method

.method public final e()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lkl/f;->b:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public final f()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lkl/f;->c:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public final h(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkl/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "apple"

    return-object p1

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_1
    const-string p1, "google"

    return-object p1
.end method

.method public final j(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;)Ljava/lang/String;
    .locals 1
    .param p1    # Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
