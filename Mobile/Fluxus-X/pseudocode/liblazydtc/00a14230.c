/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14230
 */

bool SCT_signature_is_complete(int *param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if ((((*param_1 == 0) && (bVar1 = false, (char)param_1[0x10] == '\x04')) &&
      (bVar1 = false, (*(byte *)((long)param_1 + 0x41) | 2) == 3)) &&
     (bVar1 = false, *(long *)(param_1 + 0x12) != 0)) {
    bVar1 = *(long *)(param_1 + 0x14) != 0;
  }
  return bVar1;
}

