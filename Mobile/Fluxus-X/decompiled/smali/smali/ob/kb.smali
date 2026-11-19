.class public final Lob/kb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;J)V
    .locals 0

    iput-wide p2, p0, Lob/kb;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/kb;->b:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/kb;->b:Lob/ob;

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->M()Lob/d2;

    move-result-object v1

    iget-wide v2, p0, Lob/kb;->a:J

    invoke-virtual {v1, v2, v3}, Lob/d2;->k(J)V

    const/4 v1, 0x0

    iput-object v1, v0, Lob/ob;->e:Lob/gb;

    return-void
.end method
