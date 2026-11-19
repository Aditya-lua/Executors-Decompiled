.class public final synthetic Les/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/p5;->a:Les/s6;

    iput-object p2, p0, Les/p5;->b:Les/i4$a;

    iput-object p3, p0, Les/p5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/p5;->a:Les/s6;

    iget-object v1, p0, Les/p5;->b:Les/i4$a;

    iget-object v2, p0, Les/p5;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    check-cast p1, Lzp/i;

    invoke-static {v0, v1, v2, p1}, Les/s6;->Z(Les/s6;Les/i4$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lzp/i;)Lln/r;

    move-result-object p1

    return-object p1
.end method
