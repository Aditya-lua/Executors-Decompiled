.class public Lf1/r0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/r0;->C0(Lf1/r0$j;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Lx2/a;

.field public final synthetic d:Lf1/r0$j;

.field public final synthetic e:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;Ly1/c$a;Lx2/a;Lf1/r0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/r0$e;->e:Lf1/r0;

    iput-object p2, p0, Lf1/r0$e;->b:Ly1/c$a;

    iput-object p3, p0, Lf1/r0$e;->c:Lx2/a;

    iput-object p4, p0, Lf1/r0$e;->d:Lf1/r0$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lf1/r0$e;->b:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lm1/i;)V
    .locals 3

    iget-object v0, p0, Lf1/r0$e;->e:Lf1/r0;

    iget-object v1, v0, Lf1/r0;->M:Lf1/r0$h;

    sget-object v2, Lf1/r0$h;->c:Lf1/r0$h;

    if-eq v1, v2, :cond_5

    iget-object v1, v0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lf1/r0;->u:Z

    const-string v2, "Recorder"

    if-nez v1, :cond_1

    iget-object v0, v0, Lf1/r0;->b0:Lw0/c;

    new-instance v1, Lm1/g;

    invoke-direct {v1, p1}, Lm1/g;-><init>(Lm1/i;)V

    invoke-interface {v0, v1}, Lw0/c;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lf1/r0$e;->e:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->a0:Lm1/i;

    if-eqz v0, :cond_0

    const-string v0, "Received audio data. Starting muxer..."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0$e;->e:Lf1/r0;

    iget-object v1, p0, Lf1/r0$e;->d:Lf1/r0$j;

    invoke-virtual {v0, v1}, Lf1/r0;->r0(Lf1/r0$j;)V

    goto :goto_0

    :cond_0
    const-string v0, "Cached audio data while we wait for video keyframe before starting muxer."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "Drop audio data since recording is stopping."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Lm1/i;->close()V

    return-void

    :cond_2
    :try_start_0
    iget-object v1, p0, Lf1/r0$e;->d:Lf1/r0$j;

    invoke-virtual {v0, p1, v1}, Lf1/r0;->F0(Lm1/i;Lf1/r0$j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lm1/i;->close()V

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_4

    :try_start_1
    invoke-interface {p1}, Lm1/i;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw v0

    :cond_5
    invoke-interface {p1}, Lm1/i;->close()V

    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Audio is not enabled but audio encoded data is being produced."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public c(Lm1/h;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$e;->e:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->c0:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf1/r0$e;->c:Lx2/a;

    invoke-interface {v0, p1}, Lx2/a;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f(Lm1/l1;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$e;->e:Lf1/r0;

    iput-object p1, v0, Lf1/r0;->L:Lm1/l1;

    return-void
.end method
