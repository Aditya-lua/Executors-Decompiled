/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a024
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * X509_get_default_cert_dir_env(void)

{
  return "SSL_CERT_DIR";
}

