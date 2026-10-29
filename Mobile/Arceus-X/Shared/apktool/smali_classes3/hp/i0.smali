.class public final synthetic Lhp/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lhp/n0;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lhp/n0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/i0;->a:Lhp/n0;

    iput-object p2, p0, Lhp/i0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lhp/i0;->a:Lhp/n0;

    iget-object v1, p0, Lhp/i0;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lhp/n0;->c(Lhp/n0;Landroid/content/Context;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
