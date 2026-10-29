.class public final Ln0/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln0/a3<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Ln0/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/p1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/p1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/p1;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ln0/p1;->b:Ln0/p1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Ln0/p1;->a:Lne/x;

    return-void
.end method

.method public static synthetic a(Ln0/p1;Ln0/a3$a;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p0, p0, Ln0/p1;->a:Lne/x;

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Ln0/a3$a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-interface {p1, p0}, Ln0/a3$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static f(Ljava/lang/Object;)Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(TU;)",
            "Ln0/a3<",
            "TU;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Ln0/p1;->b:Ln0/p1;

    return-object p0

    :cond_0
    new-instance v0, Ln0/p1;

    invoke-direct {v0, p0}, Ln0/p1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public b()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ln0/p1;->a:Lne/x;

    return-object v0
.end method

.method public c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ln0/a3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/p1;->a:Lne/x;

    new-instance v1, Ln0/o1;

    invoke-direct {v1, p0, p2}, Ln0/o1;-><init>(Ln0/p1;Ln0/a3$a;)V

    invoke-interface {v0, v1, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d(Ln0/a3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/a3$a<",
            "-TT;>;)V"
        }
    .end annotation

    return-void
.end method
