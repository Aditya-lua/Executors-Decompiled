.class public final synthetic Lf4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf4/v;


# direct methods
.method public synthetic constructor <init>(Lf4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/s;->a:Lf4/v;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf4/s;->a:Lf4/v;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-static {v0, p1}, Lf4/v;->h1(Lf4/v;Landroid/content/res/Configuration;)V

    return-void
.end method
