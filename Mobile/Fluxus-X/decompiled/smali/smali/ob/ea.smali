.class public final Lob/ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/v8;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/v8;JZ)V
    .locals 0

    iput-object p2, p0, Lob/ea;->a:Lob/v8;

    iput-wide p3, p0, Lob/ea;->b:J

    iput-boolean p5, p0, Lob/ea;->c:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ea;->d:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lob/ea;->d:Lob/va;

    iget-object v1, p0, Lob/ea;->a:Lob/v8;

    invoke-virtual {v0, v1}, Lob/va;->o(Lob/v8;)V

    iget-boolean v5, p0, Lob/ea;->c:Z

    iget-wide v2, p0, Lob/ea;->b:J

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lob/va;->X(Lob/v8;JZZ)V

    return-void
.end method
