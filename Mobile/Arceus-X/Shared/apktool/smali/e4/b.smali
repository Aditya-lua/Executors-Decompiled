.class public final synthetic Le4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroidx/fragment/app/b$a;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/b;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Le4/b;->b:Landroid/view/View;

    iput-object p3, p0, Le4/b;->c:Landroidx/fragment/app/b$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le4/b;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Le4/b;->b:Landroid/view/View;

    iget-object v2, p0, Le4/b;->c:Landroidx/fragment/app/b$a;

    invoke-static {v0, v1, v2}, Landroidx/fragment/app/b$a$a;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/b$a;)V

    return-void
.end method
