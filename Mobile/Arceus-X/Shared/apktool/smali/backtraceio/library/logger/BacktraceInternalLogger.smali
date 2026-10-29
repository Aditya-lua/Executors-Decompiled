.class public Lbacktraceio/library/logger/BacktraceInternalLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/logger/Logger;


# static fields
.field private static final BASE_TAG:Ljava/lang/String; = "BacktraceLogger: "


# instance fields
.field private logLevel:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lbacktraceio/library/logger/LogLevel;->OFF:Lbacktraceio/library/logger/LogLevel;

    invoke-direct {p0, v0}, Lbacktraceio/library/logger/BacktraceInternalLogger;-><init>(Lbacktraceio/library/logger/LogLevel;)V

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/logger/LogLevel;)V
    .locals 0
    .param p1    # Lbacktraceio/library/logger/LogLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iput p1, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    return-void
.end method

.method private getTag(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BacktraceLogger: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    iget v0, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->DEBUG:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    invoke-direct {p0, p1}, Lbacktraceio/library/logger/BacktraceInternalLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    iget v0, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lbacktraceio/library/logger/BacktraceInternalLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 2

    .line 3
    iget v0, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lbacktraceio/library/logger/BacktraceInternalLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getLogLevel()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    return v0
.end method

.method public setLevel(Lbacktraceio/library/logger/LogLevel;)V
    .locals 0
    .param p1    # Lbacktraceio/library/logger/LogLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iput p1, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    iget v0, p0, Lbacktraceio/library/logger/BacktraceInternalLogger;->logLevel:I

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->WARN:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    invoke-direct {p0, p1}, Lbacktraceio/library/logger/BacktraceInternalLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
