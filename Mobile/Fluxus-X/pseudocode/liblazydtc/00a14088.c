/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14088
 */

undefined8 SCT_set1_signature(long param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  
  plVar3 = (long *)(param_1 + 0x48);
  CRYPTO_free((void *)*plVar3);
  uVar1 = 1;
  *(undefined4 *)(param_1 + 0x60) = 0;
  *plVar3 = 0;
  *(undefined8 *)(param_1 + 0x50) = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    lVar2 = CRYPTO_memdup(param_2,param_3,"crypto/ct/ct_sct.c",0xb9);
    *plVar3 = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ct/ct_sct.c",0xbb,"SCT_set1_signature");
      ERR_set_error(0x32,0xc0100,0);
      uVar1 = 0;
    }
    else {
      uVar1 = 1;
      *(long *)(param_1 + 0x50) = param_3;
    }
  }
  return uVar1;
}

