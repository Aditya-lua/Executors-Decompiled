/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5c6c
 */

char * SSL_get_shared_ciphers(SSL *s,char *buf,int len)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  void *pvVar5;
  SSL_CTX *pSVar6;
  char *__dest;
  
  if ((s->server != 0) && (1 < len)) {
    pvVar5 = s[1].tls_session_secret_cb_arg;
    if (pvVar5 == (void *)0x0) {
      return (char *)0x0;
    }
    pSVar6 = s[1].initial_ctx;
    if ((((pSVar6 != (SSL_CTX *)0x0) ||
         ((lVar4 = *(long *)&s[3].ex_data.dummy, lVar4 != 0 &&
          (pSVar6 = *(SSL_CTX **)(lVar4 + 0x10), pSVar6 != (SSL_CTX *)0x0)))) &&
        (iVar2 = OPENSSL_sk_num(pvVar5), iVar2 != 0)) &&
       (iVar2 = OPENSSL_sk_num(pSVar6), iVar2 != 0)) {
      iVar2 = OPENSSL_sk_num(pvVar5);
      __dest = buf;
      if (0 < iVar2) {
        iVar2 = 0;
        do {
          lVar4 = OPENSSL_sk_value(pvVar5,iVar2);
          iVar3 = OPENSSL_sk_find(pSVar6,lVar4);
          if (-1 < iVar3) {
            iVar3 = OPENSSL_strnlen(*(undefined8 *)(lVar4 + 8),(long)len);
            if (len <= iVar3) {
              if (__dest != buf) {
                __dest = __dest + -1;
              }
              *__dest = '\0';
              return buf;
            }
            memcpy(__dest,*(void **)(lVar4 + 8),(long)iVar3);
            pcVar1 = __dest + iVar3;
            __dest = pcVar1 + 1;
            *pcVar1 = ':';
            len = (len + -1) - iVar3;
          }
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(pvVar5);
        } while (iVar2 < iVar3);
      }
      __dest[-1] = '\0';
      return buf;
    }
  }
  return (char *)0x0;
}

