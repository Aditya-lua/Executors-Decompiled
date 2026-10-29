.class public Lxi/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/SearchView$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxi/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;

.field public final synthetic b:Lxi/f;


# direct methods
.method public constructor <init>(Lxi/f;Landroidx/appcompat/widget/SearchView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxi/f$b;->b:Lxi/f;

    iput-object p2, p0, Lxi/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lxi/f$b;->b:Lxi/f;

    invoke-static {v0}, Lxi/f;->c(Lxi/f;)Lxi/f$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lxi/f$e;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lxi/f$b;->b:Lxi/f;

    invoke-static {v0}, Lxi/f;->c(Lxi/f;)Lxi/f$e;

    move-result-object v0

    iget-object v1, p0, Lxi/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-interface {v0, v1, p1}, Lxi/f$e;->b(Landroidx/appcompat/widget/SearchView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
