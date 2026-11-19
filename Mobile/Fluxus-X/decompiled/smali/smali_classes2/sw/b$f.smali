.class public final Lsw/b$f;
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
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/i0;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lsw/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsw/b$f;

    invoke-direct {v0}, Lsw/b$f;-><init>()V

    sput-object v0, Lsw/b$f;->a:Lsw/b$f;

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

    invoke-virtual {p0, p1}, Lsw/b$f;->b(Lmv/i0;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/i0;)Ljava/lang/Void;
    .locals 0

    invoke-virtual {p1}, Lmv/i0;->close()V

    const/4 p1, 0x0

    return-object p1
.end method
