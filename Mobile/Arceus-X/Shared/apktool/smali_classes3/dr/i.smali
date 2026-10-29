.class public final synthetic Ldr/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ldr/n;


# direct methods
.method public synthetic constructor <init>(Ldr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/i;->a:Ldr/n;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ldr/i;->a:Ldr/n;

    invoke-static {v0, p1}, Ldr/n;->f(Ldr/n;Landroid/view/View;)V

    return-void
.end method
