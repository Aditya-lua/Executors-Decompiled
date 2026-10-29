.class public final synthetic Lrr/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/b1;->a:Lrr/g1;

    iput-object p2, p0, Lrr/b1;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrr/b1;->a:Lrr/g1;

    iget-object v1, p0, Lrr/b1;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    invoke-static {v0, v1}, Lrr/g1;->o(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
