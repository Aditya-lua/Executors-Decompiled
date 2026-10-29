.class public Lvg/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final b:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final synthetic c:Lvg/e;


# direct methods
.method public constructor <init>(Lvg/e;Lj6/a;)V
    .locals 0

    iput-object p1, p0, Lvg/e$e;->c:Lvg/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lvg/e$e;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {p2}, Lbacktraceio/library/models/BacktraceExceptionHandler;->enable(Lj6/a;)V

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lvg/e$e;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public static a(Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "Quest-Backtrace-UnhandledException-Sent"

    return-object p0

    :cond_0
    const-string p0, "Quest-Backtrace-UnhandledException-NotSent"

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    const-string p0, "Android-Backtrace-UnhandledException-Sent"

    return-object p0

    :cond_2
    const-string p0, "Android-Backtrace-UnhandledException-NotSent"

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lvg/e$e;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_0

    instance-of p1, p1, Ljava/lang/Exception;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Z
    .locals 4

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lvg/e$e;->c:Lvg/e;

    invoke-static {v1}, Lvg/e;->b(Lvg/e;)Lvg/e$d;

    iget-object v1, p0, Lvg/e$e;->c:Lvg/e;

    invoke-static {v1}, Lvg/e;->d(Lvg/e;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 4

    :try_start_0
    new-instance v0, Lsm/c$a;

    const-string v1, "clientcrash"

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v2}, Lwf/k;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {v0}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    new-instance v1, Lsm/c$b;

    invoke-direct {v1}, Lsm/c$b;-><init>()V

    const-string v2, "crash_uploader"

    const-string v3, "backtrace_android_java"

    invoke-virtual {v1, v2, v3}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v1

    const-string v2, "rbx_crash_reason"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object p1

    const-string v1, "ixp_enrolled_experiments"

    new-instance v2, Lvg/b;

    invoke-direct {v2}, Lvg/b;-><init>()V

    invoke-static {v2}, Lvg/e;->e(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object p1

    const-string v1, "rollout_flags_in_variant"

    new-instance v2, Lvg/c;

    invoke-direct {v2}, Lvg/c;-><init>()V

    invoke-static {v2}, Lvg/e;->e(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object p1

    const-string v1, "rollout_flags_in_control"

    new-instance v2, Lvg/d;

    invoke-direct {v2}, Lvg/d;-><init>()V

    invoke-static {v2}, Lvg/e;->e(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object p1

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-virtual {p1, v1}, Lsm/c$b;->j(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;)Lsm/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p1

    invoke-static {v0, p1}, Lsm/c;->i(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to report client crash telemetry: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.backtrace"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final e(Z)V
    .locals 1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-static {p1}, Lvg/e$e;->a(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public final f(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "android.app.RemoteServiceException$CannotDeliverBroadcastException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    instance-of v0, p1, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of v0, p1, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_1

    check-cast p1, Ljavax/net/ssl/SSLException;

    const-string v0, "Unable to create application data"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v3

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    invoke-virtual {p0, p2}, Lvg/e$e;->f(Ljava/lang/Throwable;)Z

    move-result v0

    const-string v1, "rbx.backtrace"

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Suppressing known exception "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q4()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lvg/e$e;->d(Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Lvg/e$e;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p2}, Lvg/e$e;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uncaughtException() using the custom handler: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvg/e$e;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lvg/e$e;->e(Z)V

    iget-object v0, p0, Lvg/e$e;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uncaughtException() using the default handler: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvg/e$e;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lvg/e$e;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lvg/e$e;->e(Z)V

    iget-object v0, p0, Lvg/e$e;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method
