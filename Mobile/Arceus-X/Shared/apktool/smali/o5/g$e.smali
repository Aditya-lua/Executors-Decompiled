.class public Lo5/g$e;
.super Lo5/q$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/g;->u(Ljava/lang/Object;Landroid/graphics/Rect;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:Lo5/g;


# direct methods
.method public constructor <init>(Lo5/g;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lo5/g$e;->b:Lo5/g;

    iput-object p2, p0, Lo5/g$e;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Lo5/q$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo5/q;)Landroid/graphics/Rect;
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lo5/g$e;->a:Landroid/graphics/Rect;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo5/g$e;->a:Landroid/graphics/Rect;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
