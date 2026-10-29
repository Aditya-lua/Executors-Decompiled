.class public final Ltd/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltd/v;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ltd/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ltd/n1;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ltd/n1;->a:Landroid/content/Context;

    return-object p0
.end method

.method public final b()Ltd/w;
    .locals 3

    iget-object v0, p0, Ltd/n1;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lee/c0;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Ltd/p1;

    iget-object v1, p0, Ltd/n1;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltd/p1;-><init>(Landroid/content/Context;Ltd/o1;)V

    return-object v0
.end method
