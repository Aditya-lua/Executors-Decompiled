.class public final synthetic Lcr/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/t3;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lcr/t3;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/t3;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcr/t3;->b:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;

    invoke-static {v0, v1}, Lcr/u3;->a(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
