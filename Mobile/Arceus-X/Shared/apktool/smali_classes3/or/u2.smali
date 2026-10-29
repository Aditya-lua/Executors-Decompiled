.class public final synthetic Lor/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/g;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/u2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iput-object p2, p0, Lor/u2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lor/u2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iget-object v1, p0, Lor/u2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->g(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V

    return-void
.end method
