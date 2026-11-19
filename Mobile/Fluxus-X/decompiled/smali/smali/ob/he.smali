.class public final Lob/he;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;

.field public final c:Lob/eb;

.field public final d:Lcom/google/android/gms/internal/measurement/t7;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lob/eb;Lcom/google/android/gms/internal/measurement/t7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/he;->a:Ljava/lang/String;

    iput-object p2, p0, Lob/he;->b:Ljava/util/Map;

    iput-object p3, p0, Lob/he;->c:Lob/eb;

    iput-object p4, p0, Lob/he;->d:Lcom/google/android/gms/internal/measurement/t7;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/he;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lob/he;->b:Ljava/util/Map;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public final c()Lob/eb;
    .locals 1

    iget-object v0, p0, Lob/he;->c:Lob/eb;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/measurement/t7;
    .locals 1

    iget-object v0, p0, Lob/he;->d:Lcom/google/android/gms/internal/measurement/t7;

    return-object v0
.end method
