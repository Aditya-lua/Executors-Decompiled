.class public final Lqe/f;
.super Lqe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/f$b;
    }
.end annotation


# instance fields
.field public final a:Lqe/k;

.field public final b:Lef/c;

.field public final c:Lef/c;

.field public final d:Lef/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqe/k;Lef/c;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/b;-><init>()V

    .line 3
    iput-object p1, p0, Lqe/f;->a:Lqe/k;

    .line 4
    iput-object p2, p0, Lqe/f;->b:Lef/c;

    .line 5
    iput-object p3, p0, Lqe/f;->c:Lef/c;

    .line 6
    iput-object p4, p0, Lqe/f;->d:Lef/a;

    .line 7
    iput-object p5, p0, Lqe/f;->e:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lqe/k;Lef/c;Lef/c;Lef/a;Ljava/lang/Integer;Lqe/f$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lqe/f;-><init>(Lqe/k;Lef/c;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lqe/f$b;
    .locals 2

    new-instance v0, Lqe/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/f$b;-><init>(Lqe/f$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqe/f;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lqe/f;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/c;
    .locals 1

    iget-object v0, p0, Lqe/f;->c:Lef/c;

    return-object v0
.end method

.method public e()Lef/a;
    .locals 1

    iget-object v0, p0, Lqe/f;->d:Lef/a;

    return-object v0
.end method

.method public f()Lqe/k;
    .locals 1

    iget-object v0, p0, Lqe/f;->a:Lqe/k;

    return-object v0
.end method
