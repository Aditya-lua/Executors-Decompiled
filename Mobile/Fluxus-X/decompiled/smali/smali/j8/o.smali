.class public final synthetic Lj8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lj8/r;


# direct methods
.method public synthetic constructor <init>(Lj8/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/o;->a:Lj8/r;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj8/o;->a:Lj8/r;

    invoke-static {v0}, Lj8/r;->c(Lj8/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
