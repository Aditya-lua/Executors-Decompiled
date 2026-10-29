.class public final Loo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loo/a$b;


# instance fields
.field public final a:Loo/b;


# direct methods
.method public constructor <init>(Loo/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loo/c;->a:Loo/b;

    return-void
.end method

.method public static b(Loo/b;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo/b;",
            ")",
            "Lft/i<",
            "Loo/a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Loo/c;

    invoke-direct {v0, p0}, Loo/c;-><init>(Loo/b;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;
    .locals 1

    iget-object v0, p0, Loo/c;->a:Loo/b;

    invoke-virtual {v0, p1}, Loo/b;->b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;

    move-result-object p1

    return-object p1
.end method
