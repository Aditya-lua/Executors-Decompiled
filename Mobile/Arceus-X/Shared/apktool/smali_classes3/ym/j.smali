.class public final Lym/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0011\u0010\u000c\u001a\u00020\u0008*\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lxu/f;",
        "",
        "str",
        "d",
        "(Lxu/f;Ljava/lang/String;)Lxu/f;",
        "Lxu/g;",
        "b",
        "(Lxu/g;)Ljava/lang/String;",
        "Lxu/h;",
        "bytes",
        "c",
        "(Lxu/f;Lxu/h;)Lxu/f;",
        "a",
        "(Lxu/g;)Lxu/h;",
        "wf1-workflow-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lxu/g;)Lxu/h;
    .locals 2
    .param p0    # Lxu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lxu/g;->readInt()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, Lxu/g;->K1(J)Lxu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lxu/g;)Ljava/lang/String;
    .locals 1
    .param p0    # Lxu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lym/j;->a(Lxu/g;)Lxu/h;

    move-result-object p0

    invoke-virtual {p0}, Lxu/h;->P()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lxu/f;Lxu/h;)Lxu/f;
    .locals 1
    .param p0    # Lxu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result v0

    invoke-interface {p0, v0}, Lxu/f;->writeInt(I)Lxu/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lxu/f;->d0(Lxu/h;)Lxu/f;

    return-object p0
.end method

.method public static final d(Lxu/f;Ljava/lang/String;)Lxu/f;
    .locals 1
    .param p0    # Lxu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxu/h;->d:Lxu/h$a;

    invoke-virtual {v0, p1}, Lxu/h$a;->d(Ljava/lang/String;)Lxu/h;

    move-result-object p1

    invoke-static {p0, p1}, Lym/j;->c(Lxu/f;Lxu/h;)Lxu/f;

    move-result-object p0

    return-object p0
.end method
