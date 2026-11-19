.class public final synthetic Lxq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lpu/n;


# direct methods
.method public synthetic constructor <init>(Lpu/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq/a;->a:Lpu/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxq/a;->a:Lpu/n;

    check-cast p2, Ls5/a;

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$g0;

    invoke-static {v0, p1, p2, p3}, Lxq/e;->d(Lpu/n;Ljava/lang/Object;Ls5/a;Landroidx/recyclerview/widget/RecyclerView$g0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
