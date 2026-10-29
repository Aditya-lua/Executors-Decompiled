.class public final Lcom/google/android/gms/internal/measurement/vf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/vf;


# instance fields
.field public final a:Lhe/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/vf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/vf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/xf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/xf;-><init>()V

    invoke-static {v0}, Lhe/t;->b(Ljava/lang/Object;)Lhe/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/vf;->a:Lhe/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zzb()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zzc()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zzd()Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zze()Z

    move-result v0

    return v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zzf()Z

    move-result v0

    return v0
.end method

.method public static g()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->c()Z

    move-result v0

    return v0
.end method

.method public static h()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->zzh()Z

    move-result v0

    return v0
.end method

.method public static i()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/vf;->b:Lcom/google/android/gms/internal/measurement/vf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/wf;->d()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/vf;->j()Lcom/google/android/gms/internal/measurement/wf;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/internal/measurement/wf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/vf;->a:Lhe/s;

    invoke-interface {v0}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/wf;

    return-object v0
.end method
