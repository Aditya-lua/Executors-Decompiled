.class public Lbacktraceio/library/models/BacktraceStackFrame;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceStackFrame"


# instance fields
.field public functionName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "funcName"
    .end annotation
.end field

.field public line:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "line"
    .end annotation
.end field

.field public sourceCode:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sourceCode"
    .end annotation
.end field

.field public transient sourceCodeFileName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/StackTraceElement;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    .line 5
    invoke-static {p1}, Lbacktraceio/library/models/BacktraceStackFrame;->fromStackTraceElement(Ljava/lang/StackTraceElement;)Lbacktraceio/library/models/BacktraceStackFrame;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p1, Lbacktraceio/library/models/BacktraceStackFrame;->functionName:Ljava/lang/String;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackFrame;->functionName:Ljava/lang/String;

    .line 7
    iget-object v0, p1, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCodeFileName:Ljava/lang/String;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCodeFileName:Ljava/lang/String;

    .line 8
    iget-object v0, p1, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCode:Ljava/lang/String;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCode:Ljava/lang/String;

    .line 9
    iget-object p1, p1, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong stacktrace element frame - can`t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 11
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lbacktraceio/library/models/BacktraceStackFrame;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lbacktraceio/library/models/BacktraceStackFrame;->functionName:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCodeFileName:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCode:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    return-void
.end method

.method public static fromStackTraceElement(Ljava/lang/StackTraceElement;)Lbacktraceio/library/models/BacktraceStackFrame;
    .locals 3

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v2, Lbacktraceio/library/models/BacktraceStackFrame;

    invoke-direct {v2, v0, v1, p0}, Lbacktraceio/library/models/BacktraceStackFrame;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v2

    :cond_1
    sget-object p0, Lbacktraceio/library/models/BacktraceStackFrame;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Frame or method name is null"

    invoke-static {p0, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
