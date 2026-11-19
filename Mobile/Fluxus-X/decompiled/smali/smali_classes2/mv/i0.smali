.class public abstract Lmv/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/i0$a;,
        Lmv/i0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 \u00112\u00020\u0001:\u0002\u000b\u0011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lmv/i0;",
        "Ljava/io/Closeable;",
        "<init>",
        "()V",
        "Lmv/b0;",
        "f",
        "()Lmv/b0;",
        "",
        "e",
        "()J",
        "Ljava/io/InputStream;",
        "a",
        "()Ljava/io/InputStream;",
        "Lew/g;",
        "l3",
        "()Lew/g;",
        "",
        "b",
        "()[B",
        "Ljava/io/Reader;",
        "c",
        "()Ljava/io/Reader;",
        "",
        "h",
        "()Ljava/lang/String;",
        "",
        "close",
        "Ljava/nio/charset/Charset;",
        "d",
        "()Ljava/nio/charset/Charset;",
        "Ljava/io/Reader;",
        "reader",
        "okhttp"
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
.field public static final b:Lmv/i0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lmv/i0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Ljava/io/Reader;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmv/i0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmv/i0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmv/i0;->b:Lmv/i0$b;

    sget-object v2, Lew/h;->e:Lew/h;

    const/4 v3, 0x1

    invoke-static {v0, v2, v1, v3, v1}, Lmv/i0$b;->f(Lmv/i0$b;Lew/h;Lmv/b0;ILjava/lang/Object;)Lmv/i0;

    move-result-object v0

    sput-object v0, Lmv/i0;->c:Lmv/i0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final g(Lmv/b0;JLew/g;)Lmv/i0;
    .locals 1
    .param p0    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lmv/i0;->b:Lmv/i0$b;

    invoke-virtual {v0, p0, p1, p2, p3}, Lmv/i0$b;->d(Lmv/b0;JLew/g;)Lmv/i0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lmv/i0;->l3()Lew/g;

    move-result-object v0

    invoke-interface {v0}, Lew/g;->x3()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()[B
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lmv/i0;->e()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_5

    invoke-virtual {p0}, Lmv/i0;->l3()Lew/g;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-interface {v2}, Lew/g;->a2()[B

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :cond_0
    :goto_0
    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    goto :goto_1

    :catchall_1
    move-exception v4

    if-eqz v2, :cond_1

    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v2

    invoke-static {v4, v2}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    if-nez v4, :cond_4

    array-length v2, v3

    const-wide/16 v4, -0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_3

    int-to-long v4, v2

    cmp-long v4, v0, v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Content-Length ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ") and stream length ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") disagree"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_3
    :goto_2
    return-object v3

    :cond_4
    throw v4

    :cond_5
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot buffer entire body for content length: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final c()Ljava/io/Reader;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/i0;->a:Ljava/io/Reader;

    if-nez v0, :cond_0

    new-instance v0, Lmv/i0$a;

    invoke-virtual {p0}, Lmv/i0;->l3()Lew/g;

    move-result-object v1

    invoke-virtual {p0}, Lmv/i0;->d()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lmv/i0$a;-><init>(Lew/g;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lmv/i0;->a:Ljava/io/Reader;

    :cond_0
    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lmv/i0;->l3()Lew/g;

    move-result-object v0

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    return-void
.end method

.method public final d()Ljava/nio/charset/Charset;
    .locals 1

    invoke-virtual {p0}, Lmv/i0;->f()Lmv/b0;

    move-result-object v0

    invoke-static {v0}, Lnv/b;->a(Lmv/b0;)Ljava/nio/charset/Charset;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()J
.end method

.method public abstract f()Lmv/b0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final h()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lmv/i0;->l3()Lew/g;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lmv/i0;->d()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-static {v0, v2}, Lnv/q;->n(Lew/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-interface {v0, v2}, Lew/g;->C2(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :cond_0
    :goto_0
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    goto :goto_1

    :catchall_1
    move-exception v2

    if-eqz v0, :cond_1

    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    invoke-static {v2, v0}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    return-object v1

    :cond_2
    throw v2
.end method

.method public abstract l3()Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
