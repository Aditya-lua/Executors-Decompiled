/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1fa38
 */

undefined8 FUN_00a1fa38(long param_1,long param_2)

{
  DSA *pDVar1;
  undefined8 uVar2;
  
  pDVar1 = *(DSA **)(param_1 + 0x20);
  if (pDVar1 == (DSA *)0x0) {
    pDVar1 = DSA_new();
    *(DSA **)(param_1 + 0x20) = pDVar1;
    if (pDVar1 == (DSA *)0x0) {
      return 0;
    }
  }
  uVar2 = ossl_ffc_params_copy(&pDVar1->version,*(long *)(param_2 + 0x20) + 8);
  if ((int)uVar2 != 0) {
    uVar2 = 1;
    *(long *)(*(long *)(param_1 + 0x20) + 0xc0) = *(long *)(*(long *)(param_1 + 0x20) + 0xc0) + 1;
  }
  return uVar2;
}

