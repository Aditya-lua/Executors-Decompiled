.class public final Lae/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lae/j;


# direct methods
.method public synthetic constructor <init>(Lae/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lae/j;)Lae/f0;
    .locals 0

    iput-object p1, p0, Lae/f0;->a:Lae/j;

    return-object p0
.end method

.method public final b()Lae/s0;
    .locals 3

    iget-object v0, p0, Lae/f0;->a:Lae/j;

    if-eqz v0, :cond_0

    new-instance v1, Lae/h0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lae/h0;-><init>(Lae/j;Lae/g0;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-class v1, Lae/j;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
