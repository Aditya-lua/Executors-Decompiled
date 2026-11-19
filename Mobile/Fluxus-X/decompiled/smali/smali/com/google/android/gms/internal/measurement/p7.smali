.class public final Lcom/google/android/gms/internal/measurement/p7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pb;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/p7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/p7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/p7;->a:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/q7;->a(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
