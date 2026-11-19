.class public final synthetic Lrr/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lrr/n;


# direct methods
.method public synthetic constructor <init>(Lrr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/i;->a:Lrr/n;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lrr/i;->a:Lrr/n;

    invoke-static {v0, p1}, Lrr/n;->f(Lrr/n;Landroid/view/View;)V

    return-void
.end method
