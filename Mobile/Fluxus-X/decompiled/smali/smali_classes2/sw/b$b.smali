.class public final Lsw/b$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/h<",
        "Lmv/g0;",
        "Lmv/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lsw/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsw/b$b;

    invoke-direct {v0}, Lsw/b$b;-><init>()V

    sput-object v0, Lsw/b$b;->a:Lsw/b$b;

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

    check-cast p1, Lmv/g0;

    invoke-virtual {p0, p1}, Lsw/b$b;->b(Lmv/g0;)Lmv/g0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/g0;)Lmv/g0;
    .locals 0

    return-object p1
.end method
