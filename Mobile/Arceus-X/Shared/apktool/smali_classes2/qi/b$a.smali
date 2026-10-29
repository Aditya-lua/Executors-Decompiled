.class public Lqi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lqi/b;


# direct methods
.method public constructor <init>(Lqi/b;)V
    .locals 0

    iput-object p1, p0, Lqi/b$a;->a:Lqi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lqi/c;
    .locals 1

    new-instance v0, Lqi/d;

    invoke-direct {v0, p1}, Lqi/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
