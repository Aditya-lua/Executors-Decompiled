.class public Lie/n;
.super Lie/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lie/x<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lie/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lie/n;

    invoke-direct {v0}, Lie/n;-><init>()V

    sput-object v0, Lie/n;->e:Lie/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-static {}, Lie/u;->j()Lie/u;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lie/x;-><init>(Lie/u;ILjava/util/Comparator;)V

    return-void
.end method
