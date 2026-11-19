.class public final Lcom/google/android/gms/internal/measurement/jc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ed;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/qc;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/qc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/hc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/hc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/jc;->b:Lcom/google/android/gms/internal/measurement/qc;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/ic;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/fb;->c()Lcom/google/android/gms/internal/measurement/fb;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/qc;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/measurement/jc;->b:Lcom/google/android/gms/internal/measurement/qc;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/ic;-><init>([Lcom/google/android/gms/internal/measurement/qc;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/measurement/ub;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/jc;->a:Lcom/google/android/gms/internal/measurement/qc;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/dd;
    .locals 8

    sget-object v0, Lcom/google/android/gms/internal/measurement/fd;->a:Lcom/google/android/gms/internal/measurement/pd;

    const-class v0, Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/jc;->a:Lcom/google/android/gms/internal/measurement/qc;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/qc;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/pc;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/pc;->zza()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/yc;->a()Lcom/google/android/gms/internal/measurement/xc;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ec;->a()Lcom/google/android/gms/internal/measurement/dc;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/fd;->a()Lcom/google/android/gms/internal/measurement/pd;

    move-result-object v5

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/pc;->zzc()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ya;->a()Lcom/google/android/gms/internal/measurement/wa;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/oc;->a()Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/vc;->y(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/pc;Lcom/google/android/gms/internal/measurement/xc;Lcom/google/android/gms/internal/measurement/dc;Lcom/google/android/gms/internal/measurement/pd;Lcom/google/android/gms/internal/measurement/wa;Lcom/google/android/gms/internal/measurement/nc;)Lcom/google/android/gms/internal/measurement/vc;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/fd;->a()Lcom/google/android/gms/internal/measurement/pd;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ya;->a()Lcom/google/android/gms/internal/measurement/wa;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/pc;->zzb()Lcom/google/android/gms/internal/measurement/sc;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/wc;->g(Lcom/google/android/gms/internal/measurement/pd;Lcom/google/android/gms/internal/measurement/wa;Lcom/google/android/gms/internal/measurement/sc;)Lcom/google/android/gms/internal/measurement/wc;

    move-result-object p1

    return-object p1
.end method
