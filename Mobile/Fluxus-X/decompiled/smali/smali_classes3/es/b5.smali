.class public final synthetic Les/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/b5;->a:Les/i4$a;

    iput-object p2, p0, Les/b5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/b5;->a:Les/i4$a;

    iget-object v1, p0, Les/b5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Les/s6;->D(Les/i4$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
