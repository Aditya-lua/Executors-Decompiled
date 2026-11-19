.class public final synthetic Lf4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lf4/f$a;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Lf4/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/e;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Lf4/e;->b:Landroid/view/View;

    iput-object p3, p0, Lf4/e;->c:Lf4/f$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf4/e;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lf4/e;->b:Landroid/view/View;

    iget-object v2, p0, Lf4/e;->c:Lf4/f$a;

    invoke-static {v0, v1, v2}, Lf4/f$a$a;->a(Landroid/view/ViewGroup;Landroid/view/View;Lf4/f$a;)V

    return-void
.end method
