.class public final enum Llg/y$a;
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

    invoke-virtual {p0, p1}, Llg/y$a;->c(Ltg/a;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public c(Ltg/a;)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p1}, Ltg/a;->y()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
