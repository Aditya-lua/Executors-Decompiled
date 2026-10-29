.class public Ljv/q$b$a;
.super Lxu/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljv/q$b;-><init>(Lokhttp3/ResponseBody;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljv/q$b;


# direct methods
.method public constructor <init>(Ljv/q$b;Lxu/r0;)V
    .locals 0

    iput-object p1, p0, Ljv/q$b$a;->a:Ljv/q$b;

    invoke-direct {p0, p2}, Lxu/p;-><init>(Lxu/r0;)V

    return-void
.end method


# virtual methods
.method public read(Lxu/e;J)J
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lxu/p;->read(Lxu/e;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ljv/q$b$a;->a:Ljv/q$b;

    iput-object p1, p2, Ljv/q$b;->c:Ljava/io/IOException;

    throw p1
.end method
