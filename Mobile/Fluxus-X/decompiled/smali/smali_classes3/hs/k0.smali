.class public final synthetic Lhs/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/k0;->a:Lhs/g1;

    iput-object p2, p0, Lhs/k0;->b:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhs/k0;->a:Lhs/g1;

    iget-object v1, p0, Lhs/k0;->b:Les/i4;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    invoke-static {v0, v1, p1}, Lhs/g1;->D(Lhs/g1;Les/i4;Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
