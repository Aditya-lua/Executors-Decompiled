.class public final synthetic Lcr/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/d2;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lcr/d2;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/d2;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcr/d2;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;

    invoke-static {v0, v1}, Lcr/e2;->a(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
