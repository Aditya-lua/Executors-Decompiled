.class public final synthetic Li8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Lj8/c;


# direct methods
.method public synthetic constructor <init>(Lj8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/h;->a:Lj8/c;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li8/h;->a:Lj8/c;

    invoke-interface {v0}, Lj8/c;->c()Le8/a;

    move-result-object v0

    return-object v0
.end method
