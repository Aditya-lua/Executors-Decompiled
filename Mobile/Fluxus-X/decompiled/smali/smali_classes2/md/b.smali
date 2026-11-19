.class public final synthetic Lmd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lmd/f;


# direct methods
.method public synthetic constructor <init>(Lmd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/b;->a:Lmd/f;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lmd/b;->a:Lmd/f;

    invoke-static {v0, p1, p2}, Lmd/f;->w(Lmd/f;Landroid/view/View;Z)V

    return-void
.end method
