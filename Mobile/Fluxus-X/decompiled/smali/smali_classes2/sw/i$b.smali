.class public final Lsw/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lsw/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lsw/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lsw/d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw/i$b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lsw/i$b;->b:Lsw/d;

    return-void
.end method


# virtual methods
.method public L(Lsw/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/f<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lsw/i$b;->b:Lsw/d;

    new-instance v1, Lsw/i$b$a;

    invoke-direct {v1, p0, p1}, Lsw/i$b$a;-><init>(Lsw/i$b;Lsw/f;)V

    invoke-interface {v0, v1}, Lsw/d;->L(Lsw/f;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->cancel()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsw/i$b;->clone()Lsw/d;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lsw/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/d<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lsw/i$b;

    iget-object v1, p0, Lsw/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v2}, Lsw/d;->clone()Lsw/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lsw/i$b;-><init>(Ljava/util/concurrent/Executor;Lsw/d;)V

    return-object v0
.end method

.method public h()Lmv/f0;
    .locals 1

    iget-object v0, p0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->h()Lmv/f0;

    move-result-object v0

    return-object v0
.end method

.method public j()Lsw/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->j()Lsw/x;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Lsw/i$b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->m()Z

    move-result v0

    return v0
.end method
