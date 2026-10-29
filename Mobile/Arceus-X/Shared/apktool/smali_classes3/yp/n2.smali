.class public final synthetic Lyp/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

.field public final synthetic c:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/n2;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lyp/n2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iput-object p3, p0, Lyp/n2;->c:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyp/n2;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lyp/n2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iget-object v2, p0, Lyp/n2;->c:Lym/k$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;

    move-result-object p1

    return-object p1
.end method
