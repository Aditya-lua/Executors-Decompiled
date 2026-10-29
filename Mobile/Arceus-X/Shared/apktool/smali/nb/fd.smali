.class public final Lnb/fd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:J

.field public final b:J

.field public final synthetic c:Lnb/gd;


# direct methods
.method public constructor <init>(Lnb/gd;JJ)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/fd;->c:Lnb/gd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lnb/fd;->a:J

    iput-wide p4, p0, Lnb/fd;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/fd;->c:Lnb/gd;

    iget-object v0, v0, Lnb/gd;->b:Lnb/ld;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/ed;

    invoke-direct {v1, p0}, Lnb/ed;-><init>(Lnb/fd;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
