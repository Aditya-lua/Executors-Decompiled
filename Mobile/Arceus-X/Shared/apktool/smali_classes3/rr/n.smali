.class public final synthetic Lrr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic b:Lvr/f;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lvr/f;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/n;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p2, p0, Lrr/n;->b:Lvr/f;

    iput-object p3, p0, Lrr/n;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/n;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v1, p0, Lrr/n;->b:Lvr/f;

    iget-object v2, p0, Lrr/n;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/h$b;

    invoke-static {v0, v1, v2, p1}, Lrr/e0;->w(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lvr/f;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/h$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
