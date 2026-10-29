.class public final Lcom/google/android/gms/internal/play_billing/f4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/play_billing/f4;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/f4;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/f4;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/f4;->b:Lcom/google/android/gms/internal/play_billing/f4;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/f4;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/x5;I)Lcom/google/android/gms/internal/play_billing/s4;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/e4;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/e4;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/f4;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/s4;

    return-object p1
.end method
