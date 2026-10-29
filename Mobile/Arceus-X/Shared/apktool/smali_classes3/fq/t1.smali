.class public final synthetic Lfq/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/t1;->a:Lfq/k2;

    iput-object p2, p0, Lfq/t1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/t1;->a:Lfq/k2;

    iget-object v1, p0, Lfq/t1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, v1, p1}, Lfq/k2;->q(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/Unit;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
