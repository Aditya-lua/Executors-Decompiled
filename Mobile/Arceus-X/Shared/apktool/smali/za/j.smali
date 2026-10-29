.class public final synthetic Lza/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lza/b;


# direct methods
.method public synthetic constructor <init>(Lza/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/j;->a:Lza/b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lza/i;

    check-cast p2, Lsb/k;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lza/f;

    new-instance v0, Lza/k;

    iget-object v1, p0, Lza/j;->a:Lza/b;

    invoke-direct {v0, v1, p2}, Lza/k;-><init>(Lza/b;Lsb/k;)V

    invoke-virtual {p1, v0}, Lza/f;->t2(Lza/h;)V

    return-void
.end method
