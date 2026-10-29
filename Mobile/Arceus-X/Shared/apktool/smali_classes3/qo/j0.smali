.class public final synthetic Lqo/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/j0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/j0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->h(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
