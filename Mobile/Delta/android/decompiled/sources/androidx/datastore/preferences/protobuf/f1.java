package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f1 {
    int A();

    void B(List<String> list);

    void C(List<Float> list);

    boolean D();

    int E();

    void F(List<g> list);

    void G(List<Double> list);

    long H();

    String I();

    <T> void J(T t8, g1<T> g1Var, o oVar);

    <T> void K(List<T> list, g1<T> g1Var, o oVar);

    <T> T L(Class<T> cls, o oVar);

    @Deprecated
    <T> T M(Class<T> cls, o oVar);

    <K, V> void N(Map<K, V> map, k0.a<K, V> aVar, o oVar);

    <T> void O(T t8, g1<T> g1Var, o oVar);

    @Deprecated
    <T> void P(List<T> list, g1<T> g1Var, o oVar);

    int a();

    long b();

    void c(List<Integer> list);

    void d(List<Long> list);

    boolean e();

    long f();

    void g(List<Long> list);

    int h();

    void i(List<Long> list);

    void j(List<Integer> list);

    int k();

    int l();

    void m(List<Boolean> list);

    void n(List<String> list);

    g o();

    int p();

    void q(List<Long> list);

    void r(List<Integer> list);

    double readDouble();

    float readFloat();

    long s();

    void t(List<Integer> list);

    int u();

    void v(List<Long> list);

    void w(List<Integer> list);

    void x(List<Integer> list);

    long y();

    String z();
}
