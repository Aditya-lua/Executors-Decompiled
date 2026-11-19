.class public final Log/j;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Llg/b0;


# instance fields
.field public final a:Llg/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Llg/y;->b:Llg/y;

    invoke-static {v0}, Log/j;->b(Llg/z;)Llg/b0;

    move-result-object v0

    sput-object v0, Log/j;->b:Llg/b0;

    return-void
.end method

.method public constructor <init>(Llg/z;)V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    iput-object p1, p0, Log/j;->a:Llg/z;

    return-void
.end method

.method public static a(Llg/z;)Llg/b0;
    .locals 1

    sget-object v0, Llg/y;->b:Llg/y;

    if-ne p0, v0, :cond_0

    sget-object p0, Log/j;->b:Llg/b0;

    return-object p0

    :cond_0
    invoke-static {p0}, Log/j;->b(Llg/z;)Llg/b0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Llg/z;)Llg/b0;
    .locals 1

    new-instance v0, Log/j;

    invoke-direct {v0, p0}, Log/j;-><init>(Llg/z;)V

    new-instance p0, Log/j$a;

    invoke-direct {p0, v0}, Log/j$a;-><init>(Log/j;)V

    return-object p0
.end method


# virtual methods
.method public c(Ltg/a;)Ljava/lang/Number;
    .locals 4

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Log/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Llg/u;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expecting number, got: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ltg/a;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Llg/u;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Log/j;->a:Llg/z;

    invoke-interface {v0, p1}, Llg/z;->a(Ltg/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ltg/a;->K()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Ltg/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Ltg/c;->T(Ljava/lang/Number;)Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/j;->c(Ltg/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Log/j;->d(Ltg/c;Ljava/lang/Number;)V

    return-void
.end method
