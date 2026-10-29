.class public final Lf1/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/z1$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lm1/o;

.field public d:Lm1/l;

.field public e:Landroid/view/Surface;

.field public f:Lg0/v2;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Lm1/l$c$a;

.field public i:Lf1/z1$b;

.field public j:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Lm1/l;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Lm1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm1/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/z1;->d:Lm1/l;

    iput-object v0, p0, Lf1/z1;->e:Landroid/view/Surface;

    iput-object v0, p0, Lf1/z1;->f:Lg0/v2;

    iput-object v0, p0, Lf1/z1;->g:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lf1/z1;->h:Lm1/l$c$a;

    sget-object v1, Lf1/z1$b;->a:Lf1/z1$b;

    iput-object v1, p0, Lf1/z1;->i:Lf1/z1$b;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot close the encoder before configuring."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object v1

    iput-object v1, p0, Lf1/z1;->j:Lne/x;

    iput-object v0, p0, Lf1/z1;->k:Ly1/c$a;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object v1

    iput-object v1, p0, Lf1/z1;->l:Lne/x;

    iput-object v0, p0, Lf1/z1;->m:Ly1/c$a;

    iput-object p3, p0, Lf1/z1;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lf1/z1;->b:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lf1/z1;->c:Lm1/o;

    return-void
.end method

