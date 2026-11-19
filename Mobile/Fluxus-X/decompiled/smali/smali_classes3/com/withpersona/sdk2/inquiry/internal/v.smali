.class public final Lcom/withpersona/sdk2/inquiry/internal/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/u$a;


# instance fields
.field public final a:Lnp/p0;


# direct methods
.method public constructor <init>(Lnp/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/v;->a:Lnp/p0;

    return-void
.end method

.method public static b(Lnp/p0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/p0;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/u$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/v;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/v;-><init>(Lnp/p0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/u;
    .locals 6
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/v;->a:Lnp/p0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lnp/p0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/g;)Lcom/withpersona/sdk2/inquiry/internal/u;

    move-result-object p1

    return-object p1
.end method
