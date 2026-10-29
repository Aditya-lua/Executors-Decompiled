.class public final synthetic Lor/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/b5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p2, p0, Lor/b5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/b5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v1, p0, Lor/b5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->N(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
