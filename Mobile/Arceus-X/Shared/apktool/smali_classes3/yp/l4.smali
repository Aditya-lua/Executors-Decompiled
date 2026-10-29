.class public final synthetic Lyp/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/l4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lyp/l4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Lyp/l4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    iput-object p4, p0, Lyp/l4;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lyp/l4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lyp/l4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lyp/l4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    iget-object v3, p0, Lyp/l4;->d:Ljava/lang/String;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
