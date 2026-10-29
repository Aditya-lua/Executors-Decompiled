.class public final Lcom/google/android/gms/internal/measurement/fc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ad;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/mc;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/mc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/dc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/dc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/fc;->b:Lcom/google/android/gms/internal/measurement/mc;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/ec;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/bb;->c()Lcom/google/android/gms/internal/measurement/bb;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/mc;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/measurement/fc;->b:Lcom/google/android/gms/internal/measurement/mc;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/ec;-><init>([Lcom/google/android/gms/internal/measurement/mc;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/fc;->a:Lcom/google/android/gms/internal/measurement/mc;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;
    .locals 8

    sget-object v0, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    const-class v0, Lcom/google/android/gms/internal/measurement/gb;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/fc;->a:Lcom/google/android/gms/internal/measurement/mc;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/mc;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/lc;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/lc;->zza()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/uc;->a()Lcom/google/android/gms/internal/measurement/tc;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ac;->a()Lcom/google/android/gms/internal/measurement/zb;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/bd;->a()Lcom/google/android/gms/internal/measurement/ld;

    move-result-object v5

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/lc;->zzc()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ua;->a()Lcom/google/android/gms/internal/measurement/sa;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/kc;->a()Lcom/google/android/gms/internal/measurement/jc;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/rc;->y(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/lc;Lcom/google/android/gms/internal/measurement/tc;Lcom/google/android/gms/internal/measurement/zb;Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/jc;)Lcom/google/android/gms/internal/measurement/rc;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/bd;->a()Lcom/google/android/gms/internal/measurement/ld;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ua;->a()Lcom/google/android/gms/internal/measurement/sa;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/lc;->zzb()Lcom/google/android/gms/internal/measurement/oc;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sc;->g(Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/oc;)Lcom/google/android/gms/internal/measurement/sc;

    move-result-object p1

    return-object p1
.end method
