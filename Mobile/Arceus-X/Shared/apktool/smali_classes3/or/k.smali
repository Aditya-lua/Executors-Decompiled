.class public final synthetic Lor/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/k;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p2, p0, Lor/k;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lor/k;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v1, p0, Lor/k;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    check-cast p1, Lzq/c$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/a;->T(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lzq/c$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
