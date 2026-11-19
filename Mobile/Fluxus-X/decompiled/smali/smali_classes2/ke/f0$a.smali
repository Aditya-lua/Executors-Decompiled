.class public abstract enum Lke/f0$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lje/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lke/f0$a;",
        ">;",
        "Lje/f<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lke/f0$a;

.field public static final enum b:Lke/f0$a;

.field public static final synthetic c:[Lke/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/f0$a$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/f0$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/f0$a;->a:Lke/f0$a;

    new-instance v0, Lke/f0$a$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lke/f0$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/f0$a;->b:Lke/f0$a;

    invoke-static {}, Lke/f0$a;->a()[Lke/f0$a;

    move-result-object v0

    sput-object v0, Lke/f0$a;->c:[Lke/f0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILke/e0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lke/f0$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lke/f0$a;
    .locals 2

    sget-object v0, Lke/f0$a;->a:Lke/f0$a;

    sget-object v1, Lke/f0$a;->b:Lke/f0$a;

    filled-new-array {v0, v1}, [Lke/f0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lke/f0$a;
    .locals 1

    const-class v0, Lke/f0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lke/f0$a;

    return-object p0
.end method

.method public static values()[Lke/f0$a;
    .locals 1

    sget-object v0, Lke/f0$a;->c:[Lke/f0$a;

    invoke-virtual {v0}, [Lke/f0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lke/f0$a;

    return-object v0
.end method
