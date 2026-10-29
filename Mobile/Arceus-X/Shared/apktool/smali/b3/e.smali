.class public final synthetic Lb3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/y;


# instance fields
.field public final synthetic a:Lb3/g;


# direct methods
.method public synthetic constructor <init>(Lb3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/e;->a:Lb3/g;

    return-void
.end method


# virtual methods
.method public final K(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1

    iget-object v0, p0, Lb3/e;->a:Lb3/g;

    invoke-static {v0, p1, p2}, Lb3/g;->b(Lb3/g;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method
