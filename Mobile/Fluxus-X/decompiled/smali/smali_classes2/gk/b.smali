.class public final Lgk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lgk/b;",
        "",
        "<init>",
        "()V",
        "",
        "placeId",
        "",
        "d",
        "(J)V",
        "e",
        "",
        "h",
        "(J)Ljava/lang/String;",
        "g",
        "Lgk/b$a;",
        "action",
        "f",
        "(JLgk/b$a;)V",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "b",
        "Lzt/h;",
        "c",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "config",
        "a",
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


# static fields
.field public static final a:Lgk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgk/b;

    invoke-direct {v0}, Lgk/b;-><init>()V

    sput-object v0, Lgk/b;->a:Lgk/b;

    new-instance v0, Lgk/a;

    invoke-direct {v0}, Lgk/a;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lgk/b;->b:Lzt/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lgk/b;->b()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lfn/c;->a:Lfn/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->POINTS:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/q0;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lfn/c$a;

    const-string v2, "androidPinnedShortcutAction"

    invoke-direct {v1, v2, v0}, Lfn/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v0, 0x8

    const/4 v2, 0x7

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lfn/a;->b(III)V

    const-string v0, "Tracks Android app shortcut pin request and success actions"

    invoke-interface {v1, v0}, Lfn/a;->a(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->d2()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lfn/a;->c(Ljava/lang/Integer;)V

    invoke-virtual {v1}, Lfn/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lgk/b;->b:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public final d(J)V
    .locals 1

    sget-object v0, Lgk/b$a;->a:Lgk/b$a;

    invoke-virtual {p0, p1, p2, v0}, Lgk/b;->f(JLgk/b$a;)V

    return-void
.end method

.method public final e(J)V
    .locals 1

    sget-object v0, Lgk/b$a;->b:Lgk/b$a;

    invoke-virtual {p0, p1, p2, v0}, Lgk/b;->f(JLgk/b$a;)V

    return-void
.end method

.method public final f(JLgk/b$a;)V
    .locals 2

    sget-object v0, Lfn/c;->a:Lfn/c;

    new-instance v0, Lfn/c$b;

    invoke-direct {v0}, Lfn/c$b;-><init>()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->Z0()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lgk/b;->a:Lgk/b;

    invoke-virtual {v1, p1, p2}, Lgk/b;->g(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v1, Lgk/b;->a:Lgk/b;

    invoke-virtual {v1, p1, p2}, Lgk/b;->h(J)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "shortcutId"

    invoke-interface {v0, p2, p1}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "shortcutAction"

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lfn/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p1

    invoke-virtual {p0}, Lgk/b;->c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object p2

    invoke-static {p2, p1}, Lfn/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method

.method public final g(J)Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "experience_edp_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(J)Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "experience_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
