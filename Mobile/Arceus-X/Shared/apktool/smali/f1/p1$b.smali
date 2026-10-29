.class public Lf1/p1$b;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/p1;->d1(Ln0/o3$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Ly1/c$a;

.field public final synthetic d:Ln0/o3$b;

.field public final synthetic e:Lf1/p1;


# direct methods
.method public constructor <init>(Lf1/p1;Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Ln0/o3$b;)V
    .locals 0

    iput-object p1, p0, Lf1/p1$b;->e:Lf1/p1;

    iput-object p2, p0, Lf1/p1$b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lf1/p1$b;->c:Ly1/c$a;

    iput-object p4, p0, Lf1/p1$b;->d:Ln0/o3$b;

    invoke-direct {p0}, Ln0/u;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf1/p1$b;->a:Z

    return-void
.end method

.method public static synthetic e(Lf1/p1$b;Ln0/o3$b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p0}, Ln0/o3$b;->t(Ln0/u;)Z

    return-void
.end method


# virtual methods
.method public b(ILn0/e0;)V
    .locals 2

    invoke-super {p0, p1, p2}, Ln0/u;->b(ILn0/e0;)V

    iget-boolean p1, p0, Lf1/p1$b;->a:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf1/p1$b;->a:Z

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "cameraCaptureResult timestampNs = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ln0/e0;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", current system uptimeMs = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", current system realtimeMs = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "VideoCapture"

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lf1/p1$b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p2}, Ln0/e0;->c()Ln0/z3;

    move-result-object p1

    const-string p2, "androidx.camera.video.VideoCapture.streamUpdate"

    invoke-virtual {p1, p2}, Ln0/z3;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Lf1/p1$b;->c:Ly1/c$a;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lf1/p1$b;->c:Ly1/c$a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf1/p1$b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    iget-object p2, p0, Lf1/p1$b;->d:Ln0/o3$b;

    new-instance v0, Lf1/q1;

    invoke-direct {v0, p0, p2}, Lf1/q1;-><init>(Lf1/p1$b;Ln0/o3$b;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
