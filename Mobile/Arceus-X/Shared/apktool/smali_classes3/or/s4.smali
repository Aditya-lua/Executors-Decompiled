.class public final synthetic Lor/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/s4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p2, p0, Lor/s4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    iput-object p3, p0, Lor/s4;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/s4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v1, p0, Lor/s4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    iget-object v2, p0, Lor/s4;->c:Ljava/util/Map;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->f0(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Ljava/util/Map;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
