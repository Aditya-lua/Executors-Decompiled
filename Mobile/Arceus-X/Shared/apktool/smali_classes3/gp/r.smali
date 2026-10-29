.class public final Lgp/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/r;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lgp/r;
    .locals 1

    new-instance v0, Lgp/r;

    invoke-direct {v0, p0}, Lgp/r;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->m()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgp/r;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-static {v0}, Lgp/r;->c(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/r;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
