.class public final Lce/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lce/j;


# direct methods
.method public synthetic constructor <init>(Lce/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lce/j;)Lce/f0;
    .locals 0

    iput-object p1, p0, Lce/f0;->a:Lce/j;

    return-object p0
.end method

.method public final b()Lce/s0;
    .locals 3

    iget-object v0, p0, Lce/f0;->a:Lce/j;

    if-eqz v0, :cond_0

    new-instance v1, Lce/h0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lce/h0;-><init>(Lce/j;Lce/g0;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-class v1, Lce/j;

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
