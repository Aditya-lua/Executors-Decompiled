/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b6370
 */

void FUN_008b6370(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = *(long *)(param_1 + 0x60);
  if (*(char *)(lVar1 + 1) == '\x02') {
    FUN_008b61bc(lVar1,param_3);
    return;
  }
  *(byte *)(param_2 + 2) = *(byte *)(param_2 + 2) & 0xfb;
  uVar2 = *(undefined8 *)(lVar1 + 0x60);
  *(long *)(lVar1 + 0x60) = param_2;
  *(undefined8 *)(param_2 + 0x18) = uVar2;
  return;
}

