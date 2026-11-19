.class public final Lcom/google/android/gms/internal/measurement/cg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/cg;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/cg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/cg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/cg;->b:Lcom/google/android/gms/internal/measurement/cg;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/eg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/eg;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/cg;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/cg;->b:Lcom/google/android/gms/internal/measurement/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cg;->b()Lcom/google/android/gms/internal/measurement/dg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/dg;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/measurement/dg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cg;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/dg;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cg;->b()Lcom/google/android/gms/internal/measurement/dg;

    move-result-object v0

    return-object v0
.end method
