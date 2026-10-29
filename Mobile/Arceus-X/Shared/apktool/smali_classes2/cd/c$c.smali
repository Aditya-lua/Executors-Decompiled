.class public Lcd/c$c;
.super Lcd/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcd/c;
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
    invoke-direct {p0, v0}, Lcd/c$b;-><init>(Lcd/c$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcd/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcd/c$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcd/b;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .param p1    # Lcd/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcd/c$c$a;

    invoke-direct {v0, p0, p1}, Lcd/c$c$a;-><init>(Lcd/c$c;Lcd/b;)V

    return-object v0
.end method
