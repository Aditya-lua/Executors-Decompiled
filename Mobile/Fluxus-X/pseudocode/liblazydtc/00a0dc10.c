/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0dc10
 */

void * FUN_00a0dc10(long param_1)

{
  int iVar1;
  void *ptr;
  
  ptr = CRYPTO_malloc(0x30,"crypto/conf/conf_def.c",0x73);
  if ((ptr != (void *)0x0) && (iVar1 = (**(code **)(param_1 + 0x10))(ptr), iVar1 == 0)) {
    CRYPTO_free(ptr);
    ptr = (void *)0x0;
  }
  return ptr;
}

