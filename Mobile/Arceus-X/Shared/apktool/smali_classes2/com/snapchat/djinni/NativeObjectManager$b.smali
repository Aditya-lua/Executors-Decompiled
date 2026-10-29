.class public Lcom/snapchat/djinni/NativeObjectManager$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/snapchat/djinni/NativeObjectManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/snapchat/djinni/NativeObjectManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/snapchat/djinni/NativeObjectManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/snapchat/djinni/NativeObjectManager;-><init>(Ltm/a;)V

    sput-object v0, Lcom/snapchat/djinni/NativeObjectManager$b;->a:Lcom/snapchat/djinni/NativeObjectManager;

    return-void
.end method
