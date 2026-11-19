.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\r\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b0\u000c0\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u001a\u0010\u0013\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010.R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u001a\u00105\u001a\u0008\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010.R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u0010.R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010.R\u001a\u0010;\u001a\u0008\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010.R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010.\u00a8\u0006>"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase_Impl;",
        "Landroidx/work/impl/WorkDatabase;",
        "<init>",
        "()V",
        "Ly4/a0;",
        "v0",
        "()Ly4/a0;",
        "Landroidx/room/c;",
        "m",
        "()Landroidx/room/c;",
        "",
        "Lxu/c;",
        "",
        "y",
        "()Ljava/util/Map;",
        "",
        "Lb5/a;",
        "w",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "Lb5/b;",
        "j",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Lg6/k0;",
        "c0",
        "()Lg6/k0;",
        "Lg6/b;",
        "X",
        "()Lg6/b;",
        "Lg6/q1;",
        "d0",
        "()Lg6/q1;",
        "Lg6/p;",
        "Z",
        "()Lg6/p;",
        "Lg6/y;",
        "a0",
        "()Lg6/y;",
        "Lg6/d0;",
        "b0",
        "()Lg6/d0;",
        "Lg6/i;",
        "Y",
        "()Lg6/i;",
        "Lzt/h;",
        "p",
        "Lzt/h;",
        "_workSpecDao",
        "q",
        "_dependencyDao",
        "r",
        "_workTagDao",
        "s",
        "_systemIdInfoDao",
        "t",
        "_workNameDao",
        "u",
        "_workProgressDao",
        "v",
        "_preferenceDao",
        "Lg6/m;",
        "_rawWorkInfoDao",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final p:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/k0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/q1;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/p;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/y;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/d0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Lg6/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    new-instance v0, Lz5/t0;

    invoke-direct {v0, p0}, Lz5/t0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lzt/h;

    new-instance v0, Lz5/u0;

    invoke-direct {v0, p0}, Lz5/u0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lzt/h;

    new-instance v0, Lz5/v0;

    invoke-direct {v0, p0}, Lz5/v0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lzt/h;

    new-instance v0, Lz5/w0;

    invoke-direct {v0, p0}, Lz5/w0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lzt/h;

    new-instance v0, Lz5/x0;

    invoke-direct {v0, p0}, Lz5/x0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:Lzt/h;

    new-instance v0, Lz5/y0;

    invoke-direct {v0, p0}, Lz5/y0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:Lzt/h;

    new-instance v0, Lz5/z0;

    invoke-direct {v0, p0}, Lz5/z0;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:Lzt/h;

    new-instance v0, Lz5/a1;

    invoke-direct {v0, p0}, Lz5/a1;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:Lzt/h;

    return-void
.end method

.method public static synthetic e0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u1;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->t0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/b0;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->q0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n1;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->s0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/l;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->n0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/g;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->m0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->p0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/h0;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->r0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->o0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/g;
    .locals 1

    new-instance v0, Lg6/g;

    invoke-direct {v0, p0}, Lg6/g;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final n0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/l;
    .locals 1

    new-instance v0, Lg6/l;

    invoke-direct {v0, p0}, Lg6/l;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final o0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n;
    .locals 1

    new-instance v0, Lg6/n;

    invoke-direct {v0, p0}, Lg6/n;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final p0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u;
    .locals 1

    new-instance v0, Lg6/u;

    invoke-direct {v0, p0}, Lg6/u;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final q0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/b0;
    .locals 1

    new-instance v0, Lg6/b0;

    invoke-direct {v0, p0}, Lg6/b0;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final r0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/h0;
    .locals 1

    new-instance v0, Lg6/h0;

    invoke-direct {v0, p0}, Lg6/h0;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final s0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/n1;
    .locals 1

    new-instance v0, Lg6/n1;

    invoke-direct {v0, p0}, Lg6/n1;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final t0(Landroidx/work/impl/WorkDatabase_Impl;)Lg6/u1;
    .locals 1

    new-instance v0, Lg6/u1;

    invoke-direct {v0, p0}, Lg6/u1;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final synthetic u0(Landroidx/work/impl/WorkDatabase_Impl;Lg5/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly4/u;->K(Lg5/b;)V

    return-void
.end method


# virtual methods
.method public X()Lg6/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/b;

    return-object v0
.end method

.method public Y()Lg6/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/i;

    return-object v0
.end method

.method public Z()Lg6/p;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/p;

    return-object v0
.end method

.method public a0()Lg6/y;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/y;

    return-object v0
.end method

.method public b0()Lg6/d0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/d0;

    return-object v0
.end method

.method public c0()Lg6/k0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    return-object v0
.end method

.method public d0()Lg6/q1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/q1;

    return-object v0
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lxu/c<",
            "+",
            "Lb5/a;",
            ">;+",
            "Lb5/a;",
            ">;)",
            "Ljava/util/List<",
            "Lb5/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lz5/k0;

    invoke-direct {v0}, Lz5/k0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/l0;

    invoke-direct {v0}, Lz5/l0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/m0;

    invoke-direct {v0}, Lz5/m0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/n0;

    invoke-direct {v0}, Lz5/n0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/o0;

    invoke-direct {v0}, Lz5/o0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/p0;

    invoke-direct {v0}, Lz5/p0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/q0;

    invoke-direct {v0}, Lz5/q0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/r0;

    invoke-direct {v0}, Lz5/r0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz5/s0;

    invoke-direct {v0}, Lz5/s0;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public m()Landroidx/room/c;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/c;

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/c;-><init>(Ly4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v2
.end method

.method public bridge synthetic n()Ly4/b0;
    .locals 1

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase_Impl;->v0()Ly4/a0;

    move-result-object v0

    return-object v0
.end method

.method public v0()Ly4/a0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Landroidx/work/impl/WorkDatabase_Impl$a;

    invoke-direct {v0, p0}, Landroidx/work/impl/WorkDatabase_Impl$a;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    return-object v0
.end method

.method public w()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lxu/c<",
            "+",
            "Lb5/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public y()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxu/c<",
            "*>;",
            "Ljava/util/List<",
            "Lxu/c<",
            "*>;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-class v1, Lg6/k0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/n1;->d:Lg6/n1$c;

    invoke-virtual {v2}, Lg6/n1$c;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/b;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/g;->c:Lg6/g$b;

    invoke-virtual {v2}, Lg6/g$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/q1;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/u1;->c:Lg6/u1$b;

    invoke-virtual {v2}, Lg6/u1$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/p;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/u;->c:Lg6/u$b;

    invoke-virtual {v2}, Lg6/u$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/y;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/b0;->c:Lg6/b0$b;

    invoke-virtual {v2}, Lg6/b0$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/d0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/h0;->c:Lg6/h0$b;

    invoke-virtual {v2}, Lg6/h0$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/i;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/l;->c:Lg6/l$b;

    invoke-virtual {v2}, Lg6/l$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg6/m;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Lg6/n;->b:Lg6/n$a;

    invoke-virtual {v2}, Lg6/n$a;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
