.class public final synthetic Lrr/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/j0;->a:Lrr/g1;

    iput-object p2, p0, Lrr/j0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p3, p0, Lrr/j0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/j0;->a:Lrr/g1;

    iget-object v1, p0, Lrr/j0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v2, p0, Lrr/j0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    invoke-static {v0, v1, v2}, Lrr/g1;->k(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
