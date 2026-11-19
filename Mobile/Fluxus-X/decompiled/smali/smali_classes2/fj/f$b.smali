.class public Lfj/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/SearchView$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;

.field public final synthetic b:Lfj/f;


# direct methods
.method public constructor <init>(Lfj/f;Landroidx/appcompat/widget/SearchView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/f$b;->b:Lfj/f;

    iput-object p2, p0, Lfj/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lfj/f$b;->b:Lfj/f;

    invoke-static {v0}, Lfj/f;->c(Lfj/f;)Lfj/f$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/f$e;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lfj/f$b;->b:Lfj/f;

    invoke-static {v0}, Lfj/f;->c(Lfj/f;)Lfj/f$e;

    move-result-object v0

    iget-object v1, p0, Lfj/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-interface {v0, v1, p1}, Lfj/f$e;->b(Landroidx/appcompat/widget/SearchView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
