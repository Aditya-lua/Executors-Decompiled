.class public Lwe/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lwe/e$d;

.field public final b:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lwe/e$d;

    invoke-direct {v0}, Lwe/e$d;-><init>()V

    const/16 v1, 0xa

    new-array v1, v1, [J

    invoke-direct {p0, v0, v1}, Lwe/e$c;-><init>(Lwe/e$d;[J)V

    return-void
.end method

.method public constructor <init>(Lwe/e$c;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lwe/e$d;

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    invoke-direct {v0, v1}, Lwe/e$d;-><init>(Lwe/e$d;)V

    iput-object v0, p0, Lwe/e$c;->a:Lwe/e$d;

    .line 7
    iget-object p1, p1, Lwe/e$c;->b:[J

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lwe/e$c;->b:[J

    return-void
.end method

.method public constructor <init>(Lwe/e$d;[J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    .line 4
    iput-object p2, p0, Lwe/e$c;->b:[J

    return-void
.end method
