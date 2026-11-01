
ulong FUN_004e53f0(long *param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  long *plVar5;
  long *plVar6;
  long *in_x9;
  long lVar7;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  do {
    if (param_4 != *in_x9) {
      return 0;
    }
    plVar6 = in_x9 + 3;
    plVar5 = param_1 + 3;
    iVar4 = _memcmp(param_1[-1],in_x9[-1]);
    if (iVar4 != 0) {
      return 0;
    }
    while (unaff_x24 = unaff_x24 + -1, unaff_x24 == 0) {
      if (unaff_x23 == unaff_x20) {
        return unaff_x22;
      }
      lVar1 = unaff_x21 + unaff_x23 * 0x18;
      lVar2 = unaff_x19 + unaff_x23 * 0x18;
      lVar7 = *(long *)(lVar1 + 0x10);
      bVar3 = lVar7 == *(long *)(lVar2 + 0x10);
      unaff_x22 = (ulong)bVar3;
      if (!bVar3) {
        return unaff_x22;
      }
      unaff_x23 = unaff_x23 + 1;
      plVar6 = (long *)(*(long *)(lVar2 + 8) + 0x10);
      plVar5 = (long *)(*(long *)(lVar1 + 8) + 0x10);
      unaff_x24 = lVar7 + 1;
    }
    param_4 = *plVar5;
    param_1 = plVar5;
    in_x9 = plVar6;
  } while( true );
}

