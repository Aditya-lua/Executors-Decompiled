.class public final Lse/l;
.super Lse/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/l$b;
    }
.end annotation


# instance fields
.field public final a:Lse/p;

.field public final b:Lgf/c;

.field public final c:Lgf/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lse/p;Lgf/c;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lse/b;-><init>()V

    .line 3
    iput-object p1, p0, Lse/l;->a:Lse/p;

    .line 4
    iput-object p2, p0, Lse/l;->b:Lgf/c;

    .line 5
    iput-object p3, p0, Lse/l;->c:Lgf/a;

    .line 6
    iput-object p4, p0, Lse/l;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lse/p;Lgf/c;Lgf/a;Ljava/lang/Integer;Lse/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lse/l;-><init>(Lse/p;Lgf/c;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lse/l$b;
    .locals 2

    new-instance v0, Lse/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lse/l$b;-><init>(Lse/l$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lse/l;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/c;
    .locals 1

    iget-object v0, p0, Lse/l;->b:Lgf/c;

    return-object v0
.end method

.method public d()Lgf/a;
    .locals 1

    iget-object v0, p0, Lse/l;->c:Lgf/a;

    return-object v0
.end method

.method public e()Lse/p;
    .locals 1

    iget-object v0, p0, Lse/l;->a:Lse/p;

    return-object v0
.end method
