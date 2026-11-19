.class public final synthetic Les/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lqr/x5;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;


# direct methods
.method public synthetic constructor <init>(Lqr/x5;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/h3;->a:Lqr/x5;

    iput-object p2, p0, Les/h3;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Les/h3;->a:Lqr/x5;

    iget-object v1, p0, Les/h3;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    invoke-static {v0, v1, p1}, Les/h4;->E(Lqr/x5;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/view/View;)V

    return-void
.end method
