.class public final Lnb/oe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Lcom/google/android/gms/internal/measurement/y6;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;

.field public e:Lnb/za;

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
.method public final a()Lnb/pe;
    .locals 15

    new-instance v0, Lnb/pe;

    iget-wide v1, p0, Lnb/oe;->a:J

    iget-object v3, p0, Lnb/oe;->b:Lcom/google/android/gms/internal/measurement/y6;

    iget-object v4, p0, Lnb/oe;->c:Ljava/lang/String;

    iget-object v5, p0, Lnb/oe;->d:Ljava/util/Map;

    iget-object v6, p0, Lnb/oe;->e:Lnb/za;

    iget-wide v7, p0, Lnb/oe;->f:J

    iget-wide v9, p0, Lnb/oe;->g:J

    iget-wide v11, p0, Lnb/oe;->h:J

    iget v13, p0, Lnb/oe;->i:I

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v14}, Lnb/pe;-><init>(JLcom/google/android/gms/internal/measurement/y6;Ljava/lang/String;Ljava/util/Map;Lnb/za;JJJI[B)V

    return-object v0
.end method

.method public final b(J)Lnb/oe;
    .locals 0

    iput-wide p1, p0, Lnb/oe;->a:J

    return-object p0
.end method

.method public final c(Lcom/google/android/gms/internal/measurement/y6;)Lnb/oe;
    .locals 0

    iput-object p1, p0, Lnb/oe;->b:Lcom/google/android/gms/internal/measurement/y6;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lnb/oe;
    .locals 0

    iput-object p1, p0, Lnb/oe;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Ljava/util/Map;)Lnb/oe;
    .locals 0

    iput-object p1, p0, Lnb/oe;->d:Ljava/util/Map;

    return-object p0
.end method

.method public final f(Lnb/za;)Lnb/oe;
    .locals 0

    iput-object p1, p0, Lnb/oe;->e:Lnb/za;

    return-object p0
.end method

.method public final g(J)Lnb/oe;
    .locals 0

    iput-wide p1, p0, Lnb/oe;->f:J

    return-object p0
.end method

.method public final h(J)Lnb/oe;
    .locals 0

    iput-wide p1, p0, Lnb/oe;->g:J

    return-object p0
.end method

.method public final i(J)Lnb/oe;
    .locals 0

    iput-wide p1, p0, Lnb/oe;->h:J

    return-object p0
.end method

.method public final j(I)Lnb/oe;
    .locals 0

    iput p1, p0, Lnb/oe;->i:I

    return-object p0
.end method
