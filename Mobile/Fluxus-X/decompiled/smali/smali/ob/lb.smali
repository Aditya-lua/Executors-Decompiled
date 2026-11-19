.class public final Lob/lb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/gb;

.field public final synthetic b:J

.field public final synthetic c:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;Lob/gb;J)V
    .locals 0

    iput-object p2, p0, Lob/lb;->a:Lob/gb;

    iput-wide p3, p0, Lob/lb;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/lb;->c:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lob/lb;->c:Lob/ob;

    iget-object v1, p0, Lob/lb;->a:Lob/gb;

    const/4 v2, 0x0

    iget-wide v3, p0, Lob/lb;->b:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lob/ob;->C(Lob/gb;ZJ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lob/ob;->e:Lob/gb;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    invoke-virtual {v0, v1}, Lob/yc;->u(Lob/gb;)V

    return-void
.end method
