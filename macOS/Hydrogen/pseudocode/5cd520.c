
bool FUN_005cd520(undefined8 param_1)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x20;
  long lVar6;
  
  iVar2 = func_0x005cd40c(param_1,*(undefined8 *)(unaff_x19 + 0x38));
  if ((((iVar2 == 0) || (*(long *)(unaff_x20 + 0x18) != *(long *)(unaff_x19 + 0x18))) ||
      (iVar2 = _memcmp(*(undefined8 *)(unaff_x20 + 0x10),*(undefined8 *)(unaff_x19 + 0x10)),
      iVar2 != 0)) || (*(long *)(unaff_x20 + 0x30) != *(long *)(unaff_x19 + 0x30))) {
    bVar1 = false;
  }
  else {
    lVar6 = *(long *)(unaff_x20 + 0x30) + 1;
    lVar3 = *(long *)(unaff_x20 + 0x28);
    lVar5 = *(long *)(unaff_x19 + 0x28);
    do {
      lVar6 = lVar6 + -1;
      bVar1 = lVar6 == 0;
      if (lVar6 == 0) {
        return true;
      }
      uVar4 = func_0x005b28d4(lVar3,lVar5);
      lVar3 = lVar3 + 0x40;
      lVar5 = lVar5 + 0x40;
    } while ((uVar4 & 1) != 0);
  }
  return bVar1;
}

