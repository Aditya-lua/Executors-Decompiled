.class public final synthetic Lj/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/l$a;


# instance fields
.field public final synthetic a:Lj/l;


# direct methods
.method public synthetic constructor <init>(Lj/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/k;->a:Lj/l;

    return-void
.end method


# virtual methods
.method public final D(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lj/k;->a:Lj/l;

    invoke-virtual {v0, p1}, Lj/l;->n(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
