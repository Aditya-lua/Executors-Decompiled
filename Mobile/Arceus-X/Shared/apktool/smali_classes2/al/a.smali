.class public Lal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public notificationId:Ljava/lang/String;

.field public platformType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lal/a;->platformType:Ljava/lang/String;

    iput-object p2, p0, Lal/a;->notificationId:Ljava/lang/String;

    return-void
.end method
