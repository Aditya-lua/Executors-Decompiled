.class public final synthetic La3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/c$b;


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/b;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(La3/d;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, La3/b;->a:Landroid/view/View;

    invoke-static {v0, p1, p2, p3}, La3/c;->a(Landroid/view/View;La3/d;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
