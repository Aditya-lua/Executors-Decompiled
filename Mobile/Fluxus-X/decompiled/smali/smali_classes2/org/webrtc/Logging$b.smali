.class public final enum Lorg/webrtc/Logging$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/Logging;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/Logging$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lorg/webrtc/Logging$b;

.field public static final enum b:Lorg/webrtc/Logging$b;

.field public static final enum c:Lorg/webrtc/Logging$b;

.field public static final enum d:Lorg/webrtc/Logging$b;

.field public static final enum e:Lorg/webrtc/Logging$b;

.field public static final synthetic f:[Lorg/webrtc/Logging$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/webrtc/Logging$b;

    const-string v1, "LS_VERBOSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$b;->a:Lorg/webrtc/Logging$b;

    new-instance v0, Lorg/webrtc/Logging$b;

    const-string v1, "LS_INFO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$b;->b:Lorg/webrtc/Logging$b;

    new-instance v0, Lorg/webrtc/Logging$b;

    const-string v1, "LS_WARNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$b;->c:Lorg/webrtc/Logging$b;

    new-instance v0, Lorg/webrtc/Logging$b;

    const-string v1, "LS_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$b;->d:Lorg/webrtc/Logging$b;

    new-instance v0, Lorg/webrtc/Logging$b;

    const-string v1, "LS_NONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$b;->e:Lorg/webrtc/Logging$b;

    invoke-static {}, Lorg/webrtc/Logging$b;->a()[Lorg/webrtc/Logging$b;

    move-result-object v0

    sput-object v0, Lorg/webrtc/Logging$b;->f:[Lorg/webrtc/Logging$b;

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

.method public static synthetic a()[Lorg/webrtc/Logging$b;
    .locals 5

    sget-object v0, Lorg/webrtc/Logging$b;->a:Lorg/webrtc/Logging$b;

    sget-object v1, Lorg/webrtc/Logging$b;->b:Lorg/webrtc/Logging$b;

    sget-object v2, Lorg/webrtc/Logging$b;->c:Lorg/webrtc/Logging$b;

    sget-object v3, Lorg/webrtc/Logging$b;->d:Lorg/webrtc/Logging$b;

    sget-object v4, Lorg/webrtc/Logging$b;->e:Lorg/webrtc/Logging$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/webrtc/Logging$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/Logging$b;
    .locals 1

    const-class v0, Lorg/webrtc/Logging$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/Logging$b;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/Logging$b;
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->f:[Lorg/webrtc/Logging$b;

    invoke-virtual {v0}, [Lorg/webrtc/Logging$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/Logging$b;

    return-object v0
.end method
