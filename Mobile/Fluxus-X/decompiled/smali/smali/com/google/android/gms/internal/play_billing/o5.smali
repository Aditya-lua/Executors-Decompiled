.class public final Lcom/google/android/gms/internal/play_billing/o5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/play_billing/v5;


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/v5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/m5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/m5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/o5;->b:Lcom/google/android/gms/internal/play_billing/v5;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/play_billing/n5;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o4;->c()Lcom/google/android/gms/internal/play_billing/o4;

    move-result-object v1

    sget v2, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/play_billing/v5;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/play_billing/o5;->b:Lcom/google/android/gms/internal/play_billing/v5;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/n5;-><init>([Lcom/google/android/gms/internal/play_billing/v5;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/o5;->a:Lcom/google/android/gms/internal/play_billing/v5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;
    .locals 8

    sget-object v0, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    const-class v0, Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/o5;->a:Lcom/google/android/gms/internal/play_billing/v5;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/play_billing/v5;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/u5;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/u5;->zzb()Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d6;->a()Lcom/google/android/gms/internal/play_billing/c6;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j5;->a()Lcom/google/android/gms/internal/play_billing/i5;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i6;->r()Lcom/google/android/gms/internal/play_billing/t6;

    move-result-object v5

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/u5;->zzc()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i4;->a()Lcom/google/android/gms/internal/play_billing/g4;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t5;->a()Lcom/google/android/gms/internal/play_billing/s5;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/a6;->x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/u5;Lcom/google/android/gms/internal/play_billing/c6;Lcom/google/android/gms/internal/play_billing/i5;Lcom/google/android/gms/internal/play_billing/t6;Lcom/google/android/gms/internal/play_billing/g4;Lcom/google/android/gms/internal/play_billing/s5;)Lcom/google/android/gms/internal/play_billing/a6;

    move-result-object p1

    return-object p1

    :cond_2
    sget p1, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i6;->r()Lcom/google/android/gms/internal/play_billing/t6;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/i4;->a()Lcom/google/android/gms/internal/play_billing/g4;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/u5;->zza()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/b6;->g(Lcom/google/android/gms/internal/play_billing/t6;Lcom/google/android/gms/internal/play_billing/g4;Lcom/google/android/gms/internal/play_billing/x5;)Lcom/google/android/gms/internal/play_billing/b6;

    move-result-object p1

    return-object p1
.end method
