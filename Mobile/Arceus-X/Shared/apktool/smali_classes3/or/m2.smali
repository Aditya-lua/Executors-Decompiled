.class public final synthetic Lor/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/m2;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p2, p0, Lor/m2;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lor/m2;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v1, p0, Lor/m2;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->L(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
