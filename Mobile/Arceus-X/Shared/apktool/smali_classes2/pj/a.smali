.class public final enum Lpj/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpj/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B#\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\n\u001a\u0004\u0008\u0011\u0010\u000cj\u0002\u0008\u000bj\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpj/a;",
        "",
        "",
        "nameId",
        "",
        "id",
        "importance",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;I)V",
        "a",
        "I",
        "d",
        "()I",
        "b",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "c",
        "e",
        "f",
        "g",
        "h",
        "NativeShell_googleProdRelease"
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
.field public static final enum d:Lpj/a;

.field public static final enum e:Lpj/a;

.field public static final enum f:Lpj/a;

.field public static final enum g:Lpj/a;

.field public static final enum h:Lpj/a;

.field public static final synthetic i:[Lpj/a;

.field public static final synthetic j:Lqt/a;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lpj/a;

    sget v3, Lsg/q0;->k1:I

    const-string v4, "channel_urgent"

    const/4 v5, 0x4

    const-string v1, "URGENT"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lpj/a;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    sput-object v0, Lpj/a;->d:Lpj/a;

    new-instance v1, Lpj/a;

    sget v4, Lsg/q0;->d1:I

    const-string v5, "channel_default"

    const/4 v6, 0x3

    const-string v2, "DEFAULT"

    const/4 v3, 0x1

    invoke-direct/range {v1 .. v6}, Lpj/a;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    sput-object v1, Lpj/a;->e:Lpj/a;

    new-instance v2, Lpj/a;

    sget v5, Lsg/q0;->g1:I

    const-string v6, "channel_medium"

    const/4 v7, 0x2

    const-string v3, "LOW"

    const/4 v4, 0x2

    invoke-direct/range {v2 .. v7}, Lpj/a;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    sput-object v2, Lpj/a;->f:Lpj/a;

    new-instance v3, Lpj/a;

    sget v6, Lsg/q0;->h1:I

    const-string v7, "channel_minimum"

    const/4 v8, 0x1

    const-string v4, "MINIMUM"

    const/4 v5, 0x3

    invoke-direct/range {v3 .. v8}, Lpj/a;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    sput-object v3, Lpj/a;->g:Lpj/a;

    new-instance v4, Lpj/a;

    sget v7, Lsg/q0;->f1:I

    const-string v8, "channel_general"

    const/4 v9, 0x3

    const-string v5, "GENERAL"

    const/4 v6, 0x4

    invoke-direct/range {v4 .. v9}, Lpj/a;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    sput-object v4, Lpj/a;->h:Lpj/a;

    invoke-static {}, Lpj/a;->a()[Lpj/a;

    move-result-object v0

    sput-object v0, Lpj/a;->i:[Lpj/a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lpj/a;->j:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpj/a;->a:I

    iput-object p4, p0, Lpj/a;->b:Ljava/lang/String;

    iput p5, p0, Lpj/a;->c:I

    return-void
.end method

.method public static final synthetic a()[Lpj/a;
    .locals 5

    sget-object v0, Lpj/a;->d:Lpj/a;

    sget-object v1, Lpj/a;->e:Lpj/a;

    sget-object v2, Lpj/a;->f:Lpj/a;

    sget-object v3, Lpj/a;->g:Lpj/a;

    sget-object v4, Lpj/a;->h:Lpj/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lpj/a;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lpj/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lpj/a;->j:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpj/a;
    .locals 1

    const-class v0, Lpj/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpj/a;

    return-object p0
.end method

.method public static values()[Lpj/a;
    .locals 1

    sget-object v0, Lpj/a;->i:[Lpj/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpj/a;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Lpj/a;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lpj/a;->a:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ljava/lang/String;

    return-object v0
.end method
