/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009456e0
 */

void FUN_009456e0(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  long local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  uVar3 = FUN_009083b8(param_1,0,
                       (*(long *)(param_2 + 0x10) + *(long *)(param_2 + 0x20)) -
                       *(long *)(param_2 + 0x18),*(long *)(param_2 + 0x18),&local_40);
  if ((int)uVar3 == 0x51) {
    local_40 = 0;
  }
  else if ((int)uVar3 != 0) goto LAB_00945770;
  lVar1 = *(long *)(param_2 + 0x18) - local_40;
  if (lVar1 == 0) {
    *(long *)(param_2 + 0x10) = 0;
    *(undefined8 *)(param_2 + 0x18) = 0;
    *(undefined8 *)(param_2 + 0x20) = 0;
    auVar4 = FUN_00941cb8();
    uVar3 = 0;
    *(undefined1 (*) [16])(param_2 + 0x28) = auVar4;
  }
  else {
    uVar3 = 0;
    *(long *)(param_2 + 0x18) = lVar1;
  }
LAB_00945770:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

