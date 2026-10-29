.class public final Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;
.super Ljava/lang/Object;
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
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/lifecycle/a1$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/c;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;->a:Landroidx/fragment/app/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/a1$c;
    .locals 3

    new-instance v0, Loq/d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;->a:Landroidx/fragment/app/c;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2}, Loq/d;-><init>(Ld5/i;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$e;->a()Landroidx/lifecycle/a1$c;

    move-result-object v0

    return-object v0
.end method
