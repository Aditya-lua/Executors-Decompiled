.class public final synthetic Lwm/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f;


# instance fields
.field public final synthetic a:Lwm/l$b;


# direct methods
.method public synthetic constructor <init>(Lwm/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm/k;->a:Lwm/l$b;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lwm/k;->a:Lwm/l$b;

    invoke-static {v0, p1}, Lwm/l;->a(Lwm/l$b;Ljava/lang/Exception;)V

    return-void
.end method
