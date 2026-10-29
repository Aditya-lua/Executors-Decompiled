.class public final synthetic Lor/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic c:Lym/k$a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/d4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p2, p0, Lor/d4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p3, p0, Lor/d4;->c:Lym/k$a;

    iput-object p4, p0, Lor/d4;->d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/d4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lor/d4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v2, p0, Lor/d4;->c:Lym/k$a;

    iget-object v3, p0, Lor/d4;->d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->r(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
