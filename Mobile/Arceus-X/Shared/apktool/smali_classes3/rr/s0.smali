.class public final synthetic Lrr/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

.field public final synthetic b:Lrr/g1;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/s0;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

    iput-object p2, p0, Lrr/s0;->b:Lrr/g1;

    iput-object p3, p0, Lrr/s0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/s0;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

    iget-object v1, p0, Lrr/s0;->b:Lrr/g1;

    iget-object v2, p0, Lrr/s0;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/d$b;

    invoke-static {v0, v1, v2, p1}, Lrr/g1;->z(Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/d$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
