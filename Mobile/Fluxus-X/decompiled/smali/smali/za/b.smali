.class public final synthetic Lza/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lza/e;

.field public final synthetic b:La9/g;


# direct methods
.method public synthetic constructor <init>(Lza/e;La9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/b;->a:Lza/e;

    iput-object p2, p0, Lza/b;->b:La9/g;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lza/x;

    check-cast p2, Ltb/k;

    new-instance v0, Lza/d;

    iget-object v1, p0, Lza/b;->a:Lza/e;

    invoke-direct {v0, v1, p2}, Lza/d;-><init>(Lza/e;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lza/a0;

    iget-object p2, p0, Lza/b;->b:La9/g;

    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La9/g;

    invoke-virtual {p1, v0, p2}, Lza/a0;->t2(Lza/g0;La9/g;)V

    return-void
.end method
