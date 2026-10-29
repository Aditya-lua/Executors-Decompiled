.class public Lak/m2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ":isolate"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lak/m2;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    const-string v0, "activity"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lg6/l;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object v2

    invoke-static {v2}, Lak/m2;->d(Landroid/app/ApplicationExitInfo;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v3

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getStatus()I

    move-result v6

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "reason"

    invoke-static {v4, v5}, Lak/m2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "subreason"

    invoke-static {v4, v5}, Lak/m2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "APPLICATION EXIT INFO FORMAT CHANGED"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {}, Landroid/app/ActivityManager;->isLowMemoryKillReportSupported()Z

    move-result v5

    if-nez v5, :cond_4

    const/4 v5, 0x2

    if-ne v3, v5, :cond_4

    sget v3, Landroid/system/OsConstants;->SIGKILL:I

    if-ne v6, v3, :cond_4

    const-string v4, "LOW_MEMORY"

    :cond_4
    move-object v10, v4

    new-instance v4, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getPid()I

    move-result v5

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v7

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getDescription()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getPss()J

    move-result-wide v12

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getRss()J

    move-result-wide v14

    invoke-virtual {v2}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v16

    invoke-direct/range {v4 .. v16}, Lcom/roblox/engine/jni/model/ApplicationExitInfoCpp;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJI)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "reason"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "subreason"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p0, "INVALID USE OF FUNCTION"

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, ") "

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x28

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-eq v1, v0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "APPLICATION EXIT INFO FORMAT CHANGED"

    return-object p0
.end method

.method public static c(Landroid/app/ApplicationExitInfo;)V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Points"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "EventIngest"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "addOSInfo"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "addUniverseId"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "addPlaceId"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "addSessionId"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Landroid/util/Pair;

    const-string v4, "description"

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/util/Pair;

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "importance"

    invoke-direct {v3, v5, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/util/Pair;

    const-string v4, "processName"

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getProcessName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v3, "reason"

    invoke-static {p0, v3}, Lak/m2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "subreason"

    invoke-static {p0, v5}, Lak/m2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v6, Landroid/util/Pair;

    invoke-direct {v6, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, v5, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    const-string v3, "RobloxTelemetry"

    invoke-virtual {p0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->N1()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    const-string v3, "SkipInferredCrashEvent"

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    return-void
.end method

.method public static d(Landroid/app/ApplicationExitInfo;)Ljava/lang/Boolean;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    sget-object v0, Lak/m2;->a:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getProcessName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Skipping reporting inferred crash for process name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PreviousExitReasonHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lak/m2;->c(Landroid/app/ApplicationExitInfo;)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method
