.class public final synthetic Lio/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/a0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lio/a0;->b:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/a0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lio/a0;->b:Lym/k$a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->s(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
