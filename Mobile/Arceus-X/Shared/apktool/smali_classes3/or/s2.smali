.class public final synthetic Lor/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

.field public final synthetic e:Lan/y;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/s2;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/s2;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p3, p0, Lor/s2;->c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iput-object p4, p0, Lor/s2;->d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iput-object p5, p0, Lor/s2;->e:Lan/y;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lor/s2;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/s2;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v2, p0, Lor/s2;->c:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iget-object v3, p0, Lor/s2;->d:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iget-object v4, p0, Lor/s2;->e:Lan/y;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/ui/g;->x(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Landroid/view/View;)V

    return-void
.end method
