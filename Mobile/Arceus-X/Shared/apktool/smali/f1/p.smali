.class public Lf1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/p$b;
    }
.end annotation


# static fields
.field public static final a:Lf1/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/e;

    sget-object v1, Lf1/x;->g:Lf1/x;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/e;-><init>(Lf1/x;I)V

    sput-object v0, Lf1/p;->a:Lf1/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf1/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf1/p;-><init>()V

    return-void
.end method

.method public static a(Lf1/x;)Lf1/p;
    .locals 2

    new-instance v0, Lf1/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lf1/e;-><init>(Lf1/x;I)V

    return-object v0
.end method

.method public static b(Lf1/x;)Lf1/p;
    .locals 2

    new-instance v0, Lf1/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lf1/e;-><init>(Lf1/x;I)V

    return-object v0
.end method
