.class public final synthetic Lor/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/e5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p2, p0, Lor/e5;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iput-object p3, p0, Lor/e5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/e5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lor/e5;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iget-object v2, p0, Lor/e5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->Z(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;)Lym/r;

    move-result-object p1

    return-object p1
.end method
