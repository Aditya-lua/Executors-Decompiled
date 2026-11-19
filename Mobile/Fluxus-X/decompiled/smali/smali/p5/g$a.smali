.class public Lp5/g$a;
.super Lp5/q$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/g;->v(Ljava/lang/Object;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:Lp5/g;


# direct methods
.method public constructor <init>(Lp5/g;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lp5/g$a;->b:Lp5/g;

    iput-object p2, p0, Lp5/g$a;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Lp5/q$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lp5/q;)Landroid/graphics/Rect;
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/g$a;->a:Landroid/graphics/Rect;

    return-object p1
.end method
