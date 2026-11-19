/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bedb4
 */

int SSL_CTX_get_client_cert_cb(SSL *ssl,X509 **x509,EVP_PKEY **pkey)

{
  return (int)*(undefined8 *)&ssl->mac_flags;
}

