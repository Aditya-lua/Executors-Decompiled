
undefined8 FUN_006fd578(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long unaff_x19;
  undefined8 uVar11;
  undefined8 *puVar12;
  
  iVar2 = func_0x006e6bc0(param_1,2);
  iVar3 = func_0x006e6bc0();
  iVar4 = func_0x006e6bc0();
  iVar5 = func_0x006e21f8();
  iVar6 = 5;
  if (iVar5 < 1) {
    iVar6 = 1;
  }
  func_0x006e69bc();
  if (iVar3 < iVar2) {
LAB_006fd64c:
    func_0x006e2154();
    return 1;
  }
  if ((iVar2 < 1) && (iVar2 + 0x7fffffff <= iVar3)) {
    func_0x006e63b0();
  }
  else if (iVar4 <= (int)(iVar3 - iVar2 ^ 0x7fffffffU)) {
    lVar9 = *(long *)(*(long *)(unaff_x19 + 0x10) + (ulong)(iVar6 - 1) * 0x10);
    if (*(char *)(lVar9 + 4) == '\0') {
      if ((0 < iVar4) &&
         (iVar6 = *(int *)(lVar9 + 8), iVar4 + -1 <= iVar6 && iVar6 < iVar4 + (iVar3 - iVar2))) {
        func_0x006faff0();
      }
      func_0x006fdac0();
      goto LAB_006fd64c;
    }
    goto LAB_006fd698;
  }
  func_0x006e63b0();
LAB_006fd698:
  lVar9 = func_0x006ed124();
  uVar7 = func_0x006e6bc0(lVar9,1);
  if (-1 < (int)uVar7) {
    iVar6 = func_0x006e21f8(lVar9,2);
    func_0x006e4118(lVar9,uVar7,0);
    if ((0 < iVar6) && ((int)uVar7 != 0)) {
      lVar10 = 0;
      lVar1 = *(long *)(lVar9 + 0x10);
      lVar9 = *(long *)(*(long *)(lVar9 + 8) + -0x10);
      do {
        uVar11 = *(undefined8 *)(lVar1 + 0x10);
        puVar12 = (undefined8 *)(*(long *)(lVar9 + 0x18) + lVar10);
        puVar12[1] = *(undefined8 *)(lVar1 + 0x18);
        *puVar12 = uVar11;
        lVar10 = lVar10 + 0x10;
      } while ((uVar7 & 0xffffffff) * 0x10 != lVar10);
    }
    return 1;
  }
  lVar9 = func_0x006e63b0(lVar9,1,"size out of range");
  func_0x006e69bc(lVar9,1,6);
  func_0x006e6a04(lVar9,2);
  uVar7 = func_0x006e6c08(lVar9,3,1);
  if ((int)uVar7 < 1) {
    lVar9 = func_0x006e63b0(lVar9,3,"index out of range");
    func_0x006e69bc(lVar9,1,6);
    if (*(char *)(**(long **)(lVar9 + 0x10) + 4) == '\0') {
      func_0x006fc49c();
      return 0;
    }
    uVar11 = func_0x006ed124(lVar9);
    func_0x006e69bc(uVar11,1,6);
    iVar6 = func_0x006e421c(uVar11,1);
    if (iVar6 == 0) {
      iVar6 = func_0x006e6dc8(uVar11,1,"__metatable");
      if (iVar6 == 0) {
        func_0x006e41a4(uVar11,1,1);
        func_0x006e2154(uVar11,1);
        return 1;
      }
    }
    else {
      func_0x006e63b0(uVar11,1,"table is already frozen");
    }
    uVar11 = func_0x006e63b0(uVar11,1,"table has a protected metatable");
    func_0x006e69bc(uVar11,1,6);
    uVar8 = func_0x006e421c(uVar11,1);
    func_0x006e3c24(uVar11,uVar8);
    return 1;
  }
  puVar12 = *(undefined8 **)(lVar9 + 0x10);
  uVar11 = *puVar12;
  lVar10 = func_0x006fb65c(uVar11,uVar7);
  iVar6 = *(int *)(lVar10 + 0xc);
  if (iVar6 != 0) {
    do {
      if ((*(int *)((long)puVar12 + 0x1c) == iVar6) &&
         (iVar6 = func_0x00702b78(lVar9,puVar12 + 2,lVar10), iVar6 != 0)) {
        func_0x006e3870(lVar9,uVar7);
        return 1;
      }
      uVar7 = (ulong)((int)uVar7 + 1);
      lVar10 = func_0x006fb65c(uVar11,uVar7);
      iVar6 = *(int *)(lVar10 + 0xc);
    } while (iVar6 != 0);
  }
  func_0x006e383c(lVar9);
  return 1;
}

