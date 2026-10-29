.class public final synthetic Lwh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcm/a$b;


# instance fields
.field public final synthetic a:Lwh/n;


# direct methods
.method public synthetic constructor <init>(Lwh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/l;->a:Lwh/n;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lwh/l;->a:Lwh/n;

    invoke-static {v0, p1}, Lwh/n;->b(Lwh/n;Lorg/json/JSONObject;)V

    return-void
.end method
