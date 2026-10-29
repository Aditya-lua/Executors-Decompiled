.class public final synthetic Lko/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lko/u;


# direct methods
.method public synthetic constructor <init>(Lko/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/r;->a:Lko/u;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lko/r;->a:Lko/u;

    invoke-static {v0, p1}, Lko/u;->b(Lko/u;Landroid/view/View;)V

    return-void
.end method
