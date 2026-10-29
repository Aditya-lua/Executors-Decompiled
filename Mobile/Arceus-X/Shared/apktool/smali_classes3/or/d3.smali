.class public final synthetic Lor/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/g;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/d3;->a:Landroid/view/View;

    iput-object p2, p0, Lor/d3;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iput-object p3, p0, Lor/d3;->c:Lcom/withpersona/sdk2/inquiry/ui/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/d3;->a:Landroid/view/View;

    iget-object v1, p0, Lor/d3;->b:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iget-object v2, p0, Lor/d3;->c:Lcom/withpersona/sdk2/inquiry/ui/g;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/ui/g;->A(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
