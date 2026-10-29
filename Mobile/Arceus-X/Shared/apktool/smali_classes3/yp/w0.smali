.class public final synthetic Lyp/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/w0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lyp/w0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyp/w0;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lyp/w0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
