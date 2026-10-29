.class public final Llv/b;
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
        "TT;",
        "Lokhttp3/RequestBody;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lokhttp3/MediaType;


# instance fields
.field public final a:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Llv/b;->c:Lokhttp3/MediaType;

    return-void
.end method

.method public constructor <init>(Lum/h;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/h<",
            "TT;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv/b;->a:Lum/h;

    iput-boolean p2, p0, Llv/b;->b:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llv/b;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lokhttp3/RequestBody;"
        }
    .end annotation

    iget-boolean v0, p0, Llv/b;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Llv/d;

    iget-object v1, p0, Llv/b;->a:Lum/h;

    invoke-direct {v0, v1, p1}, Llv/d;-><init>(Lum/h;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    invoke-static {v0}, Lum/t;->q(Lxu/f;)Lum/t;

    move-result-object v1

    iget-object v2, p0, Llv/b;->a:Lum/h;

    invoke-virtual {v2, v1, p1}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    sget-object p1, Llv/b;->c:Lokhttp3/MediaType;

    invoke-virtual {v0}, Lxu/e;->F2()Lxu/h;

    move-result-object v0

    invoke-static {p1, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Lxu/h;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
