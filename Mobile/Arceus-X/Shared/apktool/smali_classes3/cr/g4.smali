.class public final synthetic Lcr/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/h;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lnq/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/g4;->a:Lnq/h;

    iput-object p2, p0, Lcr/g4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    iput p3, p0, Lcr/g4;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcr/g4;->a:Lnq/h;

    iget-object v1, p0, Lcr/g4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    iget v2, p0, Lcr/g4;->c:I

    invoke-static {v0, v1, v2}, Lcr/k4;->h(Lnq/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
