.class public final Lkv/a;
.super Ljv/h$a;
.source "SourceFile"


# instance fields
.field public final a:Lkg/f;

.field public final b:Z


# direct methods
.method public constructor <init>(Lkg/f;Z)V
    .locals 0

    invoke-direct {p0}, Ljv/h$a;-><init>()V

    iput-object p1, p0, Lkv/a;->a:Lkg/f;

    iput-boolean p2, p0, Lkv/a;->b:Z

    return-void
.end method

.method public static f()Lkv/a;
    .locals 1

    new-instance v0, Lkg/f;

    invoke-direct {v0}, Lkg/f;-><init>()V

    invoke-static {v0}, Lkv/a;->g(Lkg/f;)Lkv/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Lkg/f;)Lkv/a;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, Lkv/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkv/a;-><init>(Lkg/f;Z)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lkv/a;->a:Lkg/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkg/f;->n(Lcom/google/gson/reflect/TypeToken;)Lkg/a0;

    move-result-object p1

    new-instance p2, Lkv/b;

    iget-object p3, p0, Lkv/a;->a:Lkg/f;

    iget-boolean p4, p0, Lkv/a;->b:Z

    invoke-direct {p2, p3, p1, p4}, Lkv/b;-><init>(Lkg/f;Lkg/a0;Z)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    iget-object p2, p0, Lkv/a;->a:Lkg/f;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkg/f;->n(Lcom/google/gson/reflect/TypeToken;)Lkg/a0;

    move-result-object p1

    new-instance p2, Lkv/c;

    iget-object p3, p0, Lkv/a;->a:Lkg/f;

    invoke-direct {p2, p3, p1}, Lkv/c;-><init>(Lkg/f;Lkg/a0;)V

    return-object p2
.end method
