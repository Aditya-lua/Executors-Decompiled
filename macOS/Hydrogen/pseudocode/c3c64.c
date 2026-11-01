
/* WARNING: Removing unreachable block (ram,0x000c30c8) */
/* WARNING: Removing unreachable block (ram,0x000c30d4) */
/* WARNING: Removing unreachable block (ram,0x000c30e0) */
/* WARNING: Removing unreachable block (ram,0x000c3158) */
/* WARNING: Removing unreachable block (ram,0x000c3174) */
/* WARNING: Removing unreachable block (ram,0x000c317c) */
/* WARNING: Removing unreachable block (ram,0x000c3184) */
/* WARNING: Removing unreachable block (ram,0x000c318c) */
/* WARNING: Removing unreachable block (ram,0x000c3168) */
/* WARNING: Removing unreachable block (ram,0x000c3194) */
/* WARNING: Removing unreachable block (ram,0x000c30e8) */
/* WARNING: Removing unreachable block (ram,0x000c3100) */
/* WARNING: Removing unreachable block (ram,0x000c3108) */
/* WARNING: Removing unreachable block (ram,0x000c3110) */
/* WARNING: Removing unreachable block (ram,0x000c3118) */
/* WARNING: Removing unreachable block (ram,0x000c3120) */
/* WARNING: Removing unreachable block (ram,0x000c312c) */
/* WARNING: Removing unreachable block (ram,0x000c3130) */
/* WARNING: Removing unreachable block (ram,0x000c3138) */
/* WARNING: Removing unreachable block (ram,0x000c3140) */
/* WARNING: Removing unreachable block (ram,0x000c314c) */
/* WARNING: Removing unreachable block (ram,0x000c33f4) */
/* WARNING: Removing unreachable block (ram,0x000c3150) */
/* WARNING: Removing unreachable block (ram,0x000c33fc) */
/* WARNING: Removing unreachable block (ram,0x000c3410) */
/* WARNING: Removing unreachable block (ram,0x000c3414) */
/* WARNING: Removing unreachable block (ram,0x000c3420) */
/* WARNING: Removing unreachable block (ram,0x000c3428) */
/* WARNING: Removing unreachable block (ram,0x000c34a0) */
/* WARNING: Removing unreachable block (ram,0x000c343c) */
/* WARNING: Removing unreachable block (ram,0x000c3448) */
/* WARNING: Removing unreachable block (ram,0x000c3454) */
/* WARNING: Removing unreachable block (ram,0x000c3460) */
/* WARNING: Removing unreachable block (ram,0x000c346c) */
/* WARNING: Removing unreachable block (ram,0x000c3478) */
/* WARNING: Removing unreachable block (ram,0x000c3484) */
/* WARNING: Removing unreachable block (ram,0x000c34a8) */
/* WARNING: Removing unreachable block (ram,0x000c34e8) */
/* WARNING: Removing unreachable block (ram,0x000c34b8) */
/* WARNING: Removing unreachable block (ram,0x000c3514) */
/* WARNING: Removing unreachable block (ram,0x000c30f4) */
/* WARNING: Removing unreachable block (ram,0x000c31a4) */
/* WARNING: Removing unreachable block (ram,0x000c31ac) */

void FUN_000c3c64(long param_1,long param_2)

