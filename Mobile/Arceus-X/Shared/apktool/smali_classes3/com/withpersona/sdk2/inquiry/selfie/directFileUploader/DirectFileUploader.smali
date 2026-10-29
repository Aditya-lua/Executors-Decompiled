.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$b;,
        Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;,
        Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;,
        Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u001a\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u0004#01(B!\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R6\u0010*\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120&j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012`\'0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u00062"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
        "",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
        "uploadService",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V",
        "",
        "absoluteFilePath",
        "fileUploadUrl",
        "",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "f",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
        "i",
        "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
        "",
        "allowRetry",
        "k",
        "(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;",
        "com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d",
        "g",
        "()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;",
        "h",
        "(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;",
        "a",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;",
        "b",
        "Lku/p0;",
        "Lnu/c0;",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "c",
        "Lnu/c0;",
        "uploadTasks",
        "Luu/a;",
        "d",
        "Luu/a;",
        "mutex",
        "e",
        "FilePath",
        "UploadTask",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Ljava/util/HashMap<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->e:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$b;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V
    .locals 8
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->a:Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->b:Lku/p0;

    const-string p2, "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UPLOAD_TASKS"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->g()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/l0;->e(Ljava/lang/String;Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->c:Lnu/c0;

    const/4 p2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object p2

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->d:Luu/a;

    invoke-interface {p1}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->g()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;

    move-result-object v0

    invoke-interface {p1, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;

    invoke-direct {v5, p2, p0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;-><init>(Ljava/util/HashMap;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p3

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public static final synthetic a(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Luu/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->d:Luu/a;

    return-object p0
.end method

.method public static final synthetic b(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->a:Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    return-object p0
.end method

.method public static final synthetic c(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Lnu/c0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->c:Lnu/c0;

    return-object p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->h(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->k(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final f()V
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->b:Lku/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final g()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;-><init>()V

    return-object v0
.end method

.method public final h(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;
    .locals 7

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;->getFileKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    move-object v3, v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;->getFileName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v3

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;->getFileEncrypted()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, v3

    move v3, v4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;->getFileContentType()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    return-object v5

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;->getFileByteSize()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    return-object v0

    :cond_3
    return-object v5

    :cond_4
    move-object v5, v3

    return-object v5
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->k(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "absoluteFilePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUploadUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->b:Lku/p0;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;

    iget v3, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->A:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->A:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;

    invoke-direct {v1, p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lnt/b;)V

    :goto_0
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->A:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v3, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->w:Z

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->v:Ljava/lang/Object;

    check-cast v4, Luu/a;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->u:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    move v8, v3

    :goto_1
    move-object v13, v4

    move-object v3, v7

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->d:Luu/a;

    iput-object p1, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->t:Ljava/lang/Object;

    move-object/from16 v7, p2

    iput-object v7, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->u:Ljava/lang/Object;

    iput-object v4, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->v:Ljava/lang/Object;

    move/from16 v8, p3

    iput-boolean v8, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->w:Z

    const/4 v9, 0x0

    iput v9, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->x:I

    iput v5, v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$f;->A:I

    invoke-interface {v4, v6, v1}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v1, p1

    goto :goto_1

    :goto_2
    :try_start_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->c:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    if-eqz v0, :cond_5

    if-eqz v8, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->i()Ljt/n;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, v5, :cond_4

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_4
    invoke-interface {v13, v6}, Luu/a;->e(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    :goto_3
    :try_start_1
    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v8, v1

    move-object v9, v3

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;-><init>(Ljava/lang/String;Ljava/lang/String;Ljt/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->b:Lku/p0;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;Lnt/b;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v0

    invoke-static/range {v7 .. v12}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->j(Lku/d2;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->c:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v13, v6}, Luu/a;->e(Ljava/lang/Object;)V

    return-object v4

    :goto_4
    invoke-interface {v13, v6}, Luu/a;->e(Ljava/lang/Object;)V

    throw v0
.end method
