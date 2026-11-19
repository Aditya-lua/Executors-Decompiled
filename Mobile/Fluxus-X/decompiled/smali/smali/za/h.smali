.class public final synthetic Lza/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lza/o;

.field public final synthetic b:La9/a;


# direct methods
.method public synthetic constructor <init>(Lza/o;La9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/h;->a:Lza/o;

    iput-object p2, p0, Lza/h;->b:La9/a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lza/p;

    check-cast p2, Ltb/k;

    new-instance v0, Lza/k;

    iget-object v1, p0, Lza/h;->a:Lza/o;

    invoke-direct {v0, v1, p2}, Lza/k;-><init>(Lza/o;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lza/h0;

    iget-object p2, p0, Lza/h;->b:La9/a;

    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La9/a;

    invoke-virtual {p1, v0, p2}, Lza/h0;->t2(Lza/z;La9/a;)V

    return-void
.end method
