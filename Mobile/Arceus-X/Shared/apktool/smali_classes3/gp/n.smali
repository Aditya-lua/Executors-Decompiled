.class public final Lgp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/n;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Lgp/n;
    .locals 1

    new-instance v0, Lgp/n;

    invoke-direct {v0, p0}, Lgp/n;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->i()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lgp/n;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    invoke-static {v0}, Lgp/n;->c(Lcom/withpersona/sdk2/inquiry/internal/network/f;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/n;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
