/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad0a8
 */

int SSL_CTX_add_client_CA(SSL_CTX *ctx,X509 *x)

{
  int iVar1;
  cert_st *pcVar2;
  X509_NAME *pXVar3;
  
  if (x != (X509 *)0x0) {
    if (ctx->cert == (cert_st *)0x0) {
      pcVar2 = (cert_st *)OPENSSL_sk_new_null();
      ctx->cert = pcVar2;
      if (pcVar2 == (cert_st *)0x0) {
        return 0;
      }
    }
    pXVar3 = X509_get_subject_name(x);
    pXVar3 = X509_NAME_dup(pXVar3);
    if (pXVar3 == (X509_NAME *)0x0) {
      return 0;
    }
    iVar1 = OPENSSL_sk_push(ctx->cert,pXVar3);
    if (iVar1 != 0) {
      return 1;
    }
    X509_NAME_free(pXVar3);
  }
  return 0;
}

