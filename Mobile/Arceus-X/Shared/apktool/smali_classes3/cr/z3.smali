.class public final synthetic Lcr/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;

.field public final synthetic b:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/z3;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;

    iput-object p2, p0, Lcr/z3;->b:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/z3;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;

    iget-object v1, p0, Lcr/z3;->b:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcr/a4;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;Landroid/widget/ImageView;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
