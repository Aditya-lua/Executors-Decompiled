.class public final synthetic Lyp/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/p0;->a:Lym/k$a;

    iput-object p2, p0, Lyp/p0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyp/p0;->a:Lym/k$a;

    iget-object v1, p0, Lyp/p0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    check-cast p1, Lkn/a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->l0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lkn/a;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
