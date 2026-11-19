.class public final synthetic Lg7/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg7/h0$a;


# instance fields
.field public final synthetic a:Lg7/h0;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lg7/h0;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/e0;->a:Lg7/h0;

    iput p2, p0, Lg7/e0;->b:F

    return-void
.end method


# virtual methods
.method public final a(Lg7/i;)V
    .locals 2

    iget-object v0, p0, Lg7/e0;->a:Lg7/h0;

    iget v1, p0, Lg7/e0;->b:F

    invoke-static {v0, v1, p1}, Lg7/h0;->j(Lg7/h0;FLg7/i;)V

    return-void
.end method
