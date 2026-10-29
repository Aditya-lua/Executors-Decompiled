.class public Ln7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lm7/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm7/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/n;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/n;->b:Lm7/o;

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/q;

    invoke-direct {p2, p1, p3, p0}, Lh7/q;-><init>(Lf7/h0;Lo7/b;Ln7/n;)V

    return-object p2
.end method

.method public b()Lm7/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm7/o<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln7/n;->b:Lm7/o;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/n;->a:Ljava/lang/String;

    return-object v0
.end method
