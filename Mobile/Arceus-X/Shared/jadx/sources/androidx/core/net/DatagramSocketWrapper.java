package androidx.core.net;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* JADX INFO: loaded from: classes4.dex */
class DatagramSocketWrapper extends Socket {
    DatagramSocketWrapper(DatagramSocket socket, FileDescriptor fd2) {
        super(new DatagramSocketImplWrapper(socket, fd2));
    }

    private static class DatagramSocketImplWrapper extends SocketImpl {
        DatagramSocketImplWrapper(DatagramSocket socket, FileDescriptor fd2) {
            ((SocketImpl) this).localport = socket.getLocalPort();
            ((SocketImpl) this).fd = fd2;
        }

        @Override // java.net.SocketImpl
        protected void accept(SocketImpl newSocket) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected int available() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void bind(InetAddress address, int port) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void close() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(String host, int port) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(InetAddress address, int port) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void create(boolean isStreaming) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void listen(int backlog) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(SocketAddress remoteAddr, int timeout) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void sendUrgentData(int value) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public Object getOption(int optID) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int optID, Object val) {
            throw new UnsupportedOperationException();
        }
    }
}
