
undefined8 FUN_006fd408(int param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  double *pdVar7;
  long lVar8;
  long unaff_x20;
  long lVar9;
  
  if (*(char *)(unaff_x20 + 4) != '\0') {
    lVar4 = func_0x006ed124();
    uVar5 = func_0x006e1e34();
    func_0x006e4118(lVar4,uVar5,1);
    lVar9 = *(long *)(*(long *)(lVar4 + 8) + -0x10);
    if (0 < (int)uVar5) {
      lVar8 = 0;
      do {
        puVar1 = (undefined8 *)(*(long *)(lVar4 + 0x10) + lVar8);
        uVar6 = *puVar1;
        puVar2 = (undefined8 *)(*(long *)(lVar9 + 0x18) + lVar8);
        puVar2[1] = puVar1[1];
        *puVar2 = uVar6;
        lVar8 = lVar8 + 0x10;
      } while ((uVar5 & 0xffffffff) * 0x10 != lVar8);
    }
    uVar6 = func_0x006f6ef8(lVar4,"n",1);
    pdVar7 = (double *)func_0x006fbf4c(lVar4,lVar9,uVar6);
    *pdVar7 = (double)(int)uVar5;
    *(undefined4 *)((long)pdVar7 + 0xc) = 3;
    return 1;
  }
  iVar3 = func_0x006e21f8();
  if (iVar3 < 1) {
    func_0x006e1d54();
  }
  else {
    func_0x006e69bc();
    func_0x006e1d54();
  }
  if (0 < param_1) {
    func_0x006fdd04();
  }
  return 0;
}

