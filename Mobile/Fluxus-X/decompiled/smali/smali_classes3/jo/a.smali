.class public Ljo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljo/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljo/a$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljo/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ljo/a$a;->a(Ljo/a$a;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Ljo/a;->a:Ljava/util/BitSet;

    return-void
.end method

.method public synthetic constructor <init>(Ljo/a$a;Ljo/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljo/a;-><init>(Ljo/a$a;)V

    return-void
.end method

.method public static b()Ljo/a$a;
    .locals 3

    new-instance v0, Ljo/a$a;

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljo/a$a;-><init>(Ljava/util/BitSet;Ljo/b;)V

    return-object v0
.end method


# virtual methods
.method public a(C)Z
    .locals 1

    iget-object v0, p0, Ljo/a;->a:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method public c()Ljo/a$a;
    .locals 3

    new-instance v0, Ljo/a$a;

    iget-object v1, p0, Ljo/a;->a:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljo/a$a;-><init>(Ljava/util/BitSet;Ljo/b;)V

    return-object v0
.end method
