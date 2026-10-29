.class public abstract Lys/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "image-destination"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lys/c;->a:Lus/p;

    const-string v0, "image-replacement-text-is-link"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lys/c;->b:Lus/p;

    const-string v0, "image-size"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lys/c;->c:Lus/p;

    return-void
.end method
