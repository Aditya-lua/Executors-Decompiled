.class public final Lob/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/d2;


# direct methods
.method public constructor <init>(Lob/d2;J)V
    .locals 0

    iput-wide p2, p0, Lob/c1;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/c1;->b:Lob/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/c1;->b:Lob/d2;

    iget-wide v1, p0, Lob/c1;->a:J

    invoke-virtual {v0, v1, v2}, Lob/d2;->n(J)V

    return-void
.end method
