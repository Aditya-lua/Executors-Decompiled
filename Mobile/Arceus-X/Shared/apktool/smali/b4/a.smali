.class public final Lb4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/a$b;,
        Lb4/a$a;
    }
.end annotation


# instance fields
.field public final a:Lb4/a$b;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1
    .param p1    # Landroid/widget/EditText;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lb4/a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lb4/a;->c:I

    const-string v0, "editText cannot be null"

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb4/a$a;

    invoke-direct {v0, p1, p2}, Lb4/a$a;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, Lb4/a;->a:Lb4/a$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    iget-object v0, p0, Lb4/a;->a:Lb4/a$b;

    invoke-virtual {v0, p1}, Lb4/a$b;->a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1
    .param p2    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lb4/a;->a:Lb4/a$b;

    invoke-virtual {v0, p1, p2}, Lb4/a$b;->b(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lb4/a;->a:Lb4/a$b;

    invoke-virtual {v0, p1}, Lb4/a$b;->c(Z)V

    return-void
.end method
