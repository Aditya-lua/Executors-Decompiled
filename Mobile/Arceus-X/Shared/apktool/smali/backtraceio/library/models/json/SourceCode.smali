.class public Lbacktraceio/library/models/json/SourceCode;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public sourceCodeFileName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "path"
    .end annotation
.end field

.field public startLine:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "startLine"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/BacktraceStackFrame;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lbacktraceio/library/models/BacktraceStackFrame;->line:Ljava/lang/Integer;

    iget-object p1, p1, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCodeFileName:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lbacktraceio/library/models/json/SourceCode;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbacktraceio/library/models/json/SourceCode;->startLine:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lbacktraceio/library/models/json/SourceCode;->sourceCodeFileName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSourceCodeFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/SourceCode;->sourceCodeFileName:Ljava/lang/String;

    return-object v0
.end method

.method public getStartLine()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/SourceCode;->startLine:Ljava/lang/Integer;

    return-object v0
.end method
