.class public final Lcom/google/android/gms/internal/measurement/se;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/se;


# instance fields
.field public final a:Lhe/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/se;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/se;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/se;->b:Lcom/google/android/gms/internal/measurement/se;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/ue;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ue;-><init>()V

    invoke-static {v0}, Lhe/t;->b(Ljava/lang/Object;)Lhe/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/se;->a:Lhe/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/se;->b:Lcom/google/android/gms/internal/measurement/se;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/se;->c()Lcom/google/android/gms/internal/measurement/te;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/te;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/se;->b:Lcom/google/android/gms/internal/measurement/se;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/se;->c()Lcom/google/android/gms/internal/measurement/te;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/te;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/measurement/te;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/se;->a:Lhe/s;

    invoke-interface {v0}, Lhe/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/te;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/se;->c()Lcom/google/android/gms/internal/measurement/te;

    move-result-object v0

    return-object v0
.end method
