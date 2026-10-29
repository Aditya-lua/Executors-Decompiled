.class public Lq7/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lr7/c;Lf7/i;)Li7/i;
    .locals 7

    invoke-virtual {p0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v0

    sget-object v1, Lr7/c$b;->c:Lr7/c$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Ls7/m;->e()F

    move-result v3

    sget-object v4, Lq7/a0;->a:Lq7/a0;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lq7/t;->c(Lr7/c;Lf7/i;FLq7/n0;ZZ)Lt7/a;

    move-result-object p0

    new-instance p1, Li7/i;

    invoke-direct {p1, v2, p0}, Li7/i;-><init>(Lf7/i;Lt7/a;)V

    return-object p1
.end method
