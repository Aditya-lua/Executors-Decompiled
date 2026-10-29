.class public final synthetic Leq/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leq/h;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leq/h;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    check-cast p1, Lfn/h;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$d;->b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lfn/h;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
