.class public final Lwe/j0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field public final b:Lef/a;

.field public final c:Laf/g0;

.field public final d:Laf/p0;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Lpe/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lef/a;Laf/g0;Laf/p0;ILjava/lang/String;Lpe/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lef/a;",
            "Laf/g0;",
            "Laf/p0;",
            "I",
            "Ljava/lang/String;",
            "Lpe/l;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/j0$c;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lwe/j0$c;->b:Lef/a;

    .line 5
    iput-object p3, p0, Lwe/j0$c;->c:Laf/g0;

    .line 6
    iput-object p4, p0, Lwe/j0$c;->d:Laf/p0;

    .line 7
    iput p5, p0, Lwe/j0$c;->e:I

    .line 8
    iput-object p6, p0, Lwe/j0$c;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lwe/j0$c;->g:Lpe/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lef/a;Laf/g0;Laf/p0;ILjava/lang/String;Lpe/l;Lwe/j0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lwe/j0$c;-><init>(Ljava/lang/Object;Lef/a;Laf/g0;Laf/p0;ILjava/lang/String;Lpe/l;)V

    return-void
.end method

.method public static synthetic a(Lwe/j0$c;)Lef/a;
    .locals 0

    invoke-virtual {p0}, Lwe/j0$c;->e()Lef/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lwe/j0$c;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwe/j0$c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lef/a;
    .locals 1

    iget-object v0, p0, Lwe/j0$c;->b:Lef/a;

    return-object v0
.end method

.method public f()Laf/p0;
    .locals 1

    iget-object v0, p0, Lwe/j0$c;->d:Laf/p0;

    return-object v0
.end method

.method public g()Laf/g0;
    .locals 1

    iget-object v0, p0, Lwe/j0$c;->c:Laf/g0;

    return-object v0
.end method
