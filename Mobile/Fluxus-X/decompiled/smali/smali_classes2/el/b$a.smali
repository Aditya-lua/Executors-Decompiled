.class public Lel/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lsw/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public final synthetic c:Lel/b;


# direct methods
.method public constructor <init>(Lel/b;Lsw/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/f<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lel/b$a;-><init>(Lel/b;Lsw/f;Z)V

    return-void
.end method

.method public constructor <init>(Lel/b;Lsw/f;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/f<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lel/b$a;->c:Lel/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lel/b$a;->a:Lsw/f;

    .line 4
    iput-boolean p3, p0, Lel/b$a;->b:Z

    return-void
.end method

.method public static bridge synthetic c(Lel/b$a;)Lsw/f;
    .locals 0

    iget-object p0, p0, Lel/b$a;->a:Lsw/f;

    return-object p0
.end method


# virtual methods
.method public a(Lsw/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lel/b$a;->c:Lel/b;

    iget-object p1, p1, Lel/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lel/b$a$b;

    invoke-direct {v0, p0, p2}, Lel/b$a$b;-><init>(Lel/b$a;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lsw/d;Lsw/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TT;>;",
            "Lsw/x<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lsw/x;->b()I

    move-result p1

    const/16 v0, 0x193

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Lsw/x;->f()Lmv/y;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0}, Lmv/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lel/b$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lel/b$a;->c:Lel/b;

    iget-object p1, p1, Lel/b;->b:Lsw/d;

    invoke-interface {p1}, Lsw/d;->clone()Lsw/d;

    move-result-object p1

    new-instance p2, Lel/b$a;

    iget-object v0, p0, Lel/b$a;->c:Lel/b;

    iget-object v1, p0, Lel/b$a;->a:Lsw/f;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v2}, Lel/b$a;-><init>(Lel/b;Lsw/f;Z)V

    invoke-interface {p1, p2}, Lsw/d;->L(Lsw/f;)V

    return-void

    :cond_0
    iget-object p1, p0, Lel/b$a;->c:Lel/b;

    iget-object p1, p1, Lel/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lel/b$a$a;

    invoke-direct {v0, p0, p2}, Lel/b$a$a;-><init>(Lel/b$a;Lsw/x;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
