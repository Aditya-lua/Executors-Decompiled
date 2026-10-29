.class public final enum Landroidx/lifecycle/l$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/l$a$a;,
        Landroidx/lifecycle/l$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/lifecycle/l$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/lifecycle/l$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Landroidx/lifecycle/l$b;",
        "b",
        "()Landroidx/lifecycle/l$b;",
        "targetState",
        "Companion",
        "a",
        "ON_CREATE",
        "ON_START",
        "ON_RESUME",
        "ON_PAUSE",
        "ON_STOP",
        "ON_DESTROY",
        "ON_ANY",
        "lifecycle-common"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Landroidx/lifecycle/l$a;

.field public static final Companion:Landroidx/lifecycle/l$a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum ON_ANY:Landroidx/lifecycle/l$a;

.field public static final enum ON_CREATE:Landroidx/lifecycle/l$a;

.field public static final enum ON_DESTROY:Landroidx/lifecycle/l$a;

.field public static final enum ON_PAUSE:Landroidx/lifecycle/l$a;

.field public static final enum ON_RESUME:Landroidx/lifecycle/l$a;

.field public static final enum ON_START:Landroidx/lifecycle/l$a;

.field public static final enum ON_STOP:Landroidx/lifecycle/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_CREATE:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_RESUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_RESUME:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_PAUSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_PAUSE:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_STOP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_DESTROY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    new-instance v0, Landroidx/lifecycle/l$a;

    const-string v1, "ON_ANY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/lifecycle/l$a;->ON_ANY:Landroidx/lifecycle/l$a;

    invoke-static {}, Landroidx/lifecycle/l$a;->a()[Landroidx/lifecycle/l$a;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/l$a;->$VALUES:[Landroidx/lifecycle/l$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Landroidx/lifecycle/l$a;->$ENTRIES:Lqt/a;

    new-instance v0, Landroidx/lifecycle/l$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/l$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/l$a;->Companion:Landroidx/lifecycle/l$a$a;

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

.method public static final synthetic a()[Landroidx/lifecycle/l$a;
    .locals 7

    sget-object v0, Landroidx/lifecycle/l$a;->ON_CREATE:Landroidx/lifecycle/l$a;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    sget-object v2, Landroidx/lifecycle/l$a;->ON_RESUME:Landroidx/lifecycle/l$a;

    sget-object v3, Landroidx/lifecycle/l$a;->ON_PAUSE:Landroidx/lifecycle/l$a;

    sget-object v4, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    sget-object v5, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    sget-object v6, Landroidx/lifecycle/l$a;->ON_ANY:Landroidx/lifecycle/l$a;

    filled-new-array/range {v0 .. v6}, [Landroidx/lifecycle/l$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/lifecycle/l$a;
    .locals 1

    const-class v0, Landroidx/lifecycle/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/l$a;

    return-object p0
.end method

.method public static values()[Landroidx/lifecycle/l$a;
    .locals 1

    sget-object v0, Landroidx/lifecycle/l$a;->$VALUES:[Landroidx/lifecycle/l$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/lifecycle/l$a;

    return-object v0
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/l$b;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Landroidx/lifecycle/l$a$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no target state"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget-object v0, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    return-object v0

    :pswitch_2
    sget-object v0, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    return-object v0

    :pswitch_3
    sget-object v0, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    return-object v0

    :pswitch_4
    sget-object v0, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
