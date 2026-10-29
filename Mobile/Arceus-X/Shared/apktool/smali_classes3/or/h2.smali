.class public final synthetic Lor/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/h2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iput-object p2, p0, Lor/h2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p3, p0, Lor/h2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/h2;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    iget-object v1, p0, Lor/h2;->b:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v2, p0, Lor/h2;->c:Ljava/util/List;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->k(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
