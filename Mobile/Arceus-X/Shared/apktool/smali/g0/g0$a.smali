.class public final Lg0/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ln0/x2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    invoke-direct {p0, v0}, Lg0/g0$a;-><init>(Ln0/x2;)V

    return-void
.end method

.method public constructor <init>(Ln0/x2;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg0/g0$a;->a:Ln0/x2;

    .line 4
    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 6
    const-class v0, Lg0/f0;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lg0/g0$a;->g(Ljava/lang/Class;)Lg0/g0$a;

    return-void
.end method


# virtual methods
.method public a()Lg0/g0;
    .locals 2

    new-instance v0, Lg0/g0;

    iget-object v1, p0, Lg0/g0$a;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Lg0/g0;-><init>(Ln0/c3;)V

    return-object v0
.end method

.method public b()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lg0/g0$a;->a:Ln0/x2;

    return-object v0
.end method

.method public c(Ln0/n0$a;)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg0/g0;->Q:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public d(I)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg0/g0;->a0:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public e(Ln0/m0$a;)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg0/g0;->R:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public f(Z)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg0/g0;->b0:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(Ljava/lang/Class;)Lg0/g0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lg0/f0;",
            ">;)",
            "Lg0/g0$a;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->N:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/g0$a;->h(Ljava/lang/String;)Lg0/g0$a;

    :cond_0
    return-object p0
.end method

.method public h(Ljava/lang/String;)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(Ln0/j4$c;)Lg0/g0$a;
    .locals 2

    invoke-virtual {p0}, Lg0/g0$a;->b()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg0/g0;->S:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
