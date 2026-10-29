.class public Lvh/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh/e;->onAppLocaleChangeEvent(Lph/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lvh/e;


# direct methods
.method public constructor <init>(Lvh/e;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvh/e$b;->b:Lvh/e;

    iput-object p2, p0, Lvh/e$b;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const-string v0, "rbx.locale"

    const-string v1, "onAppLanguageChangeEvent(), Api call to get locale values"

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lvh/e$b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvh/e$b;->b:Lvh/e;

    invoke-static {v0}, Lvh/e;->N3(Lvh/e;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvh/e$b;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    iget-object p1, p0, Lvh/e$b;->a:Landroid/app/Activity;

    instance-of v0, p1, Lcom/roblox/client/ActivityNativeMain;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void
.end method
