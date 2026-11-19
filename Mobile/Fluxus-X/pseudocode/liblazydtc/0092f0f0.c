/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f0f0
 */

void FUN_0092f0f0(long param_1,undefined4 param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  **(undefined4 **)(*(long *)(param_1 + 0x20) + 0x540) = param_2;
  lVar3 = *(long *)(param_1 + 0xc0);
  if (*(long **)(lVar3 + 0x40) == (long *)0x0) {
    return;
  }
  lVar2 = **(long **)(lVar3 + 0x40);
  *(undefined8 *)(lVar2 + 0x10) = 0;
  if (*(long *)(lVar3 + 8) == 0) {
    *(undefined8 *)(lVar2 + 0x18) = 0;
    *(long *)(lVar3 + 8) = lVar2;
  }
  else {
    lVar1 = *(long *)(lVar3 + 0x10);
    *(long *)(lVar1 + 0x10) = lVar2;
    *(long *)(lVar2 + 0x18) = lVar1;
  }
  *(long *)(lVar3 + 0x10) = lVar2;
  if (*(int *)(lVar2 + 0x58) != 3) {
    *(undefined4 *)(lVar2 + 0x58) = 3;
    FUN_009425cc(lVar2);
  }
  FUN_00925d80(lVar3 + 0x40,lVar2 + 0x28,0);
  FUN_0092aff8(lVar2,0,8);
  return;
}

