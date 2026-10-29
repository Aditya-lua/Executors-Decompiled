.class public final synthetic Lyp/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/k4;->a:Lym/k$a;

    iput-object p2, p0, Lyp/k4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyp/k4;->a:Lym/k$a;

    iget-object v1, p0, Lyp/k4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
