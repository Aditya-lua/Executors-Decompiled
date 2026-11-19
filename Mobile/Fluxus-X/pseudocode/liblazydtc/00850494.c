/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850494
 */

void FUN_00850494(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  
  uVar1 = (**(code **)(*param_2 + 0x158))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if (*(long *)(param_1 + 0x40) != 0) {
    lVar3 = *(long *)(param_1 + 0x40) << 3;
    puVar2 = *(undefined8 **)(param_1 + 0x38);
    do {
      (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
      lVar3 = lVar3 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar3 != 0);
  }
  if (*(long *)(param_1 + 0x50) != 0) {
    lVar3 = *(long *)(param_1 + 0x50) << 3;
    puVar2 = *(undefined8 **)(param_1 + 0x48);
    do {
      (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
      lVar3 = lVar3 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar3 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x00850538. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x58))(*(undefined8 **)(param_1 + 0x58),param_2);
  return;
}

