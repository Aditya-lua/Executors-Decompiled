.class public final synthetic Lqr/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lbr/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;


# direct methods
.method public synthetic constructor <init>(Lbr/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/v4;->a:Lbr/g;

    iput-object p2, p0, Lqr/v4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/v4;->a:Lbr/g;

    iget-object v1, p0, Lqr/v4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    invoke-static {v0, v1}, Lqr/d5;->e(Lbr/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
