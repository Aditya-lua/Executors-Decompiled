.class public Lm1/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/h1;


# instance fields
.field public final a:Landroid/media/MediaCodec;

.field public final b:I

.field public final c:Ljava/nio/ByteBuffer;

.field public final d:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public g:J

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lm1/j1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lm1/j1;->g:J

    iput-boolean v1, p0, Lm1/j1;->h:Z

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaCodec;

    iput-object v0, p0, Lm1/j1;->a:Landroid/media/MediaCodec;

    invoke-static {p2}, Lx2/g;->d(I)I

    move-result v0

    iput v0, p0, Lm1/j1;->b:I

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lm1/j1;->c:Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance p2, Lm1/i1;

    invoke-direct {p2, p1}, Lm1/i1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {p2}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p2

    iput-object p2, p0, Lm1/j1;->d:Lne/x;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    iput-object p1, p0, Lm1/j1;->e:Ly1/c$a;

    return-void
.end method

.method public static synthetic e(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "Terminate InputBuffer"

    return-object p0
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    invoke-virtual {p0}, Lm1/j1;->f()V

    iput-boolean p1, p0, Lm1/j1;->h:Z

    return-void
.end method

.method public b()Z
    .locals 10

    iget-object v0, p0, Lm1/j1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    :try_start_0
    iget-object v3, p0, Lm1/j1;->a:Landroid/media/MediaCodec;

    iget v4, p0, Lm1/j1;->b:I

    iget-object v0, p0, Lm1/j1;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    iget-object v0, p0, Lm1/j1;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v6

    iget-wide v7, p0, Lm1/j1;->g:J

    iget-boolean v0, p0, Lm1/j1;->h:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    move v9, v0

    goto :goto_0

    :cond_1
    move v9, v2

    :goto_0
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    iget-object v0, p0, Lm1/j1;->e:Ly1/c$a;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lm1/j1;->e:Ly1/c$a;

    invoke-virtual {v1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return v2
.end method

.method public c(J)V
    .locals 2

    invoke-virtual {p0}, Lm1/j1;->f()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->a(Z)V

    iput-wide p1, p0, Lm1/j1;->g:J

    return-void
.end method

.method public cancel()Z
    .locals 9

    iget-object v0, p0, Lm1/j1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lm1/j1;->a:Landroid/media/MediaCodec;

    iget v3, p0, Lm1/j1;->b:I

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    iget-object v0, p0, Lm1/j1;->e:Ly1/c$a;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lm1/j1;->e:Ly1/c$a;

    invoke-virtual {v2, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    return v1
.end method

.method public d()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/j1;->d:Lne/x;

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lm1/j1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The buffer is submitted or canceled."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()Ljava/nio/ByteBuffer;
    .locals 1

    invoke-virtual {p0}, Lm1/j1;->f()V

    iget-object v0, p0, Lm1/j1;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method
