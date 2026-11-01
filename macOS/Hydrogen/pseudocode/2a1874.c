
undefined8 FUN_002a1874(void)

{
  long *plVar1;
  uint uVar2;
  long *plVar3;
  int iVar4;
  undefined8 uVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  long *unaff_x19;
  
  func_0x00373e9c(0xa29210,&DAT_0029be70);
  iVar4 = (int)unaff_x19[2];
  if (iVar4 == iRam0000000000a398d0) {
    uVar5 = func_0x0029ae04();
  }
  else {
    plVar1 = unaff_x19;
    plVar3 = (long *)0xa398c0;
    if (iVar4 != 0) {
      plVar1 = (long *)0xa398c0;
      plVar3 = unaff_x19;
    }
    iVar4 = func_0x0029d99c(*plVar1,(long)(int)plVar1[1],*plVar3,(long)(int)plVar3[1]);
    if (iVar4 < 0) {
      uVar5 = func_0x0029b864();
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      uVar2 = *(uint *)(unaff_x19 + 1);
      uVar8 = (ulong)uVar2;
      lVar9 = uVar8 * 8;
      do {
        lVar9 = lVar9 + -8;
        uVar7 = (uint)uVar8;
        uVar8 = (ulong)(uVar7 - 1);
        uVar6 = uVar2 & (int)uVar2 >> 0x1f;
        if ((int)uVar7 < 1) goto code_r0x0029ad5c;
      } while (*(long *)(*unaff_x19 + lVar9) == 0);
      uVar6 = uVar7;
code_r0x0029ad5c:
      *(uint *)(unaff_x19 + 1) = uVar6;
      iVar4 = 1;
    }
    else {
      uVar5 = func_0x0029b864();
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      uVar2 = *(uint *)(unaff_x19 + 1);
      uVar8 = (ulong)uVar2;
      lVar9 = uVar8 * 8;
      do {
        lVar9 = lVar9 + -8;
        uVar7 = (uint)uVar8;
        uVar8 = (ulong)(uVar7 - 1);
        uVar6 = uVar2 & (int)uVar2 >> 0x1f;
        if ((int)uVar7 < 1) goto code_r0x0029ad10;
      } while (*(long *)(*unaff_x19 + lVar9) == 0);
      uVar6 = uVar7;
code_r0x0029ad10:
      iVar4 = 0;
      *(uint *)(unaff_x19 + 1) = uVar6;
    }
    uVar5 = 1;
  }
  *(int *)(unaff_x19 + 2) = iVar4;
  return uVar5;
}

