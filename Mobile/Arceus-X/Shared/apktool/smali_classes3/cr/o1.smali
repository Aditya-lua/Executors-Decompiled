.class public final synthetic Lcr/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

.field public final synthetic b:Lgr/m;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;Lgr/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/o1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

    iput-object p2, p0, Lcr/o1;->b:Lgr/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/o1;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;

    iget-object v1, p0, Lcr/o1;->b:Lgr/m;

    invoke-static {v0, v1}, Lcr/p1;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;Lgr/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
