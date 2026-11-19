/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932d38
 */

void FUN_00932d38(long param_1)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(byte *)(param_1 + 0x1b1) >> 5 & 1) == 0) {
    uVar3 = FUN_00924398(param_1 + 0x140);
    if ((((uVar3 & 1) == 0) &&
        (lVar4 = FUN_00924964(param_1 + 0x140,0,FUN_00932e18,param_1,&local_3c), lVar4 < 0)) &&
       (local_3c != 0x51)) goto LAB_00932d88;
  }
  iVar2 = FUN_00932850(param_1);
  local_3c = 0;
  if (iVar2 != 0x51) {
    local_3c = iVar2;
  }
LAB_00932d88:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

