.class public abstract Lls/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropsT:",
        "Ljava/lang/Object;",
        "StateT::",
        "Lls/h;",
        "OutputT:",
        "Ljava/lang/Object;",
        "RenderingT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\n\u0008\u0001\u0010\u0003*\u0004\u0018\u00010\u0002*\u0004\u0008\u0002\u0010\u0004*\u0004\u0008\u0003\u0010\u00052\u00020\u0006B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0002H\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0019R\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00030\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008 \u0010\u0019\u00a8\u0006\""
    }
    d2 = {
        "Lls/d;",
        "PropsT",
        "Lls/h;",
        "StateT",
        "OutputT",
        "RenderingT",
        "",
        "initialProp",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lav/p0;",
        "baseScope",
        "<init>",
        "(Ljava/lang/Object;Landroidx/lifecycle/l0;Lav/p0;)V",
        "output",
        "",
        "e",
        "(Ljava/lang/Object;)V",
        "newState",
        "f",
        "(Lls/h;)V",
        "Ldv/c0;",
        "a",
        "Ldv/c0;",
        "b",
        "()Ldv/c0;",
        "props",
        "Lls/g;",
        "Lls/g;",
        "d",
        "()Lls/g;",
        "workflowContext",
        "c",
        "rendering",
        "workflows_release"
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
            "TPropsT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "TStateT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/lifecycle/l0;Lav/p0;)V
    .locals 1
    .param p2    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;",
            "Landroidx/lifecycle/l0;",
            "Lav/p0;",
            ")V"
        }
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lls/d;->a:Ldv/c0;

    new-instance p1, Lls/g;

    invoke-direct {p1, p2, p3}, Lls/g;-><init>(Landroidx/lifecycle/l0;Lav/p0;)V

    iput-object p1, p0, Lls/d;->b:Lls/g;

    const/4 p1, 0x0

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p2

    iput-object p2, p0, Lls/d;->c:Ldv/c0;

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lls/d;->d:Ldv/c0;

    return-void
.end method


# virtual methods
.method public final a()Ldv/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/c0<",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lls/d;->c:Ldv/c0;

    return-object v0
.end method

.method public final b()Ldv/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/c0<",
            "TPropsT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lls/d;->a:Ldv/c0;

    return-object v0
.end method

.method public final c()Ldv/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/c0<",
            "TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lls/d;->d:Ldv/c0;

    return-object v0
.end method

.method public final d()Lls/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lls/g<",
            "TStateT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lls/d;->b:Lls/g;

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputT;)V"
        }
    .end annotation

    iget-object v0, p0, Lls/d;->c:Ldv/c0;

    invoke-interface {v0}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lls/d;->c:Ldv/c0;

    invoke-interface {v0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Lls/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStateT;)V"
        }
    .end annotation

    iget-object v0, p0, Lls/d;->b:Lls/g;

    invoke-virtual {v0, p1}, Lls/g;->p(Lls/h;)V

    return-void
.end method
