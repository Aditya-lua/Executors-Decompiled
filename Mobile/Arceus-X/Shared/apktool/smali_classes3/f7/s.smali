.class public final synthetic Lf7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/h0$a;


# instance fields
.field public final synthetic a:Lf7/h0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lf7/h0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/s;->a:Lf7/h0;

    iput p2, p0, Lf7/s;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lf7/i;)V
    .locals 2

    iget-object v0, p0, Lf7/s;->a:Lf7/h0;

    iget v1, p0, Lf7/s;->b:I

    invoke-static {v0, v1, p1}, Lf7/h0;->p(Lf7/h0;ILf7/i;)V

    return-void
.end method
