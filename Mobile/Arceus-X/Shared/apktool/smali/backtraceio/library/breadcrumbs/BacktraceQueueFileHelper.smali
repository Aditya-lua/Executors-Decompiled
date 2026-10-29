.class public Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final LOG_TAG:Ljava/lang/String;

.field private final breadcrumbLogDirectory:Ljava/lang/String;

.field private final breadcrumbStore:Lxm/a;

.field private final maxQueueFileSizeBytes:I

.field private final minimumQueueFileSizeBytes:I

.field private final usedBytes:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    const/16 v0, 0x1000

    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->minimumQueueFileSizeBytes:I

    iput-object p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbLogDirectory:Ljava/lang/String;

    new-instance v1, Lxm/a;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lxm/a;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    const-string p1, "v"

    const/4 v1, 0x0

    const-class v2, Lxm/a;

    invoke-virtual {v2, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->usedBytes:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    if-ge p2, v0, :cond_0

    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    return-void

    :cond_0
    iput p2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    return-void
.end method


# virtual methods
.method public add([B)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    array-length v1, p1

    const/16 v2, 0x1000

    if-le v1, v2, :cond_0

    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    const-string v2, "We should not have a breadcrumb this big, this is a bug!"

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->usedBytes:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    iget-object v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    invoke-virtual {v3}, Lxm/a;->j()Z

    move-result v3

    if-nez v3, :cond_1

    add-int/2addr v2, v1

    iget v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    if-le v2, v3, :cond_1

    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    invoke-virtual {v2}, Lxm/a;->q()V

    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->usedBytes:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    invoke-virtual {v1, p1}, Lxm/a;->d([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :goto_1
    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nWhen adding breadcrumb: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public clear()Z
    .locals 4

    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lxm/a;

    invoke-virtual {v0}, Lxm/a;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nWhen clearing breadcrumbs"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method
