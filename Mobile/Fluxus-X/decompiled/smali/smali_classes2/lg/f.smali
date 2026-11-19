.class public final Llg/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/f$f;
    }
.end annotation


# static fields
.field public static final A:Llg/e;

.field public static final B:Ljava/lang/String;

.field public static final C:Llg/d;

.field public static final D:Llg/z;

.field public static final E:Llg/z;

.field public static final z:Llg/x;


# instance fields
.field public final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lsg/a<",
            "*>;",
            "Llg/a0<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lsg/a<",
            "*>;",
            "Llg/a0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lng/v;

.field public final d:Log/e;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lng/w;

.field public final g:Llg/d;

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Llg/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Llg/e;

.field public final n:Llg/x;

.field public final o:Z

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:I

.field public final t:Llg/v;

.field public final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Llg/z;

.field public final x:Llg/z;

.field public final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Llg/e;->d:Llg/e;

    sput-object v0, Llg/f;->A:Llg/e;

    const/4 v0, 0x0

    sput-object v0, Llg/f;->B:Ljava/lang/String;

    sget-object v0, Llg/c;->a:Llg/c;

    sput-object v0, Llg/f;->C:Llg/d;

    sget-object v0, Llg/y;->a:Llg/y;

    sput-object v0, Llg/f;->D:Llg/z;

    sget-object v0, Llg/y;->b:Llg/y;

    sput-object v0, Llg/f;->E:Llg/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    .line 1
    sget-object v1, Lng/w;->g:Lng/w;

    sget-object v2, Llg/f;->C:Llg/d;

    .line 2
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v8, Llg/f;->A:Llg/e;

    sget-object v9, Llg/f;->z:Llg/x;

    sget-object v12, Llg/v;->a:Llg/v;

    sget-object v13, Llg/f;->B:Ljava/lang/String;

    .line 3
    sget-object v16, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    sget-object v19, Llg/f;->D:Llg/z;

    sget-object v20, Llg/f;->E:Llg/z;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x2

    move-object/from16 v17, v16

    move-object/from16 v18, v16

    move-object/from16 v21, v16

    move-object/from16 v0, p0

    .line 5
    invoke-direct/range {v0 .. v21}, Llg/f;-><init>(Lng/w;Llg/d;Ljava/util/Map;ZZZZLlg/e;Llg/x;ZZLlg/v;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Llg/z;Llg/z;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lng/w;Llg/d;Ljava/util/Map;ZZZZLlg/e;Llg/x;ZZLlg/v;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Llg/z;Llg/z;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/w;",
            "Llg/d;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Llg/h<",
            "*>;>;ZZZZ",
            "Llg/e;",
            "Llg/x;",
            "ZZ",
            "Llg/v;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Llg/b0;",
            ">;",
            "Ljava/util/List<",
            "Llg/b0;",
            ">;",
            "Ljava/util/List<",
            "Llg/b0;",
            ">;",
            "Llg/z;",
            "Llg/z;",
            "Ljava/util/List<",
            "Llg/w;",
            ">;)V"
        }
    .end annotation

    move/from16 v1, p10

    move/from16 v2, p11

    move-object/from16 v3, p21

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v4, Ljava/lang/ThreadLocal;

    invoke-direct {v4}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v4, p0, Llg/f;->a:Ljava/lang/ThreadLocal;

    .line 8
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v4, p0, Llg/f;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 9
    iput-object p1, p0, Llg/f;->f:Lng/w;

    .line 10
    iput-object p2, p0, Llg/f;->g:Llg/d;

    .line 11
    iput-object p3, p0, Llg/f;->h:Ljava/util/Map;

    .line 12
    new-instance v4, Lng/v;

    invoke-direct {v4, p3, v2, v3}, Lng/v;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object v4, p0, Llg/f;->c:Lng/v;

    .line 13
    iput-boolean p4, p0, Llg/f;->i:Z

    .line 14
    iput-boolean p5, p0, Llg/f;->j:Z

    .line 15
    iput-boolean p6, p0, Llg/f;->k:Z

    move/from16 p3, p7

    .line 16
    iput-boolean p3, p0, Llg/f;->l:Z

    move-object/from16 p3, p8

    .line 17
    iput-object p3, p0, Llg/f;->m:Llg/e;

    move-object/from16 p3, p9

    .line 18
    iput-object p3, p0, Llg/f;->n:Llg/x;

    .line 19
    iput-boolean v1, p0, Llg/f;->o:Z

    .line 20
    iput-boolean v2, p0, Llg/f;->p:Z

    move-object/from16 p3, p12

    .line 21
    iput-object p3, p0, Llg/f;->t:Llg/v;

    move-object/from16 v2, p13

    .line 22
    iput-object v2, p0, Llg/f;->q:Ljava/lang/String;

    move/from16 v2, p14

    .line 23
    iput v2, p0, Llg/f;->r:I

    move/from16 v2, p15

    .line 24
    iput v2, p0, Llg/f;->s:I

    move-object/from16 v2, p16

    .line 25
    iput-object v2, p0, Llg/f;->u:Ljava/util/List;

    move-object/from16 v2, p17

    .line 26
    iput-object v2, p0, Llg/f;->v:Ljava/util/List;

    move-object/from16 v2, p19

    .line 27
    iput-object v2, p0, Llg/f;->w:Llg/z;

    move-object/from16 v5, p20

    .line 28
    iput-object v5, p0, Llg/f;->x:Llg/z;

    .line 29
    iput-object v3, p0, Llg/f;->y:Ljava/util/List;

    .line 30
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    sget-object v7, Log/p;->W:Llg/b0;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    invoke-static {v2}, Log/k;->a(Llg/z;)Llg/b0;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p18

    .line 34
    invoke-interface {v6, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    sget-object v2, Log/p;->C:Llg/b0;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    sget-object v2, Log/p;->m:Llg/b0;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    sget-object v2, Log/p;->g:Llg/b0;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v2, Log/p;->i:Llg/b0;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object v2, Log/p;->k:Llg/b0;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    invoke-static {p3}, Llg/f;->o(Llg/v;)Llg/a0;

    move-result-object p3

    .line 41
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Long;

    invoke-static {v2, v7, p3}, Log/p;->a(Ljava/lang/Class;Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    const-class v2, Ljava/lang/Double;

    .line 43
    invoke-virtual {p0, v1}, Llg/f;->e(Z)Llg/a0;

    move-result-object v7

    .line 44
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v2, v7}, Log/p;->a(Ljava/lang/Class;Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object v2

    .line 45
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    const-class v2, Ljava/lang/Float;

    .line 47
    invoke-virtual {p0, v1}, Llg/f;->f(Z)Llg/a0;

    move-result-object v1

    .line 48
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v2, v1}, Log/p;->a(Ljava/lang/Class;Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object v1

    .line 49
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-static {v5}, Log/j;->a(Llg/z;)Llg/b0;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    sget-object v1, Log/p;->o:Llg/b0;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v1, Log/p;->q:Llg/b0;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p3}, Llg/f;->b(Llg/a0;)Llg/a0;

    move-result-object v2

    invoke-static {v1, v2}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    const-class v1, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 55
    invoke-static {p3}, Llg/f;->c(Llg/a0;)Llg/a0;

    move-result-object p3

    invoke-static {v1, p3}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object p3

    .line 56
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object p3, Log/p;->s:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object p3, Log/p;->x:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object p3, Log/p;->E:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    sget-object p3, Log/p;->G:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    const-class p3, Ljava/math/BigDecimal;

    sget-object v1, Log/p;->z:Llg/a0;

    invoke-static {p3, v1}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object p3

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    const-class p3, Ljava/math/BigInteger;

    sget-object v1, Log/p;->A:Llg/a0;

    invoke-static {p3, v1}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object p3

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    const-class p3, Lng/a0;

    sget-object v1, Log/p;->B:Llg/a0;

    .line 64
    invoke-static {p3, v1}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object p3

    .line 65
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object p3, Log/p;->I:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object p3, Log/p;->K:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object p3, Log/p;->O:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object p3, Log/p;->Q:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    sget-object p3, Log/p;->U:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    sget-object p3, Log/p;->M:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    sget-object p3, Log/p;->d:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object p3, Log/c;->c:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    sget-object p3, Log/p;->S:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    sget-boolean p3, Lrg/d;->a:Z

    if-eqz p3, :cond_0

    .line 76
    sget-object p3, Lrg/d;->e:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    sget-object p3, Lrg/d;->d:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    sget-object p3, Lrg/d;->f:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_0
    sget-object p3, Log/a;->c:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    sget-object p3, Log/p;->b:Llg/b0;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance p3, Log/b;

    invoke-direct {p3, v4}, Log/b;-><init>(Lng/v;)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance p3, Log/i;

    invoke-direct {p3, v4, p5}, Log/i;-><init>(Lng/v;Z)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance p3, Log/e;

    invoke-direct {p3, v4}, Log/e;-><init>(Lng/v;)V

    iput-object p3, p0, Llg/f;->d:Log/e;

    .line 84
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    sget-object v0, Log/p;->X:Llg/b0;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v0, Log/l;

    move-object p6, p1

    move-object p5, p2

    move-object/from16 p7, p3

    move-object p3, v0

    move-object/from16 p8, v3

    move-object p4, v4

    invoke-direct/range {p3 .. p8}, Log/l;-><init>(Lng/v;Llg/d;Lng/w;Log/e;Ljava/util/List;)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Llg/f;->e:Ljava/util/List;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ltg/a;)V
    .locals 0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object p0

    sget-object p1, Ltg/b;->j:Ltg/b;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Llg/u;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Llg/u;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ltg/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Llg/m;

    invoke-direct {p1, p0}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Llg/u;

    invoke-direct {p1, p0}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Llg/a0;)Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "Ljava/lang/Number;",
            ">;)",
            "Llg/a0<",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            ">;"
        }
    .end annotation

    new-instance v0, Llg/f$d;

    invoke-direct {v0, p0}, Llg/f$d;-><init>(Llg/a0;)V

    invoke-virtual {v0}, Llg/a0;->nullSafe()Llg/a0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Llg/a0;)Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "Ljava/lang/Number;",
            ">;)",
            "Llg/a0<",
            "Ljava/util/concurrent/atomic/AtomicLongArray;",
            ">;"
        }
    .end annotation

    new-instance v0, Llg/f$e;

    invoke-direct {v0, p0}, Llg/f$e;-><init>(Llg/a0;)V

    invoke-virtual {v0}, Llg/a0;->nullSafe()Llg/a0;

    move-result-object p0

    return-object p0
