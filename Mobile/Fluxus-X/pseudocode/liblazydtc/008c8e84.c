/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8e84
 */

void FUN_008c8e84(long param_1,undefined8 param_2,long param_3,long param_4,uint param_5,
                 uint param_6)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  undefined8 local_68;
  undefined4 local_5c;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  lVar3 = *(long *)(param_1 + 0x58);
  local_5c = 6;
  local_68 = param_2;
  FUN_008cadd4(param_1,&local_68,param_3 + (ulong)(param_5 >> 0x14 & 0x3ff) * 0x10);
  if ((int)param_5 < 0) {
    uVar2 = (ulong)(param_5 >> 10 & 0x3ff);
    param_4 = param_4 - lVar3;
    lVar3 = *(long *)(param_1 + 0x58) + param_4;
    if ((param_6 & 1) == 0) {
      FUN_008cadd4(param_1,lVar3,param_3 + uVar2 * 0x10,lVar3);
      if (param_5 >> 0x1e < 3) goto LAB_008c8ee4;
      lVar3 = *(long *)(param_1 + 0x58);
    }
    else if (((*(int *)(lVar3 + 0xc) == 0) ||
             (FUN_008cadd4(param_1,lVar3,param_3 + uVar2 * 0x10,lVar3), param_5 >> 0x1e < 3)) ||
            (lVar3 = *(long *)(param_1 + 0x58), *(int *)(lVar3 + param_4 + 0xc) == 0))
    goto LAB_008c8ee4;
    FUN_008cadd4(param_1,lVar3 + param_4,param_3 + (ulong)(param_5 & 0x3ff) * 0x10,lVar3 + param_4);
  }
LAB_008c8ee4:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

