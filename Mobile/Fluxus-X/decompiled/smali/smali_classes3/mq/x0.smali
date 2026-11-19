.class public final synthetic Lmq/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lmq/v0$b;


# direct methods
.method public synthetic constructor <init>(Lmq/v0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/x0;->a:Lmq/v0$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmq/x0;->a:Lmq/v0$b;

    check-cast p1, Lmq/v0$b$a;

    check-cast p2, Loq/g;

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$g0;

    invoke-static {v0, p1, p2, p3}, Lmq/v0$b;->D(Lmq/v0$b;Lmq/v0$b$a;Loq/g;Landroidx/recyclerview/widget/RecyclerView$g0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
