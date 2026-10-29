.class public Ltf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf/d;->h()Lrf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ltf/d;


# direct methods
.method public constructor <init>(Ltf/d;)V
    .locals 0

    iput-object p1, p0, Ltf/d$a;->a:Ltf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/Writer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ltf/e;

    iget-object v1, p0, Ltf/d$a;->a:Ltf/d;

    invoke-static {v1}, Ltf/d;->d(Ltf/d;)Ljava/util/Map;

    move-result-object v2

    iget-object v1, p0, Ltf/d$a;->a:Ltf/d;

    invoke-static {v1}, Ltf/d;->e(Ltf/d;)Ljava/util/Map;

    move-result-object v3

    iget-object v1, p0, Ltf/d$a;->a:Ltf/d;

    invoke-static {v1}, Ltf/d;->f(Ltf/d;)Lrf/e;

    move-result-object v4

    iget-object v1, p0, Ltf/d$a;->a:Ltf/d;

    invoke-static {v1}, Ltf/d;->g(Ltf/d;)Z

    move-result v5

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ltf/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lrf/e;Z)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ltf/e;->c(Ljava/lang/Object;Z)Ltf/e;

    invoke-virtual {v0}, Ltf/e;->k()V

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Ltf/d$a;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
