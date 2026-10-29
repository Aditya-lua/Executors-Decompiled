.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/c;
.super Landroidx/lifecycle/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0018\u00002\u00020\u0001:\u0001\'B\u001b\u0008\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010\u001a\u001a\u0004\u0008!\u0010\u001c\"\u0004\u0008\"\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006("
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;",
        "Landroidx/lifecycle/x0;",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lhp/e0$b;",
        "inquiryStateManagerFactory",
        "<init>",
        "(Landroidx/lifecycle/l0;Lhp/e0$b;)V",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;",
        "props",
        "Lhp/e0;",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lhp/e0;",
        "",
        "d",
        "()V",
        "b",
        "Landroidx/lifecycle/l0;",
        "c",
        "Lhp/e0$b;",
        "Lnu/b0;",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;",
        "Lnu/b0;",
        "_result",
        "Landroidx/lifecycle/d0;",
        "",
        "Landroidx/lifecycle/d0;",
        "getInquiryId",
        "()Landroidx/lifecycle/d0;",
        "setInquiryId",
        "(Landroidx/lifecycle/d0;)V",
        "inquiryId",
        "f",
        "getSessionToken",
        "setSessionToken",
        "sessionToken",
        "g",
        "Lhp/e0;",
        "inquiryStateManager",
        "a",
        "inquiry-internal_release"
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

.field public final c:Lhp/e0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
            "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Lhp/e0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;Lhp/e0$b;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lhp/e0$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryStateManagerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->b:Landroidx/lifecycle/l0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->c:Lhp/e0$b;

    const/4 p2, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, v1, p2, v1}, Lnu/i0;->b(IILmu/a;ILjava/lang/Object;)Lnu/b0;

    move-result-object p2

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->d:Lnu/b0;

    const-string p2, "inquiry_id"

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/l0;->c(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/d0;

    move-result-object p2

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->e:Landroidx/lifecycle/d0;

    const-string p2, "session_token"

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/l0;->c(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/d0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->f:Landroidx/lifecycle/d0;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->g:Lhp/e0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhp/e0;->L()V

    :cond_0
    invoke-super {p0}, Landroidx/lifecycle/x0;->d()V

    return-void
.end method

.method public final e(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lhp/e0;
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->g:Lhp/e0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->c:Lhp/e0$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->b:Landroidx/lifecycle/l0;

    invoke-interface {v0, p1, v1}, Lhp/e0$b;->a(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lhp/e0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/c;->g:Lhp/e0;

    return-object p1

    :cond_0
    return-object v0
.end method
