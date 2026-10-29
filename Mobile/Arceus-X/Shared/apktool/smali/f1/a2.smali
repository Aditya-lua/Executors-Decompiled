.class public interface abstract Lf1/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/a2$a;
    }
.end annotation


# virtual methods
.method public abstract a(Lg0/v2;)V
.end method

.method public b(Lg0/v2;Ln0/a4;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lf1/a2;->a(Lg0/v2;)V

    return-void
.end method

.method public c()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Lf1/s;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ln0/p1;->f(Ljava/lang/Object;)Ln0/a3;

    move-result-object v0

    return-object v0
.end method

.method public d(Lf1/a2$a;)V
    .locals 0

    return-void
.end method

.method public e()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Lf1/g1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lf1/g1;->c:Ln0/a3;

    return-object v0
.end method

.method public f(Lg0/t;I)Lf1/h1;
    .locals 0

    sget-object p1, Lf1/h1;->a:Lf1/h1;

    return-object p1
.end method

.method public g()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Ln0/p1;->f(Ljava/lang/Object;)Ln0/a3;

    move-result-object v0

    return-object v0
.end method
