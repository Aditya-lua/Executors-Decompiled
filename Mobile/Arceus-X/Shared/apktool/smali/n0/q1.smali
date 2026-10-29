.class public Ln0/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/c0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/y;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ln0/a0;->d:Ln0/a0;

    sget-object v1, Ln0/a0;->e:Ln0/a0;

    sget-object v2, Ln0/a0;->f:Ln0/a0;

    sget-object v3, Ln0/a0;->g:Ln0/a0;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln0/q1;->a:Ljava/util/Set;

    sget-object v0, Ln0/c0;->d:Ln0/c0;

    sget-object v1, Ln0/c0;->a:Ln0/c0;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln0/q1;->b:Ljava/util/Set;

    sget-object v0, Ln0/y;->e:Ln0/y;

    sget-object v1, Ln0/y;->d:Ln0/y;

    sget-object v2, Ln0/y;->a:Ln0/y;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln0/q1;->c:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ln0/q1;->d:Ljava/util/Set;

    return-void
.end method

.method public static a(Ln0/e0;Z)Z
    .locals 6

    invoke-interface {p0}, Ln0/e0;->i()Ln0/z;

    move-result-object v0

    sget-object v1, Ln0/z;->b:Ln0/z;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    sget-object v0, Ln0/q1;->a:Ljava/util/Set;

    invoke-interface {p0}, Ln0/e0;->g()Ln0/a0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    invoke-interface {p0}, Ln0/e0;->f()Ln0/x;

    move-result-object v1

    sget-object v4, Ln0/x;->b:Ln0/x;

    if-ne v1, v4, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    if-eqz p1, :cond_5

    if-nez v1, :cond_4

    sget-object p1, Ln0/q1;->d:Ljava/util/Set;

    invoke-interface {p0}, Ln0/e0;->j()Ln0/y;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move p1, v3

    goto :goto_4

    :cond_4
    :goto_3
    move p1, v2

    goto :goto_4

    :cond_5
    if-nez v1, :cond_4

    sget-object p1, Ln0/q1;->c:Ljava/util/Set;

    invoke-interface {p0}, Ln0/e0;->j()Ln0/y;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    :goto_4
    invoke-interface {p0}, Ln0/e0;->d()Ln0/b0;

    move-result-object v1

    sget-object v4, Ln0/b0;->b:Ln0/b0;

    if-ne v1, v4, :cond_6

    goto :goto_5

    :cond_6
    sget-object v1, Ln0/q1;->b:Ljava/util/Set;

    invoke-interface {p0}, Ln0/e0;->h()Ln0/c0;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_5
    move v1, v2

    goto :goto_6

    :cond_7
    move v1, v3

    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "checkCaptureResult, AE="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ln0/e0;->j()Ln0/y;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " AF ="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ln0/e0;->g()Ln0/a0;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " AWB="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ln0/e0;->h()Ln0/c0;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v4, "ConvergenceUtils"

    invoke-static {v4, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    if-eqz v1, :cond_8

    return v2

    :cond_8
    return v3
.end method
