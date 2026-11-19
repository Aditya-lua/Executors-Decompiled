/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932b04
 */

void FUN_00932b04(long param_1,undefined8 param_2)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long local_58;
  uint local_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((param_1 == 0) || (*(long *)(param_1 + 0x20) == 0)) {
    uVar6 = 2;
  }
  else {
    lVar3 = FUN_00904974(param_2);
    lVar4 = FUN_00904984(param_2);
    lVar5 = FUN_00935f5c(param_1);
    if (lVar5 == 0) {
      *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x20;
      uVar6 = FUN_00932c6c(param_1,lVar3,lVar4,lVar4,&local_58);
      if ((int)uVar6 != 0) goto LAB_00932bc0;
      lVar3 = lVar3 + local_58;
      lVar4 = lVar4 - local_58;
    }
    if (lVar4 == 0) {
      uVar6 = 0;
    }
    else {
      lVar5 = param_1 + 0x140;
      local_4c = 0;
      lVar3 = FUN_009243e8(lVar5,lVar3,lVar4,&local_4c);
      if (lVar3 < 0) {
        uVar6 = (ulong)local_4c;
        if (local_4c != 0) goto LAB_00932bc0;
      }
      else {
        *(long *)(param_1 + 0x180) = *(long *)(param_1 + 0x180) + lVar4;
      }
      if (((((*(byte *)(param_1 + 0x1b1) >> 5 & 1) != 0) ||
           (uVar6 = FUN_00924398(lVar5), (uVar6 & 1) != 0)) ||
          (lVar3 = FUN_00924964(lVar5,0,FUN_00932e18,param_1,&local_4c), -1 < lVar3)) ||
         (uVar6 = (ulong)local_4c, local_4c == 0x51)) {
        uVar2 = FUN_00932850(param_1);
        local_4c = 0;
        if (uVar2 != 0x51) {
          local_4c = uVar2;
        }
        uVar6 = (ulong)local_4c;
      }
    }
  }
LAB_00932bc0:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

