/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab6f0
 */

undefined8 CRYPTO_ocb128_copy_ctx(void *param_1,void *param_2,long param_3,long param_4)

{
  void *__dest;
  
  memcpy(param_1,param_2,0xb0);
  if (param_3 != 0) {
    *(long *)((long)param_1 + 0x10) = param_3;
  }
  if (param_4 != 0) {
    *(long *)((long)param_1 + 0x18) = param_4;
  }
  if (*(long *)((long)param_2 + 0x58) != 0) {
    __dest = CRYPTO_malloc((int)(*(long *)((long)param_2 + 0x30) << 4),"crypto/modes/ocb128.c",0xcd)
    ;
    *(void **)((long)param_1 + 0x58) = __dest;
    if (__dest == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/modes/ocb128.c",0xce,"CRYPTO_ocb128_copy_ctx");
      ERR_set_error(0xf,0xc0100,0);
      return 0;
    }
    memcpy(__dest,*(void **)((long)param_2 + 0x58),*(long *)((long)param_2 + 0x28) * 0x10 + 0x10);
  }
  return 1;
}

