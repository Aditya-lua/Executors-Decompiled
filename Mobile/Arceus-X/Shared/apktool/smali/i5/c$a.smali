.class public final Li5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/c$a$a;,
        Li5/c$a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Li5/c$a;",
        "",
        "<init>",
        "()V",
        "Lg5/c;",
        "db",
        "",
        "sql",
        "Li5/c;",
        "a",
        "(Lg5/c;Ljava/lang/String;)Li5/c;",
        "c",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "prefix",
        "Li5/c$a$b;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$b;",
        "Li5/c$a$a;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$a;",
        "",
        "f",
        "(Ljava/lang/String;)Z",
        "s",
        "",
        "d",
        "(Ljava/lang/String;)I",
        "sqlite-framework"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg5/c;Ljava/lang/String;)Li5/c;
    .locals 3
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/text/StringsKt;->p1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Li5/c$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v0, Li5/c$c;

    invoke-direct {v0, p1, p2}, Li5/c$c;-><init>(Lg5/c;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0, v1, v0}, Li5/c$a;->e(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$b;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v0, Li5/c$e;

    invoke-direct {v0, p1, p2, v2}, Li5/c$e;-><init>(Lg5/c;Ljava/lang/String;Li5/c$a$b;)V

    return-object v0

    :cond_1
    invoke-virtual {p0, v1, v0}, Li5/c$a;->b(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$a;

    move-result-object v0

    instance-of v0, v0, Li5/c$a$a$a;

    if-eqz v0, :cond_2

    new-instance v0, Li5/c$b;

    new-instance v1, Li5/c$d;

    invoke-direct {v1, p1, p2}, Li5/c$d;-><init>(Lg5/c;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, v1}, Li5/c$b;-><init>(Lg5/c;Ljava/lang/String;Li5/c;)V

    return-object v0

    :cond_2
    invoke-virtual {p0, v1}, Li5/c$a;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Li5/c$d;

    invoke-direct {v0, p1, p2}, Li5/c$d;-><init>(Lg5/c;Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v0, Li5/c$c;

    invoke-direct {v0, p1, p2}, Li5/c$c;-><init>(Lg5/c;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$a;
    .locals 3

    const-string v0, "PRA"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toLowerCase(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "journal_mode"

    const-string v1, ""

    invoke-static {p1, p2, v1}, Lkotlin/text/StringsKt;->Z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v1, 0x2

    const-string v2, "="

    invoke-static {p1, v2, p2, v1, v0}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Li5/c$a$a$a;->a:Li5/c$a$a$a;

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Li5/c$a;->d(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, 0x3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/String;)I
    .locals 11

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, -0x1

    if-gez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_9

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v4

    if-gtz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/16 v4, 0x2d

    if-ne v3, v4, :cond_4

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v2, 0x2

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/16 v6, 0xa

    const/4 v8, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, p1, 0x1

    :goto_1
    move-object p1, v5

    goto :goto_0

    :cond_4
    move-object v5, p1

    const/16 p1, 0x2f

    if-ne v3, p1, :cond_8

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x2a

    if-eq v4, v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v3, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2a

    move-object v2, v5

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v3

    move-object v5, v2

    if-gez v3, :cond_6

    return v1

    :cond_6
    add-int/lit8 v2, v3, 0x1

    if-ge v2, v0, :cond_7

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, p1, :cond_5

    :cond_7
    add-int/lit8 v2, v3, 0x2

    goto :goto_1

    :cond_8
    :goto_2
    return v2

    :cond_9
    return v1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$b;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ROL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, " TO "

    invoke-static {p2, p1, v2, v1, v3}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v3

    :cond_1
    sget-object p1, Li5/c$a$b;->b:Li5/c$a$b;

    return-object p1

    :sswitch_1
    const-string p2, "END"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :sswitch_2
    const-string p2, "COM"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Li5/c$a$b;->a:Li5/c$a$b;

    return-object p1

    :sswitch_3
    const-string v0, "BEG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    return-object v3

    :cond_3
    const-string p1, "EXCLUSIVE"

    invoke-static {p2, p1, v2, v1, v3}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Li5/c$a$b;->c:Li5/c$a$b;

    return-object p1

    :cond_4
    const-string p1, "IMMEDIATE"

    invoke-static {p2, p1, v2, v1, v3}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Li5/c$a$b;->d:Li5/c$a$b;

    return-object p1

    :cond_5
    sget-object p1, Li5/c$a$b;->e:Li5/c$a$b;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x10064 -> :sswitch_3
        0x10561 -> :sswitch_2
        0x10cbb -> :sswitch_1
        0x13daf -> :sswitch_0
    .end sparse-switch
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x1367f

    if-eq v0, v1, :cond_2

    const v1, 0x1403a

    if-eq v0, v1, :cond_1

    const v1, 0x14fc2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "WIT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_1
    const-string v0, "SEL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_2
    const-string v0, "PRA"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