{
  bool bVar1;
  undefined *puVar2;
  undefined8 *puVar3;
  int *piVar4;
  int iVar5;
  uint uVar6;
  undefined4 uVar7;
  int iVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long in_x9;
  int iVar12;
  uint uVar13;
  long in_x10;
  long lVar14;
  long lVar15;
  long in_x11;
  long lVar16;
  long in_x12;
  long in_x13;
  long lVar17;
  int unaff_w19;
  long lVar18;
  long unaff_x20;
  
  do {
    if (in_x13 == 0) {
LAB_000c3c50:
      in_x12 = in_x12 + 1;
      if (in_x12 == in_x9) break;
    }
    else {
      if (*(long *)(param_2 + 0x388) != in_x13) {
        lVar17 = param_2;
        do {
          if (lVar17 == in_x13) goto LAB_000c3c28;
          lVar17 = *(long *)(lVar17 + 0x380);
        } while (lVar17 != 0);
        goto LAB_000c3c50;
      }
LAB_000c3c28:
      do {
        in_x12 = unaff_x20 + 1;
        if (in_x12 == in_x9) {
          return;
        }
        lVar17 = *(long *)(in_x10 + in_x12 * in_x11 + 8);
        unaff_x20 = in_x12;
      } while ((lVar17 == 0) || ((*(byte *)(lVar17 + 0x17) & 1) != 0));
    }
    in_x13 = *(long *)(in_x10 + in_x12 * in_x11 + 8);
  } while( true );
  iVar12 = (int)unaff_x20;
  if ((int)in_x9 <= iVar12) {
    return;
  }
  if (((byte)(&UNK_0000156c)[param_1] >> 2 & 1) != 0) {
    func_0x000bae48("[popup] ClosePopupsOverWindow(\"%s\")\n");
  }
  lVar17 = lRam0000000000a334c0;
  piVar4 = (int *)(&UNK_00004ad0 + lRam0000000000a334c0);
  if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 2 & 1) != 0) {
    func_0x000bae48("[popup] ClosePopupToLevel(%d), restore_focus_to_window_under_popup=%d\n");
  }
  lVar9 = *(long *)(&UNK_00004ad8 + lVar17) + (long)iVar12 * 0x38;
  lVar18 = *(long *)(lVar9 + 8);
  lVar9 = *(long *)(lVar9 + 0x10);
  iVar8 = *(int *)(&UNK_00004ad4 + lVar17);
  if (iVar8 < iVar12) {
    if (iVar8 == 0) {
      iVar8 = 8;
    }
    else {
      iVar5 = iVar8;
      if (iVar8 < 0) {
        iVar5 = iVar8 + 1;
      }
      iVar8 = iVar8 + (iVar5 >> 1);
    }
    if (iVar8 <= iVar12) {
      iVar8 = iVar12;
    }
    func_0x000eadcc(piVar4,iVar8);
  }
  *piVar4 = iVar12;
  lVar17 = lRam0000000000a334c0;
  if (unaff_w19 == 0) {
    return;
  }
  if ((lVar18 != 0) && ((*(byte *)(lVar18 + 0x17) >> 4 & 1) != 0)) {
    lVar9 = *(long *)(lVar18 + 0x378);
  }
  if (lVar9 == 0) {
    lVar9 = 0;
  }
  else if (!(lVar18 == 0 || *(char *)(lVar9 + 0xbf) != '\0')) {
    if (lVar18 == 0) {
      iVar12 = *(int *)(&UNK_00003fb0 + lRam0000000000a334c0);
joined_r0x000c96ec:
      uVar13 = iVar12 - 1;
    }
    else {
      if ((*(byte *)(lVar18 + 0x17) & 1) == 0) {
        iVar12 = (int)*(short *)(lVar18 + 0xd4);
        goto joined_r0x000c96ec;
      }
      do {
        lVar18 = *(long *)(lVar18 + 0x378);
      } while ((*(byte *)(lVar18 + 0x17) & 1) != 0);
      uVar13 = (uint)*(short *)(lVar18 + 0xd4);
    }
    if (-1 < (int)uVar13) {
      uVar11 = (ulong)uVar13;
      do {
        lVar9 = *(long *)(*(long *)(&UNK_00003fb8 + lRam0000000000a334c0) + uVar11 * 8);
        if (((lVar9 != 0) && (*(char *)(lVar9 + 0xbf) != '\0')) &&
           (((*(uint *)(lVar9 + 0x14) ^ 0xffffffff) & 0x10200) != 0)) goto DAT_000c3098;
        bVar1 = 0 < (long)uVar11;
        uVar11 = uVar11 - 1;
      } while (bVar1);
    }
    lVar9 = 0;
  }
