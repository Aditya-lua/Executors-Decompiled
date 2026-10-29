.class public final Lie/o0;
.super Lie/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/q<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field public static final j:Lie/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/o0<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient e:Ljava/lang/Object;

.field public final transient f:[Ljava/lang/Object;

.field public final transient g:I

.field public final transient h:I

.field public final transient i:Lie/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/o0<",
            "TV;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lie/o0;

    invoke-direct {v0}, Lie/o0;-><init>()V

    sput-object v0, Lie/o0;->j:Lie/o0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lie/q;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lie/o0;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lie/o0;->f:[Ljava/lang/Object;

    .line 4
    iput v0, p0, Lie/o0;->g:I

    .line 5
    iput v0, p0, Lie/o0;->h:I

    .line 6
    iput-object p0, p0, Lie/o0;->i:Lie/o0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;ILie/o0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            "I",
            "Lie/o0<",
            "TV;TK;>;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Lie/q;-><init>()V

    .line 16
    iput-object p1, p0, Lie/o0;->e:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lie/o0;->f:[Ljava/lang/Object;

    const/4 p1, 0x1

    .line 18
    iput p1, p0, Lie/o0;->g:I

    .line 19
    iput p3, p0, Lie/o0;->h:I

    .line 20
    iput-object p4, p0, Lie/o0;->i:Lie/o0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 2

    .line 7
    invoke-direct {p0}, Lie/q;-><init>()V

    .line 8
    iput-object p1, p0, Lie/o0;->f:[Ljava/lang/Object;

    .line 9
    iput p2, p0, Lie/o0;->h:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lie/o0;->g:I

    const/4 v1, 0x2

    if-lt p2, v1, :cond_0

    .line 11
    invoke-static {p2}, Lie/w;->h(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-static {p1, p2, v1, v0}, Lie/q0;->t([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lie/o0;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 13
    invoke-static {p1, p2, v1, v0}, Lie/q0;->t([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    .line 14
    new-instance v1, Lie/o0;

    invoke-direct {v1, v0, p1, p2, p0}, Lie/o0;-><init>(Ljava/lang/Object;[Ljava/lang/Object;ILie/o0;)V

    iput-object v1, p0, Lie/o0;->i:Lie/o0;

    return-void
.end method


# virtual methods
.method public d()Lie/w;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/w<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lie/q0$a;

    iget-object v1, p0, Lie/o0;->f:[Ljava/lang/Object;

    iget v2, p0, Lie/o0;->g:I

    iget v3, p0, Lie/o0;->h:I

    invoke-direct {v0, p0, v1, v2, v3}, Lie/q0$a;-><init>(Lie/u;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public e()Lie/w;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/w<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Lie/q0$c;

    iget-object v1, p0, Lie/o0;->f:[Ljava/lang/Object;

    iget v2, p0, Lie/o0;->g:I

    iget v3, p0, Lie/o0;->h:I

    invoke-direct {v0, v1, v2, v3}, Lie/q0$c;-><init>([Ljava/lang/Object;II)V

    new-instance v1, Lie/q0$b;

    invoke-direct {v1, p0, v0}, Lie/q0$b;-><init>(Lie/u;Lie/t;)V

    return-object v1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    iget-object v0, p0, Lie/o0;->e:Ljava/lang/Object;

    iget-object v1, p0, Lie/o0;->f:[Ljava/lang/Object;

    iget v2, p0, Lie/o0;->h:I

    iget v3, p0, Lie/o0;->g:I

    invoke-static {v0, v1, v2, v3, p1}, Lie/q0;->u(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public r()Lie/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/q<",
            "TV;TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/o0;->i:Lie/o0;

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lie/o0;->h:I

    return v0
.end method
