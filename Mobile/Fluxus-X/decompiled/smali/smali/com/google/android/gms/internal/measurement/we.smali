.class public final Lcom/google/android/gms/internal/measurement/we;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/we;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/we;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/we;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/we;->b:Lcom/google/android/gms/internal/measurement/we;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/ye;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ye;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/we;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/we;->b:Lcom/google/android/gms/internal/measurement/we;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/we;->c()Lcom/google/android/gms/internal/measurement/xe;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xe;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/we;->b:Lcom/google/android/gms/internal/measurement/we;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/we;->c()Lcom/google/android/gms/internal/measurement/xe;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xe;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/measurement/xe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/we;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/xe;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/we;->c()Lcom/google/android/gms/internal/measurement/xe;

    move-result-object v0

    return-object v0
.end method
