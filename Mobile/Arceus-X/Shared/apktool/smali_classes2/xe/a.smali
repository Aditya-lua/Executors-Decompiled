.class public final Lxe/a;
.super Lxe/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/a$b;
    }
.end annotation


# instance fields
.field public final a:Lxe/f;

.field public final b:Lef/c;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lxe/f;Lef/c;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lxe/q;-><init>()V

    .line 3
    iput-object p1, p0, Lxe/a;->a:Lxe/f;

    .line 4
    iput-object p2, p0, Lxe/a;->b:Lef/c;

    .line 5
    iput-object p3, p0, Lxe/a;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lxe/a;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lxe/f;Lef/c;Lef/a;Ljava/lang/Integer;Lxe/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lxe/a;-><init>(Lxe/f;Lef/c;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static b()Lxe/a$b;
    .locals 2

    new-instance v0, Lxe/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxe/a$b;-><init>(Lxe/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lxe/a;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lef/c;
    .locals 1

    iget-object v0, p0, Lxe/a;->b:Lef/c;

    return-object v0
.end method

.method public d()Lef/a;
    .locals 1

    iget-object v0, p0, Lxe/a;->c:Lef/a;

    return-object v0
.end method

.method public e()Lxe/f;
    .locals 1

    iget-object v0, p0, Lxe/a;->a:Lxe/f;

    return-object v0
.end method
