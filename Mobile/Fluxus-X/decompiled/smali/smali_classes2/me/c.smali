.class public abstract Lme/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lme/b;)J
    .locals 3

    invoke-static {p1}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lme/f;->a()Lme/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lme/c;->b()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v0, v1}, Lme/f;->b(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    invoke-virtual {p1}, Lme/b;->a()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {v0, p1}, Lme/f;->b(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object p1

    check-cast p1, Ljava/io/OutputStream;

    invoke-static {v1, p1}, Lme/d;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lme/f;->close()V

    return-wide v1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0, p1}, Lme/f;->c(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lme/f;->close()V

    throw p1
.end method

.method public abstract b()Ljava/io/InputStream;
.end method
