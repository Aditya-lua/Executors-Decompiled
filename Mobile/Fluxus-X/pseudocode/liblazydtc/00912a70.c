/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00912a70
 */

void FUN_00912a70(long param_1)

{
  long lVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x1a8);
  if (lVar2 != 0) {
    lVar1 = *(long *)(lVar2 + 8);
    if (lVar1 != 0) {
      if (*(long *)(lVar1 + 0xc0) != 0) {
        curl_multi_remove_handle();
      }
      FUN_00946590((long *)(lVar2 + 8));
    }
    if (*(long *)(lVar2 + 0x240) != 0) {
      if (*(long *)(*(long *)(lVar2 + 0x240) + 0xc0) != 0) {
        curl_multi_remove_handle();
      }
      FUN_00946590(lVar2 + 0x240);
      return;
    }
  }
  return;
}

