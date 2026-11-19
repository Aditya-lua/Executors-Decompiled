.class public final Lm9/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm9/f1;


# direct methods
.method public constructor <init>(Lm9/f1;)V
    .locals 0

    iput-object p1, p0, Lm9/c1;->a:Lm9/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm9/c1;->a:Lm9/f1;

    invoke-static {v0}, Lm9/f1;->s2(Lm9/f1;)Lm9/e1;

    move-result-object v0

    new-instance v1, Lk9/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lk9/b;-><init>(I)V

    invoke-interface {v0, v1}, Lm9/e1;->a(Lk9/b;)V

    return-void
.end method
