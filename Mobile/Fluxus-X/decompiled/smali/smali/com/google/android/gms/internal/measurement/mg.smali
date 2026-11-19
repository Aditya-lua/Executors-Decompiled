.class public final Lcom/google/android/gms/internal/measurement/mg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/mg;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/mg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/mg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/mg;->b:Lcom/google/android/gms/internal/measurement/mg;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/og;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/og;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/mg;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/mg;->b:Lcom/google/android/gms/internal/measurement/mg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/mg;->c()Lcom/google/android/gms/internal/measurement/ng;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ng;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/mg;->b:Lcom/google/android/gms/internal/measurement/mg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/mg;->c()Lcom/google/android/gms/internal/measurement/ng;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ng;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/measurement/ng;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/mg;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/ng;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/mg;->c()Lcom/google/android/gms/internal/measurement/ng;

    move-result-object v0

    return-object v0
.end method
