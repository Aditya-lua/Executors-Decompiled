.class public Lvg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg/e$d;,
        Lvg/e$c;,
        Lvg/e$b;,
        Lvg/e$e;
    }
.end annotation


# instance fields
.field public volatile a:Lj6/a;

.field public volatile b:I

.field public volatile c:I

.field public d:Ljava/util/UUID;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lvg/e;->d:Ljava/util/UUID;

    .line 4
    const-string v0, ""

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "rbx.backtrace"

    if-nez v1, :cond_0

    .line 5
    :try_start_0
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lvg/e;->d:Ljava/util/UUID;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 6
    :catch_0
    const-string v0, "Could not parse provided symbolication ID."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 7
    :cond_0
    const-string v0, "No symbolication ID provided."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public synthetic constructor <init>(Lvg/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvg/e;-><init>()V

    return-void
.end method

.method public static synthetic a(Lvg/e;Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvg/e;->l(Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lvg/e;)Lvg/e$d;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic c(Lvg/e;)I
    .locals 0

    iget p0, p0, Lvg/e;->c:I

    return p0
.end method

.method public static bridge synthetic d(Lvg/e;)I
    .locals 0

    iget p0, p0, Lvg/e;->b:I

    return p0
.end method

.method public static bridge synthetic e(Ljava/util/function/Supplier;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lvg/e;->m(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h()Lvg/e;
    .locals 1

    invoke-static {}, Lvg/e$c;->a()Lvg/e;

    move-result-object v0

    return-object v0
.end method

.method public static m(Ljava/util/function/Supplier;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, ""

    :try_start_0
    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    return-object p0

    :catchall_0
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final f(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    const-string v1, "logcat"

    const-string v2, "-t"

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->t2()Ljava/lang/String;

    move-result-object v3

    const-string v4, "-v"

    const-string v5, "time"

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "androidLog.txt"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bypass Java log due to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.backtrace"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public g()Lj6/a;
    .locals 1

    iget-object v0, p0, Lvg/e;->a:Lj6/a;

    return-object v0
.end method

.method public i(Landroid/content/Context;)V
    .locals 8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->K4()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->w2()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s4()I

    move-result v5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->a4()I

    move-result v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->P()I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Lvg/e;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;III)V

    return-void
.end method

.method public final declared-synchronized j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lvg/e;->a:Lj6/a;

    if-nez v0, :cond_1

    iput p5, p0, Lvg/e;->b:I

    iput p6, p0, Lvg/e;->c:I

    new-instance p5, Lj6/b;

    invoke-direct {p5, p2, p3}, Lj6/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "androidLog.txt"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lvg/e$a;

    invoke-direct {p3, p0, p2}, Lvg/e$a;-><init>(Lvg/e;Ljava/lang/String;)V

    new-instance p2, Lj6/a;

    invoke-direct {p2, p1, p5, p3}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Ljava/util/List;)V

    iget-object p3, p0, Lvg/e;->d:Ljava/util/UUID;

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lbacktraceio/library/base/BacktraceBase;->enableProguard()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p3, Lvg/e$b;

    invoke-direct {p3, p0, p2}, Lvg/e$b;-><init>(Lvg/e;Lj6/a;)V

    invoke-virtual {p2, p4, p3}, Lj6/a;->b(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V

    new-instance p3, Lvg/a;

    invoke-direct {p3, p0, p1}, Lvg/a;-><init>(Lvg/e;Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Lbacktraceio/library/base/BacktraceBase;->setOnBeforeSendEventListener(Lbacktraceio/library/events/OnBeforeSendEventListener;)V

    new-instance p1, Lvg/e$e;

    invoke-direct {p1, p0, p2}, Lvg/e$e;-><init>(Lvg/e;Lj6/a;)V

    invoke-static {p1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object p2, p0, Lvg/e;->a:Lj6/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public k(Landroid/content/Context;Lvg/h;)V
    .locals 7

    invoke-virtual {p2}, Lvg/h;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lvg/h;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lvg/h;->a()I

    move-result v4

    invoke-virtual {p2}, Lvg/h;->c()I

    move-result v5

    invoke-virtual {p2}, Lvg/h;->b()I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lvg/e;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;III)V

    return-void
.end method

.method public final synthetic l(Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;
    .locals 3

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    const-string v1, "BaseUrl"

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v1

    invoke-virtual {v1}, Lfk/c;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "UserId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v1

    invoke-virtual {v1}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/game/c;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IsInGame"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    const-string v1, "BuildVariant"

    invoke-static {}, Lgk/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    const-string v1, "BuildId"

    invoke-static {}, Lsg/a1;->K()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    const-string v1, "RobloxChannel"

    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    new-instance v1, Lvg/b;

    invoke-direct {v1}, Lvg/b;-><init>()V

    invoke-static {v1}, Lvg/e;->m(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IxpEnrolledExperiments"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    new-instance v1, Lvg/c;

    invoke-direct {v1}, Lvg/c;-><init>()V

    invoke-static {v1}, Lvg/e;->m(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RolloutFlagsInVariant"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    new-instance v1, Lvg/d;

    invoke-direct {v1}, Lvg/d;-><init>()V

    invoke-static {v1}, Lvg/e;->m(Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RolloutFlagsInControl"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lvg/e;->d:Ljava/util/UUID;

    if-eqz v0, :cond_0

    iget-object v1, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    const-string v2, "symbolication_id"

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lvg/e;->f(Landroid/content/Context;)V

    return-object p2
.end method
