.class public final Lf8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/b$a;
    }
.end annotation


# static fields
.field public static final b:Lf8/b;


# instance fields
.field public final a:Lf8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/b$a;

    invoke-direct {v0}, Lf8/b$a;-><init>()V

    invoke-virtual {v0}, Lf8/b$a;->a()Lf8/b;

    move-result-object v0

    sput-object v0, Lf8/b;->b:Lf8/b;

    return-void
.end method

.method public constructor <init>(Lf8/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/b;->a:Lf8/e;

    return-void
.end method

.method public static b()Lf8/b$a;
    .locals 1

    new-instance v0, Lf8/b$a;

    invoke-direct {v0}, Lf8/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lf8/e;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lf8/b;->a:Lf8/e;

    return-object v0
.end method
