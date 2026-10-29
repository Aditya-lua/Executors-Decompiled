.class public Lwe/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:[J

.field public final b:[J

.field public final c:[J


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xa

    .line 1
    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v0, v0, [J

    invoke-direct {p0, v1, v2, v0}, Lwe/e$a;-><init>([J[J[J)V

    return-void
.end method

.method public constructor <init>(Lwe/e$a;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget-object v0, p1, Lwe/e$a;->a:[J

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lwe/e$a;->a:[J

    .line 8
    iget-object v0, p1, Lwe/e$a;->b:[J

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lwe/e$a;->b:[J

    .line 9
    iget-object p1, p1, Lwe/e$a;->c:[J

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lwe/e$a;->c:[J

    return-void
.end method

.method public constructor <init>([J[J[J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/e$a;->a:[J

    .line 4
    iput-object p2, p0, Lwe/e$a;->b:[J

    .line 5
    iput-object p3, p0, Lwe/e$a;->c:[J

    return-void
.end method


# virtual methods
.method public a(Lwe/e$a;I)V
    .locals 2

    iget-object v0, p0, Lwe/e$a;->a:[J

    iget-object v1, p1, Lwe/e$a;->a:[J

    invoke-static {v0, v1, p2}, Lwe/d;->a([J[JI)V

    iget-object v0, p0, Lwe/e$a;->b:[J

    iget-object v1, p1, Lwe/e$a;->b:[J

    invoke-static {v0, v1, p2}, Lwe/d;->a([J[JI)V

    iget-object v0, p0, Lwe/e$a;->c:[J

    iget-object p1, p1, Lwe/e$a;->c:[J

    invoke-static {v0, p1, p2}, Lwe/d;->a([J[JI)V

    return-void
.end method

.method public b([J[J)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0xa

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
