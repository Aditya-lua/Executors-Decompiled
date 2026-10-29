.class public Lz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lz1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/f<",
            "Lz1/b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lz1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/f<",
            "Lz1/b;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lz1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/f<",
            "Lz1/i;",
            ">;"
        }
    .end annotation
.end field

.field public d:[Lz1/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz1/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lz1/g;-><init>(I)V

    iput-object v0, p0, Lz1/c;->a:Lz1/f;

    new-instance v0, Lz1/g;

    invoke-direct {v0, v1}, Lz1/g;-><init>(I)V

    iput-object v0, p0, Lz1/c;->b:Lz1/f;

    new-instance v0, Lz1/g;

    invoke-direct {v0, v1}, Lz1/g;-><init>(I)V

    iput-object v0, p0, Lz1/c;->c:Lz1/f;

    const/16 v0, 0x20

    new-array v0, v0, [Lz1/i;

    iput-object v0, p0, Lz1/c;->d:[Lz1/i;

    return-void
.end method
