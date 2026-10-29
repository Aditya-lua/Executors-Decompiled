.class public final synthetic Le4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le4/j0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Le4/j0;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/g;->a:Le4/j0;

    iput-object p2, p0, Le4/g;->b:Landroid/view/View;

    iput-object p3, p0, Le4/g;->c:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le4/g;->a:Le4/j0;

    iget-object v1, p0, Le4/g;->b:Landroid/view/View;

    iget-object v2, p0, Le4/g;->c:Landroid/graphics/Rect;

    invoke-static {v0, v1, v2}, Landroidx/fragment/app/b$g;->i(Le4/j0;Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
