.class public final synthetic Lf4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/w0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Lf4/w0;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/k;->a:Lf4/w0;

    iput-object p2, p0, Lf4/k;->b:Landroid/view/View;

    iput-object p3, p0, Lf4/k;->c:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf4/k;->a:Lf4/w0;

    iget-object v1, p0, Lf4/k;->b:Landroid/view/View;

    iget-object v2, p0, Lf4/k;->c:Landroid/graphics/Rect;

    invoke-static {v0, v1, v2}, Lf4/f$g;->i(Lf4/w0;Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
