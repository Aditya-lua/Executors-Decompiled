.class public final Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/e$b;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lnu/i;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/e;


# direct methods
.method public constructor <init>(Lnu/i;Lcom/withpersona/sdk2/inquiry/governmentid/e;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->a:Lnu/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->a:Lnu/i;

    move-object v2, p1

    check-cast v2, Landroid/net/Uri;

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->d(Lcom/withpersona/sdk2/inquiry/governmentid/e;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-virtual {v6, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->f(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_3
    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->e(Lcom/withpersona/sdk2/inquiry/governmentid/e;)Lqq/c;

    move-result-object v7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    :try_start_0
    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->d(Lcom/withpersona/sdk2/inquiry/governmentid/e;)Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    if-nez v2, :cond_4

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v6, "ContentProvider has recently crashed."

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    goto :goto_2

    :cond_4
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v8, 0x2

    const/4 v9, 0x0

    :try_start_1
    invoke-static {v2, v7, v4, v8, v9}, Lut/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v9}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v7, v9}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v7, "getAbsolutePath(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v5, v6}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_1

    :catchall_1
    move-exception v5

    :try_start_4
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v6

    :try_start_5
    invoke-static {v2, v5}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v5

    :try_start_7
    invoke-static {v7, v2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v6, "Selected document file not found."

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    goto :goto_2

    :cond_5
    sget-object v2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;

    :goto_2
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->z:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->A:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/e$b$a$a;->u:I

    invoke-interface {p2, v2, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
