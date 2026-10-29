.class public final Lqe/l;
.super Lqe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/l$b;
    }
.end annotation


# instance fields
.field public final a:Lqe/p;

.field public final b:Lef/c;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqe/p;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/b;-><init>()V

    .line 3
    iput-object p1, p0, Lqe/l;->a:Lqe/p;

    .line 4
    iput-object p2, p0, Lqe/l;->b:Lef/c;

    .line 5
    iput-object p3, p0, Lqe/l;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lqe/l;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lqe/p;Lef/c;Lef/a;Ljava/lang/Integer;Lqe/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lqe/l;-><init>(Lqe/p;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lqe/l$b;
    .locals 2

    new-instance v0, Lqe/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/l$b;-><init>(Lqe/l$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqe/l;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lqe/l;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/a;
    .locals 1

    iget-object v0, p0, Lqe/l;->c:Lef/a;

    return-object v0
.end method

.method public e()Lqe/p;
    .locals 1

    iget-object v0, p0, Lqe/l;->a:Lqe/p;

    return-object v0
.end method
