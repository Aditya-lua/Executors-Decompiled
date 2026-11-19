.class public final Lcom/google/android/gms/internal/measurement/zf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/zf;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/bg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/bg;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zf;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zzb()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zzc()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zzd()Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zze()Z

    move-result v0

    return v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zzf()Z

    move-result v0

    return v0
.end method

.method public static g()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->c()Z

    move-result v0

    return v0
.end method

.method public static h()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->zzh()Z

    move-result v0

    return v0
.end method

.method public static i()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zf;->b:Lcom/google/android/gms/internal/measurement/zf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ag;->d()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zf;->j()Lcom/google/android/gms/internal/measurement/ag;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/internal/measurement/ag;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zf;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/ag;

    return-object v0
.end method
