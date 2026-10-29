.class public Lcl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final c:Lcl/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcl/b;->a:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcl/b;->b:Ljava/lang/Object;

    .line 4
    iput-object v0, p0, Lcl/b;->c:Lcl/a;

    return-void
.end method

.method public constructor <init>(Ljv/x;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/x<",
            "TT;>;)V"
        }
    .end annotation

    .line 5
    const-string v0, "ApiResponse"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Ljv/x;->b()I

    move-result v1

    iput v1, p0, Lcl/b;->a:I

    .line 7
    invoke-virtual {p1}, Ljv/x;->g()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {p1}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcl/b;->b:Ljava/lang/Object;

    .line 9
    iput-object v2, p0, Lcl/b;->c:Lcl/a;

    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljv/x;->e()Lokhttp3/ResponseBody;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljv/x;->e()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object v1, v2

    .line 13
    :catch_1
    const-string v3, "error while parsing response"

    invoke-static {v0, v3}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 15
    :cond_2
    invoke-virtual {p1}, Ljv/x;->h()Ljava/lang/String;

    move-result-object v1

    .line 16
    :cond_3
    new-instance p1, Lcl/a;

    invoke-direct {p1, v1}, Lcl/a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcl/b;->c:Lcl/a;

    .line 17
    iput-object v2, p0, Lcl/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcl/b;->c:Lcl/a;

    if-eqz v0, :cond_0

    iget v0, v0, Lcl/a;->a:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lcl/b;->a:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
