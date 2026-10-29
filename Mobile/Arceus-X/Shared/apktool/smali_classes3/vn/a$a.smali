.class public Lvn/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvn/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lvn/a$a;->a:Ljava/util/BitSet;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/BitSet;Lvn/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lvn/a$a;-><init>(Ljava/util/BitSet;)V

    return-void
.end method

.method public static bridge synthetic a(Lvn/a$a;)Ljava/util/BitSet;
    .locals 0

    iget-object p0, p0, Lvn/a$a;->a:Ljava/util/BitSet;

    return-object p0
.end method


# virtual methods
.method public b()Lvn/a;
    .locals 2

    new-instance v0, Lvn/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvn/a;-><init>(Lvn/a$a;Lvn/b;)V

    return-object v0
.end method

.method public c(C)Lvn/a$a;
    .locals 1

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lvn/a$a;->a:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only match ASCII characters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(CC)Lvn/a$a;
    .locals 0

    :goto_0
    if-gt p1, p2, :cond_0

    invoke-virtual {p0, p1}, Lvn/a$a;->c(C)Lvn/a$a;

    add-int/lit8 p1, p1, 0x1

    int-to-char p1, p1

    goto :goto_0

    :cond_0
    return-object p0
.end method
