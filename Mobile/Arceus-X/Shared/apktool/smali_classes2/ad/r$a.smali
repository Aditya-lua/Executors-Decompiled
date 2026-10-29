.class public Lad/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/r;->c(Landroid/view/View;Lad/r$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lad/r$c;

.field public final synthetic b:Lad/r$d;


# direct methods
.method public constructor <init>(Lad/r$c;Lad/r$d;)V
    .locals 0

    iput-object p1, p0, Lad/r$a;->a:Lad/r$c;

    iput-object p2, p0, Lad/r$a;->b:Lad/r$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public K(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3

    iget-object v0, p0, Lad/r$a;->a:Lad/r$c;

    new-instance v1, Lad/r$d;

    iget-object v2, p0, Lad/r$a;->b:Lad/r$d;

    invoke-direct {v1, v2}, Lad/r$d;-><init>(Lad/r$d;)V

    invoke-interface {v0, p1, p2, v1}, Lad/r$c;->a(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;Lad/r$d;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method
