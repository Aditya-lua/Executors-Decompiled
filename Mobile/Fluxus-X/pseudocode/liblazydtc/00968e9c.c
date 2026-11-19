/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968e9c
 */

void FUN_00968e9c(long param_1)

{
  long lVar1;
  long lVar2;
  
  if (*(int *)(param_1 + 0x13f8) != 0) {
    if (0 < *(int *)(param_1 + 0x13f8)) {
      lVar1 = 0;
      do {
        lVar2 = lVar1 * 8;
        curl_slist_free_all(*(undefined8 *)(*(long *)(param_1 + 0x1400) + lVar2));
        lVar1 = lVar1 + 1;
        *(undefined8 *)(*(long *)(param_1 + 0x1400) + lVar2) = 0;
      } while (lVar1 < *(int *)(param_1 + 0x13f8));
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1400));
    *(undefined8 *)(param_1 + 0x1400) = 0;
    *(undefined4 *)(param_1 + 0x13f8) = 0;
  }
  return;
}

