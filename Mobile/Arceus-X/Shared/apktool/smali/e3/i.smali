.class public final Le3/i;
.super Le3/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u0000 \u001f2\u00020\u0001:\u0001 B]\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011BG\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Le3/i;",
        "Le3/b;",
        "",
        "requestJson",
        "",
        "clientDataHash",
        "",
        "isAutoSelectAllowed",
        "preferImmediatelyAvailableCredentials",
        "Le3/b$b;",
        "displayInfo",
        "origin",
        "Landroid/os/Bundle;",
        "credentialData",
        "candidateQueryData",
        "isConditional",
        "<init>",
        "(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V",
        "(Ljava/lang/String;[BZLjava/lang/String;ZZ)V",
        "j",
        "Ljava/lang/String;",
        "g",
        "()Ljava/lang/String;",
        "k",
        "[B",
        "getClientDataHash",
        "()[B",
        "l",
        "Z",
        "h",
        "()Z",
        "m",
        "a",
        "credentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final m:Le3/i$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final j:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:[B
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le3/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le3/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le3/i;->m:Le3/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "requestJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Le3/i;-><init>(Ljava/lang/String;[BZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BZLjava/lang/String;ZZ)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "requestJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Le3/i;->m:Le3/i$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v2}, Le3/i$a;->b(Le3/i$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Le3/b$b;

    move-result-object v5

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object/from16 v6, p4

    move/from16 v3, p5

    move/from16 v9, p6

    .line 15
    invoke-direct/range {v0 .. v11}, Le3/i;-><init>(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;[BZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    const/4 v1, 0x0

    if-eqz p8, :cond_1

    move p3, v1

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    move p5, v1

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    move p7, v1

    :goto_0
    move p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p7, p6

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p7}, Le3/i;-><init>(Ljava/lang/String;[BZLjava/lang/String;ZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V
    .locals 10

    move/from16 v0, p9

    .line 5
    const-string v2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    const/4 v5, 0x0

    move-object v1, p0

    move v6, p3

    move v9, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    .line 6
    invoke-direct/range {v1 .. v9}, Le3/b;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLe3/b$b;Ljava/lang/String;Z)V

    .line 7
    iput-object p1, p0, Le3/i;->j:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Le3/i;->k:[B

    .line 9
    iput-boolean v0, p0, Le3/i;->l:Z

    .line 10
    sget-object p2, Lj3/d;->a:Lj3/d$a;

    invoke-virtual {p2, p1}, Lj3/d$a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    .line 11
    const-string p1, "androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST"

    const/4 p2, 0x1

    move-object/from16 v4, p8

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "requestJson must not be empty, and must be a valid JSON"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object/from16 v6, p6

    :goto_0
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_1

    .line 2
    sget-object v3, Le3/i;->m:Le3/i$a;

    invoke-virtual {v3, p1, p2}, Le3/i$a;->d(Ljava/lang/String;[B)Landroid/os/Bundle;

    move-result-object v3

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object/from16 v7, p7

    :goto_1
    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_2

    .line 3
    sget-object v3, Le3/i;->m:Le3/i$a;

    invoke-virtual {v3, p1, p2}, Le3/i$a;->c(Ljava/lang/String;[B)Landroid/os/Bundle;

    move-result-object v3

    move-object v8, v3

    goto :goto_2

    :cond_2
    move-object/from16 v8, p8

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move v9, v0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v0, p0

    goto :goto_3

    :cond_3
    move/from16 v9, p9

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 4
    :goto_3
    invoke-direct/range {v0 .. v9}, Le3/i;-><init>(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Le3/i;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Le3/i;->l:Z

    return v0
.end method
