.class public final Lze/i;
.super Lze/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lze/i$b;
    }
.end annotation


# instance fields
.field public final a:Lze/o;

.field public final b:Lgf/c;

.field public final c:Lgf/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lze/o;Lgf/c;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lze/q;-><init>()V

    .line 3
    iput-object p1, p0, Lze/i;->a:Lze/o;

    .line 4
    iput-object p2, p0, Lze/i;->b:Lgf/c;

    .line 5
    iput-object p3, p0, Lze/i;->c:Lgf/a;

    .line 6
    iput-object p4, p0, Lze/i;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lze/o;Lgf/c;Lgf/a;Ljava/lang/Integer;Lze/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lze/i;-><init>(Lze/o;Lgf/c;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lze/i$b;
    .locals 2

    new-instance v0, Lze/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lze/i$b;-><init>(Lze/i$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lze/i;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/c;
    .locals 1

    iget-object v0, p0, Lze/i;->b:Lgf/c;

    return-object v0
.end method

.method public d()Lgf/a;
    .locals 1

    iget-object v0, p0, Lze/i;->c:Lgf/a;

    return-object v0
.end method

.method public e()Lze/o;
    .locals 1

    iget-object v0, p0, Lze/i;->a:Lze/o;

    return-object v0
.end method
