.class public final Lcom/google/android/gms/internal/measurement/rg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/rg;


# instance fields
.field public final a:Lhe/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/rg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/rg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/rg;->b:Lcom/google/android/gms/internal/measurement/rg;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/tg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/tg;-><init>()V

    invoke-static {v0}, Lhe/t;->b(Ljava/lang/Object;)Lhe/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/rg;->a:Lhe/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/rg;->b:Lcom/google/android/gms/internal/measurement/rg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/rg;->b()Lcom/google/android/gms/internal/measurement/sg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/sg;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/measurement/sg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rg;->a:Lhe/s;

    invoke-interface {v0}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/sg;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/rg;->b()Lcom/google/android/gms/internal/measurement/sg;

    move-result-object v0

    return-object v0
.end method
