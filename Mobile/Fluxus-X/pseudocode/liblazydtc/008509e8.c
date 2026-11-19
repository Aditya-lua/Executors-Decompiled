/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008509e8
 */

void FUN_008509e8(long param_1,long *param_2)

{
  ulong uVar1;
  long lVar2;
  undefined8 *puVar3;
  
  uVar1 = (**(code **)(*param_2 + 0x180))(param_2,param_1);
  if (((uVar1 & 1) != 0) && (*(long *)(param_1 + 0x40) != 0)) {
    lVar2 = *(long *)(param_1 + 0x40) * 0x38;
    puVar3 = (undefined8 *)(*(long *)(param_1 + 0x38) + 0x18);
    do {
      (*(code *)**(undefined8 **)*puVar3)((undefined8 *)*puVar3,param_2);
      lVar2 = lVar2 + -0x38;
      puVar3 = puVar3 + 7;
    } while (lVar2 != 0);
  }
  return;
}

