.class public abstract Lpt/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Llt/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llt/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Llt/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llt/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Llt/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llt/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "image-destination"

    invoke-static {v0}, Llt/p;->b(Ljava/lang/String;)Llt/p;

    move-result-object v0

    sput-object v0, Lpt/c;->a:Llt/p;

    const-string v0, "image-replacement-text-is-link"

    invoke-static {v0}, Llt/p;->b(Ljava/lang/String;)Llt/p;

    move-result-object v0

    sput-object v0, Lpt/c;->b:Llt/p;

    const-string v0, "image-size"

    invoke-static {v0}, Llt/p;->b(Ljava/lang/String;)Llt/p;

    move-result-object v0

    sput-object v0, Lpt/c;->c:Llt/p;

    return-void
.end method
