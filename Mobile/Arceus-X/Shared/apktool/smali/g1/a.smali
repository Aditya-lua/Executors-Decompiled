.class public final Lg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4;
.implements Ln0/i2;
.implements Ls0/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lf1/a2;",
        ">",
        "Ljava/lang/Object;",
        "Ln0/i4<",
        "Lf1/p1<",
        "TT;>;>;",
        "Ln0/i2;",
        "Ls0/r;"
    }
.end annotation


# static fields
.field public static final Q:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lf1/a2;",
            ">;"
        }
    .end annotation
.end field

.field public static final R:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lm1/r1$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final S:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final P:Ln0/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.video.VideoCapture.videoOutput"

    const-class v1, Lf1/a2;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg1/a;->Q:Ln0/n1$a;

    const-string v0, "camerax.video.VideoCapture.videoEncoderInfoFinder"

    const-class v1, Lm1/r1$a;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg1/a;->R:Ln0/n1$a;

    const-string v0, "camerax.video.VideoCapture.forceEnableSurfaceProcessing"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg1/a;->S:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ln0/c3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lg1/a;->Q:Ln0/n1$a;

    invoke-virtual {p1, v0}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v0

    invoke-static {v0}, Lx2/g;->a(Z)V

    iput-object p1, p0, Lg1/a;->P:Ln0/c3;

    return-void
.end method


# virtual methods
.method public h0()Lm1/r1$a;
    .locals 1

    sget-object v0, Lg1/a;->R:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/r1$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lm1/r1$a;

    return-object v0
.end method

.method public i0()Lf1/a2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lg1/a;->Q:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/a2;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lf1/a2;

    return-object v0
.end method

.method public j0()Z
    .locals 2

    sget-object v0, Lg1/a;->S:Ln0/n1$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lg1/a;->P:Ln0/c3;

    return-object v0
.end method

.method public p()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method
