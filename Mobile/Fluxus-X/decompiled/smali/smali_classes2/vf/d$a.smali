.class public Lvf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf/d;->h()Ltf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvf/d;


# direct methods
.method public constructor <init>(Lvf/d;)V
    .locals 0

    iput-object p1, p0, Lvf/d$a;->a:Lvf/d;

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

    new-instance v0, Lvf/e;

    iget-object v1, p0, Lvf/d$a;->a:Lvf/d;

    invoke-static {v1}, Lvf/d;->d(Lvf/d;)Ljava/util/Map;

    move-result-object v2

    iget-object v1, p0, Lvf/d$a;->a:Lvf/d;

    invoke-static {v1}, Lvf/d;->e(Lvf/d;)Ljava/util/Map;

    move-result-object v3

    iget-object v1, p0, Lvf/d$a;->a:Lvf/d;

    invoke-static {v1}, Lvf/d;->f(Lvf/d;)Ltf/e;

    move-result-object v4

    iget-object v1, p0, Lvf/d$a;->a:Lvf/d;

    invoke-static {v1}, Lvf/d;->g(Lvf/d;)Z

    move-result v5

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lvf/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Ltf/e;Z)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lvf/e;->c(Ljava/lang/Object;Z)Lvf/e;

    invoke-virtual {v0}, Lvf/e;->k()V

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
    invoke-virtual {p0, p1, v0}, Lvf/d$a;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
