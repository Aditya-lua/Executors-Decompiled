.class public final Lcom/withpersona/sdk2/inquiry/internal/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/n$b;


# instance fields
.field public final a:Lnp/e0;


# direct methods
.method public constructor <init>(Lnp/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/o;->a:Lnp/e0;

    return-void
.end method

.method public static b(Lnp/e0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/e0;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/n$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/o;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/o;-><init>(Lnp/e0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;Z)Lcom/withpersona/sdk2/inquiry/internal/n;
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/o;->a:Lnp/e0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lnp/e0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnp/c0;Lhr/g;Z)Lcom/withpersona/sdk2/inquiry/internal/n;

    move-result-object p1

    return-object p1
.end method
