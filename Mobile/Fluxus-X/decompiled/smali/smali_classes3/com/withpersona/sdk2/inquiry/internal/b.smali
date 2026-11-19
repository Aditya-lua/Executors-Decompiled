.class public final Lcom/withpersona/sdk2/inquiry/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/a$a;


# instance fields
.field public final a:Lnp/c;


# direct methods
.method public constructor <init>(Lnp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/b;->a:Lnp/c;

    return-void
.end method

.method public static b(Lnp/c;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/c;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/b;-><init>(Lnp/c;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;
    .locals 1
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/b;->a:Lnp/c;

    invoke-virtual {v0, p1, p2}, Lnp/c;->b(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)Lcom/withpersona/sdk2/inquiry/internal/a;

    move-result-object p1

    return-object p1
.end method
