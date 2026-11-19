.class public final Ln0/c4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0004\u0008\u0010\u0010\u0011\u0012\u0004\u0008\u0015\u0010\u0003\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0010\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Ln0/c4;",
        "",
        "<init>",
        "()V",
        "Ln0/o0;",
        "cameraInfoInternal",
        "Lg0/g2;",
        "sessionConfig",
        "",
        "findMaxSupportedFrameRate",
        "Lj0/b;",
        "resolvedFeatureGroup",
        "Ls0/b;",
        "c",
        "(Ln0/o0;Lg0/g2;ZLj0/b;)Ls0/b;",
        "Lg0/y;",
        "b",
        "Lg0/y;",
        "a",
        "()Lg0/y;",
        "(Lg0/y;)V",
        "getCameraUseCaseAdapterProvider$annotations",
        "cameraUseCaseAdapterProvider",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ln0/c4;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lg0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/c4;

    invoke-direct {v0}, Ln0/c4;-><init>()V

    sput-object v0, Ln0/c4;->a:Ln0/c4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lg0/y;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ln0/c4;->b:Lg0/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "cameraUseCaseAdapterProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final b(Lg0/y;)V
    .locals 1
    .param p0    # Lg0/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Ln0/c4;->b:Lg0/y;

    return-void
.end method

.method public static final c(Ln0/o0;Lg0/g2;ZLj0/b;)Ls0/b;
    .locals 8
    .param p0    # Ln0/o0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lg0/g2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lj0/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "cameraInfoInternal"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln0/c4;->b:Lg0/y;

    if-eqz v0, :cond_1

    invoke-static {}, Ln0/c4;->a()Lg0/y;

    move-result-object v0

    invoke-interface {p0}, Ln0/o0;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getCameraId(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lg0/y;->a(Ljava/lang/String;)Ls0/f;

    move-result-object v0

    invoke-virtual {p1}, Lg0/g2;->l()Lg0/y2;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls0/f;->m0(Lg0/y2;)V

    invoke-virtual {p1}, Lg0/g2;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls0/f;->i0(Ljava/util/List;)V

    invoke-virtual {p1}, Lg0/g2;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Ls0/f;->l0(I)V

    invoke-virtual {p1}, Lg0/g2;->f()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls0/f;->k0(Landroid/util/Range;)V

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-nez p3, :cond_0

    sget-object v2, Lj0/b;->b:Lj0/b$a;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lj0/b$a;->c(Lj0/b$a;Lg0/g2;Ln0/o0;Ll0/c;ILjava/lang/Object;)Lj0/b;

    move-result-object p3

    :cond_0
    invoke-virtual {v0, v1, p3, p2}, Ls0/f;->o0(Ljava/util/Collection;Lj0/b;Z)Ls0/b;

    move-result-object p0

    const-string p1, "simulateAddUseCases(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "mCameraUseCaseAdapterProvider must be initialized first!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
