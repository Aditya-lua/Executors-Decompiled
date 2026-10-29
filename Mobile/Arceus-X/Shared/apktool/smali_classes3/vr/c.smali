.class public abstract Lvr/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropsT:",
        "Ljava/lang/Object;",
        "StateT::",
        "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;",
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
        "Lvr/c;",
        "PropsT",
        "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;",
        "StateT",
        "OutputT",
        "RenderingT",
        "",
        "initialProp",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lku/p0;",
        "baseScope",
        "<init>",
        "(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V",
        "output",
        "",
        "e",
        "(Ljava/lang/Object;)V",
        "newState",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V",
        "Lnu/c0;",
        "a",
        "Lnu/c0;",
        "b",
        "()Lnu/c0;",
        "props",
        "Lvr/f;",
        "Lvr/f;",
        "d",
        "()Lvr/f;",
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
.field public final a:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "TPropsT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lvr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f<",
            "TStateT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V
    .locals 1
    .param p2    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;",
            "Landroidx/lifecycle/l0;",
            "Lku/p0;",
            ")V"
        }
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lvr/c;->a:Lnu/c0;

    new-instance p1, Lvr/f;

    invoke-direct {p1, p2, p3}, Lvr/f;-><init>(Landroidx/lifecycle/l0;Lku/p0;)V

    iput-object p1, p0, Lvr/c;->b:Lvr/f;

    const/4 p1, 0x0

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p2

    iput-object p2, p0, Lvr/c;->c:Lnu/c0;

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lvr/c;->d:Lnu/c0;

    return-void
.end method


# virtual methods
.method public final a()Lnu/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/c0<",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvr/c;->c:Lnu/c0;

    return-object v0
.end method

.method public final b()Lnu/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/c0<",
            "TPropsT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvr/c;->a:Lnu/c0;

    return-object v0
.end method

.method public final c()Lnu/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/c0<",
            "TRenderingT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvr/c;->d:Lnu/c0;

    return-object v0
.end method

.method public final d()Lvr/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvr/f<",
            "TStateT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvr/c;->b:Lvr/f;

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputT;)V"
        }
    .end annotation

    iget-object v0, p0, Lvr/c;->c:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lvr/c;->c:Lnu/c0;

    invoke-interface {v0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStateT;)V"
        }
    .end annotation

    iget-object v0, p0, Lvr/c;->b:Lvr/f;

    invoke-virtual {v0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void
.end method
