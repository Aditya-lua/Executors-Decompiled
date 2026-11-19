/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008506e0
 */

void FUN_008506e0(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  int *piVar4;
  long lVar5;
  int *piVar7;
  int *piVar6;
  long **local_60;
  long **pplStack_58;
  long *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = param_2;
  uVar2 = (**(code **)(*param_2 + 0x178))(param_2,param_1);
  if ((uVar2 & 1) != 0) {
    if (*(int *)(param_1 + 0x40) == 0) {
      (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
    }
    puVar3 = *(undefined8 **)(param_1 + 0x28);
    if (puVar3 != (undefined8 *)0x0) {
      (**(code **)*puVar3)(puVar3,param_2);
    }
    lVar5 = *(long *)(param_1 + 0x38);
    if (lVar5 != 0) {
      piVar4 = *(int **)(param_1 + 0x30);
      piVar6 = piVar4;
      do {
        piVar7 = piVar6 + 0x16;
        local_60 = &local_50;
        pplStack_58 = &local_50;
        (*(code *)(&PTR_LAB_00c4a530)[*piVar6])(&local_60,piVar6 + 2);
        piVar6 = piVar7;
      } while (piVar7 != piVar4 + lVar5 * 0x16);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

