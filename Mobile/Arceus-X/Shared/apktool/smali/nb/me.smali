.class public final Lnb/me;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/l8;


# static fields
.field public static volatile K:Lnb/me;


# instance fields
.field public A:J

.field public final B:Ljava/util/Map;

.field public final C:Ljava/util/Map;

.field public final D:Ljava/util/Map;

.field public final E:Ljava/util/Map;

.field public F:Lnb/bb;

.field public G:Ljava/lang/String;

.field public H:Lnb/w;

.field public I:J

.field public final J:Lnb/ue;

.field public final a:Lnb/x6;

.field public final b:Lnb/b6;

.field public c:Lnb/t;

.field public d:Lnb/e6;

.field public e:Lnb/sd;

.field public f:Lnb/e;

.field public final g:Lnb/re;

.field public h:Lnb/wa;

.field public i:Lnb/vc;

.field public final j:Lnb/zd;

.field public k:Lnb/n6;

.field public final l:Lnb/g7;

.field public final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public n:Z

.field public o:J

.field public p:Ljava/util/List;

.field public final q:Ljava/util/Deque;

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Ljava/nio/channels/FileLock;

.field public x:Ljava/nio/channels/FileChannel;

.field public y:Ljava/util/List;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lnb/ne;Lnb/g7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lnb/me;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lnb/me;->q:Ljava/util/Deque;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lnb/me;->E:Ljava/util/Map;

    new-instance p2, Lnb/he;

    invoke-direct {p2, p0}, Lnb/he;-><init>(Lnb/me;)V

    iput-object p2, p0, Lnb/me;->J:Lnb/ue;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lnb/ne;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lnb/g7;->O(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lnb/g7;

    move-result-object p2

    iput-object p2, p0, Lnb/me;->l:Lnb/g7;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnb/me;->A:J

    new-instance p2, Lnb/zd;

    invoke-direct {p2, p0}, Lnb/zd;-><init>(Lnb/me;)V

    iput-object p2, p0, Lnb/me;->j:Lnb/zd;

    new-instance p2, Lnb/re;

    invoke-direct {p2, p0}, Lnb/re;-><init>(Lnb/me;)V

    invoke-virtual {p2}, Lnb/xd;->k()V

    iput-object p2, p0, Lnb/me;->g:Lnb/re;

    new-instance p2, Lnb/b6;

    invoke-direct {p2, p0}, Lnb/b6;-><init>(Lnb/me;)V

    invoke-virtual {p2}, Lnb/xd;->k()V

    iput-object p2, p0, Lnb/me;->b:Lnb/b6;

    new-instance p2, Lnb/x6;

    invoke-direct {p2, p0}, Lnb/x6;-><init>(Lnb/me;)V

    invoke-virtual {p2}, Lnb/xd;->k()V

    iput-object p2, p0, Lnb/me;->a:Lnb/x6;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lnb/me;->B:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lnb/me;->C:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lnb/me;->D:Ljava/util/Map;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object p2

    new-instance v0, Lnb/ae;

    invoke-direct {v0, p0, p1}, Lnb/ae;-><init>(Lnb/me;Lnb/ne;)V

    invoke-virtual {p2, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static F(Landroid/content/Context;)Lnb/me;
    .locals 3

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lnb/me;->K:Lnb/me;

    if-nez v0, :cond_1

    const-class v0, Lnb/me;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnb/me;->K:Lnb/me;

    if-nez v1, :cond_0

    new-instance v1, Lnb/ne;

    invoke-direct {v1, p0}, Lnb/ne;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnb/ne;

    new-instance v1, Lnb/me;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lnb/me;-><init>(Lnb/ne;Lnb/g7;)V

    sput-object v1, Lnb/me;->K:Lnb/me;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lnb/me;->K:Lnb/me;

    return-object p0
.end method

.method public static final G(Lcom/google/android/gms/internal/measurement/n6;ILjava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "_err"

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/r6;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    return-void
.end method

.method public static final H(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/n6;->N(I)Lcom/google/android/gms/internal/measurement/n6;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static Q(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static W(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-static {}, Landroid/app/BroadcastOptions;->makeBasic()Landroid/app/BroadcastOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/BroadcastOptions;->setShareIdentityEnabled(Z)Landroid/app/BroadcastOptions;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/BroadcastOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final X(Lcom/google/android/gms/measurement/internal/zzr;)Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final Y(Lnb/xd;)Lnb/xd;
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lnb/xd;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Z(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzr;->u:Ljava/lang/Boolean;

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzr;->H:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p0}, Lnb/z2;->c(Ljava/lang/String;)Lnb/z2;

    move-result-object p0

    invoke-virtual {p0}, Lnb/z2;->a()Lnb/n8;

    move-result-object p0

    sget-object v1, Lnb/n8;->b:Lnb/n8;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static synthetic w0(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lnb/me;->W(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final A(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v2, p3

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v3

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    const/4 v9, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array v3, v9, [B

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_0
    move-object/from16 v3, p4

    :goto_0
    iget-object v4, v1, Lnb/me;->y:Ljava/util/List;

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/util/List;

    const/4 v11, 0x0

    iput-object v11, v1, Lnb/me;->y:Ljava/util/List;

    if-eqz p1, :cond_5

    const/16 v4, 0xc8

    if-eq v0, v4, :cond_1

    const/16 v4, 0xcc

    if-ne v0, v4, :cond_2

    move v0, v4

    :cond_1
    if-eqz v2, :cond_5

    :cond_2
    new-instance v4, Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x20

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v4, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->t()Lnb/u5;

    move-result-object v4

    const-string v5, "Network upload failed. Will retry later. code, error"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6, v2, v3}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lnb/me;->i:Lnb/vc;

    iget-object v2, v2, Lnb/vc;->i:Lnb/h6;

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lnb/h6;->b(J)V

    const/16 v2, 0x1f7

    if-eq v0, v2, :cond_3

    const/16 v2, 0x1ad

    if-ne v0, v2, :cond_4

    :cond_3
    iget-object v0, v1, Lnb/me;->i:Lnb/vc;

    iget-object v0, v0, Lnb/vc;->g:Lnb/h6;

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnb/h6;->b(J)V

    :cond_4
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnb/t;->v(Ljava/util/List;)V

    invoke-virtual {v1}, Lnb/me;->R()V

    goto/16 :goto_a

    :cond_5
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v4, "Network upload successful with code, uploadAttempted"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v4, v0, v5}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_6

    :try_start_1
    iget-object v2, v1, Lnb/me;->i:Lnb/vc;

    iget-object v2, v2, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lnb/h6;->b(J)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_6
    :goto_1
    iget-object v2, v1, Lnb/me;->i:Lnb/vc;

    iget-object v2, v2, Lnb/vc;->i:Lnb/h6;

    const-wide/16 v12, 0x0

    invoke-virtual {v2, v12, v13}, Lnb/h6;->b(J)V

    invoke-virtual {v1}, Lnb/me;->R()V

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v4, "Successful upload. Got network response. code, size"

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v4, v0, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v2, "Purged empty bundles"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_8
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/y6;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, Lnb/yd;

    invoke-virtual {v15}, Lnb/yd;->c()Lnb/za;

    move-result-object v2

    sget-object v6, Lnb/za;->e:Lnb/za;

    if-eq v2, v6, :cond_8

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    move-wide v6, v3

    move-object v4, v5

    invoke-virtual {v15}, Lnb/yd;->a()Ljava/lang/String;

    move-result-object v5

    move-wide v7, v6

    invoke-virtual {v15}, Lnb/yd;->b()Ljava/util/Map;

    move-result-object v6

    move-wide/from16 v16, v7

    invoke-virtual {v15}, Lnb/yd;->c()Lnb/za;

    move-result-object v7

    const/4 v8, 0x0

    move-object/from16 v3, p5

    move-wide/from16 v12, v16

    invoke-virtual/range {v2 .. v8}, Lnb/t;->m(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y6;Ljava/lang/String;Ljava/util/Map;Lnb/za;Ljava/lang/Long;)J

    move-result-wide v5

    invoke-virtual {v15}, Lnb/yd;->c()Lnb/za;

    move-result-object v2

    sget-object v3, Lnb/za;->f:Lnb/za;

    if-ne v2, v3, :cond_9

    cmp-long v2, v5, v12

    if-eqz v2, :cond_9

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/y6;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/y6;->K()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    const-wide/16 v12, 0x0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :cond_a
    move-wide v12, v3

    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lcom/google/android/gms/internal/measurement/y6;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lnb/yd;

    invoke-virtual {v2}, Lnb/yd;->c()Lnb/za;

    move-result-object v3

    sget-object v5, Lnb/za;->e:Lnb/za;

    if-ne v3, v5, :cond_b

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/y6;->K()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/Long;

    move-object v3, v2

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v3}, Lnb/yd;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lnb/yd;->b()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v3}, Lnb/yd;->c()Lnb/za;

    move-result-object v7

    move-object/from16 v3, p5

    invoke-virtual/range {v2 .. v8}, Lnb/t;->m(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/y6;Ljava/lang/String;Ljava/util/Map;Lnb/za;Ljava/lang/Long;)J

    goto :goto_4

    :cond_b
    move-object/from16 v3, p5

    goto :goto_4

    :cond_c
    move-object/from16 v3, p5

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    sget-object v2, Lnb/za;->e:Lnb/za;

    filled-new-array {v2}, [Lnb/za;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zzoo;->a([Lnb/za;)Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v2, v4}, Lnb/t;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/pe;

    invoke-virtual {v0}, Lnb/pe;->g()J

    move-result-wide v4

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v6

    sget-object v0, Lnb/z4;->F:Lnb/y4;

    invoke-virtual {v0, v11}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    add-long/2addr v14, v4

    cmp-long v0, v6, v14

    if-lez v0, :cond_d

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v2, "[sgtm] client batches are queued too long. appId, creationTime"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_d
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lnb/t;->t(J)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catch_1
    move-exception v0

    :try_start_4
    iget-object v5, v1, Lnb/me;->z:Ljava/util/List;

    if-eqz v5, :cond_e

    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_5

    :cond_e
    throw v0

    :cond_f
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    iput-object v11, v1, Lnb/me;->z:Ljava/util/List;

    invoke-virtual {v1}, Lnb/me;->E0()Lnb/b6;

    move-result-object v0

    invoke-virtual {v0}, Lnb/b6;->m()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v3}, Lnb/t;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v1, v3}, Lnb/me;->u(Ljava/lang/String;)V

    :goto_6
    const-wide/16 v2, 0x0

    goto :goto_7

    :cond_10
    invoke-virtual {v1}, Lnb/me;->E0()Lnb/b6;

    move-result-object v0

    invoke-virtual {v0}, Lnb/b6;->m()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lnb/me;->P()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lnb/me;->r()V

    goto :goto_6

    :cond_11
    iput-wide v12, v1, Lnb/me;->A:J

    invoke-virtual {v1}, Lnb/me;->R()V

    goto :goto_6

    :goto_7
    iput-wide v2, v1, Lnb/me;->o:J

    goto :goto_a

    :goto_8
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    throw v0
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_9
    :try_start_6
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v2

    iput-wide v2, v1, Lnb/me;->o:J

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v2, "Disable upload, time"

    iget-wide v3, v1, Lnb/me;->o:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_a
    iput-boolean v9, v1, Lnb/me;->u:Z

    invoke-virtual {v1}, Lnb/me;->S()V

    return-void

    :goto_b
    iput-boolean v9, v1, Lnb/me;->u:Z

    invoke-virtual {v1}, Lnb/me;->S()V

    throw v0
.end method

.method public final A0()V
    .locals 8

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->u()V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/xd;->j()V

    invoke-virtual {v0}, Lnb/t;->a0()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v1, Lnb/z4;->w0:Lnb/y4;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v5, v5, v2

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v4}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v6, v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v4, "trigger_uris"

    const-string v6, "abs(timestamp_millis - ?) > cast(? as integer)"

    invoke-virtual {v5, v4, v6, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v4, "Deleted stale trigger uris. rowsDeleted"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lnb/me;->i:Lnb/vc;

    iget-object v0, v0, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {v0}, Lnb/h6;->a()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-object v0, p0, Lnb/me;->i:Lnb/vc;

    iget-object v0, v0, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lnb/h6;->b(J)V

    :cond_2
    invoke-virtual {p0}, Lnb/me;->R()V

    return-void
.end method

.method public final B(Lnb/c6;)V
    .locals 6

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p1}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v2, 0xcc

    const/4 v3, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lnb/me;->C(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :cond_0
    move-object v0, p0

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Fetching remote configuration"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnb/x6;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g5;

    move-result-object v2

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v3

    invoke-virtual {v3, v1}, Lnb/x6;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v4, Lw1/a;

    invoke-direct {v4}, Lw1/a;-><init>()V

    const-string v2, "If-Modified-Since"

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnb/x6;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    if-nez v4, :cond_2

    new-instance v2, Lw1/a;

    invoke-direct {v2}, Lw1/a;-><init>()V

    move-object v4, v2

    :cond_2
    const-string v2, "If-None-Match"

    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v1, 0x1

    iput-boolean v1, v0, Lnb/me;->t:Z

    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object v1

    new-instance v2, Lnb/le;

    invoke-direct {v2, p0}, Lnb/le;-><init>(Lnb/me;)V

    invoke-virtual {v1, p1, v4, v2}, Lnb/b6;->o(Lnb/c6;Ljava/util/Map;Lnb/y5;)V

    return-void
.end method

.method public final B0()Lnb/k;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    return-object v0
.end method

.method public final C(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "onConfigFetched. Response size"

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1}, Lnb/t;->r0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v1

    const/16 v2, 0xc8

    const/16 v4, 0x130

    if-eq p2, v2, :cond_2

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_2

    if-ne p2, v4, :cond_1

    move p2, v4

    goto :goto_1

    :cond_1
    move v2, v0

    goto :goto_2

    :cond_2
    :goto_1
    if-nez p3, :cond_1

    const/4 v2, 0x1

    :goto_2
    if-nez v1, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_7

    :catchall_1
    move-exception p1

    goto/16 :goto_8

    :cond_3
    const/16 v5, 0x194

    if-nez v2, :cond_7

    if-ne p2, v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p4

    invoke-interface {p4}, Lu9/e;->a()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lnb/c6;->k(J)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p4

    invoke-virtual {p4, v1, v0, v0}, Lnb/t;->K0(Lnb/c6;ZZ)V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p4

    invoke-virtual {p4}, Lnb/w5;->w()Lnb/u5;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/x6;->A(Ljava/lang/String;)V

    iget-object p1, p0, Lnb/me;->i:Lnb/vc;

    iget-object p1, p1, Lnb/vc;->i:Lnb/h6;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p3

    invoke-interface {p3}, Lu9/e;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lnb/h6;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_5

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_6

    :cond_5
    iget-object p1, p0, Lnb/me;->i:Lnb/vc;

    iget-object p1, p1, Lnb/vc;->g:Lnb/h6;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p2

    invoke-interface {p2}, Lu9/e;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lnb/h6;->b(J)V

    :cond_6
    invoke-virtual {p0}, Lnb/me;->R()V

    goto/16 :goto_7

    :cond_7
    :goto_3
    const-string p3, "Last-Modified"

    invoke-static {p5, p3}, Lnb/me;->Q(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "ETag"

    invoke-static {p5, v2}, Lnb/me;->Q(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    if-eq p2, v5, :cond_9

    if-ne p2, v4, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v2

    invoke-virtual {v2, p1, p4, p3, p5}, Lnb/x6;->C(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    goto :goto_5

    :cond_9
    :goto_4
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/x6;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g5;

    move-result-object p3

    if-nez p3, :cond_a

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object p3

    const/4 p4, 0x0

    invoke-virtual {p3, p1, p4, p4, p4}, Lnb/x6;->C(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    :cond_a
    :goto_5
    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p3

    invoke-interface {p3}, Lu9/e;->a()J

    move-result-wide p3

    invoke-virtual {v1, p3, p4}, Lnb/c6;->i(J)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p3

    invoke-virtual {p3, v1, v0, v0}, Lnb/t;->K0(Lnb/c6;ZZ)V

    if-ne p2, v5, :cond_b

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->t()Lnb/u5;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    invoke-virtual {p2, p3, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_b
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object p1

    invoke-virtual {p1}, Lnb/b6;->m()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lnb/me;->P()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lnb/me;->r()V

    goto :goto_7

    :cond_c
    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object p1

    invoke-virtual {p1}, Lnb/b6;->m()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {v1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnb/t;->p(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {v1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnb/me;->u(Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    invoke-virtual {p0}, Lnb/me;->R()V

    :goto_7
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->s0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->t0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-boolean v0, p0, Lnb/me;->t:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    return-void

    :goto_8
    :try_start_3
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2}, Lnb/t;->t0()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_9
    iput-boolean v0, p0, Lnb/me;->t:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    throw p1
.end method

.method public final C0()Lnb/zd;
    .locals 1

    iget-object v0, p0, Lnb/me;->j:Lnb/zd;

    return-object v0
.end method

.method public final D(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/me;->p:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnb/me;->p:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lnb/me;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final D0()Lnb/x6;
    .locals 1

    iget-object v0, p0, Lnb/me;->a:Lnb/x6;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final E()V
    .locals 9

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-boolean v0, p0, Lnb/me;->n:Z

    if-nez v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/me;->n:Z

    invoke-virtual {p0}, Lnb/me;->a0()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lnb/me;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    const-string v2, "Bad channel to read from"

    const-wide/16 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    :try_start_0
    invoke-virtual {v1, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v7}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-eq v1, v5, :cond_1

    const/4 v7, -0x1

    if-eq v1, v7, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->r()Lnb/u5;

    move-result-object v7

    const-string v8, "Unexpected data length. Bytes read"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v8, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_1
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->o()Lnb/u5;

    move-result-object v7

    const-string v8, "Failed to read from channel"

    invoke-virtual {v7, v8, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_3
    :goto_2
    iget-object v1, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k5;->t()I

    move-result v1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v7

    invoke-virtual {v7}, Lnb/j8;->h()V

    if-le v6, v1, :cond_4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    if-ge v6, v1, :cond_8

    iget-object v7, p0, Lnb/me;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v8

    invoke-virtual {v8}, Lnb/j8;->h()V

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :try_start_1
    invoke-virtual {v7, v3, v4}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v7, v2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    invoke-virtual {v7, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_6
    :goto_3
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgraded. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :goto_4
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_7
    :goto_5
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_6
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgrade failed. Previous, current version"

    invoke-virtual {v0, v3, v2, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final E0()Lnb/b6;
    .locals 1

    iget-object v0, p0, Lnb/me;->b:Lnb/b6;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final F0()Lnb/t;
    .locals 1

    iget-object v0, p0, Lnb/me;->c:Lnb/t;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final G0()Lnb/e6;
    .locals 2

    iget-object v0, p0, Lnb/me;->d:Lnb/e6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H0()Lnb/sd;
    .locals 1

    iget-object v0, p0, Lnb/me;->e:Lnb/sd;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final I(Ljava/lang/String;Lnb/m;)I
    .locals 6

    iget-object v0, p0, Lnb/me;->a:Lnb/x6;

    invoke-virtual {v0, p1}, Lnb/x6;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    sget-object p1, Lnb/p8;->e:Lnb/p8;

    sget-object v0, Lnb/l;->k:Lnb/l;

    invoke-virtual {p2, p1, v0}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    return v2

    :cond_0
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lnb/c6;->I()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnb/z2;->c(Ljava/lang/String;)Lnb/z2;

    move-result-object v1

    invoke-virtual {v1}, Lnb/z2;->a()Lnb/n8;

    move-result-object v1

    sget-object v4, Lnb/n8;->c:Lnb/n8;

    if-ne v1, v4, :cond_2

    sget-object v1, Lnb/p8;->e:Lnb/p8;

    invoke-virtual {v0, p1, v1}, Lnb/x6;->m(Ljava/lang/String;Lnb/p8;)Lnb/n8;

    move-result-object v4

    sget-object v5, Lnb/n8;->b:Lnb/n8;

    if-eq v4, v5, :cond_2

    sget-object p1, Lnb/l;->j:Lnb/l;

    invoke-virtual {p2, v1, p1}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    sget-object p1, Lnb/n8;->e:Lnb/n8;

    if-ne v4, p1, :cond_1

    return v3

    :cond_1
    return v2

    :cond_2
    sget-object v1, Lnb/p8;->e:Lnb/p8;

    sget-object v4, Lnb/l;->c:Lnb/l;

    invoke-virtual {p2, v1, v4}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    invoke-virtual {v0, p1, v1}, Lnb/x6;->P(Ljava/lang/String;Lnb/p8;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public final I0()Lnb/e;
    .locals 1

    iget-object v0, p0, Lnb/me;->f:Lnb/e;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final J(Lcom/google/android/gms/internal/measurement/o6;)Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    const-string v1, "gad_"

    invoke-static {p1, v1}, Lnb/re;->t(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final J0()Lnb/wa;
    .locals 1

    iget-object v0, p0, Lnb/me;->h:Lnb/wa;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final K()Lnb/w;
    .locals 2

    iget-object v0, p0, Lnb/me;->H:Lnb/w;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    new-instance v1, Lnb/de;

    invoke-direct {v1, p0, v0}, Lnb/de;-><init>(Lnb/me;Lnb/l8;)V

    iput-object v1, p0, Lnb/me;->H:Lnb/w;

    :cond_0
    iget-object v0, p0, Lnb/me;->H:Lnb/w;

    return-object v0
.end method

.method public final K0()Lnb/re;
    .locals 1

    iget-object v0, p0, Lnb/me;->g:Lnb/re;

    invoke-static {v0}, Lnb/me;->Y(Lnb/xd;)Lnb/xd;

    return-object v0
.end method

.method public final L()V
    .locals 5

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/me;->q:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/me;->K()Lnb/w;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lnb/me;->I:J

    sub-long/2addr v0, v2

    sget-object v2, Lnb/z4;->C0:Lnb/y4;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Scheduling notify next app runnable, delay in ms"

    invoke-virtual {v2, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->K()Lnb/w;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lnb/w;->b(J)V

    :cond_0
    return-void
.end method

.method public final L0()Lnb/vc;
    .locals 1

    iget-object v0, p0, Lnb/me;->i:Lnb/vc;

    return-object v0
.end method

.method public final M(Ljava/lang/String;J)Z
    .locals 43

    move-object/from16 v1, p0

    const-string v0, "_f"

    const-string v2, "_ai"

    const-string v3, "purchase"

    const-string v4, "items"

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    invoke-virtual {v8}, Lnb/t;->r0()V

    :try_start_0
    new-instance v15, Lnb/ie;

    const/4 v8, 0x0

    invoke-direct {v15, v1, v8}, Lnb/ie;-><init>(Lnb/me;[B)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    iget-wide v13, v1, Lnb/me;->A:J

    move-object/from16 v10, p1

    move-wide/from16 v11, p2

    invoke-virtual/range {v9 .. v15}, Lnb/t;->n0(Ljava/lang/String;JJLnb/ie;)V

    iget-object v9, v15, Lnb/ie;->c:Ljava/util/List;

    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_1

    :cond_0
    move-object v2, v1

    const/4 v4, 0x0

    goto/16 :goto_45

    :cond_1
    iget-object v9, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->d1()Lcom/google/android/gms/internal/measurement/z6;

    move-object/from16 v17, v8

    move-object/from16 v18, v17

    const/4 v8, -0x1

    const/4 v10, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    :goto_0
    iget-object v11, v15, Lnb/ie;->c:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "_et"

    const-string v6, "_fr"

    move/from16 p3, v13

    const-string v13, "_e"

    move/from16 v21, v14

    if-ge v12, v11, :cond_36

    :try_start_1
    iget-object v11, v15, Lnb/ie;->c:Ljava/util/List;

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/n6;

    const/16 v22, 0x1

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v14

    move-object/from16 v23, v7

    iget-object v7, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    move/from16 v24, v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14, v7, v12}, Lnb/x6;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v12, "_err"

    if-eqz v7, :cond_4

    :try_start_2
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->r()Lnb/u5;

    move-result-object v5

    const-string v6, "Dropping blocked raw event. appId"

    iget-object v7, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v13, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v13}, Lnb/g7;->D()Lnb/p5;

    move-result-object v13

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v6, v7, v13}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v5

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lnb/x6;->H(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v5

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lnb/x6;->I(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v25

    iget-object v5, v1, Lnb/me;->J:Lnb/ue;

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v27

    const-string v29, "_ev"

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v28, 0xb

    move-object/from16 v26, v5

    invoke-virtual/range {v25 .. v31}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v1

    goto/16 :goto_47

    :cond_3
    :goto_1
    move/from16 v13, p3

    move-object/from16 v27, v3

    move-object v7, v4

    move/from16 v14, v21

    move/from16 v4, v24

    move-object/from16 v21, v2

    goto/16 :goto_1e

    :cond_4
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v25, v14

    const-string v14, "ecommerce_purchase"

    move-object/from16 v26, v4

    const-string v4, "_iap"

    if-nez v25, :cond_6

    :try_start_3
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_6

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    move/from16 v25, v10

    move/from16 v14, v21

    goto :goto_4

    :cond_6
    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v7

    move/from16 v25, v10

    const-string v10, "_ct"

    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    if-nez v21, :cond_7

    iget-object v10, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10, v3}, Lnb/me;->V(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v21

    if-eqz v21, :cond_7

    invoke-virtual {v1, v10, v4}, Lnb/me;->V(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v1, v10, v14}, Lnb/me;->V(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_7

    const-string v4, "new"

    goto :goto_3

    :cond_7
    const-string v4, "returning"

    :goto_3
    :try_start_4
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/measurement/r6;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    move/from16 v14, v22

    :goto_4
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lnb/r8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    const-string v7, "Renaming ad_impression to _ai"

    invoke-virtual {v4, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x5

    invoke-static {v4, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    :goto_5
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v7

    if-ge v4, v7, :cond_9

    const-string v7, "ad_platform"

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "admob"

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->t()Lnb/u5;

    move-result-object v7

    const-string v10, "AdMob ad impression logged from app. Potentially duplicative."

    invoke-virtual {v7, v10}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v4

    iget-object v7, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v7, v10}, Lnb/x6;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v7, "_c"

    if-nez v4, :cond_c

    :try_start_5
    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    move-object/from16 v21, v2

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v27, v3

    const v3, 0x17333

    if-eq v2, v3, :cond_a

    goto :goto_7

    :cond_a
    const-string v2, "_ui"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    :goto_6
    const/4 v2, 0x0

    const/4 v10, 0x0

    const/16 v28, 0x0

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v30, v5

    move v5, v8

    move-object/from16 v28, v9

    const/16 v29, 0x0

    goto/16 :goto_e

    :cond_c
    move-object/from16 v21, v2

    move-object/from16 v27, v3

    goto :goto_6

    :goto_8
    :try_start_6
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move/from16 v29, v4

    const-string v4, "_r"

    if-ge v2, v3, :cond_f

    :try_start_7
    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/r6;

    move-object/from16 v30, v5

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v11, v2, v3}, Lcom/google/android/gms/internal/measurement/n6;->C(ILcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    move/from16 v28, v22

    goto :goto_9

    :cond_d
    move-object/from16 v30, v5

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/r6;

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v11, v2, v3}, Lcom/google/android/gms/internal/measurement/n6;->C(ILcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    move/from16 v10, v22

    :cond_e
    :goto_9
    add-int/lit8 v2, v2, 0x1

    move/from16 v4, v29

    move-object/from16 v5, v30

    goto :goto_8

    :cond_f
    move-object/from16 v30, v5

    if-nez v28, :cond_10

    if-eqz v29, :cond_10

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v3, "Marking event as conversion"

    iget-object v5, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->D()Lnb/p5;

    move-result-object v5

    move/from16 v28, v10

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    move v5, v8

    move-object v3, v9

    const-wide/16 v8, 0x1

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->G(Lcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_a

    :cond_10
    move v5, v8

    move-object v3, v9

    move/from16 v28, v10

    :goto_a
    if-nez v28, :cond_11

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v8, "Marking event as real-time"

    iget-object v9, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v9}, Lnb/g7;->D()Lnb/p5;

    move-result-object v9

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    const-wide/16 v8, 0x1

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->G(Lcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;

    :cond_11
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v31

    invoke-virtual {v1}, Lnb/me;->h()J

    move-result-wide v32

    iget-object v2, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v34

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x1

    invoke-virtual/range {v31 .. v41}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v2

    iget-wide v8, v2, Lnb/p;->e:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v2

    iget-object v10, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v28, v3

    sget-object v3, Lnb/z4;->p:Lnb/y4;

    invoke-virtual {v2, v10, v3}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v2

    int-to-long v2, v2

    cmp-long v2, v8, v2

    if-lez v2, :cond_12

    invoke-static {v11, v4}, Lnb/me;->H(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)V

    goto :goto_b

    :cond_12
    move/from16 v16, v22

    :goto_b
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnb/ve;->r0(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    if-eqz v29, :cond_19

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v31

    invoke-virtual {v1}, Lnb/me;->h()J

    move-result-wide v32

    iget-object v2, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v34

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x1

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-virtual/range {v31 .. v41}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v2

    iget-wide v2, v2, Lnb/p;->c:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v4

    iget-object v8, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lnb/z4;->o:Lnb/y4;

    invoke-virtual {v4, v8, v9}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v4

    int-to-long v8, v4

    cmp-long v2, v2, v8

    if-lez v2, :cond_19

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v3, "Too many conversions. Not logging as conversion. appId"

    iget-object v4, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v8, 0x0

    :goto_c
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v9

    if-ge v2, v9, :cond_15

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/r6;

    move-object v8, v4

    move v4, v2

    goto :goto_d

    :cond_13
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    move/from16 v3, v22

    :cond_14
    :goto_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_15
    if-eqz v3, :cond_17

    if-eqz v8, :cond_16

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->N(I)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_e

    :cond_16
    const/4 v8, 0x0

    :cond_17
    if-eqz v8, :cond_18

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->r()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    const-wide/16 v8, 0xa

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v11, v4, v2}, Lcom/google/android/gms/internal/measurement/n6;->C(ILcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_e

    :cond_18
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Did not find conversion parameter. appId"

    iget-object v4, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_19
    :goto_e
    if-eqz v29, :cond_1e

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v8, -0x1

    :goto_f
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v10, "currency"

    const-string v12, "value"

    if-ge v3, v9, :cond_1c

    :try_start_8
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    move v4, v3

    goto :goto_10

    :cond_1a
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    move v8, v3

    :cond_1b
    :goto_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_1c
    const/4 v3, -0x1

    if-ne v4, v3, :cond_1d

    goto/16 :goto_13

    :cond_1d
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->K()Z

    move-result v3

    if-nez v3, :cond_1f

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->P()Z

    move-result v3

    if-nez v3, :cond_1f

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->t()Lnb/u5;

    move-result-object v2

    const-string v3, "Value must be specified with a numeric type."

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->N(I)Lcom/google/android/gms/internal/measurement/n6;

    invoke-static {v11, v7}, Lnb/me;->H(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-static {v11, v2, v12}, Lnb/me;->G(Lcom/google/android/gms/internal/measurement/n6;ILjava/lang/String;)V

    :cond_1e
    const/4 v3, -0x1

    goto :goto_13

    :cond_1f
    const/4 v3, -0x1

    if-ne v8, v3, :cond_20

    goto :goto_12

    :cond_20
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x3

    if-ne v8, v9, :cond_21

    const/4 v8, 0x0

    :goto_11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_22

    invoke-virtual {v2, v8}, Ljava/lang/String;->codePointAt(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isLetter(I)Z

    move-result v12

    if-eqz v12, :cond_21

    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v9

    add-int/2addr v8, v9

    goto :goto_11

    :cond_21
    :goto_12
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->t()Lnb/u5;

    move-result-object v2

    const-string v8, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    invoke-virtual {v2, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->N(I)Lcom/google/android/gms/internal/measurement/n6;

    invoke-static {v11, v7}, Lnb/me;->H(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-static {v11, v2, v10}, Lnb/me;->G(Lcom/google/android/gms/internal/measurement/n6;ILjava/lang/String;)V

    :cond_22
    :goto_13
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v7, 0x3e8

    if-eqz v2, :cond_26

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/o6;

    invoke-static {v2, v6}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v2

    if-nez v2, :cond_24

    if-eqz v18, :cond_23

    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v9

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v12

    sub-long/2addr v9, v12

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    cmp-long v2, v9, v7

    if-gtz v2, :cond_23

    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/cb;->r()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v1, v11, v2}, Lnb/me;->O(Lcom/google/android/gms/internal/measurement/n6;Lcom/google/android/gms/internal/measurement/n6;)Z

    move-result v4

    if-eqz v4, :cond_23

    move-object/from16 v9, v28

    invoke-virtual {v9, v5, v2}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    move v8, v5

    move/from16 v10, v25

    :goto_14
    const/16 v17, 0x0

    const/16 v18, 0x0

    goto/16 :goto_17

    :cond_23
    move-object/from16 v9, v28

    move/from16 v10, p3

    move v8, v5

    move-object/from16 v17, v11

    goto/16 :goto_17

    :cond_24
    move-object/from16 v9, v28

    :cond_25
    move/from16 v4, v25

    goto/16 :goto_16

    :cond_26
    move-object/from16 v9, v28

    const-string v2, "_vs"

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/o6;

    move-object/from16 v4, v30

    invoke-static {v2, v4}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v2

    if-nez v2, :cond_25

    if-eqz v17, :cond_27

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v28

    sub-long v12, v12, v28

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v12

    cmp-long v2, v12, v7

    if-gtz v2, :cond_27

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/cb;->r()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v1, v2, v11}, Lnb/me;->O(Lcom/google/android/gms/internal/measurement/n6;Lcom/google/android/gms/internal/measurement/n6;)Z

    move-result v4

    if-eqz v4, :cond_27

    move/from16 v4, v25

    invoke-virtual {v9, v4, v2}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    move v10, v4

    move v8, v5

    goto :goto_14

    :cond_27
    move/from16 v4, v25

    move/from16 v8, p3

    move v10, v4

    move-object/from16 v18, v11

    goto :goto_17

    :cond_28
    move/from16 v4, v25

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v2

    sget-object v6, Lnb/z4;->k1:Lnb/y4;

    const/4 v7, 0x0

    invoke-virtual {v2, v7, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v6, "_v"

    if-nez v2, :cond_29

    :try_start_9
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2c

    :cond_29
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2c

    :cond_2a
    const/4 v2, 0x0

    :goto_15
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v6

    if-ge v2, v6, :cond_2c

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v6

    const-string v7, "_elt"

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v6

    invoke-virtual {v11, v6, v7}, Lcom/google/android/gms/internal/measurement/n6;->V(J)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/measurement/n6;->N(I)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_16

    :cond_2b
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_2c
    :goto_16
    move v10, v4

    move v8, v5

    :goto_17
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v2

    if-eqz v2, :cond_34

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lnb/re;->q(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v4, 0x0

    :goto_18
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->z()I

    move-result v5

    if-ge v4, v5, :cond_31

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/measurement/n6;->A(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, v26

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2f

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/s6;->R()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2f

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/s6;->R()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    new-array v12, v12, [Landroid/os/Bundle;

    const/4 v13, 0x0

    :goto_19
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    if-ge v13, v3, :cond_2e

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->R()Ljava/util/List;

    move-result-object v22

    move-object/from16 v25, v3

    invoke-static/range {v22 .. v22}, Lnb/re;->q(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/s6;->R()Ljava/util/List;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_1a
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_2d

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lcom/google/android/gms/internal/measurement/s6;

    move/from16 v26, v4

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v25

    move-object/from16 v28, v5

    move-object/from16 v5, v25

    check-cast v5, Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v1, v4, v5, v3, v6}, Lnb/me;->z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/r6;Landroid/os/Bundle;Ljava/lang/String;)V

    move/from16 v4, v26

    move-object/from16 v5, v28

    goto :goto_1a

    :cond_2d
    move/from16 v26, v4

    move-object/from16 v28, v5

    aput-object v3, v12, v13

    add-int/lit8 v13, v13, 0x1

    move/from16 v4, v26

    move-object/from16 v5, v28

    goto :goto_19

    :cond_2e
    move/from16 v26, v4

    invoke-virtual {v2, v7, v12}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_1b

    :cond_2f
    move/from16 v26, v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_30

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/r6;

    iget-object v5, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v2, v5}, Lnb/me;->z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/r6;Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_30
    :goto_1b
    add-int/lit8 v4, v26, 0x1

    move-object/from16 v26, v7

    const/4 v3, -0x1

    goto/16 :goto_18

    :cond_31
    move-object/from16 v7, v26

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/n6;->K()Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_32
    :goto_1c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v12

    invoke-virtual {v12, v6}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_32

    invoke-virtual {v3, v12, v6}, Lnb/re;->H(Lcom/google/android/gms/internal/measurement/r6;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/s6;

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_33
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1d
    if-ge v3, v2, :cond_35

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v3, v3, 0x1

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_1d

    :cond_34
    move-object/from16 v7, v26

    :cond_35
    iget-object v2, v15, Lnb/ie;->c:Ljava/util/List;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/o6;

    move/from16 v4, v24

    invoke-interface {v2, v4, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/measurement/z6;->b1(Lcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    add-int/lit8 v13, p3, 0x1

    :goto_1e
    add-int/lit8 v12, v4, 0x1

    move-object v4, v7

    move-object/from16 v2, v21

    move-object/from16 v7, v23

    move-object/from16 v3, v27

    const-wide/16 v5, 0x1

    goto/16 :goto_0

    :cond_36
    move-object v4, v5

    move-object/from16 v23, v7

    const/16 v22, 0x1

    const-wide/16 v2, 0x0

    move/from16 v5, p3

    move-wide v7, v2

    const/4 v0, 0x0

    :goto_1f
    if-ge v0, v5, :cond_3a

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/measurement/z6;->Y0(I)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_37

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-static {v10, v6}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v11

    if-eqz v11, :cond_37

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/measurement/z6;->e1(I)Lcom/google/android/gms/internal/measurement/z6;

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_21

    :cond_37
    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-static {v10, v4}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v10

    if-eqz v10, :cond_39

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/s6;->K()Z

    move-result v11

    if-eqz v11, :cond_38

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    goto :goto_20

    :cond_38
    const/4 v10, 0x0

    :goto_20
    if-eqz v10, :cond_39

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    cmp-long v11, v11, v2

    if-lez v11, :cond_39

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    add-long/2addr v7, v10

    :cond_39
    :goto_21
    add-int/lit8 v0, v0, 0x1

    goto :goto_1f

    :cond_3a
    const/4 v4, 0x0

    invoke-virtual {v1, v9, v7, v8, v4}, Lnb/me;->N(Lcom/google/android/gms/internal/measurement/z6;JZ)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const-string v5, "_se"

    if-eqz v4, :cond_3c

    :try_start_a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/o6;

    const-string v6, "_s"

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3b

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v5}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3c
    const-string v0, "_sid"

    invoke-static {v9, v0}, Lnb/re;->X(Lcom/google/android/gms/internal/measurement/z6;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3d

    move/from16 v4, v22

    invoke-virtual {v1, v9, v7, v8, v4}, Lnb/me;->N(Lcom/google/android/gms/internal/measurement/z6;JZ)V

    goto :goto_22

    :cond_3d
    invoke-static {v9, v5}, Lnb/re;->X(Lcom/google/android/gms/internal/measurement/z6;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3e

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/measurement/z6;->m1(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v4, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v5, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3e
    :goto_22
    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v4

    invoke-virtual {v4}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    invoke-virtual {v4, v0}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v4

    if-nez v4, :cond_3f

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v5, "Cannot fix consent fields without appInfo. appId"

    invoke-static {v0}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_23

    :cond_3f
    invoke-virtual {v1, v4, v9}, Lnb/me;->n(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V

    :goto_23
    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v4

    invoke-virtual {v4}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    invoke-virtual {v4, v0}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v4

    if-nez v4, :cond_40

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->r()Lnb/u5;

    move-result-object v4

    const-string v5, "Cannot populate ad_campaign_info without appInfo. appId"

    invoke-static {v0}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_24

    :cond_40
    invoke-virtual {v1, v4, v9}, Lnb/me;->o(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V

    :goto_24
    const-wide v4, 0x7fffffffffffffffL

    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/internal/measurement/z6;->q1(J)Lcom/google/android/gms/internal/measurement/z6;

    const-wide/high16 v4, -0x8000000000000000L

    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/internal/measurement/z6;->s1(J)Lcom/google/android/gms/internal/measurement/z6;

    const/4 v4, 0x0

    :goto_25
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v0

    if-ge v4, v0, :cond_43

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/z6;->Y0(I)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v5

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->p1()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-gez v5, :cond_41

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/z6;->q1(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_41
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v5

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->r1()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-lez v5, :cond_42

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/z6;->s1(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_42
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_43
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->G0()Lcom/google/android/gms/internal/measurement/z6;

    sget-object v0, Lnb/q8;->c:Lnb/q8;

    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    iget-object v4, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->N0()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x64

    invoke-static {v4, v5}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v4

    invoke-virtual {v0, v4}, Lnb/q8;->s(Lnb/q8;)Lnb/q8;

    move-result-object v0

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    iget-object v5, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lnb/t;->X(Ljava/lang/String;)Lnb/q8;

    move-result-object v4

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v0}, Lnb/t;->W(Ljava/lang/String;Lnb/q8;)V

    sget-object v5, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v0, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    if-nez v6, :cond_44

    invoke-virtual {v4, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    if-eqz v6, :cond_44

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lnb/t;->x0(Ljava/lang/String;)V

    goto :goto_26

    :cond_44
    invoke-virtual {v0, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    if-eqz v6, :cond_45

    invoke-virtual {v4, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    if-nez v4, :cond_45

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lnb/t;->y0(Ljava/lang/String;)V

    :cond_45
    :goto_26
    sget-object v4, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v0, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    if-nez v6, :cond_46

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->V()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->Y()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->J0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_46
    invoke-virtual {v0, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v6

    if-nez v6, :cond_47

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->b0()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->R0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_47
    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v6

    iget-object v7, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lnb/z4;->Q0:Lnb/y4;

    invoke-virtual {v6, v7, v8}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v6

    if-eqz v6, :cond_48

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v6

    iget-object v7, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lnb/ve;->L(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_48

    iget-object v6, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v6

    invoke-virtual {v6, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    if-eqz v4, :cond_48

    iget-object v4, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->S0()Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-virtual {v1, v9, v15}, Lnb/me;->y(Lcom/google/android/gms/internal/measurement/z6;Lnb/ie;)V

    :cond_48
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->C0()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lnb/me;->I0()Lnb/e;

    move-result-object v24

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v26

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->f1()Ljava/util/List;

    move-result-object v27

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->p1()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v28

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->r1()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v29

    invoke-virtual {v0, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    const/16 v22, 0x1

    xor-int/lit8 v30, v0, 0x1

    invoke-virtual/range {v24 .. v30}, Lnb/e;->m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/measurement/z6;->B0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    iget-object v4, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lnb/k;->l(Ljava/lang/String;)Z

    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v0, :cond_63

    :try_start_b
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->q0()Ljava/security/SecureRandom;

    move-result-object v6

    const/4 v7, 0x0

    :goto_27
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v0

    if-ge v7, v0, :cond_60

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/z6;->Y0(I)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    const-string v10, "_ep"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    const-string v10, "_efs"

    const-string v11, "_sr"

    if-eqz v0, :cond_4e

    :try_start_c
    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    const-string v12, "_en"

    invoke-static {v0, v12}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lnb/b0;

    if-nez v12, :cond_49

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v12

    iget-object v13, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v13

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v12, v13, v14}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v12

    if-eqz v12, :cond_49

    invoke-interface {v4, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_49
    if-eqz v12, :cond_4d

    iget-object v0, v12, Lnb/b0;->i:Ljava/lang/Long;

    if-nez v0, :cond_4d

    iget-object v0, v12, Lnb/b0;->j:Ljava/lang/Long;

    if-eqz v0, :cond_4a

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    const-wide/16 v19, 0x1

    cmp-long v13, v13, v19

    if-lez v13, :cond_4b

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-static {v8, v11, v0}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_28

    :cond_4a
    const-wide/16 v19, 0x1

    :cond_4b
    :goto_28
    iget-object v0, v12, Lnb/b0;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_4c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4c

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-object/from16 v12, v23

    invoke-static {v8, v10, v12}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_29

    :cond_4c
    move-object/from16 v12, v23

    :goto_29
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_4d
    move-object/from16 v12, v23

    const-wide/16 v19, 0x1

    :goto_2a
    invoke-virtual {v9, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-wide/from16 p2, v2

    :goto_2b
    move-object/from16 v21, v6

    move v1, v7

    move-object v6, v12

    move-object/from16 v17, v15

    const/4 v12, 0x1

    goto/16 :goto_38

    :cond_4e
    move-object/from16 v12, v23

    const-wide/16 v19, 0x1

    :try_start_d
    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v13

    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v14

    const-string v0, "measurement.account.time_zone_offset_minutes"

    invoke-virtual {v13, v14, v0}, Lnb/x6;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    if-nez v17, :cond_4f

    :try_start_e
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13
    :try_end_e
    .catch Ljava/lang/NumberFormatException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-wide/from16 p2, v2

    goto :goto_2d

    :catch_0
    move-exception v0

    :try_start_f
    iget-object v13, v13, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v13

    invoke-virtual {v13}, Lnb/w5;->r()Lnb/u5;

    move-result-object v13

    move-wide/from16 p2, v2

    const-string v2, "Unable to parse timezone offset. appId"

    invoke-static {v14}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v13, v2, v3, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :goto_2c
    move-wide/from16 v13, p2

    goto :goto_2d

    :cond_4f
    move-wide/from16 p2, v2

    goto :goto_2c

    :goto_2d
    :try_start_10
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3, v13, v14}, Lnb/ve;->Y(JJ)J

    move-result-wide v2

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    const-string v1, "_dbg"

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_52

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->F()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_52

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/google/android/gms/internal/measurement/s6;

    move-object/from16 v18, v10

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_51

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_50

    goto :goto_2f

    :cond_50
    const/4 v0, 0x1

    goto :goto_30

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    goto/16 :goto_47

    :cond_51
    move-object/from16 v10, v18

    goto :goto_2e

    :cond_52
    move-object/from16 v18, v10

    :goto_2f
    invoke-virtual/range {p0 .. p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    iget-object v1, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v1, v10}, Lnb/x6;->G(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_30
    if-gtz v0, :cond_53

    invoke-virtual/range {p0 .. p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Sample rate must be positive. event, rate"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    goto/16 :goto_2b

    :cond_53
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnb/b0;

    if-nez v1, :cond_55

    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    iget-object v10, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v23, v12

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v10, v12}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v1

    if-nez v1, :cond_54

    invoke-virtual/range {p0 .. p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v10, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v12, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v24, v13

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v10, v12, v13}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v26, Lnb/b0;

    iget-object v1, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v28

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v35

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-wide/16 v29, 0x1

    const-wide/16 v31, 0x1

    const-wide/16 v33, 0x1

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v26 .. v42}, Lnb/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object/from16 v1, v26

    goto :goto_32

    :cond_54
    :goto_31
    move-wide/from16 v24, v13

    goto :goto_32

    :cond_55
    move-object/from16 v23, v12

    goto :goto_31

    :goto_32
    invoke-virtual/range {p0 .. p0}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/o6;

    const-string v12, "_eid"

    invoke-static {v10, v12}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    if-eqz v10, :cond_56

    const/16 v22, 0x1

    :goto_33
    const/4 v12, 0x1

    goto :goto_34

    :cond_56
    const/16 v22, 0x0

    goto :goto_33

    :goto_34
    if-ne v0, v12, :cond_59

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v22, :cond_58

    iget-object v0, v1, Lnb/b0;->i:Ljava/lang/Long;

    if-nez v0, :cond_57

    iget-object v0, v1, Lnb/b0;->j:Ljava/lang/Long;

    if-nez v0, :cond_57

    iget-object v0, v1, Lnb/b0;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_58

    :cond_57
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2}, Lnb/b0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lnb/b0;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_58
    invoke-virtual {v9, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    move-object/from16 v21, v6

    move v1, v7

    move-object/from16 v17, v15

    move-object/from16 v6, v23

    goto/16 :goto_38

    :cond_59
    invoke-virtual {v6, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v13

    if-nez v13, :cond_5b

    invoke-virtual/range {p0 .. p0}, Lnb/me;->K0()Lnb/re;

    int-to-long v13, v0

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v8, v11, v0}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v22, :cond_5a

    const/4 v10, 0x0

    invoke-virtual {v1, v10, v0, v10}, Lnb/b0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lnb/b0;

    move-result-object v1

    :cond_5a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v10

    invoke-virtual {v1, v10, v11, v2, v3}, Lnb/b0;->b(JJ)Lnb/b0;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v21, v6

    move v1, v7

    move-object/from16 v17, v15

    move-object/from16 v6, v23

    goto/16 :goto_37

    :cond_5b
    iget-object v13, v1, Lnb/b0;->h:Ljava/lang/Long;

    if-eqz v13, :cond_5c

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    move-object/from16 v21, v6

    move/from16 v26, v7

    move-object/from16 v17, v15

    goto :goto_35

    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v13

    move-object/from16 v17, v15

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->T()J

    move-result-wide v14

    move-object/from16 v21, v6

    move/from16 v26, v7

    move-wide/from16 v6, v24

    invoke-virtual {v13, v14, v15, v6, v7}, Lnb/ve;->Y(JJ)J

    move-result-wide v13

    :goto_35
    cmp-long v6, v13, v2

    if-eqz v6, :cond_5f

    invoke-virtual/range {p0 .. p0}, Lnb/me;->K0()Lnb/re;

    move-object/from16 v7, v18

    move-object/from16 v6, v23

    invoke-static {v8, v7, v6}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnb/me;->K0()Lnb/re;

    int-to-long v13, v0

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v8, v11, v0}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v22, :cond_5d

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v10, 0x0

    invoke-virtual {v1, v10, v0, v7}, Lnb/b0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lnb/b0;

    move-result-object v1

    :cond_5d
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v10

    invoke-virtual {v1, v10, v11, v2, v3}, Lnb/b0;->b(JJ)Lnb/b0;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5e
    :goto_36
    move/from16 v1, v26

    goto :goto_37

    :cond_5f
    move-object/from16 v6, v23

    if-eqz v22, :cond_5e

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v10, v2, v2}, Lnb/b0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lnb/b0;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_36

    :goto_37
    invoke-virtual {v9, v1, v8}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    :goto_38
    add-int/lit8 v7, v1, 0x1

    move-object/from16 v1, p0

    move-wide/from16 v2, p2

    move-object/from16 v23, v6

    move-object/from16 v15, v17

    move-object/from16 v6, v21

    goto/16 :goto_27

    :cond_60
    move-wide/from16 p2, v2

    move-object/from16 v17, v15

    const/4 v12, 0x1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v1

    if-ge v0, v1, :cond_61

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->d1()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/z6;->c1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_61
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_62

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnb/b0;

    invoke-virtual {v2, v1}, Lnb/t;->w0(Lnb/b0;)V

    goto :goto_39

    :cond_62
    move-object/from16 v15, v17

    goto :goto_3a

    :cond_63
    move-wide/from16 p2, v2

    const/4 v12, 0x1

    :goto_3a
    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v0

    if-nez v0, :cond_65

    invoke-virtual/range {p0 .. p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Bundling raw events w/o app info. appId"

    iget-object v3, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_64
    const/4 v4, 0x0

    goto :goto_3f

    :cond_65
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v2

    if-lez v2, :cond_64

    invoke-virtual {v0}, Lnb/c6;->B0()J

    move-result-wide v2

    cmp-long v4, v2, p2

    if-eqz v4, :cond_66

    invoke-virtual {v9, v2, v3}, Lcom/google/android/gms/internal/measurement/z6;->x(J)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_3b

    :cond_66
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->z()Lcom/google/android/gms/internal/measurement/z6;

    :goto_3b
    invoke-virtual {v0}, Lnb/c6;->z0()J

    move-result-wide v4

    cmp-long v6, v4, p2

    if-nez v6, :cond_67

    goto :goto_3c

    :cond_67
    move-wide v2, v4

    :goto_3c
    cmp-long v4, v2, p2

    if-eqz v4, :cond_68

    invoke-virtual {v9, v2, v3}, Lcom/google/android/gms/internal/measurement/z6;->t1(J)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_3d

    :cond_68
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->u1()Lcom/google/android/gms/internal/measurement/z6;

    :goto_3d
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Lnb/c6;->m(J)V

    invoke-virtual {v0}, Lnb/c6;->G()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/z6;->o0(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v0}, Lnb/c6;->g()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/z6;->d0(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->p1()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnb/c6;->A0(J)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->r1()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnb/c6;->C0(J)V

    invoke-virtual {v0}, Lnb/c6;->N()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_69

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/z6;->w0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_3e

    :cond_69
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->x0()Lcom/google/android/gms/internal/measurement/z6;

    :goto_3e
    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v4}, Lnb/t;->K0(Lnb/c6;ZZ)V

    :goto_3f
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    if-lez v0, :cond_6d

    move-object/from16 v2, p0

    :try_start_11
    iget-object v0, v2, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v2}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    iget-object v3, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lnb/x6;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/g5;

    move-result-object v0

    if-eqz v0, :cond_6b

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->F()Z

    move-result v3

    if-nez v3, :cond_6a

    goto :goto_40

    :cond_6a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->G()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/z6;->H0(J)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_41

    :catchall_2
    move-exception v0

    goto/16 :goto_47

    :cond_6b
    :goto_40
    iget-object v0, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->W()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6c

    const-wide/16 v5, -0x1

    invoke-virtual {v9, v5, v6}, Lcom/google/android/gms/internal/measurement/z6;->H0(J)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_41

    :cond_6c
    invoke-virtual {v2}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v3, "Did not find measurement config or missing version info. appId"

    iget-object v5, v15, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v3, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_41
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/a7;

    move/from16 v10, v16

    invoke-virtual {v0, v3, v10}, Lnb/t;->O0(Lcom/google/android/gms/internal/measurement/a7;Z)Z

    goto :goto_42

    :cond_6d
    move-object/from16 v2, p0

    :goto_42
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-object v3, v15, Lnb/ie;->b:Ljava/util/List;

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/xd;->j()V

    const-string v5, "rowid in ("

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move v10, v4

    :goto_43
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v10, v4, :cond_6f

    if-eqz v10, :cond_6e

    const-string v4, ","

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6e
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_43

    :cond_6f
    const-string v4, ")"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "raw_events"

    const/4 v10, 0x0

    invoke-virtual {v4, v6, v5, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_70

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "Deleted fewer rows from raw events table than expected"

    invoke-virtual {v0, v5, v4, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_70
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-virtual {v3}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    :try_start_12
    const-string v4, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    filled-new-array {v1, v1}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    goto :goto_44

    :catch_1
    move-exception v0

    :try_start_13
    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    const-string v4, "Failed to remove unused event metadata. appId"

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v4, v1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_44
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V

    move v10, v12

    goto :goto_46

    :goto_45
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    move v10, v4

    :goto_46
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    return v10

    :goto_47
    invoke-virtual {v2}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1}, Lnb/t;->t0()V

    throw v0
.end method

.method public final M0()Lnb/p5;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->D()Lnb/p5;

    move-result-object v0

    return-object v0
.end method

.method public final N(Lcom/google/android/gms/internal/measurement/z6;JZ)V
    .locals 10

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    const-string v1, "_lte"

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    const-string v1, "_se"

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, v1, Lnb/te;->e:Ljava/lang/Object;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    new-instance v2, Lnb/te;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->a()J

    move-result-wide v6

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    add-long/2addr v8, p2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    invoke-direct/range {v2 .. v8}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_3

    :cond_2
    :goto_2
    new-instance v2, Lnb/te;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v6

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    invoke-direct/range {v2 .. v8}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->S()Lcom/google/android/gms/internal/measurement/q7;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/q7;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->a()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/q7;->x(J)Lcom/google/android/gms/internal/measurement/q7;

    iget-object v3, v2, Lnb/te;->e:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/measurement/q7;->D(J)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/r7;

    invoke-static {p1, v5}, Lnb/re;->X(Lcom/google/android/gms/internal/measurement/z6;Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_3

    invoke-virtual {p1, v4, v1}, Lcom/google/android/gms/internal/measurement/z6;->i1(ILcom/google/android/gms/internal/measurement/r7;)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_4

    :cond_3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/z6;->j1(Lcom/google/android/gms/internal/measurement/r7;)Lcom/google/android/gms/internal/measurement/z6;

    :goto_4
    const-wide/16 v4, 0x0

    cmp-long p1, p2, v4

    if-lez p1, :cond_5

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1, v2}, Lnb/t;->A0(Lnb/te;)Z

    if-eq v0, p4, :cond_4

    const-string p1, "lifetime"

    goto :goto_5

    :cond_4
    const-string p1, "session-scoped"

    :goto_5
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->w()Lnb/u5;

    move-result-object p2

    const-string p3, "Updated engagement user property. scope, value"

    invoke-virtual {p2, p3, p1, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final N0()Lnb/ve;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    return-object v0
.end method

.method public final O(Lcom/google/android/gms/internal/measurement/n6;Lcom/google/android/gms/internal/measurement/n6;)Z
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ln9/m;->a(Z)V

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    const-string v2, "_sc"

    invoke-static {v0, v2}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/o6;

    const-string v4, "_pc"

    invoke-static {v3, v4}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/n6;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ln9/m;->a(Z)V

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    const-string v1, "_et"

    invoke-static {v0, v1}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->K()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v2

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-static {v0, v1}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_3
    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "_fr"

    invoke-static {p1, v0, p2}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final O0()V
    .locals 2

    iget-object v0, p0, Lnb/me;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final P()Z
    .locals 1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->B()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final P0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 3

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->C:I

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    invoke-static {p1, v1}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object p1

    invoke-virtual {p0, v0}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Setting storage consent for package"

    invoke-virtual {v1, v2, v0, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, Lnb/me;->f(Ljava/lang/String;Lnb/q8;)V

    return-void
.end method

.method public final Q0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 12

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->D:Ljava/lang/String;

    invoke-static {p1}, Lnb/x;->g(Ljava/lang/String;)Lnb/x;

    move-result-object p1

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Setting DMA consent for package"

    invoke-virtual {v0, v1, v4, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0, v4}, Lnb/me;->S0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lnb/x;->h(Landroid/os/Bundle;I)Lnb/x;

    move-result-object v0

    invoke-virtual {v0}, Lnb/x;->c()Lnb/n8;

    move-result-object v0

    iget-object v2, p0, Lnb/me;->C:Ljava/util/Map;

    invoke-interface {v2, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2, v4, p1}, Lnb/t;->V(Ljava/lang/String;Lnb/x;)V

    invoke-virtual {p0, v4}, Lnb/me;->S0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1, v1}, Lnb/x;->h(Landroid/os/Bundle;I)Lnb/x;

    move-result-object p1

    invoke-virtual {p1}, Lnb/x;->c()Lnb/n8;

    move-result-object p1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    sget-object v1, Lnb/n8;->d:Lnb/n8;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    sget-object v5, Lnb/n8;->e:Lnb/n8;

    if-ne p1, v5, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    sget-object v6, Lnb/n8;->e:Lnb/n8;

    if-ne v0, v6, :cond_1

    if-ne p1, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-nez v5, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v0, "Generated _dcu event for"

    invoke-virtual {p1, v0, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->h()J

    move-result-wide v2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v1 .. v11}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v0

    iget-wide v0, v0, Lnb/p;->f:J

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v2

    sget-object v3, Lnb/z4;->n0:Lnb/y4;

    invoke-virtual {v2, v4, v3}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    const-string v0, "_r"

    const-wide/16 v1, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->h()J

    move-result-wide v2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v1 .. v11}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    iget-wide v2, v0, Lnb/p;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "_dcu realtime event count"

    invoke-virtual {v1, v2, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lnb/me;->J:Lnb/ue;

    const-string v1, "_dcu"

    invoke-interface {v0, v4, v1, p1}, Lnb/ue;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final R()V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/me;->O0()V

    iget-wide v1, v0, Lnb/me;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    iget-wide v5, v0, Lnb/me;->o:J

    sub-long/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/32 v5, 0x36ee80

    sub-long/2addr v5, v1

    cmp-long v1, v5, v3

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->G0()Lnb/e6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/e6;->b()V

    invoke-virtual {v0}, Lnb/me;->H0()Lnb/sd;

    move-result-object v1

    invoke-virtual {v1}, Lnb/sd;->n()V

    return-void

    :cond_0
    iput-wide v3, v0, Lnb/me;->o:J

    :cond_1
    iget-object v1, v0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->m()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0}, Lnb/me;->P()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v5, Lnb/z4;->P:Lnb/y4;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5}, Lnb/t;->D()Z

    move-result v5

    const/4 v10, 0x1

    if-nez v5, :cond_4

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5}, Lnb/t;->s()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :cond_4
    :goto_0
    if-eqz v10, :cond_6

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    invoke-virtual {v5}, Lnb/k;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v5, Lnb/z4;->K:Lnb/y4;

    invoke-virtual {v5, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v5, Lnb/z4;->J:Lnb/y4;

    invoke-virtual {v5, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v5, Lnb/z4;->I:Lnb/y4;

    invoke-virtual {v5, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    :goto_1
    iget-object v5, v0, Lnb/me;->i:Lnb/vc;

    iget-object v5, v5, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {v5}, Lnb/h6;->a()J

    move-result-wide v13

    iget-object v5, v0, Lnb/me;->i:Lnb/vc;

    iget-object v5, v5, Lnb/vc;->i:Lnb/h6;

    invoke-virtual {v5}, Lnb/h6;->a()J

    move-result-wide v15

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    move-wide/from16 v17, v3

    invoke-virtual {v5}, Lnb/t;->y()J

    move-result-wide v3

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    move/from16 v19, v10

    invoke-virtual {v5}, Lnb/t;->A()J

    move-result-wide v9

    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    cmp-long v5, v3, v17

    if-nez v5, :cond_7

    move-wide/from16 v7, v17

    goto/16 :goto_4

    :cond_7
    sub-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    sub-long v3, v1, v3

    sub-long/2addr v13, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    sub-long v9, v1, v9

    sub-long/2addr v15, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    sub-long/2addr v1, v13

    add-long/2addr v7, v3

    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    if-eqz v19, :cond_8

    cmp-long v5, v9, v17

    if-lez v5, :cond_8

    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    add-long/2addr v7, v11

    :cond_8
    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v5, v9, v10, v11, v12}, Lnb/re;->S(JJ)Z

    move-result v5

    if-nez v5, :cond_9

    add-long/2addr v9, v11

    move-wide v7, v9

    :cond_9
    cmp-long v5, v1, v17

    if-eqz v5, :cond_a

    cmp-long v3, v1, v3

    if-ltz v3, :cond_a

    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v4, Lnb/z4;->R:Lnb/y4;

    invoke-virtual {v4, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/16 v9, 0x14

    invoke-static {v9, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_c

    const-wide/16 v9, 0x1

    shl-long/2addr v9, v3

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v4, Lnb/z4;->Q:Lnb/y4;

    invoke-virtual {v4, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    move-wide/from16 v13, v17

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    mul-long/2addr v11, v9

    add-long/2addr v7, v11

    cmp-long v4, v7, v1

    if-lez v4, :cond_b

    :cond_a
    :goto_3
    const-wide/16 v17, 0x0

    goto :goto_4

    :cond_b
    add-int/lit8 v3, v3, 0x1

    const-wide/16 v17, 0x0

    goto :goto_2

    :cond_c
    const-wide/16 v7, 0x0

    goto :goto_3

    :goto_4
    cmp-long v1, v7, v17

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/me;->G0()Lnb/e6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/e6;->b()V

    invoke-virtual {v0}, Lnb/me;->H0()Lnb/sd;

    move-result-object v1

    invoke-virtual {v1}, Lnb/sd;->n()V

    return-void

    :cond_d
    invoke-virtual {v0}, Lnb/me;->E0()Lnb/b6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/b6;->m()Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, v0, Lnb/me;->i:Lnb/vc;

    iget-object v1, v1, Lnb/vc;->g:Lnb/h6;

    invoke-virtual {v1}, Lnb/h6;->a()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v3, Lnb/z4;->G:Lnb/y4;

    invoke-virtual {v3, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v5, v1, v2, v3, v4}, Lnb/re;->S(JJ)Z

    move-result v5

    if-nez v5, :cond_e

    add-long/2addr v1, v3

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :cond_e
    invoke-virtual {v0}, Lnb/me;->G0()Lnb/e6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/e6;->b()V

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    sub-long/2addr v7, v1

    const-wide/16 v13, 0x0

    cmp-long v1, v7, v13

    if-gtz v1, :cond_f

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    sget-object v1, Lnb/z4;->L:Lnb/y4;

    invoke-virtual {v1, v6}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v1, v0, Lnb/me;->i:Lnb/vc;

    iget-object v1, v1, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {v0}, Lnb/me;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnb/h6;->b(J)V

    :cond_f
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Upload scheduled in approximately ms"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->H0()Lnb/sd;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Lnb/sd;->m(J)V

    return-void

    :cond_10
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/me;->G0()Lnb/e6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/e6;->a()V

    invoke-virtual {v0}, Lnb/me;->H0()Lnb/sd;

    move-result-object v1

    invoke-virtual {v1}, Lnb/sd;->n()V

    return-void

    :cond_11
    :goto_5
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/me;->G0()Lnb/e6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/e6;->b()V

    invoke-virtual {v0}, Lnb/me;->H0()Lnb/sd;

    move-result-object v1

    invoke-virtual {v1}, Lnb/sd;->n()V

    return-void
.end method

.method public final R0(Ljava/lang/String;)Lnb/x;
    .locals 2

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-object v0, p0, Lnb/me;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnb/x;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/t;->U(Ljava/lang/String;)Lnb/x;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final S()V
    .locals 5

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-boolean v0, p0, Lnb/me;->t:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lnb/me;->u:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lnb/me;->v:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lnb/me;->p:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnb/me;->p:Ljava/util/List;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-boolean v1, p0, Lnb/me;->t:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lnb/me;->u:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Lnb/me;->v:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "Not stopping services. fetch, network, upload"

    invoke-virtual {v0, v4, v1, v2, v3}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final S0(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v1

    invoke-virtual {v1}, Lnb/q8;->n()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Lnb/me;->R0(Ljava/lang/String;)Lnb/x;

    move-result-object v2

    new-instance v3, Lnb/m;

    invoke-direct {v3}, Lnb/m;-><init>()V

    invoke-virtual {p0, p1, v2, v1, v3}, Lnb/me;->T0(Ljava/lang/String;Lnb/x;Lnb/q8;Lnb/m;)Lnb/x;

    move-result-object v1

    invoke-virtual {v1}, Lnb/x;->f()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    const-string v2, "_npa"

    invoke-virtual {v1, p1, v2}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object p1, v1, Lnb/te;->e:Ljava/lang/Object;

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    new-instance v1, Lnb/m;

    invoke-direct {v1}, Lnb/m;-><init>()V

    invoke-virtual {p0, p1, v1}, Lnb/me;->I(Ljava/lang/String;Lnb/m;)I

    move-result p1

    :goto_0
    const/4 v1, 0x1

    if-eq v1, p1, :cond_2

    const-string p1, "granted"

    goto :goto_1

    :cond_2
    const-string p1, "denied"

    :goto_1
    const-string v1, "ad_personalization"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final T(Lnb/c6;)Ljava/lang/Boolean;
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lnb/c6;->F0()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lw9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p1}, Lnb/c6;->F0()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lw9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final T0(Ljava/lang/String;Lnb/x;Lnb/q8;Lnb/m;)Lnb/x;
    .locals 9

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v0

    const-string v1, "-"

    const/16 v2, 0x5a

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lnb/x;->c()Lnb/n8;

    move-result-object p1

    sget-object p3, Lnb/n8;->d:Lnb/n8;

    if-ne p1, p3, :cond_0

    invoke-virtual {p2}, Lnb/x;->b()I

    move-result v2

    sget-object p1, Lnb/p8;->d:Lnb/p8;

    invoke-virtual {p4, p1, v2}, Lnb/m;->b(Lnb/p8;I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lnb/p8;->d:Lnb/p8;

    sget-object p2, Lnb/l;->k:Lnb/l;

    invoke-virtual {p4, p1, p2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    :goto_0
    new-instance p1, Lnb/x;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v2, p3, v1}, Lnb/x;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lnb/x;->c()Lnb/n8;

    move-result-object v0

    sget-object v3, Lnb/n8;->e:Lnb/n8;

    if-eq v0, v3, :cond_8

    sget-object v4, Lnb/n8;->d:Lnb/n8;

    if-ne v0, v4, :cond_2

    goto :goto_2

    :cond_2
    sget-object p2, Lnb/n8;->c:Lnb/n8;

    if-ne v0, p2, :cond_3

    iget-object p2, p0, Lnb/me;->a:Lnb/x6;

    sget-object v0, Lnb/p8;->d:Lnb/p8;

    invoke-virtual {p2, p1, v0}, Lnb/x6;->m(Ljava/lang/String;Lnb/p8;)Lnb/n8;

    move-result-object p2

    sget-object v5, Lnb/n8;->b:Lnb/n8;

    if-eq p2, v5, :cond_3

    sget-object p3, Lnb/l;->j:Lnb/l;

    invoke-virtual {p4, v0, p3}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    move-object v0, p2

    goto :goto_3

    :cond_3
    iget-object p2, p0, Lnb/me;->a:Lnb/x6;

    sget-object v0, Lnb/p8;->d:Lnb/p8;

    invoke-virtual {p2, p1, v0}, Lnb/x6;->Q(Ljava/lang/String;Lnb/p8;)Lnb/p8;

    move-result-object v5

    invoke-virtual {p3}, Lnb/q8;->p()Lnb/n8;

    move-result-object p3

    const/4 v6, 0x1

    if-eq p3, v3, :cond_4

    if-ne p3, v4, :cond_5

    :cond_4
    move v7, v6

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    :goto_1
    sget-object v8, Lnb/p8;->b:Lnb/p8;

    if-ne v5, v8, :cond_6

    if-eqz v7, :cond_6

    sget-object p2, Lnb/l;->d:Lnb/l;

    invoke-virtual {p4, v0, p2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    move-object v0, p3

    goto :goto_3

    :cond_6
    sget-object p3, Lnb/l;->c:Lnb/l;

    invoke-virtual {p4, v0, p3}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    invoke-virtual {p2, p1, v0}, Lnb/x6;->P(Ljava/lang/String;Lnb/p8;)Z

    move-result p2

    if-eq v6, p2, :cond_7

    move-object v0, v4

    goto :goto_3

    :cond_7
    move-object v0, v3

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {p2}, Lnb/x;->b()I

    move-result v2

    sget-object p2, Lnb/p8;->d:Lnb/p8;

    invoke-virtual {p4, p2, v2}, Lnb/m;->b(Lnb/p8;I)V

    :goto_3
    iget-object p2, p0, Lnb/me;->a:Lnb/x6;

    invoke-virtual {p2, p1}, Lnb/x6;->S(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object p3

    invoke-virtual {p3, p1}, Lnb/x6;->T(Ljava/lang/String;)Ljava/util/SortedSet;

    move-result-object p1

    sget-object p3, Lnb/n8;->d:Lnb/n8;

    if-eq v0, p3, :cond_b

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_9

    goto :goto_4

    :cond_9
    new-instance p3, Lnb/x;

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, ""

    if-eqz p2, :cond_a

    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    :cond_a
    invoke-direct {p3, p4, v2, v0, v1}, Lnb/x;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p3

    :cond_b
    :goto_4
    new-instance p1, Lnb/x;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p3, v2, p2, v1}, Lnb/x;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p1
.end method

.method public final U(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 40

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_0

    :cond_0
    move-object/from16 v3, p0

    invoke-virtual {v3, v0}, Lnb/me;->T(Lnb/c6;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "App version does not match; dropping. appId"

    invoke-virtual {v0, v4, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v2

    :cond_1
    move-object v2, v0

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzr;

    move-object v4, v2

    invoke-virtual {v4}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v3

    move-object v6, v4

    invoke-virtual {v6}, Lnb/c6;->F0()J

    move-result-wide v4

    move-object v7, v6

    invoke-virtual {v7}, Lnb/c6;->H0()Ljava/lang/String;

    move-result-object v6

    move-object v9, v7

    invoke-virtual {v9}, Lnb/c6;->J0()J

    move-result-wide v7

    move-object v11, v9

    invoke-virtual {v11}, Lnb/c6;->L0()J

    move-result-wide v9

    invoke-virtual {v11}, Lnb/c6;->d()Z

    move-result v12

    invoke-virtual {v11}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Lnb/c6;->P()Z

    move-result v18

    invoke-virtual {v11}, Lnb/c6;->R()Ljava/lang/Boolean;

    move-result-object v20

    invoke-virtual {v11}, Lnb/c6;->b()J

    move-result-wide v21

    invoke-virtual {v11}, Lnb/c6;->T()Ljava/util/List;

    move-result-object v23

    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v13

    invoke-virtual {v13}, Lnb/q8;->l()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v11}, Lnb/c6;->V()Z

    move-result v27

    invoke-virtual {v11}, Lnb/c6;->X()J

    move-result-wide v28

    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v13

    invoke-virtual {v13}, Lnb/q8;->b()I

    move-result v30

    invoke-virtual/range {p0 .. p1}, Lnb/me;->R0(Ljava/lang/String;)Lnb/x;

    move-result-object v13

    invoke-virtual {v13}, Lnb/x;->e()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v11}, Lnb/c6;->b0()I

    move-result v32

    invoke-virtual {v11}, Lnb/c6;->j0()J

    move-result-wide v33

    invoke-virtual {v11}, Lnb/c6;->l0()Ljava/lang/String;

    move-result-object v35

    invoke-virtual {v11}, Lnb/c6;->I()Ljava/lang/String;

    move-result-object v36

    invoke-virtual {v11}, Lnb/c6;->M()I

    move-result v39

    const/16 v26, 0x0

    const-wide/16 v37, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const-string v25, ""

    invoke-direct/range {v0 .. v39}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    return-object v0

    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v3, "No app data available; dropping"

    invoke-virtual {v0, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v2
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-wide p1, p1, Lnb/b0;->c:J

    const-wide/16 v0, 0x1

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a()Lnb/w5;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    return-object v0
.end method

.method public final a0()Z
    .locals 6

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/me;->w:Ljava/nio/channels/FileLock;

    const/4 v1, 0x1

    const-string v2, "Storage concurrent access okay"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lnb/me;->c:Lnb/t;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y0;->a()Lcom/google/android/gms/internal/measurement/z0;

    sget-object v4, Lcom/google/android/gms/internal/measurement/e1;->a:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v4, Ljava/io/File;

    const-string v5, "google_app_measurement.db"

    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lnb/me;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lnb/me;->w:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return v1

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_1
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Storage lock already acquired"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :goto_2
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :goto_3
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Lnb/c7;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    return-object v0
.end method

.method public final b0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 10

    const-string v0, "app_id=?"

    iget-object v1, p0, Lnb/me;->y:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lnb/me;->z:Ljava/util/List;

    iget-object v2, p0, Lnb/me;->y:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/xd;->j()V

    :try_start_0
    invoke-virtual {v1}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "apps"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    const-string v6, "events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "events_snapshot"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "user_attributes"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "conditional_properties"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events_metadata"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "queue"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "audience_filter_values"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "main_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "default_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "trigger_uris"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "upload_queue"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/se;->a()Z

    iget-object v6, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->w()Lnb/k;

    move-result-object v7

    sget-object v8, Lnb/z4;->i1:Lnb/y4;

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v8}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "no_data_mode_events"

    invoke-virtual {v3, v7, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    if-lez v5, :cond_2

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error resetting analytics data. appId, error"

    invoke-virtual {v1, v3, v2, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_2
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lnb/me;->h0(Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_3
    return-void
.end method

.method public final c()Lnb/f;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    move-result-object v0

    return-object v0
.end method

.method public final c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "_id"

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v4

    invoke-virtual {v4}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-static {v2}, Lnb/me;->X(Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v4, :cond_1

    invoke-virtual {v1, v2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_1
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v4

    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lnb/ve;->y0(Ljava/lang/String;)I

    move-result v12

    const/4 v4, 0x1

    const/16 v5, 0x18

    const/4 v13, 0x0

    if-eqz v12, :cond_3

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v0

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    invoke-virtual {v0, v8, v5, v4}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v14

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v13

    :cond_2
    move v15, v13

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v9

    iget-object v10, v1, Lnb/me;->J:Lnb/ue;

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    const-string v13, "_ev"

    invoke-virtual/range {v9 .. v15}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v8, v7}, Lnb/ve;->y(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v17

    if-eqz v17, :cond_6

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v3

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    invoke-virtual {v3, v8, v5, v4}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v3, v0, Ljava/lang/String;

    if-nez v3, :cond_5

    instance-of v3, v0, Ljava/lang/CharSequence;

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    move/from16 v20, v13

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v14

    iget-object v15, v1, Lnb/me;->J:Lnb/ue;

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    const-string v18, "_ev"

    move-object/from16 v16, v0

    invoke-virtual/range {v14 .. v20}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v8, v5}, Lnb/ve;->z(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_e

    const-string v4, "_sid"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzpl;->h:J

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzpl;->k:Ljava/lang/String;

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v9}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v10

    const-string v12, "_sno"

    invoke-virtual {v10, v9, v12}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v10

    if-eqz v10, :cond_7

    iget-object v12, v10, Lnb/te;->e:Ljava/lang/Object;

    instance-of v14, v12, Ljava/lang/Long;

    if-eqz v14, :cond_7

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_3

    :cond_7
    if-eqz v10, :cond_8

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v12

    invoke-virtual {v12}, Lnb/w5;->r()Lnb/u5;

    move-result-object v12

    const-string v14, "Retrieved last session number from database does not contain a valid (long) value"

    iget-object v10, v10, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v12, v14, v10}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v10

    const-string v12, "_s"

    invoke-virtual {v10, v9, v12}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v10

    invoke-virtual {v10}, Lnb/w5;->w()Lnb/u5;

    move-result-object v10

    iget-wide v14, v9, Lnb/b0;->c:J

    const-string v9, "Backfill the session number. Last used session number"

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v10, v9, v12}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    move-wide v9, v14

    goto :goto_3

    :cond_9
    const-wide/16 v9, 0x0

    :goto_3
    new-instance v14, Lcom/google/android/gms/measurement/internal/zzpl;

    const-wide/16 v15, 0x1

    add-long/2addr v9, v15

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v15, "_sno"

    move-wide/from16 v16, v5

    move-object/from16 v19, v7

    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v14, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_a
    new-instance v5, Lnb/te;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v12}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzpl;->k:Ljava/lang/String;

    invoke-static {v7}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/zzpl;->h:J

    invoke-direct/range {v5 .. v11}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v6, v1, Lnb/me;->l:Lnb/g7;

    iget-object v7, v5, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v6}, Lnb/g7;->D()Lnb/p5;

    move-result-object v9

    invoke-virtual {v9, v7}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "Setting user property"

    invoke-virtual {v0, v10, v9, v11}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v12, v3}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, v5, Lnb/te;->e:Ljava/lang/Object;

    iget-object v0, v0, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    const-string v3, "_lair"

    invoke-virtual {v0, v12, v3}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_b
    :goto_4
    invoke-virtual {v1, v2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v5}, Lnb/t;->A0(Lnb/te;)Z

    move-result v0

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v3

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->z:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lnb/re;->U(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    invoke-virtual {v4, v12}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4, v2, v3}, Lnb/c6;->a0(J)V

    invoke-virtual {v4}, Lnb/c6;->A()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2, v4, v13, v13}, Lnb/t;->K0(Lnb/c6;ZZ)V

    :cond_c
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->s0()V

    if-nez v0, :cond_d

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Too many unique user properties are set. Ignoring user property"

    invoke-virtual {v6}, Lnb/g7;->D()Lnb/p5;

    move-result-object v3

    invoke-virtual {v3, v7}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v5, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v14

    iget-object v15, v1, Lnb/me;->J:Lnb/ue;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v17, 0x9

    const/16 v18, 0x0

    move-object/from16 v16, v12

    invoke-virtual/range {v14 .. v20}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_d
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    return-void

    :goto_5
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    throw v0

    :cond_e
    :goto_6
    return-void
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final d0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 8

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p2}, Lnb/me;->X(Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_1
    invoke-static {p2}, Lnb/me;->Z(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "_npa"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->v()Lnb/u5;

    move-result-object p1

    const-string v1, "Falling back to manifest metadata value for ad personalization"

    invoke-virtual {p1, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p1

    invoke-interface {p1}, Lu9/e;->a()J

    move-result-wide v4

    const/4 p1, 0x1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eq p1, v0, :cond_2

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "auto"

    const-string v3, "_npa"

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, p2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    iget-object v1, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    invoke-virtual {v2, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Removing user property"

    invoke-virtual {v0, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    const-string v0, "_id"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "_lair"

    invoke-virtual {v0, v2, v3}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2}, Lnb/t;->s0()V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->v()Lnb/u5;

    move-result-object p2

    const-string v0, "User property removed"

    invoke-virtual {v1}, Lnb/g7;->D()Lnb/p5;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->t0()V

    return-void

    :goto_2
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2}, Lnb/t;->t0()V

    throw p1
.end method

.method public final e()Lu9/e;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    return-object v0
.end method

.method public final e0()V
    .locals 1

    iget v0, p0, Lnb/me;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnb/me;->r:I

    return-void
.end method

.method public final f(Ljava/lang/String;Lnb/q8;)V
    .locals 1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-object v0, p0, Lnb/me;->B:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lnb/t;->L(Ljava/lang/String;Lnb/q8;)V

    return-void
.end method

.method public final f0()V
    .locals 1

    iget v0, p0, Lnb/me;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnb/me;->s:I

    return-void
.end method

.method public final g(Ljava/lang/String;)Lnb/q8;
    .locals 1

    sget-object v0, Lnb/q8;->c:Lnb/q8;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    iget-object v0, p0, Lnb/me;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb/q8;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/t;->J(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lnb/q8;->c:Lnb/q8;

    :cond_0
    invoke-virtual {p0, p1, v0}, Lnb/me;->f(Ljava/lang/String;Lnb/q8;)V

    :cond_1
    return-object v0
.end method

.method public final g0()Lnb/g7;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    return-object v0
.end method

.method public final h()J
    .locals 8

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v0

    iget-object v2, p0, Lnb/me;->i:Lnb/vc;

    invoke-virtual {v2}, Lnb/xd;->j()V

    invoke-virtual {v2}, Lnb/j8;->h()V

    iget-object v3, v2, Lnb/vc;->j:Lnb/h6;

    invoke-virtual {v3}, Lnb/h6;->a()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-nez v6, :cond_0

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2}, Lnb/ve;->q0()Ljava/security/SecureRandom;

    move-result-object v2

    const v4, 0x5265c00

    invoke-virtual {v2, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    int-to-long v4, v2

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Lnb/h6;->b(J)V

    :cond_0
    add-long/2addr v0, v4

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final h0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "_pfo"

    const-string v0, "com.android.vending"

    const-string v6, "_npa"

    const-string v7, "_uwa"

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v8

    invoke-virtual {v8}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v8}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2}, Lnb/me;->X(Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    invoke-virtual {v9, v8}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v9

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_1

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_1

    invoke-virtual {v9, v11, v12}, Lnb/c6;->i(J)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v13

    invoke-virtual {v13, v9, v10, v10}, Lnb/t;->K0(Lnb/c6;ZZ)V

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v9

    invoke-virtual {v9, v8}, Lnb/x6;->B(Ljava/lang/String;)V

    :cond_1
    iget-boolean v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v9, :cond_2

    invoke-virtual/range {p0 .. p1}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_2
    iget-wide v13, v2, Lcom/google/android/gms/measurement/internal/zzr;->q:J

    cmp-long v9, v13, v11

    if-nez v9, :cond_3

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v9

    invoke-interface {v9}, Lu9/e;->a()J

    move-result-wide v13

    :cond_3
    move-wide/from16 v17, v13

    iget v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->r:I

    const/4 v13, 0x1

    if-eqz v9, :cond_4

    if-eq v9, v13, :cond_4

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v14

    invoke-virtual {v14}, Lnb/w5;->r()Lnb/u5;

    move-result-object v14

    invoke-static {v8}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v11, "Incorrect app type, assuming installed app. appId, appType"

    invoke-virtual {v14, v11, v15, v9}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move v9, v10

    :cond_4
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v11

    invoke-virtual {v11}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v11

    invoke-virtual {v11, v8, v6}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v11

    invoke-static {v2}, Lnb/me;->Z(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/Boolean;

    move-result-object v12

    if-eqz v11, :cond_6

    const-string v14, "auto"

    iget-object v15, v11, Lnb/te;->b:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    goto :goto_0

    :cond_5
    move-wide/from16 v12, v17

    const-wide/16 v24, 0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_12

    :cond_6
    :goto_0
    if-eqz v12, :cond_9

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzpl;

    const-string v16, "_npa"

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eq v13, v6, :cond_7

    const-wide/16 v23, 0x0

    goto :goto_1

    :cond_7
    const-wide/16 v23, 0x1

    :goto_1
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-wide/16 v23, 0x1

    const-string v20, "auto"

    move-object/from16 v19, v6

    move-wide/from16 v13, v23

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    move-wide/from16 v24, v13

    move-wide/from16 v12, v17

    if-eqz v11, :cond_8

    iget-object v6, v11, Lnb/te;->e:Ljava/lang/Object;

    iget-object v11, v15, Lcom/google/android/gms/measurement/internal/zzpl;->i:Ljava/lang/Long;

    invoke-virtual {v6, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_8
    invoke-virtual {v1, v15, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_2

    :cond_9
    move-wide/from16 v12, v17

    const-wide/16 v24, 0x1

    if-eqz v11, :cond_a

    invoke-virtual {v1, v6, v2}, Lnb/me;->d0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_a
    :goto_2
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v6

    sget-object v11, Lnb/z4;->c1:Lnb/y4;

    const/4 v14, 0x0

    invoke-virtual {v6, v14, v11}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-wide v14, v2, Lcom/google/android/gms/measurement/internal/zzr;->I:J

    invoke-virtual {v1, v2, v14, v15}, Lnb/me;->n0(Lcom/google/android/gms/measurement/internal/zzr;J)V

    goto :goto_3

    :cond_b
    invoke-virtual {v1, v2, v12, v13}, Lnb/me;->n0(Lcom/google/android/gms/measurement/internal/zzr;J)V

    :goto_3
    invoke-virtual/range {p0 .. p1}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    if-nez v9, :cond_c

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    const-string v11, "_f"

    invoke-virtual {v9, v8, v11}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v9

    move v11, v10

    goto :goto_4

    :cond_c
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    const-string v11, "_v"

    invoke-virtual {v9, v8, v11}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v9

    const/4 v11, 0x1

    :goto_4
    if-nez v9, :cond_23

    const-wide/32 v14, 0x36ee80

    div-long v17, v12, v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long v17, v17, v24

    mul-long v17, v17, v14

    const-string v9, "_elt"

    const-string v14, "_dac"

    const-string v15, "_et"

    const-string v6, "_r"

    const-string v10, "_c"

    if-nez v11, :cond_20

    move-object v11, v15

    :try_start_1
    new-instance v15, Lcom/google/android/gms/measurement/internal/zzpl;

    const-string v16, "_fot"

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    const-string v20, "auto"

    move-wide/from16 v17, v12

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v12

    invoke-virtual {v12}, Lnb/j8;->h()V

    iget-object v12, v1, Lnb/me;->k:Lnb/n6;

    invoke-static {v12}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lnb/n6;

    if-eqz v8, :cond_d

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_e

    :cond_d
    move-object/from16 v26, v9

    goto/16 :goto_7

    :cond_e
    iget-object v15, v13, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v15}, Lnb/g7;->b()Lnb/c7;

    move-result-object v12

    invoke-virtual {v12}, Lnb/j8;->h()V

    invoke-virtual {v13}, Lnb/n6;->a()Z

    move-result v12

    if-nez v12, :cond_f

    invoke-virtual {v15}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    const-string v8, "Install Referrer Reporter is not available"

    invoke-virtual {v0, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    move-object/from16 v26, v9

    goto/16 :goto_8

    :cond_f
    new-instance v12, Lnb/m6;

    invoke-direct {v12, v13, v8}, Lnb/m6;-><init>(Lnb/n6;Ljava/lang/String;)V

    invoke-virtual {v15}, Lnb/g7;->b()Lnb/c7;

    move-result-object v8

    invoke-virtual {v8}, Lnb/j8;->h()V

    new-instance v8, Landroid/content/Intent;

    move-object/from16 v16, v15

    const-string v15, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v8, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v15, Landroid/content/ComponentName;

    move-object/from16 v26, v9

    const-string v9, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v15, v0, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v15}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    if-nez v9, :cond_10

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->s()Lnb/u5;

    move-result-object v0

    const-string v8, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    invoke-virtual {v0, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_10
    const/4 v15, 0x0

    invoke-virtual {v9, v8, v15}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_13

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v19

    if-nez v19, :cond_13

    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/pm/ResolveInfo;

    iget-object v9, v9, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v9, :cond_14

    iget-object v15, v9, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v9, v9, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v9, :cond_12

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v13}, Lnb/n6;->a()Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lt9/a;->b()Lt9/a;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v9

    const/4 v15, 0x1

    invoke-virtual {v8, v9, v0, v12, v15}, Lt9/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->w()Lnb/u5;

    move-result-object v8

    const-string v9, "Install Referrer Service is"

    if-eqz v0, :cond_11

    const-string v0, "available"

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_6

    :cond_11
    const-string v0, "not available"

    :goto_5
    invoke-virtual {v8, v9, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_8

    :goto_6
    :try_start_3
    iget-object v8, v13, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v8}, Lnb/g7;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->o()Lnb/u5;

    move-result-object v8

    const-string v9, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_12
    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v8, "Play Store version 8.3.73 or higher required for Install Referrer"

    invoke-virtual {v0, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_8

    :cond_13
    invoke-virtual/range {v16 .. v16}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    const-string v8, "Play Service for fetching Install Referrer is unavailable on device"

    invoke-virtual {v0, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_8

    :goto_7
    iget-object v0, v13, Lnb/n6;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->s()Lnb/u5;

    move-result-object v0

    const-string v8, "Install Referrer Reporter was called with invalid app package name"

    invoke-virtual {v0, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_14
    :goto_8
    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    move-wide/from16 v12, v24

    invoke-virtual {v8, v10, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v8, v6, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v9, 0x0

    invoke-virtual {v8, v7, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v8, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v8, v4, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v8, v3, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v8, v11, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->t:Z

    if-eqz v0, :cond_15

    invoke-virtual {v8, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_15
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-static {v9}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/xd;->j()V

    const-string v6, "first_open_count"

    invoke-virtual {v0, v9, v6}, Lnb/t;->z(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v10

    iget-object v0, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    if-nez v6, :cond_17

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v3, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v9}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_16
    :goto_9
    const-wide/16 v21, 0x0

    goto/16 :goto_10

    :cond_17
    :try_start_4
    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    const/4 v15, 0x0

    invoke-virtual {v0, v9, v15}, Lw9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_a

    :catch_1
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->o()Lnb/u5;

    move-result-object v6

    const-string v12, "Package info is null, first open report might be inaccurate. appId"

    invoke-static {v9}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v6, v12, v13, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v6, 0x0

    :goto_a
    if-eqz v6, :cond_1c

    iget-wide v12, v6, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v21, 0x0

    cmp-long v0, v12, v21

    if-eqz v0, :cond_1c

    iget-wide v14, v6, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v12, v14

    if-eqz v0, :cond_1a

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v6, Lnb/z4;->J0:Lnb/y4;

    const/4 v12, 0x0

    invoke-virtual {v0, v12, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-wide/16 v21, 0x0

    cmp-long v0, v10, v21

    if-nez v0, :cond_18

    const-wide/16 v12, 0x1

    invoke-virtual {v8, v7, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v10, 0x0

    :cond_18
    :goto_b
    const/4 v12, 0x0

    goto :goto_c

    :cond_19
    const-wide/16 v12, 0x1

    invoke-virtual {v8, v7, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_b

    :cond_1a
    const/4 v12, 0x1

    :goto_c
    new-instance v15, Lcom/google/android/gms/measurement/internal/zzpl;

    const-string v16, "_fi"

    const/4 v7, 0x1

    if-eq v7, v12, :cond_1b

    const-wide/16 v13, 0x0

    goto :goto_d

    :cond_1b
    const-wide/16 v13, 0x1

    :goto_d
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    const-string v20, "auto"

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_1c
    :try_start_6
    iget-object v0, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    const/4 v15, 0x0

    invoke-virtual {v0, v9, v15}, Lw9/b;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_e

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->o()Lnb/u5;

    move-result-object v7

    const-string v13, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v9}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v13, v9, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_16

    iget v7, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v12, 0x1

    and-int/2addr v7, v12

    if-eqz v7, :cond_1d

    const-wide/16 v12, 0x1

    invoke-virtual {v8, v4, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_f

    :cond_1d
    const-wide/16 v12, 0x1

    :goto_f
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_16

    invoke-virtual {v8, v3, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_9

    :goto_10
    cmp-long v0, v10, v21

    if-ltz v0, :cond_1e

    invoke-virtual {v8, v5, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1e
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v3, Lnb/z4;->k1:Lnb/y4;

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v3

    move-object/from16 v5, v26

    invoke-virtual {v8, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1f
    new-instance v15, Lcom/google/android/gms/measurement/internal/zzbg;

    const-string v16, "_f"

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v0, v8}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    move-wide/from16 v19, v17

    const-string v18, "auto"

    move-object/from16 v17, v0

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto/16 :goto_11

    :cond_20
    move-object v5, v9

    move-wide/from16 v19, v12

    move-object v11, v15

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzpl;

    const-string v16, "_fvt"

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-wide/from16 v17, v19

    const-string v20, "auto"

    move-object/from16 v19, v0

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v12, 0x1

    invoke-virtual {v0, v10, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v6, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v11, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v3, v2, Lcom/google/android/gms/measurement/internal/zzr;->t:Z

    if-eqz v3, :cond_21

    invoke-virtual {v0, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_21
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v3

    sget-object v4, Lnb/z4;->k1:Lnb/y4;

    const/4 v6, 0x0

    invoke-virtual {v3, v6, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->a()J

    move-result-wide v3

    invoke-virtual {v0, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_22
    new-instance v15, Lcom/google/android/gms/measurement/internal/zzbg;

    const-string v16, "_v"

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v3, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    move-wide/from16 v19, v17

    const-string v18, "auto"

    move-object/from16 v17, v3

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_11

    :cond_23
    move-wide/from16 v17, v12

    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->n:Z

    if-eqz v0, :cond_24

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzbg;

    const-string v16, "_cd"

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v3, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    move-wide/from16 v19, v17

    const-string v18, "auto"

    move-object/from16 v17, v3

    invoke-direct/range {v15 .. v20}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    invoke-virtual {v1, v15, v2}, Lnb/me;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_24
    :goto_11
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    return-void

    :goto_12
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    throw v0
.end method

.method public final i(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2, v3}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Lnb/me;->T(Lnb/c6;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v5, "_ui"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->r()Lnb/u5;

    move-result-object v4

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "Could not find package. appId"

    invoke-virtual {v4, v6, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    move-object v4, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "App version does not match; dropping event. appId"

    invoke-virtual {v1, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :goto_0
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzr;

    move-object v5, v4

    invoke-virtual {v5}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v4

    move-object v6, v5

    invoke-virtual {v6}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v5

    move-object v8, v6

    invoke-virtual {v8}, Lnb/c6;->F0()J

    move-result-wide v6

    move-object v9, v8

    invoke-virtual {v9}, Lnb/c6;->H0()Ljava/lang/String;

    move-result-object v8

    move-object v11, v9

    invoke-virtual {v11}, Lnb/c6;->J0()J

    move-result-wide v9

    move-object v13, v11

    invoke-virtual {v13}, Lnb/c6;->L0()J

    move-result-wide v11

    invoke-virtual {v13}, Lnb/c6;->d()Z

    move-result v14

    invoke-virtual {v13}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v13}, Lnb/c6;->P()Z

    move-result v20

    invoke-virtual {v13}, Lnb/c6;->R()Ljava/lang/Boolean;

    move-result-object v22

    invoke-virtual {v13}, Lnb/c6;->b()J

    move-result-wide v23

    invoke-virtual {v13}, Lnb/c6;->T()Ljava/util/List;

    move-result-object v25

    invoke-virtual {v0, v3}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v15

    invoke-virtual {v15}, Lnb/q8;->l()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v13}, Lnb/c6;->V()Z

    move-result v29

    invoke-virtual {v13}, Lnb/c6;->X()J

    move-result-wide v30

    invoke-virtual {v0, v3}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v15

    invoke-virtual {v15}, Lnb/q8;->b()I

    move-result v32

    invoke-virtual {v0, v3}, Lnb/me;->R0(Ljava/lang/String;)Lnb/x;

    move-result-object v15

    invoke-virtual {v15}, Lnb/x;->e()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v13}, Lnb/c6;->b0()I

    move-result v34

    invoke-virtual {v13}, Lnb/c6;->j0()J

    move-result-wide v35

    invoke-virtual {v13}, Lnb/c6;->l0()Ljava/lang/String;

    move-result-object v37

    invoke-virtual {v13}, Lnb/c6;->I()Ljava/lang/String;

    move-result-object v38

    invoke-virtual {v13}, Lnb/c6;->M()I

    move-result v41

    const/16 v28, 0x0

    const-wide/16 v39, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const-string v27, ""

    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    invoke-virtual {v0, v1, v2}, Lnb/me;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final i0(Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 8

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->A0:Lnb/y4;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v4

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v6, Lnb/z4;->j0:Lnb/y4;

    invoke-virtual {v1, v3, v6}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v1

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    invoke-static {}, Lnb/k;->n()J

    move-result-wide v6

    sub-long/2addr v4, v6

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v3, v4, v5}, Lnb/me;->M(Ljava/lang/String;J)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    invoke-static {}, Lnb/k;->p()J

    move-result-wide v4

    :goto_1
    int-to-long v6, v2

    cmp-long v1, v6, v4

    if-gez v1, :cond_1

    const-wide/16 v6, 0x0

    invoke-virtual {p0, v0, v6, v7}, Lnb/me;->M(Ljava/lang/String;J)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->B0:Lnb/y4;

    invoke-virtual {v1, v3, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->L()V

    :cond_2
    iget-object v1, p0, Lnb/me;->j:Lnb/zd;

    iget p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->J:I

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/k7;->a(I)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lnb/zd;->j(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/k7;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v1, "[sgtm] Going background, trigger client side upload. appId"

    invoke-virtual {p1, v1, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object p1

    invoke-interface {p1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lnb/me;->s(Ljava/lang/String;J)V

    :cond_3
    return-void
.end method

.method public final j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 8

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lnb/x5;->a(Lcom/google/android/gms/measurement/internal/zzbg;)Lnb/x5;

    move-result-object p1

    iget-object v1, p1, Lnb/x5;->d:Landroid/os/Bundle;

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v2

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-virtual {v3, v0}, Lnb/t;->G(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lnb/ve;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnb/k;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Lnb/ve;->u(Lnb/x5;I)V

    invoke-virtual {p1}, Lnb/x5;->b()Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object p1

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lnb/z4;->g1:Lnb/y4;

    invoke-virtual {v0, v1, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v1, "_cmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    const-string v1, "referrer API v2"

    const-string v2, "_cis"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzbe;->x3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "gclid"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbe;->x3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzpl;

    const-string v7, "auto"

    const-string v3, "_lgclid"

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, p2}, Lnb/me;->c0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lnb/me;->k(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void
.end method

.method public final j0(Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lnb/me;->U(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lnb/me;->k0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_0
    return-void
.end method

.method public final k(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "_s"

    const-string v3, "_sid"

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v5

    invoke-virtual {v5}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    move-object/from16 v5, p1

    iget-wide v9, v5, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    invoke-static {v5}, Lnb/x5;->a(Lcom/google/android/gms/measurement/internal/zzbg;)Lnb/x5;

    move-result-object v5

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v6

    invoke-virtual {v6}, Lnb/j8;->h()V

    iget-object v6, v1, Lnb/me;->F:Lnb/bb;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    iget-object v6, v1, Lnb/me;->G:Ljava/lang/String;

    if-eqz v6, :cond_0

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    move-object v6, v7

    goto :goto_0

    :cond_1
    iget-object v6, v1, Lnb/me;->F:Lnb/bb;

    :goto_0
    iget-object v8, v5, Lnb/x5;->d:Landroid/os/Bundle;

    const/4 v12, 0x0

    invoke-static {v6, v8, v12}, Lnb/ve;->k0(Lnb/bb;Landroid/os/Bundle;Z)V

    invoke-virtual {v5}, Lnb/x5;->b()Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object v5

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-static {v5, v0}, Lnb/re;->p(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v6

    if-nez v6, :cond_2

    return-void

    :cond_2
    iget-boolean v6, v0, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v6, :cond_3

    invoke-virtual {v1, v0}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_3
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzr;->w:Ljava/util/List;

    if-eqz v6, :cond_5

    iget-object v14, v5, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-interface {v6, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzbe;->y3()Landroid/os/Bundle;

    move-result-object v6

    const-string v8, "ga_safelisted"

    const-wide/16 v12, 0x1

    invoke-virtual {v6, v8, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    new-instance v13, Lcom/google/android/gms/measurement/internal/zzbg;

    new-instance v15, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v15, v6}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    iget-wide v11, v5, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    move-object/from16 v16, v6

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    invoke-virtual {v0, v5, v4, v2, v3}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v13, v5

    :goto_1
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5}, Lnb/t;->r0()V

    :try_start_0
    iget-object v5, v13, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-wide/16 v11, 0x0

    if-eqz v6, :cond_8

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    invoke-virtual {v6, v4, v2}, Lnb/t;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, v13, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzbe;->v3(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    cmp-long v2, v14, v11

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    const-string v6, "_f"

    invoke-virtual {v2, v4, v6}, Lnb/t;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    const-string v6, "_v"

    invoke-virtual {v2, v4, v6}, Lnb/t;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v6

    const-wide/16 v14, -0x3a98

    add-long/2addr v6, v14

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v4, v13}, Lnb/me;->l(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;)Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {v2, v4, v6, v3, v7}, Lnb/t;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_7
    :goto_2
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v1, v4, v13}, Lnb/me;->l(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v2, v4, v7, v3, v6}, Lnb/t;->I(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    :goto_3
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    cmp-long v3, v9, v11

    if-gez v3, :cond_9

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v6, "Invalid time querying timed out conditional properties"

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v2, v6, v7, v8}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_4

    :cond_9
    const-string v6, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lnb/t;->I0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/measurement/internal/zzah;

    if-eqz v6, :cond_a

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->w()Lnb/u5;

    move-result-object v7

    const-string v8, "User property timed out"

    iget-object v11, v6, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v12, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v12

    iget-object v14, v6, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v14, v14, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v12, v14}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v14, v6, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v8, v11, v12, v14}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v6, Lcom/google/android/gms/measurement/internal/zzah;->l:Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz v7, :cond_b

    new-instance v8, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-direct {v8, v7, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    invoke-virtual {v1, v8, v0}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_b
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v7

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v7, v4, v6}, Lnb/t;->G0(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_c
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    if-gez v3, :cond_d

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v6, "Invalid time querying expired conditional properties"

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v2, v6, v7, v8}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_6

    :cond_d
    const-string v6, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lnb/t;->I0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_6
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/zzah;

    if-eqz v7, :cond_e

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->w()Lnb/u5;

    move-result-object v8

    const-string v11, "User property expired"

    iget-object v12, v7, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v14, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v14}, Lnb/g7;->D()Lnb/p5;

    move-result-object v14

    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v15, v15, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v8, v11, v12, v14, v15}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    iget-object v11, v7, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v11, v11, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v8, v4, v11}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v7, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz v8, :cond_f

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v8, v4, v7}, Lnb/t;->G0(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_8
    if-ge v7, v2, :cond_11

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/google/android/gms/measurement/internal/zzbg;

    new-instance v11, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-direct {v11, v8, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    invoke-virtual {v1, v11, v0}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    if-gez v3, :cond_12

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->r()Lnb/u5;

    move-result-object v3

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    invoke-virtual {v2, v5}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v6, v4, v2, v5}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_9

    :cond_12
    const-string v3, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lnb/t;->I0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_9
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/measurement/internal/zzah;

    if-eqz v4, :cond_13

    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    new-instance v6, Lnb/te;

    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v7}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object v8, v6

    move-object v6, v7

    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    move-object v11, v8

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v19, v11

    move-object v11, v5

    move-object/from16 v5, v19

    invoke-direct/range {v5 .. v11}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    invoke-virtual {v6, v5}, Lnb/t;->A0(Lnb/te;)Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->w()Lnb/u5;

    move-result-object v6

    const-string v7, "User property triggered"

    iget-object v8, v4, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v11, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v11}, Lnb/g7;->D()Lnb/p5;

    move-result-object v11

    iget-object v12, v5, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iget-object v12, v5, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v6, v7, v8, v11, v12}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->o()Lnb/u5;

    move-result-object v6

    const-string v7, "Too many active user properties, ignoring"

    iget-object v8, v4, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v8}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    iget-object v11, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v11}, Lnb/g7;->D()Lnb/p5;

    move-result-object v11

    iget-object v12, v5, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iget-object v12, v5, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v6, v7, v8, v11, v12}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz v6, :cond_15

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    new-instance v6, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-direct {v6, v5}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Lnb/te;)V

    iput-object v6, v4, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    const/4 v5, 0x1

    iput-boolean v5, v4, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5, v4}, Lnb/t;->E0(Lcom/google/android/gms/measurement/internal/zzah;)Z

    goto/16 :goto_a

    :cond_16
    invoke-virtual {v1, v13, v0}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v2, :cond_17

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v12, v12, 0x1

    check-cast v4, Lcom/google/android/gms/measurement/internal/zzbg;

    new-instance v5, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-direct {v5, v4, v9, v10}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    invoke-virtual {v1, v5, v0}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_c

    :cond_17
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    return-void

    :goto_d
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    throw v0
.end method

.method public final k0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 10

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p2}, Lnb/me;->X(Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzah;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lnb/t;->F0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzah;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->r()Lnb/u5;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->D()Lnb/p5;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v6}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_2
    :goto_0
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    new-instance v4, Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-wide v6, v3, Lcom/google/android/gms/measurement/internal/zzpl;->h:J

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v8

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/zzpl;->k:Ljava/lang/String;

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v7

    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v8, p1, Lcom/google/android/gms/measurement/internal/zzpl;->k:Ljava/lang/String;

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    move p1, v2

    :cond_4
    :goto_1
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    new-instance v2, Lnb/te;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    iget-wide v6, v1, Lcom/google/android/gms/measurement/internal/zzpl;->h:J

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-direct/range {v2 .. v8}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnb/t;->A0(Lnb/te;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v3, "User property updated immediately"

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v5, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->D()Lnb/p5;

    move-result-object v5

    iget-object v6, v2, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v2, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v1, v3, v4, v5, v2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v3, "(2)Too many active user properties, ignoring"

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->D()Lnb/p5;

    move-result-object v5

    iget-object v6, v2, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v2, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v1, v3, v4, v5, v2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    if-eqz p1, :cond_6

    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    invoke-direct {p1, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Lcom/google/android/gms/measurement/internal/zzbg;J)V

    invoke-virtual {p0, p1, p2}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_6
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lnb/t;->E0(Lcom/google/android/gms/measurement/internal/zzah;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->v()Lnb/u5;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v2, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v1, v2, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzpl;->zza()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v1, v2, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->s0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->t0()V

    return-void

    :goto_4
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2}, Lnb/t;->t0()V

    throw p1
.end method

.method public final l(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;)Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    const-string v1, "_sid"

    invoke-virtual {p2, v1}, Lcom/google/android/gms/measurement/internal/zzbe;->v3(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    const-string v1, "_sno"

    invoke-virtual {p2, p1, v1}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lnb/te;->e:Ljava/lang/Object;

    instance-of p2, p1, Ljava/lang/Long;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    return-object v0
.end method

.method public final l0(Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lnb/me;->U(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lnb/me;->m0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_0
    return-void
.end method

.method public final m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 44

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const-string v3, "metadata_fingerprint"

    const-string v4, "app_id"

    const-string v5, "_fx"

    const-string v6, "raw_events"

    const-string v7, "_sno"

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v10}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v25

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-static/range {p1 .. p2}, Lnb/re;->p(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {v1, v2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_1
    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    move-object/from16 v8, p1

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v0, v10, v13}, Lnb/x6;->D(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v15, "_err"

    const/4 v9, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->D()Lnb/p5;

    move-result-object v3

    invoke-virtual {v3, v13}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Dropping blocked event. appId"

    invoke-virtual {v0, v4, v2, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnb/x6;->H(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnb/x6;->I(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    iget-object v9, v1, Lnb/me;->J:Lnb/ue;

    const-string v12, "_ev"

    const/4 v14, 0x0

    const/16 v11, 0xb

    invoke-virtual/range {v8 .. v14}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lnb/c6;->j()J

    move-result-wide v2

    invoke-virtual {v0}, Lnb/c6;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->a()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    sget-object v4, Lnb/z4;->O:Lnb/y4;

    invoke-virtual {v4, v9}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_4

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v2

    const-string v3, "Fetching config for blocked app"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lnb/me;->B(Lnb/c6;)V

    :cond_4
    :goto_1
    return-void

    :cond_5
    invoke-static {v8}, Lnb/x5;->a(Lcom/google/android/gms/measurement/internal/zzbg;)Lnb/x5;

    move-result-object v0

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v11

    invoke-virtual {v11, v10}, Lnb/k;->w(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v8, v0, v11}, Lnb/ve;->u(Lnb/x5;I)V

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v8

    sget-object v11, Lnb/z4;->h0:Lnb/y4;

    const/16 v12, 0xa

    const/16 v13, 0x23

    invoke-virtual {v8, v10, v11, v12, v13}, Lnb/k;->F(Ljava/lang/String;Lnb/y4;II)I

    move-result v8

    iget-object v11, v0, Lnb/x5;->d:Landroid/os/Bundle;

    new-instance v12, Ljava/util/TreeSet;

    invoke-virtual {v11}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_6
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const-string v14, "items"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v14

    invoke-virtual {v11, v13}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v13

    invoke-virtual {v14, v13, v8}, Lnb/ve;->v([Landroid/os/Parcelable;I)V

    goto :goto_2

    :cond_7
    invoke-virtual {v0}, Lnb/x5;->b()Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object v8

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x2

    invoke-static {v0, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v11, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v11}, Lnb/g7;->D()Lnb/p5;

    move-result-object v11

    invoke-virtual {v11, v8}, Lnb/p5;->d(Lcom/google/android/gms/measurement/internal/zzbg;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Logging event"

    invoke-virtual {v0, v12, v11}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {v1, v2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    const-string v0, "ecommerce_purchase"

    iget-object v11, v8, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v12, "refund"

    if-nez v0, :cond_9

    :try_start_1
    const-string v0, "purchase"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_28

    :goto_3
    const-string v9, "_iap"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v27, v3

    const-string v3, "value"

    if-nez v9, :cond_d

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_4

    :cond_b
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    :cond_c
    move-object v5, v8

    const/4 v4, 0x0

    goto/16 :goto_b

    :cond_d
    :goto_4
    :try_start_2
    const-string v9, "_ltv_"

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    const-string v14, "currency"

    invoke-virtual {v13, v14}, Lcom/google/android/gms/measurement/internal/zzbe;->x3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v0, :cond_10

    invoke-virtual {v13, v3}, Lcom/google/android/gms/measurement/internal/zzbe;->w3(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    const-wide v20, 0x412e848000000000L    # 1000000.0

    mul-double v18, v18, v20

    const-wide/16 v22, 0x0

    cmpl-double v0, v18, v22

    if-nez v0, :cond_e

    invoke-virtual {v13, v3}, Lcom/google/android/gms/measurement/internal/zzbe;->v3(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-double v4, v4

    mul-double v18, v4, v20

    goto :goto_5

    :cond_e
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    :goto_5
    const-wide/high16 v4, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v0, v18, v4

    if-gtz v0, :cond_f

    const-wide/high16 v4, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v0, v18, v4

    if-ltz v0, :cond_f

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    neg-long v4, v4

    goto :goto_6

    :cond_f
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v2, "Data lost. Currency value is too big. appId"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V

    goto/16 :goto_f

    :cond_10
    move-object/from16 v28, v4

    move-object/from16 v29, v5

    invoke-virtual {v13, v3}, Lcom/google/android/gms/measurement/internal/zzbe;->v3(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    :cond_11
    :goto_6
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v14, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v11, "[A-Z]{3}"

    invoke-virtual {v0, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v10, v11}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v0, Lnb/te;->e:Ljava/lang/Object;

    instance-of v9, v0, Ljava/lang/Long;

    if-nez v9, :cond_13

    :cond_12
    const/4 v9, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    goto :goto_8

    :cond_13
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    new-instance v0, Lnb/te;

    move-object v9, v10

    iget-object v10, v8, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v14

    invoke-interface {v14}, Lu9/e;->a()J

    move-result-wide v18

    add-long/2addr v12, v4

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    move-object v5, v8

    move-wide/from16 v12, v18

    const/4 v4, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object v10, v9

    move-object/from16 v4, v16

    :goto_7
    move-object v0, v8

    goto :goto_a

    :goto_8
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v12

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v13, Lnb/z4;->U:Lnb/y4;

    invoke-virtual {v0, v10, v13}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v10}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v12}, Lnb/j8;->h()V

    invoke-virtual {v12}, Lnb/xd;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v12}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    const-string v14, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'!_ltv!_%\' escape \'!\'order by set_timestamp desc limit ?,10);"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v10, v10, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v14, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_9

    :catch_0
    move-exception v0

    :try_start_4
    iget-object v12, v12, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v12

    invoke-virtual {v12}, Lnb/w5;->o()Lnb/u5;

    move-result-object v12

    const-string v13, "Error pruning currencies. appId"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v12, v13, v14, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    new-instance v0, Lnb/te;

    move v12, v9

    move-object v9, v10

    iget-object v10, v8, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    invoke-virtual {v1}, Lnb/me;->e()Lu9/e;

    move-result-object v13

    invoke-interface {v13}, Lu9/e;->a()J

    move-result-wide v13

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v5, v8

    move-wide v12, v13

    move-object v8, v0

    move-object v14, v4

    move-object/from16 v4, v16

    invoke-direct/range {v8 .. v14}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object v10, v9

    goto :goto_7

    :goto_a
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    invoke-virtual {v8, v0}, Lnb/t;->A0(Lnb/te;)Z

    move-result v8

    if-nez v8, :cond_14

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->o()Lnb/u5;

    move-result-object v8

    const-string v9, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->D()Lnb/p5;

    move-result-object v12

    iget-object v13, v0, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v12, v13}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v0, v0, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v8, v9, v11, v12, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    iget-object v9, v1, Lnb/me;->J:Lnb/ue;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v11, 0x9

    const/4 v12, 0x0

    invoke-virtual/range {v8 .. v14}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_14
    :goto_b
    iget-object v0, v5, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-static {v0}, Lnb/ve;->r0(Ljava/lang/String;)Z

    move-result v8

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    if-nez v9, :cond_15

    const-wide/16 v14, 0x0

    goto :goto_d

    :cond_15
    new-instance v13, Lnb/c0;

    invoke-direct {v13, v9}, Lnb/c0;-><init>(Lcom/google/android/gms/measurement/internal/zzbe;)V

    const-wide/16 v14, 0x0

    :cond_16
    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_17

    invoke-virtual {v13}, Lnb/c0;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/google/android/gms/measurement/internal/zzbe;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, [Landroid/os/Parcelable;

    if-eqz v12, :cond_16

    check-cast v11, [Landroid/os/Parcelable;

    array-length v11, v11

    int-to-long v11, v11

    add-long/2addr v14, v11

    goto :goto_c

    :cond_17
    :goto_d
    const-wide/16 v11, 0x1

    add-long/2addr v14, v11

    move-wide/from16 v20, v11

    move-wide v12, v14

    move v15, v8

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    move-object v14, v9

    move-object v11, v10

    invoke-virtual {v1}, Lnb/me;->h()J

    move-result-wide v9

    const-wide/16 v22, 0x0

    const/16 v19, 0x0

    move-wide/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x1

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v24, v5

    move-wide/from16 v4, v31

    move-wide/from16 v31, v22

    invoke-virtual/range {v8 .. v20}, Lnb/t;->M0(JLjava/lang/String;JZZZZZZZ)Lnb/p;

    move-result-object v8

    move-object v10, v11

    move/from16 v18, v15

    iget-wide v11, v8, Lnb/p;->b:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    invoke-static {}, Lnb/k;->p()J

    move-result-wide v13

    sub-long/2addr v11, v13

    cmp-long v9, v11, v31

    const-wide/16 v13, 0x3e8

    if-lez v9, :cond_19

    rem-long/2addr v11, v13

    cmp-long v0, v11, v4

    if-nez v0, :cond_18

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Data loss. Too many events logged. appId, count"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-wide v4, v8, Lnb/p;->b:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_18
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V

    goto/16 :goto_f

    :cond_19
    if-eqz v18, :cond_1b

    iget-wide v11, v8, Lnb/p;->a:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    sget-object v9, Lnb/z4;->n:Lnb/y4;

    const/4 v15, 0x0

    invoke-virtual {v9, v15}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move-wide v15, v13

    int-to-long v13, v9

    sub-long/2addr v11, v13

    cmp-long v9, v11, v31

    if-lez v9, :cond_1b

    rem-long/2addr v11, v15

    cmp-long v0, v11, v4

    if-nez v0, :cond_1a

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Data loss. Too many public events logged. appId, count"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-wide v4, v8, Lnb/p;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1a
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    iget-object v9, v1, Lnb/me;->J:Lnb/ue;

    const-string v12, "_ev"

    move-object/from16 v11, v24

    iget-object v13, v11, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const/4 v14, 0x0

    const/16 v11, 0x10

    invoke-virtual/range {v8 .. v14}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V

    goto/16 :goto_f

    :cond_1b
    move-object/from16 v11, v24

    const v9, 0xf4240

    if-eqz v17, :cond_1d

    iget-wide v12, v8, Lnb/p;->d:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v14

    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    move-wide/from16 v33, v4

    sget-object v4, Lnb/z4;->m:Lnb/y4;

    invoke-virtual {v14, v15, v4}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    int-to-long v14, v4

    sub-long/2addr v12, v14

    cmp-long v4, v12, v31

    if-lez v4, :cond_1e

    cmp-long v0, v12, v33

    if-nez v0, :cond_1c

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Too many error events logged. appId, count"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-wide v4, v8, Lnb/p;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1c
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V

    goto/16 :goto_f

    :cond_1d
    move-wide/from16 v33, v4

    const/4 v5, 0x0

    :cond_1e
    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/measurement/internal/zzbe;->y3()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    const-string v12, "_o"

    iget-object v13, v11, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    invoke-virtual {v8, v4, v12, v13}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->G:Ljava/lang/String;

    invoke-virtual {v8, v10, v12}, Lnb/ve;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v12, "_r"

    if-eqz v8, :cond_1f

    :try_start_5
    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    const-string v14, "_dbg"

    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v8, v4, v14, v15}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    invoke-virtual {v8, v4, v12, v15}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1f
    const-string v8, "_s"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-virtual {v8, v14, v7}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v8

    if-eqz v8, :cond_20

    iget-object v8, v8, Lnb/te;->e:Ljava/lang/Object;

    instance-of v14, v8, Ljava/lang/Long;

    if-eqz v14, :cond_20

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v14

    invoke-virtual {v14, v4, v7, v8}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_20
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v7

    sget-object v8, Lnb/z4;->Y0:Lnb/y4;

    const/4 v15, 0x0

    invoke-virtual {v7, v15, v8}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v7

    if-eqz v7, :cond_21

    const-string v7, "am"

    invoke-static {v13, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_21

    const-string v7, "_ai"

    invoke-static {v0, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v7, v0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v7, :cond_21

    :try_start_6
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-virtual {v4, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-virtual {v4, v3, v7, v8}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    :cond_21
    :try_start_7
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-static {v10}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-virtual {v3}, Lnb/xd;->j()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v3}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-object v7, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->w()Lnb/k;

    move-result-object v7

    sget-object v8, Lnb/z4;->q:Lnb/y4;

    invoke-virtual {v7, v10, v8}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v7

    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    filled-new-array {v10, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v8, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    int-to-long v7, v0

    goto :goto_e

    :catch_2
    move-exception v0

    :try_start_9
    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    const-string v7, "Error deleting over the limit events. appId"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v7, v8, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-wide/from16 v7, v31

    :goto_e
    cmp-long v0, v7, v31

    if-lez v0, :cond_22

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v3, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0, v3, v9, v7}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_22
    new-instance v8, Lnb/a0;

    iget-object v9, v1, Lnb/me;->l:Lnb/g7;

    move-object v3, v10

    iget-object v10, v11, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    move-object v7, v12

    iget-object v12, v11, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    iget-wide v13, v11, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    const-wide/16 v15, 0x0

    move-object v11, v3

    move-object/from16 v17, v4

    invoke-direct/range {v8 .. v17}, Lnb/a0;-><init>(Lnb/g7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    move-object v0, v8

    move-object v10, v11

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    iget-object v4, v0, Lnb/a0;->b:Ljava/lang/String;

    invoke-virtual {v3, v10, v4}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v3

    if-nez v3, :cond_24

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-virtual {v3, v10}, Lnb/t;->E(Ljava/lang/String;)J

    move-result-wide v11

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v3

    invoke-virtual {v3, v10}, Lnb/k;->z(Ljava/lang/String;)I

    move-result v3

    int-to-long v13, v3

    cmp-long v3, v11, v13

    if-ltz v3, :cond_23

    if-eqz v18, :cond_23

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v10}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v9}, Lnb/g7;->D()Lnb/p5;

    move-result-object v5

    invoke-virtual {v5, v4}, Lnb/p5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    invoke-virtual {v5, v10}, Lnb/k;->z(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v2, v3, v4, v5}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v8

    iget-object v9, v1, Lnb/me;->J:Lnb/ue;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    invoke-virtual/range {v8 .. v14}, Lnb/ve;->B(Lnb/ue;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_f
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    return-void

    :cond_23
    :try_start_a
    new-instance v8, Lnb/b0;

    iget-wide v11, v0, Lnb/a0;->d:J

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-wide/from16 v17, v11

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v9, v10

    move-object v10, v4

    invoke-direct/range {v8 .. v24}, Lnb/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object v3, v0

    goto :goto_10

    :cond_24
    iget-wide v10, v3, Lnb/b0;->f:J

    invoke-virtual {v0, v9, v10, v11}, Lnb/a0;->a(Lnb/g7;J)Lnb/a0;

    move-result-object v8

    iget-wide v9, v8, Lnb/a0;->d:J

    invoke-virtual {v3, v9, v10}, Lnb/b0;->a(J)Lnb/b0;

    move-result-object v0

    move-object v3, v8

    move-object v8, v0

    :goto_10
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v8}, Lnb/t;->w0(Lnb/b0;)V

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v3, Lnb/a0;->a:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ln9/m;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a7;->m0()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v8

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/z6;->e0(I)Lcom/google/android/gms/internal/measurement/z6;

    const-string v0, "android"

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_25

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/z6;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_25
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_26

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->N(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_26
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_27

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->Q(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_27
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_28

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->Q0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_28
    iget-wide v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->o:J

    const-wide/32 v12, -0x80000000

    cmp-long v0, v10, v12

    if-eqz v0, :cond_29

    long-to-int v0, v10

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->F0(I)Lcom/google/android/gms/internal/measurement/z6;

    :cond_29
    iget-wide v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->j:J

    invoke-virtual {v8, v10, v11}, Lcom/google/android/gms/internal/measurement/z6;->R(J)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_2a

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->z0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_2a
    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    const/16 v11, 0x64

    invoke-static {v10, v11}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v10

    invoke-virtual {v0, v10}, Lnb/q8;->s(Lnb/q8;)Lnb/q8;

    move-result-object v0

    invoke-virtual {v0}, Lnb/q8;->k()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/z6;->P0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v10

    sget-object v12, Lnb/z4;->Q0:Lnb/y4;

    invoke-virtual {v10, v4, v12}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v10

    if-eqz v10, :cond_35

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v10

    invoke-virtual {v10, v4}, Lnb/ve;->L(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_35

    iget v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->E:I

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/z6;->m0(I)Lcom/google/android/gms/internal/measurement/z6;

    iget-wide v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->F:J

    sget-object v4, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v0, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    const-wide/16 v14, 0x20

    if-nez v0, :cond_2b

    cmp-long v0, v12, v31

    if-eqz v0, :cond_2b

    const-wide/16 v16, -0x2

    and-long v12, v12, v16

    or-long/2addr v12, v14

    :cond_2b
    cmp-long v0, v12, v33

    if-nez v0, :cond_2c

    move v0, v9

    goto :goto_11

    :cond_2c
    move v0, v5

    :goto_11
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->V0(Z)Lcom/google/android/gms/internal/measurement/z6;

    cmp-long v0, v12, v31

    if-nez v0, :cond_2d

    goto/16 :goto_19

    :cond_2d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a6;->O()Lcom/google/android/gms/internal/measurement/z5;

    move-result-object v0

    and-long v16, v12, v33

    cmp-long v4, v16, v31

    if-eqz v4, :cond_2e

    move v4, v9

    goto :goto_12

    :cond_2e
    move v4, v5

    :goto_12
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->x(Z)Lcom/google/android/gms/internal/measurement/z5;

    const-wide/16 v16, 0x2

    and-long v16, v12, v16

    cmp-long v4, v16, v31

    if-eqz v4, :cond_2f

    move v4, v9

    goto :goto_13

    :cond_2f
    move v4, v5

    :goto_13
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->z(Z)Lcom/google/android/gms/internal/measurement/z5;

    const-wide/16 v16, 0x4

    and-long v16, v12, v16

    cmp-long v4, v16, v31

    if-eqz v4, :cond_30

    move v4, v9

    goto :goto_14

    :cond_30
    move v4, v5

    :goto_14
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->A(Z)Lcom/google/android/gms/internal/measurement/z5;

    const-wide/16 v16, 0x8

    and-long v16, v12, v16

    cmp-long v4, v16, v31

    if-eqz v4, :cond_31

    move v4, v9

    goto :goto_15

    :cond_31
    move v4, v5

    :goto_15
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->C(Z)Lcom/google/android/gms/internal/measurement/z5;

    const-wide/16 v16, 0x10

    and-long v16, v12, v16

    cmp-long v4, v16, v31

    if-eqz v4, :cond_32

    move v4, v9

    goto :goto_16

    :cond_32
    move v4, v5

    :goto_16
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->D(Z)Lcom/google/android/gms/internal/measurement/z5;

    and-long/2addr v14, v12

    cmp-long v4, v14, v31

    if-eqz v4, :cond_33

    move v4, v9

    goto :goto_17

    :cond_33
    move v4, v5

    :goto_17
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/z5;->E(Z)Lcom/google/android/gms/internal/measurement/z5;

    const-wide/16 v14, 0x40

    and-long/2addr v12, v14

    cmp-long v4, v12, v31

    if-eqz v4, :cond_34

    move v13, v9

    goto :goto_18

    :cond_34
    move v13, v5

    :goto_18
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/measurement/z5;->G(Z)Lcom/google/android/gms/internal/measurement/z5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a6;

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->n0(Lcom/google/android/gms/internal/measurement/a6;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_35
    :goto_19
    iget-wide v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->k:J

    cmp-long v0, v12, v31

    if-eqz v0, :cond_36

    invoke-virtual {v8, v12, v13}, Lcom/google/android/gms/internal/measurement/z6;->c0(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_36
    iget-wide v12, v2, Lcom/google/android/gms/measurement/internal/zzr;->v:J

    invoke-virtual {v8, v12, v13}, Lcom/google/android/gms/internal/measurement/z6;->N0(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v4

    iget-object v0, v4, Lnb/td;->b:Lnb/me;

    iget-object v0, v0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v10, "com.google.android.gms.measurement"

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/a9;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    sget-object v12, Lnb/v4;->a:Lnb/v4;

    invoke-static {v0, v10, v12}, Lcom/google/android/gms/internal/measurement/p8;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/measurement/p8;

    move-result-object v0

    if-nez v0, :cond_37

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_1a

    :cond_37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p8;->d()Ljava/util/Map;

    move-result-object v0

    :goto_1a
    if-eqz v0, :cond_38

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_39

    :cond_38
    :goto_1b
    const/4 v10, 0x0

    goto/16 :goto_1e

    :cond_39
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    sget-object v12, Lnb/z4;->g0:Lnb/y4;

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_3a
    :goto_1c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const-string v15, "measurement.id."

    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v14, :cond_3a

    :try_start_b
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v12, :cond_3a

    iget-object v0, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v14, "Too many experiment IDs. Number of IDs"

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v0, v14, v15}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_1d

    :catch_3
    move-exception v0

    :try_start_c
    iget-object v14, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v14}, Lnb/g7;->a()Lnb/w5;

    move-result-object v14

    invoke-virtual {v14}, Lnb/w5;->r()Lnb/u5;

    move-result-object v14

    const-string v15, "Experiment ID NumberFormatException"

    invoke-virtual {v14, v15, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1c

    :cond_3b
    :goto_1d
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3c

    goto :goto_1b

    :cond_3c
    :goto_1e
    if-eqz v10, :cond_3d

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/z6;->M0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3d
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v4, Lnb/z4;->b1:Lnb/y4;

    const/4 v15, 0x0

    invoke-virtual {v0, v15, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_3e

    const-string v0, ""

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/z6;->u0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3e
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v4

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    invoke-static {v10, v11}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v10

    invoke-virtual {v4, v10}, Lnb/q8;->s(Lnb/q8;)Lnb/q8;

    move-result-object v4

    sget-object v10, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v4, v10}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v11

    if-eqz v11, :cond_42

    iget-boolean v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    if-eqz v11, :cond_42

    iget-object v11, v1, Lnb/me;->i:Lnb/vc;

    invoke-virtual {v11, v0, v4}, Lnb/vc;->m(Ljava/lang/String;Lnb/q8;)Landroid/util/Pair;

    move-result-object v11

    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_42

    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/measurement/z6;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v12, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v12, :cond_3f

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/measurement/z6;->X(Z)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3f
    iget-object v12, v3, Lnb/a0;->b:Ljava/lang/String;

    move-object/from16 v13, v29

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_42

    iget-object v11, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    const-string v12, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_42

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v11

    invoke-virtual {v11, v0}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v11

    if-eqz v11, :cond_42

    invoke-virtual {v11}, Lnb/c6;->d0()Z

    move-result v12

    if-eqz v12, :cond_42

    const/4 v15, 0x0

    invoke-virtual {v1, v0, v5, v15, v15}, Lnb/me;->w(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v11}, Lnb/c6;->f0()Ljava/lang/Long;

    move-result-object v14

    if-eqz v14, :cond_40

    const-string v15, "_pfo"

    move-object/from16 v16, v6

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    move-object v14, v10

    move-wide/from16 v9, v31

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual {v12, v15, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_1f

    :cond_40
    move-object/from16 v16, v6

    move-object v14, v10

    :goto_1f
    invoke-virtual {v11}, Lnb/c6;->h0()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_41

    const-string v6, "_uwa"

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v12, v6, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_41
    move-wide/from16 v5, v33

    invoke-virtual {v12, v7, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v5, v1, Lnb/me;->J:Lnb/ue;

    invoke-interface {v5, v0, v13, v12}, Lnb/ue;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_20

    :cond_42
    move-object/from16 v16, v6

    move-object v14, v10

    :goto_20
    iget-object v5, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->K()Lnb/z;

    move-result-object v6

    invoke-virtual {v6}, Lnb/k8;->l()V

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/measurement/z6;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v5}, Lnb/g7;->K()Lnb/z;

    move-result-object v6

    invoke-virtual {v6}, Lnb/k8;->l()V

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/measurement/z6;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v5}, Lnb/g7;->K()Lnb/z;

    move-result-object v6

    invoke-virtual {v6}, Lnb/z;->o()J

    move-result-wide v9

    long-to-int v6, v9

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/measurement/z6;->K(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v5}, Lnb/g7;->K()Lnb/z;

    move-result-object v6

    invoke-virtual {v6}, Lnb/z;->p()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/measurement/z6;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->B:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->U0(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v5}, Lnb/g7;->g()Z

    move-result v6

    if-eqz v6, :cond_43

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    const/4 v15, 0x0

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_43

    invoke-virtual {v8, v15}, Lcom/google/android/gms/internal/measurement/z6;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_43
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    invoke-virtual {v6, v0}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v6

    if-nez v6, :cond_45

    new-instance v6, Lnb/c6;

    invoke-direct {v6, v5, v0}, Lnb/c6;-><init>(Lnb/g7;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lnb/me;->p(Lnb/q8;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lnb/c6;->q0(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->p:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lnb/c6;->y0(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lnb/c6;->s0(Ljava/lang/String;)V

    invoke-virtual {v4, v14}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v5

    if-eqz v5, :cond_44

    iget-object v5, v1, Lnb/me;->i:Lnb/vc;

    iget-boolean v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    invoke-virtual {v5, v0, v9}, Lnb/vc;->o(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lnb/c6;->w0(Ljava/lang/String;)V

    :cond_44
    const-wide/16 v9, 0x0

    invoke-virtual {v6, v9, v10}, Lnb/c6;->f(J)V

    invoke-virtual {v6, v9, v10}, Lnb/c6;->A0(J)V

    invoke-virtual {v6, v9, v10}, Lnb/c6;->C0(J)V

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->h:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lnb/c6;->E0(Ljava/lang/String;)V

    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->o:J

    invoke-virtual {v6, v9, v10}, Lnb/c6;->G0(J)V

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->i:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lnb/c6;->I0(Ljava/lang/String;)V

    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->j:J

    invoke-virtual {v6, v9, v10}, Lnb/c6;->K0(J)V

    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->k:J

    invoke-virtual {v6, v9, v10}, Lnb/c6;->a(J)V

    iget-boolean v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    invoke-virtual {v6, v5}, Lnb/c6;->e(Z)V

    iget-wide v9, v2, Lcom/google/android/gms/measurement/internal/zzr;->v:J

    invoke-virtual {v6, v9, v10}, Lnb/c6;->c(J)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v5, v6, v9, v9}, Lnb/t;->K0(Lnb/c6;ZZ)V

    goto :goto_21

    :cond_45
    const/4 v9, 0x0

    :goto_21
    sget-object v5, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v4, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    if-eqz v4, :cond_46

    invoke-virtual {v6}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_46

    invoke-virtual {v6}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/z6;->a0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_46
    invoke-virtual {v6}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_47

    invoke-virtual {v6}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/z6;->D0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_47
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    invoke-virtual {v4, v0}, Lnb/t;->C0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    move v14, v9

    :goto_22
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v14, v4, :cond_49

    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->S()Lcom/google/android/gms/internal/measurement/q7;

    move-result-object v4

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnb/te;

    iget-object v5, v5, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/q7;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnb/te;

    iget-wide v10, v5, Lnb/te;->d:J

    invoke-virtual {v4, v10, v11}, Lcom/google/android/gms/internal/measurement/q7;->x(J)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lnb/te;

    iget-object v10, v10, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v5, v4, v10}, Lnb/re;->G(Lcom/google/android/gms/internal/measurement/q7;Ljava/lang/Object;)V

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/z6;->k1(Lcom/google/android/gms/internal/measurement/q7;)Lcom/google/android/gms/internal/measurement/z6;

    const-string v4, "_sid"

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnb/te;

    iget-object v5, v5, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-virtual {v6}, Lnb/c6;->Z()J

    move-result-wide v4

    const-wide/16 v31, 0x0

    cmp-long v4, v4, v31

    if-eqz v4, :cond_48

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v4

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->z:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lnb/re;->U(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v6}, Lnb/c6;->Z()J

    move-result-wide v10

    cmp-long v4, v4, v10

    if-eqz v4, :cond_48

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z6;->R0()Lcom/google/android/gms/internal/measurement/z6;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_48
    add-int/lit8 v14, v14, 0x1

    goto :goto_22

    :cond_49
    :try_start_d
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v0

    iget-object v5, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v5}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v5, v0}, Lnb/re;->T([B)J

    move-result-wide v5

    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v12, v28

    invoke-virtual {v10, v12, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    move-object/from16 v13, v27

    invoke-virtual {v10, v13, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v11, "metadata"

    invoke-virtual {v10, v11, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :try_start_e
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v11, "raw_events_metadata"

    const/4 v14, 0x4

    const/4 v15, 0x0

    invoke-virtual {v0, v11, v15, v10, v14}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :try_start_f
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    iget-object v0, v3, Lnb/a0;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    new-instance v4, Lnb/c0;

    invoke-direct {v4, v0}, Lnb/c0;-><init>(Lcom/google/android/gms/measurement/internal/zzbe;)V

    :cond_4a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-virtual {v4}, Lnb/c0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4a

    :goto_23
    const/16 v30, 0x1

    goto :goto_24

    :cond_4b
    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    iget-object v4, v3, Lnb/a0;->a:Ljava/lang/String;

    iget-object v7, v3, Lnb/a0;->b:Ljava/lang/String;

    invoke-virtual {v0, v4, v7}, Lnb/x6;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v33

    invoke-virtual {v1}, Lnb/me;->h()J

    move-result-wide v34

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v36, v4

    invoke-virtual/range {v33 .. v43}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v4

    move-object/from16 v7, v36

    if-eqz v0, :cond_4c

    iget-wide v10, v4, Lnb/p;->e:J

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v4, Lnb/z4;->p:Lnb/y4;

    invoke-virtual {v0, v7, v4}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v0

    int-to-long v7, v0

    cmp-long v0, v10, v7

    if-gez v0, :cond_4c

    goto :goto_23

    :cond_4c
    move/from16 v30, v9

    :goto_24
    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v3, Lnb/a0;->a:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v4, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v4}, Lnb/me;->K0()Lnb/re;

    move-result-object v4

    invoke-virtual {v4, v3}, Lnb/re;->J(Lnb/a0;)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v4

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v7, v12, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "name"

    iget-object v9, v3, Lnb/a0;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "timestamp"

    iget-wide v9, v3, Lnb/a0;->d:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v13, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v5, "data"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v4, "realtime"

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :try_start_10
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    move-object/from16 v5, v16

    const/4 v15, 0x0

    invoke-virtual {v4, v5, v15, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_4d

    iget-object v4, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v5, "Failed to insert raw event (got -1). appId"

    invoke-static {v0}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto :goto_27

    :catch_4
    move-exception v0

    goto :goto_25

    :cond_4d
    const-wide/16 v9, 0x0

    :try_start_11
    iput-wide v9, v1, Lnb/me;->o:J

    goto :goto_27

    :goto_25
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v4, "Error storing raw event. appId"

    iget-object v3, v3, Lnb/a0;->a:Ljava/lang/String;

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_27

    :catch_5
    move-exception v0

    goto :goto_26

    :catch_6
    move-exception v0

    :try_start_12
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Error storing raw event metadata. appId"

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_5
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :goto_26
    :try_start_13
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Data loss. Failed to insert raw event metadata. appId"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_27
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    invoke-virtual {v1}, Lnb/me;->R()V

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long v2, v2, v25

    const-wide/32 v4, 0x7a120

    add-long/2addr v2, v4

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Background event processing time, ms"

    invoke-virtual {v0, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :goto_28
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    throw v0
.end method

.method public final m0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 10

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p2}, Lnb/me;->X(Lcom/google/android/gms/measurement/internal/zzr;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    return-void

    :cond_1
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lnb/me;->o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lnb/t;->F0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzah;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v3, "Removing conditional user property"

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iget-object v5, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->D()Lnb/p5;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lnb/t;->G0(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_2
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz p1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzbg;->g:Lcom/google/android/gms/measurement/internal/zzbe;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbe;->y3()Landroid/os/Bundle;

    move-result-object v1

    :goto_1
    move-object v4, v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, Lnb/ve;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/zzbg;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-virtual {p0, p1, p2}, Lnb/me;->m(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->s0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1}, Lnb/t;->t0()V

    return-void

    :goto_4
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2}, Lnb/t;->t0()V

    throw p1
.end method

.method public final n(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V
    .locals 11

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->f0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnb/m;->d(Ljava/lang/String;)Lnb/m;

    move-result-object v0

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0, v1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v1

    sget-object v2, Lnb/n8;->b:Lnb/n8;

    invoke-virtual {v1}, Lnb/q8;->p()Lnb/n8;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_0

    if-eq v2, v3, :cond_0

    sget-object v2, Lnb/p8;->b:Lnb/p8;

    sget-object v6, Lnb/l;->k:Lnb/l;

    invoke-virtual {v0, v2, v6}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v1}, Lnb/q8;->b()I

    move-result v6

    invoke-virtual {v0, v2, v6}, Lnb/m;->b(Lnb/p8;I)V

    goto :goto_0

    :cond_1
    sget-object v2, Lnb/p8;->b:Lnb/p8;

    sget-object v6, Lnb/l;->j:Lnb/l;

    invoke-virtual {v0, v2, v6}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    :goto_0
    invoke-virtual {v1}, Lnb/q8;->q()Lnb/n8;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v3, :cond_2

    sget-object v1, Lnb/p8;->c:Lnb/p8;

    sget-object v2, Lnb/l;->k:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto :goto_1

    :cond_2
    sget-object v2, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1}, Lnb/q8;->b()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lnb/m;->b(Lnb/p8;I)V

    goto :goto_1

    :cond_3
    sget-object v1, Lnb/p8;->c:Lnb/p8;

    sget-object v2, Lnb/l;->j:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    :goto_1
    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0, v1}, Lnb/me;->R0(Ljava/lang/String;)Lnb/x;

    move-result-object v2

    invoke-virtual {p0, v1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3, v0}, Lnb/me;->T0(Ljava/lang/String;Lnb/x;Lnb/q8;Lnb/m;)Lnb/x;

    move-result-object v1

    invoke-virtual {v1}, Lnb/x;->j()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/z6;->i0(Z)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lnb/x;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lnb/x;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/z6;->k0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_4
    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->f1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "_npa"

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/r7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/r7;->H()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_e

    sget-object v1, Lnb/p8;->e:Lnb/p8;

    invoke-virtual {v0, v1}, Lnb/m;->a(Lnb/p8;)Lnb/l;

    move-result-object v4

    sget-object v6, Lnb/l;->b:Lnb/l;

    if-eq v4, v6, :cond_7

    goto/16 :goto_4

    :cond_7
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v3}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v3

    if-eqz v3, :cond_a

    iget-object v2, v3, Lnb/te;->b:Ljava/lang/String;

    const-string v3, "tcf"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v2, Lnb/l;->i:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto/16 :goto_4

    :cond_8
    const-string v3, "app"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lnb/l;->g:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto/16 :goto_4

    :cond_9
    sget-object v2, Lnb/l;->e:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Lnb/c6;->R()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/r7;->N()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    cmp-long v4, v6, v8

    if-nez v4, :cond_d

    :cond_b
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/r7;->N()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v2, v2, v6

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_c
    sget-object v2, Lnb/l;->e:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto :goto_4

    :cond_d
    :goto_3
    sget-object v2, Lnb/l;->g:Lnb/l;

    invoke-virtual {v0, v1, v2}, Lnb/m;->c(Lnb/p8;Lnb/l;)V

    goto :goto_4

    :cond_e
    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lnb/me;->I(Ljava/lang/String;Lnb/m;)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->S()Lcom/google/android/gms/internal/measurement/q7;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/q7;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/q7;->x(J)Lcom/google/android/gms/internal/measurement/q7;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/q7;->D(J)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/r7;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/z6;->j1(Lcom/google/android/gms/internal/measurement/r7;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Setting user property"

    const-string v4, "non_personalized_ads(_npa)"

    invoke-virtual {v2, v3, v4, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    invoke-virtual {v0}, Lnb/m;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/z6;->g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v0, p0, Lnb/me;->a:Lnb/x6;

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnb/x6;->S(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_16

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_tcf"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v3

    move v4, v1

    :goto_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_14

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v6

    const-string v7, "_tcfd"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->J()Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_12

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v6, 0x4

    if-gt p1, v6, :cond_f

    goto :goto_9

    :cond_f
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    move v3, v5

    :goto_7
    const/16 v8, 0x40

    const-string v9, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"

    if-ge v3, v8, :cond_11

    aget-char v8, p1, v6

    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v8, v10, :cond_10

    move v1, v3

    goto :goto_8

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_11
    :goto_8
    or-int/2addr v1, v5

    invoke-virtual {v9, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    aput-char v1, p1, v6

    invoke-static {p1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v3

    :cond_12
    :goto_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/r6;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v0, v4, p1}, Lcom/google/android/gms/internal/measurement/n6;->D(ILcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_a

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_14
    :goto_a
    invoke-virtual {p2, v2, v0}, Lcom/google/android/gms/internal/measurement/z6;->a1(ILcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    return-void

    :cond_15
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_5

    :cond_16
    return-void
.end method

.method public final n0(Lcom/google/android/gms/measurement/internal/zzr;J)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "app_id=?"

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lnb/me;->N0()Lnb/ve;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-virtual {v3}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lnb/ve;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->r()Lnb/u5;

    move-result-object v5

    invoke-virtual {v3}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v5, v7, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v3}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Lnb/xd;->j()V

    invoke-virtual {v5}, Lnb/j8;->h()V

    invoke-static {v3}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    invoke-virtual {v5}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "events"

    invoke-virtual {v6, v8, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    const-string v9, "user_attributes"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "conditional_properties"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "apps"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "raw_events"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "raw_events_metadata"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "event_filters"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "property_filters"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "audience_filter_values"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "consent_settings"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "default_event_params"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    const-string v9, "trigger_uris"

    invoke-virtual {v6, v9, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v9

    add-int/2addr v8, v9

    invoke-static {}, Lcom/google/android/gms/internal/measurement/se;->a()Z

    iget-object v9, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v9}, Lnb/g7;->w()Lnb/k;

    move-result-object v10

    sget-object v11, Lnb/z4;->i1:Lnb/y4;

    invoke-virtual {v10, v4, v11}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v10, "no_data_mode_events"

    invoke-virtual {v6, v10, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    if-lez v8, :cond_1

    invoke-virtual {v9}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v6, "Deleted application data. app, records"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v6, v3, v7}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    move-object v3, v4

    goto :goto_3

    :goto_2
    iget-object v5, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->o()Lnb/u5;

    move-result-object v5

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v6, "Error deleting application data. appId, error"

    invoke-virtual {v5, v6, v3, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lnb/c6;->F0()J

    move-result-wide v5

    const-wide/32 v7, -0x80000000

    cmp-long v0, v5, v7

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lnb/c6;->F0()J

    move-result-wide v9

    iget-wide v11, v2, Lcom/google/android/gms/measurement/internal/zzr;->o:J

    cmp-long v0, v9, v11

    if-eqz v0, :cond_3

    move v0, v5

    goto :goto_4

    :cond_3
    move v0, v6

    :goto_4
    invoke-virtual {v3}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lnb/c6;->F0()J

    move-result-wide v10

    cmp-long v3, v10, v7

    if-nez v3, :cond_4

    if-eqz v9, :cond_4

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzr;->h:Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_5

    :cond_4
    move v5, v6

    :goto_5
    or-int/2addr v0, v5

    if-eqz v0, :cond_6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v3, "_pv"

    invoke-virtual {v0, v3, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/google/android/gms/measurement/internal/zzbg;

    new-instance v12, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v12, v0}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    const-string v13, "auto"

    const-string v11, "_au"

    move-wide/from16 v14, p2

    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v3, Lnb/z4;->d1:Lnb/y4;

    invoke-virtual {v0, v4, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1, v10, v2}, Lnb/me;->j(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    return-void

    :cond_5
    invoke-virtual {v1, v10, v2}, Lnb/me;->k(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    :cond_6
    return-void
.end method

.method public final o(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V
    .locals 11

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w5;->h0()Lcom/google/android/gms/internal/measurement/s5;

    move-result-object v0

    invoke-virtual {p1}, Lnb/c6;->K()[B

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0, v1}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/s5;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/sb; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Failed to parse locally stored ad campaign info. appId"

    invoke-virtual {v1, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v4

    const-string v5, "_cmp"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "gclid"

    const-string v5, ""

    invoke-static {v2, v4, v5}, Lnb/re;->v(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "gbraid"

    invoke-static {v2, v6, v5}, Lnb/re;->v(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "gad_source"

    invoke-static {v2, v7, v5}, Lnb/re;->v(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v7, Lnb/z4;->h1:Lnb/y4;

    invoke-virtual {v7, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    invoke-static {v2, v3}, Lnb/re;->s(Lcom/google/android/gms/internal/measurement/o6;[Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "click_timestamp"

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-static {v2, v3, v9}, Lnb/re;->v(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    cmp-long v3, v9, v7

    if-gtz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v9

    :cond_2
    const-string v3, "_cis"

    invoke-static {v2, v3}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v7, "referrer API v2"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->S()J

    move-result-wide v7

    cmp-long v3, v9, v7

    if-lez v3, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->N()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/s5;->K(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_2
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->P()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/s5;->O(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->R()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/measurement/s5;->Q(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_4
    invoke-virtual {v0, v9, v10}, Lcom/google/android/gms/internal/measurement/s5;->T(J)Lcom/google/android/gms/internal/measurement/s5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->W()Lcom/google/android/gms/internal/measurement/s5;

    invoke-virtual {p0, v2}, Lnb/me;->J(Lcom/google/android/gms/internal/measurement/o6;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/s5;->X(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/s5;

    goto/16 :goto_1

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->G()J

    move-result-wide v7

    cmp-long v3, v9, v7

    if-lez v3, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->z()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_5

    :cond_7
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/s5;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_5
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->C()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_6

    :cond_8
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/s5;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_6
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->E()Lcom/google/android/gms/internal/measurement/s5;

    goto :goto_7

    :cond_9
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/measurement/s5;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s5;

    :goto_7
    invoke-virtual {v0, v9, v10}, Lcom/google/android/gms/internal/measurement/s5;->J(J)Lcom/google/android/gms/internal/measurement/s5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s5;->U()Lcom/google/android/gms/internal/measurement/s5;

    invoke-virtual {p0, v2}, Lnb/me;->J(Lcom/google/android/gms/internal/measurement/o6;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/s5;->V(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/s5;

    goto/16 :goto_1

    :cond_a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/w5;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w5;->i0()Lcom/google/android/gms/internal/measurement/w5;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/gb;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/w5;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/z6;->r0(Lcom/google/android/gms/internal/measurement/w5;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_b
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/w5;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lnb/c6;->J([B)V

    invoke-virtual {p1}, Lnb/c6;->A()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, v0}, Lnb/t;->K0(Lnb/c6;ZZ)V

    :cond_c
    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object p2

    sget-object v0, Lnb/z4;->g1:Lnb/y4;

    invoke-virtual {p2, v3, v0}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p1}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "_lgclid"

    invoke-virtual {p2, p1, v0}, Lnb/t;->z0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method public final o0(Lcom/google/android/gms/measurement/internal/zzr;)Lnb/c6;
    .locals 12

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzr;->y:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v8, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lnb/me;->D:Ljava/util/Map;

    new-instance v3, Lnb/je;

    invoke-direct {v3, p0, v0, v8}, Lnb/je;-><init>(Lnb/me;Ljava/lang/String;[B)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v0

    invoke-virtual {p0, v2}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    const/16 v4, 0x64

    invoke-static {v3, v4}, Lnb/q8;->f(Ljava/lang/String;I)Lnb/q8;

    move-result-object v3

    invoke-virtual {v1, v3}, Lnb/q8;->s(Lnb/q8;)Lnb/q8;

    move-result-object v1

    sget-object v3, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lnb/me;->i:Lnb/vc;

    iget-boolean v5, p1, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    invoke-virtual {v4, v2, v5}, Lnb/vc;->o(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    const-string v4, ""

    :goto_0
    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    new-instance v5, Lnb/c6;

    invoke-direct {v5, v0, v2}, Lnb/c6;-><init>(Lnb/g7;Ljava/lang/String;)V

    sget-object v0, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v0}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v1}, Lnb/me;->p(Lnb/q8;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lnb/c6;->q0(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5, v4}, Lnb/c6;->w0(Ljava/lang/String;)V

    :cond_3
    move-object v0, v5

    :cond_4
    :goto_1
    move v11, v10

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v4, :cond_8

    invoke-virtual {v0}, Lnb/c6;->v0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v0}, Lnb/c6;->v0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    invoke-virtual {v0, v4}, Lnb/c6;->w0(Ljava/lang/String;)V

    iget-boolean v4, p1, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    if-eqz v4, :cond_7

    iget-object v4, p0, Lnb/me;->i:Lnb/vc;

    invoke-virtual {v4, v2, v1}, Lnb/vc;->m(Ljava/lang/String;Lnb/q8;)Landroid/util/Pair;

    move-result-object v4

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v5, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    if-nez v3, :cond_7

    sget-object v3, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0, v1}, Lnb/me;->p(Lnb/q8;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/c6;->q0(Ljava/lang/String;)V

    move v11, v10

    goto :goto_2

    :cond_6
    move v11, v9

    :goto_2
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    const-string v3, "_id"

    invoke-virtual {v1, v2, v3}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    const-string v3, "_lair"

    invoke-virtual {v1, v2, v3}, Lnb/t;->B0(Ljava/lang/String;Ljava/lang/String;)Lnb/te;

    move-result-object v1

    if-nez v1, :cond_9

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v5

    new-instance v1, Lnb/te;

    const-wide/16 v3, 0x1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v3, "auto"

    const-string v4, "_lair"

    invoke-direct/range {v1 .. v7}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnb/t;->A0(Lnb/te;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v2}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lnb/me;->p(Lnb/q8;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/c6;->q0(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v0}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v2}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lnb/me;->p(Lnb/q8;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/c6;->q0(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_9
    :goto_3
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/c6;->s0(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->p:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {v0, v1}, Lnb/c6;->y0(Ljava/lang/String;)V

    :cond_a
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->j:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_b

    invoke-virtual {v0, v1, v2}, Lnb/c6;->K0(J)V

    :cond_b
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v0, v1}, Lnb/c6;->E0(Ljava/lang/String;)V

    :cond_c
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->o:J

    invoke-virtual {v0, v1, v2}, Lnb/c6;->G0(J)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->i:Ljava/lang/String;

    if-eqz v1, :cond_d

    invoke-virtual {v0, v1}, Lnb/c6;->I0(Ljava/lang/String;)V

    :cond_d
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->k:J

    invoke-virtual {v0, v1, v2}, Lnb/c6;->a(J)V

    iget-boolean v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    invoke-virtual {v0, v1}, Lnb/c6;->e(Z)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->l:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    invoke-virtual {v0, v1}, Lnb/c6;->O(Ljava/lang/String;)V

    :cond_e
    iget-boolean v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    invoke-virtual {v0, v1}, Lnb/c6;->Q(Z)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->u:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lnb/c6;->S(Ljava/lang/Boolean;)V

    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->v:J

    invoke-virtual {v0, v1, v2}, Lnb/c6;->c(J)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/c6;->u0(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ve;->a()Z

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->M0:Lnb/y4;

    invoke-virtual {v1, v8, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->w:Ljava/util/List;

    invoke-virtual {v0, v1}, Lnb/c6;->U(Ljava/util/List;)V

    goto :goto_4

    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ve;->a()Z

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->L0:Lnb/y4;

    invoke-virtual {v1, v8, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0, v8}, Lnb/c6;->U(Ljava/util/List;)V

    :cond_10
    :goto_4
    iget-boolean v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->A:Z

    invoke-virtual {v0, v1}, Lnb/c6;->W(Z)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/c6;->m0(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v1

    sget-object v2, Lnb/z4;->Q0:Lnb/y4;

    invoke-virtual {v1, v8, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->E:I

    invoke-virtual {v0, v1}, Lnb/c6;->c0(I)V

    :cond_11
    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->B:J

    invoke-virtual {v0, v1, v2}, Lnb/c6;->Y(J)V

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzr;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnb/c6;->H(Ljava/lang/String;)V

    iget p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->J:I

    invoke-virtual {v0, p1}, Lnb/c6;->L(I)V

    invoke-virtual {v0}, Lnb/c6;->A()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz v11, :cond_12

    goto :goto_5

    :cond_12
    return-object v0

    :cond_13
    move v9, v11

    :goto_5
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p1, v0, v9, v10}, Lnb/t;->K0(Lnb/c6;ZZ)V

    return-object v0
.end method

.method public final p(Lnb/q8;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {p1, v0}, Lnb/q8;->o(Lnb/p8;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->q0()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "%032x"

    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final p0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/ee;

    invoke-direct {v1, p0, p1}, Lnb/ee;-><init>(Lnb/me;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {v0, v1}, Lnb/c7;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7530

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get app instance id. appId"

    invoke-virtual {v1, v2, p1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ln9/m;->a(Z)V

    iget-object v0, p0, Lnb/me;->y:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Set uploading progress before finishing the previous upload"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lnb/me;->y:Ljava/util/List;

    return-void
.end method

.method public final q0(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)Ljava/util/List;
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual/range {p0 .. p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    sget-object v4, Lnb/z4;->Q0:Lnb/y4;

    invoke-virtual {v2, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_9

    if-nez v3, :cond_0

    goto/16 :goto_7

    :cond_0
    if-eqz v0, :cond_3

    const-string v4, "uriSources"

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v4

    const-string v5, "uriTimestamps"

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v5

    if-eqz v4, :cond_3

    if-eqz v5, :cond_2

    array-length v0, v5

    array-length v6, v4

    if-eq v0, v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v7

    aget v0, v4, v6

    aget-wide v8, v5, v6

    invoke-static {v3}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v7}, Lnb/j8;->h()V

    invoke-virtual {v7}, Lnb/xd;->j()V

    const-string v10, " trigger URIs. appId, source, timestamp"

    const-string v11, "Pruned "

    :try_start_0
    invoke-virtual {v7}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12

    const-string v13, "trigger_uris"

    const-string v14, "app_id=? and source=? and timestamp_millis<=?"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v3, v15, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v13, v14, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    iget-object v12, v7, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v12

    invoke-virtual {v12}, Lnb/w5;->w()Lnb/u5;

    move-result-object v12

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    add-int/lit8 v13, v13, 0x2e

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v12, v2, v3, v0, v8}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v2, v7, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Error pruning trigger URIs. appId"

    invoke-virtual {v2, v8, v7, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v2, "Uri sources and timestamps do not match"

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    invoke-static {v1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "trigger_uris"

    const-string v6, "trigger_uri"

    const-string v7, "timestamp_millis"

    const-string v8, "source"

    filled-new-array {v6, v7, v8}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "app_id=?"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v8

    const-string v11, "rowid"

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v4 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, 0x0

    :cond_4
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    const-string v5, ""

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v6, 0x1

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const/4 v8, 0x2

    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    new-instance v9, Lcom/google/android/gms/measurement/internal/zzoh;

    invoke-direct {v9, v5, v6, v7, v8}, Lcom/google/android/gms/measurement/internal/zzoh;-><init>(Ljava/lang/String;JI)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_4

    goto :goto_5

    :goto_4
    :try_start_2
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v4, "Error querying trigger uris. appId"

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v4, v1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_6
    :goto_5
    if-eqz v3, :cond_7

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_7
    return-object v0

    :goto_6
    if-eqz v3, :cond_8

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v0

    :cond_9
    :goto_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final r()V
    .locals 11

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/me;->v:Z

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v1}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/tc;->x()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Upload data called on the client side before use of service was decided"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_9

    :catchall_0
    move-exception v1

    goto/16 :goto_b

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Upload called in the client side when service should be used"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_1
    iget-wide v1, p0, Lnb/me;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    invoke-virtual {p0}, Lnb/me;->R()V

    goto/16 :goto_9

    :cond_2
    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    iget-object v1, p0, Lnb/me;->y:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Uploading requested multiple times"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_3
    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/b6;->m()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Network not connected, ignoring upload request"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lnb/me;->R()V

    goto/16 :goto_9

    :cond_4
    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    sget-object v6, Lnb/z4;->j0:Lnb/y4;

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v5

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    invoke-static {}, Lnb/k;->n()J

    move-result-wide v8

    sub-long v8, v1, v8

    move v6, v0

    :goto_0
    if-ge v6, v5, :cond_5

    invoke-virtual {p0, v7, v8, v9}, Lnb/me;->M(Ljava/lang/String;J)Z

    move-result v10

    if-eqz v10, :cond_5

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v5

    invoke-virtual {v5}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->L()V

    iget-object v5, p0, Lnb/me;->i:Lnb/vc;

    iget-object v5, v5, Lnb/vc;->h:Lnb/h6;

    invoke-virtual {v5}, Lnb/h6;->a()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->v()Lnb/u5;

    move-result-object v3

    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v5, v1, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-virtual {v3}, Lnb/t;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-wide/16 v5, -0x1

    if-nez v4, :cond_b

    iget-wide v8, p0, Lnb/me;->A:J

    cmp-long v4, v8, v5

    if-nez v4, :cond_a

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v4}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v9, "select rowid from raw_events order by rowid desc limit 1;"

    invoke-virtual {v8, v9, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v8, :cond_7

    :goto_1
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :cond_7
    :try_start_3
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v8

    :try_start_4
    iget-object v4, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v9, "Error querying raw events"

    invoke-virtual {v4, v9, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_2
    :try_start_5
    iput-wide v5, p0, Lnb/me;->A:J

    goto :goto_4

    :goto_3
    if-eqz v7, :cond_9

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_9
    throw v1

    :cond_a
    :goto_4
    invoke-virtual {p0, v3, v1, v2}, Lnb/me;->s(Ljava/lang/String;J)V

    goto/16 :goto_9

    :cond_b
    iput-wide v5, p0, Lnb/me;->A:J

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    invoke-static {}, Lnb/k;->n()J

    move-result-wide v4

    sub-long/2addr v1, v4

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-virtual {v3}, Lnb/xd;->j()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v3}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_c

    iget-object v2, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    const-string v4, "No expired configs for apps with pending events"

    invoke-virtual {v2, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :catchall_2
    move-exception v2

    goto :goto_6

    :catch_1
    move-exception v2

    goto :goto_7

    :cond_c
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_5
    :try_start_8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_8

    :goto_6
    move-object v7, v1

    goto :goto_a

    :catchall_3
    move-exception v1

    move-object v2, v1

    goto :goto_a

    :catch_2
    move-exception v1

    move-object v2, v1

    move-object v1, v7

    :goto_7
    :try_start_9
    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    const-string v4, "Error selecting expired configs"

    invoke-virtual {v3, v4, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-eqz v1, :cond_d

    goto :goto_5

    :cond_d
    :goto_8
    :try_start_a
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1, v7}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {p0, v1}, Lnb/me;->B(Lnb/c6;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_e
    :goto_9
    iput-boolean v0, p0, Lnb/me;->v:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    return-void

    :goto_a
    if-eqz v7, :cond_f

    :try_start_b
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_f
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :goto_b
    iput-boolean v0, p0, Lnb/me;->v:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    throw v1
.end method

.method public final r0(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 11

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-wide v1, p2, Lcom/google/android/gms/measurement/internal/zzaf;->f:J

    invoke-virtual {v0, v1, v2}, Lnb/t;->n(J)Lnb/pe;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    invoke-virtual {p2, v1, p1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/pe;->e()Ljava/lang/String;

    move-result-object v0

    iget v3, p2, Lcom/google/android/gms/measurement/internal/zzaf;->g:I

    sget-object v4, Lnb/ya;->c:Lnb/ya;

    invoke-virtual {v4}, Lnb/ya;->zza()I

    move-result v4

    if-ne v3, v4, :cond_4

    iget-object v3, p0, Lnb/me;->E:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/t;->q(Ljava/lang/Long;)V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v2, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    invoke-virtual {v0, v2, p1, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-wide v0, p2, Lcom/google/android/gms/measurement/internal/zzaf;->h:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_3

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    sget-object v5, Lnb/za;->c:Lnb/za;

    invoke-virtual {v5}, Lnb/za;->zza()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "upload_type"

    invoke-virtual {v4, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v5, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "creation_timestamp"

    invoke-virtual {v4, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :try_start_0
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "upload_queue"

    const-string v8, "rowid=? AND app_id=? AND upload_type=?"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lnb/za;->f:Lnb/za;

    invoke-virtual {v10}, Lnb/za;->zza()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v9, p1, v10}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v7, v4, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    int-to-long v6, v4

    const-wide/16 v8, 0x1

    cmp-long v4, v6, v8

    if-eqz v4, :cond_2

    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->r()Lnb/u5;

    move-result-object v4

    const-string v5, "Google Signal pending batch not updated. appId, rowId"

    invoke-virtual {v4, v5, p1, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-wide v1, p2, Lcom/google/android/gms/measurement/internal/zzaf;->h:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v1, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    invoke-virtual {v0, v1, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lnb/me;->u(Ljava/lang/String;)V

    return-void

    :goto_1
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Failed to update google Signal pending batch. appid, rowId"

    invoke-virtual {v2, v1, p1, v0, p2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2

    :cond_3
    return-void

    :cond_4
    iget v1, p2, Lcom/google/android/gms/measurement/internal/zzaf;->g:I

    sget-object v2, Lnb/ya;->e:Lnb/ya;

    invoke-virtual {v2}, Lnb/ya;->zza()I

    move-result v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lnb/me;->E:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnb/ke;

    if-nez v2, :cond_5

    new-instance v2, Lnb/ke;

    invoke-direct {v2, p0}, Lnb/ke;-><init>(Lnb/me;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Lnb/ke;->a()V

    :goto_2
    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v3

    invoke-virtual {v2}, Lnb/ke;->c()J

    move-result-wide v1

    sub-long/2addr v1, v3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v3

    const-wide/16 v4, 0x3e8

    div-long/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    invoke-virtual {v3, v2, p1, v0, v1}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    iget-wide v1, p2, Lcom/google/android/gms/measurement/internal/zzaf;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Lnb/t;->w(Ljava/lang/Long;)V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    invoke-virtual {v0, v1, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/String;J)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-wide/from16 v2, p2

    const-string v4, "data"

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v5, Lnb/z4;->h:Lnb/y4;

    invoke-virtual {v0, v6, v5}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v0

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    sget-object v7, Lnb/z4;->i:Lnb/y4;

    invoke-virtual {v5, v6, v7}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v5

    const/4 v7, 0x0

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    invoke-virtual {v8}, Lnb/j8;->h()V

    invoke-virtual {v8}, Lnb/xd;->j()V

    const/4 v9, 0x1

    if-lez v0, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    move v10, v7

    :goto_0
    invoke-static {v10}, Ln9/m;->a(Z)V

    if-lez v5, :cond_1

    move v10, v9

    goto :goto_1

    :cond_1
    move v10, v7

    :goto_1
    invoke-static {v10}, Ln9/m;->a(Z)V

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    invoke-virtual {v8}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v14

    const-string v15, "queue"
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-wide/16 v23, -0x1

    :try_start_1
    const-string v10, "rowid"

    const-string v11, "retry_count"

    filled-new-array {v10, v4, v11}, [Ljava/lang/String;

    move-result-object v16

    const-string v17, "app_id=?"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v18

    const-string v21, "rowid"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v22

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {v14 .. v22}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    :cond_2
    move-object v11, v0

    goto/16 :goto_13

    :catchall_0
    move-exception v0

    move-object/from16 v22, v10

    goto/16 :goto_e

    :catch_0
    move-exception v0

    move-object/from16 v22, v10

    goto/16 :goto_f

    :cond_3
    :try_start_3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move v14, v7

    :goto_3
    invoke-interface {v10, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v10, v9}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    iget-object v9, v8, Lnb/td;->b:Lnb/me;

    invoke-virtual {v9}, Lnb/me;->K0()Lnb/re;

    move-result-object v9
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    new-instance v13, Ljava/io/ByteArrayInputStream;

    invoke-direct {v13, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v13}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v12, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v12}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v7, 0x400

    new-array v7, v7, [B

    move-object/from16 v21, v13

    :goto_4
    invoke-virtual {v0, v7}, Ljava/io/InputStream;->read([B)I

    move-result v13

    if-gtz v13, :cond_c

    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    invoke-virtual/range {v21 .. v21}, Ljava/io/ByteArrayInputStream;->close()V

    invoke-virtual {v12}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    array-length v7, v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    add-int/2addr v7, v14

    if-le v7, v5, :cond_5

    :cond_4
    move-object/from16 v22, v10

    goto/16 :goto_d

    :cond_5
    :try_start_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a7;->m0()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v7

    invoke-static {v7, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/z6;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_a

    const/4 v9, 0x0

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/util/Pair;

    iget-object v9, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a7;->N0()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v21, v9

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->N0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/a7;->U0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->U0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/a7;->W0()Z

    move-result v9

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->W0()Z

    move-result v13

    if-ne v9, v13, :cond_4

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/a7;->Y0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->Y0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/a7;->p2()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object/from16 v21, v9

    const-string v9, "_npa"

    if-eqz v13, :cond_7

    :try_start_9
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/r7;

    move-object/from16 v22, v12

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/r7;->H()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/r7;->N()J

    move-result-wide v12

    goto :goto_6

    :cond_6
    move-object/from16 v9, v21

    move-object/from16 v12, v22

    goto :goto_5

    :cond_7
    move-object/from16 v22, v12

    move-wide/from16 v12, v23

    :goto_6
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/a7;->p2()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_7
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_9

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/google/android/gms/internal/measurement/r7;

    move-wide/from16 v25, v12

    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/r7;->H()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/r7;->N()J

    move-result-wide v12

    goto :goto_8

    :cond_8
    move-wide/from16 v12, v25

    goto :goto_7

    :cond_9
    move-wide/from16 v25, v12

    move-wide/from16 v12, v23

    :goto_8
    cmp-long v9, v25, v12

    if-nez v9, :cond_4

    :cond_a
    const/4 v9, 0x2

    invoke-interface {v10, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-interface {v10, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/measurement/z6;->K0(I)Lcom/google/android/gms/internal/measurement/z6;

    :cond_b
    array-length v0, v0

    add-int/2addr v14, v0

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a7;

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_9
    move-object/from16 v22, v10

    goto :goto_c

    :catch_1
    move-exception v0

    iget-object v7, v8, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->o()Lnb/u5;

    move-result-object v7

    const-string v9, "Failed to merge queued bundle. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v9, v12, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_9

    :catch_2
    move-exception v0

    move-object/from16 v22, v10

    goto :goto_a

    :cond_c
    move-object/from16 v22, v10

    const/4 v10, 0x0

    :try_start_a
    invoke-virtual {v12, v7, v10, v13}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-object/from16 v10, v22

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    goto :goto_e

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    :goto_a
    :try_start_b
    iget-object v7, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->o()Lnb/u5;

    move-result-object v7

    const-string v9, "Failed to ungzip content"

    invoke-virtual {v7, v9, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catch_5
    move-exception v0

    goto :goto_b

    :catch_6
    move-exception v0

    move-object/from16 v22, v10

    :goto_b
    :try_start_c
    iget-object v7, v8, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v7}, Lnb/g7;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->o()Lnb/u5;

    move-result-object v7

    const-string v9, "Failed to unzip queued bundle. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7, v9, v10, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_c
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    if-eqz v0, :cond_e

    if-le v14, v5, :cond_d

    goto :goto_d

    :cond_d
    move-object/from16 v10, v22

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto/16 :goto_3

    :cond_e
    :goto_d
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->close()V

    goto :goto_13

    :goto_e
    move-object/from16 v13, v22

    goto/16 :goto_3f

    :goto_f
    move-object/from16 v10, v22

    goto :goto_12

    :catchall_2
    move-exception v0

    goto :goto_10

    :catch_7
    move-exception v0

    goto :goto_11

    :catch_8
    move-exception v0

    const-wide/16 v23, -0x1

    goto :goto_11

    :goto_10
    const/4 v13, 0x0

    goto/16 :goto_3f

    :goto_11
    const/4 v10, 0x0

    :goto_12
    :try_start_d
    iget-object v5, v8, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->o()Lnb/u5;

    move-result-object v5

    const-string v7, "Error querying bundles. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v7, v8, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    if-eqz v10, :cond_2

    goto/16 :goto_2

    :goto_13
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    goto/16 :goto_3e

    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/se;->a()Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    sget-object v5, Lnb/z4;->i1:Lnb/y4;

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v5}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    const-string v8, "_f"

    if-eqz v0, :cond_25

    invoke-static {}, Lcom/google/android/gms/internal/measurement/se;->a()Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    invoke-virtual {v0, v7, v5}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    sget-object v5, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v0, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    const-string v5, "no_data_mode_events"

    if-nez v0, :cond_15

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, v6}, Lnb/x6;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object v0, Lnb/z4;->j1:Lnb/y4;

    invoke-virtual {v0, v7}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_10
    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    :try_start_e
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v10

    iget-object v11, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Lnb/t;->t(J)V

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a7;->j2()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_11
    :goto_15
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v11

    const-string v12, "_v"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    :cond_12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    const-string v11, "_dac"

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v0, v11, v12}, Lnb/re;->o(Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    :cond_13
    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v11

    invoke-virtual {v11}, Lnb/j8;->h()V

    invoke-virtual {v11}, Lnb/xd;->j()V

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v12, v11, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v13

    invoke-virtual {v13}, Lnb/w5;->w()Lnb/u5;

    move-result-object v13

    const-string v14, "Caching events in NO_DATA mode"

    invoke-virtual {v13, v14, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v13, Landroid/content/ContentValues;

    invoke-direct {v13}, Landroid/content/ContentValues;-><init>()V

    const-string v14, "app_id"

    invoke-virtual {v13, v14, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v14, "name"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v14, v15}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v14

    invoke-virtual {v13, v4, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v14, "timestamp_millis"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v14, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_a

    :try_start_f
    invoke-virtual {v11}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v14, 0x0

    invoke-virtual {v0, v5, v14, v13}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v15

    cmp-long v0, v15, v23

    if-nez v0, :cond_11

    invoke-virtual {v12}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v12, "Failed to insert NO_DATA mode event (got -1). appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_9

    goto/16 :goto_15

    :catch_9
    move-exception v0

    :try_start_10
    iget-object v11, v11, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v11}, Lnb/g7;->a()Lnb/w5;

    move-result-object v11

    invoke-virtual {v11}, Lnb/w5;->o()Lnb/u5;

    move-result-object v11

    const-string v12, "Error storing NO_DATA mode event. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v11, v12, v13, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_a

    goto/16 :goto_15

    :catch_a
    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->t()Lnb/u5;

    move-result-object v0

    const-string v10, "Failed handling NO_DATA mode bundles. appId"

    invoke-virtual {v0, v10, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_14
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_24

    :cond_15
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9}, Lnb/j8;->h()V

    invoke-virtual {v9}, Lnb/xd;->j()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const-string v12, " NO_DATA mode events. appId"

    const-string v13, "Pruned "

    :try_start_11
    invoke-virtual {v9}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v21

    iget-object v0, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v14

    const-string v22, "no_data_mode_events"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v23

    const-string v24, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"

    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v6, v0}, [Ljava/lang/String;

    move-result-object v25

    const-string v28, "rowid"

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-virtual/range {v21 .. v29}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_f
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    move-object/from16 v16, v11

    move-object/from16 v11, v21

    :try_start_12
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    if-eqz v0, :cond_17

    move-wide/from16 v21, v14

    :goto_16
    const/4 v14, 0x0

    :try_start_13
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->R()Lcom/google/android/gms/internal/measurement/n6;

    move-result-object v14

    invoke-static {v14, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catch Lcom/google/android/gms/internal/measurement/sb; {:try_start_13 .. :try_end_13} :catch_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_b
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    move-object/from16 v23, v4

    goto :goto_17

    :catchall_3
    move-exception v0

    move-object/from16 v23, v4

    goto/16 :goto_19

    :catch_b
    move-exception v0

    move-object/from16 v23, v4

    goto/16 :goto_1c

    :catch_c
    move-exception v0

    :try_start_14
    iget-object v14, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v14}, Lnb/g7;->a()Lnb/w5;

    move-result-object v14

    invoke-virtual {v14}, Lnb/w5;->t()Lnb/u5;

    move-result-object v14

    const-string v15, "Failed to parse stored NO_DATA mode event, appId"
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_b
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    move-object/from16 v23, v4

    :try_start_15
    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v14, v15, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_17
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_e
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :try_start_16
    const-string v0, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"

    invoke-static/range {v21 .. v22}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v6, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    iget-object v4, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x22

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_d
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    goto :goto_1d

    :catchall_4
    move-exception v0

    goto :goto_1a

    :catch_d
    move-exception v0

    goto :goto_1b

    :catchall_5
    move-exception v0

    goto :goto_19

    :catch_e
    move-exception v0

    goto :goto_1c

    :cond_16
    move-object/from16 v4, v23

    goto/16 :goto_16

    :cond_17
    move-object/from16 v23, v4

    :goto_18
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V

    goto :goto_1d

    :goto_19
    move-object/from16 v13, v23

    goto/16 :goto_23

    :catch_f
    move-exception v0

    move-object/from16 v16, v11

    goto :goto_1b

    :goto_1a
    const/4 v13, 0x0

    goto/16 :goto_23

    :goto_1b
    const/16 v23, 0x0

    :goto_1c
    :try_start_17
    iget-object v4, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v5, "Error flushing NO_DATA mode events. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, v5, v9, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    if-eqz v23, :cond_18

    goto :goto_18

    :cond_18
    :goto_1d
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x1

    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    iget-object v9, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/z6;

    if-eqz v4, :cond_19

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_19

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/z6;->d1()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->c1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/z6;->c1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    const/4 v4, 0x0

    :cond_19
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k6;->G()Lcom/google/android/gms/internal/measurement/d6;

    move-result-object v11

    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v12

    invoke-virtual {v12, v6}, Lnb/x6;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v12

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-nez v12, :cond_1b

    :cond_1a
    move-object/from16 v21, v0

    move/from16 v16, v4

    move-object/from16 v23, v10

    goto/16 :goto_22

    :cond_1b
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a5;->F()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/o4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/h6;->F()Lcom/google/android/gms/internal/measurement/g6;

    move-result-object v15

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/o4;->G()I

    move-result v16

    sget-object v21, Lnb/n8;->b:Lnb/n8;

    move-object/from16 v21, v0

    add-int/lit8 v0, v16, -0x1

    move/from16 v16, v4

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1f

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1e

    const/4 v4, 0x4

    move-object/from16 v23, v10

    const/4 v10, 0x3

    if-eq v0, v10, :cond_1d

    if-eq v0, v4, :cond_1c

    const/4 v0, 0x1

    goto :goto_20

    :cond_1c
    const/4 v0, 0x5

    goto :goto_20

    :cond_1d
    move v0, v4

    goto :goto_20

    :cond_1e
    move-object/from16 v23, v10

    const/4 v10, 0x3

    move v0, v10

    goto :goto_20

    :cond_1f
    move-object/from16 v23, v10

    const/4 v10, 0x3

    const/4 v0, 0x2

    :goto_20
    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/measurement/g6;->x(I)Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/o4;->J()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v4, 0x1

    if-eq v0, v4, :cond_20

    const/4 v4, 0x2

    if-eq v0, v4, :cond_21

    const/4 v10, 0x1

    goto :goto_21

    :cond_20
    const/4 v10, 0x2

    :cond_21
    :goto_21
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/measurement/g6;->z(I)Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/h6;

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v4, v16

    move-object/from16 v0, v21

    move-object/from16 v10, v23

    goto :goto_1f

    :goto_22
    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d6;->x(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d6;

    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/measurement/z6;->v0(Lcom/google/android/gms/internal/measurement/d6;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a7;

    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v4, v16

    move-object/from16 v0, v21

    move-object/from16 v10, v23

    goto/16 :goto_1e

    :cond_22
    move-object v11, v7

    goto :goto_24

    :goto_23
    if-eqz v13, :cond_23

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    :cond_23
    throw v0

    :cond_24
    move-object/from16 v16, v11

    :goto_24
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_50

    goto :goto_25

    :cond_25
    move-object/from16 v16, v11

    :goto_25
    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    sget-object v4, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v0, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->N()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_26

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->N()Ljava/lang/String;

    move-result-object v0

    goto :goto_26

    :cond_27
    const/4 v0, 0x0

    :goto_26
    if-eqz v0, :cond_2a

    const/4 v9, 0x0

    :goto_27
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v5

    if-ge v9, v5, :cond_2a

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->N()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_28

    goto :goto_28

    :cond_28
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->N()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_29

    const/4 v14, 0x0

    invoke-interface {v11, v14, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v11

    goto :goto_29

    :cond_29
    :goto_28
    add-int/lit8 v9, v9, 0x1

    goto :goto_27

    :cond_2a
    :goto_29
    invoke-static {}, Lcom/google/android/gms/internal/measurement/y6;->O()Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v5

    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v9

    invoke-virtual {v9, v6}, Lnb/k;->k(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2b

    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v9

    invoke-virtual {v9, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v9

    if-eqz v9, :cond_2b

    const/4 v9, 0x1

    goto :goto_2a

    :cond_2b
    const/4 v9, 0x0

    :goto_2a
    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v10

    invoke-virtual {v10, v4}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    invoke-virtual/range {p0 .. p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v10

    sget-object v12, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v10, v12}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ig;->a()Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v12

    sget-object v13, Lnb/z4;->N0:Lnb/y4;

    invoke-virtual {v12, v6, v13}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v12

    iget-object v13, v1, Lnb/me;->j:Lnb/zd;

    invoke-virtual {v13, v6}, Lnb/zd;->i(Ljava/lang/String;)Lnb/yd;

    move-result-object v14

    const/4 v15, 0x0

    :goto_2b
    if-ge v15, v5, :cond_3d

    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v21, v4

    move-object/from16 v4, v16

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/z6;

    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v22, v5

    move-object/from16 v5, v16

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    invoke-virtual {v5}, Lnb/k;->A()J

    move v5, v9

    move/from16 v16, v10

    const-wide/32 v9, 0x2078d

    invoke-virtual {v4, v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->S(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/z6;->n1(J)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v9, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v9}, Lnb/g7;->c()Lnb/f;

    const/4 v9, 0x0

    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/z6;->A0(Z)Lcom/google/android/gms/internal/measurement/z6;

    if-nez v5, :cond_2c

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->J0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_2c
    if-nez v21, :cond_2d

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->V()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->Y()Lcom/google/android/gms/internal/measurement/z6;

    :cond_2d
    if-nez v16, :cond_2e

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->b0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_2e
    invoke-virtual {v1, v6, v4}, Lnb/me;->x(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z6;)V

    if-nez v12, :cond_2f

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->R0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_2f
    if-nez v16, :cond_30

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->C0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_30
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->T()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v20

    if-nez v20, :cond_32

    const-string v9, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_31

    goto :goto_2c

    :cond_31
    move/from16 v25, v5

    move-object/from16 v28, v11

    move/from16 v27, v12

    move/from16 v29, v15

    goto/16 :goto_2f

    :cond_32
    :goto_2c
    new-instance v9, Ljava/util/ArrayList;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->W0()Ljava/util/List;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move/from16 v25, v5

    move-object/from16 v26, v10

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    :goto_2d
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_37

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v28, v11

    move-object/from16 v11, v27

    check-cast v11, Lcom/google/android/gms/internal/measurement/o6;

    move/from16 v27, v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v12

    move/from16 v29, v15

    const-string v15, "_fx"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_33

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->remove()V

    move/from16 v12, v27

    move-object/from16 v11, v28

    move/from16 v15, v29

    const/16 v23, 0x1

    :goto_2e
    const/16 v24, 0x1

    goto :goto_2d

    :cond_33
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_36

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    const-string v12, "_pfo"

    invoke-static {v11, v12}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v12

    if-eqz v12, :cond_34

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :cond_34
    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    const-string v12, "_uwa"

    invoke-static {v11, v12}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v11

    if-eqz v11, :cond_35

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/s6;->M()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    :cond_35
    move/from16 v12, v27

    move-object/from16 v11, v28

    move/from16 v15, v29

    goto :goto_2e

    :cond_36
    move/from16 v12, v27

    move-object/from16 v11, v28

    move/from16 v15, v29

    goto :goto_2d

    :cond_37
    move-object/from16 v28, v11

    move/from16 v27, v12

    move/from16 v29, v15

    if-eqz v23, :cond_38

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->d1()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/z6;->c1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_38
    if-eqz v24, :cond_39

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x1

    invoke-virtual {v1, v9, v11, v5, v10}, Lnb/me;->w(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V

    :cond_39
    :goto_2f
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v5

    if-nez v5, :cond_3a

    goto :goto_30

    :cond_3a
    invoke-virtual {v1}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    sget-object v9, Lnb/z4;->D0:Lnb/y4;

    invoke-virtual {v5, v6, v9}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v5

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v9

    invoke-virtual {v9, v5}, Lnb/re;->T([B)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->O0(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3b
    invoke-virtual {v14}, Lnb/yd;->d()Lcom/google/android/gms/internal/measurement/p7;

    move-result-object v5

    if-eqz v5, :cond_3c

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/z6;->s0(Lcom/google/android/gms/internal/measurement/p7;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3c
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/v6;->D(Lcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;

    :goto_30
    add-int/lit8 v15, v29, 0x1

    move/from16 v10, v16

    move/from16 v4, v21

    move/from16 v5, v22

    move/from16 v9, v25

    move/from16 v12, v27

    move-object/from16 v11, v28

    goto/16 :goto_2b

    :cond_3d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v6;->z()I

    move-result v4

    if-nez v4, :cond_3e

    invoke-virtual {v1, v7}, Lnb/me;->q(Ljava/util/List;)V

    const/4 v5, 0x0

    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, 0x0

    const/16 v3, 0xcc

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v7}, Lnb/me;->A(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    return-void

    :cond_3e
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/y6;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14}, Lnb/yd;->c()Lnb/za;

    move-result-object v8

    sget-object v9, Lnb/za;->e:Lnb/za;

    if-ne v8, v9, :cond_3f

    const/4 v8, 0x1

    goto :goto_31

    :cond_3f
    const/4 v8, 0x0

    :goto_31
    invoke-virtual {v14}, Lnb/yd;->c()Lnb/za;

    move-result-object v9

    sget-object v10, Lnb/za;->d:Lnb/za;

    if-eq v9, v10, :cond_41

    if-eqz v8, :cond_40

    const/4 v4, 0x1

    goto :goto_33

    :cond_40
    const/4 v13, 0x0

    :goto_32
    move-object v0, v5

    goto/16 :goto_3d

    :cond_41
    move v4, v8

    :goto_33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/y6;->F()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_42
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_43

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/a7;->f0()Z

    move-result v9

    if-eqz v9, :cond_42

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_34

    :cond_43
    const/4 v8, 0x0

    :goto_34
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v10

    invoke-virtual {v10}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/y6;->P(Lcom/google/android/gms/internal/measurement/y6;)Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v10

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_44

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/measurement/v6;->K(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;

    :cond_44
    invoke-virtual {v1}, Lnb/me;->D0()Lnb/x6;

    move-result-object v11

    invoke-virtual {v11, v6}, Lnb/x6;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_45

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/v6;->N(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;

    :cond_45
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/y6;->F()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_35
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_46

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/a7;

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/a7;->n0(Lcom/google/android/gms/internal/measurement/a7;)Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/z6;->J0()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/a7;

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_35

    :cond_46
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/v6;->G()Lcom/google/android/gms/internal/measurement/v6;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/v6;->E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/v6;

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v9

    invoke-virtual {v9}, Lnb/w5;->w()Lnb/u5;

    move-result-object v9

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_47

    const-string v11, "null"

    goto :goto_36

    :cond_47
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/v6;->J()Ljava/lang/String;

    move-result-object v11

    :goto_36
    const-string v12, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "

    invoke-virtual {v9, v12, v11}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/y6;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_4c

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v1}, Lnb/me;->b()Lnb/c7;

    move-result-object v10

    invoke-virtual {v10}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/me;->O0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y6;->O()Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v10

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v11

    invoke-virtual {v11}, Lnb/w5;->w()Lnb/u5;

    move-result-object v11

    const-string v12, "[sgtm] Processing Google Signal, sgtmJoinId:"

    invoke-virtual {v11, v12, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/measurement/v6;->K(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/y6;->F()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_37
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_48

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/a7;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a7;->m0()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v11

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/a7;->g0()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/measurement/z6;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/a7;->d1()I

    move-result v8

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/measurement/z6;->o0(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/v6;->D(Lcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;

    goto :goto_37

    :cond_48
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    iget-object v8, v13, Lnb/td;->b:Lnb/me;

    invoke-virtual {v8}, Lnb/me;->D0()Lnb/x6;

    move-result-object v8

    invoke-virtual {v8, v6}, Lnb/x6;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_4a

    sget-object v10, Lnb/z4;->s:Lnb/y4;

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    invoke-virtual {v10}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v11

    invoke-virtual {v10}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0x1

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    new-instance v15, Ljava/lang/StringBuilder;

    add-int/2addr v12, v13

    invoke-direct {v15, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    new-instance v8, Lnb/yd;

    invoke-virtual {v11}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v10

    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v10

    if-eqz v4, :cond_49

    sget-object v11, Lnb/za;->f:Lnb/za;

    goto :goto_38

    :cond_49
    sget-object v11, Lnb/za;->c:Lnb/za;

    :goto_38
    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v13, 0x0

    invoke-direct {v8, v10, v12, v11, v13}, Lnb/yd;-><init>(Ljava/lang/String;Ljava/util/Map;Lnb/za;Lcom/google/android/gms/internal/measurement/p7;)V

    goto :goto_3a

    :cond_4a
    const/4 v13, 0x0

    new-instance v8, Lnb/yd;

    sget-object v10, Lnb/z4;->s:Lnb/y4;

    invoke-virtual {v10, v13}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v4, :cond_4b

    sget-object v11, Lnb/za;->f:Lnb/za;

    goto :goto_39

    :cond_4b
    sget-object v11, Lnb/za;->c:Lnb/za;

    :goto_39
    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {v8, v10, v12, v11, v13}, Lnb/yd;-><init>(Ljava/lang/String;Ljava/util/Map;Lnb/za;Lcom/google/android/gms/internal/measurement/p7;)V

    :goto_3a
    invoke-static {v0, v8}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_4c
    const/4 v13, 0x0

    :goto_3b
    if-eqz v4, :cond_4e

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v6;

    const/4 v4, 0x0

    :goto_3c
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/y6;->G()I

    move-result v8

    if-ge v4, v8, :cond_4d

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/y6;->H(I)Lcom/google/android/gms/internal/measurement/a7;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z6;->o1()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v8, v2, v3}, Lcom/google/android/gms/internal/measurement/z6;->t0(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v0, v4, v8}, Lcom/google/android/gms/internal/measurement/v6;->C(ILcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3c

    :cond_4d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-static {v0, v14}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v7}, Lnb/me;->q(Ljava/util/List;)V

    const/4 v4, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/16 v3, 0xcc

    invoke-virtual/range {v1 .. v7}, Lnb/me;->A(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    invoke-virtual {v14}, Lnb/yd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v6, v0}, Lnb/me;->t(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_50

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v2, "[sgtm] Sending sgtm batches available notification to app"

    invoke-virtual {v0, v2, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, v1, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lnb/me;->W(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_4e
    move-object v4, v9

    goto/16 :goto_32

    :goto_3d
    invoke-virtual {v1}, Lnb/me;->E0()Lnb/b6;

    move-result-object v5

    invoke-virtual {v5}, Lnb/b6;->m()Z

    move-result v5

    if-eqz v5, :cond_50

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x2

    invoke-static {v5, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4f

    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v5, v4}, Lnb/re;->K(Lcom/google/android/gms/internal/measurement/y6;)Ljava/lang/String;

    move-result-object v13

    :cond_4f
    invoke-virtual {v1}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v5

    invoke-virtual {v1, v7}, Lnb/me;->q(Ljava/util/List;)V

    iget-object v7, v1, Lnb/me;->i:Lnb/vc;

    iget-object v7, v7, Lnb/vc;->i:Lnb/h6;

    invoke-virtual {v7, v2, v3}, Lnb/h6;->b(J)V

    invoke-virtual {v1}, Lnb/me;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v2

    array-length v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "Uploading data. app, uncompressed size, data"

    invoke-virtual {v2, v5, v6, v3, v13}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v11, 0x1

    iput-boolean v11, v1, Lnb/me;->u:Z

    invoke-virtual {v1}, Lnb/me;->E0()Lnb/b6;

    move-result-object v2

    new-instance v3, Lnb/be;

    invoke-direct {v3, v1, v6, v0}, Lnb/be;-><init>(Lnb/me;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v2, v6, v14, v4, v3}, Lnb/b6;->n(Ljava/lang/String;Lnb/yd;Lcom/google/android/gms/internal/measurement/y6;Lnb/y5;)V

    :cond_50
    :goto_3e
    return-void

    :catchall_6
    move-exception v0

    move-object v13, v10

    :goto_3f
    if-eqz v13, :cond_51

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    :cond_51
    throw v0
.end method

.method public final s0(Z)V
    .locals 0

    invoke-virtual {p0}, Lnb/me;->R()V

    return-void
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v2

    invoke-virtual {v0}, Lnb/c6;->l0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lnb/ve;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnb/me;->E:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_1
    :goto_0
    iget-object p1, p0, Lnb/me;->E:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/ke;

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Lnb/ke;->b()Z

    move-result p1

    return p1
.end method

.method public final t0(Ljava/lang/String;Lnb/bb;)V
    .locals 1

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/me;->G:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput-object p1, p0, Lnb/me;->G:Ljava/lang/String;

    iput-object p2, p0, Lnb/me;->F:Lnb/bb;

    return-void
.end method

.method public final u(Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/me;->v:Z

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lnb/me;->l:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v2}, Lnb/g7;->J()Lnb/tc;

    move-result-object v2

    invoke-virtual {v2}, Lnb/tc;->x()Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->r()Lnb/u5;

    move-result-object p1

    const-string v0, "Upload data called on the client side before use of service was decided"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Upload called in the client side when service should be used"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    iget-wide v2, p0, Lnb/me;->o:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    invoke-virtual {p0}, Lnb/me;->R()V

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object v2

    invoke-virtual {v2}, Lnb/b6;->m()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v0, "Network not connected, ignoring upload request"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lnb/me;->R()V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2, p1}, Lnb/t;->p(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v2, "[sgtm] Upload queue has no batches for appId"

    invoke-virtual {v0, v2, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    sget-object v3, Lnb/za;->c:Lnb/za;

    filled-new-array {v3}, [Lnb/za;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzoo;->a([Lnb/za;)Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v3

    invoke-virtual {v2, p1, v3, v0}, Lnb/t;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoo;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v2, 0x0

    goto :goto_0

    :cond_5
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnb/pe;

    :goto_0
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lnb/pe;->d()Lcom/google/android/gms/internal/measurement/y6;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    const-string v5, "[sgtm] Uploading data from upload queue. appId, type, url"

    invoke-virtual {v2}, Lnb/pe;->f()Lnb/za;

    move-result-object v6

    invoke-virtual {v2}, Lnb/pe;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v5, p1, v6, v7}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {p0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    invoke-virtual {v5, v3}, Lnb/re;->K(Lcom/google/android/gms/internal/measurement/y6;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->w()Lnb/u5;

    move-result-object v6

    const-string v7, "[sgtm] Uploading data from upload queue. appId, uncompressed size, data"

    array-length v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v7, p1, v4, v5}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v2}, Lnb/pe;->a()Lnb/yd;

    move-result-object v4

    iput-boolean v0, p0, Lnb/me;->u:Z

    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object v0

    new-instance v5, Lnb/ce;

    invoke-direct {v5, p0, p1, v2}, Lnb/ce;-><init>(Lnb/me;Ljava/lang/String;Lnb/pe;)V

    invoke-virtual {v0, p1, v4, v3, v5}, Lnb/b6;->n(Ljava/lang/String;Lnb/yd;Lcom/google/android/gms/internal/measurement/y6;Lnb/y5;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_7
    :goto_1
    iput-boolean v1, p0, Lnb/me;->v:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    return-void

    :goto_2
    iput-boolean v1, p0, Lnb/me;->v:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    throw p1
.end method

.method public final synthetic u0(Lnb/ne;)V
    .locals 3

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1}, Lnb/j8;->h()V

    new-instance p1, Lnb/n6;

    invoke-direct {p1, p0}, Lnb/n6;-><init>(Lnb/me;)V

    iput-object p1, p0, Lnb/me;->k:Lnb/n6;

    new-instance p1, Lnb/t;

    invoke-direct {p1, p0}, Lnb/t;-><init>(Lnb/me;)V

    invoke-virtual {p1}, Lnb/xd;->k()V

    iput-object p1, p0, Lnb/me;->c:Lnb/t;

    iget-object p1, p0, Lnb/me;->a:Lnb/x6;

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/j;

    invoke-virtual {v0, p1}, Lnb/k;->t(Lnb/j;)V

    new-instance p1, Lnb/vc;

    invoke-direct {p1, p0}, Lnb/vc;-><init>(Lnb/me;)V

    invoke-virtual {p1}, Lnb/xd;->k()V

    iput-object p1, p0, Lnb/me;->i:Lnb/vc;

    new-instance p1, Lnb/e;

    invoke-direct {p1, p0}, Lnb/e;-><init>(Lnb/me;)V

    invoke-virtual {p1}, Lnb/xd;->k()V

    iput-object p1, p0, Lnb/me;->f:Lnb/e;

    new-instance p1, Lnb/wa;

    invoke-direct {p1, p0}, Lnb/wa;-><init>(Lnb/me;)V

    invoke-virtual {p1}, Lnb/xd;->k()V

    iput-object p1, p0, Lnb/me;->h:Lnb/wa;

    new-instance p1, Lnb/sd;

    invoke-direct {p1, p0}, Lnb/sd;-><init>(Lnb/me;)V

    invoke-virtual {p1}, Lnb/xd;->k()V

    iput-object p1, p0, Lnb/me;->e:Lnb/sd;

    new-instance p1, Lnb/e6;

    invoke-direct {p1, p0}, Lnb/e6;-><init>(Lnb/me;)V

    iput-object p1, p0, Lnb/me;->d:Lnb/e6;

    iget p1, p0, Lnb/me;->r:I

    iget v0, p0, Lnb/me;->s:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    iget v0, p0, Lnb/me;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lnb/me;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all upload components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lnb/me;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v0, "UploadController is now fully initialized"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final v(Ljava/lang/String;ILjava/lang/Throwable;[BLnb/pe;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/me;->O0()V

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    const/16 v1, 0xc8

    if-eq p2, v1, :cond_1

    const/16 v1, 0xcc

    if-ne p2, v1, :cond_3

    move p2, v1

    :cond_1
    if-nez p3, :cond_3

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p3

    invoke-virtual {p5}, Lnb/pe;->c()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-virtual {p3, p4}, Lnb/t;->q(Ljava/lang/Long;)V

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->w()Lnb/u5;

    move-result-object p3

    const-string p4, "Successfully uploaded batch from upload queue. appId, status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p4, p1, p2}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->E0()Lnb/b6;

    move-result-object p2

    invoke-virtual {p2}, Lnb/b6;->m()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    invoke-virtual {p2, p1}, Lnb/t;->p(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lnb/me;->u(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lnb/me;->R()V

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p4, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p4

    const/16 v2, 0x20

    invoke-static {v2, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    invoke-virtual {v1, v0, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->t()Lnb/u5;

    move-result-object v1

    const-string v2, "Network upload failed. Will retry later. appId, status, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    if-nez p3, :cond_4

    move-object p3, p4

    :cond_4
    invoke-virtual {v1, v2, p1, p2, p3}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p1

    invoke-virtual {p5}, Lnb/pe;->c()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnb/t;->w(Ljava/lang/Long;)V

    invoke-virtual {p0}, Lnb/me;->R()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iput-boolean v0, p0, Lnb/me;->u:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    return-void

    :goto_2
    iput-boolean v0, p0, Lnb/me;->u:Z

    invoke-virtual {p0}, Lnb/me;->S()V

    throw p1
.end method

.method public final synthetic v0()V
    .locals 0

    invoke-virtual {p0}, Lnb/me;->L()V

    return-void
.end method

.method public final w(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lnb/c6;->e0(Z)V

    invoke-virtual {p1, p3}, Lnb/c6;->g0(Ljava/lang/Long;)V

    invoke-virtual {p1, p4}, Lnb/c6;->i0(Ljava/lang/Long;)V

    invoke-virtual {p1}, Lnb/c6;->A()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lnb/me;->F0()Lnb/t;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3, p3}, Lnb/t;->K0(Lnb/c6;ZZ)V

    :cond_0
    return-void
.end method

.method public final x(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z6;)V
    .locals 6

    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->F(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/z6;->S0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_0
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->G()Lcom/google/android/gms/internal/measurement/z6;

    :cond_1
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->K(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v1, :cond_2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/z6;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_2
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->L(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "_id"

    invoke-static {p2, v0}, Lnb/re;->X(Lcom/google/android/gms/internal/measurement/z6;Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_3

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/z6;->m1(I)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->M(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->J0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_4
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->b0()Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {p0, p1}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v0

    sget-object v1, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v0, v1}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lnb/me;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnb/je;

    if-eqz v1, :cond_5

    iget-wide v2, v1, Lnb/je;->b:J

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v4

    sget-object v5, Lnb/z4;->l0:Lnb/y4;

    invoke-virtual {v4, p1, v5}, Lnb/k;->D(Ljava/lang/String;Lnb/y4;)J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-virtual {p0}, Lnb/me;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->b()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_6

    :cond_5
    new-instance v1, Lnb/je;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lnb/je;-><init>(Lnb/me;[B)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v0, v1, Lnb/je;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/z6;->T0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_7
    invoke-virtual {p0}, Lnb/me;->D0()Lnb/x6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/x6;->O(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/z6;->R0()Lcom/google/android/gms/internal/measurement/z6;

    :cond_8
    return-void
.end method

.method public final synthetic x0()Lnb/g7;
    .locals 1

    iget-object v0, p0, Lnb/me;->l:Lnb/g7;

    return-object v0
.end method

.method public final y(Lcom/google/android/gms/internal/measurement/z6;Lnb/ie;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/z6;->X0()I

    move-result v4

    if-ge v3, v4, :cond_7

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/z6;->Y0(I)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/n6;->x()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v6

    const-string v7, "_c"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v5, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a7;->Z0()I

    move-result v5

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v6

    iget-object v7, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lnb/z4;->m0:Lnb/y4;

    invoke-virtual {v6, v7, v8}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v6

    if-lt v5, v6, :cond_5

    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    iget-object v6, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lnb/z4;->z0:Lnb/y4;

    invoke-virtual {v5, v6, v7}, Lnb/k;->E(Ljava/lang/String;Lnb/y4;)I

    move-result v5

    const-string v6, "Generated trigger URI. appId, uri"

    const-string v7, "_tr"

    const/4 v8, 0x0

    const-string v9, "_tu"

    const-wide/16 v10, 0x1

    if-lez v5, :cond_3

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v12

    invoke-virtual {v0}, Lnb/me;->h()J

    move-result-wide v13

    iget-object v15, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v15

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {v12 .. v22}, Lnb/t;->L0(JLjava/lang/String;ZZZZZZZ)Lnb/p;

    move-result-object v12

    iget-wide v12, v12, Lnb/p;->g:J

    int-to-long v14, v5

    cmp-long v5, v12, v14

    if-lez v5, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v5

    const-string v6, "_tnr"

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v10, v11}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    iget-object v12, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lnb/z4;->S0:Lnb/y4;

    invoke-virtual {v5, v12, v13}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5}, Lnb/ve;->l0()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/measurement/r6;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v10, v11}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    iget-object v7, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, v1, v4, v8}, Lnb/re;->I(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z6;Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzoh;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->w()Lnb/u5;

    move-result-object v7

    iget-object v8, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/zzoh;->f:Ljava/lang/String;

    invoke-virtual {v7, v6, v8, v9}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    iget-object v7, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Lnb/t;->K(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoh;)Z

    iget-object v5, v0, Lnb/me;->q:Ljava/util/Deque;

    iget-object v6, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Deque;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v0}, Lnb/me;->B0()Lnb/k;

    move-result-object v5

    iget-object v12, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lnb/z4;->S0:Lnb/y4;

    invoke-virtual {v5, v12, v13}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lnb/me;->N0()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5}, Lnb/ve;->l0()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/measurement/r6;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v10, v11}, Lcom/google/android/gms/internal/measurement/r6;->E(J)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/n6;->E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v5

    iget-object v7, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, v1, v4, v8}, Lnb/re;->I(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z6;Lcom/google/android/gms/internal/measurement/n6;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzoh;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lnb/me;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->w()Lnb/u5;

    move-result-object v7

    iget-object v8, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/zzoh;->f:Ljava/lang/String;

    invoke-virtual {v7, v6, v8, v9}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    iget-object v7, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Lnb/t;->K(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzoh;)Z

    iget-object v5, v0, Lnb/me;->q:Ljava/util/Deque;

    iget-object v6, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Deque;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, v2, Lnb/ie;->a:Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/a7;->F()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/z6;->Z0(ILcom/google/android/gms/internal/measurement/o6;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public final synthetic y0()Ljava/util/Deque;
    .locals 1

    iget-object v0, p0, Lnb/me;->q:Ljava/util/Deque;

    return-object v0
.end method

.method public final z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/r6;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 9

    const-string v0, "_sc"

    const-string v1, "_si"

    const-string v2, "_o"

    const-string v3, "_sn"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu9/f;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-static {p1}, Lnb/ve;->N(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object p1

    invoke-virtual {p1, p4, v2}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result p1

    :goto_0
    int-to-long v3, p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object p1

    invoke-virtual {p1, p4, v2}, Lnb/k;->y(Ljava/lang/String;Z)I

    move-result p1

    goto :goto_0

    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->A()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v1}, Ljava/lang/String;->codePointCount(II)I

    move-result p1

    int-to-long v5, p1

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    const/16 v7, 0x28

    invoke-virtual {p1, v1, v7, v2}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p1

    cmp-long v1, v5, v3

    if-lez v1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->x()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->x()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lnb/me;->N0()Lnb/ve;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->A()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lnb/me;->B0()Lnb/k;

    move-result-object v0

    invoke-virtual {v0, p4, v2}, Lnb/k;->y(Ljava/lang/String;Z)I

    move-result p4

    invoke-virtual {p1, p2, p4, v2}, Lnb/ve;->q(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lnb/me;->a()Lnb/w5;

    move-result-object p4

    invoke-virtual {p4}, Lnb/w5;->t()Lnb/u5;

    move-result-object p4

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "Param value is too long; discarded. Name, value length"

    invoke-virtual {p4, v2, p1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p4, "_err"

    invoke-virtual {p3, p4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v0, v2, v7

    if-nez v0, :cond_3

    const-wide/16 v2, 0x4

    invoke-virtual {p3, p4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-nez p4, :cond_3

    invoke-virtual {p3, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "_el"

    invoke-virtual {p3, p1, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/r6;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final synthetic z0(J)V
    .locals 0

    iput-wide p1, p0, Lnb/me;->I:J

    return-void
.end method
