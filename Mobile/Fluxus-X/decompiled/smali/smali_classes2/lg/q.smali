.class public final Llg/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/Reader;)Llg/l;
    .locals 2

    :try_start_0
    new-instance v0, Ltg/a;

    invoke-direct {v0, p0}, Ltg/a;-><init>(Ljava/io/Reader;)V

    invoke-static {v0}, Llg/q;->b(Ltg/a;)Llg/l;

    move-result-object p0

    invoke-virtual {p0}, Llg/l;->n()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->j:Ltg/b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Llg/u;

    const-string v0, "Did not consume the entire document."

    invoke-direct {p0, v0}, Llg/u;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ltg/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Llg/m;

    invoke-direct {v0, p0}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    new-instance v0, Llg/u;

    invoke-direct {v0, p0}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Ltg/a;)Llg/l;
    .locals 5

    invoke-virtual {p0}, Ltg/a;->o()Llg/x;

    move-result-object v0

    sget-object v1, Llg/x;->b:Llg/x;

    if-ne v0, v1, :cond_0

    sget-object v1, Llg/x;->a:Llg/x;

    invoke-virtual {p0, v1}, Ltg/a;->e0(Llg/x;)V

    :cond_0
    :try_start_0
    invoke-static {p0}, Lng/h0;->a(Ltg/a;)Llg/l;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Ltg/a;->e0(Llg/x;)V

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    :try_start_1
    new-instance v2, Llg/p;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed parsing JSON source: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " to Json"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Llg/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p0, v0}, Ltg/a;->e0(Llg/x;)V

    throw v1
.end method

.method public static c(Ljava/lang/String;)Llg/l;
    .locals 1

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Llg/q;->a(Ljava/io/Reader;)Llg/l;

    move-result-object p0

    return-object p0
.end method
