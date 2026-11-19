.class public final Lmv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/c$a;,
        Lmv/c$b;,
        Lmv/c$c;,
        Lmv/c$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\r\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u000449\u0014\u0019B)\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\rB\u0019\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0012\u001a\u0008\u0018\u00010\u0010R\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0013\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008(\u0010&J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0000\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008-\u0010&R\u001a\u00101\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010.\u001a\u0004\u0008/\u00100R\"\u00108\u001a\u0002028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\"\u0010;\u001a\u0002028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00089\u00103\u001a\u0004\u00089\u00105\"\u0004\u0008:\u00107R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00103R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u00103R\u0016\u0010>\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00103\u00a8\u0006?"
    }
    d2 = {
        "Lmv/c;",
        "Ljava/io/Closeable;",
        "Ljava/io/Flushable;",
        "Lew/b0;",
        "directory",
        "",
        "maxSize",
        "Lew/k;",
        "fileSystem",
        "Lqv/d;",
        "taskRunner",
        "<init>",
        "(Lew/b0;JLew/k;Lqv/d;)V",
        "(Lew/k;Lew/b0;J)V",
        "Ljava/io/File;",
        "(Ljava/io/File;J)V",
        "Lpv/f$b;",
        "Lpv/f;",
        "editor",
        "",
        "a",
        "(Lpv/f$b;)V",
        "Lmv/f0;",
        "request",
        "Lmv/h0;",
        "b",
        "(Lmv/f0;)Lmv/h0;",
        "response",
        "Lpv/c;",
        "f",
        "(Lmv/h0;)Lpv/c;",
        "g",
        "(Lmv/f0;)V",
        "cached",
        "network",
        "o",
        "(Lmv/h0;Lmv/h0;)V",
        "e",
        "()V",
        "flush",
        "close",
        "Lpv/d;",
        "cacheStrategy",
        "n",
        "(Lpv/d;)V",
        "m",
        "Lpv/f;",
        "getCache$okhttp",
        "()Lpv/f;",
        "cache",
        "",
        "I",
        "d",
        "()I",
        "k",
        "(I)V",
        "writeSuccessCount",
        "c",
        "h",
        "writeAbortCount",
        "networkCount",
        "hitCount",
        "requestCount",
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
.field public static final g:Lmv/c$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lpv/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmv/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmv/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmv/c;->g:Lmv/c$b;

    return-void
.end method

.method public constructor <init>(Lew/b0;JLew/k;Lqv/d;)V
    .locals 9
    .param p1    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lqv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileSystem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Lpv/f;

    const v4, 0x31191

    const/4 v5, 0x2

    move-object v3, p1

    move-wide v6, p2

    move-object v2, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lpv/f;-><init>(Lew/k;Lew/b0;IIJLqv/d;)V

    iput-object v1, p0, Lmv/c;->a:Lpv/f;

    return-void
.end method

.method public constructor <init>(Lew/k;Lew/b0;J)V
    .locals 7
    .param p1    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v6, Lqv/d;->m:Lqv/d;

    move-object v1, p0

    move-object v5, p1

    move-object v2, p2

    move-wide v3, p3

    .line 4
    invoke-direct/range {v1 .. v6}, Lmv/c;-><init>(Lew/b0;JLew/k;Lqv/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;J)V
    .locals 5
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lew/k;->b:Lew/k;

    .line 6
    sget-object v1, Lew/b0;->b:Lew/b0$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, p1, v4, v2, v3}, Lew/b0$a;->d(Lew/b0$a;Ljava/io/File;ZILjava/lang/Object;)Lew/b0;

    move-result-object p1

    .line 7
    invoke-direct {p0, v0, p1, p2, p3}, Lmv/c;-><init>(Lew/k;Lew/b0;J)V

    return-void
.end method


