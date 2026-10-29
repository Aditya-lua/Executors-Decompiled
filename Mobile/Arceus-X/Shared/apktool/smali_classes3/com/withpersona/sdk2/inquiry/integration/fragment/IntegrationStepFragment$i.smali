.class public final Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Lk4/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/lifecycle/x0;",
        "VM",
        "Lk4/a;",
        "b",
        "()Lk4/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:Ljt/h;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Ljt/h;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;->i:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;->j:Ljt/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lk4/a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;->i:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk4/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;->j:Ljt/h;

    invoke-static {v0}, Le4/l0;->a(Ljt/h;)Landroidx/lifecycle/c1;

    move-result-object v0

    instance-of v1, v0, Landroidx/lifecycle/j;

    if-eqz v1, :cond_2

    check-cast v0, Landroidx/lifecycle/j;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/lifecycle/j;->Z()Lk4/a;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v0, Lk4/a$b;->c:Lk4/a$b;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$i;->b()Lk4/a;

    move-result-object v0

    return-object v0
.end method
