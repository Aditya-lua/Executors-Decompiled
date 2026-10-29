.class public interface abstract Lbacktraceio/library/anr/ProcessExitInfoProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getHistoricalExitInfo(Ljava/lang/String;II)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Lbacktraceio/library/anr/ExitInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSupportedTypesOfExitInfo()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method
