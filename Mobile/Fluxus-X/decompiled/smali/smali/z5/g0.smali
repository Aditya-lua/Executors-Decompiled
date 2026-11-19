.class public final synthetic Lz5/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/d$c;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/g0;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lh5/d$b;)Lh5/d;
    .locals 1

    iget-object v0, p0, Lz5/g0;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Landroidx/work/impl/WorkDatabase$a;->a(Landroid/content/Context;Lh5/d$b;)Lh5/d;

    move-result-object p1

    return-object p1
.end method
