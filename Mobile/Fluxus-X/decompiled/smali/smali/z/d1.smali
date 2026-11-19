.class public final synthetic Lz/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/b;


# instance fields
.field public final synthetic a:La0/c0;


# direct methods
.method public synthetic constructor <init>(La0/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/d1;->a:La0/c0;

    return-void
.end method


# virtual methods
.method public final b(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/d1;->a:La0/c0;

    invoke-virtual {v0, p1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
