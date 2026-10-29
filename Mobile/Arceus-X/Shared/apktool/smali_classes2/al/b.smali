.class public Lal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public category:Ljava/lang/String;

.field public latestNotificationId:Ljava/lang/String;

.field public notificationType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lal/b;->notificationType:Ljava/lang/String;

    iput-object p2, p0, Lal/b;->category:Ljava/lang/String;

    iput-object p3, p0, Lal/b;->latestNotificationId:Ljava/lang/String;

    return-void
.end method
