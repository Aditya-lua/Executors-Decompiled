.class public final synthetic Lkq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lkq/p;

.field public final synthetic b:Lkq/i;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lkq/p;Lkq/i;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/k;->a:Lkq/p;

    iput-object p2, p0, Lkq/k;->b:Lkq/i;

    iput-object p3, p0, Lkq/k;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Lkq/k;->a:Lkq/p;

    iget-object v1, p0, Lkq/k;->b:Lkq/i;

    iget-object v2, p0, Lkq/k;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lkq/p;->e(Lkq/p;Lkq/i;Landroid/content/Context;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
