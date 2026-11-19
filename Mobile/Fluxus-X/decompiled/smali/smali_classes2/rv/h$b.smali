.class public final Lrv/h$b;
.super Lew/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0018\u00a8\u0006 "
    }
    d2 = {
        "Lrv/h$b;",
        "Lew/n;",
        "Lew/l0;",
        "delegate",
        "",
        "contentLength",
        "",
        "isSocket",
        "<init>",
        "(Lrv/h;Lew/l0;JZ)V",
        "Lew/e;",
        "sink",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "",
        "close",
        "()V",
        "Ljava/io/IOException;",
        "e",
        "b",
        "(Ljava/io/IOException;)Ljava/io/IOException;",
        "J",
        "c",
        "Z",
        "d",
        "bytesReceived",
        "invokeStartEvent",
        "f",
        "completed",
        "g",
        "closed",
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
.field public final b:J

.field public final c:Z

.field public d:J

.field public e:Z

.field public f:Z

.field public g:Z

.field public final synthetic h:Lrv/h;


# direct methods
.method public constructor <init>(Lrv/h;Lew/l0;JZ)V
    .locals 1
    .param p1    # Lrv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lew/l0;",
            "JZ)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrv/h$b;->h:Lrv/h;

    invoke-direct {p0, p2}, Lew/n;-><init>(Lew/l0;)V

    iput-wide p3, p0, Lrv/h$b;->b:J

    iput-boolean p5, p0, Lrv/h$b;->c:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrv/h$b;->e:Z

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 11
    .param p1    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-boolean v0, p0, Lrv/h$b;->f:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrv/h$b;->f:Z

    if-nez p1, :cond_1

    iget-boolean v0, p0, Lrv/h$b;->e:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrv/h$b;->e:Z

    iget-object v0, p0, Lrv/h$b;->h:Lrv/h;

    invoke-virtual {v0}, Lrv/h;->k()Lmv/s;

    move-result-object v0

    iget-object v1, p0, Lrv/h$b;->h:Lrv/h;

    invoke-virtual {v1}, Lrv/h;->i()Lrv/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/s;->responseBodyStart(Lmv/e;)V

    :cond_1
    iget-object v2, p0, Lrv/h$b;->h:Lrv/h;

    iget-wide v3, p0, Lrv/h$b;->d:J

    iget-boolean v5, p0, Lrv/h$b;->c:Z

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v8, p1

    invoke-static/range {v2 .. v10}, Lrv/h;->c(Lrv/h;JZZZLjava/io/IOException;ILjava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1

    iget-boolean v0, p0, Lrv/h$b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrv/h$b;->g:Z

    :try_start_0
    invoke-super {p0}, Lew/n;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw v0
.end method

.method public f3(Lew/e;J)J
    .locals 7
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lrv/h$b;->g:Z

    if-nez v0, :cond_5

    :try_start_0
    invoke-virtual {p0}, Lew/n;->a()Lew/l0;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lew/l0;->f3(Lew/e;J)J

    move-result-wide p1

    iget-boolean p3, p0, Lrv/h$b;->e:Z

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    iput-boolean p3, p0, Lrv/h$b;->e:Z

    iget-object p3, p0, Lrv/h$b;->h:Lrv/h;

    invoke-virtual {p3}, Lrv/h;->k()Lmv/s;

    move-result-object p3

    iget-object v0, p0, Lrv/h$b;->h:Lrv/h;

    invoke-virtual {v0}, Lrv/h;->i()Lrv/m;

    move-result-object v0

    invoke-virtual {p3, v0}, Lmv/s;->responseBodyStart(Lmv/e;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-wide/16 v0, -0x1

    cmp-long p3, p1, v0

    const/4 v2, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0, v2}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;

    return-wide v0

    :cond_1
    iget-wide v3, p0, Lrv/h$b;->d:J

    add-long/2addr v3, p1

    iget-wide v5, p0, Lrv/h$b;->b:J

    cmp-long p3, v5, v0

    if-eqz p3, :cond_3

    cmp-long p3, v3, v5

    if-gtz p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lrv/h$b;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but received "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-wide v3, p0, Lrv/h$b;->d:J

    iget-object p3, p0, Lrv/h$b;->h:Lrv/h;

    invoke-static {p3}, Lrv/h;->a(Lrv/h;)Lsv/d;

    move-result-object p3

    invoke-interface {p3}, Lsv/d;->c()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0, v2}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-wide p1

    :goto_2
    invoke-virtual {p0, p1}, Lrv/h$b;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
