.class public final synthetic Lg6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly5/f1;

.field public final synthetic b:Ljava/util/UUID;


# direct methods
.method public synthetic constructor <init>(Ly5/f1;Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/e;->a:Ly5/f1;

    iput-object p2, p0, Lg6/e;->b:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg6/e;->a:Ly5/f1;

    iget-object v1, p0, Lg6/e;->b:Ljava/util/UUID;

    invoke-static {v0, v1}, Lg6/h;->d(Ly5/f1;Ljava/util/UUID;)V

    return-void
.end method
