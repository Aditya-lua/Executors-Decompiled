/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f1e4
 */

void curl_multi_get_handles(long param_1)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  
  lVar1 = (*(code *)PTR_malloc_00cc4670)((ulong)(*(int *)(param_1 + 0x18) + 1) << 3);
  if (lVar1 != 0) {
    lVar3 = *(long *)(param_1 + 8);
    if (lVar3 == 0) {
      uVar2 = 0;
    }
    else {
      uVar2 = 0;
      do {
        if ((*(byte *)(lVar3 + 0x131e) >> 2 & 1) == 0) {
          *(long *)(lVar1 + (ulong)uVar2 * 8) = lVar3;
          uVar2 = uVar2 + 1;
        }
        lVar3 = *(long *)(lVar3 + 0x10);
      } while (lVar3 != 0);
    }
    *(undefined8 *)(lVar1 + (ulong)uVar2 * 8) = 0;
  }
  return;
}

