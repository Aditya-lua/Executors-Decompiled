.class public Lhn/s$a;
.super Lew/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/s;->Y()Lew/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lew/e;

.field public final synthetic c:Lhn/s;


# direct methods
.method public constructor <init>(Lhn/s;Lew/j0;Lew/e;)V
    .locals 0

    iput-object p1, p0, Lhn/s$a;->c:Lhn/s;

    iput-object p3, p0, Lhn/s$a;->b:Lew/e;

    invoke-direct {p0, p2}, Lew/m;-><init>(Lew/j0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    iget-object v0, p0, Lhn/s$a;->c:Lhn/s;

    invoke-virtual {v0}, Lhn/t;->s()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lhn/s$a;->c:Lhn/s;

    iget-object v1, v0, Lhn/s;->j:[Ljava/lang/Object;

    iget v2, v0, Lhn/t;->a:I

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    sub-int/2addr v2, v1

    iput v2, v0, Lhn/t;->a:I

    iget-object v0, p0, Lhn/s$a;->b:Lew/e;

    invoke-static {v0}, Lhn/m;->u(Lew/g;)Lhn/m;

    move-result-object v0

    invoke-virtual {v0}, Lhn/m;->E()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lhn/s$a;->c:Lhn/s;

    iget-boolean v3, v2, Lhn/t;->g:Z

    iput-boolean v1, v2, Lhn/t;->g:Z

    :try_start_0
    invoke-static {v2, v0}, Lhn/s;->b0(Lhn/s;Ljava/lang/Object;)Lhn/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lhn/s$a;->c:Lhn/s;

    iput-boolean v3, v0, Lhn/t;->g:Z

    iget-object v2, v0, Lhn/t;->d:[I

    iget v0, v0, Lhn/t;->a:I

    sub-int/2addr v0, v1

    aget v3, v2, v0

    add-int/2addr v3, v1

    aput v3, v2, v0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lhn/s$a;->c:Lhn/s;

    iput-boolean v3, v1, Lhn/t;->g:Z

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
