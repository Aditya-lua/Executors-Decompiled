.class public final Landroidx/fragment/app/b$g$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b$g;->d(Landroid/view/ViewGroup;)V
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


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b$g;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$g$a;->i:Landroidx/fragment/app/b$g;

    iput-object p2, p0, Landroidx/fragment/app/b$g$a;->j:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/b$g$a;->k:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$g$a;->i:Landroidx/fragment/app/b$g;

    invoke-virtual {v0}, Landroidx/fragment/app/b$g;->v()Le4/j0;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/b$g$a;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Landroidx/fragment/app/b$g$a;->k:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Le4/j0;->e(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/b$g$a;->b()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
