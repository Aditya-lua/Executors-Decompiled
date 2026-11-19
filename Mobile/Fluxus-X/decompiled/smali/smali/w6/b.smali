.class public final Lw6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lu6/m$a;",
        "d",
        "()Lu6/m$a;",
        "Lmv/e$a;",
        "Lu6/i;",
        "c",
        "(Lmv/e$a;)Lu6/i;",
        "coil-network-okhttp"
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
.method public static synthetic a()Lu6/i;
    .locals 1

    invoke-static {}, Lw6/b;->b()Lu6/i;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lu6/i;
    .locals 1

    new-instance v0, Lmv/d0;

    invoke-direct {v0}, Lmv/d0;-><init>()V

    invoke-static {v0}, Lw6/b;->c(Lmv/e$a;)Lu6/i;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Lmv/e$a;)Lu6/i;
    .locals 0
    .param p0    # Lmv/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lx6/a;->c(Lmv/e$a;)Lmv/e$a;

    move-result-object p0

    invoke-static {p0}, Lx6/a;->b(Lmv/e$a;)Lx6/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Lu6/m$a;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lu6/m$a;

    new-instance v1, Lw6/a;

    invoke-direct {v1}, Lw6/a;-><init>()V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lu6/m$a;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
