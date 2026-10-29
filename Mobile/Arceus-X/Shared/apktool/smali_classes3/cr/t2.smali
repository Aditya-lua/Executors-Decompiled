.class public final synthetic Lcr/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;


# direct methods
.method public synthetic constructor <init>(Lnq/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/t2;->a:Lnq/g;

    iput-object p2, p0, Lcr/t2;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/t2;->a:Lnq/g;

    iget-object v1, p0, Lcr/t2;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;

    invoke-static {v0, v1}, Lcr/p3;->C(Lnq/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
