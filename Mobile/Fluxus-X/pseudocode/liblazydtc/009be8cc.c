/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be8cc
 */

bool SSL_SESSION_set1_hostname(long param_1,char *param_2)

{
  bool bVar1;
  char *pcVar2;
  
  CRYPTO_free(*(void **)(param_1 + 0x330));
  if (param_2 == (char *)0x0) {
    *(undefined8 *)(param_1 + 0x330) = 0;
    bVar1 = true;
  }
  else {
    pcVar2 = CRYPTO_strdup(param_2,"ssl/ssl_sess.c",0x3f1);
    bVar1 = pcVar2 != (char *)0x0;
    *(char **)(param_1 + 0x330) = pcVar2;
  }
  return bVar1;
}

