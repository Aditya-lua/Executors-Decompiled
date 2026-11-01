
void FUN_00093f68(void)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined8 *puVar13;
  long unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  
  do {
    uVar2 = __Znam();
    unaff_x19[unaff_x27] = uVar2;
    unaff_x27 = unaff_x27 + 1;
  } while (unaff_x26 != unaff_x27);
  uVar1 = *(uint *)(unaff_x22 + 0x2c0);
  if (uVar1 != 0) {
    lVar3 = *(long *)(unaff_x22 + 0x2f8);
    if (lVar3 == 0) {
      puVar13 = unaff_x19;
      do {
        _bzero(*puVar13,(ulong)uVar1 << 3);
        unaff_x26 = unaff_x26 + -1;
        puVar13 = puVar13 + 1;
      } while (unaff_x26 != 0);
    }
    else {
      uVar4 = 0;
      lVar5 = 0;
      do {
        uVar6 = 0;
        lVar7 = unaff_x19[lVar5];
        uVar8 = uVar4;
        do {
          uVar9 = 0;
          uVar10 = uVar8;
          lVar11 = lVar3;
          do {
            while (uVar10 < unaff_x21) {
              uVar9 = (ulong)*(byte *)(unaff_x20 + uVar10) | uVar9 << 8;
              uVar10 = uVar10 + 1;
              lVar11 = lVar11 + -1;
              if (lVar11 == 0) goto LAB_00093fb8;
            }
            uVar12 = uVar9 << 8;
            uVar9 = uVar9 << 8 | 0x80;
            if (unaff_x21 != uVar10) {
              uVar9 = uVar12;
            }
            uVar10 = uVar10 + 1;
            lVar11 = lVar11 + -1;
          } while (lVar11 != 0);
LAB_00093fb8:
          *(ulong *)(lVar7 + uVar6 * 8) = uVar9;
          uVar6 = uVar6 + 1;
          uVar8 = uVar8 + 8;
        } while (uVar6 != uVar1);
        lVar5 = lVar5 + 1;
        uVar4 = uVar4 + 0x80;
      } while (lVar5 != unaff_x26);
    }
  }
  lVar3 = unaff_x19[unaff_x25 + -1];
  *(undefined8 *)(lVar3 + (ulong)(uVar1 - 1) * 8) = unaff_x24;
  *(undefined8 *)(lVar3 + (ulong)(uVar1 - 2) * 8) = 0;
  return;
}

