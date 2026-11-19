.class public final synthetic Lvr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lvr/m;

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView$g0;


# direct methods
.method public synthetic constructor <init>(Lvr/m;Landroidx/recyclerview/widget/RecyclerView$g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvr/l;->a:Lvr/m;

    iput-object p2, p0, Lvr/l;->b:Landroidx/recyclerview/widget/RecyclerView$g0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lvr/l;->a:Lvr/m;

    iget-object v1, p0, Lvr/l;->b:Landroidx/recyclerview/widget/RecyclerView$g0;

    invoke-static {v0, v1, p1}, Lvr/m;->D(Lvr/m;Landroidx/recyclerview/widget/RecyclerView$g0;Landroid/view/View;)V

    return-void
.end method
