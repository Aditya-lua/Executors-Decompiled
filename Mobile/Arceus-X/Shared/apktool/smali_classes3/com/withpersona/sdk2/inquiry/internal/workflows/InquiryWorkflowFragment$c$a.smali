.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lhp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;


# direct methods
.method public constructor <init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;->a:Lhp/e0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;->b:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;->a:Lhp/e0;

    invoke-virtual {p2}, Lvr/c;->a()Lnu/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;->b:Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;->h2(Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;)Lcom/withpersona/sdk2/inquiry/internal/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->o2(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$c$a;->b(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
