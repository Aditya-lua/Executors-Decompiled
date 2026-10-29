.class public Lp1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lx2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/c<",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/n;Ljava/lang/Object;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp1/n;->a:Lx2/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lx2/c;->a:Ljava/lang/Object;

    check-cast v0, Ly1/c$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ly1/c$a;->d()Z

    :cond_0
    new-instance v0, Lx2/c;

    invoke-direct {v0, p2, p1}, Lx2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lp1/n;->a:Lx2/c;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "PendingValue "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Lt/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt/a<",
            "TT;",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/n;->a:Lx2/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lx2/c;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne/x;

    iget-object v0, p0, Lp1/n;->a:Lx2/c;

    iget-object v0, v0, Lx2/c;->a:Ljava/lang/Object;

    check-cast v0, Ly1/c$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lp1/n;->a:Lx2/c;

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    new-instance v0, Lp1/m;

    invoke-direct {v0, p0, p1}, Lp1/m;-><init>(Lp1/n;Ljava/lang/Object;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1
.end method
