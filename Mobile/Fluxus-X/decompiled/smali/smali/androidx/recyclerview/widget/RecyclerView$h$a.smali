.class public final enum Landroidx/recyclerview/widget/RecyclerView$h$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/recyclerview/widget/RecyclerView$h$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Landroidx/recyclerview/widget/RecyclerView$h$a;

.field public static final enum b:Landroidx/recyclerview/widget/RecyclerView$h$a;

.field public static final enum c:Landroidx/recyclerview/widget/RecyclerView$h$a;

.field public static final synthetic d:[Landroidx/recyclerview/widget/RecyclerView$h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$h$a;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->a:Landroidx/recyclerview/widget/RecyclerView$h$a;

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$h$a;

    const-string v1, "PREVENT_WHEN_EMPTY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->b:Landroidx/recyclerview/widget/RecyclerView$h$a;

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$h$a;

    const-string v1, "PREVENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->c:Landroidx/recyclerview/widget/RecyclerView$h$a;

    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView$h$a;->a()[Landroidx/recyclerview/widget/RecyclerView$h$a;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->d:[Landroidx/recyclerview/widget/RecyclerView$h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Landroidx/recyclerview/widget/RecyclerView$h$a;
    .locals 3

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->a:Landroidx/recyclerview/widget/RecyclerView$h$a;

    sget-object v1, Landroidx/recyclerview/widget/RecyclerView$h$a;->b:Landroidx/recyclerview/widget/RecyclerView$h$a;

    sget-object v2, Landroidx/recyclerview/widget/RecyclerView$h$a;->c:Landroidx/recyclerview/widget/RecyclerView$h$a;

    filled-new-array {v0, v1, v2}, [Landroidx/recyclerview/widget/RecyclerView$h$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/recyclerview/widget/RecyclerView$h$a;
    .locals 1

    const-class v0, Landroidx/recyclerview/widget/RecyclerView$h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$h$a;

    return-object p0
.end method

.method public static values()[Landroidx/recyclerview/widget/RecyclerView$h$a;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$h$a;->d:[Landroidx/recyclerview/widget/RecyclerView$h$a;

    invoke-virtual {v0}, [Landroidx/recyclerview/widget/RecyclerView$h$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/recyclerview/widget/RecyclerView$h$a;

    return-object v0
.end method
