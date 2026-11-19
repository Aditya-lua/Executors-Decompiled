/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06a44
 */

void X509_email_free(stack_st_OPENSSL_STRING *sk)

{
  OPENSSL_sk_pop_free(sk,&LAB_00b06a50);
  return;
}

