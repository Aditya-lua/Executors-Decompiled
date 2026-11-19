.class public final Lob/e9;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/e9;->e:Lob/va;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lob/e9;->e:Lob/va;

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->B()Lob/va;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lob/d9;

    invoke-direct {v2, v1}, Lob/d9;-><init>(Lob/va;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
