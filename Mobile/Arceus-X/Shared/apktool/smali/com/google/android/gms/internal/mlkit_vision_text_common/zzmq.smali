.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsf/a;


# static fields
.field public static final zza:Lsf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmq;->zza:Lsf/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final configure(Lsf/b;)V
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzio;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzio;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzst;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzip;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzip;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpc;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzir;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzir;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpa;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzis;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzis;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhi;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhi;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzid;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzid;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzni;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqi;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzka;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzka;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzny;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlo;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlo;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziy;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziy;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzph;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqt;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkl;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkl;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqs;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzre;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzky;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzky;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzix;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzix;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzla;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzla;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzri;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzro;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrc;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzon;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzii;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzii;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzra;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkt;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkt;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzks;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzks;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzku;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzku;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgu;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgu;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgs;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgs;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmt;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmv;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgt;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgt;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzna;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgy;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgy;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznc;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzha;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzha;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzev;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgl;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgl;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzex;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzew;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzol;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzig;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzig;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznl;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzez;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzez;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfa;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfa;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzht;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzht;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdi;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfo;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfo;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdt;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfe;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfe;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzea;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzft;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzft;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfu;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfu;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzee;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzed;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfy;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfy;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzef;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzga;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzga;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzei;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzth;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlt;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlt;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzta;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzte;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzls;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzls;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzti;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlu;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlu;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztc;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzie;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzie;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztl;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmo;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmo;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzok;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzif;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzif;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoo;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzij;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzij;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzms;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoe;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzia;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzia;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzom;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzih;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzih;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhu;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhu;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzno;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhl;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhl;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznm;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzho;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzho;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpe;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zziu;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zziu;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzit;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzit;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzde;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzey;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzey;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzml;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzml;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgo;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgo;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzng;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhe;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhe;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzne;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqf;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqh;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjy;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjy;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzds;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfl;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfl;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzql;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzke;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzke;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdv;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsl;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzma;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzma;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsv;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmi;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmi;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqv;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzko;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzko;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzog;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzic;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzic;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzec;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzib;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzib;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzof;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhy;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhy;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqo;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzki;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzki;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzkh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfs;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfs;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpv;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjn;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjn;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpw;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjo;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjo;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpx;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdo;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfi;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfi;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzps;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpt;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjl;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjl;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpu;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjm;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjm;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzff;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzff;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdl;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpy;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpz;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqa;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjs;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjs;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqb;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjt;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjt;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzdp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzfk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlx;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlx;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzly;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzly;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzop;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzik;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzik;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzor;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzim;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzim;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzil;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzil;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzos;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzin;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzin;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzli;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzli;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzem;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzel;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzld;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzld;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrl;

    invoke-interface {p1, v1, v0}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzle;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzle;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzek;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzej;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzge;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzge;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlz;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjb;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpn;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjg;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpm;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpo;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzji;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzji;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpl;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzje;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzje;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpi;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzja;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzja;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzpj;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjc;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqd;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzns;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhr;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhr;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqc;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzju;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzju;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzqe;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjw;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzjw;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhq;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhq;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznt;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhs;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhs;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsg;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlv;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlv;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrr;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlj;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlj;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmf;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrt;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzll;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzll;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrs;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlk;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzlk;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzso;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzmd;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeo;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgh;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgh;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzen;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgi;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzgi;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsp;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzme;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzme;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznq;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhp;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhp;

    invoke-interface {p1, v0, v1}, Lsf/b;->registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b;

    return-void
.end method
