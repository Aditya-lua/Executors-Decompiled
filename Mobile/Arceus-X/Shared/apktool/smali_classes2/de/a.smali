.class public Lde/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/b;


# static fields
.field public static final p:J

.field public static final synthetic q:I


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Landroid/content/Context;

.field public final c:Lae/v0;

.field public final d:Lbe/u0;

.field public final e:Lbe/o0;

.field public final f:Lbe/p1;

.field public final g:Lbe/p1;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Lae/j0;

.field public final j:Ljava/io/File;

.field public final k:Ljava/util/concurrent/atomic/AtomicReference;

.field public final l:Ljava/util/Set;

.field public final m:Ljava/util/Set;

.field public final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final o:Lde/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lde/a;->p:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Lae/v0;Lbe/u0;)V
    .locals 5

    invoke-static {}, Lzd/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lbe/o0;

    invoke-direct {v1, p1}, Lbe/o0;-><init>(Landroid/content/Context;)V

    sget-object v2, Lde/k;->a:Lde/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v3, p0, Lde/a;->a:Landroid/os/Handler;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v3, p0, Lde/a;->k:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, p0, Lde/a;->l:Ljava/util/Set;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, p0, Lde/a;->m:Ljava/util/Set;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v3, p0, Lde/a;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lde/a;->b:Landroid/content/Context;

    iput-object p2, p0, Lde/a;->j:Ljava/io/File;

    iput-object p3, p0, Lde/a;->c:Lae/v0;

    iput-object p4, p0, Lde/a;->d:Lbe/u0;

    iput-object v0, p0, Lde/a;->h:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Lde/a;->e:Lbe/o0;

    iput-object v2, p0, Lde/a;->o:Lde/k;

    new-instance p1, Lbe/p1;

    invoke-direct {p1}, Lbe/p1;-><init>()V

    iput-object p1, p0, Lde/a;->g:Lbe/p1;

    new-instance p1, Lbe/p1;

    invoke-direct {p1}, Lbe/p1;-><init>()V

    iput-object p1, p0, Lde/a;->f:Lbe/p1;

    sget-object p1, Lae/r0;->a:Lae/r0;

    iput-object p1, p0, Lde/a;->i:Lae/j0;

    return-void
.end method

