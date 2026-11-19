/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3380
 */

bool FUN_008b3380(long param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  
  plVar2 = (long *)(param_1 + 0x10);
  do {
    lVar1 = *plVar2;
    if (lVar1 == param_2) break;
    plVar2 = (long *)(lVar1 + 0x20);
  } while (lVar1 != 0);
  return lVar1 != 0;
}

