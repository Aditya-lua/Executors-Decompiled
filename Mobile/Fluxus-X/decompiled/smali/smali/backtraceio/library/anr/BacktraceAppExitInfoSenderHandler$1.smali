.class Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->generateBacktraceReport(Lbacktraceio/library/anr/ExitInfo;)Lbacktraceio/library/models/json/BacktraceReport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

.field final synthetic val$anrAttributes:Ljava/util/Map;

.field final synthetic val$parsedStackTraceAttributes:Ljava/util/Map;

.field final synthetic val$stackTrace:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    iput-object p1, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;->this$0:Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

    iput-object p2, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;->val$anrAttributes:Ljava/util/Map;

    iput-object p3, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;->val$stackTrace:Ljava/lang/String;

    iput-object p4, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;->val$parsedStackTraceAttributes:Ljava/util/Map;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "error.type"

    const-string v0, "Hang"

    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ANR annotations"

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ANR stacktrace"

    invoke-virtual {p0, p1, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ANR parsed stacktrace"

    invoke-virtual {p0, p1, p4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
