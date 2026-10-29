.class public final Lnb/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lnb/e6;


# direct methods
.method public constructor <init>(Lnb/e6;Z)V
    .locals 0

    iput-boolean p2, p0, Lnb/d6;->a:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/d6;->b:Lnb/e6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/d6;->b:Lnb/e6;

    invoke-virtual {v0}, Lnb/e6;->c()Lnb/me;

    move-result-object v0

    iget-boolean v1, p0, Lnb/d6;->a:Z

    invoke-virtual {v0, v1}, Lnb/me;->s0(Z)V

    return-void
.end method
