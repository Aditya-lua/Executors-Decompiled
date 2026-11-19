.class public Ldd/c$c;
.super Ldd/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ldd/c$b;-><init>(Ldd/c$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Ldd/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldd/c$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ldd/b;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .param p1    # Ldd/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ldd/c$c$a;

    invoke-direct {v0, p0, p1}, Ldd/c$c$a;-><init>(Ldd/c$c;Ldd/b;)V

    return-object v0
.end method
