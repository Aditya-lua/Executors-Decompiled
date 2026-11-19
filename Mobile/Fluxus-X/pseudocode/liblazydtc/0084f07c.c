/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f07c
 */

void FUN_0084f07c(long param_1,long *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  
  uVar1 = (**(code **)(*param_2 + 0x90))(param_2,param_1);
  if ((uVar1 & 1) == 0) {
    return;
  }
  if (*(long *)(param_1 + 0x60) != 0) {
    plVar3 = *(long **)(param_1 + 0x58);
    lVar4 = *(long *)(param_1 + 0x60) << 3;
    do {
      puVar2 = *(undefined8 **)(*plVar3 + 0x38);
      if (puVar2 != (undefined8 *)0x0) {
        (**(code **)*puVar2)(puVar2,param_2);
      }
      lVar4 = lVar4 + -8;
      plVar3 = plVar3 + 1;
    } while (lVar4 != 0);
  }
  puVar2 = *(undefined8 **)(param_1 + 0x88);
  if (puVar2 != (undefined8 *)0x0) {
    (**(code **)*puVar2)(puVar2,param_2);
  }
  puVar2 = *(undefined8 **)(param_1 + 0x68);
  if (puVar2 != (undefined8 *)0x0) {
    (**(code **)*puVar2)(puVar2,param_2);
  }
                    /* WARNING: Could not recover jumptable at 0x0084f148. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x90))(*(undefined8 **)(param_1 + 0x90),param_2);
  return;
}

