
ulong FUN_0076c46c(long param_1,undefined4 *param_2)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  code *UNRECOVERED_JUMPTABLE;
  long lVar5;
  
  lVar5 = *(long *)(param_1 + 0x18);
  if (lVar5 == 0) {
    uVar4 = 0;
  }
  else {
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(lVar5 + 0x3a0) + 0x58);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x0076c498. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*UNRECOVERED_JUMPTABLE)(param_1,lVar5,param_2);
      return uVar4;
    }
    uVar1 = *(uint *)(param_1 + 0x134) & 0x15;
    bVar2 = uVar1 == 1;
    if (bVar2) {
      *param_2 = *(undefined4 *)(lVar5 + 0x3c0);
      iVar3 = func_0x007718c0();
    }
    else {
      iVar3 = func_0x007718c0();
    }
    uVar4 = (ulong)bVar2;
    if (iVar3 != 0) {
      if ((uVar1 == 1) && (*(int *)(lVar5 + 0x3c0) == *(int *)(lVar5 + 0x3c4))) {
        uVar4 = 0;
      }
      else {
        uVar4 = (ulong)(uVar1 == 1);
        param_2[uVar4] = *(int *)(lVar5 + 0x3c4);
      }
      return (ulong)(0x10000 << uVar4 | (uint)bVar2);
    }
  }
  return uVar4;
}

