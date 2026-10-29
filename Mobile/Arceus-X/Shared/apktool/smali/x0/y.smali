.class public Lx0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lg0/l1;

.field public final c:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg0/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lg0/n;->g()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->a(Z)V

    invoke-virtual {p1}, Lg0/n;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lx0/y;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lg0/n;->d()Lg0/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lg0/l1;

    iput-object v0, p0, Lx0/y;->b:Lg0/l1;

    invoke-virtual {p1}, Lg0/n;->b()Lx2/a;

    move-result-object p1

    iput-object p1, p0, Lx0/y;->c:Lx2/a;

    return-void
.end method

.method public static synthetic a(Lx0/y;Lg0/l1$a;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx0/y;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lx0/x;

    invoke-direct {v1, p0, p1, p2}, Lx0/x;-><init>(Lx0/y;Lg0/l1$a;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "InternalImageProcessor#process "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx0/y;Lg0/l1$a;Ly1/c$a;)V
    .locals 0

    iget-object p0, p0, Lx0/y;->b:Lg0/l1;

    invoke-interface {p0, p1}, Lg0/l1;->a(Lg0/l1$a;)Lg0/l1$b;

    move-result-object p0

    invoke-virtual {p2, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public c(Lg0/l1$a;)Lg0/l1$b;
    .locals 3

    :try_start_0
    new-instance v0, Lx0/w;

    invoke-direct {v0, p0, p1}, Lx0/w;-><init>(Lx0/y;Lg0/l1$a;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/l1$b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    new-instance v0, Lg0/h1;

    const/4 v1, 0x0

    const-string v2, "Failed to invoke ImageProcessor."

    invoke-direct {v0, v1, v2, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
