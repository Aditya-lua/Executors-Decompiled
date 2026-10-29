.class public Lj/t$b;
.super Landroidx/core/view/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/t;


# direct methods
.method public constructor <init>(Lj/t;)V
    .locals 0

    iput-object p1, p0, Lj/t$b;->a:Lj/t;

    invoke-direct {p0}, Landroidx/core/view/a1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj/t$b;->a:Lj/t;

    const/4 v0, 0x0

    iput-object v0, p1, Lj/t;->y:Lo/h;

    iget-object p1, p1, Lj/t;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
