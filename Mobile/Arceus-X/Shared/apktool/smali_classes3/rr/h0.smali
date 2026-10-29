.class public final synthetic Lrr/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/h0;->a:Lrr/g1;

    iput-object p2, p0, Lrr/h0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p3, p0, Lrr/h0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lrr/h0;->a:Lrr/g1;

    iget-object v1, p0, Lrr/h0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v2, p0, Lrr/h0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    move-object v3, p1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p3

    check-cast v5, Ljava/util/Map;

    invoke-static/range {v0 .. v5}, Lrr/g1;->i(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLjava/util/Map;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