.method public static synthetic a(Lf1/z1;Lg0/v2$g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf1/z1;->o(Lg0/v2$g;)V

    return-void
.end method

.method public static synthetic b(Lf1/z1;Landroid/view/Surface;)V
    .locals 0

    iget-object p0, p0, Lf1/z1;->h:Lm1/l$c$a;

    invoke-interface {p0, p1}, Lm1/l$c$a;->a(Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic c(Lf1/z1;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf1/z1;->k:Ly1/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ReleasedFuture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf1/z1;)V
    .locals 1

    iget-object p0, p0, Lf1/z1;->k:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic e(Lf1/z1;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf1/z1;->m:Ly1/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ReadyToReleaseFuture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lf1/z1;Lg0/v2;Lm1/p1;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lf1/z1;->j(Lg0/v2;Lm1/p1;Ly1/c$a;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ConfigureVideoEncoderFuture "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lf1/z1;Ly1/c$a;Lg0/v2;Landroid/view/Surface;)V
    .locals 4

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "VideoEncoderSession"

    if-eqz v0, :cond_5

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    const/4 p2, 0x2

    if-eq v0, p2, :cond_5

    const/4 p2, 0x3

    if-eq v0, p2, :cond_1

    const/4 p2, 0x4

    if-ne v0, p2, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "State "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not handled"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lf1/z1;->h:Lm1/l$c$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lf1/z1;->g:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_2

    new-instance p2, Lf1/t1;

    invoke-direct {p2, p0, p3}, Lf1/t1;-><init>(Lf1/z1;Landroid/view/Surface;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Surface is updated in READY state: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p2}, Lg0/v2;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Not provide surface, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "EMPTY"

    invoke-static {p2, v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is already serviced."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lf1/z1;->h()V

    return-void

    :cond_4
    iput-object p3, p0, Lf1/z1;->e:Landroid/view/Surface;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "provide surface: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/z1;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lf1/s1;

    invoke-direct {v1, p0}, Lf1/s1;-><init>(Lf1/z1;)V

    invoke-virtual {p2, p3, v0, v1}, Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V

    sget-object p2, Lf1/z1$b;->d:Lf1/z1$b;

    iput-object p2, p0, Lf1/z1;->i:Lf1/z1$b;

    iget-object p0, p0, Lf1/z1;->d:Lm1/l;

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :cond_5
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Not provide surface in "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 3

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const-string v2, "VideoEncoderSession"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string v0, "closeInternal in RELEASED state, No-op"

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "closeInternal in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " state"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lf1/z1$b;->c:Lf1/z1$b;

    iput-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    return-void

    :cond_2
    invoke-virtual {p0}, Lf1/z1;->r()V

    return-void
.end method

.method public i(Lg0/v2;Lm1/p1;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/v2;",
            "Lm1/p1;",
            ")",
            "Lne/x<",
            "Lm1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "configure() shouldn\'t be called in "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lf1/z1$b;->b:Lf1/z1$b;

    iput-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    iput-object p1, p0, Lf1/z1;->f:Lg0/v2;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Create VideoEncoderSession: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoEncoderSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lf1/v1;

    invoke-direct {v0, p0}, Lf1/v1;-><init>(Lf1/z1;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lf1/z1;->j:Lne/x;

    new-instance v0, Lf1/w1;

    invoke-direct {v0, p0}, Lf1/w1;-><init>(Lf1/z1;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lf1/z1;->l:Lne/x;

    new-instance v0, Lf1/x1;

    invoke-direct {v0, p0, p1, p2}, Lf1/x1;-><init>(Lf1/z1;Lg0/v2;Lm1/p1;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    new-instance p2, Lf1/z1$a;

    invoke-direct {p2, p0}, Lf1/z1$a;-><init>(Lf1/z1;)V

    iget-object v0, p0, Lf1/z1;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lg0/v2;Lm1/p1;Ly1/c$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/v2;",
            "Lm1/p1;",
            "Ly1/c$a<",
            "Lm1/l;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lf1/z1;->c:Lm1/o;

    iget-object v1, p0, Lf1/z1;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lg0/v2;->r()I

    move-result v2

    invoke-interface {v0, v1, p2, v2}, Lm1/o;->a(Ljava/util/concurrent/Executor;Lm1/n;I)Lm1/l;

    move-result-object p2

    iput-object p2, p0, Lf1/z1;->d:Lm1/l;
    :try_end_0
    .catch Lm1/k1; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p2}, Lm1/l;->b()Lm1/l$b;

    move-result-object p2

    instance-of v0, p2, Lm1/l$c;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "The EncoderInput of video isn\'t a SurfaceInput."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    check-cast p2, Lm1/l$c;

    iget-object v0, p0, Lf1/z1;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lf1/y1;

    invoke-direct {v1, p0, p3, p1}, Lf1/y1;-><init>(Lf1/z1;Ly1/c$a;Lg0/v2;)V

    invoke-interface {p2, v0, v1}, Lm1/l$c;->a(Ljava/util/concurrent/Executor;Lm1/l$c$a;)V

    return-void

    :catch_0
    move-exception p1

    const-string p2, "VideoEncoderSession"

    const-string v0, "Unable to initialize video encoder."

    invoke-static {p2, v0, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p3, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public k()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    sget-object v1, Lf1/z1$b;->d:Lf1/z1$b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lf1/z1;->e:Landroid/view/Surface;

    return-object v0
.end method

.method public l()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Lm1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/z1;->l:Lne/x;

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public m()Lm1/l;
    .locals 1

    iget-object v0, p0, Lf1/z1;->d:Lm1/l;

    return-object v0
.end method

.method public n(Lg0/v2;)Z
    .locals 4

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "State "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not handled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lf1/z1;->f:Lg0/v2;

    if-ne v0, p1, :cond_2

    return v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final o(Lg0/v2$g;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Surface can be closed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lg0/v2$g;->b()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoEncoderSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg0/v2$g;->b()Landroid/view/Surface;

    move-result-object p1

    iget-object v0, p0, Lf1/z1;->e:Landroid/view/Surface;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/z1;->e:Landroid/view/Surface;

    iget-object p1, p0, Lf1/z1;->m:Ly1/c$a;

    iget-object v0, p0, Lf1/z1;->d:Lm1/l;

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lf1/z1;->h()V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    return-void
.end method

.method public p(Ljava/util/concurrent/Executor;Lm1/l$c$a;)V
    .locals 0

    iput-object p1, p0, Lf1/z1;->g:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lf1/z1;->h:Lm1/l$c$a;

    return-void
.end method

.method public q()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/z1;->h()V

    iget-object v0, p0, Lf1/z1;->j:Lne/x;

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public r()V
    .locals 4

    iget-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    const-string v2, "VideoEncoderSession"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "terminateNow in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", No-op"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf1/z1;->i:Lf1/z1$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lf1/z1$b;->e:Lf1/z1$b;

    iput-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    iget-object v0, p0, Lf1/z1;->m:Ly1/c$a;

    iget-object v1, p0, Lf1/z1;->d:Lm1/l;

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/z1;->f:Lg0/v2;

    iget-object v1, p0, Lf1/z1;->d:Lm1/l;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VideoEncoder is releasing: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf1/z1;->d:Lm1/l;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/z1;->d:Lm1/l;

    invoke-interface {v1}, Lm1/l;->a()V

    iget-object v1, p0, Lf1/z1;->d:Lm1/l;

    invoke-interface {v1}, Lm1/l;->f()Lne/x;

    move-result-object v1

    new-instance v2, Lf1/u1;

    invoke-direct {v2, p0}, Lf1/u1;-><init>(Lf1/z1;)V

    iget-object v3, p0, Lf1/z1;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lf1/z1;->d:Lm1/l;

    return-void

    :cond_2
    const-string v1, "There\'s no VideoEncoder to release! Finish release completer."

    invoke-static {v2, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/z1;->k:Ly1/c$a;

    invoke-virtual {v1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :cond_3
    sget-object v0, Lf1/z1$b;->e:Lf1/z1$b;

    iput-object v0, p0, Lf1/z1;->i:Lf1/z1$b;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoderSession@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/z1;->f:Lg0/v2;

    const-string v2, "SURFACE_REQUEST_NOT_CONFIGURED"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
