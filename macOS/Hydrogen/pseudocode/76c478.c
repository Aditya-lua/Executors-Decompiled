
ulong FUN_0076c478(long param_1)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  code *UNRECOVERED_JUMPTABLE;
  undefined4 *unaff_x19;
  long unaff_x21;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(unaff_x21 + 0x3a0) + 0x58);
  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x0076c498. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (*UNRECOVERED_JUMPTABLE)();
    return uVar4;
  }
  uVar1 = *(uint *)(param_1 + 0x134) & 0x15;
  bVar2 = uVar1 == 1;
  if (bVar2) {
    *unaff_x19 = *(undefined4 *)(unaff_x21 + 0x3c0);
    iVar3 = func_0x007718c0();
  }
  else {
    iVar3 = func_0x007718c0();
  }
  if (iVar3 == 0) {
    return (ulong)bVar2;
  }
  if ((uVar1 == 1) && (*(int *)(unaff_x21 + 0x3c0) == *(int *)(unaff_x21 + 0x3c4))) {
    uVar4 = 0;
  }
  else {
    uVar4 = (ulong)(uVar1 == 1);
    unaff_x19[uVar4] = *(int *)(unaff_x21 + 0x3c4);
  }
  return (ulong)(0x10000 << uVar4 | (uint)bVar2);
}

