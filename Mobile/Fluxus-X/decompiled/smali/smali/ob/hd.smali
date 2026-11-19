.class public final Lob/hd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/qd;


# direct methods
.method public constructor <init>(Lob/qd;J)V
    .locals 0

    iput-wide p2, p0, Lob/hd;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/hd;->b:Lob/qd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/hd;->b:Lob/qd;

    iget-wide v1, p0, Lob/hd;->a:J

    invoke-virtual {v0, v1, v2}, Lob/qd;->r(J)V

    return-void
.end method
