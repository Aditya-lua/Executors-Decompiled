.class public interface abstract Lbacktraceio/library/interfaces/Database;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;"
        }
    .end annotation
.end method

.method public abstract add(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;"
        }
    .end annotation
.end method

.method public abstract addNativeAttribute(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;
.end method

.method public abstract clear()V
.end method

.method public abstract delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V
.end method

.method public abstract disableNativeIntegration()V
.end method

.method public abstract flush()V
.end method

.method public abstract get()Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBreadcrumbs()Lbacktraceio/library/interfaces/Breadcrumbs;
.end method

.method public abstract getDatabaseSize()J
.end method

.method public abstract getSettings()Lbacktraceio/library/models/database/BacktraceDatabaseSettings;
.end method

.method public abstract setApi(Lbacktraceio/library/interfaces/Api;)V
.end method

.method public abstract setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lj6/b;)Ljava/lang/Boolean;
.end method

.method public abstract setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lj6/b;Z)Ljava/lang/Boolean;
.end method

.method public abstract setupNativeIntegration(Lbacktraceio/library/base/BacktraceBase;Lj6/b;ZLbacktraceio/library/enums/UnwindingMode;)Ljava/lang/Boolean;
.end method

.method public abstract start()V
.end method

.method public abstract validConsistency()Z
.end method
