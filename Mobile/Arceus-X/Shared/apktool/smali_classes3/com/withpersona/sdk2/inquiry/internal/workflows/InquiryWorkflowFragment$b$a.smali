.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;->a:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lhp/s0;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp/s0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;->a:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->k2()Lhp/n0;

    move-result-object p2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;->a:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-virtual {v0}, Lkq/a;->b2()Lr5/a;

    move-result-object v0

    check-cast v0, Lbp/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;->a:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->v()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, "getChildFragmentManager(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v0, v1}, Lhp/n0;->h(Lhp/s0;Lbp/c;Landroidx/fragment/app/FragmentManager;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhp/s0;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$b$a;->b(Lhp/s0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
