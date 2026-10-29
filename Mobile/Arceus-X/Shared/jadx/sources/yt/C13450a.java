package yt;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.InterfaceC7732e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yt.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"+\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"T", "Lhu/c;", "Ljava/lang/Class;", "a", "(Lhu/c;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lhu/c;)V", "java", "", "b", "javaObjectType", "c", "(Ljava/lang/Class;)Lhu/c;", "kotlin", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13450a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Class<T> m49048a(@NotNull InterfaceC6567c<T> interfaceC6567c) {
        Intrinsics.checkNotNullParameter(interfaceC6567c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC7732e) interfaceC6567c).mo32013d();
        Intrinsics.m31981d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Class<T> m49049b(@NotNull InterfaceC6567c<T> interfaceC6567c) {
        Intrinsics.checkNotNullParameter(interfaceC6567c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC7732e) interfaceC6567c).mo32013d();
        if (!cls.isPrimitive()) {
            Intrinsics.m31981d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals(InquiryField.BooleanField.TYPE)) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals(InquiryField.FloatField.TYPE)) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        Intrinsics.m31981d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC6567c<T> m49050c(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return C7731d0.m32002b(cls);
    }
}
