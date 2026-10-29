.class public final Landroidx/fragment/app/b$g$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b$g;->f(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "b",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Landroidx/fragment/app/b$g;

.field public final synthetic j:Landroid/view/ViewGroup;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b$g;Landroid/view/ViewGroup;Ljava/lang/Object;Lkotlin/jvm/internal/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/b$g;",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/internal/c0<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    iput-object p2, p0, Landroidx/fragment/app/b$g$b;->j:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/b$g$b;->k:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/b$g$b;->l:Lkotlin/jvm/internal/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 7

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    const-string v1, "Attempting to create TransitionSeekController"

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    invoke-virtual {v1}, Landroidx/fragment/app/b$g;->v()Le4/j0;

    move-result-object v3

    iget-object v4, p0, Landroidx/fragment/app/b$g$b;->j:Landroid/view/ViewGroup;

    iget-object v5, p0, Landroidx/fragment/app/b$g$b;->k:Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Le4/j0;->j(Landroid/view/ViewGroup;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/fragment/app/b$g;->C(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    invoke-virtual {v1}, Landroidx/fragment/app/b$g;->s()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TransitionSeekController was not created."

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/b$g;->D(Z)V

    return-void

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/b$g$b;->l:Lkotlin/jvm/internal/c0;

    new-instance v3, Landroidx/fragment/app/b$g$b$a;

    iget-object v4, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    iget-object v5, p0, Landroidx/fragment/app/b$g$b;->k:Ljava/lang/Object;

    iget-object v6, p0, Landroidx/fragment/app/b$g$b;->j:Landroid/view/ViewGroup;

    invoke-direct {v3, v4, v5, v6}, Landroidx/fragment/app/b$g$b$a;-><init>(Landroidx/fragment/app/b$g;Ljava/lang/Object;Landroid/view/ViewGroup;)V

    iput-object v3, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Started executing operations from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    invoke-virtual {v1}, Landroidx/fragment/app/b$g;->t()Landroidx/fragment/app/i$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/b$g$b;->i:Landroidx/fragment/app/b$g;

    invoke-virtual {v1}, Landroidx/fragment/app/b$g;->u()Landroidx/fragment/app/i$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/b$g$b;->b()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
