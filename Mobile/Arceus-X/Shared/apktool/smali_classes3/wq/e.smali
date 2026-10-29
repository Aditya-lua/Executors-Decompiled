.class public final synthetic Lwq/e;
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

    iput-object p1, p0, Lwq/e;->a:Landroid/view/View;

    iput-boolean p2, p0, Lwq/e;->b:Z

    iput-boolean p3, p0, Lwq/e;->c:Z

    iput-boolean p4, p0, Lwq/e;->d:Z

    iput-boolean p5, p0, Lwq/e;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lwq/e;->a:Landroid/view/View;

    iget-boolean v1, p0, Lwq/e;->b:Z

    iget-boolean v2, p0, Lwq/e;->c:Z

    iget-boolean v3, p0, Lwq/e;->d:Z

    iget-boolean v4, p0, Lwq/e;->e:Z

    move-object v5, p1

    check-cast v5, Landroidx/core/view/WindowInsetsCompat;

    invoke-static/range {v0 .. v5}, Lwq/g;->b(Landroid/view/View;ZZZZLandroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
