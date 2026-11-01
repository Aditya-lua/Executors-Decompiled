
void FUN_000172a8(void)

{
  long lVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar5;
  undefined1 *puVar4;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long *unaff_x19;
  ulong unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x24 | 0x8000000000000000;
  *unaff_x19 = unaff_x26;
  puVar3 = (undefined1 *)(*unaff_x19 + unaff_x22);
  if (unaff_x21 != unaff_x23) {
    if (unaff_x20 < 0x40) {
      puVar2 = puVar3;
      puVar5 = unaff_x23;
    }
    else {
      lVar1 = unaff_x22 + *unaff_x19;
      if ((ulong)(lVar1 - (long)unaff_x23) < 0x40) {
        puVar2 = puVar3;
        puVar5 = unaff_x23;
      }
      else {
        uVar6 = unaff_x20 & 0xffffffffffffffc0;
        puVar5 = unaff_x23 + uVar6;
        puVar3 = puVar3 + uVar6;
        puVar7 = (undefined8 *)(unaff_x23 + 0x20);
        puVar8 = (undefined8 *)(lVar1 + 0x20);
        uVar9 = uVar6;
        do {
          uVar10 = puVar7[-4];
          uVar12 = puVar7[-1];
          uVar11 = puVar7[-2];
          uVar14 = puVar7[1];
          uVar13 = *puVar7;
          uVar16 = puVar7[3];
          uVar15 = puVar7[2];
          puVar8[-3] = puVar7[-3];
          puVar8[-4] = uVar10;
          puVar8[-1] = uVar12;
          puVar8[-2] = uVar11;
          puVar8[1] = uVar14;
          *puVar8 = uVar13;
          puVar8[3] = uVar16;
          puVar8[2] = uVar15;
          uVar9 = uVar9 - 0x40;
          puVar7 = puVar7 + 8;
          puVar8 = puVar8 + 8;
        } while (uVar9 != 0);
        puVar2 = puVar3;
        if (unaff_x20 == uVar6) goto LAB_0001741c;
      }
    }
    do {
      puVar4 = puVar5 + 1;
      puVar3 = puVar2 + 1;
      *puVar2 = *puVar5;
      puVar2 = puVar3;
      puVar5 = puVar4;
    } while (puVar4 != unaff_x21);
  }
LAB_0001741c:
  *puVar3 = 0;
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19[1] = unaff_x20 + unaff_x22;
  }
  else {
    *(byte *)((long)unaff_x19 + 0x17) = (byte)(unaff_x20 + unaff_x22) & 0x7f;
  }
  return;
}

