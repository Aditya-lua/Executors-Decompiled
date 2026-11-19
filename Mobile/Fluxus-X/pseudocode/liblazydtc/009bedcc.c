/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bedcc
 */

undefined8 SSL_SESSION_set1_ticket_appdata(long param_1,long param_2,long param_3)

{
  long lVar1;
  
  CRYPTO_free(*(void **)(param_1 + 0x378));
  *(undefined8 *)(param_1 + 0x380) = 0;
  if ((param_2 == 0) || (param_3 == 0)) {
    *(undefined8 *)(param_1 + 0x378) = 0;
  }
  else {
    lVar1 = CRYPTO_memdup(param_2,param_3,"ssl/ssl_sess.c",0x56b);
    *(long *)(param_1 + 0x378) = lVar1;
    if (lVar1 == 0) {
      return 0;
    }
    *(long *)(param_1 + 0x380) = param_3;
  }
  return 1;
}

