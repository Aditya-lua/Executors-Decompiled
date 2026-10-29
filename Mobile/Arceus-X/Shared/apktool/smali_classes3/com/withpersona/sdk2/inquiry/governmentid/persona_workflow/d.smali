.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;
.super Landroidx/lifecycle/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;",
        "Landroidx/lifecycle/x0;",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "initialInput",
        "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;",
        "stateManagerFactory",
        "<init>",
        "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;)V",
        "input",
        "",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V",
        "d",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;",
        "e",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;",
        "governmentIdStepStateManager",
        "a",
        "government-id_release"
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
.field public final b:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialInput"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateManagerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    invoke-interface {p3, p2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;->b:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/x0;->d()V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;->b:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->e0()V

    return-void
.end method

.method public final e()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;->b:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    return-object v0
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;->b:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-virtual {v0}, Lvr/c;->b()Lnu/c0;

    move-result-object v0

    invoke-interface {v0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
