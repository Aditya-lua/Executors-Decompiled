.class public final synthetic Lcr/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

.field public final synthetic b:Lgr/b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/q1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

    iput-object p2, p0, Lcr/q1;->b:Lgr/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/q1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;

    iget-object v1, p0, Lcr/q1;->b:Lgr/b;

    invoke-static {v0, v1}, Lcr/v1;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
