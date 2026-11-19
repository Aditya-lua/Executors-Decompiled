.class public final synthetic Lwm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b;


# instance fields
.field public final synthetic a:Lwm/f;

.field public final synthetic b:Le/p;


# direct methods
.method public synthetic constructor <init>(Lwm/f;Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm/a;->a:Lwm/f;

    iput-object p2, p0, Lwm/a;->b:Le/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lwm/a;->a:Lwm/f;

    iget-object v1, p0, Lwm/a;->b:Le/p;

    check-cast p1, Lg/a;

    invoke-static {v0, v1, p1}, Lwm/f;->e(Lwm/f;Le/p;Lg/a;)V

    return-void
.end method
