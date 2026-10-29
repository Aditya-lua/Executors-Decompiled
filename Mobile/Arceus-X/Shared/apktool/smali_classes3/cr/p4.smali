.class public final synthetic Lcr/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/p4;->a:Landroid/view/View;

    iput-object p2, p0, Lcr/p4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcr/p4;->a:Landroid/view/View;

    iget-object v1, p0, Lcr/p4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;

    invoke-static {v0, v1}, Lcr/q4;->a(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
