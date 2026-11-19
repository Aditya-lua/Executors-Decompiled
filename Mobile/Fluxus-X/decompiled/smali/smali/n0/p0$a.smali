.class public final enum Ln0/p0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/p0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ln0/p0$a;

.field public static final enum c:Ln0/p0$a;

.field public static final enum d:Ln0/p0$a;

.field public static final enum e:Ln0/p0$a;

.field public static final enum f:Ln0/p0$a;

.field public static final enum g:Ln0/p0$a;

.field public static final enum h:Ln0/p0$a;

.field public static final enum i:Ln0/p0$a;

.field public static final synthetic j:[Ln0/p0$a;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ln0/p0$a;

    const-string v1, "RELEASED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->b:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "RELEASING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->c:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "CLOSED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->d:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "PENDING_OPEN"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->e:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "CLOSING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->f:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "OPENING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->g:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "OPEN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v3}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->h:Ln0/p0$a;

    new-instance v0, Ln0/p0$a;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v3}, Ln0/p0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ln0/p0$a;->i:Ln0/p0$a;

    invoke-static {}, Ln0/p0$a;->a()[Ln0/p0$a;

    move-result-object v0

    sput-object v0, Ln0/p0$a;->j:[Ln0/p0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Ln0/p0$a;->a:Z

    return-void
.end method

.method public static synthetic a()[Ln0/p0$a;
    .locals 8

    sget-object v0, Ln0/p0$a;->b:Ln0/p0$a;

    sget-object v1, Ln0/p0$a;->c:Ln0/p0$a;

    sget-object v2, Ln0/p0$a;->d:Ln0/p0$a;

    sget-object v3, Ln0/p0$a;->e:Ln0/p0$a;

    sget-object v4, Ln0/p0$a;->f:Ln0/p0$a;

    sget-object v5, Ln0/p0$a;->g:Ln0/p0$a;

    sget-object v6, Ln0/p0$a;->h:Ln0/p0$a;

    sget-object v7, Ln0/p0$a;->i:Ln0/p0$a;

    filled-new-array/range {v0 .. v7}, [Ln0/p0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/p0$a;
    .locals 1

    const-class v0, Ln0/p0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/p0$a;

    return-object p0
.end method

.method public static values()[Ln0/p0$a;
    .locals 1

    sget-object v0, Ln0/p0$a;->j:[Ln0/p0$a;

    invoke-virtual {v0}, [Ln0/p0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/p0$a;

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ln0/p0$a;->a:Z

    return v0
.end method
