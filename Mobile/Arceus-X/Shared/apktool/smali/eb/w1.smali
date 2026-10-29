.class public final Leb/w1;
.super Leb/s1;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Leb/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/w1;

    invoke-direct {v0}, Leb/w1;-><init>()V

    sput-object v0, Leb/w1;->a:Leb/w1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/s1;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Leb/s1;
    .locals 1

    sget-object v0, Leb/q1;->a:Leb/q1;

    return-object v0
.end method

.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural().reverse()"

    return-object v0
.end method
