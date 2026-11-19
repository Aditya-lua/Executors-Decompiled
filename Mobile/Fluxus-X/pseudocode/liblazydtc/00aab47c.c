/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab47c
 */

void * CRYPTO_ocb128_new(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4
                        ,undefined8 param_5)

{
  int iVar1;
  void *ptr;
  
  ptr = CRYPTO_malloc(0xb0,"crypto/modes/ocb128.c",0x89);
  if ((ptr != (void *)0x0) &&
     (iVar1 = CRYPTO_ocb128_init(ptr,param_1,param_2,param_3,param_4,param_5), iVar1 == 0)) {
    CRYPTO_free(ptr);
    ptr = (void *)0x0;
  }
  return ptr;
}

