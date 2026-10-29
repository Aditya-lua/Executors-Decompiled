.class public Lf1/r0$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/r0$k;->k(Lg0/v2;Ln0/a4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Lm1/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf1/z1;

.field public final synthetic b:Lf1/r0$k;


# direct methods
.method public constructor <init>(Lf1/r0$k;Lf1/z1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iput-object p2, p0, Lf1/r0$k$a;->a:Lf1/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lf1/r0$k$a;)V
    .locals 2

    iget-object v0, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {v0}, Lf1/r0$k;->b(Lf1/r0$k;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Retry setupVideo #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {v1}, Lf1/r0$k;->f(Lf1/r0$k;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {v0}, Lf1/r0$k;->c(Lf1/r0$k;)Lg0/v2;

    move-result-object v1

    iget-object p0, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {p0}, Lf1/r0$k;->d(Lf1/r0$k;)Ln0/a4;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lf1/r0$k;->e(Lf1/r0$k;Lg0/v2;Ln0/a4;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Lm1/l;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder is created. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object p1, p1, Lf1/r0$k;->g:Lf1/r0;

    iget-object p1, p1, Lf1/r0;->h0:Lf1/z1;

    iget-object v0, p0, Lf1/r0$k$a;->a:Lf1/z1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-static {p1}, Lx2/g;->i(Z)V

    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object p1, p1, Lf1/r0$k;->g:Lf1/r0;

    iget-object p1, p1, Lf1/r0;->I:Lm1/l;

    if-nez p1, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Lx2/g;->i(Z)V

    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object p1, p1, Lf1/r0$k;->g:Lf1/r0;

    iget-object v0, p0, Lf1/r0$k$a;->a:Lf1/z1;

    invoke-virtual {p1, v0}, Lf1/r0;->b0(Lf1/z1;)V

    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object p1, p1, Lf1/r0$k;->g:Lf1/r0;

    invoke-virtual {p1}, Lf1/r0;->U()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder Setup error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {v0}, Lf1/r0$k;->f(Lf1/r0$k;)I

    move-result v0

    iget-object v1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {v1}, Lf1/r0$k;->h(Lf1/r0$k;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    invoke-static {p1}, Lf1/r0$k;->g(Lf1/r0$k;)I

    iget-object p1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    new-instance v0, Lf1/c1;

    invoke-direct {v0, p0}, Lf1/c1;-><init>(Lf1/r0$k$a;)V

    iget-object v1, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object v1, v1, Lf1/r0$k;->g:Lf1/r0;

    iget-object v1, v1, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    sget-wide v2, Lf1/r0;->A0:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, v3, v4}, Lf1/r0;->C(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-static {p1, v0}, Lf1/r0$k;->i(Lf1/r0$k;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_0
    iget-object v0, p0, Lf1/r0$k$a;->b:Lf1/r0$k;

    iget-object v0, v0, Lf1/r0$k;->g:Lf1/r0;

    invoke-virtual {v0, p1}, Lf1/r0;->V(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm1/l;

    invoke-virtual {p0, p1}, Lf1/r0$k$a;->b(Lm1/l;)V

    return-void
.end method
