.class public final Ln0/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/c2;


# instance fields
.field public final d:J

.field public final e:Lg0/c2;


# direct methods
.method public constructor <init>(JLg0/c2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Timeout must be non-negative."

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    iput-wide p1, p0, Ln0/b4;->d:J

    iput-object p3, p0, Ln0/b4;->e:Lg0/c2;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Ln0/b4;->d:J

    return-wide v0
.end method

.method public e(Lg0/c2$b;)Lg0/c2$c;
    .locals 7

    iget-object v0, p0, Ln0/b4;->e:Lg0/c2;

    invoke-interface {v0, p1}, Lg0/c2;->e(Lg0/c2$b;)Lg0/c2$c;

    move-result-object v0

    invoke-virtual {p0}, Ln0/b4;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    invoke-interface {p1}, Lg0/c2$b;->o()J

    move-result-wide v1

    invoke-virtual {p0}, Ln0/b4;->a()J

    move-result-wide v3

    invoke-virtual {v0}, Lg0/c2$c;->b()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long p1, v1, v3

    if-ltz p1, :cond_0

    sget-object p1, Lg0/c2$c;->d:Lg0/c2$c;

    return-object p1

    :cond_0
    return-object v0
.end method
