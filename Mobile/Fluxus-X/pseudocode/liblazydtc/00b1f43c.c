/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f43c
 */

void X509_trust_clear(X509 *x)

{
  if (x[1].altname != (stack_st_GENERAL_NAME *)0x0) {
    OPENSSL_sk_pop_free(*(undefined8 *)&(x[1].altname)->stack,ASN1_OBJECT_free);
    *(undefined8 *)&(x[1].altname)->stack = 0;
  }
  return;
}

