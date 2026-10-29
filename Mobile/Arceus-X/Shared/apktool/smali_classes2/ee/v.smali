.class public final Lee/v;
.super Lee/t;
.source "SourceFile"


# static fields
.field public static final e:[Ljava/lang/Object;

.field public static final f:Lee/v;


# instance fields
.field public final transient c:[Ljava/lang/Object;

.field public final transient d:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v2, v0, [Ljava/lang/Object;

    sput-object v2, Lee/v;->e:[Ljava/lang/Object;

    new-instance v1, Lee/v;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    invoke-direct/range {v1 .. v6}, Lee/v;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v1, Lee/v;->f:Lee/v;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lee/t;-><init>()V

    iput-object p1, p0, Lee/v;->c:[Ljava/lang/Object;

    iput-object p3, p0, Lee/v;->d:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Lee/v;->c:[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, v0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v0
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lee/v;->d:[Ljava/lang/Object;

    array-length p1, p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lee/v;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final f()Lee/s;
    .locals 1

    sget-object v0, Lee/s;->b:Lee/x;

    sget-object v0, Lee/u;->d:Lee/s;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lee/t;->e()Lee/s;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lee/s;->f(I)Lee/x;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
