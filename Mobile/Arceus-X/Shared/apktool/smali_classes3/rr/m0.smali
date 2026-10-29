.class public final synthetic Lrr/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

.field public final synthetic b:Lrr/g1;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/m0;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    iput-object p2, p0, Lrr/m0;->b:Lrr/g1;

    iput-object p3, p0, Lrr/m0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/m0;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    iget-object v1, p0, Lrr/m0;->b:Lrr/g1;

    iget-object v2, p0, Lrr/m0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    invoke-static {v0, v1, v2}, Lrr/g1;->g(Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
