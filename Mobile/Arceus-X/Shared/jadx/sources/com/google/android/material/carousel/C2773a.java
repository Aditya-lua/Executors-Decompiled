package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p194ic.C6740d;
import p377qc.AbstractC10500f;
import p377qc.C10495a;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2773a {
    /* JADX INFO: renamed from: a */
    public static float m12307a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    /* JADX INFO: renamed from: b */
    public static float m12308b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: c */
    public static com.google.android.material.carousel.C2774b m12309c(@androidx.annotation.NonNull android.content.Context r19, float r20, float r21, @androidx.annotation.NonNull p377qc.C10495a r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            float r3 = m12312f(r19)
            float r3 = r3 + r0
            float r4 = r2.f37711f
            float r3 = java.lang.Math.min(r3, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            r6 = 0
            float r7 = r6 - r5
            float r8 = r2.f37707b
            int r9 = r2.f37708c
            float r8 = m12308b(r6, r8, r9)
            float r9 = r2.f37707b
            int r10 = r2.f37708c
            float r10 = (float) r10
            float r10 = r10 / r4
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r9 = m12307a(r8, r9, r10)
            float r10 = r2.f37707b
            int r11 = r2.f37708c
            float r6 = m12316j(r6, r9, r10, r11)
            float r9 = r2.f37710e
            int r10 = r2.f37709d
            float r9 = m12308b(r6, r9, r10)
            float r10 = r2.f37710e
            int r11 = r2.f37709d
            float r11 = (float) r11
            float r11 = r11 / r4
            double r11 = (double) r11
            double r11 = java.lang.Math.floor(r11)
            int r11 = (int) r11
            float r10 = m12307a(r9, r10, r11)
            float r11 = r2.f37710e
            int r12 = r2.f37709d
            float r6 = m12316j(r6, r10, r11, r12)
            float r10 = r2.f37711f
            int r11 = r2.f37712g
            float r13 = m12308b(r6, r10, r11)
            float r10 = r2.f37711f
            int r11 = r2.f37712g
            float r10 = m12307a(r13, r10, r11)
            float r11 = r2.f37711f
            int r12 = r2.f37712g
            float r6 = m12316j(r6, r10, r11, r12)
            float r10 = r2.f37710e
            int r11 = r2.f37709d
            float r10 = m12308b(r6, r10, r11)
            float r11 = r2.f37710e
            int r12 = r2.f37709d
            float r12 = (float) r12
            float r12 = r12 / r4
            double r14 = (double) r12
            double r14 = java.lang.Math.ceil(r14)
            int r12 = (int) r14
            float r11 = m12307a(r10, r11, r12)
            float r12 = r2.f37710e
            int r14 = r2.f37709d
            float r6 = m12316j(r6, r11, r12, r14)
            float r11 = r2.f37707b
            int r12 = r2.f37708c
            float r6 = m12308b(r6, r11, r12)
            float r5 = r5 + r1
            float r11 = r2.f37711f
            float r11 = p377qc.AbstractC10500f.m40323b(r3, r11, r0)
            float r12 = r2.f37707b
            float r14 = r2.f37711f
            float r12 = p377qc.AbstractC10500f.m40323b(r12, r14, r0)
            float r14 = r2.f37710e
            float r15 = r2.f37711f
            float r0 = p377qc.AbstractC10500f.m40323b(r14, r15, r0)
            com.google.android.material.carousel.b$b r14 = new com.google.android.material.carousel.b$b
            float r15 = r2.f37711f
            r14.<init>(r15, r1)
            com.google.android.material.carousel.b$b r1 = r14.m12332a(r7, r11, r3)
            int r7 = r2.f37708c
            if (r7 <= 0) goto Ld0
            float r14 = r2.f37707b
            float r7 = (float) r7
            float r7 = r7 / r4
            r19 = r4
            r18 = r5
            double r4 = (double) r7
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            r1.m12338g(r8, r12, r14, r4)
            goto Ld4
        Ld0:
            r19 = r4
            r18 = r5
        Ld4:
            int r4 = r2.f37709d
            if (r4 <= 0) goto Le6
            float r5 = r2.f37710e
            float r4 = (float) r4
            float r4 = r4 / r19
            double r7 = (double) r4
            double r7 = java.lang.Math.floor(r7)
            int r4 = (int) r7
            r1.m12338g(r9, r0, r5, r4)
        Le6:
            float r15 = r2.f37711f
            int r4 = r2.f37712g
            r17 = 1
            r14 = 0
            r16 = r12
            r12 = r1
            r1 = r16
            r16 = r4
            r12.m12339h(r13, r14, r15, r16, r17)
            int r4 = r2.f37709d
            if (r4 <= 0) goto L109
            float r5 = r2.f37710e
            float r4 = (float) r4
            float r4 = r4 / r19
            double r7 = (double) r4
            double r7 = java.lang.Math.ceil(r7)
            int r4 = (int) r7
            r12.m12338g(r10, r0, r5, r4)
        L109:
            int r0 = r2.f37708c
            if (r0 <= 0) goto L11b
            float r2 = r2.f37707b
            float r0 = (float) r0
            float r0 = r0 / r19
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            r12.m12338g(r6, r1, r2, r0)
        L11b:
            r0 = r18
            r12.m12332a(r0, r11, r3)
            com.google.android.material.carousel.b r0 = r12.m12340i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.C2773a.m12309c(android.content.Context, float, float, qc.a):com.google.android.material.carousel.b");
    }

    /* JADX INFO: renamed from: d */
    public static C2774b m12310d(@NonNull Context context, float f10, float f11, @NonNull C10495a c10495a, int i10) {
        return i10 == 1 ? m12309c(context, f10, f11, c10495a) : m12311e(context, f10, f11, c10495a);
    }

    /* JADX INFO: renamed from: e */
    public static C2774b m12311e(@NonNull Context context, float f10, float f11, @NonNull C10495a c10495a) {
        float fMin = Math.min(m12312f(context) + f10, c10495a.f37711f);
        float f12 = fMin / 2.0f;
        float f13 = 0.0f - f12;
        float fM12308b = m12308b(0.0f, c10495a.f37711f, c10495a.f37712g);
        float fM12316j = m12316j(0.0f, m12307a(fM12308b, c10495a.f37711f, c10495a.f37712g), c10495a.f37711f, c10495a.f37712g);
        float fM12308b2 = m12308b(fM12316j, c10495a.f37710e, c10495a.f37709d);
        float fM12308b3 = m12308b(m12316j(fM12316j, fM12308b2, c10495a.f37710e, c10495a.f37709d), c10495a.f37707b, c10495a.f37708c);
        float f14 = f12 + f11;
        float fM40323b = AbstractC10500f.m40323b(fMin, c10495a.f37711f, f10);
        float fM40323b2 = AbstractC10500f.m40323b(c10495a.f37707b, c10495a.f37711f, f10);
        float fM40323b3 = AbstractC10500f.m40323b(c10495a.f37710e, c10495a.f37711f, f10);
        C2774b.b bVarM12339h = new C2774b.b(c10495a.f37711f, f11).m12332a(f13, fM40323b, fMin).m12339h(fM12308b, 0.0f, c10495a.f37711f, c10495a.f37712g, true);
        if (c10495a.f37709d > 0) {
            bVarM12339h.m12333b(fM12308b2, fM40323b3, c10495a.f37710e);
        }
        int i10 = c10495a.f37708c;
        if (i10 > 0) {
            bVarM12339h.m12338g(fM12308b3, fM40323b2, c10495a.f37707b, i10);
        }
        bVarM12339h.m12332a(f14, fM40323b, fMin);
        return bVarM12339h.m12340i();
    }

    /* JADX INFO: renamed from: f */
    public static float m12312f(@NonNull Context context) {
        return context.getResources().getDimension(C6740d.f25982o);
    }

    /* JADX INFO: renamed from: g */
    public static float m12313g(@NonNull Context context) {
        return context.getResources().getDimension(C6740d.f25983p);
    }

    /* JADX INFO: renamed from: h */
    public static float m12314h(@NonNull Context context) {
        return context.getResources().getDimension(C6740d.f25984q);
    }

    /* JADX INFO: renamed from: i */
    public static int m12315i(int[] iArr) {
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static float m12316j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
