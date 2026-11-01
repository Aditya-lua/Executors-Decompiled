
void FUN_006e189c(long param_1,int param_2)

{
  ulong uVar1;
  long lVar2;
  int unaff_w19;
  
  if ((long)(param_2 << 4) < *(long *)(param_1 + 0x28) - *(long *)(param_1 + 8)) {
    lVar2 = *(long *)(param_1 + 0x20);
    uVar1 = *(long *)(param_1 + 8) + (long)unaff_w19 * 0x10;
    if (*(ulong *)(lVar2 + 0x10) < uVar1) {
LAB_006e18fc:
      *(ulong *)(lVar2 + 0x10) = uVar1;
      return;
    }
  }
  else {
    func_0x006ee1d4(param_1);
    lVar2 = *(long *)(param_1 + 0x20);
    uVar1 = *(long *)(param_1 + 8) + (long)unaff_w19 * 0x10;
    if (*(ulong *)(lVar2 + 0x10) < uVar1) goto LAB_006e18fc;
  }
  return;
}

