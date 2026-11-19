/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f954
 */

int _CONF_add_string(CONF *conf,CONF_VALUE *section,CONF_VALUE *value)

{
  int iVar1;
  int iVar2;
  void *ptr;
  char *pcVar3;
  
  pcVar3 = section->value;
  value->section = section->section;
  iVar1 = OPENSSL_sk_push(pcVar3,value);
  iVar2 = 0;
  if (iVar1 != 0) {
    ptr = (void *)OPENSSL_LH_insert(conf->data,value);
    if (ptr != (void *)0x0) {
      OPENSSL_sk_delete_ptr(pcVar3,ptr);
      CRYPTO_free(*(void **)((long)ptr + 8));
      CRYPTO_free(*(void **)((long)ptr + 0x10));
      CRYPTO_free(ptr);
    }
    iVar2 = 1;
  }
  return iVar2;
}

