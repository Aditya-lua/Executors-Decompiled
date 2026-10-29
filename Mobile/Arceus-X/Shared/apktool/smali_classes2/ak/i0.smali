.class public final synthetic Lak/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcm/a$b;


# instance fields
.field public final synthetic a:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/i0;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lak/i0;->a:Landroid/app/Activity;

    invoke-static {v0, p1}, Lak/k0;->a(Landroid/app/Activity;Lorg/json/JSONObject;)V

    return-void
.end method
