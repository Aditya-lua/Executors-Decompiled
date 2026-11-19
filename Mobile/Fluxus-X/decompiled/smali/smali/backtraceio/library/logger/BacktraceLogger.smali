.class public Lbacktraceio/library/logger/BacktraceLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static logger:Lbacktraceio/library/logger/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbacktraceio/library/logger/BacktraceInternalLogger;

    invoke-direct {v0}, Lbacktraceio/library/logger/BacktraceInternalLogger;-><init>()V

    sput-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    invoke-interface {v0, p0, p1}, Lbacktraceio/library/logger/Logger;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    invoke-interface {v0, p0, p1}, Lbacktraceio/library/logger/Logger;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 1

    .line 2
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    invoke-interface {v0, p0, p1, p2}, Lbacktraceio/library/logger/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p0

    return p0
.end method

.method public static getLogger()Lbacktraceio/library/logger/Logger;
    .locals 1

    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    return-object v0
.end method

.method public static setLevel(Lbacktraceio/library/logger/LogLevel;)V
    .locals 2
    .param p0    # Lbacktraceio/library/logger/LogLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    instance-of v1, v0, Lbacktraceio/library/logger/BacktraceInternalLogger;

    if-eqz v1, :cond_0

    check-cast v0, Lbacktraceio/library/logger/BacktraceInternalLogger;

    invoke-virtual {v0, p0}, Lbacktraceio/library/logger/BacktraceInternalLogger;->setLevel(Lbacktraceio/library/logger/LogLevel;)V

    :cond_0
    return-void
.end method

.method public static setLogger(Lbacktraceio/library/logger/Logger;)V
    .locals 1
    .param p0    # Lbacktraceio/library/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    sput-object p0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Passed custom logger implementation can`t be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logger:Lbacktraceio/library/logger/Logger;

    invoke-interface {v0, p0, p1}, Lbacktraceio/library/logger/Logger;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method
