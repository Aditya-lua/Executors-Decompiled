.class public final synthetic Lew/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000f\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lew/l0;",
        "Lew/g;",
        "c",
        "(Lew/l0;)Lew/g;",
        "Lew/j0;",
        "Lew/f;",
        "b",
        "(Lew/j0;)Lew/f;",
        "a",
        "()Lew/j0;",
        "okio"
    }
    k = 0x5
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
    xs = "okio/Okio"
.end annotation


# direct methods
.method public static final a()Lew/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lew/d;

    invoke-direct {v0}, Lew/d;-><init>()V

    return-object v0
.end method

.method public static final b(Lew/j0;)Lew/f;
    .locals 1
    .param p0    # Lew/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew/e0;

    invoke-direct {v0, p0}, Lew/e0;-><init>(Lew/j0;)V

    return-object v0
.end method

.method public static final c(Lew/l0;)Lew/g;
    .locals 1
    .param p0    # Lew/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew/f0;

    invoke-direct {v0, p0}, Lew/f0;-><init>(Lew/l0;)V

    return-object v0
.end method
