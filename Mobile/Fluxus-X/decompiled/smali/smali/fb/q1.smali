.class public final Lfb/q1;
.super Lfb/s1;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Lfb/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/q1;

    invoke-direct {v0}, Lfb/q1;-><init>()V

    sput-object v0, Lfb/q1;->a:Lfb/q1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfb/s1;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lfb/s1;
    .locals 1

    sget-object v0, Lfb/w1;->a:Lfb/w1;

    return-object v0
.end method

.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural()"

    return-object v0
.end method
