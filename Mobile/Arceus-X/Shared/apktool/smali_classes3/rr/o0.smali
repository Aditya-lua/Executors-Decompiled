.class public final synthetic Lrr/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/o0;->a:Lrr/g1;

    iput-object p2, p0, Lrr/o0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iput-object p3, p0, Lrr/o0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    iput-object p4, p0, Lrr/o0;->d:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lrr/o0;->a:Lrr/g1;

    iget-object v1, p0, Lrr/o0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iget-object v2, p0, Lrr/o0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    iget-object v3, p0, Lrr/o0;->d:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    invoke-static {v0, v1, v2, v3, p1}, Lrr/g1;->n(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
