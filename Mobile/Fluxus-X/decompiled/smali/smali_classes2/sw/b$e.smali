.class public final Lsw/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/i0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lsw/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsw/b$e;

    invoke-direct {v0}, Lsw/b$e;-><init>()V

    sput-object v0, Lsw/b$e;->a:Lsw/b$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmv/i0;

    invoke-virtual {p0, p1}, Lsw/b$e;->b(Lmv/i0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/i0;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p1}, Lmv/i0;->close()V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
