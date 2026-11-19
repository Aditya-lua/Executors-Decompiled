.class public final synthetic Lab/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lab/b;


# direct methods
.method public synthetic constructor <init>(Lab/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/j;->a:Lab/b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lab/i;

    check-cast p2, Ltb/k;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lab/f;

    new-instance v0, Lab/k;

    iget-object v1, p0, Lab/j;->a:Lab/b;

    invoke-direct {v0, v1, p2}, Lab/k;-><init>(Lab/b;Ltb/k;)V

    invoke-virtual {p1, v0}, Lab/f;->t2(Lab/h;)V

    return-void
.end method
