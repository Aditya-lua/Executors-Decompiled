.class public final synthetic Lor/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/ui/a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/v0;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iput-object p2, p0, Lor/v0;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p3, p0, Lor/v0;->c:Ljava/lang/String;

    iput-object p4, p0, Lor/v0;->d:Lcom/withpersona/sdk2/inquiry/ui/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/v0;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iget-object v1, p0, Lor/v0;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v2, p0, Lor/v0;->c:Ljava/lang/String;

    iget-object v3, p0, Lor/v0;->d:Lcom/withpersona/sdk2/inquiry/ui/a;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/ui/a;->k(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
