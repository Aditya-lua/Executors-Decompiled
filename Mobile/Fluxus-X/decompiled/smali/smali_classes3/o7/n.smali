.class public Lo7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/n;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/n;->b:Ln7/o;

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/q;

    invoke-direct {p2, p1, p3, p0}, Li7/q;-><init>(Lg7/h0;Lp7/b;Lo7/n;)V

    return-object p2
.end method

.method public b()Ln7/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo7/n;->b:Ln7/o;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/n;->a:Ljava/lang/String;

    return-object v0
.end method
