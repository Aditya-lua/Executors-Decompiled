
int thunk_FUN_000a6108(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  byte bVar3;
  int iVar4;
  ushort uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  ushort *unaff_x22;
  byte *pbVar14;
  byte *pbVar15;
  ushort *puVar16;
  long unaff_x23;
  ulong uVar17;
  long unaff_x25;
  int unaff_w27;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  do {
    pbVar14 = (byte *)((long)unaff_x22 + 1);
    uVar5 = *unaff_x22;
    bVar3 = (byte)uVar5 >> 4;
    uVar17 = (ulong)bVar3;
    if (bVar3 == 0xf) {
      lVar6 = 0;
      pbVar15 = pbVar14;
      do {
        pbVar14 = pbVar15 + 1;
        bVar3 = *pbVar15;
        lVar6 = lVar6 + (ulong)bVar3;
        pbVar15 = pbVar14;
      } while ((ulong)bVar3 == 0xff);
      uVar17 = lVar6 + 0xf;
    }
    if ((ulong)(unaff_x25 - unaff_x23) < uVar17) {
      return -1;
    }
    _memmove(unaff_x23,pbVar14,uVar17);
    puVar16 = (ushort *)(pbVar14 + uVar17);
    lVar6 = unaff_x23 + uVar17;
    if ((ulong)(unaff_x25 - lVar6) < 0xc) {
      if (lVar6 != unaff_x25) {
        return -1;
      }
      iVar4 = (int)puVar16 - unaff_w27;
      if (iVar4 < 1) {
        return iVar4;
      }
      *(undefined8 *)(unaff_x19 + 0x18) = unaff_x20;
      *(long *)(unaff_x19 + 8) = unaff_x25;
      return iVar4;
    }
    uVar8 = (ulong)(byte)uVar5 & 0xf;
    unaff_x22 = puVar16 + 1;
    uVar9 = (ulong)*puVar16;
    if ((int)uVar8 == 0xf) {
      lVar7 = 0;
      puVar16 = unaff_x22;
      do {
        unaff_x22 = (ushort *)((long)puVar16 + 1);
        uVar5 = *puVar16;
        lVar7 = lVar7 + (ulong)(byte)uVar5;
        puVar16 = unaff_x22;
      } while ((ulong)(byte)uVar5 == 0xff);
      uVar8 = lVar7 + 0xf;
    }
    uVar1 = uVar8 + 4;
    if ((ulong)(unaff_x25 - lVar6) < uVar1 || (ulong)(lVar6 - unaff_x21) < uVar9) {
      return -1;
    }
    if (uVar1 != 0) {
      lVar7 = -uVar9;
      if ((uVar1 < 8) || ((uVar9 - (uVar17 + unaff_x23)) + lVar6 < 0x40)) {
        uVar9 = 0;
      }
      else {
        if (uVar1 < 0x40) {
          uVar11 = 0;
        }
        else {
          uVar9 = uVar1 & 0xffffffffffffffc0;
          puVar12 = (undefined8 *)(unaff_x23 + uVar17 + 0x20);
          uVar11 = uVar9;
          do {
            puVar2 = (undefined8 *)((long)puVar12 + lVar7);
            uVar18 = puVar2[-4];
            uVar20 = puVar2[-1];
            uVar19 = puVar2[-2];
            uVar22 = puVar2[1];
            uVar21 = *puVar2;
            uVar24 = puVar2[3];
            uVar23 = puVar2[2];
            puVar12[-3] = puVar2[-3];
            puVar12[-4] = uVar18;
            puVar12[-1] = uVar20;
            puVar12[-2] = uVar19;
            puVar12[1] = uVar22;
            *puVar12 = uVar21;
            puVar12[3] = uVar24;
            puVar12[2] = uVar23;
            uVar11 = uVar11 - 0x40;
            puVar12 = puVar12 + 8;
          } while (uVar11 != 0);
          if (uVar1 == uVar9) goto LAB_000a60f8;
          uVar11 = uVar9;
          if ((uVar1 & 0x38) == 0) goto LAB_000a61c4;
        }
        uVar9 = uVar1 & 0xfffffffffffffff8;
        lVar13 = uVar11 - uVar9;
        puVar12 = (undefined8 *)(unaff_x23 + uVar11 + uVar17);
        do {
          *puVar12 = *(undefined8 *)((long)puVar12 + lVar7);
          lVar13 = lVar13 + 8;
          puVar12 = puVar12 + 1;
        } while (lVar13 != 0);
        if (uVar1 == uVar9) goto LAB_000a60f8;
      }
LAB_000a61c4:
      lVar13 = (uVar8 - uVar9) + 4;
      puVar10 = (undefined1 *)(unaff_x23 + uVar9 + uVar17);
      do {
        *puVar10 = puVar10[lVar7];
        lVar13 = lVar13 + -1;
        puVar10 = puVar10 + 1;
      } while (lVar13 != 0);
    }
LAB_000a60f8:
    unaff_x23 = lVar6 + uVar1;
    if ((ulong)(unaff_x25 - unaff_x23) < 5) {
      return -1;
    }
  } while( true );
}

