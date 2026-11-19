/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25f94
 */

void * ossl_siv128_new(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                      undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  void *ptr;
  
  ptr = CRYPTO_malloc(0x40,"crypto/modes/siv128.c",0x96);
  if ((ptr != (void *)0x0) &&
     (iVar1 = ossl_siv128_init(ptr,param_1,param_2,param_3,param_4,param_5,param_6), iVar1 == 0)) {
    CRYPTO_free(ptr);
    ptr = (void *)0x0;
  }
  return ptr;
}

