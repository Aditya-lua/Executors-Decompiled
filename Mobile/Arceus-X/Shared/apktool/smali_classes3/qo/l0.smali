.class public final synthetic Lqo/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/l0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iput-object p2, p0, Lqo/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p3, p0, Lqo/l0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqo/l0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iget-object v1, p0, Lqo/l0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v2, p0, Lqo/l0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/e$a;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->B(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
