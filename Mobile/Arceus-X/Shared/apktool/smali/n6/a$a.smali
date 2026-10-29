.class public final Ln6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Ln6/a$a;",
        "",
        "<init>",
        "()V",
        "Lxu/h0;",
        "directory",
        "b",
        "(Lxu/h0;)Ln6/a$a;",
        "",
        "size",
        "c",
        "(J)Ln6/a$a;",
        "Ln6/a;",
        "a",
        "()Ln6/a;",
        "Lxu/h0;",
        "Lxu/l;",
        "Lxu/l;",
        "fileSystem",
        "",
        "D",
        "maxSizePercent",
        "d",
        "J",
        "minimumMaxSizeBytes",
        "e",
        "maximumMaxSizeBytes",
        "f",
        "maxSizeBytes",
        "Lkotlin/coroutines/CoroutineContext;",
        "g",
        "Lkotlin/coroutines/CoroutineContext;",
        "cleanupCoroutineContext",
        "coil-core_release"
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
.field public a:Lxu/h0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Lxu/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:D

.field public d:J

.field public e:J

.field public f:J

.field public g:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Le7/n;->a()Lxu/l;

    move-result-object v0

    iput-object v0, p0, Ln6/a$a;->b:Lxu/l;

    const-wide v0, 0x3f947ae147ae147bL    # 0.02

    iput-wide v0, p0, Ln6/a$a;->c:D

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Ln6/a$a;->d:J

    const-wide/32 v0, 0xfa00000

    iput-wide v0, p0, Ln6/a$a;->e:J

    sget-object v0, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    iput-object v0, p0, Ln6/a$a;->g:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public final a()Ln6/a;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v3, p0, Ln6/a$a;->a:Lxu/h0;

    if-eqz v3, :cond_1

    iget-wide v0, p0, Ln6/a$a;->c:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v0, v4

    if-lez v2, :cond_0

    :try_start_0
    iget-object v2, p0, Ln6/a$a;->b:Lxu/l;

    invoke-static {v2, v3}, Le7/m;->a(Lxu/l;Lxu/h0;)J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v0, v4

    double-to-long v4, v0

    iget-wide v6, p0, Ln6/a$a;->d:J

    iget-wide v8, p0, Ln6/a$a;->e:J

    invoke-static/range {v4 .. v9}, Lkotlin/ranges/d;->k(JJJ)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-wide v0, p0, Ln6/a$a;->d:J

    :goto_0
    move-wide v1, v0

    goto :goto_1

    :cond_0
    iget-wide v0, p0, Ln6/a$a;->f:J

    goto :goto_0

    :goto_1
    new-instance v0, Ln6/f;

    iget-object v4, p0, Ln6/a$a;->b:Lxu/l;

    iget-object v5, p0, Ln6/a$a;->g:Lkotlin/coroutines/CoroutineContext;

    invoke-direct/range {v0 .. v5}, Ln6/f;-><init>(JLxu/h0;Lxu/l;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "directory == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lxu/h0;)Ln6/a$a;
    .locals 0
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-object p1, p0, Ln6/a$a;->a:Lxu/h0;

    return-object p0
.end method

.method public final c(J)Ln6/a$a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    iput-wide p1, p0, Ln6/a$a;->e:J

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "size must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
