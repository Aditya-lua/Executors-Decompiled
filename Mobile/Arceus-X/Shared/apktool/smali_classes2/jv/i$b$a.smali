.class public Ljv/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljv/i$b;->B(Ljv/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljv/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljv/f;

.field public final synthetic b:Ljv/i$b;


# direct methods
.method public constructor <init>(Ljv/i$b;Ljv/f;)V
    .locals 0

    iput-object p1, p0, Ljv/i$b$a;->b:Ljv/i$b;

    iput-object p2, p0, Ljv/i$b$a;->a:Ljv/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Ljv/i$b$a;Ljv/f;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p0, p0, Ljv/i$b$a;->b:Ljv/i$b;

    invoke-interface {p1, p0, p2}, Ljv/f;->b(Ljv/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Ljv/i$b$a;Ljv/f;Ljv/x;)V
    .locals 1

    iget-object v0, p0, Ljv/i$b$a;->b:Ljv/i$b;

    iget-object v0, v0, Ljv/i$b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ljv/i$b$a;->b:Ljv/i$b;

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Ljv/f;->b(Ljv/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p0, p0, Ljv/i$b$a;->b:Ljv/i$b;

    invoke-interface {p1, p0, p2}, Ljv/f;->a(Ljv/d;Ljv/x;)V

    return-void
.end method


# virtual methods
.method public a(Ljv/d;Ljv/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TT;>;",
            "Ljv/x<",
            "TT;>;)V"
        }
    .end annotation

    iget-object p1, p0, Ljv/i$b$a;->b:Ljv/i$b;

    iget-object p1, p1, Ljv/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Ljv/i$b$a;->a:Ljv/f;

    new-instance v1, Ljv/j;

    invoke-direct {v1, p0, v0, p2}, Ljv/j;-><init>(Ljv/i$b$a;Ljv/f;Ljv/x;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljv/d;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Ljv/i$b$a;->b:Ljv/i$b;

    iget-object p1, p1, Ljv/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Ljv/i$b$a;->a:Ljv/f;

    new-instance v1, Ljv/k;

    invoke-direct {v1, p0, v0, p2}, Ljv/k;-><init>(Ljv/i$b$a;Ljv/f;Ljava/lang/Throwable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
