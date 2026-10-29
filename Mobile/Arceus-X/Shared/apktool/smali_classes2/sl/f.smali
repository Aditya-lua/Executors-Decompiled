.class public final synthetic Lsl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:Lcom/roblox/universalapp/achievement/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILcom/roblox/universalapp/achievement/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/f;->a:Ljava/lang/String;

    iput p2, p0, Lsl/f;->b:I

    iput-object p3, p0, Lsl/f;->c:Lcom/roblox/universalapp/achievement/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lsl/f;->a:Ljava/lang/String;

    iget v1, p0, Lsl/f;->b:I

    iget-object v2, p0, Lsl/f;->c:Lcom/roblox/universalapp/achievement/a;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, v2, p1}, Lcom/roblox/universalapp/achievement/a;->o(Ljava/lang/String;ILcom/roblox/universalapp/achievement/a;Lf5/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
