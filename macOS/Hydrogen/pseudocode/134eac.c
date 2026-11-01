
void FUN_00134eac(void)

{
  int *piVar1;
  int iVar2;
  uint uVar3;
  char in_NG;
  char in_OV;
  int iVar4;
  uint uVar5;
  long lVar6;
  long unaff_x19;
  long lVar7;
  long lVar8;
  
  if (in_NG == in_OV) {
    lVar7 = 0;
    do {
      func_0x0010b3a8("Column %d Order %d SortOrder %d %s Vis %d %s %7.3f UserID 0x%08X");
      lVar7 = lVar7 + 1;
    } while (lVar7 < *(short *)(unaff_x19 + 0xc));
  }
  lVar7 = lRam0000000000a334c0;
  lVar6 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar5 = *(int *)(lVar6 + 0x198) - 1;
  *(uint *)(lVar6 + 0x198) = uVar5;
  uVar3 = 1 << (ulong)(uVar5 & 0x1f);
  uVar5 = *(uint *)(lVar6 + 0x19c);
  if ((uVar5 & uVar3) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar7);
    if ((((&UNK_00004b78)[lVar7] != '\0') && (*(int *)(&UNK_00004bd0 + lVar7) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar7) == lVar6)) {
      lVar8 = *(long *)(&UNK_00004af8 + lVar7);
      iVar2 = *piVar1;
      iVar4 = func_0x000daf30();
      if (iVar4 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar7,lVar8 + (long)iVar2 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar5 = *(uint *)(lVar6 + 0x19c);
  }
  *(uint *)(lVar6 + 0x19c) = uVar5 & uVar3 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

