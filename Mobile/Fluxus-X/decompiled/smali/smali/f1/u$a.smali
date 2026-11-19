.class public abstract Lf1/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lf1/u;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lf1/u$b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/u$b$a<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf1/u$b$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf1/u$b$a<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u$a;->a:Lf1/u$b$a;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lf1/u$b$a;->b(J)Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lf1/u$b$a;->a(J)Ljava/lang/Object;

    return-void
.end method
