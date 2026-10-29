.class public final Lkv/b;
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
.field public static final d:Lokhttp3/MediaType;


# instance fields
.field public final a:Lkg/f;

.field public final b:Lkg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lkv/b;->d:Lokhttp3/MediaType;

    return-void
.end method

.method public constructor <init>(Lkg/f;Lkg/a0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/f;",
            "Lkg/a0<",
            "TT;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv/b;->a:Lkg/f;

    iput-object p2, p0, Lkv/b;->b:Lkg/a0;

    iput-boolean p3, p0, Lkv/b;->c:Z

    return-void
.end method

.method public static c(Lxu/f;Lkg/f;Lkg/a0;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxu/f;",
            "Lkg/f;",
            "Lkg/a0<",
            "TT;>;TT;)V"
        }
    .end annotation

    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-interface {p0}, Lxu/f;->j3()Ljava/io/OutputStream;

    move-result-object p0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-virtual {p1, v0}, Lkg/f;->s(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;

    move-result-object p0

    invoke-virtual {p2, p0, p3}, Lkg/a0;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/gson/stream/JsonWriter;->close()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lkv/b;->b(Ljava/lang/Object;)Lokhttp3/RequestBody;

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

    iget-boolean v0, p0, Lkv/b;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lkv/d;

    iget-object v1, p0, Lkv/b;->a:Lkg/f;

    iget-object v2, p0, Lkv/b;->b:Lkg/a0;

    invoke-direct {v0, v1, v2, p1}, Lkv/d;-><init>(Lkg/f;Lkg/a0;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    iget-object v1, p0, Lkv/b;->a:Lkg/f;

    iget-object v2, p0, Lkv/b;->b:Lkg/a0;

    invoke-static {v0, v1, v2, p1}, Lkv/b;->c(Lxu/f;Lkg/f;Lkg/a0;Ljava/lang/Object;)V

    sget-object p1, Lkv/b;->d:Lokhttp3/MediaType;

    invoke-virtual {v0}, Lxu/e;->F2()Lxu/h;

    move-result-object v0

    invoke-static {p1, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Lxu/h;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method
