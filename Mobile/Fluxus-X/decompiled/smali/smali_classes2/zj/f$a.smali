.class public Lzj/f$a;
.super Le/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzj/f;->f(Lf4/v;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic X:Lf4/v;


# direct methods
.method public constructor <init>(ZLf4/v;)V
    .locals 0

    iput-object p2, p0, Lzj/f$a;->X:Lf4/v;

    invoke-direct {p0, p1}, Le/m0;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 2

    const-string v0, "QrCodeScanner"

    const-string v1, "handleOnBackPressed (Dispatcher): Return \'Cancel\' using an empty Url."

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lzj/f$a;->X:Lf4/v;

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->a1()V

    const-string v0, ""

    invoke-static {v0}, Lzj/f;->c(Ljava/lang/String;)V

    return-void
.end method
