.class public final synthetic Lca/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lca/a;

.field public final synthetic b:Lda/r;


# direct methods
.method public synthetic constructor <init>(Lca/a;Lda/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/b;->a:Lca/a;

    iput-object p2, p0, Lca/b;->b:Lda/r;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lfb/t4;

    check-cast p2, Ltb/k;

    new-instance v0, Lca/c;

    iget-object v1, p0, Lca/b;->a:Lca/a;

    invoke-direct {v0, v1, p2}, Lca/c;-><init>(Lca/a;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lfb/w4;

    iget-object p2, p0, Lca/b;->b:Lda/r;

    invoke-virtual {p1, v0, p2}, Lfb/w4;->t2(Lfb/v4;Lda/r;)V

    return-void
.end method
