.class public Li1/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li1/n;->x(Lh1/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Lm1/h1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lh1/c;

.field public final synthetic b:Li1/n;


# direct methods
.method public constructor <init>(Li1/n;Lh1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Li1/n$b;->b:Li1/n;

    iput-object p2, p0, Li1/n$b;->a:Lh1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm1/h1;)V
    .locals 7

    iget-object v0, p0, Li1/n$b;->b:Li1/n;

    iget-boolean v1, v0, Li1/n;->i:Z

    if-eqz v1, :cond_5

    iget-object v1, v0, Li1/n;->l:Lh1/c;

    iget-object v2, p0, Li1/n$b;->a:Lh1/c;

    if-eq v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-boolean v1, v0, Li1/n;->o:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Li1/n;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li1/n$b;->b:Li1/n;

    invoke-virtual {v0}, Li1/n;->y()V

    :cond_1
    iget-object v0, p0, Li1/n$b;->b:Li1/n;

    invoke-virtual {v0}, Li1/n;->m()Li1/p;

    move-result-object v0

    invoke-interface {p1}, Lm1/h1;->t()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Li1/p;->read(Ljava/nio/ByteBuffer;)Li1/p$c;

    move-result-object v0

    invoke-virtual {v0}, Li1/p$c;->a()I

    move-result v2

    if-lez v2, :cond_4

    iget-object v2, p0, Li1/n$b;->b:Li1/n;

    iget-boolean v3, v2, Li1/n;->r:Z

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Li1/p$c;->a()I

    move-result v3

    invoke-virtual {v2, v1, v3}, Li1/n;->u(Ljava/nio/ByteBuffer;I)V

    :cond_2
    iget-object v2, p0, Li1/n$b;->b:Li1/n;

    iget-object v2, v2, Li1/n;->j:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Li1/p$c;->b()J

    move-result-wide v2

    iget-object v4, p0, Li1/n$b;->b:Li1/n;

    iget-wide v5, v4, Li1/n;->u:J

    sub-long/2addr v2, v5

    const-wide/16 v5, 0xc8

    cmp-long v2, v2, v5

    if-ltz v2, :cond_3

    invoke-virtual {v0}, Li1/p$c;->b()J

    move-result-wide v2

    iput-wide v2, v4, Li1/n;->u:J

    iget-object v2, p0, Li1/n$b;->b:Li1/n;

    invoke-virtual {v2, v1}, Li1/n;->v(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0}, Li1/p$c;->a()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Li1/p$c;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lm1/h1;->c(J)V

    invoke-interface {p1}, Lm1/h1;->b()Z

    goto :goto_0

    :cond_4
    const-string v0, "AudioSource"

    const-string v1, "Unable to read data from AudioStream."

    invoke-static {v0, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lm1/h1;->cancel()Z

    :goto_0
    iget-object p1, p0, Li1/n$b;->b:Li1/n;

    invoke-virtual {p1}, Li1/n;->z()V

    return-void

    :cond_5
    :goto_1
    invoke-interface {p1}, Lm1/h1;->cancel()Z

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Li1/n$b;->b:Li1/n;

    iget-object v0, v0, Li1/n;->l:Lh1/c;

    iget-object v1, p0, Li1/n$b;->a:Lh1/c;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "AudioSource"

    const-string v1, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/lang/IllegalStateException;

    if-nez v0, :cond_1

    iget-object v0, p0, Li1/n$b;->b:Li1/n;

    invoke-virtual {v0, p1}, Li1/n;->r(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm1/h1;

    invoke-virtual {p0, p1}, Li1/n$b;->a(Lm1/h1;)V

    return-void
.end method
