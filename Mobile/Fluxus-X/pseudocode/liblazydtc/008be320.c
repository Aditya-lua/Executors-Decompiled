/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be320
 */

void FUN_008be320(long param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  char cVar3;
  code *pcVar4;
  
  cVar3 = *(char *)(param_2 + 3);
  if ((long)cVar3 < 0) {
    if (cVar3 != -0x80) goto LAB_008be380;
    pcVar4 = *(code **)(param_2 + *(int *)(param_2 + 4) + 8);
  }
  else {
    pcVar4 = *(code **)(*(long *)(param_1 + 0x60) + (long)cVar3 * 8 + 0x4048);
  }
  if (pcVar4 != (code *)0x0) {
    (*pcVar4)(param_1,param_2 + 0x10);
  }
LAB_008be380:
  uVar2 = *(uint *)(param_2 + 4);
  uVar1 = uVar2 + 0xf & 0x7ffffff0;
  if ((int)uVar2 < 0x11) {
    uVar1 = uVar2;
  }
  FUN_008b7bd4(param_1,param_2,(long)(int)uVar1 + 0x10,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

