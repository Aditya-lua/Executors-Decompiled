.class public final synthetic Lvr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lvr/j;


# direct methods
.method public synthetic constructor <init>(Lvr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvr/f;->a:Lvr/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lvr/f;->a:Lvr/j;

    invoke-static {v0, p1}, Lvr/j;->a(Lvr/j;Landroid/view/View;)V

    return-void
.end method
