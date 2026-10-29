.class public Lcom/roblox/client/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/a;->h2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/a$a;->a:Lcom/roblox/client/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    const-string v0, "rbx.locale"

    if-eqz p1, :cond_0

    const-string p1, "(OnAppResume) Recreating activity due to Locale change."

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/a$a;->a:Lcom/roblox/client/a;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    return-void

    :cond_0
    const-string p1, "Retrieved locale same as current locale"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
