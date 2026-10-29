.class public final synthetic Lwp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lwp/p;

.field public final synthetic b:Lwp/i;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lwp/p;Lwp/i;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/k;->a:Lwp/p;

    iput-object p2, p0, Lwp/k;->b:Lwp/i;

    iput-object p3, p0, Lwp/k;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Lwp/k;->a:Lwp/p;

    iget-object v1, p0, Lwp/k;->b:Lwp/i;

    iget-object v2, p0, Lwp/k;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lwp/p;->e(Lwp/p;Lwp/i;Landroid/content/Context;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
