.class public final enum Llg/y$d;
.super Llg/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Llg/y;-><init>(Ljava/lang/String;ILlg/y$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ltg/a;)Ljava/lang/Number;
    .locals 0

    invoke-virtual {p0, p1}, Llg/y$d;->c(Ltg/a;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public c(Ltg/a;)Ljava/math/BigDecimal;
    .locals 5

    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lng/c0;->b(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    new-instance v2, Llg/p;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot parse "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ltg/a;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Llg/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
