.class public final Lkotlin/text/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/text/f$a;,
        Lkotlin/text/f$b;,
        Lkotlin/text/f$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\r\u000f\u0011B!\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkotlin/text/f;",
        "",
        "",
        "upperCase",
        "Lkotlin/text/f$a;",
        "bytes",
        "Lkotlin/text/f$c;",
        "number",
        "<init>",
        "(ZLkotlin/text/f$a;Lkotlin/text/f$c;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Z",
        "c",
        "()Z",
        "b",
        "Lkotlin/text/f$a;",
        "()Lkotlin/text/f$a;",
        "Lkotlin/text/f$c;",
        "getNumber",
        "()Lkotlin/text/f$c;",
        "d",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lkotlin/text/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lkotlin/text/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lkotlin/text/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Lkotlin/text/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/text/f$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/text/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/text/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/text/f;->d:Lkotlin/text/f$b;

    new-instance v0, Lkotlin/text/f;

    sget-object v1, Lkotlin/text/f$a;->j:Lkotlin/text/f$a$a;

    invoke-virtual {v1}, Lkotlin/text/f$a$a;->a()Lkotlin/text/f$a;

    move-result-object v2

    sget-object v3, Lkotlin/text/f$c;->h:Lkotlin/text/f$c$a;

    invoke-virtual {v3}, Lkotlin/text/f$c$a;->a()Lkotlin/text/f$c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v0, v5, v2, v4}, Lkotlin/text/f;-><init>(ZLkotlin/text/f$a;Lkotlin/text/f$c;)V

    sput-object v0, Lkotlin/text/f;->e:Lkotlin/text/f;

    new-instance v0, Lkotlin/text/f;

    invoke-virtual {v1}, Lkotlin/text/f$a$a;->a()Lkotlin/text/f$a;

    move-result-object v1

    invoke-virtual {v3}, Lkotlin/text/f$c$a;->a()Lkotlin/text/f$c;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lkotlin/text/f;-><init>(ZLkotlin/text/f$a;Lkotlin/text/f$c;)V

    sput-object v0, Lkotlin/text/f;->f:Lkotlin/text/f;

    return-void
.end method

.method public constructor <init>(ZLkotlin/text/f$a;Lkotlin/text/f$c;)V
    .locals 1
    .param p2    # Lkotlin/text/f$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/text/f$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkotlin/text/f;->a:Z

    iput-object p2, p0, Lkotlin/text/f;->b:Lkotlin/text/f$a;

    iput-object p3, p0, Lkotlin/text/f;->c:Lkotlin/text/f$c;

    return-void
.end method

.method public static final synthetic a()Lkotlin/text/f;
    .locals 1

    sget-object v0, Lkotlin/text/f;->e:Lkotlin/text/f;

    return-object v0
.end method


# virtual methods
.method public final b()Lkotlin/text/f$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lkotlin/text/f;->b:Lkotlin/text/f$a;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/text/f;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HexFormat("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    upperCase = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lkotlin/text/f;->a:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    bytes = BytesHexFormat("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/text/f;->b:Lkotlin/text/f$a;

    const-string v3, "        "

    invoke-virtual {v2, v0, v3}, Lkotlin/text/f$a;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    ),"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    number = NumberHexFormat("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/text/f;->c:Lkotlin/text/f$c;

    invoke-virtual {v2, v0, v3}, Lkotlin/text/f$c;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    )"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
