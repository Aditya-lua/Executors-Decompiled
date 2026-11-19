.class public final synthetic Lgb/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lgb/b2;

.field public final synthetic b:Lgb/d2;


# direct methods
.method public synthetic constructor <init>(Lgb/b2;Lgb/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/a2;->a:Lgb/b2;

    iput-object p2, p0, Lgb/a2;->b:Lgb/d2;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ltb/k;

    check-cast p1, Lgb/c2;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lgb/j2;

    new-instance v0, Lgb/z1;

    iget-object v1, p0, Lgb/a2;->a:Lgb/b2;

    invoke-direct {v0, v1, p2}, Lgb/z1;-><init>(Lgb/b2;Ltb/k;)V

    iget-object p2, p0, Lgb/a2;->b:Lgb/d2;

    invoke-virtual {p1, v0, p2}, Lgb/j2;->t2(Lgb/i2;Lgb/d2;)V

    return-void
.end method
