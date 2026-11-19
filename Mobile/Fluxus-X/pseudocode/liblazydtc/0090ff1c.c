/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ff1c
 */

void FUN_0090ff1c(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  undefined1 auStack_50 [24];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_2 + 0x540);
  if (lVar4 != 0) {
    for (plVar3 = *(long **)(lVar4 + 0x10); plVar3 != (long *)0x0; plVar3 = (long *)plVar3[2]) {
      if (*plVar3 == param_2) {
        FUN_00925d80((long *)(lVar4 + 0x10),plVar3,0);
        *(long *)(lVar4 + 8) = *(long *)(lVar4 + 8) + -1;
        *(undefined8 *)(param_2 + 0x540) = 0;
        break;
      }
    }
    if (param_1 == 0) {
      *(undefined8 *)(param_2 + 0x540) = 0;
    }
    else {
      if (*(long *)(lVar4 + 8) == 0) {
        FUN_00916a74(param_1,auStack_50);
        do {
          lVar2 = FUN_00916a80(auStack_50);
          if (lVar2 == 0) goto LAB_0090ffac;
        } while (*(long *)(lVar2 + 0x18) != lVar4);
        FUN_009166fc(param_1,lVar2 + 0x30,*(undefined8 *)(lVar2 + 0x28));
      }
LAB_0090ffac:
      *(undefined8 *)(param_2 + 0x540) = 0;
      *(long *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + -1;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

