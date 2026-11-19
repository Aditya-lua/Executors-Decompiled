.class public final synthetic Lmd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/m;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lmd/m;->a:Lmd/p;

    invoke-static {v0, p1, p2}, Lmd/p;->y(Lmd/p;Landroid/view/View;Z)V

    return-void
.end method
