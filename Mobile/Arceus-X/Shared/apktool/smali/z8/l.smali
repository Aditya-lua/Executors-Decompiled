.class public final Lz8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lz8/l;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lz8/l;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
