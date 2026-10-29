.class public final Lnb/l9;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/l9;->e:Lnb/qa;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lnb/l9;->e:Lnb/qa;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/qa;->c0()Lnb/w;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lnb/w;->b(J)V

    :cond_0
    return-void
.end method
