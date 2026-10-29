.class public final Lqe/v;
.super Lqe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/v$b;
    }
.end annotation


# instance fields
.field public final a:Lqe/z;

.field public final b:Lef/c;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lqe/z;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqe/b;-><init>()V

    .line 3
    iput-object p1, p0, Lqe/v;->a:Lqe/z;

    .line 4
    iput-object p2, p0, Lqe/v;->b:Lef/c;

    .line 5
    iput-object p3, p0, Lqe/v;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lqe/v;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lqe/z;Lef/c;Lef/a;Ljava/lang/Integer;Lqe/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lqe/v;-><init>(Lqe/z;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lqe/v$b;
    .locals 2

    new-instance v0, Lqe/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/v$b;-><init>(Lqe/v$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqe/v;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lqe/v;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/a;
    .locals 1

    iget-object v0, p0, Lqe/v;->c:Lef/a;

    return-object v0
.end method

.method public e()Lqe/z;
    .locals 1

    iget-object v0, p0, Lqe/v;->a:Lqe/z;

    return-object v0
.end method
