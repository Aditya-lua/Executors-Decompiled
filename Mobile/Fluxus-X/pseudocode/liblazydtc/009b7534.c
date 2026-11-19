/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7534
 */

X509 * SSL_get_certificate(SSL *ssl)

{
  if (ssl[3].d1 == (dtls1_state_st *)0x0) {
    return (X509 *)0x0;
  }
  return (X509 *)**(undefined8 **)ssl[3].d1;
}

