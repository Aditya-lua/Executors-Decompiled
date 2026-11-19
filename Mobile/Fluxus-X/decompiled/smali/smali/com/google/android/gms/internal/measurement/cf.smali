.class public final Lcom/google/android/gms/internal/measurement/cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/cf;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/cf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/cf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/cf;->b:Lcom/google/android/gms/internal/measurement/cf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/ef;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ef;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/cf;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/cf;->b:Lcom/google/android/gms/internal/measurement/cf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cf;->e()Lcom/google/android/gms/internal/measurement/df;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/df;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/cf;->b:Lcom/google/android/gms/internal/measurement/cf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cf;->e()Lcom/google/android/gms/internal/measurement/df;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/df;->zzb()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/cf;->b:Lcom/google/android/gms/internal/measurement/cf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cf;->e()Lcom/google/android/gms/internal/measurement/df;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/df;->zzc()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/cf;->b:Lcom/google/android/gms/internal/measurement/cf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cf;->e()Lcom/google/android/gms/internal/measurement/df;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/df;->zzd()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final e()Lcom/google/android/gms/internal/measurement/df;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cf;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/df;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cf;->e()Lcom/google/android/gms/internal/measurement/df;

    move-result-object v0

    return-object v0
.end method
