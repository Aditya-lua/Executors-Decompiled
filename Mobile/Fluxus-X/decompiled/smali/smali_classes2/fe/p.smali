.class public final synthetic Lfe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe/r;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lfe/p;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lce/e;)Lce/e;
    .locals 9

    iget v2, p0, Lfe/p;->a:I

    sget v0, Lfe/a;->q:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lce/e;->h()I

    move-result v0

    invoke-virtual {p1}, Lce/e;->a()J

    move-result-wide v3

    invoke-virtual {p1}, Lce/e;->j()J

    move-result-wide v5

    invoke-virtual {p1}, Lce/e;->f()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Lce/e;->e()Ljava/util/List;

    move-result-object v8

    const/4 v1, 0x6

    invoke-static/range {v0 .. v8}, Lce/e;->b(IIIJJLjava/util/List;Ljava/util/List;)Lce/e;

    move-result-object p1

    return-object p1
.end method
