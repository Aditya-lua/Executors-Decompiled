.class public final Lse/f;
.super Lse/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/f$b;
    }
.end annotation


# instance fields
.field public final a:Lse/k;

.field public final b:Lgf/c;

.field public final c:Lgf/c;

.field public final d:Lgf/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lse/k;Lgf/c;Lgf/c;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lse/b;-><init>()V

    .line 3
    iput-object p1, p0, Lse/f;->a:Lse/k;

    .line 4
    iput-object p2, p0, Lse/f;->b:Lgf/c;

    .line 5
    iput-object p3, p0, Lse/f;->c:Lgf/c;

    .line 6
    iput-object p4, p0, Lse/f;->d:Lgf/a;

    .line 7
    iput-object p5, p0, Lse/f;->e:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lse/k;Lgf/c;Lgf/c;Lgf/a;Ljava/lang/Integer;Lse/f$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lse/f;-><init>(Lse/k;Lgf/c;Lgf/c;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lse/f$b;
    .locals 2

    new-instance v0, Lse/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lse/f$b;-><init>(Lse/f$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lse/f;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/c;
    .locals 1

    iget-object v0, p0, Lse/f;->b:Lgf/c;

    return-object v0
.end method

.method public d()Lgf/c;
    .locals 1

    iget-object v0, p0, Lse/f;->c:Lgf/c;

    return-object v0
.end method

.method public e()Lgf/a;
    .locals 1

    iget-object v0, p0, Lse/f;->d:Lgf/a;

    return-object v0
.end method

.method public f()Lse/k;
    .locals 1

    iget-object v0, p0, Lse/f;->a:Lse/k;

    return-object v0
.end method
