.class public Ljg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljg/i;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljg/d;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljg/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljg/f;",
            ">;",
            "Ljg/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljg/c;->d(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ljg/c;->a:Ljava/lang/String;

    iput-object p2, p0, Ljg/c;->b:Ljg/d;

    return-void
.end method

.method public static synthetic b(Lof/d;)Ljg/i;
    .locals 2

    new-instance v0, Ljg/c;

    const-class v1, Ljg/f;

    invoke-interface {p0, v1}, Lof/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Ljg/d;->a()Ljg/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljg/c;-><init>(Ljava/util/Set;Ljg/d;)V

    return-object v0
.end method

.method public static c()Lof/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lof/c<",
            "Ljg/i;",
            ">;"
        }
    .end annotation

    const-class v0, Ljg/i;

    invoke-static {v0}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v0

    const-class v1, Ljg/f;

    invoke-static {v1}, Lof/r;->m(Ljava/lang/Class;)Lof/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    new-instance v1, Ljg/b;

    invoke-direct {v1}, Ljg/b;-><init>()V

    invoke-virtual {v0, v1}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljg/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljg/f;

    invoke-virtual {v1}, Ljg/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljg/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ljg/c;->b:Ljg/d;

    invoke-virtual {v0}, Ljg/d;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg/c;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljg/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljg/c;->b:Ljg/d;

    invoke-virtual {v1}, Ljg/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljg/c;->d(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
