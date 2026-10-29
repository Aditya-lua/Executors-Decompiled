.class public final Lcom/withpersona/sdk2/inquiry/document/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/o;
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/i$a;,
        Lcom/withpersona/sdk2/inquiry/document/i$b;,
        Lcom/withpersona/sdk2/inquiry/document/i$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/o<",
        "Lcom/withpersona/sdk2/inquiry/document/i$c;",
        ">;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/document/i$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0013$\u0011B/\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b*\u0008\u0012\u0004\u0012\u00020\u00020\u00182\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/i;",
        "Lym/o;",
        "Lcom/withpersona/sdk2/inquiry/document/i$c;",
        "Lvr/h;",
        "",
        "key",
        "Landroid/content/Context;",
        "context",
        "Lqq/c;",
        "sdkFilesManager",
        "Lkotlin/Function0;",
        "",
        "launchPicker",
        "<init>",
        "(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V",
        "otherWorker",
        "",
        "b",
        "(Lym/o;)Z",
        "c",
        "(Lvr/h;)Z",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "Lnu/i;",
        "",
        "Landroid/net/Uri;",
        "documentSelectResult",
        "f",
        "(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;",
        "Ljava/lang/String;",
        "Landroid/content/Context;",
        "d",
        "Lqq/c;",
        "e",
        "Lkotlin/jvm/functions/Function0;",
        "a",
        "document_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lqq/c;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchPicker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/i;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/i;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/i;->d:Lqq/c;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/i;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/document/i;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/i;->e:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/document/i;Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/i;->f(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->a(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public b(Lym/o;)Z
    .locals 1
    .param p1    # Lym/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/i;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lvr/h;)Z
    .locals 1
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/i;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/i;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/i$c;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/i;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/i$c$a;->a:Lcom/withpersona/sdk2/inquiry/document/i$c$a;

    invoke-interface {p1, p2, p3}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    move-object v4, v3

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/Uri;

    :try_start_0
    invoke-virtual {v1, v5}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/document/i;->d:Lqq/c;

    if-nez v6, :cond_3

    const-string v6, "jpg"

    :cond_3
    invoke-virtual {v7, v6}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v1, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5

    if-eqz v5, :cond_4

    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v8, 0x0

    const/4 v9, 0x2

    :try_start_1
    invoke-static {v5, v7, v8, v9, v3}, Lut/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v5, v3}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v7, v3}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v4

    goto :goto_1

    :catchall_1
    move-exception v4

    :try_start_4
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v6

    :try_start_5
    invoke-static {v5, v4}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    :try_start_6
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v5

    :try_start_7
    invoke-static {v7, v4}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5

    :cond_4
    new-instance v4, Ljava/io/FileNotFoundException;

    invoke-direct {v4}, Ljava/io/FileNotFoundException;-><init>()V

    throw v4
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    sget-object v4, Lcom/withpersona/sdk2/inquiry/document/i$a;->b:Lcom/withpersona/sdk2/inquiry/document/i$a;

    :goto_2
    move-object v5, v3

    goto :goto_3

    :catch_1
    sget-object v4, Lcom/withpersona/sdk2/inquiry/document/i$a;->a:Lcom/withpersona/sdk2/inquiry/document/i$a;

    goto :goto_2

    :goto_3
    if-eqz v5, :cond_2

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    if-nez v4, :cond_6

    new-instance p2, Lcom/withpersona/sdk2/inquiry/document/i$c$c;

    invoke-direct {p2, v2}, Lcom/withpersona/sdk2/inquiry/document/i$c$c;-><init>(Ljava/util/List;)V

    invoke-interface {p1, p2, p3}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_6
    new-instance p2, Lcom/withpersona/sdk2/inquiry/document/i$c$b;

    invoke-direct {p2, v2, v4}, Lcom/withpersona/sdk2/inquiry/document/i$c$b;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/i$a;)V

    invoke-interface {p1, p2, p3}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/document/i$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/document/i$d;-><init>(Lcom/withpersona/sdk2/inquiry/document/i;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v1

    invoke-static {v0, v1}, Lnu/j;->y(Lnu/h;Lkotlin/coroutines/CoroutineContext;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
