.class public final synthetic Les/q4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/q4;->a:Les/s6;

    iput-object p2, p0, Les/q4;->b:Les/i4;

    iput-object p3, p0, Les/q4;->c:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/q4;->a:Les/s6;

    iget-object v1, p0, Les/q4;->b:Les/i4;

    iget-object v2, p0, Les/q4;->c:Lln/k$a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    invoke-static {v0, v1, v2, p1}, Les/s6;->e0(Les/s6;Les/i4;Lln/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
