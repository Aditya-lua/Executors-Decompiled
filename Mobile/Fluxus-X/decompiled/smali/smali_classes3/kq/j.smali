.class public final synthetic Lkq/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkq/i;

.field public final synthetic b:Llq/b;


# direct methods
.method public synthetic constructor <init>(Lkq/i;Llq/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/j;->a:Lkq/i;

    iput-object p2, p0, Lkq/j;->b:Llq/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lkq/j;->a:Lkq/i;

    iget-object v1, p0, Lkq/j;->b:Llq/b;

    invoke-static {v0, v1, p1}, Lkq/p;->c(Lkq/i;Llq/b;Landroid/view/View;)V

    return-void
.end method
