.class public final synthetic Lor/a5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/a5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p2, p0, Lor/a5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    iput-object p3, p0, Lor/a5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/a5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v1, p0, Lor/a5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    iget-object v2, p0, Lor/a5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->w(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
