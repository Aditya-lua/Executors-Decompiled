.class public final synthetic Lhp/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhp/e0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;


# direct methods
.method public synthetic constructor <init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/t;->a:Lhp/e0;

    iput-object p2, p0, Lhp/t;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhp/t;->a:Lhp/e0;

    iget-object v1, p0, Lhp/t;->b:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;

    invoke-static {v0, v1, p1}, Lhp/e0;->w(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
