.class public abstract Ltd/m0;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;)V
    .locals 0

    iput-object p1, p0, Ltd/m0;->b:Ltd/n0;

    invoke-direct {p0, p2}, Lee/u0;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lee/g;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lee/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Ltd/m0;->b:Ltd/n0;

    invoke-static {v0}, Ltd/n0;->j(Ltd/n0;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ltd/b;

    const/4 v1, -0x2

    invoke-direct {v0, v1, p1}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lee/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    new-instance v0, Ltd/b;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Ltd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lee/u0;->a(Ljava/lang/Exception;)V

    return-void
.end method
