.class public Lke/n;
.super Lke/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lke/x<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lke/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lke/n;

    invoke-direct {v0}, Lke/n;-><init>()V

    sput-object v0, Lke/n;->e:Lke/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-static {}, Lke/u;->i()Lke/u;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lke/x;-><init>(Lke/u;ILjava/util/Comparator;)V

    return-void
.end method
