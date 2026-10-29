.class public final synthetic Lyp/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/r0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    iput-object p2, p0, Lyp/r0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Lyp/r0;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyp/r0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    iget-object v1, p0, Lyp/r0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lyp/r0;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->v(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
