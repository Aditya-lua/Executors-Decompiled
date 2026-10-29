.class public Lxk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljv/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Ljv/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public final synthetic c:Lxk/b;


# direct methods
.method public constructor <init>(Lxk/b;Ljv/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/f<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lxk/b$a;-><init>(Lxk/b;Ljv/f;Z)V

    return-void
.end method

.method public constructor <init>(Lxk/b;Ljv/f;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/f<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lxk/b$a;->c:Lxk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lxk/b$a;->a:Ljv/f;

    .line 4
    iput-boolean p3, p0, Lxk/b$a;->b:Z

    return-void
.end method

.method public static bridge synthetic c(Lxk/b$a;)Ljv/f;
    .locals 0

    iget-object p0, p0, Lxk/b$a;->a:Ljv/f;

    return-object p0
.end method


# virtual methods
.method public a(Ljv/d;Ljv/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TT;>;",
            "Ljv/x<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljv/x;->b()I

    move-result p1

    const/16 v0, 0x193

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lxk/b$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lxk/b$a;->c:Lxk/b;

    iget-object p1, p1, Lxk/b;->b:Ljv/d;

    invoke-interface {p1}, Ljv/d;->clone()Ljv/d;

    move-result-object p1

    new-instance p2, Lxk/b$a;

    iget-object v0, p0, Lxk/b$a;->c:Lxk/b;

    iget-object v1, p0, Lxk/b$a;->a:Ljv/f;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v2}, Lxk/b$a;-><init>(Lxk/b;Ljv/f;Z)V

    invoke-interface {p1, p2}, Ljv/d;->B(Ljv/f;)V

    return-void

    :cond_0
    iget-object p1, p0, Lxk/b$a;->c:Lxk/b;

    iget-object p1, p1, Lxk/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lxk/b$a$a;

    invoke-direct {v0, p0, p2}, Lxk/b$a$a;-><init>(Lxk/b$a;Ljv/x;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljv/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lxk/b$a;->c:Lxk/b;

    iget-object p1, p1, Lxk/b;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lxk/b$a$b;

    invoke-direct {v0, p0, p2}, Lxk/b$a$b;-><init>(Lxk/b$a;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
