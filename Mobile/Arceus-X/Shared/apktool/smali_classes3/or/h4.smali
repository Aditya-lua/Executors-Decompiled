.class public final synthetic Lor/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic d:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/h4;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    iput-object p2, p0, Lor/h4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p3, p0, Lor/h4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p4, p0, Lor/h4;->d:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/h4;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    iget-object v1, p0, Lor/h4;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v2, p0, Lor/h4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v3, p0, Lor/h4;->d:Lym/k$a;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->a0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
