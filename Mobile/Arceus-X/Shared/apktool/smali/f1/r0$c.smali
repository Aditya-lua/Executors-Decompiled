.class public Lf1/r0$c;
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

.field public final synthetic c:Lf1/r0$j;

.field public final synthetic d:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;Ly1/c$a;Lf1/r0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/r0$c;->d:Lf1/r0;

    iput-object p2, p0, Lf1/r0$c;->b:Ly1/c$a;

    iput-object p3, p0, Lf1/r0$c;->c:Lf1/r0$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lf1/r0$c;->b:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lm1/i;)V
    .locals 3

    iget-object v0, p0, Lf1/r0$c;->d:Lf1/r0;

    iget-object v1, v0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    if-nez v1, :cond_7

    iget-boolean v1, v0, Lf1/r0;->u:Z

    const-string v2, "Recorder"

    if-nez v1, :cond_6

    iget-object v0, v0, Lf1/r0;->a0:Lm1/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm1/i;->close()V

    iget-object v0, p0, Lf1/r0$c;->d:Lf1/r0;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/r0;->a0:Lm1/i;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Lm1/i;->w0()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lf1/r0$c;->d:Lf1/r0;

    iput-object p1, v1, Lf1/r0;->a0:Lm1/i;

    invoke-virtual {v1}, Lf1/r0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lf1/r0$c;->d:Lf1/r0;

    iget-object p1, p1, Lf1/r0;->b0:Lw0/c;

    invoke-interface {p1}, Lw0/c;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    const-string p1, "Replaced cached video keyframe with newer keyframe."

    invoke-static {v2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "Cached video keyframe while we wait for first audio sample before starting muxer."

    invoke-static {v2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_1
    const-string p1, "Received video keyframe. Starting muxer..."

    invoke-static {v2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lf1/r0$c;->d:Lf1/r0;

    iget-object v0, p0, Lf1/r0$c;->c:Lf1/r0$j;

    invoke-virtual {p1, v0}, Lf1/r0;->r0(Lf1/r0$j;)V

    return-void

    :cond_4
    if-eqz v0, :cond_5

    const-string v0, "Dropped cached keyframe since we have new video data and have not yet received audio data."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const-string v0, "Dropped video data since muxer has not yet started and data is not a keyframe."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0$c;->d:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->I:Lm1/l;

    invoke-interface {v0}, Lm1/l;->g()V

    invoke-interface {p1}, Lm1/i;->close()V

    return-void

    :cond_6
    const-string v0, "Drop video data since recording is stopping."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lm1/i;->close()V

    return-void

    :cond_7
    :try_start_0
    iget-object v1, p0, Lf1/r0$c;->c:Lf1/r0$j;

    invoke-virtual {v0, p1, v1}, Lf1/r0;->G0(Lm1/i;Lf1/r0$j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lm1/i;->close()V

    :cond_8
    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_9

    :try_start_1
    invoke-interface {p1}, Lm1/i;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_2
    throw v0
.end method

.method public c(Lm1/h;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$c;->b:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f(Lm1/l1;)V
    .locals 1

    iget-object v0, p0, Lf1/r0$c;->d:Lf1/r0;

    iput-object p1, v0, Lf1/r0;->J:Lm1/l1;

    return-void
.end method
