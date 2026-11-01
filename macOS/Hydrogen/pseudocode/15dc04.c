
long FUN_0015dc04(long *param_1)

{
  undefined1 *puVar1;
  ushort *puVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  ushort uVar6;
  ushort uVar7;
  long lVar8;
  bool bVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  int iVar12;
  long in_x9;
  long lVar13;
  undefined1 *in_x10;
  long lVar14;
  long *in_x11;
  long in_x12;
  int in_w13;
  ulong uVar15;
  long in_x14;
  long in_x15;
  uint uVar16;
  long in_x16;
  long lVar17;
  uint uVar18;
  long in_x17;
  long *plVar19;
  long *plVar20;
  undefined1 *unaff_x19;
  
  iVar12 = (int)param_1;
  uVar18 = (int)in_x16 - iVar12;
  if (param_1 <= (long *)(in_x16 - in_x17)) {
    uVar18 = (uint)in_x17;
  }
  plVar19 = (long *)(in_x16 - (ulong)uVar18);
  uVar18 = in_w13 + uVar18 * -8;
  uVar15 = (ulong)uVar18;
  lVar17 = *plVar19;
  puVar10 = unaff_x19;
  if (uVar18 < 0x41) {
    do {
      uVar18 = (uint)uVar15;
      if (plVar19 < in_x11) {
        if (plVar19 == param_1) {
          plVar19 = param_1;
          goto LAB_0015dd8c;
        }
        uVar16 = (int)plVar19 - iVar12;
        bVar9 = (long *)((long)plVar19 - (uVar15 >> 3)) < param_1;
        if (!bVar9) {
          uVar16 = (uint)(uVar15 >> 3);
        }
        uVar18 = uVar18 + uVar16 * -8;
      }
      else {
        bVar9 = false;
        uVar16 = uVar18 >> 3;
        uVar18 = uVar18 & 7;
      }
      uVar15 = (ulong)uVar18;
      plVar19 = (long *)((long)plVar19 - (ulong)uVar16);
      lVar17 = *plVar19;
      if ((in_x10 <= puVar10) || (bVar9)) goto LAB_0015dd8c;
      puVar2 = (ushort *)(in_x12 + in_x15 * 4);
      uVar7 = *puVar2;
      bVar5 = *(byte *)((long)puVar2 + 3);
      *puVar10 = (char)puVar2[1];
      puVar2 = (ushort *)(in_x12 + in_x14 * 4);
      uVar6 = *puVar2;
      bVar4 = *(byte *)((long)puVar2 + 3);
      uVar18 = uVar18 + bVar5;
      uVar16 = uVar18 + bVar4;
      puVar10[1] = (char)puVar2[1];
      puVar2 = (ushort *)
               (in_x12 + (((ulong)(lVar17 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar5 & 0x3f)) +
                         (ulong)uVar7) * 4);
      bVar5 = *(byte *)((long)puVar2 + 3);
      in_x15 = ((ulong)(lVar17 << ((ulong)uVar16 & 0x3f)) >> ((ulong)-(uint)bVar5 & 0x3f)) +
               (ulong)*puVar2;
      puVar10[2] = (char)puVar2[1];
      puVar2 = (ushort *)
               (in_x12 + (((ulong)(lVar17 << ((ulong)uVar18 & 0x3f)) >> ((ulong)-(uint)bVar4 & 0x3f)
                          ) + (ulong)uVar6) * 4);
      uVar16 = uVar16 + bVar5;
      uVar18 = uVar16 + *(byte *)((long)puVar2 + 3);
      uVar15 = (ulong)uVar18;
      in_x14 = ((ulong)(lVar17 << ((ulong)uVar16 & 0x3f)) >>
               ((ulong)-(uint)*(byte *)((long)puVar2 + 3) & 0x3f)) + (ulong)*puVar2;
      puVar10[3] = (char)puVar2[1];
      puVar10 = puVar10 + 4;
    } while (uVar18 < 0x41);
    plVar19 = (long *)&UNK_008145c8;
  }
  else {
    plVar19 = (long *)&UNK_008145c8;
  }
LAB_0015dd8c:
  puVar11 = (undefined1 *)(in_x9 + -2);
  if (puVar10 <= puVar11) {
    lVar13 = (long)puVar10 - (long)unaff_x19;
    puVar10 = puVar10 + 1;
    lVar14 = 2;
    do {
      puVar2 = (ushort *)(in_x12 + in_x15 * 4);
      uVar7 = *puVar2;
      bVar5 = *(byte *)((long)puVar2 + 3);
      uVar18 = (int)uVar15 + (uint)bVar5;
      puVar10[-1] = (char)puVar2[1];
      in_x15 = in_x14;
      if (0x40 < uVar18) {
LAB_0015dedc:
        *puVar10 = *(undefined1 *)(in_x12 + in_x15 * 4 + 2);
        return lVar14 + lVar13;
      }
      if (plVar19 < in_x11) {
        lVar8 = lVar17;
        plVar20 = param_1;
        if (plVar19 != param_1) {
          uVar16 = (int)plVar19 - iVar12;
          if (param_1 <= (long *)((long)plVar19 - (ulong)(uVar18 >> 3))) {
            uVar16 = uVar18 >> 3;
          }
          uVar18 = uVar18 + uVar16 * -8;
          lVar8 = *(long *)((long)plVar19 - (ulong)uVar16);
          plVar20 = (long *)((long)plVar19 - (ulong)uVar16);
        }
      }
      else {
        uVar16 = uVar18 >> 3;
        uVar18 = uVar18 & 7;
        plVar20 = (long *)((long)plVar19 - (ulong)uVar16);
        lVar8 = *plVar20;
      }
      if (puVar11 < puVar10) {
        return -0x46;
      }
      in_x15 = ((ulong)(lVar17 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar5 & 0x3f)) + (ulong)uVar7;
      puVar2 = (ushort *)(in_x12 + in_x14 * 4);
      uVar7 = *puVar2;
      bVar5 = *(byte *)((long)puVar2 + 3);
      uVar16 = uVar18 + bVar5;
      *puVar10 = (char)puVar2[1];
      if (0x40 < uVar16) {
        puVar10 = puVar10 + 1;
        lVar14 = 3;
        goto LAB_0015dedc;
      }
      if (plVar20 < in_x11) {
        if (plVar20 != param_1) {
          uVar3 = (int)plVar20 - iVar12;
          if (param_1 <= (long *)((long)plVar20 - (ulong)(uVar16 >> 3))) {
            uVar3 = uVar16 >> 3;
          }
          uVar16 = uVar16 + uVar3 * -8;
          goto LAB_0015ddb0;
        }
        lVar17 = lVar8;
        plVar19 = param_1;
      }
      else {
        uVar3 = uVar16 >> 3;
        uVar16 = uVar16 & 7;
LAB_0015ddb0:
        lVar17 = *(long *)((long)plVar20 - (ulong)uVar3);
        plVar19 = (long *)((long)plVar20 - (ulong)uVar3);
      }
      uVar15 = (ulong)uVar16;
      in_x14 = ((ulong)(lVar8 << ((ulong)uVar18 & 0x3f)) >> ((ulong)-(uint)bVar5 & 0x3f)) +
               (ulong)uVar7;
      lVar13 = lVar13 + 2;
      puVar1 = puVar10 + 1;
      puVar10 = puVar10 + 2;
    } while (puVar1 <= puVar11);
  }
  return -0x46;
}

