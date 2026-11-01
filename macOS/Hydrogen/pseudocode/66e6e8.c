
void FUN_0066e6e8(long *param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  
  if ((*(byte *)(param_1 + 0x13) & 1) == 0) {
    return;
  }
  uVar1 = *(uint *)((long)param_1 + 0x9c);
  uVar5 = (ulong)uVar1;
  lVar2 = param_1[0x18];
  uVar4 = param_1[0x17];
  if (uVar4 != uVar5) {
    if (lVar2 != 0) {
      if (uVar4 != 0) {
        do {
          *(undefined1 *)(lVar2 + -1 + uVar4) = 0;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      func_0x00611644();
    }
    if (uVar1 == 0) {
      lVar2 = 0;
      param_1[0x17] = 0;
      param_1[0x18] = 0;
      param_1[0x16] = -1;
      goto joined_r0x0066e750;
    }
    lVar2 = func_0x006115d0(uVar5);
  }
  param_1[0x17] = uVar5;
  param_1[0x18] = lVar2;
  param_1[0x16] = -1;
joined_r0x0066e750:
  if (param_2 != 0) {
    _memcpy(lVar2,param_2,uVar5);
  }
  if ((*(byte *)(param_1 + 0x13) >> 2 & 1) == 0) {
    return;
  }
  plVar3 = (long *)(**(code **)(*param_1 + 0x160))(param_1);
                    /* WARNING: Could not recover jumptable at 0x0066e7ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar3 + 0x38))(plVar3,param_2,param_1[0x17],0,1);
  return;
}

