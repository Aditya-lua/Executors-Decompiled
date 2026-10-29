.class public final Lnb/gb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bb;

.field public final synthetic b:J

.field public final synthetic c:Lnb/jb;


# direct methods
.method public constructor <init>(Lnb/jb;Lnb/bb;J)V
    .locals 0

    iput-object p2, p0, Lnb/gb;->a:Lnb/bb;

    iput-wide p3, p0, Lnb/gb;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/gb;->c:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lnb/gb;->c:Lnb/jb;

    iget-object v1, p0, Lnb/gb;->a:Lnb/bb;

    const/4 v2, 0x0

    iget-wide v3, p0, Lnb/gb;->b:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lnb/jb;->C(Lnb/bb;ZJ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lnb/jb;->e:Lnb/bb;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnb/tc;->u(Lnb/bb;)V

    return-void
.end method
