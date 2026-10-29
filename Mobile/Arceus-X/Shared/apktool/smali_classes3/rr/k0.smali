.class public final synthetic Lrr/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/k0;->a:Lrr/g1;

    iput-object p2, p0, Lrr/k0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrr/k0;->a:Lrr/g1;

    iget-object v1, p0, Lrr/k0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    invoke-static {v0, v1, p1}, Lrr/g1;->D(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
