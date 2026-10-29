.class public final Lho/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lho/b$a;


# instance fields
.field public final a:Lho/c;


# direct methods
.method public constructor <init>(Lho/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/d;->a:Lho/c;

    return-void
.end method

.method public static a(Lho/c;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lho/c;",
            ")",
            "Lft/i<",
            "Lho/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lho/d;

    invoke-direct {v0, p0}, Lho/d;-><init>(Lho/c;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lho/b;
    .locals 1

    iget-object v0, p0, Lho/d;->a:Lho/c;

    invoke-virtual {v0, p1}, Lho/c;->b(Ljava/lang/String;)Lho/b;

    move-result-object p1

    return-object p1
.end method
