/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008500b8
 */

void FUN_008500b8(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  
  uVar1 = (**(code **)(*param_2 + 0x130))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if (*(long *)(param_1 + 0x28) != 0) {
    plVar3 = *(long **)(param_1 + 0x20);
    lVar4 = *(long *)(param_1 + 0x28) << 3;
    do {
      puVar2 = *(undefined8 **)(*plVar3 + 0x38);
      if (puVar2 != (undefined8 *)0x0) {
        (**(code **)*puVar2)(puVar2,param_2);
      }
      lVar4 = lVar4 + -8;
      plVar3 = plVar3 + 1;
    } while (lVar4 != 0);
  }
  if (*(long *)(param_1 + 0x38) != 0) {
    lVar4 = *(long *)(param_1 + 0x38) << 3;
    puVar2 = *(undefined8 **)(param_1 + 0x30);
    do {
      (*(code *)**(undefined8 **)*puVar2)((undefined8 *)*puVar2,param_2);
      lVar4 = lVar4 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar4 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x00850180. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x40))(*(undefined8 **)(param_1 + 0x40),param_2);
  return;
}

