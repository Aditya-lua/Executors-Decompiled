.class public final synthetic Les/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/f2;


# direct methods
.method public synthetic constructor <init>(Les/f2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/d2;->a:Les/f2;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Les/d2;->a:Les/f2;

    invoke-static {v0, p1}, Les/f2;->f(Les/f2;Landroid/view/View;)V

    return-void
.end method
