.class public final Lcom/google/android/gms/internal/measurement/sf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/sf;


# instance fields
.field public final a:Lhe/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/sf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/sf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/uf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/uf;-><init>()V

    invoke-static {v0}, Lhe/t;->b(Ljava/lang/Object;)Lhe/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/sf;->a:Lhe/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zza()Z

    move-result v0

    return v0
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zzc()D

    move-result-wide v0

    return-wide v0
.end method

.method public static d()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zze()J

    move-result-wide v0

    return-wide v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/sf;->b:Lcom/google/android/gms/internal/measurement/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tf;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final g()Lcom/google/android/gms/internal/measurement/tf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sf;->a:Lhe/s;

    invoke-interface {v0}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/tf;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/sf;->g()Lcom/google/android/gms/internal/measurement/tf;

    move-result-object v0

    return-object v0
.end method
