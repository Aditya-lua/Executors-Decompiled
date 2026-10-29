.class public Lcom/roblox/client/game/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b$d;->f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field public final synthetic b:Lcom/roblox/client/game/b$d;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b$d;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iput-object p2, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "positioning native textbox: ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v2, v2, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v3, v3, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ") align: ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v3, v3, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v2, v2, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/client/game/b;->q(Lcom/roblox/client/game/b;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->m(Lcom/roblox/client/game/b;)Lnk/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v2, v2, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    invoke-static {v2}, Lcom/roblox/client/game/b;->u(Lcom/roblox/client/game/b;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roblox/client/game/b;->r(Lcom/roblox/client/game/b;Lnk/b;F)V

    iget-object v0, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    iget-object v1, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Lcom/roblox/client/game/b;->t(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    iget-object v0, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    iget-object v1, p0, Lcom/roblox/client/game/b$d$a;->a:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Lcom/roblox/client/game/b;->s(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    iget-object v0, p0, Lcom/roblox/client/game/b$d$a;->b:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->v(Lcom/roblox/client/game/b;)Lcom/roblox/client/RbxKeyboard;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void
.end method
