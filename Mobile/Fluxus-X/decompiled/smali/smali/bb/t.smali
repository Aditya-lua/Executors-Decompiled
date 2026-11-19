.class public final synthetic Lbb/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lbb/b;

.field public final synthetic b:Lf9/d;


# direct methods
.method public synthetic constructor <init>(Lbb/b;Lf9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb/t;->a:Lbb/b;

    iput-object p2, p0, Lbb/t;->b:Lf9/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lbb/g;

    check-cast p2, Ltb/k;

    new-instance v0, Lbb/w;

    iget-object v1, p0, Lbb/t;->a:Lbb/b;

    invoke-direct {v0, v1, p2}, Lbb/w;-><init>(Lbb/b;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lbb/h;

    iget-object p2, p0, Lbb/t;->b:Lf9/d;

    invoke-virtual {p1, v0, p2}, Lbb/h;->v2(Lbb/n;Lf9/d;)V

    return-void
.end method
