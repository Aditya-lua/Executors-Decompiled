.class public Lvg/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lj6/a;

.field public final synthetic b:Lvg/e;


# direct methods
.method public constructor <init>(Lvg/e;Lj6/a;)V
    .locals 0

    iput-object p1, p0, Lvg/e$b;->b:Lvg/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvg/e$b;->a:Lj6/a;

    return-void
.end method

.method public static a(Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "Quest-Backtrace-ANRException-Sent"

    return-object p0

    :cond_0
    const-string p0, "Quest-Backtrace-ANRException-NotSent"

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    const-string p0, "Android-Backtrace-ANRException-Sent"

    return-object p0

    :cond_2
    const-string p0, "Android-Backtrace-ANRException-NotSent"

    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 4

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lvg/e$b;->b:Lvg/e;

    invoke-static {v1}, Lvg/e;->b(Lvg/e;)Lvg/e$d;

    iget-object v1, p0, Lvg/e$b;->b:Lvg/e;

    invoke-static {v1}, Lvg/e;->c(Lvg/e;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Z)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-static {p1}, Lvg/e$b;->a(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->f0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lvg/e$b;->a(Z)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-Channel-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onEvent(Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;)V
    .locals 7

    const-string v0, "OnApplicationNotRespondingEvent()"

    const-string v1, "rbx.backtrace"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->getActiveShaders()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    move v3, v0

    :goto_0
    array-length v4, v2

    if-ge v3, v4, :cond_1

    aget-object v4, v2, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Lvg/e$b;->a:Lj6/a;

    invoke-virtual {v4}, Lbacktraceio/library/base/BacktraceBase;->getAttributes()Ljava/util/Map;

    move-result-object v4

    const-string v5, "GfxActiveShader%d"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aget-object v6, v2, v3

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skipping active shaders due to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Lvg/e$b;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lvg/e$b;->c(Z)V

    iget-object v0, p0, Lvg/e$b;->a:Lj6/a;

    invoke-virtual {v0, p1}, Lj6/a;->g(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    invoke-virtual {p0, v0}, Lvg/e$b;->c(Z)V

    :goto_3
    return-void
.end method
