/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba144
 */

void SSL_CONF_CTX_new(void)

{
  CRYPTO_zalloc(0xb0,"ssl/ssl_conf.c",0x3ce);
  return;
}

