.class public final Lsw/q$c;
.super Lmv/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final d:Lmv/b0;

.field public final e:J


# direct methods
.method public constructor <init>(Lmv/b0;J)V
    .locals 0

    invoke-direct {p0}, Lmv/i0;-><init>()V

    iput-object p1, p0, Lsw/q$c;->d:Lmv/b0;

    iput-wide p2, p0, Lsw/q$c;->e:J

    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    iget-wide v0, p0, Lsw/q$c;->e:J

    return-wide v0
.end method

.method public f()Lmv/b0;
    .locals 1

    iget-object v0, p0, Lsw/q$c;->d:Lmv/b0;

    return-object v0
.end method

.method public l3()Lew/g;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read raw response body of a converted body."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
