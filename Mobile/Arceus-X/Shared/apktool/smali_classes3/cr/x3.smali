.class public final synthetic Lcr/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

.field public final synthetic b:Lgr/u;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/x3;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

    iput-object p2, p0, Lcr/x3;->b:Lgr/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/x3;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

    iget-object v1, p0, Lcr/x3;->b:Lgr/u;

    invoke-static {v0, v1}, Lcr/y3;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
