.class public interface abstract Lbacktraceio/library/interfaces/Breadcrumbs;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addBreadcrumb(Ljava/lang/String;)Z
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract clearBreadcrumbs()Z
.end method

.method public abstract enableBreadcrumbs(Landroid/content/Context;)Z
.end method

.method public abstract enableBreadcrumbs(Landroid/content/Context;I)Z
.end method

.method public abstract enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract enableBreadcrumbs(Landroid/content/Context;Ljava/util/EnumSet;I)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;I)Z"
        }
    .end annotation
.end method

.method public abstract getBreadcrumbLogPath()Ljava/lang/String;
.end method

.method public abstract getCurrentBreadcrumbId()J
.end method

.method public abstract getEnabledBreadcrumbTypes()Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract processReportBreadcrumbs(Lbacktraceio/library/models/json/BacktraceReport;)V
.end method

.method public abstract setCurrentBreadcrumbId(J)V
.end method

.method public abstract setOnSuccessfulBreadcrumbAddEventListener(Lbacktraceio/library/events/OnSuccessfulBreadcrumbAddEventListener;)V
.end method
