.class public abstract Lvs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvs/b$a;
    }
.end annotation


# static fields
.field public static final a:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Lvs/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lus/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lus/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "list-item-type"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->a:Lus/p;

    const-string v0, "bullet-list-item-level"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->b:Lus/p;

    const-string v0, "ordered-list-item-number"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->c:Lus/p;

    const-string v0, "heading-level"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->d:Lus/p;

    const-string v0, "link-destination"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->e:Lus/p;

    const-string v0, "paragraph-is-in-tight-list"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->f:Lus/p;

    const-string v0, "code-block-info"

    invoke-static {v0}, Lus/p;->b(Ljava/lang/String;)Lus/p;

    move-result-object v0

    sput-object v0, Lvs/b;->g:Lus/p;

    return-void
.end method
