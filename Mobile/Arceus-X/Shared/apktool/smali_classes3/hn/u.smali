.class public final synthetic Lhn/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhn/s;

.field public final synthetic b:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lhn/s;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/u;->a:Lhn/s;

    iput-object p2, p0, Lhn/u;->b:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhn/u;->a:Lhn/s;

    iget-object v1, p0, Lhn/u;->b:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lhn/s$e;->q(Lhn/s;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
