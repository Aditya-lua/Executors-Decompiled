.class public Landroidx/datastore/preferences/protobuf/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/k0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/k0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/s1$b;",
            "TK;",
            "Landroidx/datastore/preferences/protobuf/s1$b;",
            "TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/datastore/preferences/protobuf/k0$a;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/datastore/preferences/protobuf/k0$a;-><init>(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/k0;->a:Landroidx/datastore/preferences/protobuf/k0$a;

    iput-object p2, p0, Landroidx/datastore/preferences/protobuf/k0;->b:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/datastore/preferences/protobuf/k0;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k0$a;->a:Landroidx/datastore/preferences/protobuf/s1$b;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Landroidx/datastore/preferences/protobuf/t;->d(Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Landroidx/datastore/preferences/protobuf/k0$a;->c:Landroidx/datastore/preferences/protobuf/s1$b;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/t;->d(Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/k0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/datastore/preferences/protobuf/s1$b;",
            "TK;",
            "Landroidx/datastore/preferences/protobuf/s1$b;",
            "TV;)",
            "Landroidx/datastore/preferences/protobuf/k0<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Landroidx/datastore/preferences/protobuf/k0;

    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k0;-><init>(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/datastore/preferences/protobuf/j;",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    iget-object v0, p1, Landroidx/datastore/preferences/protobuf/k0$a;->a:Landroidx/datastore/preferences/protobuf/s1$b;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/t;->A(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)V

    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/k0$a;->c:Landroidx/datastore/preferences/protobuf/s1$b;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/t;->A(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITK;TV;)I"
        }
    .end annotation

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k0;->a:Landroidx/datastore/preferences/protobuf/k0$a;

    invoke-static {v0, p2, p3}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Landroidx/datastore/preferences/protobuf/j;->C(I)I

    move-result p2

    add-int/2addr p1, p2

    return p1
.end method

.method public c()Landroidx/datastore/preferences/protobuf/k0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k0;->a:Landroidx/datastore/preferences/protobuf/k0$a;

    return-object v0
.end method
