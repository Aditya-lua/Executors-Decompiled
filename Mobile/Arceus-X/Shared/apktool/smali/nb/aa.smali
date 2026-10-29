.class public final Lnb/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/q8;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lnb/q8;JZ)V
    .locals 0

    iput-object p2, p0, Lnb/aa;->a:Lnb/q8;

    iput-wide p3, p0, Lnb/aa;->b:J

    iput-boolean p5, p0, Lnb/aa;->c:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/aa;->d:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lnb/aa;->d:Lnb/qa;

    iget-object v1, p0, Lnb/aa;->a:Lnb/q8;

    invoke-virtual {v0, v1}, Lnb/qa;->o(Lnb/q8;)V

    iget-boolean v5, p0, Lnb/aa;->c:Z

    iget-wide v2, p0, Lnb/aa;->b:J

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lnb/qa;->X(Lnb/q8;JZZ)V

    return-void
.end method
