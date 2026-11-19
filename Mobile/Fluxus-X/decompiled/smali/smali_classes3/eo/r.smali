.class public Leo/r;
.super Leo/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leo/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leo/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Leo/d0;->t(Leo/r;)V

    return-void
.end method

.method public c(Leo/s;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Leo/s;->c(Leo/s;)V

    return-void
.end method

.method public p(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Leo/r;->h:Ljava/lang/Integer;

    return-void
.end method

.method public q(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Leo/r;->g:Ljava/lang/Integer;

    return-void
.end method
