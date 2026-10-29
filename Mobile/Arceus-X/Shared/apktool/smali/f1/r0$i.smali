.class public final Lf1/r0$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lf1/s$a;

.field public b:I

.field public c:Ljava/util/concurrent/Executor;

.field public d:Lm1/o;

.field public e:Lm1/o;

.field public f:Lh1/f$a;

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lf1/r0$i;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/r0$i;->c:Ljava/util/concurrent/Executor;

    sget-object v0, Lf1/r0;->w0:Lm1/o;

    iput-object v0, p0, Lf1/r0$i;->d:Lm1/o;

    iput-object v0, p0, Lf1/r0$i;->e:Lm1/o;

    invoke-static {}, Lf1/r0;->x()Lh1/f$a;

    move-result-object v0

    iput-object v0, p0, Lf1/r0$i;->f:Lh1/f$a;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lf1/r0$i;->g:J

    invoke-static {}, Lf1/s;->a()Lf1/s$a;

    move-result-object v0

    iput-object v0, p0, Lf1/r0$i;->a:Lf1/s$a;

    return-void
.end method

.method public static synthetic a(Lf1/a0;Lf1/c2$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lf1/c2$a;->e(Lf1/a0;)Lf1/c2$a;

    return-void
.end method

.method public static synthetic b(ILf1/c2$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lf1/c2$a;->b(I)Lf1/c2$a;

    return-void
.end method


# virtual methods
.method public c()Lf1/r0;
    .locals 9

    new-instance v0, Lf1/r0;

    iget-object v1, p0, Lf1/r0$i;->c:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lf1/r0$i;->a:Lf1/s$a;

    invoke-virtual {v2}, Lf1/s$a;->a()Lf1/s;

    move-result-object v2

    iget v3, p0, Lf1/r0$i;->b:I

    iget-object v4, p0, Lf1/r0$i;->d:Lm1/o;

    iget-object v5, p0, Lf1/r0$i;->e:Lm1/o;

    iget-object v6, p0, Lf1/r0$i;->f:Lh1/f$a;

    iget-wide v7, p0, Lf1/r0$i;->g:J

    invoke-direct/range {v0 .. v8}, Lf1/r0;-><init>(Ljava/util/concurrent/Executor;Lf1/s;ILm1/o;Lm1/o;Lh1/f$a;J)V

    return-object v0
.end method

.method public d(I)Lf1/r0$i;
    .locals 2

    iget-object v0, p0, Lf1/r0$i;->a:Lf1/s$a;

    new-instance v1, Lf1/s0;

    invoke-direct {v1, p1}, Lf1/s0;-><init>(I)V

    invoke-virtual {v0, v1}, Lf1/s$a;->b(Lx2/a;)Lf1/s$a;

    return-object p0
.end method

.method public e(Ljava/util/concurrent/Executor;)Lf1/r0$i;
    .locals 1

    const-string v0, "The specified executor can\'t be null."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lf1/r0$i;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public f(Lf1/a0;)Lf1/r0$i;
    .locals 2

    const-string v0, "The specified quality selector can\'t be null."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf1/r0$i;->a:Lf1/s$a;

    new-instance v1, Lf1/t0;

    invoke-direct {v1, p1}, Lf1/t0;-><init>(Lf1/a0;)V

    invoke-virtual {v0, v1}, Lf1/s$a;->b(Lx2/a;)Lf1/s$a;

    return-object p0
.end method
