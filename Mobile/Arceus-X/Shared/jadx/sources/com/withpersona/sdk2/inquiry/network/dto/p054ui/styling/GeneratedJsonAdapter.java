package com.withpersona.sdk2.inquiry.network.dto.p054ui.styling;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles_StepBackgroundColorStyleJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles_StepBackgroundColorStyleJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "nullableSimpleElementColorAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "nullableComplexElementColorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<StepStyles.StepBackgroundColorStyle> {

    @Nullable
    private volatile Constructor<StepStyles.StepBackgroundColorStyle> constructorRef;

    @NotNull
    private final AbstractC11873h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final AbstractC11873h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("base", "modal", "option", "staticCaptureTips");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<StyleElements.SimpleElementColor> abstractC11873hM44439f = moshi.m44439f(StyleElements.SimpleElementColor.class, C7702q0.m31908d(), "base");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.nullableSimpleElementColorAdapter = abstractC11873hM44439f;
        AbstractC11873h<StyleElements.ComplexElementColor> abstractC11873hM44439f2 = moshi.m44439f(StyleElements.ComplexElementColor.class, C7702q0.m31908d(), "option");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.nullableComplexElementColorAdapter = abstractC11873hM44439f2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StepStyles.StepBackgroundColorStyle");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public StepStyles.StepBackgroundColorStyle fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        StyleElements.SimpleElementColor simpleElementColorFromJson = null;
        StyleElements.SimpleElementColor simpleElementColorFromJson2 = null;
        StyleElements.ComplexElementColor complexElementColorFromJson = null;
        StyleElements.SimpleElementColor simpleElementColorFromJson3 = null;
        int i10 = -1;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                simpleElementColorFromJson = this.nullableSimpleElementColorAdapter.fromJson(reader);
            } else if (iMo44316F == 1) {
                simpleElementColorFromJson2 = this.nullableSimpleElementColorAdapter.fromJson(reader);
                i10 = -3;
            } else if (iMo44316F == 2) {
                complexElementColorFromJson = this.nullableComplexElementColorAdapter.fromJson(reader);
            } else if (iMo44316F == 3) {
                simpleElementColorFromJson3 = this.nullableSimpleElementColorAdapter.fromJson(reader);
            }
        }
        reader.mo44327d();
        if (i10 == -3) {
            return new StepStyles.StepBackgroundColorStyle(simpleElementColorFromJson, simpleElementColorFromJson2, complexElementColorFromJson, simpleElementColorFromJson3);
        }
        Constructor<StepStyles.StepBackgroundColorStyle> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = StepStyles.StepBackgroundColorStyle.class.getDeclaredConstructor(StyleElements.SimpleElementColor.class, StyleElements.SimpleElementColor.class, StyleElements.ComplexElementColor.class, StyleElements.SimpleElementColor.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyleNewInstance = declaredConstructor.newInstance(simpleElementColorFromJson, simpleElementColorFromJson2, complexElementColorFromJson, simpleElementColorFromJson3, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(stepBackgroundColorStyleNewInstance, "newInstance(...)");
        return stepBackgroundColorStyleNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable StepStyles.StepBackgroundColorStyle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("base");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getBase());
        writer.mo44380n("modal");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getModal());
        writer.mo44380n("option");
        this.nullableComplexElementColorAdapter.toJson(writer, value_.getOption());
        writer.mo44380n("staticCaptureTips");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getStaticCaptureTips());
        writer.mo44378g();
    }
}
