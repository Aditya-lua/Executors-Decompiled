.class public final synthetic Lqo/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/f;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iput-object p2, p0, Lqo/f;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    iput-object p3, p0, Lqo/f;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqo/f;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iget-object v1, p0, Lqo/f;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    iget-object v2, p0, Lqo/f;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->i2(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
