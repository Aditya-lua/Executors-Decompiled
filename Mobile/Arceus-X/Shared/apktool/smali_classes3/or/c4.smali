.class public final synthetic Lor/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/c4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p2, p0, Lor/c4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    iput-object p3, p0, Lor/c4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p4, p0, Lor/c4;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/c4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lor/c4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    iget-object v2, p0, Lor/c4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v3, p0, Lor/c4;->d:Lym/k$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->T(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
