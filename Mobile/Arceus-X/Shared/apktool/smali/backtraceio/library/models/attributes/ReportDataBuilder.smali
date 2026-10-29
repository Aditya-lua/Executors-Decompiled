.class public Lbacktraceio/library/models/attributes/ReportDataBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getReportAttributes(Ljava/util/Map;)Lbacktraceio/library/models/attributes/ReportDataAttributes;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/attributes/ReportDataAttributes;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lbacktraceio/library/models/attributes/ReportDataBuilder;->getReportAttributes(Ljava/util/Map;Z)Lbacktraceio/library/models/attributes/ReportDataAttributes;

    move-result-object p0

    return-object p0
.end method

.method public static getReportAttributes(Ljava/util/Map;Z)Lbacktraceio/library/models/attributes/ReportDataAttributes;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Lbacktraceio/library/models/attributes/ReportDataAttributes;"
        }
    .end annotation

    .line 2
    new-instance v0, Lbacktraceio/library/models/attributes/ReportDataAttributes;

    invoke-direct {v0}, Lbacktraceio/library/models/attributes/ReportDataAttributes;-><init>()V

    if-nez p0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    if-nez p1, :cond_1

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v2, v1}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->addAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lbacktraceio/library/common/TypeHelper;->isPrimitiveOrPrimitiveWrapperOrString(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->addAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v0, v2, v1}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->addAnnotation(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method
