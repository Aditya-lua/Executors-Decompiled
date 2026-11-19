.class public final Lpv/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpv/a;->a(Lpv/c;Lmv/h0;)Lmv/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "pv/a$b",
        "Lew/l0;",
        "Lew/e;",
        "sink",
        "",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "Lew/m0;",
        "t",
        "()Lew/m0;",
        "",
        "close",
        "()V",
        "",
        "a",
        "Z",
        "cacheRequestClosed",
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


# instance fields
.field public a:Z

.field public final synthetic b:Lew/g;

.field public final synthetic c:Lpv/c;

.field public final synthetic d:Lew/f;


# direct methods
.method public constructor <init>(Lew/g;Lpv/c;Lew/f;)V
    .locals 0

    iput-object p1, p0, Lpv/a$b;->b:Lew/g;

    iput-object p2, p0, Lpv/a$b;->c:Lpv/c;

    iput-object p3, p0, Lpv/a$b;->d:Lew/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, Lpv/a$b;->a:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Lnv/q;->i(Lew/l0;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpv/a$b;->a:Z

    iget-object v0, p0, Lpv/a$b;->c:Lpv/c;

    invoke-interface {v0}, Lpv/c;->a()V

    :cond_0
    iget-object v0, p0, Lpv/a$b;->b:Lew/g;

    invoke-interface {v0}, Lew/l0;->close()V

    return-void
.end method

.method public f3(Lew/e;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    :try_start_0
    iget-object v0, p0, Lpv/a$b;->b:Lew/g;

    invoke-interface {v0, p1, p2, p3}, Lew/l0;->f3(Lew/e;J)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 p2, -0x1

    cmp-long v0, v6, p2

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lpv/a$b;->a:Z

    if-nez p1, :cond_0

    iput-boolean v1, p0, Lpv/a$b;->a:Z

    iget-object p1, p0, Lpv/a$b;->d:Lew/f;

    invoke-interface {p1}, Lew/j0;->close()V

    :cond_0
    return-wide p2

    :cond_1
    iget-object p2, p0, Lpv/a$b;->d:Lew/f;

    invoke-interface {p2}, Lew/f;->l()Lew/e;

    move-result-object v3

    invoke-virtual {p1}, Lew/e;->size()J

    move-result-wide p2

    sub-long v4, p2, v6

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lew/e;->f(Lew/e;JJ)Lew/e;

    iget-object p1, p0, Lpv/a$b;->d:Lew/f;

    invoke-interface {p1}, Lew/f;->l0()Lew/f;

    return-wide v6

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-boolean p2, p0, Lpv/a$b;->a:Z

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lpv/a$b;->a:Z

    iget-object p2, p0, Lpv/a$b;->c:Lpv/c;

    invoke-interface {p2}, Lpv/c;->a()V

    :cond_2
    throw p1
.end method

.method public t()Lew/m0;
    .locals 1

    iget-object v0, p0, Lpv/a$b;->b:Lew/g;

    invoke-interface {v0}, Lew/l0;->t()Lew/m0;

    move-result-object v0

    return-object v0
.end method
