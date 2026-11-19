.class public Lyi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyi/b;


# direct methods
.method public constructor <init>(Lyi/b;)V
    .locals 0

    iput-object p1, p0, Lyi/b$a;->a:Lyi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lyi/c;
    .locals 1

    new-instance v0, Lyi/d;

    invoke-direct {v0, p1}, Lyi/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
