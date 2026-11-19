.class public final synthetic Les/w5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a$d;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

.field public final synthetic c:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Les/i4$a$d;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/w5;->a:Les/i4$a$d;

    iput-object p2, p0, Les/w5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    iput-object p3, p0, Les/w5;->c:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/w5;->a:Les/i4$a$d;

    iget-object v1, p0, Les/w5;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    iget-object v2, p0, Les/w5;->c:Les/i4$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->l(Les/i4$a$d;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Les/i4$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
