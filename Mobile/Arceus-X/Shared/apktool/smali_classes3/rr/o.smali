.class public final synthetic Lrr/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic d:Lrr/e0;


# direct methods
.method public synthetic constructor <init>(Lvr/f;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lrr/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/o;->a:Lvr/f;

    iput-object p2, p0, Lrr/o;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iput-object p3, p0, Lrr/o;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p4, p0, Lrr/o;->d:Lrr/e0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lrr/o;->a:Lvr/f;

    iget-object v1, p0, Lrr/o;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iget-object v2, p0, Lrr/o;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v3, p0, Lrr/o;->d:Lrr/e0;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lrr/e0;->o(Lvr/f;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lrr/e0;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
