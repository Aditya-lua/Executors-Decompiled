.class public final Luw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/i0;",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Lew/h;


# instance fields
.field public final a:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EFBBBF"

    invoke-static {v0}, Lew/h;->c(Ljava/lang/String;)Lew/h;

    move-result-object v0

    sput-object v0, Luw/c;->b:Lew/h;

    return-void
.end method

.method public constructor <init>(Lhn/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luw/c;->a:Lhn/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmv/i0;

    invoke-virtual {p0, p1}, Luw/c;->b(Lmv/i0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/i0;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/i0;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lmv/i0;->l3()Lew/g;

    move-result-object v0

    :try_start_0
    sget-object v1, Luw/c;->b:Lew/h;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lew/g;->V1(JLew/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lew/h;->I()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lew/g;->skip(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v0}, Lhn/m;->u(Lew/g;)Lhn/m;

    move-result-object v0

    iget-object v1, p0, Luw/c;->a:Lhn/h;

    invoke-virtual {v1, v0}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lhn/m;->w()Lhn/m$c;

    move-result-object v0

    sget-object v2, Lhn/m$c;->j:Lhn/m$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lmv/i0;->close()V

    return-object v1

    :cond_1
    :try_start_1
    new-instance v0, Lhn/j;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lhn/j;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lmv/i0;->close()V

    throw v0
.end method
