.class public interface abstract annotation Luf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Luf/d;
        intEncoding = .enum Luf/d$a;->a:Luf/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luf/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Luf/d$a;
.end method

.method public abstract tag()I
.end method
