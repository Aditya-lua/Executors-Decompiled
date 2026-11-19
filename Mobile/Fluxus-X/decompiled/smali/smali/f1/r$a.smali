.class public final Lf1/r$a;
.super Lf1/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/u$a<",
        "Lf1/r;",
        "Lf1/r$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lf1/r$b$a;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    new-instance v0, Lf1/f$b;

    invoke-direct {v0}, Lf1/f$b;-><init>()V

    invoke-direct {p0, v0}, Lf1/u$a;-><init>(Lf1/u$b$a;)V

    const-string v0, "File can\'t be null."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf1/u$a;->a:Lf1/u$b$a;

    check-cast v0, Lf1/r$b$a;

    iput-object v0, p0, Lf1/r$a;->b:Lf1/r$b$a;

    invoke-virtual {v0, p1}, Lf1/r$b$a;->d(Ljava/io/File;)Lf1/r$b$a;

    return-void
.end method


# virtual methods
.method public a()Lf1/r;
    .locals 2

    new-instance v0, Lf1/r;

    iget-object v1, p0, Lf1/r$a;->b:Lf1/r$b$a;

    invoke-virtual {v1}, Lf1/r$b$a;->c()Lf1/r$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lf1/r;-><init>(Lf1/r$b;)V

    return-object v0
.end method
