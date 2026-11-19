/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908b60
 */

void FUN_00908b60(long param_1,long *param_2)

{
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  long local_48;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(long *)(param_1 + 0xc50) != -1) &&
     ((lVar3 = *(long *)(param_1 + 200), lVar3 != 0 || (*(long *)(param_1 + 0xc0) != 0)))) {
    local_40 = 0;
    lVar4 = *(long *)(param_1 + 0xd0);
    if ((lVar4 == 0) || ((*(byte *)(lVar4 + 4) >> 5 & 1) == 0)) {
      if (lVar3 == 0) {
        lVar3 = *(long *)(param_1 + 0xc0);
      }
      lVar3 = lVar3 + 0x158;
    }
    else {
      lVar3 = lVar4 + 0x28;
    }
    local_48 = *(long *)(param_1 + 0xc50);
    FUN_00910008(param_1,lVar3,&local_48,&LAB_00908c2c);
    if (local_40 != 0) {
      if (param_2 != (long *)0x0) {
        *param_2 = local_40;
      }
      uVar2 = *(undefined4 *)(local_40 + 0x220);
      goto LAB_00908c04;
    }
    *(undefined8 *)(param_1 + 0xc50) = 0xffffffffffffffff;
  }
  uVar2 = 0xffffffff;
LAB_00908c04:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

