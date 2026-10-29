.class public Lmk/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/input/InputManager$InputDeviceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/f;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;)V
    .locals 0

    iput-object p1, p0, Lmk/f$b;->a:Lmk/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInputDeviceAdded(I)V
    .locals 1

    iget-object v0, p0, Lmk/f$b;->a:Lmk/f;

    invoke-static {v0, p1}, Lmk/f;->i(Lmk/f;I)V

    return-void
.end method

.method public onInputDeviceChanged(I)V
    .locals 1

    iget-object v0, p0, Lmk/f$b;->a:Lmk/f;

    invoke-static {v0, p1}, Lmk/f;->j(Lmk/f;I)V

    return-void
.end method

.method public onInputDeviceRemoved(I)V
    .locals 1

    iget-object v0, p0, Lmk/f$b;->a:Lmk/f;

    invoke-static {v0, p1}, Lmk/f;->k(Lmk/f;I)V

    return-void
.end method
