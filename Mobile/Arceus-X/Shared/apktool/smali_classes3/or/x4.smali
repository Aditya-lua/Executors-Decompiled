.class public final synthetic Lor/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/x4;->a:Ljava/util/Map;

    iput-object p2, p0, Lor/x4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p3, p0, Lor/x4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/x4;->a:Ljava/util/Map;

    iget-object v1, p0, Lor/x4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v2, p0, Lor/x4;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->A(Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
