.class public Lp7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp7/g;

.field public final b:Lp7/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp7/g;Lp7/f;)V
    .locals 0
    .param p2    # Lp7/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp7/h;->a:Lp7/g;

    iput-object p2, p0, Lp7/h;->b:Lp7/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lf7/i;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    iget-object v1, p0, Lp7/h;->a:Lp7/g;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p2}, Lp7/g;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lp7/c;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/io/InputStream;

    sget-object v2, Lp7/h$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 p1, 0x2

    if-eq v1, p1, :cond_2

    invoke-static {p2, p3}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    goto :goto_0

    :cond_2
    :try_start_0
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p1, p2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, p3}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lf7/p0;

    invoke-direct {p2, p1}, Lf7/p0;-><init>(Ljava/lang/Throwable;)V

    move-object p1, p2

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/util/zip/ZipInputStream;

    invoke-direct {v1, p2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, v1, p3}, Lf7/q;->B(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lf7/p0;->b()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lf7/p0;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf7/i;

    return-object p1

    :cond_4
    :goto_1
    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lf7/p0;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    const-string v1, "LottieFetchResult close failed "

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetching "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/e;->a(Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lp7/h;->b:Lp7/f;

    invoke-interface {v0, p2}, Lp7/f;->a(Ljava/lang/String;)Lp7/d;

    move-result-object v2

    invoke-interface {v2}, Lp7/d;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Lp7/d;->I0()Ljava/io/InputStream;

    move-result-object v6

    invoke-interface {v2}, Lp7/d;->B0()Ljava/lang/String;

    move-result-object v7

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v8}, Lp7/h;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Completed fetch from network. Success: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf7/p0;->b()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ls7/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p2, v0

    invoke-static {v1, p2}, Ls7/e;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    :try_start_2
    new-instance p1, Lf7/p0;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-interface {v2}, Lp7/d;->u2()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lf7/p0;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    :try_start_3
    new-instance p2, Lf7/p0;

    invoke-direct {p2, p1}, Lf7/p0;-><init>(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_2

    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    move-object p1, v0

    invoke-static {v1, p1}, Ls7/e;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    return-object p2

    :goto_4
    if-eqz v2, :cond_3

    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_5

    :catch_3
    move-exception v0

    move-object p2, v0

    invoke-static {v1, p2}, Ls7/e;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    throw p1
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lf7/p0;
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lp7/h;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lf7/i;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lf7/p0;

    invoke-direct {p1, v0}, Lf7/p0;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not found in cache. Fetching from network."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/e;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lp7/h;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_1

    iget-object p3, p0, Lp7/h;->a:Lp7/g;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lp7/c;->d:Lp7/c;

    invoke-virtual {p3, p1, p2, v0}, Lp7/g;->g(Ljava/lang/String;Ljava/io/InputStream;Lp7/c;)Ljava/io/File;

    move-result-object p2

    new-instance p3, Ljava/util/zip/GZIPInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p3, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p3, p1}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p1, p2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lf7/p0;
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    if-nez p4, :cond_0

    const-string p4, "application/json"

    :cond_0
    const-string v0, "application/zip"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "application/x-zip"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "application/x-zip-compressed"

    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\\?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const-string v3, ".lottie"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "application/gzip"

    invoke-virtual {p4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "application/x-gzip"

    invoke-virtual {p4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v2

    const-string p4, ".tgs"

    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "Received json response."

    invoke-static {p1}, Ls7/e;->a(Ljava/lang/String;)V

    sget-object p1, Lp7/c;->b:Lp7/c;

    invoke-virtual {p0, p2, p3, p5}, Lp7/h;->f(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p3

    goto :goto_2

    :cond_3
    :goto_0
    const-string p1, "Handling gzip response."

    invoke-static {p1}, Ls7/e;->a(Ljava/lang/String;)V

    sget-object p1, Lp7/c;->d:Lp7/c;

    invoke-virtual {p0, p2, p3, p5}, Lp7/h;->d(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p3

    goto :goto_2

    :cond_4
    :goto_1
    const-string p4, "Handling zip response."

    invoke-static {p4}, Ls7/e;->a(Ljava/lang/String;)V

    sget-object p4, Lp7/c;->c:Lp7/c;

    invoke-virtual {p0, p1, p2, p3, p5}, Lp7/h;->g(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p3

    move-object p1, p4

    :goto_2
    if-eqz p5, :cond_5

    invoke-virtual {p3}, Lf7/p0;->b()Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_5

    iget-object p4, p0, Lp7/h;->a:Lp7/g;

    if-eqz p4, :cond_5

    invoke-virtual {p4, p2, p1}, Lp7/g;->f(Ljava/lang/String;Lp7/c;)V

    :cond_5
    return-object p3
.end method

.method public final f(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_1

    iget-object p3, p0, Lp7/h;->a:Lp7/g;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lp7/c;->b:Lp7/c;

    invoke-virtual {p3, p1, p2, v0}, Lp7/g;->g(Ljava/lang/String;Ljava/io/InputStream;Lp7/c;)Ljava/io/File;

    move-result-object p2

    new-instance p3, Ljava/io/FileInputStream;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p1}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-static {p2, p1}, Lf7/q;->p(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Lf7/p0<",
            "Lf7/i;",
            ">;"
        }
    .end annotation

    if-eqz p4, :cond_1

    iget-object p4, p0, Lp7/h;->a:Lp7/g;

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lp7/c;->c:Lp7/c;

    invoke-virtual {p4, p2, p3, v0}, Lp7/g;->g(Ljava/lang/String;Ljava/io/InputStream;Lp7/c;)Ljava/io/File;

    move-result-object p3

    new-instance p4, Ljava/util/zip/ZipInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p4, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, p4, p2}, Lf7/q;->B(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    new-instance p2, Ljava/util/zip/ZipInputStream;

    invoke-direct {p2, p3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lf7/q;->B(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object p1

    return-object p1
.end method
