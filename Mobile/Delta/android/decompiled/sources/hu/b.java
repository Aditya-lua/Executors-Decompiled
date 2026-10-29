package hu;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020!8&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020!8&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u000f\u001a\u0004\b%\u0010#R\u001a\u0010'\u001a\u00020!8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b'\u0010#R\u001a\u0010)\u001a\u00020!8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u000f\u001a\u0004\b)\u0010#¨\u0006+"}, d2 = {"Lhu/b;", "R", "Lhu/a;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "name", "", "getParameters", "()Ljava/util/List;", "parameters", "Lhu/m;", "getReturnType", "()Lhu/m;", "returnType", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lhu/o;", "getVisibility", "()Lhu/o;", "getVisibility$annotations", "visibility", "", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSuspend", "isSuspend$annotations", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b<R> extends a {
    R call(@NotNull Object... args);

    R callBy(@NotNull Map<Object, ? extends Object> args);

    @NotNull
    String getName();

    @NotNull
    List<Object> getParameters();

    @NotNull
    m getReturnType();

    @NotNull
    List<Object> getTypeParameters();

    @Nullable
    o getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
