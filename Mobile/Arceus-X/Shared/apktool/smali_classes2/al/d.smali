.class public Lal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public authorizeForUser:Z

.field public deviceName:Ljava/lang/String;

.field public notificationToken:Ljava/lang/String;

.field public oldNotificationToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lal/d;->notificationToken:Ljava/lang/String;

    iput-boolean p2, p0, Lal/d;->authorizeForUser:Z

    iput-object p3, p0, Lal/d;->oldNotificationToken:Ljava/lang/String;

    iput-object p4, p0, Lal/d;->deviceName:Ljava/lang/String;

    return-void
.end method
