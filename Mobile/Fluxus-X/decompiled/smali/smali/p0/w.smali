.class public Lp0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La1/c;La1/c;)La1/c;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    return-object p1

    :cond_1
    invoke-static {p0}, La1/c$a;->b(La1/c;)La1/c$a;

    move-result-object p0

    invoke-virtual {p1}, La1/c;->b()La1/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, La1/c;->b()La1/a;

    move-result-object v0

    invoke-virtual {p0, v0}, La1/c$a;->d(La1/a;)La1/c$a;

    :cond_2
    invoke-virtual {p1}, La1/c;->d()La1/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, La1/c;->d()La1/d;

    move-result-object v0

    invoke-virtual {p0, v0}, La1/c$a;->f(La1/d;)La1/c$a;

    :cond_3
    invoke-virtual {p1}, La1/c;->c()La1/b;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, La1/c;->c()La1/b;

    move-result-object v0

    invoke-virtual {p0, v0}, La1/c$a;->e(La1/b;)La1/c$a;

    :cond_4
    invoke-virtual {p1}, La1/c;->a()I

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, La1/c;->a()I

    move-result p1

    invoke-virtual {p0, p1}, La1/c$a;->c(I)La1/c$a;

    :cond_5
    invoke-virtual {p0}, La1/c$a;->a()La1/c;

    move-result-object p0

    return-object p0
.end method
