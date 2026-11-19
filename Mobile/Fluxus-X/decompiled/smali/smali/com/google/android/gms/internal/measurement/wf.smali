.class public final Lcom/google/android/gms/internal/measurement/wf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/wf;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/wf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/wf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/yf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/yf;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/wf;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zza()Z

    move-result v0

    return v0
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zzc()D

    move-result-wide v0

    return-wide v0
.end method

.method public static d()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zze()J

    move-result-wide v0

    return-wide v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wf;->b:Lcom/google/android/gms/internal/measurement/wf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xf;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final g()Lcom/google/android/gms/internal/measurement/xf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wf;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/xf;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/wf;->g()Lcom/google/android/gms/internal/measurement/xf;

    move-result-object v0

    return-object v0
.end method
