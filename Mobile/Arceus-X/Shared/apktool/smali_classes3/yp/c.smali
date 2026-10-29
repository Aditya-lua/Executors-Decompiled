.class public final synthetic Lyp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Laq/a;

.field public final synthetic b:Landroidx/lifecycle/m;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/c;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;


# direct methods
.method public synthetic constructor <init>(Laq/a;Landroidx/lifecycle/m;Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/c;->a:Laq/a;

    iput-object p2, p0, Lyp/c;->b:Landroidx/lifecycle/m;

    iput-object p3, p0, Lyp/c;->c:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iput-object p4, p0, Lyp/c;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lyp/c;->a:Laq/a;

    iget-object v1, p0, Lyp/c;->b:Landroidx/lifecycle/m;

    iget-object v2, p0, Lyp/c;->c:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v3, p0, Lyp/c;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->e(Laq/a;Landroidx/lifecycle/m;Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Landroid/view/View;)V

    return-void
.end method
