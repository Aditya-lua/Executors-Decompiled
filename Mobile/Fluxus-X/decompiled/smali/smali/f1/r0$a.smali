.class public Lf1/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/r0;->b0(Lf1/z1;)V
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

.field public final synthetic b:Lf1/r0;


# direct methods
.method public constructor <init>(Lf1/r0;Lf1/z1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/r0$a;->b:Lf1/r0;

    iput-object p2, p0, Lf1/r0$a;->a:Lf1/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm1/l;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder can be released: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf1/r0$a;->b:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->f0:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1/r0$a;->b:Lf1/r0;

    iget-object v0, v0, Lf1/r0;->I:Lm1/l;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_1

    invoke-static {v0}, Lf1/r0;->T(Lm1/l;)V

    :cond_1
    iget-object p1, p0, Lf1/r0$a;->b:Lf1/r0;

    iget-object v0, p0, Lf1/r0$a;->a:Lf1/z1;

    iput-object v0, p1, Lf1/r0;->j0:Lf1/z1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf1/r0;->o0(Landroid/view/Surface;)V

    iget-object p1, p0, Lf1/r0$a;->b:Lf1/r0;

    const/4 v1, 0x4

    invoke-virtual {p1}, Lf1/r0;->Q()Z

    move-result v2

    invoke-virtual {p1, v1, v0, v2}, Lf1/r0;->g0(ILjava/lang/Throwable;Z)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error in ReadyToReleaseFuture: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Recorder"

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm1/l;

    invoke-virtual {p0, p1}, Lf1/r0$a;->a(Lm1/l;)V

    return-void
.end method
