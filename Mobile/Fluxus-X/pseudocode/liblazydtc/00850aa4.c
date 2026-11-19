/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850aa4
 */

void FUN_00850aa4(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  
  uVar1 = (**(code **)(*param_2 + 0x188))(param_2,param_1);
  if ((uVar1 & 1) != 0) {
    if (*(long *)(param_1 + 0x28) != 0) {
      lVar3 = *(long *)(param_1 + 0x28) << 3;
      puVar2 = *(undefined8 **)(param_1 + 0x20);
      do {
        (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
        lVar3 = lVar3 + -8;
        puVar2 = puVar2 + 1;
      } while (lVar3 != 0);
    }
    if (*(long *)(param_1 + 0x38) != 0) {
      lVar3 = *(long *)(param_1 + 0x38) << 3;
      puVar2 = *(undefined8 **)(param_1 + 0x30);
      do {
        (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
        lVar3 = lVar3 + -8;
        puVar2 = puVar2 + 1;
      } while (lVar3 != 0);
    }
  }
  return;
}

