.class public final synthetic Lyp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Laq/a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;


# direct methods
.method public synthetic constructor <init>(Laq/a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/d;->a:Laq/a;

    iput-object p2, p0, Lyp/d;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lyp/d;->a:Laq/a;

    iget-object v1, p0, Lyp/d;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->g(Laq/a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Landroid/view/View;)V

    return-void
.end method
