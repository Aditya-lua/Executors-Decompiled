.class public final synthetic Lcr/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

.field public final synthetic b:Lgr/n;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/u1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

    iput-object p2, p0, Lcr/u1;->b:Lgr/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/u1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

    iget-object v1, p0, Lcr/u1;->b:Lgr/n;

    invoke-static {v0, v1}, Lcr/v1;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
