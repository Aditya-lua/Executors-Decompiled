.class public Lbd/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd/r;->c(Landroid/view/View;Lbd/r$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbd/r$c;

.field public final synthetic b:Lbd/r$d;


# direct methods
.method public constructor <init>(Lbd/r$c;Lbd/r$d;)V
    .locals 0

    iput-object p1, p0, Lbd/r$a;->a:Lbd/r$c;

    iput-object p2, p0, Lbd/r$a;->b:Lbd/r$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3

    iget-object v0, p0, Lbd/r$a;->a:Lbd/r$c;

    new-instance v1, Lbd/r$d;

    iget-object v2, p0, Lbd/r$a;->b:Lbd/r$d;

    invoke-direct {v1, v2}, Lbd/r$d;-><init>(Lbd/r$d;)V

    invoke-interface {v0, p1, p2, v1}, Lbd/r$c;->a(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;Lbd/r$d;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method