DAT_000c3098:
  piVar4 = (int *)(&UNK_00004064 + lRam0000000000a334c0);
  if (*(long *)(&UNK_00004b18 + lRam0000000000a334c0) == lVar9) goto code_r0x000c3290;
  if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 1 & 1) != 0) {
    func_0x000bae48("[focus] SetNavWindow(\"%s\")\n");
  }
  lVar18 = lRam0000000000a334c0;
  puVar2 = &UNK_00004b7c + lRam0000000000a334c0;
  *(long *)(&UNK_00004b18 + lVar17) = lVar9;
  *(undefined8 *)(&UNK_00004b70 + lVar17) = 0xffffffffffffffff;
  *(undefined2 *)(&UNK_00004bc0 + lVar17) = 0;
  (&UNK_00004b7d)[lVar17] = 0;
  if ((&UNK_00004bc1)[lVar18] == '\0') {
    *puVar2 = (&UNK_00004b7d)[lVar18] != '\0';
    if (lVar9 != 0) goto code_r0x000c3230;
code_r0x000c3268:
    uVar7 = 0;
    *(undefined4 *)(&UNK_00004b20 + lVar17) = 0;
    *(undefined4 *)(&UNK_00004b68 + lVar17) = 0;
  }
  else {
    *puVar2 = 1;
    if (lVar9 == 0) goto code_r0x000c3268;
code_r0x000c3230:
    if ((&UNK_00004b7b)[lVar17] != '\0') {
      (&UNK_00004b79)[lVar17] = 1;
    }
    *(undefined4 *)(&UNK_00004b20 + lVar17) = *(undefined4 *)(lVar9 + 0x3b8);
    *(undefined4 *)(&UNK_00004b68 + lVar17) = 0;
    uVar7 = *(undefined4 *)(lVar9 + 0x3f0);
  }
  func_0x000d31a8(uVar7);
  (&UNK_00004b78)[lVar17] = 0;
  *(undefined8 *)(&UNK_00004b70 + lVar17) = 0xffffffffffffffff;
  func_0x000c3bdc(lVar9,0);
code_r0x000c3290:
  if (lVar9 == 0) {
    lVar18 = 0;
    iVar12 = *piVar4;
  }
  else {
    lVar18 = *(long *)(lVar9 + 0x388);
    iVar12 = *piVar4;
  }
  lVar15 = lRam0000000000a334c0;
  if (((iVar12 != 0) && (*(long *)(&UNK_00004080 + lVar17) != 0)) &&
     ((*(long *)(*(long *)(&UNK_00004080 + lVar17) + 0x388) != lVar18 &&
      ((&UNK_00004072)[lVar17] == '\0')))) {
    func_0x000c23ac(0,0);
    lVar15 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar15;
  if (lVar9 != 0) {
    lVar10 = *(long *)(&UNK_00003fb8 + lVar15);
    lVar17 = (long)*(int *)(&UNK_00003fb0 + lVar15) + -1;
    if (*(long *)(lVar10 + lVar17 * 8) != lVar18) {
      if ((int)*(short *)(lVar18 + 0xd4) < (int)lVar17) {
        lVar14 = (long)(int)*(short *)(lVar18 + 0xd4);
        do {
          puVar3 = (undefined8 *)(lVar10 + lVar14 * 8);
          *puVar3 = puVar3[1];
          lVar10 = *(long *)(&UNK_00003fb8 + lVar15);
          lVar16 = *(long *)(lVar10 + lVar14 * 8);
          lVar14 = lVar14 + 1;
          *(short *)(lVar16 + 0xd4) = *(short *)(lVar16 + 0xd4) + -1;
        } while (lVar17 != lVar14);
      }
      *(long *)(lVar10 + lVar17 * 8) = lVar18;
      *(short *)(lVar18 + 0xd4) = (short)lVar17;
    }
    lVar17 = lRam0000000000a334c0;
    if (((*(uint *)(lVar18 + 0x14) | *(uint *)(lVar9 + 0x14)) >> 0xd & 1) == 0) {
      lVar9 = *(long *)(&UNK_00003fa8 + lRam0000000000a334c0);
      uVar13 = *(int *)(&UNK_00003fa0 + lRam0000000000a334c0) - 1;
      uVar11 = (ulong)uVar13;
      lVar15 = *(long *)(lVar9 + (long)(int)uVar13 * 8);
      if ((lVar15 != lVar18) &&
         (1 < *(int *)(&UNK_00003fa0 + lRam0000000000a334c0) && *(long *)(lVar15 + 0x388) != lVar18)
         ) {
        lVar15 = 0;
        do {
          uVar6 = (int)uVar11 - 1;
          uVar11 = (ulong)uVar6;
          if (*(long *)(lVar9 + uVar11 * 8) == lVar18) {
            uVar6 = 1 - (int)lVar15;
            _memmove(lVar9 + uVar11 * 8,lVar9 + (ulong)uVar13 * 8 + lVar15 * 8,
                     -(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
            *(long *)(*(long *)(&UNK_00003fa8 + lVar17) + (long)*(int *)(&UNK_00003fa0 + lVar17) * 8
                     + -8) = lVar18;
            return;
          }
          lVar15 = lVar15 + -1;
        } while (0 < (int)uVar6);
      }
    }
  }
  return;
}

