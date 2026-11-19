.class public final synthetic Lla/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lla/p;

.field public final synthetic b:Lla/q;

.field public final synthetic c:Lla/h;


# direct methods
.method public synthetic constructor <init>(Lla/p;Lla/q;Lla/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/n;->a:Lla/p;

    iput-object p2, p0, Lla/n;->b:Lla/q;

    iput-object p3, p0, Lla/n;->c:Lla/h;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ltb/k;

    check-cast p1, Lla/t;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lla/u;

    new-instance v0, Lla/l;

    iget-object v1, p0, Lla/n;->a:Lla/p;

    invoke-direct {v0, v1, p2}, Lla/l;-><init>(Lla/p;Ltb/k;)V

    iget-object p2, p0, Lla/n;->b:Lla/q;

    iget-object v1, p0, Lla/n;->c:Lla/h;

    invoke-virtual {p1, v0, p2, v1}, Lla/u;->u2(Lla/w;Lla/q;Lla/h;)V

    return-void
.end method
