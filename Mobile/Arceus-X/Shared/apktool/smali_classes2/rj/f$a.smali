.class public Lrj/f$a;
.super Le/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrj/f;->f(Le4/q;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic X:Le4/q;


# direct methods
.method public constructor <init>(ZLe4/q;)V
    .locals 0

    iput-object p2, p0, Lrj/f$a;->X:Le4/q;

    invoke-direct {p0, p1}, Le/m0;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 2

    const-string v0, "QrCodeScanner"

    const-string v1, "handleOnBackPressed (Dispatcher): Return \'Cancel\' using an empty Url."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lrj/f$a;->X:Le4/q;

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    const-string v0, ""

    invoke-static {v0}, Lrj/f;->c(Ljava/lang/String;)V

    return-void
.end method
