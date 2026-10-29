.class public Lei/e;
.super Lei/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei/l;[Lei/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p4, p5}, Lei/a;-><init>(Ljava/lang/String;Lei/l;[Lei/c$a;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    iput-object p2, p0, Lei/a;->e:Ljava/lang/String;

    iput-object p3, p0, Lei/a;->f:Ljava/lang/String;

    return-void
.end method
