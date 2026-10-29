.class public final synthetic Lio/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/s0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lio/s0;->b:Lym/k$a;

    iput-object p3, p0, Lio/s0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p4, p0, Lio/s0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p5, p0, Lio/s0;->e:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lio/s0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lio/s0;->b:Lym/k$a;

    iget-object v2, p0, Lio/s0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v3, p0, Lio/s0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v4, p0, Lio/s0;->e:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
