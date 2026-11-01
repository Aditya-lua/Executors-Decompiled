
undefined8 FUN_006fd3f4(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  double *pdVar7;
  long lVar8;
  long unaff_x19;
  long lVar9;
  long lVar10;
  
  func_0x006e69bc();
  lVar9 = **(long **)(unaff_x19 + 0x10);
  iVar3 = func_0x006fc150(lVar9);
  if (*(char *)(lVar9 + 4) != '\0') {
    lVar9 = func_0x006ed124();
    uVar5 = func_0x006e1e34();
    func_0x006e4118(lVar9,uVar5,1);
    lVar10 = *(long *)(*(long *)(lVar9 + 8) + -0x10);
    if (0 < (int)uVar5) {
      lVar8 = 0;
      do {
        puVar1 = (undefined8 *)(*(long *)(lVar9 + 0x10) + lVar8);
        uVar6 = *puVar1;
        puVar2 = (undefined8 *)(*(long *)(lVar10 + 0x18) + lVar8);
        puVar2[1] = puVar1[1];
        *puVar2 = uVar6;
        lVar8 = lVar8 + 0x10;
      } while ((uVar5 & 0xffffffff) * 0x10 != lVar8);
    }
    uVar6 = func_0x006f6ef8(lVar9,"n",1);
    pdVar7 = (double *)func_0x006fbf4c(lVar9,lVar10,uVar6);
    *pdVar7 = (double)(int)uVar5;
    *(undefined4 *)((long)pdVar7 + 0xc) = 3;
    return 1;
  }
  iVar4 = func_0x006e21f8();
  if (iVar4 < 1) {
    func_0x006e1d54();
  }
  else {
    func_0x006e69bc();
    func_0x006e1d54();
  }
  if (0 < iVar3) {
    func_0x006fdd04();
  }
  return 0;
}

