.class public abstract Landroidx/datastore/preferences/protobuf/j;
.super Landroidx/datastore/preferences/protobuf/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/j$e;,
        Landroidx/datastore/preferences/protobuf/j$b;,
        Landroidx/datastore/preferences/protobuf/j$c;,
        Landroidx/datastore/preferences/protobuf/j$d;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/logging/Logger;

.field public static final d:Z


# instance fields
.field public a:Landroidx/datastore/preferences/protobuf/k;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Landroidx/datastore/preferences/protobuf/j;->c:Ljava/util/logging/Logger;

    invoke-static {}, Landroidx/datastore/preferences/protobuf/q1;->B()Z

    move-result v0

    sput-boolean v0, Landroidx/datastore/preferences/protobuf/j;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/f;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/j;-><init>()V

    return-void
.end method

.method public static A(ILandroidx/datastore/preferences/protobuf/d0;)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->B(Landroidx/datastore/preferences/protobuf/d0;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static B(Landroidx/datastore/preferences/protobuf/d0;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/d0;->b()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static C(I)I
    .locals 1

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static D(ILandroidx/datastore/preferences/protobuf/r0;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Landroidx/datastore/preferences/protobuf/j;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->E(ILandroidx/datastore/preferences/protobuf/r0;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static E(ILandroidx/datastore/preferences/protobuf/r0;)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->G(Landroidx/datastore/preferences/protobuf/r0;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static F(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->H(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static G(Landroidx/datastore/preferences/protobuf/r0;)I
    .locals 0

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/r0;->c()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static H(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 0

    check-cast p0, Landroidx/datastore/preferences/protobuf/a;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/a;->k(Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static I(I)I
    .locals 1

    const/16 v0, 0x1000

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static J(ILandroidx/datastore/preferences/protobuf/g;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Landroidx/datastore/preferences/protobuf/j;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->g(ILandroidx/datastore/preferences/protobuf/g;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static K(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static L(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static M(IJ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static N(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static O(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->P(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static P(I)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->Z(I)I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result p0

    return p0
.end method

.method public static Q(IJ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->R(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static R(J)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->a0(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result p0

    return p0
.end method

.method public static S(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->T(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static T(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/r1;->c(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/r1$d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/z;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static U(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result p0

    return p0
.end method

.method public static V(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static W(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x160

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static X(IJ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static Y(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x280

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static Z(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x1f

    xor-int/2addr p0, v0

    return p0
.end method

.method public static a0(J)J
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long/2addr p0, v2

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static synthetic b()Z
    .locals 1

    sget-boolean v0, Landroidx/datastore/preferences/protobuf/j;->d:Z

    return v0
.end method

.method public static d(IZ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->e(Z)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static e(Z)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static e0(Ljava/io/OutputStream;I)Landroidx/datastore/preferences/protobuf/j;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/j$e;

    invoke-direct {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/j$e;-><init>(Ljava/io/OutputStream;I)V

    return-object v0
.end method

.method public static f([B)I
    .locals 0

    array-length p0, p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static f0([B)Landroidx/datastore/preferences/protobuf/j;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Landroidx/datastore/preferences/protobuf/j;->g0([BII)Landroidx/datastore/preferences/protobuf/j;

    move-result-object p0

    return-object p0
.end method

.method public static g(ILandroidx/datastore/preferences/protobuf/g;)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->h(Landroidx/datastore/preferences/protobuf/g;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static g0([BII)Landroidx/datastore/preferences/protobuf/j;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/j$c;

    invoke-direct {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j$c;-><init>([BII)V

    return-object v0
.end method

.method public static h(Landroidx/datastore/preferences/protobuf/g;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p0

    return p0
.end method

.method public static i(ID)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->j(D)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static j(D)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static k(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->l(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static l(I)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    move-result p0

    return p0
.end method

.method public static m(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->n(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static n(I)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static o(IJ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->p(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static p(J)I
    .locals 0

    const/16 p0, 0x8

    return p0
.end method

.method public static q(IF)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->r(F)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static r(F)I
    .locals 0

    const/4 p0, 0x4

    return p0
.end method

.method public static s(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->u(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static t(Landroidx/datastore/preferences/protobuf/r0;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/r0;->c()I

    move-result p0

    return p0
.end method

.method public static u(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p0, Landroidx/datastore/preferences/protobuf/a;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/a;->k(Landroidx/datastore/preferences/protobuf/g1;)I

    move-result p0

    return p0
.end method

.method public static v(II)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static w(I)I
    .locals 2

    int-to-long v0, p0

    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result p0

    return p0
.end method

.method public static x(IJ)I
    .locals 0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->y(J)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static y(J)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result p0

    return p0
.end method

.method public static z(ILandroidx/datastore/preferences/protobuf/d0;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {v1, p0}, Landroidx/datastore/preferences/protobuf/j;->V(II)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x3

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->A(ILandroidx/datastore/preferences/protobuf/d0;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public final A0(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    invoke-virtual {p0, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->C0(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    return-void
.end method

.method public final B0(Landroidx/datastore/preferences/protobuf/r0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p1, p0}, Landroidx/datastore/preferences/protobuf/r0;->i(Landroidx/datastore/preferences/protobuf/j;)V

    return-void
.end method

.method public final C0(Landroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/j;->a:Landroidx/datastore/preferences/protobuf/k;

    invoke-interface {p2, p1, v0}, Landroidx/datastore/preferences/protobuf/g1;->i(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public abstract D0(II)V
.end method

.method public abstract E0(I)V
.end method

.method public final F0(IJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->Y0(IJ)V

    return-void
.end method

.method public final G0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->Z0(J)V

    return-void
.end method

.method public abstract H0(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V
.end method

.method public abstract I0(Landroidx/datastore/preferences/protobuf/r0;)V
.end method

.method public abstract J0(ILandroidx/datastore/preferences/protobuf/r0;)V
.end method

.method public abstract K0(ILandroidx/datastore/preferences/protobuf/g;)V
.end method

.method public final L0(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->t0(II)V

    return-void
.end method

.method public final M0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->u0(I)V

    return-void
.end method

.method public final N0(IJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->v0(IJ)V

    return-void
.end method

.method public final O0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->w0(J)V

    return-void
.end method

.method public final P0(II)V
    .locals 0

    invoke-static {p2}, Landroidx/datastore/preferences/protobuf/j;->Z(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->W0(II)V

    return-void
.end method

.method public final Q0(I)V
    .locals 0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->Z(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    return-void
.end method

.method public final R0(IJ)V
    .locals 0

    invoke-static {p2, p3}, Landroidx/datastore/preferences/protobuf/j;->a0(J)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->Y0(IJ)V

    return-void
.end method

.method public final S0(J)V
    .locals 0

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/j;->a0(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->Z0(J)V

    return-void
.end method

.method public abstract T0(ILjava/lang/String;)V
.end method

.method public abstract U0(Ljava/lang/String;)V
.end method

.method public abstract V0(II)V
.end method

.method public abstract W0(II)V
.end method

.method public abstract X0(I)V
.end method

.method public abstract Y0(IJ)V
.end method

.method public abstract Z0(J)V
.end method

.method public abstract a([BII)V
.end method

.method public abstract b0()V
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/j;->h0()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c0(Ljava/lang/String;Landroidx/datastore/preferences/protobuf/r1$d;)V
    .locals 3

    sget-object v0, Landroidx/datastore/preferences/protobuf/j;->c:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Landroidx/datastore/preferences/protobuf/z;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Landroidx/datastore/preferences/protobuf/j;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/datastore/preferences/protobuf/j$d;

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/j$d;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public d0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/j;->b:Z

    return v0
.end method

.method public abstract h0()I
.end method

.method public abstract i0(B)V
.end method

.method public abstract j0(IZ)V
.end method

.method public final k0(Z)V
    .locals 0

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->i0(B)V

    return-void
.end method

.method public final l0([B)V
    .locals 2

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Landroidx/datastore/preferences/protobuf/j;->m0([BII)V

    return-void
.end method

.method public abstract m0([BII)V
.end method

.method public abstract n0(ILandroidx/datastore/preferences/protobuf/g;)V
.end method

.method public abstract o0(Landroidx/datastore/preferences/protobuf/g;)V
.end method

.method public final p0(ID)V
    .locals 0

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->v0(IJ)V

    return-void
.end method

.method public final q0(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->w0(J)V

    return-void
.end method

.method public final r0(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->D0(II)V

    return-void
.end method

.method public final s0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->E0(I)V

    return-void
.end method

.method public abstract t0(II)V
.end method

.method public abstract u0(I)V
.end method

.method public abstract v0(IJ)V
.end method

.method public abstract w0(J)V
.end method

.method public final x0(IF)V
    .locals 0

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->t0(II)V

    return-void
.end method

.method public final y0(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->u0(I)V

    return-void
.end method

.method public final z0(ILandroidx/datastore/preferences/protobuf/r0;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->B0(Landroidx/datastore/preferences/protobuf/r0;)V

    const/4 p2, 0x4

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    return-void
.end method
