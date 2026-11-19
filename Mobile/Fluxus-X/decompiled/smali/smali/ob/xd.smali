.class public final Lob/xd;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/yd;


# direct methods
.method public constructor <init>(Lob/yd;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/xd;->e:Lob/yd;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lob/xd;->e:Lob/yd;

    invoke-virtual {v0}, Lob/yd;->n()V

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Starting upload from DelayedRunnable"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v0, v0, Lob/zd;->b:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->r()V

    return-void
.end method
