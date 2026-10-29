.class public final synthetic Lkd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lkd/p;


# direct methods
.method public synthetic constructor <init>(Lkd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/m;->a:Lkd/p;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lkd/m;->a:Lkd/p;

    invoke-static {v0, p1, p2}, Lkd/p;->y(Lkd/p;Landroid/view/View;Z)V

    return-void
.end method
