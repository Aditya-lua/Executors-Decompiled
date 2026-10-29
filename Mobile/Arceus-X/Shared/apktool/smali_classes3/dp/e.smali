.class public final Ldp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldp/c;


# direct methods
.method public constructor <init>(Ldp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/e;->a:Ldp/c;

    return-void
.end method

.method public static a(Ldp/c;)Ldp/e;
    .locals 1

    new-instance v0, Ldp/e;

    invoke-direct {v0, p0}, Ldp/e;-><init>(Ldp/c;)V

    return-object v0
.end method

.method public static b(Ldp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 0

    invoke-virtual {p0}, Ldp/c;->b()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .locals 1

    iget-object v0, p0, Ldp/e;->a:Ldp/c;

    invoke-static {v0}, Ldp/e;->b(Ldp/c;)Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldp/e;->c()Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-result-object v0

    return-object v0
.end method
