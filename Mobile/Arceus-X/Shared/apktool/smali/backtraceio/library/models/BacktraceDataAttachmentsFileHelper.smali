.class public Lbacktraceio/library/models/BacktraceDataAttachmentsFileHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getValidAttachments(Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lbacktraceio/library/models/BacktraceData;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceData;->getAttachmentPaths()Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lbacktraceio/library/common/FileHelper;->filterOutFiles(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
