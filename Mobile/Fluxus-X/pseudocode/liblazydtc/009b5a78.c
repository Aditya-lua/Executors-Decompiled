/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5a78
 */

char * SSL_get_cipher_list(SSL *s,int n)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  SSL_CTX *pSVar4;
  
  pcVar2 = (char *)0x0;
  if (s != (SSL *)0x0) {
    pSVar4 = s[1].initial_ctx;
    if ((pSVar4 == (SSL_CTX *)0x0) &&
       ((lVar3 = *(long *)&s[3].ex_data.dummy, lVar3 == 0 ||
        (pSVar4 = *(SSL_CTX **)(lVar3 + 0x10), pSVar4 == (SSL_CTX *)0x0)))) {
      pcVar2 = (char *)0x0;
    }
    else {
      iVar1 = OPENSSL_sk_num(pSVar4);
      pcVar2 = (char *)0x0;
      if ((n < iVar1) && (lVar3 = OPENSSL_sk_value(pSVar4,n), pcVar2 = (char *)0x0, lVar3 != 0)) {
        pcVar2 = *(char **)(lVar3 + 8);
      }
    }
  }
  return pcVar2;
}

