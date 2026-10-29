.class public final synthetic Lsg/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/y;


# instance fields
.field public final synthetic a:Lsg/y1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lsg/y1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/q1;->a:Lsg/y1;

    iput p2, p0, Lsg/q1;->b:I

    return-void
.end method


# virtual methods
.method public final K(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 2

    iget-object v0, p0, Lsg/q1;->a:Lsg/y1;

    iget v1, p0, Lsg/q1;->b:I

    invoke-static {v0, v1, p1, p2}, Lsg/y1;->h2(Lsg/y1;ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method
