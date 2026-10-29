.class public final Lcom/google/android/gms/internal/measurement/je;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/je;


# instance fields
.field public final a:Lhe/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/je;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/je;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/je;->b:Lcom/google/android/gms/internal/measurement/je;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/le;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/le;-><init>()V

    invoke-static {v0}, Lhe/t;->b(Ljava/lang/Object;)Lhe/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/je;->a:Lhe/s;

    return-void
.end method

.method public static a()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/je;->b:Lcom/google/android/gms/internal/measurement/je;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/je;->b()Lcom/google/android/gms/internal/measurement/ke;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/ke;->zza()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/measurement/ke;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/je;->a:Lhe/s;

    invoke-interface {v0}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/ke;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/je;->b()Lcom/google/android/gms/internal/measurement/ke;

    move-result-object v0

    return-object v0
.end method
