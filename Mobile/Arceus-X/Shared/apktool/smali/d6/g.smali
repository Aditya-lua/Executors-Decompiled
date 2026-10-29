.class public final synthetic Ld6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ld6/h;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ld6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/g;->a:Ljava/util/List;

    iput-object p2, p0, Ld6/g;->b:Ld6/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld6/g;->a:Ljava/util/List;

    iget-object v1, p0, Ld6/g;->b:Ld6/h;

    invoke-static {v0, v1}, Ld6/h;->a(Ljava/util/List;Ld6/h;)V

    return-void
.end method
