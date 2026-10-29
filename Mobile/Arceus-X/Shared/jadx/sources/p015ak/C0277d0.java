package p015ak;

import android.os.SystemClock;
import android.util.Pair;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: ak.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C0277d0 extends EventListener {

    /* JADX INFO: renamed from: b */
    public ConcurrentLinkedQueue<Pair<String, Long>> f744b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    public void m1232a() {
        this.f744b.add(new Pair<>("cacheConditionalHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: b */
    public void m1233b() {
        this.f744b.add(new Pair<>("cacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: c */
    public void m1234c() {
        this.f744b.add(new Pair<>("cacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        this.f744b.add(new Pair<>("callEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        this.f744b.add(new Pair<>("callStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        this.f744b.add(new Pair<>("connectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f744b.add(new Pair<>("connectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        this.f744b.add(new Pair<>("connectionAcquired", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        this.f744b.add(new Pair<>("connectionReleased", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: d */
    public void m1235d() {
        this.f744b.add(new Pair<>("cdnAkamaiResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        this.f744b.add(new Pair<>("dnsEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        this.f744b.add(new Pair<>("dnsStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: e */
    public void m1236e() {
        this.f744b.add(new Pair<>("cdnCacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: f */
    public void m1237f() {
        this.f744b.add(new Pair<>("cdnCacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: g */
    public void m1238g() {
        this.f744b.add(new Pair<>("cdnCacheRefreshHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: h */
    public void m1239h() {
        this.f744b.add(new Pair<>("cdnCloudFrontResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: i */
    public void m1240i() {
        this.f744b.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m1241j() {
        Iterator<Pair<String, Long>> it = this.f744b.iterator();
        while (it.hasNext()) {
            mo1242k(it.next());
        }
        m1240i();
    }

    /* JADX INFO: renamed from: k */
    public void mo1242k(Pair<String, Long> pair) {
        LoggingProtocol.m15999l((String) pair.first, (Long) pair.second);
    }

    /* JADX INFO: renamed from: l */
    public void m1243l() {
        this.f744b.add(new Pair<>("responseBodyDictCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: m */
    public void m1244m() {
        this.f744b.add(new Pair<>("responseBodyZstdCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: n */
    public void m1245n() {
        this.f744b.add(new Pair<>("tlsPreWarmWaitBegin", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    /* JADX INFO: renamed from: o */
    public void m1246o() {
        this.f744b.add(new Pair<>("tlsPreWarmWaitEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        this.f744b.add(new Pair<>("requestBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        this.f744b.add(new Pair<>("requestBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        this.f744b.add(new Pair<>("requestHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        this.f744b.add(new Pair<>("requestHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        this.f744b.add(new Pair<>("responseBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        this.f744b.add(new Pair<>("responseBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        this.f744b.add(new Pair<>("responseHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        this.f744b.add(new Pair<>("responseHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        this.f744b.add(new Pair<>("secureConnectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        this.f744b.add(new Pair<>("secureConnectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }
}
