.class public final synthetic Lg7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg7/h0$a;


# instance fields
.field public final synthetic a:Lg7/h0;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lg7/h0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/w;->a:Lg7/h0;

    iput p2, p0, Lg7/w;->b:I

    iput p3, p0, Lg7/w;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lg7/i;)V
    .locals 3

    iget-object v0, p0, Lg7/w;->a:Lg7/h0;

    iget v1, p0, Lg7/w;->b:I

    iget v2, p0, Lg7/w;->c:I

    invoke-static {v0, v1, v2, p1}, Lg7/h0;->i(Lg7/h0;IILg7/i;)V

    return-void
.end method
