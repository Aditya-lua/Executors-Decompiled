.class public final Lob/q9;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/q9;->e:Lob/va;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lob/q9;->e:Lob/va;

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/va;->c0()Lob/z;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lob/z;->b(J)V

    :cond_0
    return-void
.end method
