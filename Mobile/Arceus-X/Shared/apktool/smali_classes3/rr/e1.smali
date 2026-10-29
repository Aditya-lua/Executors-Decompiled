.class public final synthetic Lrr/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrr/g1;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lrr/g1;ZLcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/e1;->a:Lrr/g1;

    iput-boolean p2, p0, Lrr/e1;->b:Z

    iput-object p3, p0, Lrr/e1;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrr/e1;->a:Lrr/g1;

    iget-boolean v1, p0, Lrr/e1;->b:Z

    iget-object v2, p0, Lrr/e1;->c:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;

    invoke-static {v0, v1, v2, p1}, Lrr/g1;->m(Lrr/g1;ZLcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
