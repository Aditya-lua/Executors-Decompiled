.class public final enum Lx7/b$u;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "u"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx7/b$u;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lx7/b$u;

.field public static final enum b:Lx7/b$u;

.field public static final synthetic c:[Lx7/b$u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx7/b$u;

    const-string v1, "Document"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx7/b$u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx7/b$u;->a:Lx7/b$u;

    new-instance v1, Lx7/b$u;

    const-string v2, "RenderOptions"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lx7/b$u;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx7/b$u;->b:Lx7/b$u;

    filled-new-array {v0, v1}, [Lx7/b$u;

    move-result-object v0

    sput-object v0, Lx7/b$u;->c:[Lx7/b$u;

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

.method public static valueOf(Ljava/lang/String;)Lx7/b$u;
    .locals 1

    const-class v0, Lx7/b$u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx7/b$u;

    return-object p0
.end method

.method public static values()[Lx7/b$u;
    .locals 1

    sget-object v0, Lx7/b$u;->c:[Lx7/b$u;

    invoke-virtual {v0}, [Lx7/b$u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx7/b$u;

    return-object v0
.end method
