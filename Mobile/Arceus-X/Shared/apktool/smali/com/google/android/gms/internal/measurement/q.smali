.class public interface abstract Lcom/google/android/gms/internal/measurement/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Ao:Lcom/google/android/gms/internal/measurement/q;

.field public static final Bo:Lcom/google/android/gms/internal/measurement/q;

.field public static final Co:Lcom/google/android/gms/internal/measurement/q;

.field public static final Do:Lcom/google/android/gms/internal/measurement/q;

.field public static final Eo:Lcom/google/android/gms/internal/measurement/q;

.field public static final Fo:Lcom/google/android/gms/internal/measurement/q;

.field public static final Go:Lcom/google/android/gms/internal/measurement/q;

.field public static final zo:Lcom/google/android/gms/internal/measurement/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/v;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/v;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/o;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Ao:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    const-string v1, "continue"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Bo:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    const-string v1, "break"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Co:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/h;

    const-string v1, "return"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Do:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Eo:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Boolean;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Fo:Lcom/google/android/gms/internal/measurement/q;

    new-instance v0, Lcom/google/android/gms/internal/measurement/u;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q;->Go:Lcom/google/android/gms/internal/measurement/q;

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/google/android/gms/internal/measurement/q;
.end method

.method public abstract e(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
.end method

.method public abstract zzc()Ljava/lang/String;
.end method

.method public abstract zzd()Ljava/lang/Double;
.end method

.method public abstract zze()Ljava/lang/Boolean;
.end method

.method public abstract zzf()Ljava/util/Iterator;
.end method
