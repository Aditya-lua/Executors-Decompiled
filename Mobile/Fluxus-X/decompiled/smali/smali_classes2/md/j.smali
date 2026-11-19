.class public final synthetic Lmd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/j;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lmd/j;->a:Lmd/p;

    invoke-static {v0, p1, p2}, Lmd/p;->z(Lmd/p;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
