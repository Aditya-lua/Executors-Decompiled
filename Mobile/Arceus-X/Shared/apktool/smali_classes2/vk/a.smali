.class public Lvk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lvk/d;
    .locals 3

    new-instance v0, Lvk/h;

    invoke-static {}, Lvk/g;->b()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-static {}, Lxk/c;->e()Lxk/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lvk/h;-><init>(Lokhttp3/OkHttpClient;Ljv/e$a;)V

    invoke-static {}, Lvk/g;->c()Lvk/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvk/h;->i(Lvk/b;)Lvk/d;

    move-result-object v0

    return-object v0
.end method
