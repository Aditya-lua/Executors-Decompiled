/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13f88
 */

undefined8 SCT_set1_extensions(long param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  
  plVar3 = (long *)(param_1 + 0x30);
  CRYPTO_free((void *)*plVar3);
  uVar1 = 1;
  *(undefined4 *)(param_1 + 0x60) = 0;
  *plVar3 = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    lVar2 = CRYPTO_memdup(param_2,param_3,"crypto/ct/ct_sct.c",0x9f);
    *plVar3 = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ct/ct_sct.c",0xa1,"SCT_set1_extensions");
      ERR_set_error(0x32,0xc0100,0);
      uVar1 = 0;
    }
    else {
      uVar1 = 1;
      *(long *)(param_1 + 0x38) = param_3;
    }
  }
  return uVar1;
}

