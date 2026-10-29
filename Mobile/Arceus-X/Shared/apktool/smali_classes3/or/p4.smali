.class public final synthetic Lor/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/p4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p2, p0, Lor/p4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    iput-object p3, p0, Lor/p4;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lor/p4;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v1, p0, Lor/p4;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    iget-object v2, p0, Lor/p4;->c:Ljava/lang/String;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->k(Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
