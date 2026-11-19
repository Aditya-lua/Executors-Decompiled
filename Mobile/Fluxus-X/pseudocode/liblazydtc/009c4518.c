/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4518
 */

undefined8 tls1_set_raw_sigalgs(long param_1,void *param_2,long param_3,int param_4)

{
  void *__dest;
  undefined8 uVar1;
  
  __dest = CRYPTO_malloc((int)(param_3 << 1),"ssl/t1_lib.c",0x9db);
  if (__dest == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0x9dc,"tls1_set_raw_sigalgs");
    ERR_set_error(0x14,0xc0100,0);
    uVar1 = 0;
  }
  else {
    memcpy(__dest,param_2,param_3 << 1);
    if (param_4 == 0) {
      CRYPTO_free(*(void **)(param_1 + 0x198));
      *(void **)(param_1 + 0x198) = __dest;
      *(long *)(param_1 + 0x1a0) = param_3;
    }
    else {
      CRYPTO_free(*(void **)(param_1 + 0x1a8));
      *(void **)(param_1 + 0x1a8) = __dest;
      *(long *)(param_1 + 0x1b0) = param_3;
    }
    uVar1 = 1;
  }
  return uVar1;
}

