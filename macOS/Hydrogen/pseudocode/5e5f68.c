
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005e5f68(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined8 *unaff_x19;
  ulong *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  while (unaff_x21 = unaff_x21 + -0x40, unaff_x21 != 0) {
    while( true ) {
      uVar14 = *unaff_x20;
      *unaff_x20 = uVar14 + unaff_x22;
      LORelease();
      if (3 < uVar14 && (uVar14 & 2) == 0) break;
      unaff_x20 = unaff_x20 + 8;
      unaff_x21 = unaff_x21 + -0x40;
      if (unaff_x21 == 0) goto LAB_005e5f78;
    }
    func_0x007b0f88(unaff_x20);
    unaff_x20 = unaff_x20 + 8;
  }
LAB_005e5f78:
  uVar13 = _UNK_008b9818;
  uVar12 = _UNK_008b9810;
  uVar11 = _UNK_008b9808;
  uVar10 = _UNK_008b9800;
  uVar9 = _UNK_008b97f8;
  uVar8 = _UNK_008b97f0;
  uVar7 = _UNK_008b97e8;
  uVar6 = _UNK_008b97e0;
  uVar5 = _UNK_008b97d8;
  uVar4 = _UNK_008b97d0;
  uVar3 = _UNK_008b97c8;
  uVar2 = _UNK_008b97c0;
  uVar1 = _UNK_008b97b0;
  unaff_x19[1] = _UNK_008b97b8;
  *unaff_x19 = uVar1;
  unaff_x19[3] = uVar3;
  unaff_x19[2] = uVar2;
  unaff_x19[0xb] = uVar11;
  unaff_x19[10] = uVar10;
  unaff_x19[0xd] = uVar13;
  unaff_x19[0xc] = uVar12;
  unaff_x19[7] = uVar7;
  unaff_x19[6] = uVar6;
  unaff_x19[9] = uVar9;
  unaff_x19[8] = uVar8;
  unaff_x19[5] = uVar5;
  unaff_x19[4] = uVar4;
  *(undefined2 *)(unaff_x19 + 0xe) = 0;
  unaff_x19[0x10] = 0;
  unaff_x19[0xf] = 0;
  unaff_x19[0x12] = 0;
  unaff_x19[0x11] = 0;
  *(undefined1 *)(unaff_x19 + 0x13) = 0;
  return;
}

