.class public final Lvo/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u0015\u0010\u000c\u001a\u00020\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lvo/f;",
        "Lvo/d3$e;",
        "side",
        "Lvo/d3$c;",
        "d",
        "(Lvo/f;Lvo/d3$e;)Lvo/d3$c;",
        "Lvo/d3;",
        "c",
        "(Lvo/f;)Lvo/d3;",
        "",
        "b",
        "(Lvo/f;)Ljava/lang/String;",
        "idClassKey",
        "Ldp/e;",
        "a",
        "(Lvo/f;)Ldp/e;",
        "idClass",
        "government-id_release"
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
.method public static final a(Lvo/f;)Ldp/e;
    .locals 1
    .param p0    # Lvo/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvo/f$a;

    if-eqz v0, :cond_0

    sget-object p0, Ldp/e;->B:Ldp/e;

    return-object p0

    :cond_0
    instance-of v0, p0, Lvo/f$b;

    if-eqz v0, :cond_1

    check-cast p0, Lvo/f$b;

    invoke-virtual {p0}, Lvo/f$b;->a()Lvo/d3;

    move-result-object p0

    invoke-virtual {p0}, Lvo/d3;->i()Ldp/e;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method

.method public static final b(Lvo/f;)Ljava/lang/String;
    .locals 1
    .param p0    # Lvo/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvo/f$a;

    if-eqz v0, :cond_0

    const-string p0, "auto-classification"

    return-object p0

    :cond_0
    instance-of v0, p0, Lvo/f$b;

    if-eqz v0, :cond_1

    check-cast p0, Lvo/f$b;

    invoke-virtual {p0}, Lvo/f$b;->a()Lvo/d3;

    move-result-object p0

    invoke-virtual {p0}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method

.method public static final c(Lvo/f;)Lvo/d3;
    .locals 1
    .param p0    # Lvo/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvo/f$a;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lvo/f$b;

    if-eqz v0, :cond_1

    check-cast p0, Lvo/f$b;

    invoke-virtual {p0}, Lvo/f$b;->a()Lvo/d3;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method

.method public static final d(Lvo/f;Lvo/d3$e;)Lvo/d3$c;
    .locals 1
    .param p0    # Lvo/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lvo/d3$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "side"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvo/f$a;

    if-eqz v0, :cond_0

    check-cast p0, Lvo/f$a;

    invoke-virtual {p0}, Lvo/f$a;->a()Lwo/a;

    move-result-object p0

    invoke-virtual {p0}, Lwo/a;->f()Lvo/d3$c;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lvo/f$b;

    if-eqz v0, :cond_1

    check-cast p0, Lvo/f$b;

    invoke-virtual {p0}, Lvo/f$b;->a()Lvo/d3;

    move-result-object p0

    invoke-virtual {p0, p1}, Lvo/d3;->g(Lvo/d3$e;)Lvo/d3$c;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method
