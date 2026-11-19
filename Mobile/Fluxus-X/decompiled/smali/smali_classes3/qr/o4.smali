.class public final synthetic Lqr/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

.field public final synthetic b:Lur/u;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lur/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/o4;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

    iput-object p2, p0, Lqr/o4;->b:Lur/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/o4;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;

    iget-object v1, p0, Lqr/o4;->b:Lur/u;

    invoke-static {v0, v1}, Lqr/p4;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lur/u;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
