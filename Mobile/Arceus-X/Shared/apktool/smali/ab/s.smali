.class public final synthetic Lab/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lab/b;


# direct methods
.method public synthetic constructor <init>(Lab/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/s;->a:Lab/b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lab/g;

    check-cast p2, Lsb/k;

    new-instance v0, Lab/y;

    iget-object v1, p0, Lab/s;->a:Lab/b;

    invoke-direct {v0, v1, p2}, Lab/y;-><init>(Lab/b;Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lab/h;

    invoke-virtual {p1, v0}, Lab/h;->u2(Lab/l;)V

    return-void
.end method
