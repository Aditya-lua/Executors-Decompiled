.class public final synthetic Ljq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# instance fields
.field public final synthetic a:Lzt/n;


# direct methods
.method public synthetic constructor <init>(Lzt/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq/a;->a:Lzt/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljq/a;->a:Lzt/n;

    check-cast p2, Lr5/a;

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$f0;

    invoke-static {v0, p1, p2, p3}, Ljq/e;->d(Lzt/n;Ljava/lang/Object;Lr5/a;Landroidx/recyclerview/widget/RecyclerView$f0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
