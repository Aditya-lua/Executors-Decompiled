.class public final synthetic Lor/o3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic c:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/o3;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

    iput-object p2, p0, Lor/o3;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p3, p0, Lor/o3;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lor/o3;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

    iget-object v1, p0, Lor/o3;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v2, p0, Lor/o3;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V

    return-void
.end method
