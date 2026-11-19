.class public final synthetic Lc5/g$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc5/g$a;->R()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lc5/g$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc5/g$a$a;

    invoke-direct {v0}, Lc5/g$a$a;-><init>()V

    sput-object v0, Lc5/g$a$a;->b:Lc5/g$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-string v0, "getAttachedDbs()Ljava/util/List;"

    const/4 v1, 0x0

    const-class v2, Lh5/c;

    const-string v3, "attachedDbs"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh5/c;

    invoke-interface {p1}, Lh5/c;->R()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
