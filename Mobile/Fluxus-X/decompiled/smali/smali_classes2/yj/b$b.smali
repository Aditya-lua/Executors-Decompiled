.class public final Lyj/b$b;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyj/b;->b(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher"
    f = "PushNotificationImageFetcher.kt"
    l = {
        0x65
    }
    m = "load-E0qYoyE"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Lyj/b;

.field public C:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:J

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lyj/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyj/b;",
            "Leu/b<",
            "-",
            "Lyj/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyj/b$b;->B:Lyj/b;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lyj/b$b;->A:Ljava/lang/Object;

    iget p1, p0, Lyj/b$b;->C:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyj/b$b;->C:I

    iget-object v0, p0, Lyj/b$b;->B:Lyj/b;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lyj/b;->a(Lyj/b;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
