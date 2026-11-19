.class public final Lsw/s$o;
.super Lsw/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsw/s<",
        "Lmv/c0$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lsw/s$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsw/s$o;

    invoke-direct {v0}, Lsw/s$o;-><init>()V

    sput-object v0, Lsw/s$o;->a:Lsw/s$o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsw/s;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lsw/v;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmv/c0$c;

    invoke-virtual {p0, p1, p2}, Lsw/s$o;->d(Lsw/v;Lmv/c0$c;)V

    return-void
.end method

.method public d(Lsw/v;Lmv/c0$c;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lsw/v;->e(Lmv/c0$c;)V

    :cond_0
    return-void
.end method
