.class public final Lgk/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "b",
        "()Z",
        "Lsh/g;",
        "",
        "logTag",
        "",
        "a",
        "(Lsh/g;Ljava/lang/String;)V",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lsh/g;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lsh/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "logTag"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->Q4()Z

    move-result p0

    const-string v0, "personasdk"

    if-eqz p0, :cond_0

    const-string p0, "Requesting Persona SDK module download immediately."

    invoke-static {p1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lsh/g;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "Deferring Persona SDK module download."

    invoke-static {p1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lsh/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static final b()Z
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Z0()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {}, Lgk/t;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lgk/t;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lsg/a1;->t0()Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    invoke-static {}, Lgk/t;->h()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lgk/t;->k()Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    return v1
.end method