.method public static bridge synthetic h(Lde/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V
    .locals 0

    const/4 p6, 0x1

    invoke-virtual/range {p0 .. p6}, Lde/a;->t(Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V

    return-void
.end method

.method public static bridge synthetic i(Lde/a;Ljava/util/List;Ljava/util/List;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lde/a;->v(Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method public static synthetic n(Lde/a;II)Z
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p2

    invoke-virtual/range {v0 .. v7}, Lde/a;->w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\\.config\\."

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0
.end method


# virtual methods
.method public final a(Lae/d;)Lcom/google/android/gms/tasks/Task;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lae/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    :try_start_0
    new-instance v0, Lde/l;

    move-object/from16 v2, p1

    invoke-direct {v0, v2}, Lde/l;-><init>(Lae/d;)V

    invoke-virtual {v1, v0}, Lde/a;->r(Lde/r;)Lae/e;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lae/e;->h()I

    move-result v0
    :try_end_0
    .catch Lbe/t0; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lae/d;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v1, Lde/a;->j:Ljava/io/File;

    sget-object v5, Lde/m;->a:Lde/m;

    invoke-virtual {v4, v5}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v4

    const-string v5, "FakeSplitInstallManager"

    if-eqz v4, :cond_10

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    :goto_1
    array-length v14, v4

    if-ge v11, v14, :cond_b

    aget-object v14, v4, v11

    invoke-static {v14}, Lbe/s0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v15

    const-wide/16 v16, 0x0

    invoke-static {v15}, Lde/a;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lae/d;->b()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-static {v15}, Lde/a;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/util/HashSet;

    const/16 v18, 0x0

    iget-object v10, v1, Lde/a;->e:Lbe/o0;

    invoke-virtual {v10}, Lbe/o0;->a()Ljava/util/List;

    move-result-object v10

    invoke-direct {v7, v10}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Lde/a;->p()Lae/n0;

    move-result-object v10

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v10, v6}, Lae/n0;->a(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v6

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_1

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move/from16 v21, v0

    move-object/from16 v0, v20

    check-cast v0, Ljava/util/Set;

    invoke-interface {v10, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move/from16 v0, v21

    goto :goto_2

    :cond_1
    move/from16 v21, v0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v2, v19

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v4

    const-string v4, "_"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v20

    if-eqz v20, :cond_2

    move-object/from16 v20, v6

    const/4 v6, -0x1

    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v18

    goto :goto_4

    :cond_2
    move-object/from16 v20, v6

    :goto_4
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p1

    move-object/from16 v4, v19

    move-object/from16 v6, v20

    goto :goto_3

    :cond_3
    move-object/from16 v19, v4

    move-object/from16 v20, v6

    iget-object v2, v1, Lde/a;->m:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface/range {v20 .. v20}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v2, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    :cond_5
    invoke-interface {v10, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :cond_6
    move/from16 v21, v0

    move-object/from16 v19, v4

    const/16 v18, 0x0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lae/d;->a()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, v1, Lde/a;->l:Ljava/util/Set;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v4, ""

    const-string v6, "base"

    filled-new-array {v4, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Lde/a;->p()Lae/n0;

    move-result-object v4

    invoke-virtual {v4, v2}, Lae/n0;->a(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_9
    :goto_6
    invoke-virtual {v14}, Ljava/io/File;->length()J

    move-result-wide v6

    add-long/2addr v12, v6

    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p1

    move-object/from16 v4, v19

    move/from16 v0, v21

    goto/16 :goto_1

    :cond_b
    move/from16 v21, v0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "availableSplits "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " want "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {p1 .. p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_c

    iget-object v0, v1, Lde/a;->d:Lbe/u0;

    invoke-interface {v0}, Lbe/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/v;

    invoke-virtual {v0}, Lde/v;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v2

    move/from16 v4, v18

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_d

    :cond_c
    iget-object v0, v1, Lde/a;->d:Lbe/u0;

    invoke-interface {v0}, Lbe/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/v;

    invoke-virtual {v0}, Lde/v;->a()Ljava/lang/Integer;

    move-result-object v0

    :cond_d
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lde/a;->o(I)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_e
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual/range {p1 .. p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v3, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, -0x2

    invoke-virtual {v1, v0}, Lde/a;->o(I)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_f
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v6

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v8}, Lde/a;->w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z

    iget-object v0, v1, Lde/a;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lde/n;

    invoke-direct {v2, v1, v9, v8}, Lde/n;-><init>(Lde/a;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {v7}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_10
    const-string v0, "Specified splits directory does not exist."

    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x5

    invoke-virtual {v1, v0}, Lde/a;->o(I)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_11
    const/16 v0, -0x64

    :try_start_1
    invoke-virtual {v1, v0}, Lde/a;->o(I)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_1
    .catch Lbe/t0; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_7
    const-class v2, Lae/a;

    invoke-virtual {v0, v2}, Lbe/t0;->b(Ljava/lang/Class;)Ljava/lang/Exception;

    move-result-object v0

    check-cast v0, Lae/a;

    invoke-virtual {v0}, Lae/a;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Lde/a;->o(I)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lae/f;)V
    .locals 1

    iget-object v0, p0, Lde/a;->g:Lbe/p1;

    invoke-virtual {v0, p1}, Lbe/p1;->b(Lvd/a;)V

    return-void
.end method

.method public final c(Lae/f;)V
    .locals 1

    iget-object v0, p0, Lde/a;->g:Lbe/p1;

    invoke-virtual {v0, p1}, Lbe/p1;->a(Lvd/a;)V

    return-void
.end method

.method public final d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lae/a;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lae/a;-><init>(I)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lde/a;->c:Lae/v0;

    invoke-virtual {v1}, Lae/v0;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lde/a;->l:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lae/a;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lae/a;-><init>(I)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lde/a;->j:Ljava/io/File;

    return-object v0
.end method

.method public final synthetic j(JLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 15

    move-wide/from16 v5, p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    :goto_0
    const/4 v3, 0x3

    if-ge v0, v3, :cond_2

    const-wide/16 v3, 0x3

    div-long v3, v5, v3

    add-long/2addr v1, v3

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v7, p0

    invoke-virtual/range {v7 .. v14}, Lde/a;->w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z

    sget-wide v3, Lde/a;->p:J

    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    invoke-virtual {p0}, Lde/a;->q()Lae/e;

    move-result-object v3

    invoke-virtual {v3}, Lae/e;->i()I

    move-result v4

    const/16 v8, 0x9

    if-eq v4, v8, :cond_1

    invoke-virtual {v3}, Lae/e;->i()I

    move-result v4

    const/4 v8, 0x7

    if-eq v4, v8, :cond_1

    invoke-virtual {v3}, Lae/e;->i()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    iget-object v8, p0, Lde/a;->h:Ljava/util/concurrent/Executor;

    new-instance v0, Lde/g;

    move-object v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    invoke-direct/range {v0 .. v6}, Lde/g;-><init>(Lde/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic k(Lae/e;)V
    .locals 1

    iget-object v0, p0, Lde/a;->f:Lbe/p1;

    invoke-virtual {v0, p1}, Lbe/p1;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lde/a;->g:Lbe/p1;

    invoke-virtual {v0, p1}, Lbe/p1;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic l(Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V
    .locals 8

    iget-object v1, p0, Lde/a;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x6

    const/4 v2, -0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lde/a;->w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z

    return-void

    :cond_0
    iget-object v1, p0, Lde/a;->i:Lae/j0;

    invoke-interface {v1}, Lae/j0;->zza()Lae/k0;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v6}, Lde/a;->t(Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V

    return-void

    :cond_1
    invoke-virtual {p0, p2, p3, p4, p5}, Lde/a;->v(Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method public final synthetic m(Ljava/util/List;Ljava/util/List;)V
    .locals 7

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lbe/s0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v3, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lde/a;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v1}, Lde/a;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "module_name"

    invoke-virtual {v3, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "split_id"

    invoke-virtual {v3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lbe/s0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lde/a;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lde/a;->q()Lae/e;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lae/e;->j()J

    move-result-wide v2

    iget-object p1, p0, Lde/a;->h:Ljava/util/concurrent/Executor;

    new-instance v0, Lde/j;

    move-object v1, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lde/j;-><init>(Lde/a;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o(I)Lcom/google/android/gms/tasks/Task;
    .locals 1

    new-instance v0, Lde/p;

    invoke-direct {v0, p1}, Lde/p;-><init>(I)V

    invoke-virtual {p0, v0}, Lde/a;->r(Lde/r;)Lae/e;

    new-instance v0, Lae/a;

    invoke-direct {v0, p1}, Lae/a;-><init>(I)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final p()Lae/n0;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lde/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lde/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lde/a;->c:Lae/v0;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Lae/v0;->a(Landroid/os/Bundle;)Lae/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "App is not found in PackageManager"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final q()Lae/e;
    .locals 1

    iget-object v0, p0, Lde/a;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/e;

    return-object v0
.end method

.method public final declared-synchronized r(Lde/r;)Lae/e;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lde/a;->q()Lae/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lde/r;->a(Lae/e;)Lae/e;

    move-result-object p1

    iget-object v1, p0, Lde/a;->k:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-static {v1, v0, p1}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    monitor-exit p0

    return-object p1

    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v2, v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final t(Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V
    .locals 9

    iget-object v0, p0, Lde/a;->i:Lae/j0;

    invoke-interface {v0}, Lae/j0;->zza()Lae/k0;

    move-result-object v0

    new-instance v1, Lde/q;

    move-object v2, p0

    move-object v8, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lde/q;-><init>(Lde/a;Ljava/util/List;Ljava/util/List;JZLjava/util/List;)V

    invoke-interface {v0, v8, v1}, Lae/k0;->a(Ljava/util/List;Lae/i0;)V

    return-void
.end method

.method public final u(Lae/e;)V
    .locals 2

    iget-object v0, p0, Lde/a;->a:Landroid/os/Handler;

    new-instance v1, Lde/h;

    invoke-direct {v1, p0, p1}, Lde/h;-><init>(Lde/a;Lae/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final v(Ljava/util/List;Ljava/util/List;J)V
    .locals 8

    iget-object v0, p0, Lde/a;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lde/a;->m:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v4, v3

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lde/a;->w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z

    return-void
.end method

.method public final w(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Z
    .locals 8

    new-instance v0, Lde/i;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v1, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lde/i;-><init>(Ljava/lang/Integer;IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lde/a;->r(Lde/r;)Lae/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lde/a;->u(Lae/e;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
