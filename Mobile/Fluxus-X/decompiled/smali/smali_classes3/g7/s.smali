.class public final synthetic Lg7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg7/h0$a;


# instance fields
.field public final synthetic a:Lg7/h0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lg7/h0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/s;->a:Lg7/h0;

    iput p2, p0, Lg7/s;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lg7/i;)V
    .locals 2

    iget-object v0, p0, Lg7/s;->a:Lg7/h0;

    iget v1, p0, Lg7/s;->b:I

    invoke-static {v0, v1, p1}, Lg7/h0;->p(Lg7/h0;ILg7/i;)V

    return-void
.end method
