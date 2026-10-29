.class public final Lnp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnp/e$a;


# instance fields
.field public final a:Lnp/f;


# direct methods
.method public constructor <init>(Lnp/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/g;->a:Lnp/f;

    return-void
.end method

.method public static a(Lnp/f;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/f;",
            ")",
            "Lft/i<",
            "Lnp/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnp/g;

    invoke-direct {v0, p0}, Lnp/g;-><init>(Lnp/f;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lnp/e;
    .locals 1

    iget-object v0, p0, Lnp/g;->a:Lnp/f;

    invoke-virtual {v0, p1}, Lnp/f;->b(Ljava/lang/String;)Lnp/e;

    move-result-object p1

    return-object p1
.end method
