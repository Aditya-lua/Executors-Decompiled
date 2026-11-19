.class public final Lse/q;
.super Lse/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/q$b;
    }
.end annotation


# instance fields
.field public final a:Lse/u;

.field public final b:Lgf/c;

.field public final c:Lgf/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lse/u;Lgf/c;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lse/b;-><init>()V

    .line 3
    iput-object p1, p0, Lse/q;->a:Lse/u;

    .line 4
    iput-object p2, p0, Lse/q;->b:Lgf/c;

    .line 5
    iput-object p3, p0, Lse/q;->c:Lgf/a;

    .line 6
    iput-object p4, p0, Lse/q;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lse/u;Lgf/c;Lgf/a;Ljava/lang/Integer;Lse/q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lse/q;-><init>(Lse/u;Lgf/c;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lse/q$b;
    .locals 2

    new-instance v0, Lse/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lse/q$b;-><init>(Lse/q$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lse/q;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/c;
    .locals 1

    iget-object v0, p0, Lse/q;->b:Lgf/c;

    return-object v0
.end method

.method public d()Lgf/a;
    .locals 1

    iget-object v0, p0, Lse/q;->c:Lgf/a;

    return-object v0
.end method

.method public e()Lse/u;
    .locals 1

    iget-object v0, p0, Lse/q;->a:Lse/u;

    return-object v0
.end method
