/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0fcec
 */

CONF_VALUE * _CONF_new_section(CONF *conf,char *section)

{
  int iVar1;
  char *pcVar2;
  CONF_VALUE *ptr;
  size_t sVar3;
  char *__dest;
  long lVar4;
  
  pcVar2 = (char *)OPENSSL_sk_new_null();
  if (pcVar2 == (char *)0x0) {
    OPENSSL_sk_free();
    ptr = (CONF_VALUE *)0x0;
  }
  else {
    ptr = CRYPTO_malloc(0x18,"crypto/conf/conf_api.c",0xc1);
    if (ptr == (CONF_VALUE *)0x0) {
      OPENSSL_sk_free(pcVar2);
    }
    else {
      sVar3 = strlen(section);
      lVar4 = (sVar3 << 0x20) + 0x100000000;
      __dest = CRYPTO_malloc((int)((ulong)lVar4 >> 0x20),"crypto/conf/conf_api.c",0xc4);
      ptr->section = __dest;
      if (__dest != (char *)0x0) {
        memcpy(__dest,section,lVar4 >> 0x20);
        ptr->name = (char *)0x0;
        ptr->value = pcVar2;
        lVar4 = OPENSSL_LH_insert(conf->data,ptr);
        if ((lVar4 == 0) && (iVar1 = OPENSSL_LH_error(conf->data), iVar1 < 1)) {
          return ptr;
        }
      }
      OPENSSL_sk_free(pcVar2);
      CRYPTO_free(ptr->section);
    }
  }
  CRYPTO_free(ptr);
  return (CONF_VALUE *)0x0;
}

