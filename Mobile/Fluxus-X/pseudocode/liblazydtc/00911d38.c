/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00911d38
 */

void FUN_00911d38(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  
  puVar2 = *(undefined8 **)(param_1 + 0x1a8);
  if (puVar2 != (undefined8 *)0x0) {
    lVar1 = puVar2[1];
    if (lVar1 != 0) {
      if (*(long *)(lVar1 + 0xc0) != 0) {
        curl_multi_remove_handle();
      }
      FUN_00946590(puVar2 + 1);
    }
    if (puVar2[0x48] != 0) {
      if (*(long *)(puVar2[0x48] + 0xc0) != 0) {
        curl_multi_remove_handle();
      }
      FUN_00946590(puVar2 + 0x48);
    }
    curl_slist_free_all(*puVar2);
    **(undefined8 **)(param_1 + 0x1a8) = 0;
    (*(code *)PTR_free_00cc4678)();
    *(undefined8 *)(param_1 + 0x1a8) = 0;
  }
  return;
}

