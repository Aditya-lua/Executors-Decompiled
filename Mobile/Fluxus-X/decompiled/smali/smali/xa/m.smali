.class public final synthetic Lxa/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lxa/p;


# direct methods
.method public synthetic constructor <init>(Lxa/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/m;->a:Lxa/p;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lxa/m;->a:Lxa/p;

    check-cast p1, Lxa/d;

    check-cast p2, Ltb/k;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lxa/g;

    new-instance v1, Ly8/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Ly8/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lxa/o;

    invoke-direct {v2, v0, p2}, Lxa/o;-><init>(Lxa/p;Ltb/k;)V

    invoke-virtual {p1, v1, v2}, Lxa/g;->t2(Ly8/d;Lxa/f;)V

    return-void
.end method
