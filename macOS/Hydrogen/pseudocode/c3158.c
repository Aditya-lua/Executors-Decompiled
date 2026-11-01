
void FUN_000c3158(long param_1,undefined8 param_2,ulong param_3)

{
  undefined8 *puVar1;
  uint uVar2;
  undefined4 uVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  uint uVar7;
  long in_x9;
  long lVar8;
  long *plVar9;
  int iVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long unaff_x19;
  long lVar14;
  ulong uVar15;
  long unaff_x21;
  long lVar16;
  long unaff_x22;
  long unaff_x23;
  
  lVar16 = in_x9 * 0x38;
  plVar6 = (long *)(param_1 + 8);
  do {
    lVar14 = *plVar6;
    if (((lVar14 != 0) && ((*(byte *)(lVar14 + 0x17) >> 3 & 1) != 0)) &&
       ((*(char *)(lVar14 + 0xbe) != '\0' || (*(char *)(lVar14 + 0xbf) != '\0')))) {
      if (((byte)(&UNK_0000156c)[unaff_x23] >> 1 & 1) != 0) {
        func_0x000bae48("[focus] FocusWindow(\"%s\", UnlessBelowModal): prevented by \"%s\".\n");
      }
      if (unaff_x19 == 0) {
        return;
      }
      if (*(long *)(unaff_x19 + 0x388) != unaff_x19) {
        return;
      }
      if ((*(byte *)(unaff_x19 + 0x15) >> 5 & 1) != 0) {
        return;
      }
      lVar16 = *(long *)(unaff_x21 + 0x4c0);
      plVar5 = *(long **)(&UNK_00003fa8 + lVar16);
      plVar6 = plVar5;
      if (*(int *)(&UNK_00003fa0 + lVar16) < 1) {
        uVar7 = 0;
        goto LAB_000c34a8;
      }
      plVar9 = plVar5;
      goto LAB_000c3448;
    }
    plVar6 = plVar6 + 7;
    lVar16 = lVar16 + -0x38;
  } while (lVar16 != 0);
  if ((((unaff_x19 == 0) || ((param_3 & 1) == 0)) ||
      (lVar16 = *(long *)(unaff_x19 + 0x3b0), lVar16 == 0)) || (*(char *)(lVar16 + 0xbf) == '\0')) {
    lVar16 = unaff_x19;
  }
  if (*(long *)(&UNK_00004b18 + unaff_x22) == lVar16) goto LAB_000c3290;
  lVar14 = unaff_x22;
  if (((byte)(&UNK_0000156c)[unaff_x23] >> 1 & 1) != 0) {
    func_0x000bae48("[focus] SetNavWindow(\"%s\")\n");
    lVar14 = *(long *)(unaff_x21 + 0x4c0);
  }
  *(long *)(&UNK_00004b18 + unaff_x22) = lVar16;
  *(undefined8 *)(&UNK_00004b70 + unaff_x22) = 0xffffffffffffffff;
  *(undefined2 *)(unaff_x23 + 0xf0) = 0;
  *(undefined1 *)(unaff_x23 + 0xad) = 0;
  if ((&UNK_00004bc1)[lVar14] == '\0') {
    (&UNK_00004b7c)[lVar14] = (&UNK_00004b7d)[lVar14] != '\0';
    if (lVar16 != 0) goto LAB_000c3230;
LAB_000c3268:
    uVar3 = 0;
    *(undefined4 *)(unaff_x23 + 0x50) = 0;
    *(undefined4 *)(unaff_x23 + 0x98) = 0;
  }
  else {
    (&UNK_00004b7c)[lVar14] = 1;
    if (lVar16 == 0) goto LAB_000c3268;
LAB_000c3230:
    if (*(char *)(unaff_x23 + 0xab) != '\0') {
      *(undefined1 *)(unaff_x23 + 0xa9) = 1;
    }
    *(undefined4 *)(unaff_x23 + 0x50) = *(undefined4 *)(lVar16 + 0x3b8);
    *(undefined4 *)(unaff_x23 + 0x98) = 0;
    uVar3 = *(undefined4 *)(lVar16 + 0x3f0);
  }
  func_0x000d31a8(uVar3);
  *(undefined1 *)(unaff_x23 + 0xa8) = 0;
  *(undefined8 *)(&UNK_00004b70 + unaff_x22) = 0xffffffffffffffff;
  func_0x000c3bdc(lVar16,0);
LAB_000c3290:
  if (lVar16 == 0) {
    lVar14 = 0;
    iVar10 = *(int *)(&UNK_00004064 + unaff_x22);
  }
  else {
    lVar14 = *(long *)(lVar16 + 0x388);
    iVar10 = *(int *)(&UNK_00004064 + unaff_x22);
  }
  if (((iVar10 != 0) && (*(long *)(&UNK_00004080 + unaff_x22) != 0)) &&
     ((*(long *)(*(long *)(&UNK_00004080 + unaff_x22) + 0x388) != lVar14 &&
      ((&UNK_00004072)[unaff_x22] == '\0')))) {
    func_0x000c23ac(0,0);
  }
  if (lVar16 != 0) {
    lVar11 = *(long *)(unaff_x21 + 0x4c0);
    lVar8 = *(long *)(&UNK_00003fb8 + lVar11);
    lVar4 = (long)*(int *)(&UNK_00003fb0 + lVar11) + -1;
    if (*(long *)(lVar8 + lVar4 * 8) != lVar14) {
      if ((int)*(short *)(lVar14 + 0xd4) < (int)lVar4) {
        lVar12 = (long)(int)*(short *)(lVar14 + 0xd4);
        do {
          puVar1 = (undefined8 *)(lVar8 + lVar12 * 8);
          *puVar1 = puVar1[1];
          lVar8 = *(long *)(&UNK_00003fb8 + lVar11);
          lVar13 = *(long *)(lVar8 + lVar12 * 8);
          lVar12 = lVar12 + 1;
          *(short *)(lVar13 + 0xd4) = *(short *)(lVar13 + 0xd4) + -1;
        } while (lVar4 != lVar12);
      }
      *(long *)(lVar8 + lVar4 * 8) = lVar14;
      *(short *)(lVar14 + 0xd4) = (short)lVar4;
    }
    if (((*(uint *)(lVar14 + 0x14) | *(uint *)(lVar16 + 0x14)) >> 0xd & 1) == 0) {
      lVar8 = *(long *)(unaff_x21 + 0x4c0);
      lVar16 = *(long *)(&UNK_00003fa8 + lVar8);
      uVar7 = *(int *)(&UNK_00003fa0 + lVar8) - 1;
      uVar15 = (ulong)uVar7;
      lVar4 = *(long *)(lVar16 + (long)(int)uVar7 * 8);
      if ((lVar4 != lVar14) &&
         (1 < *(int *)(&UNK_00003fa0 + lVar8) && *(long *)(lVar4 + 0x388) != lVar14)) {
        lVar4 = 0;
        do {
          uVar2 = (int)uVar15 - 1;
          uVar15 = (ulong)uVar2;
          if (*(long *)(lVar16 + uVar15 * 8) == lVar14) {
            uVar2 = 1 - (int)lVar4;
            _memmove(lVar16 + uVar15 * 8,lVar16 + (ulong)uVar7 * 8 + lVar4 * 8,
                     -(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
            *(long *)(*(long *)(&UNK_00003fa8 + lVar8) + (long)*(int *)(&UNK_00003fa0 + lVar8) * 8 +
                     -8) = lVar14;
            return;
          }
          lVar4 = lVar4 + -1;
        } while (0 < (int)uVar2);
      }
    }
  }
  return;
  while (plVar9 = plVar9 + 1, plVar9 < plVar5 + *(int *)(&UNK_00003fa0 + lVar16)) {
LAB_000c3448:
    if (*plVar9 == unaff_x19) break;
  }
  uVar7 = (uint)((ulong)((long)plVar9 - (long)plVar5) >> 3);
  do {
    if (*plVar6 == *(long *)(lVar14 + 0x388)) break;
    plVar6 = plVar6 + 1;
  } while (plVar6 < plVar5 + *(int *)(&UNK_00003fa0 + lVar16));
LAB_000c34a8:
  uVar15 = (long)plVar6 - (long)plVar5;
  iVar10 = (int)(uVar15 >> 3);
  if ((int)uVar7 < iVar10) {
    _memmove(plVar5 + (int)uVar7,plVar5 + (int)uVar7 + 1,
             -(ulong)(iVar10 + ~uVar7 >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar10 + ~uVar7) << 3)
    ;
    plVar6 = (long *)(*(long *)(&UNK_00003fa8 + lVar16) +
                     ((long)(uVar15 * 0x20000000 + -0x100000000) >> 0x20) * 8);
  }
  else {
    lVar14 = (long)(uVar15 * 0x20000000) >> 0x20;
    _memmove(plVar5 + ((long)(uVar15 * 0x20000000 + 0x100000000) >> 0x20),plVar5 + lVar14,
             -(ulong)(uVar7 - iVar10 >> 0x1f) & 0xfffffff800000000 | (ulong)(uVar7 - iVar10) << 3);
    plVar6 = (long *)(*(long *)(&UNK_00003fa8 + lVar16) + lVar14 * 8);
  }
  *plVar6 = unaff_x19;
  return;
}

