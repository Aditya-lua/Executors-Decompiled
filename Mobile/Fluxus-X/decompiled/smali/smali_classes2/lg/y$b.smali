.class public final enum Llg/y$b;
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
.method public a(Ltg/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lng/a0;

    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lng/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
