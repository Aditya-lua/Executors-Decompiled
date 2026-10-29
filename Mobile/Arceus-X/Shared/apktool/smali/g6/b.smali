.class public final synthetic Lg6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ly5/f1;

.field public final synthetic b:Ljava/util/UUID;


# direct methods
.method public synthetic constructor <init>(Ly5/f1;Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/b;->a:Ly5/f1;

    iput-object p2, p0, Lg6/b;->b:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg6/b;->a:Ly5/f1;

    iget-object v1, p0, Lg6/b;->b:Ljava/util/UUID;

    invoke-static {v0, v1}, Lg6/h;->c(Ly5/f1;Ljava/util/UUID;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
