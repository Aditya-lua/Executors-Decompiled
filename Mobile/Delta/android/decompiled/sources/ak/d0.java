package ak;

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

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends EventListener {
    public ConcurrentLinkedQueue<Pair<String, Long>> b = new ConcurrentLinkedQueue<>();

    public void a() {
        this.b.add(new Pair<>("cacheConditionalHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void b() {
        this.b.add(new Pair<>("cacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void c() {
        this.b.add(new Pair<>("cacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        this.b.add(new Pair<>("callEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        this.b.add(new Pair<>("callStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        this.b.add(new Pair<>("connectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.b.add(new Pair<>("connectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        this.b.add(new Pair<>("connectionAcquired", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        this.b.add(new Pair<>("connectionReleased", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void d() {
        this.b.add(new Pair<>("cdnAkamaiResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        this.b.add(new Pair<>("dnsEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        this.b.add(new Pair<>("dnsStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void e() {
        this.b.add(new Pair<>("cdnCacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void f() {
        this.b.add(new Pair<>("cdnCacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void g() {
        this.b.add(new Pair<>("cdnCacheRefreshHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void h() {
        this.b.add(new Pair<>("cdnCloudFrontResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void i() {
        this.b.clear();
    }

    public void j() {
        Iterator<Pair<String, Long>> it = this.b.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
        i();
    }

    public void k(Pair<String, Long> pair) {
        LoggingProtocol.l((String) pair.first, (Long) pair.second);
    }

    public void l() {
        this.b.add(new Pair<>("responseBodyDictCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void m() {
        this.b.add(new Pair<>("responseBodyZstdCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void n() {
        this.b.add(new Pair<>("tlsPreWarmWaitBegin", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void o() {
        this.b.add(new Pair<>("tlsPreWarmWaitEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        this.b.add(new Pair<>("requestBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        this.b.add(new Pair<>("requestBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        this.b.add(new Pair<>("requestHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        this.b.add(new Pair<>("requestHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        this.b.add(new Pair<>("responseBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        this.b.add(new Pair<>("responseBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        this.b.add(new Pair<>("responseHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        this.b.add(new Pair<>("responseHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        this.b.add(new Pair<>("secureConnectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        this.b.add(new Pair<>("secureConnectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }
}
