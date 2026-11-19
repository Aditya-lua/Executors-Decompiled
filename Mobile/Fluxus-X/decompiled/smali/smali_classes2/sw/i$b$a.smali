.class public Lsw/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw/i$b;->L(Lsw/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lsw/f;

.field public final synthetic b:Lsw/i$b;


# direct methods
.method public constructor <init>(Lsw/i$b;Lsw/f;)V
    .locals 0

    iput-object p1, p0, Lsw/i$b$a;->b:Lsw/i$b;

    iput-object p2, p0, Lsw/i$b$a;->a:Lsw/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lsw/i$b$a;Lsw/f;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p0, p0, Lsw/i$b$a;->b:Lsw/i$b;

    invoke-interface {p1, p0, p2}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Lsw/i$b$a;Lsw/f;Lsw/x;)V
    .locals 1

    iget-object v0, p0, Lsw/i$b$a;->b:Lsw/i$b;

    iget-object v0, v0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lsw/i$b$a;->b:Lsw/i$b;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p0, p0, Lsw/i$b$a;->b:Lsw/i$b;

    invoke-interface {p1, p0, p2}, Lsw/f;->b(Lsw/d;Lsw/x;)V

    return-void
.end method


# virtual methods
.method public a(Lsw/d;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lsw/i$b$a;->b:Lsw/i$b;

    iget-object p1, p1, Lsw/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lsw/i$b$a;->a:Lsw/f;

    new-instance v1, Lsw/k;

    invoke-direct {v1, p0, v0, p2}, Lsw/k;-><init>(Lsw/i$b$a;Lsw/f;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lsw/d;Lsw/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TT;>;",
            "Lsw/x<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, Lsw/i$b$a;->b:Lsw/i$b;

    iget-object p1, p1, Lsw/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lsw/i$b$a;->a:Lsw/f;

    new-instance v1, Lsw/j;

    invoke-direct {v1, p0, v0, p2}, Lsw/j;-><init>(Lsw/i$b$a;Lsw/f;Lsw/x;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
