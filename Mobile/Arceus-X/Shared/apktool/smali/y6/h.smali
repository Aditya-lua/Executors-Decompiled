.class public final Ly6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "",
        "width",
        "height",
        "Ly6/g;",
        "a",
        "(II)Ly6/g;",
        "",
        "b",
        "(Ly6/g;)Z",
        "isOriginal",
        "coil-core_release"
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
.method public static final a(II)Ly6/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ly6/g;

    invoke-static {p0}, Ly6/b;->a(I)I

    move-result p0

    invoke-static {p0}, Ly6/a$a;->a(I)Ly6/a$a;

    move-result-object p0

    invoke-static {p1}, Ly6/b;->a(I)I

    move-result p1

    invoke-static {p1}, Ly6/a$a;->a(I)Ly6/a$a;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ly6/g;-><init>(Ly6/a;Ly6/a;)V

    return-object v0
.end method

.method public static final b(Ly6/g;)Z
    .locals 1
    .param p0    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Ly6/g;->d:Ly6/g;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
