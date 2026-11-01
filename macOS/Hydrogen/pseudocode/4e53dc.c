
ulong FUN_004e53dc(long param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  long *in_x9;
  long in_x10;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long lVar5;
  
  while( true ) {
    lVar5 = in_x10 + 1;
    plVar4 = (long *)(param_1 + 0x10);
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      if (*plVar4 != *in_x9) {
        return 0;
      }
      iVar3 = _memcmp(plVar4[-1],in_x9[-1]);
      plVar4 = plVar4 + 3;
      in_x9 = in_x9 + 3;
      if (iVar3 != 0) {
        return 0;
      }
    }
    if (unaff_x23 == unaff_x20) {
      return unaff_x22;
    }
    lVar5 = unaff_x21 + unaff_x23 * 0x18;
    lVar1 = unaff_x19 + unaff_x23 * 0x18;
    in_x10 = *(long *)(lVar5 + 0x10);
    bVar2 = in_x10 == *(long *)(lVar1 + 0x10);
    unaff_x22 = (ulong)bVar2;
    if (!bVar2) break;
    unaff_x23 = unaff_x23 + 1;
    param_1 = *(long *)(lVar5 + 8);
    in_x9 = (long *)(*(long *)(lVar1 + 8) + 0x10);
  }
  return unaff_x22;
}

