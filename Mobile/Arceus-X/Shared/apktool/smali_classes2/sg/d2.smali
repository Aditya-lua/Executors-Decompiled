.class public final synthetic Lsg/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/d2;->a:Landroid/view/View;

    iput p2, p0, Lsg/d2;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lsg/d2;->a:Landroid/view/View;

    iget v1, p0, Lsg/d2;->b:I

    invoke-static {v0, v1}, Lsg/e2;->a(Landroid/view/View;I)V

    return-void
.end method
