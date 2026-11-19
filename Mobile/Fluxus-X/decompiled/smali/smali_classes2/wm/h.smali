.class public final synthetic Lwm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/g;


# instance fields
.field public final synthetic a:Lg/d;

.field public final synthetic b:Lwm/l$b;


# direct methods
.method public synthetic constructor <init>(Lg/d;Lwm/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm/h;->a:Lg/d;

    iput-object p2, p0, Lwm/h;->b:Lwm/l$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lwm/h;->a:Lg/d;

    iget-object v1, p0, Lwm/h;->b:Lwm/l$b;

    check-cast p1, Landroid/app/PendingIntent;

    invoke-static {v0, v1, p1}, Lwm/l;->b(Lg/d;Lwm/l$b;Landroid/app/PendingIntent;)V

    return-void
.end method
