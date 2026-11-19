.class public final Lob/xe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Lcom/google/android/gms/internal/measurement/c7;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;

.field public e:Lob/eb;

.field public f:J

.field public g:J

.field public h:J

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lob/ye;
    .locals 15

    new-instance v0, Lob/ye;

    iget-wide v1, p0, Lob/xe;->a:J

    iget-object v3, p0, Lob/xe;->b:Lcom/google/android/gms/internal/measurement/c7;

    iget-object v4, p0, Lob/xe;->c:Ljava/lang/String;

    iget-object v5, p0, Lob/xe;->d:Ljava/util/Map;

    iget-object v6, p0, Lob/xe;->e:Lob/eb;

    iget-wide v7, p0, Lob/xe;->f:J

    iget-wide v9, p0, Lob/xe;->g:J

    iget-wide v11, p0, Lob/xe;->h:J

    iget v13, p0, Lob/xe;->i:I

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v14}, Lob/ye;-><init>(JLcom/google/android/gms/internal/measurement/c7;Ljava/lang/String;Ljava/util/Map;Lob/eb;JJJI[B)V

    return-object v0
.end method

.method public final b(J)Lob/xe;
    .locals 0

    iput-wide p1, p0, Lob/xe;->a:J

    return-object p0
.end method

.method public final c(Lcom/google/android/gms/internal/measurement/c7;)Lob/xe;
    .locals 0

    iput-object p1, p0, Lob/xe;->b:Lcom/google/android/gms/internal/measurement/c7;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lob/xe;
    .locals 0

    iput-object p1, p0, Lob/xe;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Ljava/util/Map;)Lob/xe;
    .locals 0

    iput-object p1, p0, Lob/xe;->d:Ljava/util/Map;

    return-object p0
.end method

.method public final f(Lob/eb;)Lob/xe;
    .locals 0

    iput-object p1, p0, Lob/xe;->e:Lob/eb;

    return-object p0
.end method

.method public final g(J)Lob/xe;
    .locals 0

    iput-wide p1, p0, Lob/xe;->f:J

    return-object p0
.end method

.method public final h(J)Lob/xe;
    .locals 0

    iput-wide p1, p0, Lob/xe;->g:J

    return-object p0
.end method

.method public final i(J)Lob/xe;
    .locals 0

    iput-wide p1, p0, Lob/xe;->h:J

    return-object p0
.end method

.method public final j(I)Lob/xe;
    .locals 0

    iput p1, p0, Lob/xe;->i:I

    return-object p0
.end method
