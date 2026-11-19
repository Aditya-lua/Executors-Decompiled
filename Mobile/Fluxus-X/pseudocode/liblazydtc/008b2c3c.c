/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b2c3c
 */

void FUN_008b2c3c(undefined8 param_1,long param_2,ulong param_3,long *param_4)

{
  long *plVar1;
  long lVar2;
  
  lVar2 = *param_4;
  plVar1 = (long *)(*(long *)(param_2 + 0x30) + (param_3 & 0xff) * 0x10);
  plVar1[1] = param_4[1];
  *plVar1 = lVar2;
  if ((4 < *(int *)((long)param_4 + 0xc)) && ((*(byte *)(param_2 + 2) >> 2 & 1) != 0)) {
    if ((*(byte *)(*param_4 + 2) & 3) != 0) {
      FUN_008b6188();
      return;
    }
  }
  return;
}

