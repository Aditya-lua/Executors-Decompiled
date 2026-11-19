.class public final Lqo/h1;
.super Landroidx/lifecycle/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqo/h1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lqo/h1;",
        "Landroidx/lifecycle/x0;",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lno/u2$b;",
        "initialInput",
        "Lqo/e1$c;",
        "documentStepStateManagerFactory",
        "<init>",
        "(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)V",
        "input",
        "",
        "f",
        "(Lno/u2$b;)V",
        "b",
        "Landroidx/lifecycle/l0;",
        "c",
        "Lno/u2$b;",
        "Lqo/e1;",
        "d",
        "Lqo/e1;",
        "e",
        "()Lqo/e1;",
        "stateManager",
        "a",
        "document_release"
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
.field public final b:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lno/u2$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lqo/e1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lno/u2$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lqo/e1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialInput"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentStepStateManagerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    iput-object p1, p0, Lqo/h1;->b:Landroidx/lifecycle/l0;

    iput-object p2, p0, Lqo/h1;->c:Lno/u2$b;

    invoke-interface {p3, p2, p1}, Lqo/e1$c;->a(Lno/u2$b;Landroidx/lifecycle/l0;)Lqo/e1;

    move-result-object p1

    iput-object p1, p0, Lqo/h1;->d:Lqo/e1;

    return-void
.end method


# virtual methods
.method public final e()Lqo/e1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lqo/h1;->d:Lqo/e1;

    return-object v0
.end method

.method public final f(Lno/u2$b;)V
    .locals 1
    .param p1    # Lno/u2$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqo/h1;->d:Lqo/e1;

    invoke-virtual {v0}, Lls/d;->b()Ldv/c0;

    move-result-object v0

    invoke-interface {v0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
