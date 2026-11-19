.class public final synthetic Lt9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lt9/v;

.field public final synthetic b:Lt9/d;


# direct methods
.method public synthetic constructor <init>(Lt9/v;Lt9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/m;->a:Lt9/v;

    iput-object p2, p0, Lt9/m;->b:Lt9/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lt9/w;

    check-cast p2, Ltb/k;

    new-instance v0, Lt9/u;

    iget-object v1, p0, Lt9/m;->a:Lt9/v;

    invoke-direct {v0, v1, p2}, Lt9/u;-><init>(Lt9/v;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lt9/i;

    iget-object p2, p0, Lt9/m;->b:Lt9/d;

    invoke-virtual {p1, v0, p2}, Lt9/i;->w2(Lm9/g;Lt9/k;)V

    return-void
.end method
