.class public final synthetic Lqo/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/u;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iput-object p2, p0, Lqo/u;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqo/u;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iget-object v1, p0, Lqo/u;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    check-cast p1, Lpo/c$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->F(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lpo/c$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
