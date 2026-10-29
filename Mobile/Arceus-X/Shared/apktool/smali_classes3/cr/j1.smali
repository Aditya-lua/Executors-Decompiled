.class public final synthetic Lcr/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;

.field public final synthetic b:Lgr/s;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lgr/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/j1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;

    iput-object p2, p0, Lcr/j1;->b:Lgr/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/j1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;

    iget-object v1, p0, Lcr/j1;->b:Lgr/s;

    invoke-static {v0, v1}, Lcr/k1;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lgr/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
