.class public final synthetic Lcr/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;

.field public final synthetic b:Lgr/x;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;Lgr/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/u4;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;

    iput-object p2, p0, Lcr/u4;->b:Lgr/x;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/u4;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;

    iget-object v1, p0, Lcr/u4;->b:Lgr/x;

    invoke-static {v0, v1}, Lcr/v4;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;Lgr/x;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
