.class public final synthetic Lio/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/d0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lio/d0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    iput-object p3, p0, Lio/d0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p4, p0, Lio/d0;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/d0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lio/d0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    iget-object v2, p0, Lio/d0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v3, p0, Lio/d0;->d:Lym/k$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/e$a;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->B(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lym/r;

    move-result-object p1

    return-object p1
.end method
