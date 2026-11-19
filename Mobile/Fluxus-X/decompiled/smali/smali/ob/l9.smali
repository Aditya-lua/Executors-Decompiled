.class public final Lob/l9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;J)V
    .locals 0

    iput-wide p2, p0, Lob/l9;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/l9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/l9;->b:Lob/va;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    iget-object v1, v1, Lob/p6;->l:Lob/m6;

    iget-wide v2, p0, Lob/l9;->a:J

    invoke-virtual {v1, v2, v3}, Lob/m6;->b(J)V

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    const-string v1, "Session timeout duration set"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
