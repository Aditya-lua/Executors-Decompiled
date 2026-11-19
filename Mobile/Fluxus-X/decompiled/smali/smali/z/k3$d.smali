.class public final Lz/k3$d;
.super Lz/h5$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/k3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lz/k3;


# direct methods
.method public constructor <init>(Lz/k3;)V
    .locals 0

    iput-object p1, p0, Lz/k3$d;->a:Lz/k3;

    invoke-direct {p0}, Lz/h5$c;-><init>()V

    return-void
.end method


# virtual methods
.method public s(Lz/h5;)V
    .locals 3

    iget-object p1, p0, Lz/k3$d;->a:Lz/k3;

    iget-object p1, p1, Lz/k3;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v0, v0, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    invoke-virtual {v0}, Lz/k3;->s()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :pswitch_1
    const-string v0, "CaptureSession"

    const-string v1, "ConfigureFailed callback after change to RELEASED state"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v0, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onConfigureFailed() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConfigureFailed() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public t(Lz/h5;)V
    .locals 3

    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v0, v0, Lz/k3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v1, v1, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v1, p0, Lz/k3$d;->a:Lz/k3;

    sget-object v2, Lz/k3$c;->h:Lz/k3$c;

    invoke-static {v1, v2}, Lz/k3;->o(Lz/k3;Lz/k3$c;)V

    iget-object v1, p0, Lz/k3$d;->a:Lz/k3;

    iput-object p1, v1, Lz/k3;->e:Lz/h5;

    const-string p1, "CaptureSession"

    const-string v1, "Attempting to send capture request onConfigured"

    invoke-static {p1, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v1, p1, Lz/k3;->f:Ln0/o3;

    invoke-virtual {p1, v1}, Lz/k3;->y(Ln0/o3;)I

    iget-object p1, p0, Lz/k3$d;->a:Lz/k3;

    invoke-virtual {p1}, Lz/k3;->x()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lz/k3$d;->a:Lz/k3;

    iput-object p1, v1, Lz/k3;->e:Lz/h5;

    goto :goto_0

    :pswitch_2
    invoke-interface {p1}, Lz/h5;->close()V

    :goto_0
    const-string p1, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onConfigured() mState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConfigured() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public u(Lz/h5;)V
    .locals 3

    iget-object p1, p0, Lz/k3$d;->a:Lz/k3;

    iget-object p1, p1, Lz/k3;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v0, v0, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CaptureSession"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureSession.onReady() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReady() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public v(Lz/h5;)V
    .locals 3

    iget-object p1, p0, Lz/k3$d;->a:Lz/k3;

    iget-object p1, p1, Lz/k3;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v0, v0, Lz/k3;->j:Lz/k3$c;

    sget-object v1, Lz/k3$c;->a:Lz/k3$c;

    if-eq v0, v1, :cond_0

    const-string v0, "CaptureSession"

    const-string v1, "onSessionFinished()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/k3$d;->a:Lz/k3;

    invoke-virtual {v0}, Lz/k3;->s()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSessionFinished() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/k3$d;->a:Lz/k3;

    iget-object v2, v2, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
