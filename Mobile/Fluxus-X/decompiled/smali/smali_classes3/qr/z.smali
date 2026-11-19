.class public final Lqr/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR#\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u000f\u001a\u0004\u0008\u000b\u0010\u0011R0\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u0014\u0010\u0006\u00a8\u0006\u001d"
    }
    d2 = {
        "Lqr/z;",
        "",
        "",
        "Lqr/f5;",
        "initialFiles",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "b",
        "()V",
        "Ldv/c0;",
        "a",
        "Ldv/c0;",
        "_selectedFiles",
        "Ldv/h;",
        "Ldv/h;",
        "getOnFilesChanged",
        "()Ldv/h;",
        "onFilesChanged",
        "Ldv/b0;",
        "c",
        "Ldv/b0;",
        "_pickRequested",
        "d",
        "onPickRequested",
        "value",
        "getSelectedFiles",
        "()Ljava/util/List;",
        "selectedFiles",
        "ui-step-renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Ljava/util/List<",
            "Lqr/f5;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "Ljava/util/List<",
            "Lqr/f5;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqr/f5;",
            ">;)V"
        }
    .end annotation

    const-string v0, "initialFiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lqr/z;->a:Ldv/c0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ldv/j;->n(Ldv/h;I)Ldv/h;

    move-result-object p1

    iput-object p1, p0, Lqr/z;->b:Ldv/h;

    const/4 p1, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, p1}, Ldv/i0;->b(IILcv/a;ILjava/lang/Object;)Ldv/b0;

    move-result-object p1

    iput-object p1, p0, Lqr/z;->c:Ldv/b0;

    iput-object p1, p0, Lqr/z;->d:Ldv/h;

    return-void
.end method


# virtual methods
.method public final a()Ldv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lqr/z;->d:Ldv/h;

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lqr/z;->c:Ldv/b0;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {v0, v1}, Ldv/b0;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqr/f5;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqr/z;->a:Ldv/c0;

    invoke-interface {v0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
