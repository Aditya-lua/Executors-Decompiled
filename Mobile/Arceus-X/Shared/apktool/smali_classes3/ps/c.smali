.class public final Lps/c;
.super Lps/k;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lps/c;",
        "Lps/k;",
        "Lps/j;",
        "replaceData",
        "",
        "times",
        "<init>",
        "(Lps/j;I)V",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lps/j;",
        "a",
        "()Lps/j;",
        "c",
        "I",
        "getTimes",
        "()I",
        "operations-stdlib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lps/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:I


# direct methods
.method public constructor <init>(Lps/j;I)V
    .locals 1
    .param p1    # Lps/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "replaceData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lps/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lps/c;->b:Lps/j;

    iput p2, p0, Lps/c;->c:I

    return-void
.end method


# virtual methods
.method public a()Lps/j;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lps/c;->b:Lps/j;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lps/c;->a()Lps/j;

    move-result-object v0

    invoke-virtual {v0}, Lps/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lps/c;->a()Lps/j;

    move-result-object v1

    invoke-virtual {v1}, Lps/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lps/c;->a()Lps/j;

    move-result-object v2

    invoke-virtual {v2}, Lps/j;->a()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lps/c;->c:I

    invoke-static {v0, v1, v2, v3}, Lps/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lps/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
