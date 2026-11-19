.class public Luk/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/input/InputManager$InputDeviceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk/f;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luk/f;


# direct methods
.method public constructor <init>(Luk/f;)V
    .locals 0

    iput-object p1, p0, Luk/f$b;->a:Luk/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInputDeviceAdded(I)V
    .locals 1

    iget-object v0, p0, Luk/f$b;->a:Luk/f;

    invoke-static {v0, p1}, Luk/f;->i(Luk/f;I)V

    return-void
.end method

.method public onInputDeviceChanged(I)V
    .locals 1

    iget-object v0, p0, Luk/f$b;->a:Luk/f;

    invoke-static {v0, p1}, Luk/f;->j(Luk/f;I)V

    return-void
.end method

.method public onInputDeviceRemoved(I)V
    .locals 1

    iget-object v0, p0, Luk/f$b;->a:Luk/f;

    invoke-static {v0, p1}, Luk/f;->k(Luk/f;I)V

    return-void
.end method
