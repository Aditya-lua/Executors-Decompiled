.class public final Lu2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/j$b;,
        Lu2/j$a;
    }
.end annotation


# static fields
.field public static final b:Lu2/j;


# instance fields
.field public final a:Lu2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-static {v0}, Lu2/j;->a([Ljava/util/Locale;)Lu2/j;

    move-result-object v0

    sput-object v0, Lu2/j;->b:Lu2/j;

    return-void
.end method

.method public constructor <init>(Lu2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/j;->a:Lu2/k;

    return-void
.end method

.method public static varargs a([Ljava/util/Locale;)Lu2/j;
    .locals 0

    invoke-static {p0}, Lu2/j$b;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Lu2/j;->h(Landroid/os/LocaleList;)Lu2/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lu2/j;
    .locals 4

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v1, v0, [Ljava/util/Locale;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Lu2/j$a;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lu2/j;->a([Ljava/util/Locale;)Lu2/j;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {}, Lu2/j;->d()Lu2/j;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lu2/j;
    .locals 1

    sget-object v0, Lu2/j;->b:Lu2/j;

    return-object v0
.end method

.method public static h(Landroid/os/LocaleList;)Lu2/j;
    .locals 2

    new-instance v0, Lu2/j;

    new-instance v1, Lu2/l;

    invoke-direct {v1, p0}, Lu2/l;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lu2/j;-><init>(Lu2/k;)V

    return-object v0
.end method


# virtual methods
.method public c(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-interface {v0, p1}, Lu2/k;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-interface {v0}, Lu2/k;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lu2/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    check-cast p1, Lu2/j;

    iget-object p1, p1, Lu2/j;->a:Lu2/k;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-interface {v0}, Lu2/k;->size()I

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-interface {v0}, Lu2/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu2/j;->a:Lu2/k;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
