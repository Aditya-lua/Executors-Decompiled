.class public final synthetic Lcr/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/h;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

.field public final synthetic c:Lkotlin/jvm/internal/y;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lnq/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lkotlin/jvm/internal/y;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/h4;->a:Lnq/h;

    iput-object p2, p0, Lcr/h4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    iput-object p3, p0, Lcr/h4;->c:Lkotlin/jvm/internal/y;

    iput p4, p0, Lcr/h4;->d:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcr/h4;->a:Lnq/h;

    iget-object v1, p0, Lcr/h4;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    iget-object v2, p0, Lcr/h4;->c:Lkotlin/jvm/internal/y;

    iget v3, p0, Lcr/h4;->d:I

    invoke-static {v0, v1, v2, v3}, Lcr/k4;->i(Lnq/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lkotlin/jvm/internal/y;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
