.class public final synthetic Lcr/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;

.field public final synthetic b:Lgr/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/s0;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;

    iput-object p2, p0, Lcr/s0;->b:Lgr/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/s0;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;

    iget-object v1, p0, Lcr/s0;->b:Lgr/l;

    invoke-static {v0, v1}, Lcr/t0;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
