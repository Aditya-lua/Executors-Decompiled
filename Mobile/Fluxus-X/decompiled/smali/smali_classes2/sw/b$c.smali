.class public final Lsw/b$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/i0;",
        "Lmv/i0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lsw/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsw/b$c;

    invoke-direct {v0}, Lsw/b$c;-><init>()V

    sput-object v0, Lsw/b$c;->a:Lsw/b$c;

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

    invoke-virtual {p0, p1}, Lsw/b$c;->b(Lmv/i0;)Lmv/i0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/i0;)Lmv/i0;
    .locals 0

    return-object p1
.end method
