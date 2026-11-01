
void FUN_000e4a18(void)

{
  int *piVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  
  lVar4 = lRam0000000000a334c0;
  lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar6 = *(int *)(lVar7 + 0x198) - 1;
  *(uint *)(lVar7 + 0x198) = uVar6;
  uVar3 = 1 << (ulong)(uVar6 & 0x1f);
  uVar6 = *(uint *)(lVar7 + 0x19c);
  if ((uVar6 & uVar3) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar4);
    if ((((&UNK_00004b78)[lVar4] != '\0') && (*(int *)(&UNK_00004bd0 + lVar4) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar4) == lVar7)) {
      lVar8 = *(long *)(&UNK_00004af8 + lVar4);
      iVar2 = *piVar1;
      iVar5 = func_0x000daf30();
      if (iVar5 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar4,lVar8 + (long)iVar2 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar6 = *(uint *)(lVar7 + 0x19c);
  }
  *(uint *)(lVar7 + 0x19c) = uVar6 & uVar3 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

