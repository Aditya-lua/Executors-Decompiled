.class public final synthetic Lkd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lkd/f;


# direct methods
.method public synthetic constructor <init>(Lkd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/b;->a:Lkd/f;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lkd/b;->a:Lkd/f;

    invoke-static {v0, p1, p2}, Lkd/f;->w(Lkd/f;Landroid/view/View;Z)V

    return-void
.end method
