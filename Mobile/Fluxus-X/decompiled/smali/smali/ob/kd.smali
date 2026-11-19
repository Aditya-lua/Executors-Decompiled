.class public final Lob/kd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:J

.field public final b:J

.field public final synthetic c:Lob/ld;


# direct methods
.method public constructor <init>(Lob/ld;JJ)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/kd;->c:Lob/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lob/kd;->a:J

    iput-wide p4, p0, Lob/kd;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/kd;->c:Lob/ld;

    iget-object v0, v0, Lob/ld;->b:Lob/qd;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/jd;

    invoke-direct {v1, p0}, Lob/jd;-><init>(Lob/kd;)V

    invoke-virtual {v0, v1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
