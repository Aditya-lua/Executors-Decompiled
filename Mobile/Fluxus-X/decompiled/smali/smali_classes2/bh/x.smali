.class public final Lbh/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/d$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lbh/x;",
        "Lal/d$b;",
        "<init>",
        "()V",
        "",
        "moduleID",
        "functionName",
        "",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "Lzt/h;",
        "c",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "nativeAndroidHybridModuleCommandCounter",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbh/w;

    invoke-direct {v0}, Lbh/w;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lbh/x;->a:Lzt/h;

    return-void
.end method

.method public static synthetic b()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lbh/x;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lfn/c;->a:Lfn/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lfn/c$a;

    const-string v2, "NativeAndroidHybridModuleCommandCounter"

    invoke-direct {v1, v2, v0}, Lfn/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v0, 0xa

    const/16 v2, 0x16

    const/16 v3, 0x7e9

    invoke-interface {v1, v3, v0, v2}, Lfn/a;->b(III)V

    const-string v0, "Counter for commands handle by Hybrid Modules on Android"

    invoke-interface {v1, v0}, Lfn/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lfn/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lbh/x;->c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lfn/c;->a:Lfn/c;

    new-instance v1, Lfn/c$b;

    invoke-direct {v1}, Lfn/c$b;-><init>()V

    if-eqz p1, :cond_1

    const-string v2, "moduleId"

    invoke-interface {v1, v2, p1}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "functionName"

    invoke-interface {v1, p1, p2}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object p1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-interface {v1, p1}, Lfn/b;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;)Lfn/b;

    invoke-virtual {v1}, Lfn/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lfn/c;->g(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;DILjava/lang/Object;)Z

    return-void
.end method

.method public final c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    iget-object v0, p0, Lbh/x;->a:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method
