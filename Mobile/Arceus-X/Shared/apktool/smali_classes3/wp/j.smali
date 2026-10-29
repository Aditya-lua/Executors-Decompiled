.class public final synthetic Lwp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lwp/i;

.field public final synthetic b:Lxp/b;


# direct methods
.method public synthetic constructor <init>(Lwp/i;Lxp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/j;->a:Lwp/i;

    iput-object p2, p0, Lwp/j;->b:Lxp/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lwp/j;->a:Lwp/i;

    iget-object v1, p0, Lwp/j;->b:Lxp/b;

    invoke-static {v0, v1, p1}, Lwp/p;->c(Lwp/i;Lxp/b;Landroid/view/View;)V

    return-void
.end method
