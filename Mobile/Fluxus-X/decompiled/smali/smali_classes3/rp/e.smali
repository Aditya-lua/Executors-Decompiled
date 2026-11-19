.class public final Lrp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lrp/c;


# direct methods
.method public constructor <init>(Lrp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/e;->a:Lrp/c;

    return-void
.end method

.method public static a(Lrp/c;)Lrp/e;
    .locals 1

    new-instance v0, Lrp/e;

    invoke-direct {v0, p0}, Lrp/e;-><init>(Lrp/c;)V

    return-object v0
.end method

.method public static b(Lrp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 0

    invoke-virtual {p0}, Lrp/c;->b()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 1

    iget-object v0, p0, Lrp/e;->a:Lrp/c;

    invoke-static {v0}, Lrp/e;->b(Lrp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrp/e;->c()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method
