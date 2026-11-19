.class public abstract Lfb/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(B)I
    .locals 0

    shr-int/lit8 p0, p0, 0x5

    and-int/lit8 p0, p0, 0x7

    return p0
.end method

.method public static h(J)Lfb/z3;
    .locals 1

    new-instance v0, Lfb/z3;

    invoke-direct {v0, p0, p1}, Lfb/z3;-><init>(J)V

    return-object v0
.end method

.method public static m(Ljava/lang/String;)Lfb/c4;
    .locals 1

    new-instance v0, Lfb/c4;

    invoke-direct {v0, p0}, Lfb/c4;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs o([B)Lfb/e4;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, Lfb/h4;

    invoke-direct {p0, v0}, Lfb/h4;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0, p0}, Lfb/f4;->a(Ljava/io/InputStream;Lfb/h4;)Lfb/e4;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/io/InputStream;)Lfb/e4;
    .locals 1

    new-instance v0, Lfb/h4;

    invoke-direct {v0, p0}, Lfb/h4;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0, v0}, Lfb/f4;->a(Ljava/io/InputStream;Lfb/h4;)Lfb/e4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ljava/lang/Class;)Lfb/e4;
    .locals 4

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfb/e4;

    return-object p1

    :cond_0
    new-instance v0, Lfb/d4;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " value, but got "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lfb/d4;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lfb/x3;
    .locals 1

    const-class v0, Lfb/x3;

    invoke-virtual {p0, v0}, Lfb/e4;->b(Ljava/lang/Class;)Lfb/e4;

    move-result-object v0

    check-cast v0, Lfb/x3;

    return-object v0
.end method

.method public final e()Lfb/z3;
    .locals 1

    const-class v0, Lfb/z3;

    invoke-virtual {p0, v0}, Lfb/e4;->b(Ljava/lang/Class;)Lfb/e4;

    move-result-object v0

    check-cast v0, Lfb/z3;

    return-object v0
.end method

.method public final k()Lfb/b4;
    .locals 1

    const-class v0, Lfb/b4;

    invoke-virtual {p0, v0}, Lfb/e4;->b(Ljava/lang/Class;)Lfb/e4;

    move-result-object v0

    check-cast v0, Lfb/b4;

    return-object v0
.end method

.method public abstract zza()I
.end method
