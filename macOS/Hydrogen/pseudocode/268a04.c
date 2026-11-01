
void FUN_00268a04(ulong param_1)

{
  long lVar1;
  uint uVar2;
  byte bVar3;
  byte bVar4;
  byte *pbVar5;
  ulong uVar6;
  long in_x10;
  ulong uVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  char unaff_w22;
  long unaff_x23;
  ulong unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  
  uVar6 = 1;
  do {
    if ((uVar6 < unaff_x20) && (*(char *)(unaff_x21 + uVar6) == '.')) {
      lVar1 = uVar6 + unaff_x24;
      uVar7 = lVar1 - param_1;
      lVar8 = unaff_x24 - param_1;
      lVar9 = 0;
      if (param_1 <= unaff_x24) {
        lVar9 = lVar8;
      }
      pbVar5 = (byte *)(unaff_x23 + param_1);
      goto LAB_00268a54;
    }
    uVar6 = uVar6 + 1;
  } while (in_x10 + uVar6 != 1);
LAB_00268b10:
  *(undefined1 *)(unaff_x19 + 1) = 0;
  goto LAB_00268b14;
  while( true ) {
    bVar3 = *pbVar5;
    bVar4 = *(byte *)(unaff_x21 + uVar6);
    uVar2 = bVar3 | 0x20;
    if (0x19 < bVar3 - 0x41) {
      uVar2 = (uint)bVar3;
    }
    uVar10 = bVar4 | 0x20;
    if (0x19 < bVar4 - 0x41) {
      uVar10 = (uint)bVar4;
    }
    if (uVar2 != uVar10) goto LAB_00268b10;
    uVar6 = uVar6 + 1;
    lVar9 = lVar9 + -1;
    pbVar5 = pbVar5 + 1;
    lVar8 = lVar8 + -1;
    if (lVar8 == 0) break;
LAB_00268a54:
    if ((lVar9 == 0) || (unaff_x20 == uVar6)) goto LAB_00268b10;
  }
  if (bVar3 == 0x2e) {
    unaff_x25 = unaff_x26;
    goto LAB_00268b14;
  }
  if (uVar7 != unaff_x20) {
    if (unaff_w22 != '\x02') {
      if ((unaff_x20 <= uVar7) || (*(char *)(unaff_x21 + uVar7) != '.')) goto LAB_00268b10;
      uVar7 = lVar1 + ~param_1 + 2;
    }
    if (uVar7 != unaff_x20) goto LAB_00268b10;
  }
  *(undefined1 *)(unaff_x19 + 1) = 1;
LAB_00268b14:
  *unaff_x19 = unaff_x25;
  return;
}