.end method

.method public static d(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(Llg/v;)Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/v;",
            ")",
            "Llg/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    sget-object v0, Llg/v;->a:Llg/v;

    if-ne p0, v0, :cond_0

    sget-object p0, Log/p;->t:Llg/a0;

    return-object p0

    :cond_0
    new-instance p0, Llg/f$c;

    invoke-direct {p0}, Llg/f$c;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final e(Z)Llg/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Llg/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Log/p;->v:Llg/a0;

    return-object p1

    :cond_0
    new-instance p1, Llg/f$a;

    invoke-direct {p1, p0}, Llg/f$a;-><init>(Llg/f;)V

    return-object p1
.end method

.method public final f(Z)Llg/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Llg/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Log/p;->u:Llg/a0;

    return-object p1

    :cond_0
    new-instance p1, Llg/f$b;

    invoke-direct {p1, p0}, Llg/f$b;-><init>(Llg/f;)V

    return-object p1
.end method

.method public g(Ljava/io/Reader;Lsg/a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Lsg/a<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Llg/f;->p(Ljava/io/Reader;)Ltg/a;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Llg/f;->k(Ltg/a;Lsg/a;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Llg/f;->a(Ljava/lang/Object;Ltg/a;)V

    return-object p2
.end method

.method public h(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p2}, Lsg/a;->a(Ljava/lang/Class;)Lsg/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Llg/f;->j(Ljava/lang/String;Lsg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-static {p2}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Llg/f;->j(Ljava/lang/String;Lsg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;Lsg/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lsg/a<",
            "TT;>;)TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Llg/f;->g(Ljava/io/Reader;Lsg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Ltg/a;Lsg/a;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ltg/a;",
            "Lsg/a<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->o()Llg/x;

    move-result-object v0

    iget-object v1, p0, Llg/f;->n:Llg/x;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Ltg/a;->e0(Llg/x;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ltg/a;->o()Llg/x;

    move-result-object v1

    sget-object v2, Llg/x;->b:Llg/x;

    if-ne v1, v2, :cond_1

    sget-object v1, Llg/x;->a:Llg/x;

    invoke-virtual {p1, v1}, Ltg/a;->e0(Llg/x;)V

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p0, p2}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object v2

    invoke-virtual {v2, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lng/f0;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, Ljava/lang/ClassCastException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Type adapter \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' returned wrong type; requested "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " but got instance of "

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\nVerify that the adapter was registered for the correct type."

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v4, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    goto :goto_6

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_3

    :catch_2
    move-exception p2

    goto :goto_4

    :catch_3
    move-exception p2

    goto :goto_5

    :cond_3
    :goto_1
    invoke-virtual {p1, v0}, Ltg/a;->e0(Llg/x;)V

    return-object v3

    :goto_2
    :try_start_2
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.13.2): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_3
    new-instance v1, Llg/u;

    invoke-direct {v1, p2}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_4
    new-instance v1, Llg/u;

    invoke-direct {v1, p2}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception p2

    const/4 v1, 0x1

    :goto_5
    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Ltg/a;->e0(Llg/x;)V

    const/4 p1, 0x0

    return-object p1

    :cond_4
    :try_start_3
    new-instance v1, Llg/u;

    invoke-direct {v1, p2}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_6
    invoke-virtual {p1, v0}, Ltg/a;->e0(Llg/x;)V

    throw p2
.end method

.method public l(Ljava/lang/Class;)Llg/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lsg/a;->a(Ljava/lang/Class;)Lsg/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p1

    return-object p1
.end method

.method public m(Lsg/a;)Llg/a0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "type must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Llg/f;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Llg/f;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Llg/f;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llg/a0;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    new-instance v2, Llg/f$f;

    invoke-direct {v2}, Llg/f$f;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Llg/f;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llg/b0;

    invoke-interface {v4, p0, p1}, Llg/b0;->create(Llg/f;Lsg/a;)Llg/a0;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v4}, Llg/f$f;->c(Llg/a0;)V

    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    iget-object v2, p0, Llg/f;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    if-eqz v4, :cond_7

    if-eqz v1, :cond_6

    iget-object p1, p0, Llg/f;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_6
    return-object v4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GSON (2.13.2) cannot handle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    if-eqz v1, :cond_8

    iget-object v0, p0, Llg/f;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_8
    throw p1
.end method

.method public n(Llg/b0;Lsg/a;)Llg/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llg/b0;",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "skipPast must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "type must not be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Llg/f;->d:Log/e;

    invoke-virtual {v0, p2, p1}, Log/e;->d(Lsg/a;Llg/b0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Llg/f;->d:Log/e;

    :cond_0
    iget-object v0, p0, Llg/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llg/b0;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Llg/b0;->create(Llg/f;Lsg/a;)Llg/a0;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    if-nez v1, :cond_4

    invoke-virtual {p0, p2}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize or deserialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Ljava/io/Reader;)Ltg/a;
    .locals 1

    new-instance v0, Ltg/a;

    invoke-direct {v0, p1}, Ltg/a;-><init>(Ljava/io/Reader;)V

    iget-object p1, p0, Llg/f;->n:Llg/x;

    if-nez p1, :cond_0

    sget-object p1, Llg/x;->b:Llg/x;

    :cond_0
    invoke-virtual {v0, p1}, Ltg/a;->e0(Llg/x;)V

    return-object v0
.end method

.method public q(Ljava/io/Writer;)Ltg/c;
    .locals 1

    iget-boolean v0, p0, Llg/f;->k:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ltg/c;

    invoke-direct {v0, p1}, Ltg/c;-><init>(Ljava/io/Writer;)V

    iget-object p1, p0, Llg/f;->m:Llg/e;

    invoke-virtual {v0, p1}, Ltg/c;->A(Llg/e;)V

    iget-boolean p1, p0, Llg/f;->l:Z

    invoke-virtual {v0, p1}, Ltg/c;->E(Z)V

    iget-object p1, p0, Llg/f;->n:Llg/x;

    if-nez p1, :cond_1

    sget-object p1, Llg/x;->b:Llg/x;

    :cond_1
    invoke-virtual {v0, p1}, Ltg/c;->K(Llg/x;)V

    iget-boolean p1, p0, Llg/f;->i:Z

    invoke-virtual {v0, p1}, Ltg/c;->I(Z)V

    return-object v0
.end method

.method public r(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Llg/n;->a:Llg/n;

    invoke-virtual {p0, p1}, Llg/f;->t(Llg/l;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Llg/f;->s(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Llg/f;->u(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(Llg/l;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1, v0}, Llg/f;->w(Llg/l;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{serializeNulls:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llg/f;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg/f;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg/f;->c:Lng/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p3}, Lng/h0;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p3

    invoke-virtual {p0, p3}, Llg/f;->q(Ljava/io/Writer;)Ltg/c;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Llg/f;->v(Ljava/lang/Object;Ljava/lang/reflect/Type;Ltg/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Llg/m;

    invoke-direct {p2, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public v(Ljava/lang/Object;Ljava/lang/reflect/Type;Ltg/c;)V
    .locals 5

    invoke-static {p2}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p2

    invoke-virtual {p3}, Ltg/c;->m()Llg/x;

    move-result-object v0

    iget-object v1, p0, Llg/f;->n:Llg/x;

    if-eqz v1, :cond_0

    invoke-virtual {p3, v1}, Ltg/c;->K(Llg/x;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ltg/c;->m()Llg/x;

    move-result-object v1

    sget-object v2, Llg/x;->b:Llg/x;

    if-ne v1, v2, :cond_1

    sget-object v1, Llg/x;->a:Llg/x;

    invoke-virtual {p3, v1}, Ltg/c;->K(Llg/x;)V

    :cond_1
    :goto_0
    invoke-virtual {p3}, Ltg/c;->n()Z

    move-result v1

    invoke-virtual {p3}, Ltg/c;->k()Z

    move-result v2

    iget-boolean v3, p0, Llg/f;->l:Z

    invoke-virtual {p3, v3}, Ltg/c;->E(Z)V

    iget-boolean v3, p0, Llg/f;->i:Z

    invoke-virtual {p3, v3}, Ltg/c;->I(Z)V

    :try_start_0
    invoke-virtual {p2, p3, p1}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v0}, Ltg/c;->K(Llg/x;)V

    invoke-virtual {p3, v1}, Ltg/c;->E(Z)V

    invoke-virtual {p3, v2}, Ltg/c;->I(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AssertionError (GSON 2.13.2): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v3, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Llg/m;

    invoke-direct {p2, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p3, v0}, Ltg/c;->K(Llg/x;)V

    invoke-virtual {p3, v1}, Ltg/c;->E(Z)V

    invoke-virtual {p3, v2}, Ltg/c;->I(Z)V

    throw p1
.end method

.method public w(Llg/l;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p2}, Lng/h0;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p2}, Llg/f;->q(Ljava/io/Writer;)Ltg/c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Llg/f;->x(Llg/l;Ltg/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Llg/m;

    invoke-direct {p2, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public x(Llg/l;Ltg/c;)V
    .locals 6

    invoke-virtual {p2}, Ltg/c;->m()Llg/x;

    move-result-object v0

    invoke-virtual {p2}, Ltg/c;->n()Z

    move-result v1

    invoke-virtual {p2}, Ltg/c;->k()Z

    move-result v2

    iget-boolean v3, p0, Llg/f;->l:Z

    invoke-virtual {p2, v3}, Ltg/c;->E(Z)V

    iget-boolean v3, p0, Llg/f;->i:Z

    invoke-virtual {p2, v3}, Ltg/c;->I(Z)V

    iget-object v3, p0, Llg/f;->n:Llg/x;

    if-eqz v3, :cond_0

    invoke-virtual {p2, v3}, Ltg/c;->K(Llg/x;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ltg/c;->m()Llg/x;

    move-result-object v3

    sget-object v4, Llg/x;->b:Llg/x;

    if-ne v3, v4, :cond_1

    sget-object v3, Llg/x;->a:Llg/x;

    invoke-virtual {p2, v3}, Ltg/c;->K(Llg/x;)V

    :cond_1
    :goto_0
    :try_start_0
    invoke-static {p1, p2}, Lng/h0;->b(Llg/l;Ltg/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v0}, Ltg/c;->K(Llg/x;)V

    invoke-virtual {p2, v1}, Ltg/c;->E(Z)V

    invoke-virtual {p2, v2}, Ltg/c;->I(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AssertionError (GSON 2.13.2): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception p1

    new-instance v3, Llg/m;

    invoke-direct {v3, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p2, v0}, Ltg/c;->K(Llg/x;)V

    invoke-virtual {p2, v1}, Ltg/c;->E(Z)V

    invoke-virtual {p2, v2}, Ltg/c;->I(Z)V

    throw p1
.end method

.method public y(Ljava/lang/Object;)Llg/l;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Llg/n;->a:Llg/n;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Llg/f;->z(Ljava/lang/Object;Ljava/lang/reflect/Type;)Llg/l;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/Object;Ljava/lang/reflect/Type;)Llg/l;
    .locals 1

    new-instance v0, Log/h;

    invoke-direct {v0}, Log/h;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Llg/f;->v(Ljava/lang/Object;Ljava/lang/reflect/Type;Ltg/c;)V

    invoke-virtual {v0}, Log/h;->d0()Llg/l;

    move-result-object p1

    return-object p1
.end method
