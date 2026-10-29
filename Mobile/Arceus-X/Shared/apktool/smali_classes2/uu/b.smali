.class public final synthetic Luu/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# instance fields
.field public final synthetic a:Luu/f;


# direct methods
.method public synthetic constructor <init>(Luu/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luu/b;->a:Luu/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luu/b;->a:Luu/f;

    check-cast p1, Ltu/l;

    invoke-static {v0, p1, p2, p3}, Luu/f;->x(Luu/f;Ltu/l;Ljava/lang/Object;Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
