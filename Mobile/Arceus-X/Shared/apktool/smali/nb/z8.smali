.class public final Lnb/z8;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/z8;->e:Lnb/qa;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lnb/z8;->e:Lnb/qa;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->B()Lnb/qa;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lnb/y8;

    invoke-direct {v2, v1}, Lnb/y8;-><init>(Lnb/qa;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
