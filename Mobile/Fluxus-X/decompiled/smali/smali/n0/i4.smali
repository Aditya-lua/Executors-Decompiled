.class public interface abstract Ln0/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/q;
.implements Ln0/h2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/i4$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lg0/w2;",
        ">",
        "Ljava/lang/Object;",
        "Ls0/q<",
        "TT;>;",
        "Ln0/h2;"
    }
.end annotation


# static fields
.field public static final A:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final B:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final D:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final H:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final I:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lm0/b1$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/u3;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/o3;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/l1;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/o3$e;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/l1$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "camerax.core.useCase.defaultSessionConfig"

    const-class v1, Ln0/o3;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->w:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.defaultCaptureConfig"

    const-class v1, Ln0/l1;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->x:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.sessionConfigUnpacker"

    const-class v1, Ln0/o3$e;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->y:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.captureConfigUnpacker"

    const-class v1, Ln0/l1$b;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->z:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.surfaceOccupancyPriority"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->A:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.sessionType"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->B:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.targetFrameRate"

    const-class v2, Landroid/util/Range;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->C:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.isStrictFrameRateRequired"

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->D:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.zslDisabled"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->E:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.highResolutionDisabled"

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->F:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.captureType"

    const-class v2, Ln0/j4$b;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->G:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.previewStabilizationMode"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->H:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.videoStabilizationMode"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->I:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.takePictureManagerProvider"

    const-class v1, Lm0/b1$b;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->J:Ln0/n1$a;

    const-string v0, "camerax.core.useCase.streamUseCase"

    const-class v1, Ln0/u3;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ln0/i4;->K:Ln0/n1$a;

    return-void
.end method


# virtual methods
.method public B(I)I
    .locals 1

    sget-object v0, Ln0/i4;->A:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public E()I
    .locals 2

    sget-object v0, Ln0/i4;->H:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public F(Ln0/o3$e;)Ln0/o3$e;
    .locals 1

    sget-object v0, Ln0/i4;->y:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/o3$e;

    return-object p1
.end method

.method public H()Z
    .locals 2

    sget-object v0, Ln0/i4;->D:Ln0/n1$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public K(Ln0/l1$b;)Ln0/l1$b;
    .locals 1

    sget-object v0, Ln0/i4;->z:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/l1$b;

    return-object p1
.end method

.method public S()Ln0/o3;
    .locals 1

    sget-object v0, Ln0/i4;->w:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o3;

    return-object v0
.end method

.method public T(Z)Z
    .locals 1

    sget-object v0, Ln0/i4;->E:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public W()Ln0/u3;
    .locals 2

    sget-object v0, Ln0/i4;->K:Ln0/n1$a;

    sget-object v1, Ln0/u3;->b:Ln0/u3;

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u3;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public X()Ln0/j4$b;
    .locals 1

    sget-object v0, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/j4$b;

    return-object v0
.end method

.method public d0(Z)Z
    .locals 1

    sget-object v0, Ln0/i4;->F:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public f0()Z
    .locals 1

    sget-object v0, Ln0/i4;->C:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    return v0
.end method

.method public j(Ln0/o3;)Ln0/o3;
    .locals 1

    sget-object v0, Ln0/i4;->w:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/o3;

    return-object p1
.end method

.method public o(I)I
    .locals 1

    sget-object v0, Ln0/i4;->B:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public r()Lm0/b1$b;
    .locals 2

    sget-object v0, Ln0/i4;->J:Ln0/n1$a;

    new-instance v1, Ln0/i4$a;

    invoke-direct {v1, p0}, Ln0/i4$a;-><init>(Ln0/i4;)V

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/b1$b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lm0/b1$b;

    return-object v0
.end method

.method public s(Ln0/l1;)Ln0/l1;
    .locals 1

    sget-object v0, Ln0/i4;->x:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/l1;

    return-object p1
.end method

.method public x()I
    .locals 2

    sget-object v0, Ln0/i4;->I:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public z(Landroid/util/Range;)Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Ln0/i4;->C:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Range;

    return-object p1
.end method
