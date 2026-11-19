.class public Lbacktraceio/library/models/json/SourceCodeData;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "SourceCodeData"


# instance fields
.field public final data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/SourceCode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/SourceCodeData;->data:Ljava/util/Map;

    sget-object v0, Lbacktraceio/library/models/json/SourceCodeData;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Initialization source code data"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbacktraceio/library/models/BacktraceStackFrame;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCode:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lbacktraceio/library/models/BacktraceStackFrame;->sourceCode:Ljava/lang/String;

    new-instance v2, Lbacktraceio/library/models/json/SourceCode;

    invoke-direct {v2, v0}, Lbacktraceio/library/models/json/SourceCode;-><init>(Lbacktraceio/library/models/BacktraceStackFrame;)V

    iget-object v0, p0, Lbacktraceio/library/models/json/SourceCodeData;->data:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v0, Lbacktraceio/library/models/json/SourceCodeData;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Stack frame is null or sourceCode is empty"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_2
    const-string p1, "Exception stack is null or empty"

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
