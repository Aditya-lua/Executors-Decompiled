.class public final Llv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljv/h<",
        "Lokhttp3/ResponseBody;",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Lxu/h;


# instance fields
.field public final a:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EFBBBF"

    invoke-static {v0}, Lxu/h;->c(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Llv/c;->b:Lxu/h;

    return-void
.end method

.method public constructor <init>(Lum/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv/c;->a:Lum/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, Llv/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/ResponseBody;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lxu/g;

    move-result-object v0

    :try_start_0
    sget-object v1, Llv/c;->b:Lxu/h;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lxu/g;->o0(JLxu/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lxu/h;->I()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lxu/g;->skip(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v0}, Lum/m;->s(Lxu/g;)Lum/m;

    move-result-object v0

    iget-object v1, p0, Llv/c;->a:Lum/h;

    invoke-virtual {v1, v0}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lum/m;->u()Lum/m$c;

    move-result-object v0

    sget-object v2, Lum/m$c;->j:Lum/m$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    return-object v1

    :cond_1
    :try_start_1
    new-instance v0, Lum/j;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lum/j;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
