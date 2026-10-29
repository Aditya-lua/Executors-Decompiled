.class public final Lcom/withpersona/sdk2/inquiry/internal/i$g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/lifecycle/a1$c;",
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
        "Landroidx/lifecycle/a1$c;",
        "b",
        "()Landroidx/lifecycle/a1$c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Landroidx/fragment/app/c;

.field public final synthetic j:Ljt/h;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;Ljt/h;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/i$g;->i:Landroidx/fragment/app/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/i$g;->j:Ljt/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/a1$c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$g;->j:Ljt/h;

    invoke-static {v0}, Le4/l0;->a(Ljt/h;)Landroidx/lifecycle/c1;

    move-result-object v0

    instance-of v1, v0, Landroidx/lifecycle/j;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/lifecycle/j;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/lifecycle/j;->X()Landroidx/lifecycle/a1$c;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$g;->i:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->X()Landroidx/lifecycle/a1$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/i$g;->b()Landroidx/lifecycle/a1$c;

    move-result-object v0

    return-object v0
.end method
