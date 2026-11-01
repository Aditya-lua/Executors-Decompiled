
char FUN_00732d8c(void)

{
  char cVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x24;
  undefined8 unaff_x25;
  long lVar9;
  undefined1 auVar10 [16];
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  
code_r0x00732d8c:
  lVar6 = func_0x00740a58(in_stack_00000018);
  if (lVar6 == 0) goto LAB_00732dec;
code_r0x00732d98:
  lVar9 = 0;
  do {
    lVar7 = func_0x00156654(lVar6);
    iVar2 = _strcmp(unaff_x25,*(undefined8 *)(lVar7 + 0x38));
    if (iVar2 == 0) {
      lVar9 = lVar9 + 1;
    }
    lVar6 = func_0x006f4058(lVar6);
  } while (lVar6 != 0);
  do {
    if ((unaff_x24 == 0) || (lVar9 != 0)) {
LAB_00732e10:
      cVar1 = in_stack_00000010 <= lVar9 + unaff_x22;
      if (((bool)cVar1) || (in_stack_00000008 == 0)) goto LAB_00732ea4;
      lVar6 = func_0x006f4058(unaff_x19 + 0x58);
      uVar8 = *(long *)(unaff_x19 + 0x30) + lVar6;
      if (uVar8 < in_stack_00000008) goto LAB_00732e98;
      lVar9 = func_0x007330bc();
      break;
    }
    if (unaff_x22 < in_stack_00000010) {
      lVar9 = 0;
      goto LAB_00732e10;
    }
    auVar10 = func_0x00782d28();
    lVar6 = func_0x00740a58(unaff_x24);
    lVar9 = 0;
    if (lVar6 == 0) goto LAB_00732e10;
    lVar9 = 0;
    lVar7 = -1;
    do {
      lVar3 = func_0x00156654(lVar6);
      lVar4 = func_0x006f4058(lVar3 + 0x3c8);
      lVar5 = lVar7;
      if (lVar4 == 0) {
        lVar5 = func_0x00782dc4(auVar10._0_8_,auVar10._8_8_,*(undefined8 *)(lVar3 + 0x228),
                                *(undefined8 *)(lVar3 + 0x230));
        if (lVar5 <= lVar7) {
          lVar5 = lVar7;
          lVar3 = lVar9;
        }
        lVar9 = lVar3;
      }
      lVar6 = func_0x006f4058(lVar6);
      lVar7 = lVar5;
    } while (lVar6 != 0);
    if (lVar9 == 0) {
      lVar9 = 0;
      goto LAB_00732e10;
    }
    func_0x00732ed0();
    unaff_x24 = func_0x0074dc7c();
    if (unaff_x24 != 0) {
      unaff_x22 = func_0x006f4058(unaff_x24);
      unaff_x25 = *(undefined8 *)(unaff_x21 + 0x38);
      goto code_r0x00732d8c;
    }
    unaff_x22 = 0;
    unaff_x25 = *(undefined8 *)(unaff_x21 + 0x38);
    lVar6 = func_0x00740a58(in_stack_00000018);
    if (lVar6 != 0) goto code_r0x00732d98;
LAB_00732dec:
    lVar9 = 0;
  } while( true );
joined_r0x00732e50:
  if (lVar9 == 0) {
    uVar8 = *(long *)(unaff_x19 + 0x30) + lVar6;
LAB_00732e98:
    cVar1 = (in_stack_00000008 <= uVar8) << 1;
LAB_00732ea4:
    *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
    if ((*(long *)(unaff_x19 + 0x88) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
      func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
    }
    return cVar1;
  }
  func_0x00732ed0();
  lVar6 = func_0x006f4058(unaff_x19 + 0x58);
  uVar8 = *(long *)(unaff_x19 + 0x30) + lVar6;
  if (uVar8 < in_stack_00000008) goto LAB_00732e98;
  lVar9 = func_0x007330bc();
  goto joined_r0x00732e50;
}

