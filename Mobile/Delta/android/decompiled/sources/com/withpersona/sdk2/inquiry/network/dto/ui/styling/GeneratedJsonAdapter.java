package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles_StepBackgroundColorStyleJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles_StepBackgroundColorStyleJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "nullableSimpleElementColorAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "nullableComplexElementColorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<StepStyles.StepBackgroundColorStyle> {

    @Nullable
    private volatile Constructor<StepStyles.StepBackgroundColorStyle> constructorRef;

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("base", "modal", "option", "staticCaptureTips");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<StyleElements.SimpleElementColor> hVarF = moshi.f(StyleElements.SimpleElementColor.class, q0.d(), "base");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.nullableSimpleElementColorAdapter = hVarF;
        h<StyleElements.ComplexElementColor> hVarF2 = moshi.f(StyleElements.ComplexElementColor.class, q0.d(), "option");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.nullableComplexElementColorAdapter = hVarF2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StepStyles.StepBackgroundColorStyle");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public StepStyles.StepBackgroundColorStyle fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        StyleElements.SimpleElementColor simpleElementColorFromJson = null;
        StyleElements.SimpleElementColor simpleElementColorFromJson2 = null;
        StyleElements.ComplexElementColor complexElementColorFromJson = null;
        StyleElements.SimpleElementColor simpleElementColorFromJson3 = null;
        int i10 = -1;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                simpleElementColorFromJson = this.nullableSimpleElementColorAdapter.fromJson(reader);
            } else if (iF == 1) {
                simpleElementColorFromJson2 = this.nullableSimpleElementColorAdapter.fromJson(reader);
                i10 = -3;
            } else if (iF == 2) {
                complexElementColorFromJson = this.nullableComplexElementColorAdapter.fromJson(reader);
            } else if (iF == 3) {
                simpleElementColorFromJson3 = this.nullableSimpleElementColorAdapter.fromJson(reader);
            }
        }
        reader.d();
        if (i10 == -3) {
            return new StepStyles.StepBackgroundColorStyle(simpleElementColorFromJson, simpleElementColorFromJson2, complexElementColorFromJson, simpleElementColorFromJson3);
        }
        Constructor<StepStyles.StepBackgroundColorStyle> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = StepStyles.StepBackgroundColorStyle.class.getDeclaredConstructor(StyleElements.SimpleElementColor.class, StyleElements.SimpleElementColor.class, StyleElements.ComplexElementColor.class, StyleElements.SimpleElementColor.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyleNewInstance = declaredConstructor.newInstance(simpleElementColorFromJson, simpleElementColorFromJson2, complexElementColorFromJson, simpleElementColorFromJson3, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(stepBackgroundColorStyleNewInstance, "newInstance(...)");
        return stepBackgroundColorStyleNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable StepStyles.StepBackgroundColorStyle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("base");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getBase());
        writer.n("modal");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getModal());
        writer.n("option");
        this.nullableComplexElementColorAdapter.toJson(writer, value_.getOption());
        writer.n("staticCaptureTips");
        this.nullableSimpleElementColorAdapter.toJson(writer, value_.getStaticCaptureTips());
        writer.g();
    }
}
