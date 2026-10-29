.class public final synthetic Lyp/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/m;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/c;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/m;Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/i;->a:Landroidx/lifecycle/m;

    iput-object p2, p0, Lyp/i;->b:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iput-object p3, p0, Lyp/i;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyp/i;->a:Landroidx/lifecycle/m;

    iget-object v1, p0, Lyp/i;->b:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v2, p0, Lyp/i;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/c;->f(Landroidx/lifecycle/m;Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
