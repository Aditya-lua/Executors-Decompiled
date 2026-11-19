/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968f18
 */

undefined8 FUN_00968f18(long param_1,int param_2)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  
  if (*(int *)(param_1 + 0x13f8) != 0) {
    if (0 < *(int *)(param_1 + 0x13f8)) {
      lVar2 = 0;
      do {
        lVar3 = lVar2 * 8;
        curl_slist_free_all(*(undefined8 *)(*(long *)(param_1 + 0x1400) + lVar3));
        lVar2 = lVar2 + 1;
        *(undefined8 *)(*(long *)(param_1 + 0x1400) + lVar3) = 0;
      } while (lVar2 < *(int *)(param_1 + 0x13f8));
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1400));
    *(undefined8 *)(param_1 + 0x1400) = 0;
    *(undefined4 *)(param_1 + 0x13f8) = 0;
  }
  lVar2 = (*(code *)PTR_calloc_00cc4690)((long)param_2,8);
  if (lVar2 == 0) {
    uVar1 = 0x1b;
  }
  else {
    uVar1 = 0;
    *(int *)(param_1 + 0x13f8) = param_2;
    *(long *)(param_1 + 0x1400) = lVar2;
  }
  return uVar1;
}

