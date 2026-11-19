/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba404
 */

undefined8 SSL_CONF_CTX_set1_prefix(long param_1,char *param_2)

{
  char *__s;
  size_t sVar1;
  
  if (param_2 == (char *)0x0) {
    __s = (char *)0x0;
  }
  else {
    __s = CRYPTO_strdup(param_2,"ssl/ssl_conf.c",0x410);
    if (__s == (char *)0x0) {
      return 0;
    }
  }
  CRYPTO_free(*(void **)(param_1 + 8));
  *(char **)(param_1 + 8) = __s;
  if (__s == (char *)0x0) {
    sVar1 = 0;
  }
  else {
    sVar1 = strlen(__s);
  }
  *(size_t *)(param_1 + 0x10) = sVar1;
  return 1;
}

