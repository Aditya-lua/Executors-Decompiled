.class public final synthetic Lfq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/k;->a:Lfq/k2;

    iput-object p2, p0, Lfq/k;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Lfq/k;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/k;->a:Lfq/k2;

    iget-object v1, p0, Lfq/k;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lfq/k;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lfq/k2;->G(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
