/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d1c4
 */

undefined8
ossl_ffc_params_set_validate_params(long param_1,void *param_2,long param_3,undefined4 param_4)

{
  void *ptr;
  long lVar1;
  long *plVar2;
  
  if (param_1 == 0) {
    return 0;
  }
  plVar2 = (long *)(param_1 + 0x20);
  ptr = (void *)*plVar2;
  if (ptr != (void *)0x0) {
    if (ptr == param_2) goto LAB_00a7d244;
    CRYPTO_free(ptr);
  }
  if ((param_2 == (void *)0x0) || (param_3 == 0)) {
    *plVar2 = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
  }
  else {
    lVar1 = CRYPTO_memdup(param_2,param_3,"crypto/ffc/ffc_params.c",0x58);
    *plVar2 = lVar1;
    if (lVar1 == 0) {
      return 0;
    }
    *(long *)(param_1 + 0x28) = param_3;
  }
LAB_00a7d244:
  *(undefined4 *)(param_1 + 0x30) = param_4;
  return 1;
}

