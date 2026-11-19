/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009beadc
 */

int SSL_set_session_secret_cb(SSL *s,tls_session_secret_cb_fn tls_session_secret_cb,void *arg)

{
  if (s != (SSL *)0x0) {
    *(tls_session_secret_cb_fn *)&s[4].server = tls_session_secret_cb;
    *(void **)&s[4].quiet_shutdown = arg;
  }
  return (uint)(s != (SSL *)0x0);
}

