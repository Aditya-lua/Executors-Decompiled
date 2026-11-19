.class public final synthetic Lla/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lla/p;

.field public final synthetic b:Lla/q;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lla/p;Lla/q;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/o;->a:Lla/p;

    iput-object p2, p0, Lla/o;->b:Lla/q;

    iput-object p3, p0, Lla/o;->c:Ljava/util/List;

    iput-object p4, p0, Lla/o;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Ltb/k;

    check-cast p1, Lla/t;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lla/u;

    new-instance v0, Lla/k;

    iget-object v1, p0, Lla/o;->a:Lla/p;

    invoke-direct {v0, v1, p2}, Lla/k;-><init>(Lla/p;Ltb/k;)V

    iget-object p2, p0, Lla/o;->b:Lla/q;

    iget-object v1, p0, Lla/o;->c:Ljava/util/List;

    iget-object v2, p0, Lla/o;->d:Ljava/util/List;

    invoke-virtual {p1, v0, p2, v1, v2}, Lla/u;->t2(Lla/w;Lla/q;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
