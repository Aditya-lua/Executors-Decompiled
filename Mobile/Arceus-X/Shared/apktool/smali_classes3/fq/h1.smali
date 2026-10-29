.class public final synthetic Lfq/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/h1;->a:Lfq/k2;

    iput-object p2, p0, Lfq/h1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Lfq/h1;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/h1;->a:Lfq/k2;

    iget-object v1, p0, Lfq/h1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lfq/h1;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    invoke-static {v0, v1, v2}, Lfq/k2;->P0(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
