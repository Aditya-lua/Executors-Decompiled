.class public final synthetic Lt9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lt9/v;

.field public final synthetic b:Lt9/a;


# direct methods
.method public synthetic constructor <init>(Lt9/v;Lt9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/p;->a:Lt9/v;

    iput-object p2, p0, Lt9/p;->b:Lt9/a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lt9/w;

    check-cast p2, Ltb/k;

    new-instance v0, Lt9/s;

    iget-object v1, p0, Lt9/p;->a:Lt9/v;

    invoke-direct {v0, v1, p2}, Lt9/s;-><init>(Lt9/v;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lt9/i;

    iget-object p2, p0, Lt9/p;->b:Lt9/a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lt9/i;->v2(Lt9/h;Lt9/a;Lt9/k;)V

    return-void
.end method
