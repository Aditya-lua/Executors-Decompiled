.class public final Lnb/k7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p2, p0, Lnb/k7;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/k7;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/k7;->c:Ljava/lang/String;

    iput-wide p5, p0, Lnb/k7;->d:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/k7;->e:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lnb/k7;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/k7;->e:Lnb/i8;

    iget-object v1, p0, Lnb/k7;->b:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnb/me;->t0(Ljava/lang/String;Lnb/bb;)V

    return-void

    :cond_0
    iget-object v1, p0, Lnb/k7;->c:Ljava/lang/String;

    iget-wide v2, p0, Lnb/k7;->d:J

    new-instance v4, Lnb/bb;

    invoke-direct {v4, v1, v0, v2, v3}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lnb/k7;->e:Lnb/i8;

    iget-object v1, p0, Lnb/k7;->b:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    invoke-virtual {v0, v1, v4}, Lnb/me;->t0(Ljava/lang/String;Lnb/bb;)V

    return-void
.end method
