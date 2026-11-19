.class public Lr7/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ls7/c;Lg7/i;)Lj7/i;
    .locals 7

    invoke-virtual {p0}, Ls7/c;->p()Ls7/c$b;

    move-result-object v0

    sget-object v1, Ls7/c$b;->c:Ls7/c$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lt7/m;->e()F

    move-result v3

    sget-object v4, Lr7/a0;->a:Lr7/a0;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lr7/t;->c(Ls7/c;Lg7/i;FLr7/n0;ZZ)Lu7/a;

    move-result-object p0

    new-instance p1, Lj7/i;

    invoke-direct {p1, v2, p0}, Lj7/i;-><init>(Lg7/i;Lu7/a;)V

    return-object p1
.end method
