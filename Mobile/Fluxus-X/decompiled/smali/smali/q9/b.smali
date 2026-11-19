.class public final synthetic Lq9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lo9/w;


# direct methods
.method public synthetic constructor <init>(Lo9/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/b;->a:Lo9/w;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lq9/e;

    check-cast p2, Ltb/k;

    sget-object v0, Lq9/d;->k:Ll9/a$g;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lq9/a;

    iget-object v0, p0, Lq9/b;->a:Lo9/w;

    invoke-virtual {p1, v0}, Lq9/a;->u2(Lo9/w;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
