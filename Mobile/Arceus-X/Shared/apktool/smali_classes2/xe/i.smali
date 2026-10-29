.class public final Lxe/i;
.super Lxe/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/i$b;
    }
.end annotation


# instance fields
.field public final a:Lxe/o;

.field public final b:Lef/c;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lxe/o;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lxe/q;-><init>()V

    .line 3
    iput-object p1, p0, Lxe/i;->a:Lxe/o;

    .line 4
    iput-object p2, p0, Lxe/i;->b:Lef/c;

    .line 5
    iput-object p3, p0, Lxe/i;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lxe/i;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lxe/o;Lef/c;Lef/a;Ljava/lang/Integer;Lxe/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lxe/i;-><init>(Lxe/o;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lxe/i$b;
    .locals 2

    new-instance v0, Lxe/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxe/i$b;-><init>(Lxe/i$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lxe/i;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lxe/i;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/a;
    .locals 1

    iget-object v0, p0, Lxe/i;->c:Lef/a;

    return-object v0
.end method

.method public e()Lxe/o;
    .locals 1

    iget-object v0, p0, Lxe/i;->a:Lxe/o;

    return-object v0
.end method
