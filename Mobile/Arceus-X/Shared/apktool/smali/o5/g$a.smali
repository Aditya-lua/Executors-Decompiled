.class public Lo5/g$a;
.super Lo5/q$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/g;->v(Ljava/lang/Object;Landroid/view/View;)V
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

    iput-object p1, p0, Lo5/g$a;->b:Lo5/g;

    iput-object p2, p0, Lo5/g$a;->a:Landroid/graphics/Rect;

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

    iget-object p1, p0, Lo5/g$a;->a:Landroid/graphics/Rect;

    return-object p1
.end method
