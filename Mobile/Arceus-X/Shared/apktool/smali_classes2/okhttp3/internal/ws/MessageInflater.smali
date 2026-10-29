.class public final Lokhttp3/internal/ws/MessageInflater;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lokhttp3/internal/ws/MessageInflater;",
        "Ljava/io/Closeable;",
        "",
        "noContextTakeover",
        "<init>",
        "(Z)V",
        "Lxu/e;",
        "buffer",
        "",
        "inflate",
        "(Lxu/e;)V",
        "close",
        "()V",
        "Z",
        "deflatedBytes",
        "Lxu/e;",
        "Ljava/util/zip/Inflater;",
        "inflater",
        "Ljava/util/zip/Inflater;",
        "Lxu/u;",
        "inflaterSource",
        "Lxu/u;",
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
.field private final deflatedBytes:Lxu/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private inflater:Ljava/util/zip/Inflater;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private inflaterSource:Lxu/u;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final noContextTakeover:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    new-instance p1, Lxu/e;

    invoke-direct {p1}, Lxu/e;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lxu/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lxu/u;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lxu/u;

    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    return-void
.end method

.method public final inflate(Lxu/e;)V
    .locals 6
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    :cond_0
    iget-object v1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lxu/u;

    if-nez v1, :cond_1

    new-instance v1, Lxu/u;

    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    invoke-direct {v1, v2, v0}, Lxu/u;-><init>(Lxu/r0;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lxu/u;

    :cond_1
    iget-boolean v2, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    :cond_2
    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    invoke-virtual {v2, p1}, Lxu/e;->g2(Lxu/r0;)J

    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    const v3, 0xffff

    invoke-virtual {v2, v3}, Lxu/e;->t0(I)Lxu/e;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v2

    iget-object v4, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    invoke-virtual {v4}, Lxu/e;->size()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_3
    const-wide v4, 0x7fffffffffffffffL

    invoke-virtual {v1, p1, v4, v5}, Lxu/u;->a(Lxu/e;J)J

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-gez v4, :cond_4

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_4
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-gez p1, :cond_5

    iget-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lxu/e;

    invoke-virtual {p1}, Lxu/e;->a()V

    invoke-virtual {v1}, Lxu/u;->close()V

    const/4 p1, 0x0

    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lxu/u;

    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
