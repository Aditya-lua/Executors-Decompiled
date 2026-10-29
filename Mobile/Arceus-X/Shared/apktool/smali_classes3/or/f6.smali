.class public final synthetic Lor/f6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/f6;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p2, p0, Lor/f6;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p3, p0, Lor/f6;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    iput-object p4, p0, Lor/f6;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lor/f6;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lor/f6;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v2, p0, Lor/f6;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    iget-object v3, p0, Lor/f6;->d:Lym/k$a;

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p3

    check-cast v6, Ljava/util/Map;

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->b0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLjava/util/Map;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
