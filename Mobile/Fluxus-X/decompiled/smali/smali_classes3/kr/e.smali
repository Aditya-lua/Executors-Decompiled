.class public final synthetic Lkr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkr/e;->a:Landroid/view/View;

    iput-boolean p2, p0, Lkr/e;->b:Z

    iput-boolean p3, p0, Lkr/e;->c:Z

    iput-boolean p4, p0, Lkr/e;->d:Z

    iput-boolean p5, p0, Lkr/e;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lkr/e;->a:Landroid/view/View;

    iget-boolean v1, p0, Lkr/e;->b:Z

    iget-boolean v2, p0, Lkr/e;->c:Z

    iget-boolean v3, p0, Lkr/e;->d:Z

    iget-boolean v4, p0, Lkr/e;->e:Z

    move-object v5, p1

    check-cast v5, Landroidx/core/view/WindowInsetsCompat;

    invoke-static/range {v0 .. v5}, Lkr/g;->b(Landroid/view/View;ZZZZLandroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
