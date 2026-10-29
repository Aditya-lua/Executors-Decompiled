.class public Lmm/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lmm/g;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lmm/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmm/n;->a:Ljava/lang/String;

    iput-object p2, p0, Lmm/n;->b:Lmm/g;

    const/4 p1, 0x0

    iput-object p1, p0, Lmm/n;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lmm/n;->d:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmm/n;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lmm/g;
    .locals 1

    iget-object v0, p0, Lmm/n;->b:Lmm/g;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lmm/n;->d:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmm/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmm/n;->a:Ljava/lang/String;

    return-object v0
.end method