# virtual methods
.method public final a(Lpv/f$b;)V
    .locals 0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lpv/f$b;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final b(Lmv/f0;)Lmv/h0;
    .locals 4
    .param p1    # Lmv/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmv/c;->g:Lmv/c$b;

    invoke-virtual {p1}, Lmv/f0;->m()Lmv/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/c$b;->b(Lmv/z;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lmv/c;->a:Lpv/f;

    invoke-virtual {v2, v0}, Lpv/f;->s(Ljava/lang/String;)Lpv/f$d;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_1
    new-instance v2, Lmv/c$c;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lpv/f$d;->b(I)Lew/l0;

    move-result-object v3

    invoke-direct {v2, v3}, Lmv/c$c;-><init>(Lew/l0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v2, v0}, Lmv/c$c;->c(Lpv/f$d;)Lmv/h0;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lmv/c$c;->a(Lmv/f0;Lmv/h0;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lmv/h0;->b()Lmv/i0;

    move-result-object p1

    invoke-static {p1}, Lnv/n;->f(Ljava/io/Closeable;)V

    return-object v1

    :cond_1
    return-object v0

    :catch_0
    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    :catch_1
    return-object v1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lmv/c;->c:I

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lmv/c;->a:Lpv/f;

    invoke-virtual {v0}, Lpv/f;->close()V

    return-void
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lmv/c;->b:I

    return v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lmv/c;->a:Lpv/f;

    invoke-virtual {v0}, Lpv/f;->A()V

    return-void
.end method

.method public final f(Lmv/h0;)Lpv/c;
    .locals 9
    .param p1    # Lmv/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lsv/f;->a(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmv/c;->g(Lmv/f0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v2

    :cond_0
    const-string v1, "GET"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    sget-object v0, Lmv/c;->g:Lmv/c$b;

    invoke-virtual {v0, p1}, Lmv/c$b;->a(Lmv/h0;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    new-instance v1, Lmv/c$c;

    invoke-direct {v1, p1}, Lmv/c$c;-><init>(Lmv/h0;)V

    :try_start_1
    iget-object v3, p0, Lmv/c;->a:Lpv/f;

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/f0;->m()Lmv/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lmv/c$b;->b(Lmv/z;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lpv/f;->r(Lpv/f;Ljava/lang/String;JILjava/lang/Object;)Lpv/f$b;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p1, :cond_3

    return-object v2

    :cond_3
    :try_start_2
    invoke-virtual {v1, p1}, Lmv/c$c;->e(Lpv/f$b;)V

    new-instance v0, Lmv/c$d;

    invoke-direct {v0, p0, p1}, Lmv/c$d;-><init>(Lmv/c;Lpv/f$b;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_1
    move-object p1, v2

    :catch_2
    invoke-virtual {p0, p1}, Lmv/c;->a(Lpv/f$b;)V

    return-object v2
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lmv/c;->a:Lpv/f;

    invoke-virtual {v0}, Lpv/f;->flush()V

    return-void
.end method

.method public final g(Lmv/f0;)V
    .locals 2
    .param p1    # Lmv/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmv/c;->a:Lpv/f;

    sget-object v1, Lmv/c;->g:Lmv/c$b;

    invoke-virtual {p1}, Lmv/f0;->m()Lmv/z;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmv/c$b;->b(Lmv/z;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpv/f;->T(Ljava/lang/String;)Z

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lmv/c;->c:I

    return-void
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, Lmv/c;->b:I

    return-void
.end method

.method public final declared-synchronized m()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lmv/c;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lmv/c;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized n(Lpv/d;)V
    .locals 1
    .param p1    # Lpv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "cacheStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lmv/c;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lmv/c;->f:I

    invoke-virtual {p1}, Lpv/d;->b()Lmv/f0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget p1, p0, Lmv/c;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lmv/c;->d:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lpv/d;->a()Lmv/h0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget p1, p0, Lmv/c;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lmv/c;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final o(Lmv/h0;Lmv/h0;)V
    .locals 1
    .param p1    # Lmv/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmv/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cached"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "network"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmv/c$c;

    invoke-direct {v0, p2}, Lmv/c$c;-><init>(Lmv/h0;)V

    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lmv/c$a;

    invoke-virtual {p1}, Lmv/c$a;->k()Lpv/f$d;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1}, Lpv/f$d;->a()Lpv/f$b;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Lmv/c$c;->e(Lpv/f$b;)V

    invoke-virtual {p1}, Lpv/f$b;->c()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    const/4 p1, 0x0

    :catch_1
    invoke-virtual {p0, p1}, Lmv/c;->a(Lpv/f$b;)V

    return-void
.end method
