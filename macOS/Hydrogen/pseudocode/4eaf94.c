
/* WARNING: Possible PIC construction at 0x004ed7f8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004ed7fc) */
/* WARNING: Removing unreachable block (ram,0x004ed804) */
/* WARNING: Removing unreachable block (ram,0x004ed87c) */
/* WARNING: Removing unreachable block (ram,0x004ed89c) */
/* WARNING: Removing unreachable block (ram,0x004ed8b0) */
/* WARNING: Removing unreachable block (ram,0x004ed8c4) */
/* WARNING: Removing unreachable block (ram,0x004ed8c8) */
/* WARNING: Removing unreachable block (ram,0x004ed808) */
/* WARNING: Removing unreachable block (ram,0x004ed810) */
/* WARNING: Removing unreachable block (ram,0x004ee58c) */
/* WARNING: Removing unreachable block (ram,0x004ed818) */
/* WARNING: Removing unreachable block (ram,0x004ede58) */
/* WARNING: Removing unreachable block (ram,0x004ed820) */
/* WARNING: Removing unreachable block (ram,0x004ee590) */
/* WARNING: Removing unreachable block (ram,0x004ed840) */
/* WARNING: Removing unreachable block (ram,0x004ede5c) */
/* WARNING: Removing unreachable block (ram,0x004edea0) */
/* WARNING: Removing unreachable block (ram,0x004edea4) */
/* WARNING: Removing unreachable block (ram,0x004edeb8) */
/* WARNING: Removing unreachable block (ram,0x004edec0) */
/* WARNING: Removing unreachable block (ram,0x004edeac) */
/* WARNING: Removing unreachable block (ram,0x004eded0) */
/* WARNING: Removing unreachable block (ram,0x004eded4) */
/* WARNING: Removing unreachable block (ram,0x004edee8) */

long FUN_004eaf94(void)

{
  byte *pbVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  code *pcVar5;
  undefined1 *puVar6;
  bool bVar7;
  int iVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  undefined *puVar12;
  ulong in_x3;
  byte bVar13;
  uint uVar14;
  int *piVar15;
  ulong *puVar16;
  long *plVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  long lVar20;
  long lVar21;
  int *piVar22;
  uint uVar23;
  uint uVar24;
  ulong uVar25;
  long lVar26;
  long lVar27;
  ulong unaff_x19;
  long lVar28;
  ulong *unaff_x20;
  undefined8 uVar29;
  long unaff_x21;
  undefined1 *puVar30;
  ulong uVar31;
  long lVar32;
  undefined8 uVar33;
  ulong unaff_x23;
  long lVar34;
  ulong unaff_x24;
  undefined8 uVar35;
  ulong *puVar36;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  
  lVar32 = 1;
  uVar9 = func_0x00187bd0();
  if (uVar9 != 0) {
    lVar32 = _memcpy(uVar9);
    *unaff_x20 = unaff_x19;
    unaff_x20[1] = uVar9;
    unaff_x20[2] = unaff_x19;
    return lVar32;
  }
  puVar12 = &UNK_009e80a0;
  puVar37 = (undefined *)0x4eb004;
  auVar44 = func_0x007a1f00(1);
  puVar6 = (undefined1 *)register0x00000008;
LAB_004eb004:
  puVar36 = auVar44._8_8_;
  *(undefined8 **)(puVar6 + -0x60) = unaff_x28;
  *(undefined8 **)(puVar6 + -0x58) = unaff_x27;
  *(undefined8 **)(puVar6 + -0x50) = unaff_x26;
  *(undefined8 **)(puVar6 + -0x48) = unaff_x25;
  *(ulong *)(puVar6 + -0x40) = unaff_x24;
  *(ulong *)(puVar6 + -0x38) = unaff_x23;
  *(long *)(puVar6 + -0x30) = lVar32;
  *(long *)(puVar6 + -0x28) = unaff_x21;
  *(ulong **)(puVar6 + -0x20) = unaff_x20;
  *(ulong *)(puVar6 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar6 + -0x10) = unaff_x29;
  *(undefined **)(puVar6 + -8) = puVar37;
  unaff_x29 = puVar6 + -0x10;
  *(undefined8 *)(puVar6 + -0x4e0) = 0;
  *(undefined **)(puVar6 + -0x410) = puVar12;
  *(long *)(puVar6 + -0x3f8) = auVar44._0_8_;
  *(ulong *)(puVar6 + -1000) = in_x3;
  *(undefined8 *)(puVar6 + -0x3e0) = 0x8000000000000000;
  lVar32 = *(long *)(auVar44._0_8_ + 0x10);
  uVar9 = *(ulong *)(lVar32 + 0xa8);
  *(undefined1 **)(puVar6 + -0x448) = puVar6 + -0x188;
  *(undefined1 **)(puVar6 + -0x478) = puVar6 + -0x160;
  if (uVar9 == 0) {
    lVar28 = 0;
  }
  else {
    if (uVar9 < 4) {
      lVar28 = 0;
      uVar25 = 0;
    }
    else {
      lVar28 = 0;
      lVar20 = 0;
      lVar34 = 0;
      lVar10 = 0;
      uVar25 = uVar9 & 0xfffffffffffffffc;
      piVar22 = (int *)(*(long *)(lVar32 + 0xa0) + 0x40);
      uVar11 = uVar25;
      do {
        if (piVar22[-0x10] == 2) {
          lVar28 = lVar28 + 1;
        }
        if (piVar22[-8] == 2) {
          lVar20 = lVar20 + 1;
        }
        if (*piVar22 == 2) {
          lVar34 = lVar34 + 1;
        }
        if (piVar22[8] == 2) {
          lVar10 = lVar10 + 1;
        }
        piVar22 = piVar22 + 0x20;
        uVar11 = uVar11 - 4;
      } while (uVar11 != 0);
      lVar28 = lVar10 + lVar34 + lVar20 + lVar28;
      if (uVar9 == uVar25) goto code_r0x004eb104;
    }
    lVar20 = uVar9 - uVar25;
    piVar22 = (int *)(*(long *)(lVar32 + 0xa0) + uVar25 * 0x20);
    do {
      if (*piVar22 == 2) {
        lVar28 = lVar28 + 1;
      }
      lVar20 = lVar20 + -1;
      piVar22 = piVar22 + 8;
    } while (lVar20 != 0);
  }
code_r0x004eb104:
  lVar20 = *(long *)(lVar32 + 0x88);
  lVar32 = *(long *)(lVar32 + 0x90) * 600;
  do {
    lVar34 = lVar32;
    if (lVar34 == 0) break;
    pbVar1 = (byte *)(lVar20 + 0x251);
    lVar20 = lVar20 + 600;
    lVar32 = lVar34 + -600;
  } while ((*pbVar1 & 1) == 0);
  puVar30 = (undefined1 *)0x0;
  unaff_x27 = (undefined8 *)0x0;
  *(undefined8 *)(puVar6 + -0x408) = 0;
  *(undefined1 **)(puVar6 + -0x430) = puVar6 + -0x288;
  *(undefined8 *)(puVar6 + -0x480) = 1;
  *(undefined8 *)(puVar6 + -0x3f0) = 1;
  *(ulong **)(puVar6 + -0x418) = puVar36;
code_r0x004eb154:
  *(ulong *)(puVar6 + -0x440) = unaff_x23;
  *(undefined8 **)(puVar6 + -0x438) = unaff_x25;
LAB_004eb158:
  auVar44 = func_0x00537e88(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000);
  if (auVar44._0_8_ == 0) {
    lVar32 = *(long *)(puVar6 + -0x3e0);
joined_r0x004ecef4:
    unaff_x19 = 0;
    if (lVar32 != -0x8000000000000000) goto code_r0x004ed424;
    goto code_r0x004edf88;
  }
  *(undefined1 (*) [16])(puVar6 + -0x3c0) = auVar44;
  if ((*(ulong *)(puVar6 + -0x408) & 1) != 0) goto code_r0x004ec724;
  lVar32 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x10);
  *(long *)(puVar6 + -0x400) = lVar32;
  if ((((*(byte *)(lVar32 + 0x2bd) >> 6 & 1) != 0) ||
      ((*(byte *)(*(long *)(puVar6 + -0x400) + 0x2c1) >> 6 & 1) != 0)) ||
     ((undefined1 *)0x1 < puVar30 + -1)) {
    func_0x005383dc(puVar6 + -0x210,puVar6 + -0x3c0);
    auVar44 = func_0x004efb0c(*(undefined8 *)(puVar6 + -0x3f8),puVar6 + -0x210,(uint)unaff_x27 & 1);
    uVar9 = auVar44._8_8_;
    piVar22 = auVar44._0_8_;
    if (piVar22 == (int *)0x0) goto code_r0x004eb1c0;
    if (uVar9 != 4) {
      if (-1 < (long)uVar9) {
        if (uVar9 != 0) goto code_r0x004ed3b4;
        lVar32 = 1;
code_r0x004ed3d8:
        _memcpy(lVar32,piVar22,uVar9);
        lVar28 = *(long *)(puVar6 + -0x3e0);
        if ((lVar28 != -0x8000000000000000) && (lVar28 != 0)) {
          func_0x00187bd4(*(undefined8 *)(puVar6 + -0x3d8),lVar28,1);
        }
        *(ulong *)(puVar6 + -0x3e0) = uVar9;
        *(long *)(puVar6 + -0x3d8) = lVar32;
        *(ulong *)(puVar6 + -0x3d0) = uVar9;
        lVar32 = *(long *)(puVar6 + -0x3e0);
        goto joined_r0x004ecef4;
      }
      goto code_r0x004ee4d4;
    }
    lVar32 = *(long *)(puVar6 + -0x400);
    if (((*piVar22 != 0x706c6568) || ((*(byte *)(lVar32 + 0x2be) >> 4 & 1) != 0)) ||
       ((*(byte *)(lVar32 + 0x2c2) >> 4 & 1) != 0)) {
code_r0x004ed3b4:
      lVar32 = func_0x00187bd0(uVar9,1);
      if (lVar32 != 0) goto code_r0x004ed3d8;
      *(undefined8 *)(puVar6 + -0x480) = 1;
      goto code_r0x004ee508;
    }
    auVar44 = func_0x00537f4c(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000);
    lVar32 = func_0x004efd54(lVar32,auVar44._0_8_,auVar44._8_8_);
    goto LAB_004ede04;
  }
code_r0x004eb1c0:
  uVar9 = func_0x00538010(puVar6 + -0x3c0);
  if ((uVar9 & 1) != 0) {
    if (puVar30 == (undefined1 *)0x0) goto code_r0x004eb408;
    if (puVar30 == (undefined1 *)((long)&MACH_HEADER.magic + 1)) {
      lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
      if (lVar32 != 0) {
        puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
        lVar32 = lVar32 * 600;
        while ((puVar18[1] != unaff_x23 ||
               (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0))) {
          puVar18 = puVar18 + 0x4b;
          lVar32 = lVar32 + -600;
          if (lVar32 == 0) goto LAB_004ee370;
        }
        goto LAB_004eb3fc;
      }
    }
    else {
      lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
      if (lVar32 != 0) {
        puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
        lVar32 = lVar32 * 600;
        while ((puVar18[1] != unaff_x23 ||
               (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0))) {
          puVar18 = puVar18 + 0x4b;
          lVar32 = lVar32 + -600;
          if (lVar32 == 0) goto LAB_004ee370;
        }
LAB_004eb3fc:
        if ((*(byte *)(puVar18 + 7) >> 5 & 1) != 0) goto LAB_004ec510;
        goto code_r0x004eb408;
      }
    }
LAB_004ee370:
    puVar12 = &UNK_009e8110;
    goto code_r0x004ee400;
  }
  func_0x0053814c(puVar6 + -0x3b0,puVar6 + -0x3c0);
  uVar11 = *(ulong *)(puVar6 + -0x3b0);
  if (uVar11 != 2) {
    unaff_x28 = *(undefined8 **)(puVar6 + -0x3a8);
    uVar9 = *(ulong *)(puVar6 + -0x3a0);
    *(undefined8 *)(puVar6 + -0x498) = *(undefined8 *)(puVar6 + -0x390);
    *(undefined8 *)(puVar6 + -0x490) = *(undefined8 *)(puVar6 + -0x398);
    *(uint *)(puVar6 + -0x424) = (uint)unaff_x27;
    if (puVar30 != (undefined1 *)0x0) {
      if (puVar30 == (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
        lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
        if (lVar32 == 0) goto code_r0x004ee3e0;
        puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
        lVar32 = lVar32 * 600;
        while ((puVar18[1] != unaff_x23 ||
               (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0))) {
          puVar18 = puVar18 + 0x4b;
          lVar32 = lVar32 + -600;
          if (lVar32 == 0) goto code_r0x004ee3e0;
        }
      }
      else {
        lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
        if (lVar32 == 0) {
code_r0x004ee3e0:
          puVar12 = &UNK_009e81d0;
          goto code_r0x004ee400;
        }
        puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
        lVar32 = lVar32 * 600;
        while ((puVar18[1] != unaff_x23 ||
               (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0))) {
          puVar18 = puVar18 + 0x4b;
          lVar32 = lVar32 + -600;
          if (lVar32 == 0) goto code_r0x004ee3e0;
        }
      }
      puVar36 = *(ulong **)(puVar6 + -0x418);
      if ((*(byte *)(puVar18 + 7) >> 5 & 1) == 0) goto code_r0x004eb484;
code_r0x004eb9e4:
      *(undefined8 *)(puVar6 + -0x210) = 0x8000000000000005;
      goto code_r0x004ebce8;
    }
code_r0x004eb484:
    *(undefined1 **)(puVar6 + -0x420) = puVar30;
    if ((uVar11 & 1) != 0) {
      func_0x0045b558(puVar6 + -400,unaff_x28,uVar9);
      lVar20 = *(long *)(puVar6 + -0x188);
      uVar9 = *(ulong *)(puVar6 + -0x180);
      lVar32 = lVar20;
      uVar11 = *(ulong *)(puVar6 + -400);
      if (*(ulong *)(puVar6 + -400) == 0x8000000000000000) {
        if ((long)uVar9 < 0) {
          *(undefined8 *)(puVar6 + -0x480) = 0;
          *(undefined8 *)(puVar6 + -0x4b8) = *(undefined8 *)(puVar6 + -0x4b0);
          goto code_r0x004ee574;
        }
        if (uVar9 == 0) {
          lVar32 = 1;
        }
        else {
          lVar32 = func_0x00187bd0(uVar9,1);
          if (lVar32 == 0) {
            *(ulong *)(puVar6 + -0x4b8) = uVar9;
            goto code_r0x004ee574;
          }
        }
        _memcpy(lVar32,lVar20,uVar9);
        *(long *)(puVar6 + -0x4b0) = lVar32;
        uVar11 = uVar9;
      }
      uVar29 = 0x8000000000000007;
      goto code_r0x004ebcd4;
    }
    if (*(long *)(*(long *)(puVar6 + -0x400) + 0xa8) != 0) {
      puVar16 = (ulong *)(*(long *)(*(long *)(puVar6 + -0x400) + 0xa0) + 0x10);
      lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0xa8) << 5;
      do {
        if ((((int)puVar16[-2] == 1) && (*puVar16 == uVar9)) &&
           (iVar8 = _memcmp(puVar16[-1],unaff_x28,uVar9), iVar8 == 0)) {
          uVar11 = puVar16[1];
          uVar25 = *(ulong *)(*(long *)(puVar6 + -0x400) + 0x90);
          if (uVar25 <= uVar11) goto code_r0x004ee478;
          puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + uVar11 * 600);
          puVar30 = *(undefined1 **)(puVar6 + -0x420);
          lVar32 = *(long *)(puVar6 + -0x490);
          uVar14 = *(uint *)(puVar18 + 2);
          goto joined_r0x004eb57c;
        }
        puVar16 = puVar16 + 4;
        lVar32 = lVar32 + -0x20;
      } while (lVar32 != 0);
    }
    uVar14 = *(uint *)(*(long *)(puVar6 + -0x400) + 700);
    *(uint *)(puVar6 + -0x4a4) = uVar14;
    if ((((uVar14 >> 7 & 1) != 0) || (*(char *)(*(long *)(puVar6 + -0x400) + 0x2c0) < '\0')) &&
       (*(long *)(*(long *)(puVar6 + -0x400) + 0x90) != 0)) {
      puVar18 = *(undefined8 **)(*(long *)(puVar6 + -0x400) + 0x88);
      *(undefined8 **)(puVar6 + -0x4a0) =
           puVar18 + *(long *)(*(long *)(puVar6 + -0x400) + 0x90) * 0x4b;
      do {
        puVar19 = puVar18 + 0x4b;
        if (((puVar18[0x45] != 0) && (uVar9 <= (ulong)puVar18[0x46])) &&
           (iVar8 = _memcmp(unaff_x28,puVar18[0x45],uVar9), iVar8 == 0)) goto code_r0x004eb654;
        if (puVar18[0x27] != 0) {
          lVar32 = puVar18[0x27] * 0x18;
          puVar36 = (ulong *)(puVar18[0x26] + 8);
          do {
            if ((uVar9 <= *puVar36) && (iVar8 = _memcmp(unaff_x28,puVar36[-1],uVar9), iVar8 == 0))
            goto code_r0x004eb654;
            lVar32 = lVar32 + -0x18;
            puVar36 = puVar36 + 3;
          } while (lVar32 != 0);
        }
        puVar18 = puVar19;
      } while (puVar19 != *(undefined8 **)(puVar6 + -0x4a0));
    }
code_r0x004eb6d0:
    if ((((*(uint *)(puVar6 + -0x4a4) >> 8 & 1) != 0) ||
        ((*(byte *)(*(long *)(puVar6 + -0x400) + 0x2c1) & 1) != 0)) &&
       (*(long *)(*(long *)(puVar6 + -0x400) + 0xc0) != 0)) {
      lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0xb8);
      *(long *)(puVar6 + -0x490) = lVar32 + *(long *)(*(long *)(puVar6 + -0x400) + 0xc0) * 0x2c8;
      do {
        lVar20 = lVar32 + 0x2c8;
        if (*(long *)(lVar32 + 0x240) != 0) {
          if ((uVar9 <= *(ulong *)(lVar32 + 0x248)) &&
             (iVar8 = _memcmp(unaff_x28,*(long *)(lVar32 + 0x240),uVar9), iVar8 == 0)) {
code_r0x004eb78c:
            uVar29 = *(undefined8 *)*(undefined1 (*) [16])(lVar32 + 0x230);
            lVar10 = *(long *)(lVar32 + 0x238);
            auVar45 = *(undefined1 (*) [16])(lVar32 + 0x230);
            if (lVar20 != *(long *)(puVar6 + -0x490)) {
              *(long *)(puVar6 + -0x498) = lVar10;
              goto code_r0x004eb7b8;
            }
            puVar36 = *(ulong **)(puVar6 + -0x418);
            goto joined_r0x004ebb8c;
          }
          if (*(long *)(lVar32 + 0x78) != 0) {
            lVar10 = *(long *)(lVar32 + 0x78) * 0x18;
            puVar36 = (ulong *)(*(long *)(lVar32 + 0x70) + 8);
            do {
              if ((uVar9 <= *puVar36) && (iVar8 = _memcmp(unaff_x28,puVar36[-1],uVar9), iVar8 == 0))
              goto code_r0x004eb78c;
              lVar10 = lVar10 + -0x18;
              puVar36 = puVar36 + 3;
            } while (lVar10 != 0);
          }
        }
        lVar32 = lVar20;
      } while (lVar20 != *(long *)(puVar6 + -0x490));
    }
code_r0x004eb828:
    auVar45 = func_0x00506754(*(undefined8 *)(puVar6 + -0x400),unaff_x28,uVar9);
    puVar30 = *(undefined1 **)(puVar6 + -0x420);
    puVar36 = *(ulong **)(puVar6 + -0x418);
    if (auVar45._0_8_ != 0) {
      if (-1 < auVar45._8_8_) goto code_r0x004ebc8c;
      goto code_r0x004ee4cc;
    }
    piVar22 = *(int **)(*(long *)(puVar6 + -0x400) + 0xa0);
    puVar16 = (ulong *)(piVar22 + -2);
    lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0xa8) << 5;
    do {
      if (lVar32 == 0) goto code_r0x004eba20;
      iVar8 = *piVar22;
      plVar17 = (long *)(piVar22 + 2);
      piVar22 = piVar22 + 8;
      puVar16 = puVar16 + 4;
      lVar32 = lVar32 + -0x20;
    } while (iVar8 != 2 || *plVar17 != *(long *)(puVar6 + -0x3f0));
    uVar11 = *puVar16;
    uVar25 = *(ulong *)(*(long *)(puVar6 + -0x400) + 0x90);
    if (uVar25 <= uVar11) goto code_r0x004ee478;
    if ((*(uint *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + uVar11 * 600 + 0x250) & 0x120) ==
        0x20) goto code_r0x004eb9e4;
code_r0x004eba20:
    if (-1 < (long)uVar9) {
      if (uVar9 == 0) {
        lVar32 = 1;
      }
      else {
        lVar32 = func_0x00187bd0(uVar9,1);
        if (lVar32 == 0) goto code_r0x004ee508;
      }
      _memcpy(lVar32,unaff_x28,uVar9);
      uVar29 = 0x8000000000000007;
      *(long *)(puVar6 + -0x4c8) = lVar32;
      goto code_r0x004ebcd0;
    }
    *(undefined8 *)(puVar6 + -0x480) = 0;
    *(undefined8 *)(puVar6 + -0x4b8) = *(undefined8 *)(puVar6 + -0x4c8);
    goto code_r0x004ee574;
  }
  func_0x00538264(puVar6 + -0x388,puVar6 + -0x3c0);
  if (*(long *)(puVar6 + -0x388) == 0) goto LAB_004ec510;
  *(undefined8 *)(puVar6 + -0x348) = *(undefined8 *)(puVar6 + -0x380);
  *(undefined8 *)(puVar6 + -0x350) = *(undefined8 *)(puVar6 + -0x388);
  *(undefined8 *)(puVar6 + -0x338) = *(undefined8 *)(puVar6 + -0x370);
  *(undefined8 *)(puVar6 + -0x340) = *(undefined8 *)(puVar6 + -0x378);
  *(undefined8 *)(puVar6 + -0x328) = *(undefined8 *)(puVar6 + -0x360);
  *(undefined8 *)(puVar6 + -0x330) = *(undefined8 *)(puVar6 + -0x368);
  *(undefined8 *)(puVar6 + -800) = *(undefined8 *)(puVar6 + -0x358);
  *(undefined1 **)(puVar6 + -0x420) = puVar30;
  if (puVar30 != (undefined1 *)0x0) {
    if (*(long *)(puVar6 + -0x420) != 2) {
      lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
      if (lVar32 == 0) goto code_r0x004ee3ec;
      puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
      lVar32 = lVar32 * 600;
      puVar19 = puVar18;
      lVar20 = lVar32;
      while ((puVar19[1] != unaff_x23 || (iVar8 = _memcmp(*puVar19,unaff_x25,unaff_x23), iVar8 != 0)
             )) {
        puVar19 = puVar19 + 0x4b;
        lVar20 = lVar20 + -600;
        if (lVar20 == 0) goto code_r0x004ee3ec;
      }
      puVar36 = *(ulong **)(puVar6 + -0x418);
      if ((*(byte *)(puVar19 + 7) >> 5 & 1) != 0) goto code_r0x004eb960;
      while ((puVar18[1] != unaff_x23 || (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0)
             )) {
        puVar18 = puVar18 + 0x4b;
        lVar32 = lVar32 + -600;
        if (lVar32 == 0) goto code_r0x004ee3f8;
      }
      if ((*(byte *)(puVar18 + 7) >> 6 & 1) != 0) {
        uVar9 = func_0x00538500(puVar6 + -0x350);
        goto LAB_004eb8f0;
      }
      goto code_r0x004eb8f4;
    }
    lVar32 = *(long *)(*(long *)(puVar6 + -0x400) + 0x90);
    if (lVar32 == 0) {
code_r0x004ee3ec:
      puVar12 = &UNK_009e8200;
      goto code_r0x004ee400;
    }
    puVar18 = (undefined8 *)(*(long *)(*(long *)(puVar6 + -0x400) + 0x88) + 0x218);
    lVar32 = lVar32 * 600;
    puVar19 = puVar18;
    lVar20 = lVar32;
    while ((puVar19[1] != unaff_x23 || (iVar8 = _memcmp(*puVar19,unaff_x25,unaff_x23), iVar8 != 0)))
    {
      puVar19 = puVar19 + 0x4b;
      lVar20 = lVar20 + -600;
      if (lVar20 == 0) goto code_r0x004ee3ec;
    }
    puVar36 = *(ulong **)(puVar6 + -0x418);
    if ((*(byte *)(puVar19 + 7) >> 5 & 1) == 0) {
      while ((puVar18[1] != unaff_x23 || (iVar8 = _memcmp(*puVar18,unaff_x25,unaff_x23), iVar8 != 0)
             )) {
        puVar18 = puVar18 + 0x4b;
        lVar32 = lVar32 + -600;
        if (lVar32 == 0) goto code_r0x004ee3f8;
      }
      if ((*(byte *)(puVar18 + 7) >> 6 & 1) != 0) {
        uVar9 = func_0x00538500(puVar6 + -0x350);
LAB_004eb8f0:
        if ((uVar9 & 1) != 0) goto code_r0x004eb960;
      }
      goto code_r0x004eb8f4;
    }
code_r0x004eb960:
    uVar9 = 0x8000000000000005;
    lVar32 = *(long *)(puVar6 + -0x460);
    goto code_r0x004ec468;
  }
code_r0x004eb8f4:
  lVar10 = *(long *)(puVar6 + -0x400);
  piVar15 = *(int **)(lVar10 + 0xa0);
  lVar32 = *(long *)(lVar10 + 0xa8);
  puVar16 = (ulong *)(piVar15 + -2);
  lVar20 = lVar32 << 5;
  piVar22 = piVar15;
  do {
    if (lVar20 == 0) goto code_r0x004ebab8;
    iVar8 = *piVar22;
    plVar17 = (long *)(piVar22 + 2);
    piVar22 = piVar22 + 8;
    puVar16 = puVar16 + 4;
    lVar20 = lVar20 + -0x20;
  } while (iVar8 != 2 || *plVar17 != *(long *)(puVar6 + -0x3f0));
  uVar11 = *puVar16;
  uVar25 = *(ulong *)(lVar10 + 0x90);
  if (uVar25 <= uVar11) {
code_r0x004ee478:
    func_0x007a2570(uVar11,uVar25,&UNK_009e93b8);
    goto code_r0x004ee65c;
  }
  if ((*(byte *)(*(long *)(lVar10 + 0x88) + uVar11 * 600 + 0x250) >> 6 & 1) != 0) {
    uVar9 = func_0x00538500(puVar6 + -0x350);
    if ((uVar9 & 1) != 0) goto code_r0x004eb960;
    lVar10 = *(long *)(puVar6 + -0x400);
    piVar15 = *(int **)(lVar10 + 0xa0);
    lVar32 = *(long *)(lVar10 + 0xa8);
  }
code_r0x004ebab8:
  puVar16 = (ulong *)(piVar15 + -2);
  lVar32 = lVar32 << 5;
  do {
    if (lVar32 == 0) goto code_r0x004ebe98;
    iVar8 = *piVar15;
    plVar17 = (long *)(piVar15 + 2);
    piVar15 = piVar15 + 8;
    puVar16 = puVar16 + 4;
    lVar32 = lVar32 + -0x20;
  } while (iVar8 != 2 || *plVar17 != *(long *)(puVar6 + -0x3f0));
  uVar11 = *puVar16;
  uVar25 = *(ulong *)(lVar10 + 0x90);
  if (uVar25 <= uVar11) goto code_r0x004ee478;
  if ((*(uint *)(*(long *)(lVar10 + 0x88) + uVar11 * 600 + 0x250) & 0x120) == 0x20) {
    *(undefined8 *)(puVar6 + -400) = *(undefined8 *)(puVar6 + -0x350);
    *(undefined8 *)(puVar6 + -0x188) = *(undefined8 *)(puVar6 + -0x348);
    *(undefined8 *)(puVar6 + -0x178) = *(undefined8 *)(puVar6 + -0x338);
    *(undefined8 *)(puVar6 + -0x180) = *(undefined8 *)(puVar6 + -0x340);
    *(undefined8 *)(puVar6 + -0x168) = *(undefined8 *)(puVar6 + -0x328);
    *(undefined8 *)(puVar6 + -0x170) = *(undefined8 *)(puVar6 + -0x330);
    *(undefined8 *)(puVar6 + -0x160) = *(undefined8 *)(puVar6 + -800);
    while( true ) {
      func_0x0053873c(puVar6 + -0x120,puVar6 + -400);
      if (*(uint *)(puVar6 + -0x120) != 1 || *(long *)(puVar6 + -0x118) != 0) break;
      lVar32 = *(long *)(lVar10 + 0xa8) << 5;
      piVar22 = *(int **)(lVar10 + 0xa0);
      do {
        if (lVar32 == 0) goto code_r0x004eb960;
        iVar8 = *piVar22;
        piVar15 = piVar22 + 1;
        lVar32 = lVar32 + -0x20;
        piVar22 = piVar22 + 8;
      } while (iVar8 != 0 || *piVar15 != *(int *)(puVar6 + -0x110));
    }
    if ((*(uint *)(puVar6 + -0x120) & 1) != 0) goto code_r0x004eb960;
  }
code_r0x004ebe98:
  uVar9 = 0x8000000000000008;
  *(undefined8 *)(puVar6 + -400) = 0x8000000000000008;
  uVar29 = *(undefined8 *)(*(long *)(puVar6 + -0x3f8) + 0x20);
  *(undefined8 *)(*(long *)(puVar6 + -0x3f8) + 0x20) = 0;
  func_0x00538444(puVar6 + -0x350,uVar29);
  func_0x005385e4(puVar6 + -0x140,puVar6 + -0x350);
  if (*(int *)(puVar6 + -0x140) != 1) {
code_r0x004ec42c:
    *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0x180);
    *(undefined8 *)(puVar6 + -0x468) = *(undefined8 *)(puVar6 + -0x188);
    lVar32 = *(long *)(puVar6 + -0x178);
    *(undefined8 *)(puVar6 + -0x2b8) = *(undefined8 *)(puVar6 + -0x168);
    *(undefined8 *)(puVar6 + -0x2c0) = *(undefined8 *)(puVar6 + -0x170);
    *(undefined8 *)(puVar6 + -0x2a8) = *(undefined8 *)(puVar6 + -0x158);
    *(undefined8 *)(puVar6 + -0x2b0) = *(undefined8 *)(puVar6 + -0x160);
    *(undefined8 *)(puVar6 + -0x2a0) = *(undefined8 *)(puVar6 + -0x150);
    goto code_r0x004ec454;
  }
  if (*(long *)(puVar6 + -0x138) != 0) {
code_r0x004ebee0:
    func_0x0045b558(puVar6 + -0xc0);
    *(undefined1 **)(puVar6 + -0xe8) = puVar6 + -0xc0;
    *(undefined **)(puVar6 + -0xe0) = &DAT_00509538;
    *(undefined **)(puVar6 + -0x120) = &UNK_009e8230;
    *(undefined8 *)(puVar6 + -0x118) = 1;
    *(undefined8 *)(puVar6 + -0x100) = 0;
    *(undefined1 **)(puVar6 + -0x110) = puVar6 + -0xe8;
    *(undefined8 *)(puVar6 + -0x108) = 1;
    func_0x00459f08(puVar6 + -0xd8,puVar6 + -0x120);
    lVar32 = *(long *)(puVar6 + -0xc0);
    if ((lVar32 != -0x8000000000000000) && (lVar32 != 0)) {
      func_0x00187bd4(*(undefined8 *)(puVar6 + -0xb8),lVar32,1);
    }
    *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0xd0);
    *(undefined8 *)(puVar6 + -0x468) = *(undefined8 *)(puVar6 + -0xd8);
    uVar9 = 0x8000000000000007;
    lVar32 = *(long *)(puVar6 + -200);
    goto LAB_004ebf5c;
  }
  *(int *)(puVar6 + -0x124) = (int)*(undefined8 *)(puVar6 + -0x130);
  lVar20 = *(long *)(puVar6 + -0x400);
  puVar16 = (ulong *)(*(int **)(lVar20 + 0xa0) + -2);
  lVar32 = *(long *)(lVar20 + 0xa8) << 5;
  piVar22 = *(int **)(lVar20 + 0xa0);
  do {
    if (lVar32 == 0) goto code_r0x004ec2a0;
    iVar8 = *piVar22;
    piVar15 = piVar22 + 1;
    puVar16 = puVar16 + 4;
    lVar32 = lVar32 + -0x20;
    piVar22 = piVar22 + 8;
  } while (iVar8 != 0 || *piVar15 != (int)*(undefined8 *)(puVar6 + -0x130));
  uVar9 = *puVar16;
  if (*(ulong *)(lVar20 + 0x90) <= uVar9) {
    func_0x007a2570(uVar9,*(ulong *)(lVar20 + 0x90),&UNK_009e93b8);
    goto code_r0x004ee65c;
  }
  lVar32 = *(long *)(lVar20 + 0x88) + uVar9 * 600;
  if (((*(uint *)(lVar32 + 0x10) & 1) != 0) && (*(long *)(lVar32 + 0x20) == 0)) {
    *(undefined8 *)(puVar6 + -0xa8) = 0;
    *(undefined8 *)(puVar6 + -0xa0) = 8;
    *(undefined8 *)(puVar6 + -0x98) = 0;
    *(ulong **)(puVar6 + -0x4e0) = puVar36;
    func_0x004f17d0(puVar6 + -0x290,*(undefined8 *)(puVar6 + -0x3f8),0,2,lVar32,puVar6 + -0xa8,0);
    goto code_r0x004ec12c;
  }
  *(undefined8 *)(puVar6 + -0x120) = *(undefined8 *)(puVar6 + -0x350);
  *(undefined8 *)(puVar6 + -0x118) = *(undefined8 *)(puVar6 + -0x348);
  *(undefined8 *)(puVar6 + -0x108) = *(undefined8 *)(puVar6 + -0x338);
  *(undefined8 *)(puVar6 + -0x110) = *(undefined8 *)(puVar6 + -0x340);
  *(undefined8 *)(puVar6 + -0xf8) = *(undefined8 *)(puVar6 + -0x328);
  *(undefined8 *)(puVar6 + -0x100) = *(undefined8 *)(puVar6 + -0x330);
  *(undefined8 *)(puVar6 + -0xf0) = *(undefined8 *)(puVar6 + -800);
  auVar44 = func_0x005386a0(puVar6 + -0x120);
  uVar9 = auVar44._8_8_;
  if (auVar44._0_8_ == 0) {
    auVar44 = ZEXT816(1);
  }
  lVar20 = auVar44._8_8_;
  uVar29 = 0;
  if (lVar20 == 0) {
    auVar46._8_8_ = 0;
    auVar46._0_8_ = uVar9;
    auVar46 = auVar46 << 0x40;
  }
  else {
    auVar46 = func_0x00537b60(auVar44._0_8_,lVar20,&UNK_008a39b5,1);
    uVar29 = auVar44._0_8_;
  }
  auVar3._8_8_ = lVar20;
  auVar3._0_8_ = uVar29;
  bVar7 = auVar46._0_8_ != 0;
  if (!bVar7) {
    auVar46 = auVar3;
  }
  func_0x004f0f1c(puVar6 + -0x210,*(undefined8 *)(puVar6 + -0x3f8),0,auVar46._0_8_,auVar46._8_8_,
                  lVar32,puVar36,bVar7);
  uVar9 = 0x8000000000000009;
  if ((*(ulong *)(puVar6 + -0x210) != 0x8000000000000009) &&
     (uVar9 = *(ulong *)(puVar6 + -0x210), *(long *)(puVar6 + -0x210) == -0x7ffffffffffffffd)) {
    func_0x004ea680(puVar6 + -0x210);
    do {
      while( true ) {
        func_0x005385e4(puVar6 + -0x140,puVar6 + -0x350);
        if (*(int *)(puVar6 + -0x140) != 1) {
          unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          uVar9 = *(ulong *)(puVar6 + -400);
          goto code_r0x004ec42c;
        }
        if (*(long *)(puVar6 + -0x138) != 0) {
          unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          goto code_r0x004ebee0;
        }
        *(int *)(puVar6 + -0x124) = (int)*(undefined8 *)(puVar6 + -0x130);
        lVar20 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x10);
        puVar16 = (ulong *)(*(int **)(lVar20 + 0xa0) + -2);
        lVar32 = *(long *)(lVar20 + 0xa8) << 5;
        piVar22 = *(int **)(lVar20 + 0xa0);
        do {
          if (lVar32 == 0) {
            unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
            goto code_r0x004ec2a0;
          }
          iVar8 = *piVar22;
          piVar15 = piVar22 + 1;
          puVar16 = puVar16 + 4;
          lVar32 = lVar32 + -0x20;
          piVar22 = piVar22 + 8;
        } while (iVar8 != 0 || *piVar15 != (int)*(undefined8 *)(puVar6 + -0x130));
        uVar9 = *puVar16;
        if (*(ulong *)(lVar20 + 0x90) <= uVar9) {
          func_0x007a2570(uVar9,*(ulong *)(lVar20 + 0x90),&UNK_009e93b8);
          goto code_r0x004ee65c;
        }
        lVar32 = *(long *)(lVar20 + 0x88) + uVar9 * 600;
        if (((*(uint *)(lVar32 + 0x10) & 1) == 0) || (*(long *)(lVar32 + 0x20) != 0)) break;
        *(undefined8 *)(puVar6 + -0xa8) = 0;
        *(undefined8 *)(puVar6 + -0xa0) = 8;
        *(undefined8 *)(puVar6 + -0x98) = 0;
        *(ulong **)(puVar6 + -0x4e0) = puVar36;
        func_0x004f17d0(puVar6 + -0x290,*(undefined8 *)(puVar6 + -0x3f8),0,2,lVar32,puVar6 + -0xa8,0
                       );
code_r0x004ec12c:
        if (*(long *)(puVar6 + -0x290) == -0x7ffffffffffffff7) {
          *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0x280);
          *(undefined8 *)(puVar6 + -0x468) = *(undefined8 *)(puVar6 + -0x288);
          lVar32 = *(long *)(puVar6 + -0x278);
          *(undefined8 *)(puVar6 + -0x2b8) = *(undefined8 *)(puVar6 + -0x268);
          *(undefined8 *)(puVar6 + -0x2c0) = *(undefined8 *)(puVar6 + -0x270);
          *(undefined8 *)(puVar6 + -0x2a8) = *(undefined8 *)(puVar6 + -600);
          *(undefined8 *)(puVar6 + -0x2b0) = *(undefined8 *)(puVar6 + -0x260);
          *(undefined8 *)(puVar6 + -0x2a0) = *(undefined8 *)(puVar6 + -0x250);
          unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          uVar9 = 0x8000000000000009;
          goto LAB_004ebf5c;
        }
        func_0x004ea680(puVar6 + -400);
        *(undefined8 *)(puVar6 + -0x168) = *(undefined8 *)(puVar6 + -0x268);
        *(undefined8 *)(puVar6 + -0x170) = *(undefined8 *)(puVar6 + -0x270);
        *(undefined8 *)(puVar6 + -0x158) = *(undefined8 *)(puVar6 + -600);
        *(undefined8 *)(puVar6 + -0x160) = *(undefined8 *)(puVar6 + -0x260);
        *(undefined8 *)(puVar6 + -0x150) = *(undefined8 *)(puVar6 + -0x250);
        *(undefined8 *)(puVar6 + -0x188) = *(undefined8 *)(puVar6 + -0x288);
        *(undefined8 *)(puVar6 + -400) = *(undefined8 *)(puVar6 + -0x290);
        *(undefined8 *)(puVar6 + -0x178) = *(undefined8 *)(puVar6 + -0x278);
        *(undefined8 *)(puVar6 + -0x180) = *(undefined8 *)(puVar6 + -0x280);
      }
      *(undefined8 *)(puVar6 + -0x120) = *(undefined8 *)(puVar6 + -0x350);
      *(undefined8 *)(puVar6 + -0x118) = *(undefined8 *)(puVar6 + -0x348);
      *(undefined8 *)(puVar6 + -0x108) = *(undefined8 *)(puVar6 + -0x338);
      *(undefined8 *)(puVar6 + -0x110) = *(undefined8 *)(puVar6 + -0x340);
      *(undefined8 *)(puVar6 + -0xf8) = *(undefined8 *)(puVar6 + -0x328);
      *(undefined8 *)(puVar6 + -0x100) = *(undefined8 *)(puVar6 + -0x330);
      *(undefined8 *)(puVar6 + -0xf0) = *(undefined8 *)(puVar6 + -800);
      auVar44 = func_0x005386a0(puVar6 + -0x120);
      uVar9 = auVar44._8_8_;
      if (auVar44._0_8_ == 0) {
        auVar44 = ZEXT816(1);
      }
      lVar20 = auVar44._8_8_;
      uVar29 = 0;
      if (lVar20 == 0) {
        auVar47._8_8_ = 0;
        auVar47._0_8_ = uVar9;
        auVar47 = auVar47 << 0x40;
      }
      else {
        auVar47 = func_0x00537b60(auVar44._0_8_,lVar20,&UNK_008a39b5,1);
        uVar29 = auVar44._0_8_;
      }
      auVar4._8_8_ = lVar20;
      auVar4._0_8_ = uVar29;
      bVar7 = auVar47._0_8_ != 0;
      if (!bVar7) {
        auVar47 = auVar4;
      }
      func_0x004f0f1c(puVar6 + -0x210,*(undefined8 *)(puVar6 + -0x3f8),0,auVar47._0_8_,auVar47._8_8_
                      ,lVar32,puVar36,bVar7);
      uVar9 = *(ulong *)(puVar6 + -0x210);
      if (uVar9 == 0x8000000000000009) {
        uVar9 = 0x8000000000000009;
        break;
      }
    } while (*(long *)(puVar6 + -0x210) == -0x7ffffffffffffffd);
  }
  *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0x200);
  *(undefined8 *)(puVar6 + -0x468) = *(undefined8 *)(puVar6 + -0x208);
  lVar32 = *(long *)(puVar6 + -0x1f8);
  *(undefined8 *)(puVar6 + -0x2b8) = *(undefined8 *)(puVar6 + -0x1e8);
  *(undefined8 *)(puVar6 + -0x2c0) = *(undefined8 *)(puVar6 + -0x1f0);
  *(undefined8 *)(puVar6 + -0x2a8) = *(undefined8 *)(puVar6 + -0x1d8);
  *(undefined8 *)(puVar6 + -0x2b0) = *(undefined8 *)(puVar6 + -0x1e0);
  *(undefined8 *)(puVar6 + -0x2a0) = *(undefined8 *)(puVar6 + -0x1d0);
  unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
  goto LAB_004ebf5c;
code_r0x004eb408:
  if ((*puVar36 == 2) || ((*puVar36 & 1) != 0)) {
    *(undefined8 *)(puVar6 + -0x408) = 1;
  }
  else {
    uVar9 = puVar36[4];
    *(undefined8 *)(puVar6 + -0x408) = 1;
    *puVar36 = 1;
    puVar36[1] = uVar9;
  }
  goto LAB_004eb158;
code_r0x004eb654:
  if (puVar19 == *(undefined8 **)(puVar6 + -0x4a0)) goto code_r0x004eba4c;
  if (((puVar19[0x45] != 0) && (uVar9 <= (ulong)puVar19[0x46])) &&
     (iVar8 = _memcmp(unaff_x28,puVar19[0x45],uVar9), iVar8 == 0)) goto code_r0x004eb6d0;
  if (puVar19[0x27] != 0) {
    lVar32 = puVar19[0x27] * 0x18;
    puVar36 = (ulong *)(puVar19[0x26] + 8);
    do {
      if ((uVar9 <= *puVar36) && (iVar8 = _memcmp(unaff_x28,puVar36[-1],uVar9), iVar8 == 0))
      goto code_r0x004eb6d0;
      lVar32 = lVar32 + -0x18;
      puVar36 = puVar36 + 3;
    } while (lVar32 != 0);
  }
  puVar19 = puVar19 + 0x4b;
  goto code_r0x004eb654;
code_r0x004eba4c:
  puVar30 = *(undefined1 **)(puVar6 + -0x420);
  puVar36 = *(ulong **)(puVar6 + -0x418);
  lVar32 = *(long *)(puVar6 + -0x490);
  uVar14 = *(uint *)(puVar18 + 2);
joined_r0x004eb57c:
  if (((uVar14 & 1) == 0) || (puVar18[4] != 0)) {
    func_0x004f0f1c(puVar6 + -0x210,*(undefined8 *)(puVar6 + -0x3f8),1,lVar32,
                    *(undefined8 *)(puVar6 + -0x498),puVar18,puVar36,lVar32 != 0);
code_r0x004eba90:
    lVar32 = *(long *)(puVar6 + -0x210);
    unaff_x28 = puVar18;
  }
  else {
    if (lVar32 == 0) {
      *(undefined8 *)(puVar6 + -400) = 0;
      *(undefined8 *)(puVar6 + -0x188) = 8;
      *(undefined8 *)(puVar6 + -0x180) = 0;
      *(ulong **)(puVar6 + -0x4e0) = puVar36;
      func_0x004f17d0(puVar6 + -0x210,*(undefined8 *)(puVar6 + -0x3f8),1,2,puVar18,puVar6 + -400,0);
      goto code_r0x004eba90;
    }
    func_0x005053c0(puVar6 + -0x388,*(undefined8 *)(puVar6 + -0x400));
    uVar9 = puVar36[9];
    uVar11 = puVar36[10];
    *(ulong *)(puVar6 + -400) = uVar9;
    *(ulong *)(puVar6 + -0x188) = uVar9 + uVar11 * 0x10;
    *(ulong **)(puVar6 + -0x180) = puVar36;
    *(undefined8 *)(puVar6 + -0x178) = *(undefined8 *)(puVar6 + -0x400);
    *(undefined1 **)(puVar6 + -0x170) = puVar6 + -0x388;
    func_0x004e932c(puVar6 + -0x120,puVar6 + -400,&UNK_009e8050);
    uVar33 = puVar18[0x43];
    uVar29 = puVar18[0x44];
    lVar20 = *(long *)(puVar6 + -0x110);
    if (lVar20 == *(long *)(puVar6 + -0x120)) {
      func_0x0050c0c0(puVar6 + -0x120,&UNK_009e81e8);
    }
    lVar10 = *(long *)(puVar6 + -0x118);
    *(undefined8 *)(lVar10 + lVar20 * 0x10) = uVar33;
    ((undefined8 *)(lVar10 + lVar20 * 0x10))[1] = uVar29;
    *(long *)(puVar6 + -0x110) = lVar20 + 1;
    func_0x0045b558(puVar6 + -0x310,lVar32,*(undefined8 *)(puVar6 + -0x498));
    uVar9 = *(ulong *)(puVar6 + -0x310);
    uVar29 = *(undefined8 *)(puVar6 + -0x308);
    uVar33 = *(undefined8 *)(puVar6 + -0x300);
    if (uVar9 == 0x8000000000000000) {
      func_0x004eaf6c(puVar6 + -400,uVar29,uVar33);
      uVar9 = *(ulong *)(puVar6 + -400);
      uVar29 = *(undefined8 *)(puVar6 + -0x188);
      uVar33 = *(undefined8 *)(puVar6 + -0x180);
    }
    uVar38 = *(undefined8 *)(puVar6 + -0x120);
    unaff_x28 = *(undefined8 **)(puVar6 + -0x118);
    uVar35 = *(undefined8 *)(puVar6 + -0x110);
    *(undefined8 *)(puVar6 + -0x310) = 0;
    *(undefined8 *)(puVar6 + -0x308) = 1;
    *(undefined8 *)(puVar6 + -0x300) = 0;
    *(undefined8 *)(puVar6 + -0x180) = 0xe0000020;
    *(undefined1 **)(puVar6 + -400) = puVar6 + -0x310;
    *(undefined **)(puVar6 + -0x188) = &UNK_009e8008;
    iVar8 = func_0x0050f9f0(puVar18,puVar6 + -400);
    if (iVar8 != 0) {
      func_0x007a2810(&UNK_008a36e0,0x37,puVar6 + -0x78,&UNK_009e8068,&UNK_009e8038);
      goto code_r0x004ee65c;
    }
    *(undefined8 *)(puVar6 + -0x1d8) = *(undefined8 *)(puVar6 + -0x308);
    *(undefined8 *)(puVar6 + -0x1e0) = *(undefined8 *)(puVar6 + -0x310);
    *(undefined8 *)(puVar6 + -0x1d0) = *(undefined8 *)(puVar6 + -0x300);
    *(ulong *)(puVar6 + -0x210) = uVar9;
    *(undefined8 *)(puVar6 + -0x208) = uVar29;
    *(undefined8 *)(puVar6 + -0x200) = uVar33;
    *(undefined8 *)(puVar6 + -0x1f8) = uVar38;
    *(undefined8 **)(puVar6 + -0x1f0) = unaff_x28;
    *(undefined8 *)(puVar6 + -0x1e8) = uVar35;
    lVar32 = *(long *)(puVar6 + -0x378);
    puVar36 = *(ulong **)(puVar6 + -0x418);
    if (lVar32 != 0) {
      puVar18 = (undefined8 *)(*(long *)(puVar6 + -0x380) + 8);
      do {
        if (puVar18[-1] != 0) {
          func_0x00187bd4(*puVar18,puVar18[-1] << 3,8);
        }
        puVar18 = puVar18 + 5;
        lVar32 = lVar32 + -1;
      } while (lVar32 != 0);
    }
    if (*(long *)(puVar6 + -0x388) != 0) {
      func_0x00187bd4(*(undefined8 *)(puVar6 + -0x380),*(long *)(puVar6 + -0x388) * 0x28,8);
    }
    puVar30 = *(undefined1 **)(puVar6 + -0x420);
    lVar32 = *(long *)(puVar6 + -0x210);
  }
  if (lVar32 == -0x7ffffffffffffff7) {
    lVar32 = *(long *)(puVar6 + -0x208);
    goto LAB_004ede04;
  }
  *(undefined4 *)(puVar6 + -0x424) = 1;
  goto code_r0x004ebce8;
code_r0x004eb7b8:
  do {
    if (*(long *)(lVar20 + 0x240) != 0) {
      if ((uVar9 <= *(ulong *)(lVar20 + 0x248)) &&
         (iVar8 = _memcmp(unaff_x28,*(long *)(lVar20 + 0x240),uVar9), iVar8 == 0))
      goto code_r0x004eb828;
      if (*(long *)(lVar20 + 0x78) != 0) {
        lVar32 = *(long *)(lVar20 + 0x78) * 0x18;
        puVar36 = (ulong *)(*(long *)(lVar20 + 0x70) + 8);
        do {
          if ((uVar9 <= *puVar36) && (iVar8 = _memcmp(unaff_x28,puVar36[-1],uVar9), iVar8 == 0))
          goto code_r0x004eb828;
          lVar32 = lVar32 + -0x18;
          puVar36 = puVar36 + 3;
        } while (lVar32 != 0);
      }
    }
    lVar20 = lVar20 + 0x2c8;
  } while (lVar20 != *(long *)(puVar6 + -0x490));
  lVar10 = *(long *)(puVar6 + -0x498);
  auVar45._8_8_ = lVar10;
  auVar45._0_8_ = uVar29;
  puVar36 = *(ulong **)(puVar6 + -0x418);
joined_r0x004ebb8c:
  if (lVar10 < 0) {
code_r0x004ee4cc:
    *(undefined8 *)(puVar6 + -0x480) = 0;
    goto code_r0x004ee574;
  }
code_r0x004ebc8c:
  uVar9 = auVar45._8_8_;
  if (uVar9 == 0) {
    lVar32 = 1;
  }
  else {
    lVar32 = func_0x00187bd0(uVar9,1);
    if (lVar32 == 0) {
code_r0x004ee508:
      *(ulong *)(puVar6 + -0x4b8) = uVar9;
      goto code_r0x004ee574;
    }
  }
  _memcpy(lVar32,auVar45._0_8_,uVar9);
  uVar29 = 0x8000000000000000;
  *(long *)(puVar6 + -0x4b8) = lVar32;
code_r0x004ebcd0:
  uVar11 = uVar9;
code_r0x004ebcd4:
  *(undefined8 *)(puVar6 + -0x210) = uVar29;
  *(ulong *)(puVar6 + -0x208) = uVar11;
  *(long *)(puVar6 + -0x200) = lVar32;
  *(ulong *)(puVar6 + -0x1f8) = uVar9;
  puVar30 = *(undefined1 **)(puVar6 + -0x420);
  uVar9 = uVar11;
code_r0x004ebce8:
  *(undefined8 *)(puVar6 + -0x288) = *(undefined8 *)(puVar6 + -0x208);
  *(undefined8 *)(puVar6 + -0x290) = *(undefined8 *)(puVar6 + -0x210);
  *(undefined8 *)(puVar6 + -0x278) = *(undefined8 *)(puVar6 + -0x1f8);
  *(undefined8 *)(puVar6 + -0x280) = *(undefined8 *)(puVar6 + -0x200);
  *(undefined8 *)(puVar6 + -0x268) = *(undefined8 *)(puVar6 + -0x1e8);
  *(undefined8 *)(puVar6 + -0x270) = *(undefined8 *)(puVar6 + -0x1f0);
  *(undefined8 *)(puVar6 + -600) = *(undefined8 *)(puVar6 + -0x1d8);
  *(undefined8 *)(puVar6 + -0x260) = *(undefined8 *)(puVar6 + -0x1e0);
  *(undefined8 *)(puVar6 + -0x250) = *(undefined8 *)(puVar6 + -0x1d0);
  uVar25 = *(ulong *)(puVar6 + -0x290);
  uVar11 = uVar25 ^ 0x8000000000000000;
  if (8 < uVar11) {
    uVar11 = 4;
  }
  if (3 < (long)uVar11) {
    if (5 < (long)uVar11) {
      *(ulong *)(puVar6 + -0x400) = uVar25;
      if (uVar11 == 6) {
        lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
        if (lVar32 != 0) {
          func_0x004e9f14();
        }
        lVar32 = 0;
        lVar20 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x10);
        puVar18 = *(undefined8 **)(puVar6 + -0x430);
        uVar29 = *puVar18;
        *(undefined8 *)(puVar6 + -0x308) = puVar18[1];
        *(undefined8 *)(puVar6 + -0x310) = uVar29;
        *(undefined8 *)(puVar6 + -0x300) = puVar18[2];
        lVar28 = *(long *)(lVar20 + 0xf0) << 4;
        uVar9 = 0xffffffffffffffff;
        plVar17 = *(long **)(lVar20 + 0xe8);
        goto code_r0x004ecd08;
      }
      if (uVar11 != 7) {
        *(undefined **)(puVar6 + -0x210) = &UNK_009e80d0;
        *(undefined8 *)(puVar6 + -0x208) = 1;
        *(undefined8 *)(puVar6 + -0x1f0) = 0;
        *(undefined1 **)(puVar6 + -0x200) = puVar6 + -0x78;
        *(undefined8 *)(puVar6 + -0x1f8) = 0;
        func_0x007a2420(puVar6 + -0x210,&UNK_009e80e0);
        goto code_r0x004ee65c;
      }
      uVar33 = *(undefined8 *)(puVar6 + -0x280);
      uVar29 = *(undefined8 *)(puVar6 + -0x278);
      *(undefined8 *)(puVar6 + -0x3f0) = *(undefined8 *)(puVar6 + -0x288);
      *(undefined8 *)(puVar6 + -0x408) = uVar33;
      lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
      if (lVar32 != 0) {
        func_0x004e9f14();
      }
      auVar44 = func_0x00537f4c(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000);
      lVar32 = auVar44._0_8_;
      uVar11 = auVar44._8_8_ - lVar32;
      if (uVar11 < 0xbfffffffffffffe9) {
        if (auVar44._8_8_ == lVar32) {
          uVar31 = 0;
          uVar25 = 8;
          lVar28 = *(long *)(puVar6 + -0x3f8);
          goto code_r0x004ed950;
        }
        uVar31 = uVar11 / 0x18;
        uVar9 = uVar31 << 4;
        uVar35 = 8;
        uVar25 = func_0x00187bd0(uVar9,8);
        if (uVar25 != 0) goto code_r0x004ecc84;
      }
      else {
        uVar35 = 0;
      }
      func_0x007a1f00(uVar35,uVar9,&UNK_009e8050);
      goto code_r0x004ee65c;
    }
    if (uVar11 == 4) {
      *(ulong *)(puVar6 + -0x400) = uVar25;
      lVar20 = *(long *)(puVar6 + -0x278);
      uVar29 = *(undefined8 *)(puVar6 + -0x270);
      uVar33 = *(undefined8 *)(puVar6 + -0x268);
      lVar28 = *(long *)(puVar6 + -0x3f8);
      lVar32 = func_0x004f15d8(lVar28,puVar36);
      if (lVar32 != 0) {
        func_0x004e9f14();
      }
      lVar32 = 0;
      lVar34 = *(long *)(lVar28 + 0x10);
      *(undefined8 *)(puVar6 + -0x118) = *(undefined8 *)(puVar6 + -0x288);
      *(undefined8 *)(puVar6 + -0x120) = *(undefined8 *)(puVar6 + -0x290);
      *(undefined8 *)(puVar6 + -0x110) = *(undefined8 *)(puVar6 + -0x280);
      *(undefined8 *)(puVar6 + -0x308) = *(undefined8 *)(puVar6 + -600);
      *(undefined8 *)(puVar6 + -0x310) = *(undefined8 *)(puVar6 + -0x260);
      *(undefined8 *)(puVar6 + -0x300) = *(undefined8 *)(puVar6 + -0x250);
      lVar28 = *(long *)(lVar34 + 0xf0) << 4;
      uVar9 = 0xffffffffffffffff;
      plVar17 = *(long **)(lVar34 + 0xe8);
      goto code_r0x004ece18;
    }
    unaff_x27 = (undefined8 *)(ulong)*(uint *)(puVar6 + -0x424);
LAB_004ec510:
    if (puVar30 != (undefined1 *)((long)&MACH_HEADER.magic + 1)) goto code_r0x004ec724;
    lVar32 = *(long *)(*(long *)(*(long *)(puVar6 + -0x3f8) + 0x10) + 0x90);
    if (lVar32 == 0) {
code_r0x004ee37c:
      puVar12 = &UNK_009e8128;
code_r0x004ee400:
      func_0x007a23d8(&UNK_008a4847,99,puVar12);
      goto code_r0x004ee65c;
    }
    lVar20 = *(long *)(*(long *)(*(long *)(puVar6 + -0x3f8) + 0x10) + 0x88);
    lVar32 = lVar32 * 600;
    while ((*(ulong *)(lVar20 + 0x220) != unaff_x23 ||
           (iVar8 = _memcmp(*(undefined8 *)(lVar20 + 0x218),unaff_x25,unaff_x23), iVar8 != 0))) {
      lVar20 = lVar20 + 600;
      lVar32 = lVar32 + -600;
      if (lVar32 == 0) goto code_r0x004ee37c;
    }
    uVar29 = *(undefined8 *)(puVar6 + -0x3c0);
    lVar32 = *(long *)(puVar6 + -0x3b8);
    if (((*(long *)(lVar20 + 0x238) == 0) || (lVar32 != *(long *)(lVar20 + 0x240))) ||
       (iVar8 = _memcmp(uVar29,*(long *)(lVar20 + 0x238),lVar32), iVar8 != 0)) {
      if (*puVar36 == 2) {
        *puVar36 = 0;
        puVar36[2] = 0;
        puVar36[3] = 8;
        puVar36[4] = 0;
        puVar36[5] = (ulong)unaff_x25;
        puVar36[6] = unaff_x23;
        *(undefined1 *)(puVar36 + 7) = 3;
      }
      if (lVar32 < 0) {
        *(undefined8 *)(puVar6 + -0x480) = 0;
code_r0x004ee448:
        func_0x007a1f00(*(undefined8 *)(puVar6 + -0x480),*(undefined8 *)(puVar6 + -0x488),
                        &UNK_009e80a0);
        goto code_r0x004ee65c;
      }
      if (lVar32 == 0) {
        lVar10 = 1;
      }
      else {
        lVar10 = func_0x00187bd0(lVar32,1);
        if (lVar10 == 0) {
          *(long *)(puVar6 + -0x488) = lVar32;
          goto code_r0x004ee448;
        }
      }
      _memcpy(lVar10,uVar29,lVar32);
      uVar9 = puVar36[4];
      if (uVar9 == puVar36[2]) {
        func_0x00403d9c(puVar36 + 2,&UNK_009e8140);
      }
      plVar17 = (long *)(puVar36[3] + uVar9 * 0x18);
      *plVar17 = lVar32;
      plVar17[1] = lVar10;
      plVar17[2] = lVar32;
      uVar9 = uVar9 + 1;
      puVar36[4] = uVar9;
      if ((*puVar36 == 2) || (puVar36[6] != *(ulong *)(lVar20 + 0x220))) {
        uVar9 = 0;
      }
      else {
        iVar8 = _memcmp(puVar36[5],*(undefined8 *)(lVar20 + 0x218));
        if (iVar8 != 0) {
          uVar9 = 0;
        }
      }
      if ((*(uint *)(lVar20 + 0x10) & 1) == 0) {
        func_0x007a23d8(&UNK_008a68aa,99,&UNK_009e99d8);
        goto code_r0x004ee65c;
      }
      *(long *)(puVar6 + -0x488) = lVar10;
      if (uVar9 < *(ulong *)(lVar20 + 0x20)) {
        *(undefined8 *)(puVar6 + -0x408) = 0;
        unaff_x25 = *(undefined8 **)(lVar20 + 0x218);
        unaff_x23 = *(ulong *)(lVar20 + 0x220);
        puVar30 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
        *(undefined8 **)(puVar6 + -0x458) = unaff_x25;
        *(ulong *)(puVar6 + -0x450) = unaff_x23;
        goto LAB_004eb158;
      }
    }
    puVar30 = (undefined1 *)0x0;
    *(undefined8 *)(puVar6 + -0x408) = 0;
    unaff_x25 = *(undefined8 **)(puVar6 + -0x458);
    unaff_x23 = *(ulong *)(puVar6 + -0x450);
    goto LAB_004eb158;
  }
  if ((long)uVar11 < 2) {
    if (uVar11 == 0) {
      lVar32 = *(long *)(puVar6 + -0x3e0);
      if ((lVar32 != -0x8000000000000000) && (lVar32 != 0)) {
        func_0x00187bd4(*(undefined8 *)(puVar6 + -0x3d8),lVar32,1);
      }
      unaff_x19 = 0;
      puVar18 = *(undefined8 **)(puVar6 + -0x430);
      uVar29 = *puVar18;
      *(undefined8 *)(puVar6 + -0x3d8) = puVar18[1];
      *(undefined8 *)(puVar6 + -0x3e0) = uVar29;
      *(undefined8 *)(puVar6 + -0x3d0) = puVar18[2];
      unaff_x27 = (undefined8 *)(ulong)*(uint *)(puVar6 + -0x424);
      lVar32 = *(long *)(puVar6 + -0x3e0);
joined_r0x004edf84:
      if (lVar32 == -0x8000000000000000) goto code_r0x004edf88;
code_r0x004ed424:
      unaff_x20 = *(ulong **)(*(long *)(puVar6 + -0x3f8) + 0x10);
      if ((*(byte *)((long)unaff_x20 + 0x2bd) >> 5 & 1) == 0) {
        if (((uint)unaff_x27 & (*(byte *)((long)unaff_x20 + 0x2c1) & 0x20) >> 5) != 0)
        goto code_r0x004ed530;
      }
      else if (((ulong)unaff_x27 & 1) != 0) {
code_r0x004ed530:
        func_0x0045cd08(puVar6 + -0x310,puVar6 + -0x3e0);
        uVar9 = puVar36[9];
        uVar11 = puVar36[10];
        *(ulong *)(puVar6 + -0x210) = uVar9;
        *(ulong *)(puVar6 + -0x208) = uVar9 + uVar11 * 0x10;
        *(ulong **)(puVar6 + -0x200) = unaff_x20;
        func_0x004e6ae4(puVar6 + -400,puVar6 + -0x210,&UNK_009e8050);
        lVar32 = 0;
        lVar28 = unaff_x20[0x1e] << 4;
        uVar9 = 0xffffffffffffffff;
        plVar17 = (long *)unaff_x20[0x1d];
        goto code_r0x004ed594;
      }
      if (unaff_x20[0x18] == 0) goto code_r0x004ee45c;
      uVar9 = unaff_x20[0x17];
      uVar29 = *(undefined8 *)(puVar6 + -0x3d8);
      puVar18 = *(undefined8 **)(puVar6 + -0x3d0);
      uVar11 = uVar9 + unaff_x20[0x18] * 0x2c8;
      goto code_r0x004ed470;
    }
    unaff_x25 = *(undefined8 **)(puVar6 + -0x288);
    unaff_x23 = *(ulong *)(puVar6 + -0x280);
    puVar30 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
  }
  else {
    if (uVar11 != 2) {
      *(ulong *)(puVar6 + -0x400) = uVar25;
      func_0x007a247c(&UNK_008a386f,0x28,&UNK_009e80b8);
      goto code_r0x004ee65c;
    }
    puVar30 = (undefined1 *)0x0;
  }
  unaff_x27 = (undefined8 *)(ulong)*(uint *)(puVar6 + -0x424);
  *(undefined8 *)(puVar6 + -0x408) = 0;
  goto LAB_004eb158;
  while( true ) {
    lVar34 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar9 = uVar9 + 1;
    lVar32 = lVar32 + 0x20;
    lVar28 = lVar28 + -0x10;
    plVar17 = plVar17 + 2;
    if (lVar34 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
code_r0x004ecd08:
    if (lVar28 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004ed248;
    }
  }
  if (*(ulong *)(lVar20 + 0x108) <= uVar9) {
    func_0x007a2570(uVar9,*(ulong *)(lVar20 + 0x108),&UNK_009e9b68);
    goto code_r0x004ee65c;
  }
  lVar32 = *(long *)(lVar20 + 0x100) + lVar32;
  lVar28 = *(long *)(lVar32 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(lVar32 + -0x20) + (*(long *)(lVar28 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
            );
  auVar44 = (**(code **)(lVar28 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004ed248:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(long *)(puVar6 + -0x210) = lVar20;
  *(undefined **)(puVar6 + -0x208) = puVar37;
  *(undefined8 *)(puVar6 + -0x200) = 0;
  func_0x00525f7c(puVar6 + -400,puVar6 + -0x210,8,0);
  lVar32 = func_0x0051b80c(lVar20,puVar6 + -0x310,puVar6 + -400);
  goto LAB_004ede04;
code_r0x004ecc84:
  if (uVar11 < 0xa8) {
    lVar34 = 0;
    lVar28 = *(long *)(puVar6 + -0x3f8);
  }
  else {
    lVar28 = *(long *)(puVar6 + -0x3f8);
    if ((uVar25 < lVar32 + uVar31 * 0x18) && (lVar32 + 8U < uVar25 + uVar31 * 0x10)) {
      lVar34 = 0;
    }
    else {
      uVar9 = 4;
      if ((uVar31 & 3) != 0) {
        uVar9 = uVar31 & 3;
      }
      lVar34 = uVar31 - uVar9;
      puVar18 = (undefined8 *)(lVar32 + 0x38);
      puVar19 = (undefined8 *)(uVar25 + 0x20);
      lVar20 = lVar34;
      do {
        uVar38 = puVar18[-5];
        uVar35 = puVar18[-3];
        uVar39 = puVar18[-2];
        uVar40 = *puVar18;
        uVar42 = puVar18[1];
        uVar41 = puVar18[3];
        uVar43 = puVar18[4];
        puVar19[-4] = puVar18[-6];
        puVar19[-3] = uVar38;
        puVar19[-2] = uVar35;
        puVar19[-1] = uVar39;
        *puVar19 = uVar40;
        puVar19[1] = uVar42;
        puVar19[2] = uVar41;
        puVar19[3] = uVar43;
        puVar18 = puVar18 + 0xc;
        puVar19 = puVar19 + 8;
        lVar20 = lVar20 + -4;
      } while (lVar20 != 0);
    }
  }
  lVar20 = uVar31 - lVar34;
  puVar18 = (undefined8 *)(uVar25 + lVar34 * 0x10 + 8);
  puVar19 = (undefined8 *)(lVar32 + lVar34 * 0x18 + 0x10);
  do {
    uVar35 = *puVar19;
    puVar18[-1] = puVar19[-1];
    *puVar18 = uVar35;
    puVar18 = puVar18 + 2;
    puVar19 = puVar19 + 3;
    lVar20 = lVar20 + -1;
  } while (lVar20 != 0);
code_r0x004ed950:
  *(undefined8 *)(puVar6 + -0xe8) = uVar33;
  *(undefined8 *)(puVar6 + -0xe0) = uVar29;
  lVar32 = *(long *)(lVar28 + 0x10);
  func_0x004e8754(puVar6 + -0xd8,*(long *)(lVar32 + 0xa0),
                  *(long *)(lVar32 + 0xa0) + *(long *)(lVar32 + 0xa8) * 0x20,&UNK_009e8050);
  lVar28 = *(long *)(puVar6 + -0xd0);
  lVar20 = *(long *)(puVar6 + -200);
  func_0x00514e50(puVar6 + -0x310,uVar33,uVar29,uVar25,uVar31,lVar28,lVar28 + lVar20 * 0x18,
                  *(long *)(lVar32 + 0xb8),
                  *(long *)(lVar32 + 0xb8) + *(long *)(lVar32 + 0xc0) * 0x2c8);
  if ((*(byte *)(lVar32 + 700) & 1) == 0) {
    lVar34 = *(long *)(puVar6 + -0x310);
    if ((*(byte *)(lVar32 + 0x2c0) & 1) != 0) goto code_r0x004eda1c;
    if (lVar34 != -0x8000000000000000) {
      *(ulong *)(puVar6 + -0x410) = uVar25;
      *(undefined8 *)(puVar6 + -0x210) = *(undefined8 *)(puVar6 + -0x308);
      *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x300);
      lVar10 = func_0x005103d8(lVar32 + 0x80,puVar6 + -0x210);
      if (lVar10 != 0) {
        func_0x004f2f88(*(undefined8 *)(puVar6 + -0x3f8),*(undefined8 *)(puVar6 + -0x418),lVar10,2);
      }
      *(undefined8 *)(puVar6 + -0x138) = *(undefined8 *)(puVar6 + -0x300);
      *(undefined8 *)(puVar6 + -0x140) = *(undefined8 *)(puVar6 + -0x308);
      goto code_r0x004eda40;
    }
code_r0x004eda34:
    *(undefined8 *)(puVar6 + -400) = 0x8000000000000000;
  }
  else {
    lVar34 = *(long *)(puVar6 + -0x310);
code_r0x004eda1c:
    *(undefined8 *)(puVar6 + -0x138) = *(undefined8 *)(puVar6 + -0x300);
    *(undefined8 *)(puVar6 + -0x140) = *(undefined8 *)(puVar6 + -0x308);
    if (lVar34 == -0x8000000000000000) goto code_r0x004eda34;
    *(ulong *)(puVar6 + -0x410) = uVar25;
code_r0x004eda40:
    uVar29 = *(undefined8 *)(puVar6 + -0x2f8);
    uVar33 = *(undefined8 *)(puVar6 + -0x2f0);
    uVar35 = *(undefined8 *)(puVar6 + -0x2e8);
    *(long *)(puVar6 + -0x388) = lVar34;
    *(undefined8 *)(puVar6 + -0x378) = *(undefined8 *)(puVar6 + -0x138);
    *(undefined8 *)(puVar6 + -0x380) = *(undefined8 *)(puVar6 + -0x140);
    *(undefined1 **)(puVar6 + -0x2c0) = puVar6 + -0x388;
    *(undefined **)(puVar6 + -0x2b8) = &DAT_004eaf5c;
    *(undefined **)(puVar6 + -0x210) = &UNK_009e8300;
    *(undefined8 *)(puVar6 + -0x208) = 1;
    *(undefined8 *)(puVar6 + -0x1f0) = 0;
    *(undefined1 **)(puVar6 + -0x200) = puVar6 + -0x2c0;
    *(undefined8 *)(puVar6 + -0x1f8) = 1;
    func_0x00459f08(puVar6 + -0x120,puVar6 + -0x210);
    *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x118);
    *(undefined8 *)(puVar6 + -0x210) = *(undefined8 *)(puVar6 + -0x120);
    *(undefined8 *)(puVar6 + -0x200) = *(undefined8 *)(puVar6 + -0x110);
    if (*(long *)(puVar6 + -0x388) != 0) {
      func_0x00187bd4(*(undefined8 *)(puVar6 + -0x380),*(long *)(puVar6 + -0x388),1);
    }
    *(undefined8 *)(puVar6 + -0x188) = *(undefined8 *)(puVar6 + -0x208);
    *(undefined8 *)(puVar6 + -400) = *(undefined8 *)(puVar6 + -0x210);
    *(undefined8 *)(puVar6 + -0x180) = *(undefined8 *)(puVar6 + -0x200);
    *(undefined8 *)(puVar6 + -0x178) = uVar29;
    *(undefined8 *)(puVar6 + -0x170) = uVar33;
    *(undefined8 *)(puVar6 + -0x168) = uVar35;
    uVar25 = *(ulong *)(puVar6 + -0x410);
  }
  func_0x005053c0(puVar6 + -0xc0,lVar32);
  lVar21 = *(long *)(puVar6 + -0x418);
  lVar34 = *(long *)(lVar21 + 0x48);
  lVar10 = *(long *)(lVar21 + 0x50);
  *(long *)(puVar6 + -0x210) = lVar34;
  *(long *)(puVar6 + -0x208) = lVar34 + lVar10 * 0x10;
  *(long *)(puVar6 + -0x200) = lVar21;
  *(long *)(puVar6 + -0x1f8) = lVar32;
  func_0x004e6310(puVar6 + -0xa8,puVar6 + -0x210,&UNK_009e8050);
  lVar34 = *(long *)(lVar32 + 0x88);
  lVar10 = *(long *)(lVar32 + 0x90);
  if (*(long *)(puVar6 + -400) == -0x8000000000000000) {
code_r0x004edb34:
    if (lVar10 != 0) {
      lVar10 = lVar34 + lVar10 * 600;
      do {
        if ((*(long *)(lVar34 + 0x228) == 0) && (*(int *)(lVar34 + 0x248) == 0x110000)) {
          uVar29 = 1;
          goto code_r0x004edbb4;
        }
        lVar34 = lVar34 + 600;
      } while (lVar34 != lVar10);
    }
  }
  else if (lVar10 != 0) {
    lVar21 = lVar34 + 0x250;
    lVar26 = lVar10 * 600;
    do {
      if (((*(long *)(lVar21 + -0x28) == 0) && (*(int *)(lVar21 + -8) == 0x110000)) &&
         ((*(byte *)(lVar21 + 1) & 3) != 0)) goto code_r0x004edb34;
      lVar21 = lVar21 + 600;
      lVar26 = lVar26 + -600;
    } while (lVar26 != 0);
  }
  uVar29 = 0;
code_r0x004edbb4:
  *(undefined1 **)(puVar6 + -0x120) = puVar6 + -0xe8;
  *(undefined **)(puVar6 + -0x118) = &DAT_00519924;
  *(undefined **)(puVar6 + -0x210) = &UNK_009e8300;
  *(undefined8 *)(puVar6 + -0x208) = 1;
  *(undefined8 *)(puVar6 + -0x1f0) = 0;
  *(undefined1 **)(puVar6 + -0x200) = puVar6 + -0x120;
  *(undefined8 *)(puVar6 + -0x1f8) = 1;
  func_0x00459f08(puVar6 + -0x2c0,puVar6 + -0x210);
  lVar34 = 0;
  *(undefined8 *)(puVar6 + -0x88) = *(undefined8 *)(puVar6 + -0x2b8);
  *(undefined8 *)(puVar6 + -0x90) = *(undefined8 *)(puVar6 + -0x2c0);
  *(undefined8 *)(puVar6 + -0x80) = *(undefined8 *)(puVar6 + -0x2b0);
  *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x188);
  *(undefined8 *)(puVar6 + -0x210) = *(undefined8 *)(puVar6 + -400);
  *(undefined8 *)(puVar6 + -0x1f8) = *(undefined8 *)(puVar6 + -0x178);
  *(undefined8 *)(puVar6 + -0x200) = *(undefined8 *)(puVar6 + -0x180);
  plVar17 = *(long **)(lVar32 + 0xe8);
  lVar10 = *(long *)(lVar32 + 0xf0) << 4;
  *(undefined8 *)(puVar6 + -0x1e8) = *(undefined8 *)(puVar6 + -0x168);
  *(undefined8 *)(puVar6 + -0x1f0) = *(undefined8 *)(puVar6 + -0x170);
  uVar9 = 0xffffffffffffffff;
  do {
    if (lVar10 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004edcc8;
    }
    lVar21 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar9 = uVar9 + 1;
    lVar34 = lVar34 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar17 = plVar17 + 2;
  } while (lVar21 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (*(ulong *)(lVar32 + 0x108) <= uVar9) {
    func_0x007a2570(uVar9,*(ulong *)(lVar32 + 0x108),&UNK_009e9b68);
code_r0x004ee65c:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x4ee660);
    (*pcVar5)();
  }
  lVar34 = *(long *)(lVar32 + 0x100) + lVar34;
  lVar10 = *(long *)(lVar34 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(lVar34 + -0x20) + (*(long *)(lVar10 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
            );
  auVar44 = (**(code **)(lVar10 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004edcc8:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(long *)(puVar6 + -0x120) = lVar32;
  *(undefined **)(puVar6 + -0x118) = puVar37;
  *(undefined1 **)(puVar6 + -0x110) = puVar6 + -0xc0;
  uVar33 = *(undefined8 *)(puVar6 + -0xa0);
  func_0x00525f7c(puVar6 + -0x388,puVar6 + -0x120,uVar33,*(undefined8 *)(puVar6 + -0x98));
  lVar32 = func_0x0051d650(lVar32,puVar6 + -0x90,puVar6 + -0x210,uVar29,puVar6 + -0x388);
  lVar34 = *(long *)(puVar6 + -0x3f0);
  if (*(long *)(puVar6 + -0xa8) != 0) {
    func_0x00187bd4(uVar33,*(long *)(puVar6 + -0xa8) << 4,8);
  }
  lVar10 = *(long *)(puVar6 + -0xb0);
  if (lVar10 != 0) {
    puVar18 = (undefined8 *)(*(long *)(puVar6 + -0xb8) + 8);
    do {
      if (puVar18[-1] != 0) {
        func_0x00187bd4(*puVar18,puVar18[-1] << 3,8);
      }
      puVar18 = puVar18 + 5;
      lVar10 = lVar10 + -1;
    } while (lVar10 != 0);
  }
  if (*(long *)(puVar6 + -0xc0) != 0) {
    func_0x00187bd4(*(undefined8 *)(puVar6 + -0xb8),*(long *)(puVar6 + -0xc0) * 0x28,8);
  }
  if (lVar20 != 0) {
    puVar18 = (undefined8 *)(lVar28 + 8);
    do {
      if (puVar18[-1] != 0) {
        func_0x00187bd4(*puVar18,puVar18[-1],1);
      }
      puVar18 = puVar18 + 3;
      lVar20 = lVar20 + -1;
    } while (lVar20 != 0);
  }
  if (*(long *)(puVar6 + -0xd8) != 0) {
    func_0x00187bd4(lVar28,*(long *)(puVar6 + -0xd8) * 0x18,8);
  }
  if (uVar31 != 0) {
    func_0x00187bd4(uVar25,uVar31 << 4,8);
  }
  if (lVar34 != 0) {
    func_0x00187bd4(*(undefined8 *)(puVar6 + -0x408),lVar34,1);
  }
  puVar36 = *(ulong **)(puVar6 + -0x418);
  goto LAB_004ede04;
  while( true ) {
    lVar10 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar9 = uVar9 + 1;
    lVar32 = lVar32 + 0x20;
    lVar28 = lVar28 + -0x10;
    plVar17 = plVar17 + 2;
    if (lVar10 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
code_r0x004ece18:
    if (lVar28 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004ed290;
    }
  }
  if (*(ulong *)(lVar34 + 0x108) <= uVar9) {
    func_0x007a2570(uVar9,*(ulong *)(lVar34 + 0x108),&UNK_009e9b68);
    goto code_r0x004ee65c;
  }
  lVar32 = *(long *)(lVar34 + 0x100) + lVar32;
  lVar28 = *(long *)(lVar32 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(lVar32 + -0x20) + (*(long *)(lVar28 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
            );
  auVar44 = (**(code **)(lVar28 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004ed290:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(long *)(puVar6 + -0x210) = lVar34;
  *(undefined **)(puVar6 + -0x208) = puVar37;
  *(undefined8 *)(puVar6 + -0x200) = 0;
  func_0x00525f7c(puVar6 + -400,puVar6 + -0x210,uVar29,uVar33);
  lVar32 = func_0x0051cc44(lVar34,puVar6 + -0x120,puVar6 + -0x310,puVar6 + -400);
  puVar36 = *(ulong **)(puVar6 + -0x418);
  if (lVar20 != 0) {
    func_0x00187bd4(uVar29,lVar20 << 4,8);
  }
  goto LAB_004ede04;
code_r0x004ee3f8:
  puVar12 = &UNK_009e8218;
  goto code_r0x004ee400;
code_r0x004ec2a0:
  auVar44 = func_0x005066f0(lVar20);
  lVar32 = auVar44._8_8_;
  if (auVar44._0_8_ == 0) {
    *(undefined1 **)(puVar6 + -0xc0) = puVar6 + -0x124;
    *(undefined **)(puVar6 + -0xb8) =
         &__ZN43__LT_char_u20_as_u20_core__fmt__Display_GT_3fmt17ha5099e7a97893038E;
    *(undefined **)(puVar6 + -0x120) = &UNK_009e8230;
    *(undefined8 *)(puVar6 + -0x118) = 1;
    *(undefined8 *)(puVar6 + -0x100) = 0;
    *(undefined1 **)(puVar6 + -0x110) = puVar6 + -0xc0;
    *(undefined8 *)(puVar6 + -0x108) = 1;
    func_0x00459f08(puVar6 + -0x90,puVar6 + -0x120);
    *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0x88);
    *(undefined8 *)(puVar6 + -0x468) = *(undefined8 *)(puVar6 + -0x90);
    uVar9 = 0x8000000000000007;
    lVar32 = *(long *)(puVar6 + -0x80);
  }
  else {
    lVar20 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
    *(long *)(puVar6 + -0x468) = lVar20;
    if (lVar20 == 0) {
      lVar20 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x18) + 1;
      *(long *)(*(long *)(puVar6 + -0x3f8) + 0x18) = lVar20;
      if (lVar32 < 0) {
        *(undefined8 *)(puVar6 + -0x480) = 0;
code_r0x004ee62c:
        func_0x007a1f00(*(undefined8 *)(puVar6 + -0x480),*(undefined8 *)(puVar6 + -0x4d0),
                        &UNK_009e80a0);
        goto code_r0x004ee65c;
      }
      if (lVar32 == 0) {
        lVar10 = 1;
      }
      else {
        lVar10 = func_0x00187bd0(lVar32,1);
        if (lVar10 == 0) {
          *(long *)(puVar6 + -0x4d0) = lVar32;
          goto code_r0x004ee62c;
        }
      }
      *(long *)(puVar6 + -0x4d0) = lVar10;
      _memcpy(lVar10,auVar44._0_8_,lVar32);
      if ((**(uint **)(puVar6 + -0x3f8) & 1) == 0) {
        puVar18 = *(undefined8 **)(puVar6 + -0x3f8);
        *puVar18 = 1;
        puVar18[1] = lVar20;
      }
      iVar8 = func_0x005384e8(puVar6 + -0x350);
      if (iVar8 != 0) {
        **(undefined8 **)(puVar6 + -0x3f8) = 0;
      }
      uVar9 = 0x8000000000000000;
      *(undefined8 *)(puVar6 + -0x470) = *(undefined8 *)(puVar6 + -0x4d0);
      *(long *)(puVar6 + -0x468) = lVar32;
    }
    else {
      lVar32 = *(long *)(puVar6 + -0x460);
      uVar9 = 0x8000000000000009;
    }
  }
LAB_004ebf5c:
  uVar25 = *(ulong *)(puVar6 + -400);
  uVar11 = uVar25 ^ 0x8000000000000000;
  if (8 < uVar11) {
    uVar11 = 4;
  }
  plVar17 = *(long **)(puVar6 + -0x448);
  if (uVar11 - 6 < 2) {
code_r0x004ec07c:
    if (*plVar17 != 0) {
      func_0x00187bd4(plVar17[1],*plVar17,1);
    }
  }
  else {
    if (uVar11 == 4) {
      if (uVar25 != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar6 + -0x188),uVar25,1);
      }
      plVar17 = *(long **)(puVar6 + -0x478);
      if (*(long *)(puVar6 + -0x178) != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar6 + -0x170),*(long *)(puVar6 + -0x178) << 4,8);
        plVar17 = *(long **)(puVar6 + -0x478);
      }
      goto code_r0x004ec07c;
    }
    plVar17 = *(long **)(puVar6 + -0x448);
    if (uVar11 == 0) goto code_r0x004ec07c;
  }
code_r0x004ec454:
  if (uVar9 == 0x8000000000000009) {
    lVar32 = *(long *)(puVar6 + -0x468);
    goto LAB_004ede04;
  }
code_r0x004ec468:
  *(undefined8 *)(puVar6 + -0x300) = *(undefined8 *)(puVar6 + -0x470);
  *(long *)(puVar6 + -0x2f8) = lVar32;
  *(long *)(puVar6 + -0x460) = lVar32;
  *(undefined8 *)(puVar6 + -0x2e8) = *(undefined8 *)(puVar6 + -0x2b8);
  *(undefined8 *)(puVar6 + -0x2f0) = *(undefined8 *)(puVar6 + -0x2c0);
  *(undefined8 *)(puVar6 + -0x2d8) = *(undefined8 *)(puVar6 + -0x2a8);
  *(undefined8 *)(puVar6 + -0x2e0) = *(undefined8 *)(puVar6 + -0x2b0);
  *(undefined8 *)(puVar6 + -0x2d0) = *(undefined8 *)(puVar6 + -0x2a0);
  *(ulong *)(puVar6 + -0x310) = uVar9;
  *(undefined8 *)(puVar6 + -0x308) = *(undefined8 *)(puVar6 + -0x468);
  uVar9 = uVar9 ^ 0x8000000000000000;
  uVar11 = uVar9;
  if (8 < uVar9) {
    uVar11 = 4;
  }
  unaff_x28 = unaff_x27;
  if ((long)uVar11 < 5) {
    if (1 < (long)uVar11) {
      if (uVar11 != 2) {
        func_0x007a247c(&UNK_008a386f,0x28,&UNK_009e80f8);
        goto code_r0x004ee65c;
      }
      puVar30 = (undefined1 *)0x0;
      *(undefined8 *)(puVar6 + -0x408) = 0;
      goto LAB_004eb158;
    }
    if (uVar11 != 0) {
      unaff_x23 = *(ulong *)(puVar6 + -0x470);
      unaff_x25 = *(undefined8 **)(puVar6 + -0x468);
      puVar30 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      *(undefined8 *)(puVar6 + -0x408) = 0;
      goto LAB_004eb158;
    }
    unaff_x19 = (ulong)**(uint **)(puVar6 + -0x3f8);
    uVar29 = *(undefined8 *)(puVar6 + -0x470);
    uVar33 = *(undefined8 *)(puVar6 + -0x468);
    uVar35 = *(undefined8 *)(puVar6 + -0x460);
    if ((**(uint **)(puVar6 + -0x3f8) & 1) != 0) {
      lVar28 = *(long *)(puVar6 + -0x3f8);
      lVar32 = *(long *)(lVar28 + 8);
      func_0x00537f94(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000,2,0xffffffffffffffff);
      *(long *)(lVar28 + 0x20) = (*(long *)(lVar28 + 0x18) - lVar32) + 1;
    }
    lVar32 = *(long *)(puVar6 + -0x3e0);
    if ((lVar32 != -0x8000000000000000) && (lVar32 != 0)) {
      func_0x00187bd4(*(undefined8 *)(puVar6 + -0x3d8),lVar32,1);
    }
    *(undefined8 *)(puVar6 + -0x3e0) = uVar33;
    *(undefined8 *)(puVar6 + -0x3d8) = uVar29;
    *(undefined8 *)(puVar6 + -0x3d0) = uVar35;
    if ((uVar9 < 8) && ((1L << (uVar9 & 0x3f) & 0xc3U) != 0)) {
      lVar32 = *(long *)(puVar6 + -0x3e0);
    }
    else {
      func_0x004ea680(puVar6 + -0x310);
      lVar32 = *(long *)(puVar6 + -0x3e0);
    }
    goto joined_r0x004edf84;
  }
  if ((long)uVar11 < 7) {
    puVar30 = *(undefined1 **)(puVar6 + -0x420);
    if (uVar11 != 5) {
      lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
      if (lVar32 != 0) {
        func_0x004e9f14();
      }
      lVar32 = 0;
      lVar20 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x10);
      *(undefined8 *)(puVar6 + -400) = *(undefined8 *)(puVar6 + -0x468);
      *(undefined8 *)(puVar6 + -0x188) = *(undefined8 *)(puVar6 + -0x470);
      *(undefined8 *)(puVar6 + -0x180) = *(undefined8 *)(puVar6 + -0x460);
      lVar28 = *(long *)(lVar20 + 0xf0) << 4;
      uVar11 = 0xffffffffffffffff;
      plVar17 = *(long **)(lVar20 + 0xe8);
      goto code_r0x004ed100;
    }
  }
  else {
    puVar30 = *(undefined1 **)(puVar6 + -0x420);
    if (uVar11 == 7) {
      lVar28 = *(long *)(puVar6 + -0x3f8);
      lVar32 = func_0x004f15d8(lVar28,puVar36);
      if (lVar32 != 0) {
        func_0x004e9f14();
      }
      lVar32 = *(long *)(lVar28 + 0x10);
      if (*(long *)(lVar32 + 0x90) == 0) goto code_r0x004ed17c;
      lVar28 = *(long *)(lVar32 + 0x90) * 600;
      piVar22 = (int *)(*(long *)(lVar32 + 0x88) + 0x248);
      goto code_r0x004ed084;
    }
  }
  if (((7 < uVar9) || ((1L << (uVar9 & 0x3f) & 0xc3U) == 0)) &&
     (((uVar11 & 0xe) == 6 && (*(long *)(puVar6 + -0x468) != 0)))) {
    func_0x00187bd4(*(undefined8 *)(puVar6 + -0x470),*(undefined8 *)(puVar6 + -0x468),1);
  }
  goto LAB_004ec510;
  while( true ) {
    lVar20 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar9 = uVar9 + 1;
    lVar32 = lVar32 + 0x20;
    lVar28 = lVar28 + -0x10;
    plVar17 = plVar17 + 2;
    if (lVar20 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
code_r0x004ed594:
    if (lVar28 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004ed614;
    }
  }
  if (unaff_x20[0x21] <= uVar9) {
    func_0x007a2570(uVar9,unaff_x20[0x21],&UNK_009e9b68);
    goto code_r0x004ee65c;
  }
  lVar28 = *(long *)(unaff_x20[0x20] + lVar32 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(unaff_x20[0x20] + lVar32 + -0x20) +
             (*(long *)(lVar28 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  auVar44 = (**(code **)(lVar28 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004ed614:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(ulong **)(puVar6 + -0x210) = unaff_x20;
  *(undefined **)(puVar6 + -0x208) = puVar37;
  *(undefined8 *)(puVar6 + -0x200) = 0;
  func_0x00525f7c(puVar6 + -0x290,puVar6 + -0x210,8,0);
  lVar32 = func_0x0051b4a8(unaff_x20,puVar6 + -0x310,puVar6 + -400,puVar6 + -0x290);
  goto LAB_004ede04;
code_r0x004ed470:
  uVar33 = *(undefined8 *)(uVar9 + 0x230);
  unaff_x25 = *(undefined8 **)(uVar9 + 0x238);
  if (puVar18 == unaff_x25) {
    iVar8 = _memcmp(uVar29,uVar33,puVar18);
    unaff_x26 = puVar18;
    if (iVar8 == 0) goto code_r0x004ed4e8;
  }
  unaff_x28 = puVar18;
  if (*(long *)(uVar9 + 0x48) != 0) {
    lVar32 = *(long *)(uVar9 + 0x48) * 0x18;
    puVar19 = (undefined8 *)(*(long *)(uVar9 + 0x40) + 8);
    do {
      unaff_x27 = puVar19 + 3;
      if ((puVar18 == (undefined8 *)*puVar19) &&
         (iVar8 = _memcmp(uVar29,puVar19[-1],puVar18), iVar8 == 0)) {
        unaff_x26 = unaff_x25;
        goto code_r0x004ed4e8;
      }
      lVar32 = lVar32 + -0x18;
      puVar19 = unaff_x27;
    } while (lVar32 != 0);
  }
  uVar9 = uVar9 + 0x2c8;
  if (uVar9 == uVar11) goto code_r0x004ee45c;
  goto code_r0x004ed470;
code_r0x004ed4e8:
  if ((long)unaff_x26 < 0) {
code_r0x004ee4d4:
    *(undefined8 *)(puVar6 + -0x480) = 0;
code_r0x004ee574:
    func_0x007a1f00(*(undefined8 *)(puVar6 + -0x480),*(undefined8 *)(puVar6 + -0x4b8),&UNK_009e80a0)
    ;
    goto code_r0x004ee65c;
  }
  if (unaff_x26 == (undefined8 *)0x0) {
    unaff_x21 = 1;
    _memcpy(1,uVar33,0);
    bVar13 = *(byte *)((long)unaff_x20 + 700);
  }
  else {
    unaff_x21 = func_0x00187bd0(unaff_x26,1);
    if (unaff_x21 == 0) {
      *(undefined8 *)(puVar6 + -0x480) = 1;
      *(undefined8 **)(puVar6 + -0x4b8) = unaff_x26;
      goto code_r0x004ee574;
    }
    _memcpy(unaff_x21,uVar33,unaff_x26);
    bVar13 = *(byte *)((long)unaff_x20 + 700);
  }
  if ((bVar13 & 1) == 0) {
    unaff_x24 = (ulong)(uint)unaff_x20[0x58];
  }
  else {
    unaff_x24 = 1;
  }
  in_x3 = *(ulong *)(puVar6 + -1000);
  lVar32 = func_0x00503d08(unaff_x20,unaff_x21,unaff_x26);
  if (lVar32 == 0) goto code_r0x004edf24;
  *(undefined8 *)(puVar6 + -0x1c8) = 8;
  *(undefined8 *)(puVar6 + -0x1c0) = 0;
  *(undefined8 *)(puVar6 + -0x1b8) = 0;
  *(undefined8 *)(puVar6 + -0x1b0) = 8;
  *(undefined8 *)(puVar6 + -0x1a0) = 0;
  *(undefined8 *)(puVar6 + -0x1a8) = 0;
  *(undefined8 *)(puVar6 + -0x1d0) = 0;
  *(undefined8 *)(puVar6 + -0x210) = 2;
  *(long *)(puVar6 + -0x280) = lVar32;
  *(undefined8 *)(puVar6 + -0x290) = 0;
  *(undefined8 *)(puVar6 + -0x270) = 0;
  *(undefined8 *)(puVar6 + -0x278) = 0;
  if ((unaff_x19 & 1) != 0) {
    puVar18 = *(undefined8 **)(puVar6 + -0x3f8);
    uVar29 = *puVar18;
    *(undefined8 *)(puVar6 + -0x288) = puVar18[1];
    *(undefined8 *)(puVar6 + -0x290) = uVar29;
    uVar29 = puVar18[3];
    *(undefined8 *)(puVar6 + -0x270) = puVar18[4];
    *(undefined8 *)(puVar6 + -0x278) = uVar29;
  }
  auVar44._8_8_ = puVar6 + -0x210;
  auVar44._0_8_ = puVar6 + -0x290;
  puVar12 = *(undefined **)(puVar6 + -0x410);
  puVar37 = &UNK_004ed7fc;
  puVar6 = puVar6 + -0x4e0;
  unaff_x23 = in_x3;
  goto LAB_004eb004;
code_r0x004edf24:
  if (unaff_x26 != (undefined8 *)0x0) {
    func_0x00187bd4(unaff_x21,unaff_x26,1);
  }
  lVar32 = *(long *)(puVar6 + -0x3e0);
  puVar36 = *(ulong **)(puVar6 + -0x418);
  if ((lVar32 != -0x8000000000000000) && (lVar32 != 0)) {
    func_0x00187bd4(*(undefined8 *)(puVar6 + -0x3d8),lVar32,1);
  }
code_r0x004edf88:
  lVar28 = *(long *)(puVar6 + -0x3f8);
  goto code_r0x004edf8c;
code_r0x004ee45c:
  func_0x007a23d8(&UNK_008a3952,99,&UNK_009e8170);
  goto code_r0x004ee65c;
  while( true ) {
    lVar34 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar11 = uVar11 + 1;
    lVar32 = lVar32 + 0x20;
    lVar28 = lVar28 + -0x10;
    plVar17 = plVar17 + 2;
    if (lVar34 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
code_r0x004ed100:
    if (lVar28 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004ed6b4;
    }
  }
  if (*(ulong *)(lVar20 + 0x108) <= uVar11) {
    func_0x007a2570(uVar11,*(ulong *)(lVar20 + 0x108),&UNK_009e9b68);
    goto code_r0x004ee65c;
  }
  lVar32 = *(long *)(lVar20 + 0x100) + lVar32;
  lVar28 = *(long *)(lVar32 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(lVar32 + -0x20) + (*(long *)(lVar28 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
            );
  auVar44 = (**(code **)(lVar28 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004ed6b4:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(long *)(puVar6 + -0x210) = lVar20;
  *(undefined **)(puVar6 + -0x208) = puVar37;
  *(undefined8 *)(puVar6 + -0x200) = 0;
  func_0x00525f7c(puVar6 + -0x290,puVar6 + -0x210,8,0);
  lVar32 = func_0x0051b80c(lVar20,puVar6 + -400,puVar6 + -0x290);
  goto code_r0x004ed6f4;
  while( true ) {
    piVar22 = piVar22 + 0x96;
    lVar28 = lVar28 + -600;
    if (lVar28 == 0) break;
code_r0x004ed084:
    if ((*(long *)(piVar22 + -8) == 0) && (*piVar22 == 0x110000)) {
      uVar29 = 1;
      goto code_r0x004ed180;
    }
  }
code_r0x004ed17c:
  uVar29 = 0;
code_r0x004ed180:
  lVar28 = 0;
  *(undefined8 *)(puVar6 + -0x120) = *(undefined8 *)(puVar6 + -0x468);
  *(undefined8 *)(puVar6 + -0x118) = *(undefined8 *)(puVar6 + -0x470);
  *(undefined8 *)(puVar6 + -0x110) = *(undefined8 *)(puVar6 + -0x460);
  *(undefined8 *)(puVar6 + -0x210) = 0x8000000000000000;
  lVar20 = *(long *)(lVar32 + 0xf0) << 4;
  uVar11 = 0xffffffffffffffff;
  plVar17 = *(long **)(lVar32 + 0xe8);
  do {
    if (lVar20 == 0) {
      puVar12 = (undefined *)0x0;
      goto code_r0x004ed664;
    }
    lVar34 = *plVar17;
    plVar2 = plVar17 + 1;
    uVar11 = uVar11 + 1;
    lVar28 = lVar28 + 0x20;
    lVar20 = lVar20 + -0x10;
    plVar17 = plVar17 + 2;
  } while (lVar34 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (*(ulong *)(lVar32 + 0x108) <= uVar11) {
    func_0x007a2570(uVar11,*(ulong *)(lVar32 + 0x108),&UNK_009e9b68);
    goto code_r0x004ee65c;
  }
  lVar28 = *(long *)(lVar32 + 0x100) + lVar28;
  lVar20 = *(long *)(lVar28 + -0x18);
  puVar12 = (undefined *)
            (*(long *)(lVar28 + -0x20) + (*(long *)(lVar20 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
            );
  auVar44 = (**(code **)(lVar20 + 0x18))(puVar12);
  if (auVar44._0_8_ != 0x1414db8803bc16e0 || auVar44._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto code_r0x004ee65c;
  }
code_r0x004ed664:
  puVar37 = &UNK_008a7b62;
  if (puVar12 != (undefined *)0x0) {
    puVar37 = puVar12;
  }
  *(long *)(puVar6 + -0x290) = lVar32;
  *(undefined **)(puVar6 + -0x288) = puVar37;
  *(undefined8 *)(puVar6 + -0x280) = 0;
  func_0x00525f7c(puVar6 + -400,puVar6 + -0x290,8,0);
  lVar32 = func_0x0051d650(lVar32,puVar6 + -0x120,puVar6 + -0x210,uVar29,puVar6 + -400);
code_r0x004ed6f4:
  if (((7 < uVar9) || ((1L << (uVar9 & 0x3f) & 0xc3U) == 0)) &&
     (uVar9 = *(ulong *)(puVar6 + -0x308), uVar9 != 0)) {
    uVar29 = *(undefined8 *)(puVar6 + -0x300);
LAB_004ed720:
    func_0x00187bd4(uVar29,uVar9,1);
  }
  goto LAB_004ede04;
code_r0x004ec724:
  lVar32 = *(long *)(puVar6 + -0x3f0) + 1;
  unaff_x23 = *(ulong *)(puVar6 + -0x440);
  unaff_x25 = *(undefined8 **)(puVar6 + -0x438);
  if (lVar32 == lVar28) {
    lVar20 = *(long *)(*(long *)(*(long *)(puVar6 + -0x3f8) + 0x10) + 0x90);
    if (lVar20 != 0) {
      lVar10 = 0;
      lVar21 = *(long *)(*(long *)(*(long *)(puVar6 + -0x3f8) + 0x10) + 0x88);
code_r0x004ec780:
      if (((*(long *)(lVar21 + lVar10 + 0x228) != 0) ||
          (*(int *)(lVar21 + lVar10 + 0x248) != 0x110000)) ||
         ((lVar26 = lVar21 + lVar10,
          (*(uint *)(lVar26 + 0x10) &
          (uint)(*(ulong *)(lVar26 + 0x18) != *(ulong *)(lVar26 + 0x20) ||
                1 < *(ulong *)(lVar26 + 0x18))) == 0 && (*(char *)(lVar26 + 0x254) != '\x01'))))
      goto code_r0x004ec774;
      lVar27 = *(long *)(lVar26 + 0x30);
      if (*(int *)(lVar26 + 0x28) == 0) {
        lVar27 = 0;
      }
      if (lVar32 == lVar27) goto code_r0x004ec774;
      lVar10 = 0;
      do {
        lVar26 = lVar21;
        if (*(int *)(lVar21 + 0x248) != 0x110000 || *(long *)(lVar21 + 0x228) != 0) {
          lVar26 = lVar10;
        }
        lVar21 = lVar21 + 600;
        lVar20 = lVar20 + -1;
        lVar10 = lVar26;
      } while (lVar20 != 0);
      if (lVar26 == 0) goto code_r0x004ec7fc;
      uVar14 = *(byte *)(lVar26 + 0x251) & 1;
      goto code_r0x004ec800;
    }
  }
code_r0x004ec7fc:
  uVar14 = 1;
code_r0x004ec800:
  lVar10 = *(long *)(*(long *)(puVar6 + -0x3f8) + 0x10);
  piVar22 = *(int **)(lVar10 + 0xa0);
  puVar16 = (ulong *)(piVar22 + -2);
  lVar20 = *(long *)(lVar10 + 0xa8) << 5;
  do {
    uVar23 = 0;
    if (lVar20 == 0) goto code_r0x004ec864;
    iVar8 = *piVar22;
    plVar17 = (long *)(piVar22 + 2);
    piVar22 = piVar22 + 8;
    puVar16 = puVar16 + 4;
    lVar20 = lVar20 + -0x20;
  } while (iVar8 != 2 || *plVar17 != *(long *)(puVar6 + -0x3f0));
  uVar9 = *puVar16;
  uVar11 = *(ulong *)(lVar10 + 0x90);
  if (uVar11 <= uVar9) {
code_r0x004ee4ac:
    func_0x007a2570(uVar9,uVar11,&UNK_009e93b8);
    goto code_r0x004ee65c;
  }
  uVar23 = (uint)(*(long *)(*(long *)(lVar10 + 0x88) + uVar9 * 600 + 0x238) != 0);
code_r0x004ec864:
  if ((*(uint *)(lVar10 + 700) >> 4 & 1) == 0) {
    uVar24 = (uint)((*(byte *)(lVar10 + 0x2c0) & 0x10) == 0);
  }
  else {
    uVar24 = 0;
  }
  if ((uVar23 | uVar14 & ((uint)(lVar32 != lVar28) | uVar24 | (uint)*(ulong *)(puVar6 + -0x408))) ==
      1) {
    if ((*(ulong *)(puVar6 + -0x408) & 1) != 0) {
      if ((*(uint *)(lVar10 + 700) >> 4 & 1) == 0) {
        bVar13 = *(byte *)(lVar10 + 0x2c0) >> 4 & 1;
      }
      else {
        bVar13 = 1;
      }
      if (lVar34 != 0) {
        bVar13 = 1;
      }
      lVar32 = lVar28;
      if (bVar13 == 0) {
        lVar32 = *(long *)(puVar6 + -0x3f0);
      }
      *(long *)(puVar6 + -0x3f0) = lVar32;
    }
  }
  else {
    auVar44 = func_0x00537f20(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000);
    if (auVar44._0_8_ != 0) {
      *(undefined1 (*) [16])(puVar6 + -0x290) = auVar44;
      if (*(long *)(lVar10 + 0x90) != 0) {
        puVar30 = *(undefined1 **)(lVar10 + 0x88);
        lVar20 = *(long *)(lVar10 + 0x90) * 600;
        do {
          if ((((*(long *)(puVar30 + 0x228) == 0) && (*(int *)(puVar30 + 0x248) == 0x110000)) &&
              (*(int *)(puVar30 + 0x28) == 1)) &&
             (*(long *)(puVar30 + 0x30) == *(long *)(puVar6 + -0x3f0))) {
            lVar20 = func_0x00506aac(lVar10,puVar30 + 0x218,&UNK_009e81a0);
            if ((((*(byte *)(lVar20 + 0x250) >> 5 & 1) != 0) ||
                ((lVar20 = func_0x00506aac(lVar10,puVar30 + 0x218,&UNK_009e81b8),
                 (*(byte *)(lVar20 + 0x250) >> 6 & 1) != 0 &&
                 (uVar9 = func_0x0053803c(puVar6 + -0x290), (uVar9 & 1) != 0)))) ||
               ((uVar9 = func_0x00538218(puVar6 + -0x290), (uVar9 & 1) == 0 &&
                (uVar9 = func_0x00538390(puVar6 + -0x290), (uVar9 & 1) == 0)))) {
              func_0x005383dc(puVar6 + -0x210,puVar6 + -0x290);
              lVar20 = func_0x004efb0c(*(undefined8 *)(puVar6 + -0x3f8),puVar6 + -0x210,
                                       (uint)unaff_x27 & 1);
              if (lVar20 == 0) goto code_r0x004ec9c4;
            }
            break;
          }
          puVar30 = puVar30 + 600;
          lVar20 = lVar20 + -600;
        } while (lVar20 != 0);
      }
    }
    *(long *)(puVar6 + -0x3f0) = lVar32;
  }
code_r0x004ec9c4:
  auVar48._8_8_ = puVar30;
  auVar48._0_8_ = unaff_x25;
  piVar22 = *(int **)(lVar10 + 0xa0);
  puVar16 = (ulong *)(piVar22 + -2);
  lVar32 = *(long *)(lVar10 + 0xa8) << 5;
  do {
    if (lVar32 == 0) {
      if (((*(byte *)(lVar10 + 0x2bd) >> 2 & 1) == 0) && ((*(byte *)(lVar10 + 0x2c1) >> 2 & 1) == 0)
         ) {
        uVar29 = *(undefined8 *)(puVar6 + -0x3f8);
        lVar32 = func_0x004f15d8(uVar29,puVar36);
        if (lVar32 != 0) {
          func_0x004e9f14();
        }
        lVar32 = func_0x004eed80(uVar29,puVar6 + -0x3c0,(uint)unaff_x27 & 1,
                                 (uint)*(undefined8 *)(puVar6 + -0x408) & 1,puVar36[9],puVar36[10]);
        goto LAB_004ede04;
      }
      puVar16 = (ulong *)&
                         __ZN12clap_builder7builder7command7Command36get_external_subcommand_value_parser7DEFAULT17h2ead2e4b3c900b41E
      ;
      if (*(ulong *)(lVar10 + 0x20) != 5) {
        puVar16 = (ulong *)(lVar10 + 0x20);
      }
      uVar9 = *puVar16;
      if (3 < uVar9) {
        auVar48 = (**(code **)(puVar16[2] + 0x38))(puVar16[1]);
      }
      puVar18 = auVar48._8_8_;
      uVar29 = auVar48._0_8_;
      *(ulong *)(puVar6 + -0x310) = uVar9;
      *(undefined1 (*) [16])(puVar6 + -0x308) = auVar48;
      func_0x005383dc(puVar6 + -400,puVar6 + -0x3c0);
      if (*(int *)(puVar6 + -400) == 1) {
        lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
        if (lVar32 != 0) {
          func_0x004e9f14();
        }
        uVar33 = *(undefined8 *)(*(long *)(puVar6 + -0x3f8) + 0x10);
        func_0x00525e7c(puVar6 + -0x210,uVar33);
        func_0x00525f7c(puVar6 + -0x290,puVar6 + -0x210,8,0);
        lVar32 = func_0x0051ca70(uVar33,puVar6 + -0x290);
        goto code_r0x004ee218;
      }
      lVar28 = *(long *)(puVar6 + -0x180);
      if (lVar28 < 0) {
        unaff_x23 = 0;
code_r0x004ee5e8:
        func_0x007a1f00(unaff_x23,lVar28,&UNK_009e80a0);
        goto code_r0x004ee65c;
      }
      uVar33 = *(undefined8 *)(puVar6 + -0x188);
      if (lVar28 == 0) {
        lVar32 = 1;
      }
      else {
        unaff_x23 = 1;
        lVar32 = func_0x00187bd0(lVar28,1);
        if (lVar32 == 0) goto code_r0x004ee5e8;
      }
      *(undefined8 *)(puVar6 + -0x3f0) = uVar29;
      *(long *)(puVar6 + -0x400) = lVar32;
      _memcpy(lVar32,uVar33,lVar28);
      *(undefined8 *)(puVar6 + -0x248) = 8;
      *(undefined8 *)(puVar6 + -0x240) = 0;
      *(undefined8 *)(puVar6 + -0x238) = 0;
      *(undefined8 *)(puVar6 + -0x230) = 8;
      *(undefined8 *)(puVar6 + -0x220) = 0;
      *(undefined8 *)(puVar6 + -0x228) = 0;
      *(undefined8 *)(puVar6 + -0x250) = 0;
      *(undefined8 *)(puVar6 + -0x290) = 2;
      func_0x0051795c(puVar6 + -0x290,lVar10);
      auVar44 = func_0x00537f4c(*(undefined8 *)(puVar6 + -0x410),puVar6 + -1000);
      lVar32 = auVar44._0_8_;
      if (lVar32 == auVar44._8_8_) goto code_r0x004ee16c;
      uVar29 = 1;
      goto LAB_004ee0c0;
    }
    iVar8 = *piVar22;
    plVar17 = (long *)(piVar22 + 2);
    piVar22 = piVar22 + 8;
    puVar16 = puVar16 + 4;
    lVar32 = lVar32 + -0x20;
  } while (iVar8 != 2 || *plVar17 != *(long *)(puVar6 + -0x3f0));
  uVar9 = *puVar16;
  uVar11 = *(ulong *)(lVar10 + 0x90);
  if (uVar11 <= uVar9) goto code_r0x004ee4ac;
  lVar20 = *(long *)(lVar10 + 0x88) + uVar9 * 600;
  uVar14 = *(uint *)(lVar20 + 0x250);
  if ((uVar14 & 0x100) != 0 && (*(ulong *)(puVar6 + -0x408) & 1) == 0) {
    lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
    if (lVar32 != 0) {
      func_0x004e9f14();
    }
    uVar33 = *(undefined8 *)(*(long *)(puVar6 + -0x3f8) + 0x10);
    func_0x00538438(puVar6 + -0x310,puVar6 + -0x3c0);
    uVar29 = *(undefined8 *)(puVar6 + -0x308);
    lVar32 = *(long *)(puVar6 + -0x300);
    if (lVar32 < 0) {
      uVar35 = 0;
LAB_004ee648:
      func_0x007a1f00(uVar35,lVar32,&UNK_009e80a0);
      goto code_r0x004ee65c;
    }
    if (lVar32 == 0) {
      lVar28 = 1;
    }
    else {
      uVar35 = 1;
      lVar28 = func_0x00187bd0(lVar32,1);
      if (lVar28 == 0) goto LAB_004ee648;
      puVar36 = *(ulong **)(puVar6 + -0x418);
    }
    _memcpy(lVar28,uVar29,lVar32);
    *(long *)(puVar6 + -0x120) = lVar32;
    *(long *)(puVar6 + -0x118) = lVar28;
    *(long *)(puVar6 + -0x110) = lVar32;
    *(undefined8 *)(puVar6 + -0x210) = 0x8000000000000000;
    func_0x00525e7c(puVar6 + -0x290,uVar33);
    func_0x00525f7c(puVar6 + -400,puVar6 + -0x290,8,0);
    lVar32 = func_0x0051d650(uVar33,puVar6 + -0x120,puVar6 + -0x210,0,puVar6 + -400);
    uVar9 = *(ulong *)(puVar6 + -0x310);
    if ((uVar9 | 0x8000000000000000) != 0x8000000000000000) goto LAB_004ed720;
    goto LAB_004ede04;
  }
  if (((*puVar36 == 2) || (puVar36[6] != *(ulong *)(lVar20 + 0x220))) ||
     (iVar8 = _memcmp(puVar36[5],*(undefined8 *)(lVar20 + 0x218)), iVar8 != 0)) {
code_r0x004eca80:
    lVar32 = func_0x004f15d8(*(undefined8 *)(puVar6 + -0x3f8),puVar36);
    unaff_x28 = (undefined8 *)0x0;
    if (lVar32 != 0) goto LAB_004ede04;
  }
  else {
    if ((*(uint *)(lVar20 + 0x10) & 1) == 0) {
      uVar9 = 1;
      uVar11 = 1;
    }
    else {
      uVar9 = *(ulong *)(lVar20 + 0x18);
      uVar11 = *(ulong *)(lVar20 + 0x20);
    }
    if ((uVar9 < 2) && (uVar9 == uVar11)) goto code_r0x004eca80;
  }
  *(ulong *)(puVar6 + -0x408) =
       (ulong)((uint)*(undefined8 *)(puVar6 + -0x408) | (uVar14 & 0x200) >> 9);
  uVar29 = *(undefined8 *)(puVar6 + -0x3c0);
  lVar32 = *(long *)(puVar6 + -0x3b8);
  if (((*(long *)(lVar20 + 0x238) == 0) || (lVar32 != *(long *)(lVar20 + 0x240))) ||
     (iVar8 = _memcmp(uVar29,*(long *)(lVar20 + 0x238),lVar32), iVar8 != 0)) {
    uVar9 = *puVar36;
    if (uVar9 == 2) {
      uVar9 = 0;
      uVar11 = *(ulong *)(lVar20 + 0x220);
      uVar25 = *(ulong *)(lVar20 + 0x218);
      *puVar36 = 0;
      puVar36[2] = 0;
      puVar36[3] = 8;
      puVar36[4] = 0;
      puVar36[5] = uVar25;
      puVar36[6] = uVar11;
      *(undefined1 *)(puVar36 + 7) = 2;
    }
    if (((*(ulong *)(puVar6 + -0x408) & 1) != 0) && ((uVar9 & 1) == 0)) {
      *puVar36 = 1;
      puVar36[1] = puVar36[4];
    }
    if (lVar32 < 0) {
      *(undefined8 *)(puVar6 + -0x480) = 0;
code_r0x004ee5ac:
      func_0x007a1f00(*(undefined8 *)(puVar6 + -0x480),*(undefined8 *)(puVar6 + -0x4c0),
                      &UNK_009e80a0);
      goto code_r0x004ee65c;
    }
    if (lVar32 == 0) {
      lVar10 = 1;
    }
    else {
      lVar10 = func_0x00187bd0(lVar32,1);
      if (lVar10 == 0) {
        *(long *)(puVar6 + -0x4c0) = lVar32;
        goto code_r0x004ee5ac;
      }
    }
    *(long *)(puVar6 + -0x4c0) = lVar10;
    _memcpy(lVar10,uVar29,lVar32);
    uVar9 = puVar36[4];
    if (uVar9 == puVar36[2]) {
      func_0x00403d9c(puVar36 + 2,&UNK_009e8158);
    }
    plVar17 = (long *)(puVar36[3] + uVar9 * 0x18);
    lVar10 = *(long *)(puVar6 + -0x4c0);
    *plVar17 = lVar32;
    plVar17[1] = lVar10;
    plVar17[2] = lVar32;
    puVar36[4] = uVar9 + 1;
    if ((((*(uint *)(lVar20 + 0x10) & 1) != 0) &&
        (*(ulong *)(lVar20 + 0x18) != *(ulong *)(lVar20 + 0x20) || 1 < *(ulong *)(lVar20 + 0x18)))
       || (*(char *)(lVar20 + 0x254) == '\x01')) {
      unaff_x25 = *(undefined8 **)(lVar20 + 0x218);
      unaff_x23 = *(ulong *)(lVar20 + 0x220);
      puVar30 = (undefined1 *)((long)&MACH_HEADER.magic + 2);
      unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
      goto code_r0x004eb154;
    }
  }
  puVar30 = (undefined1 *)0x0;
  *(long *)(puVar6 + -0x3f0) = *(long *)(puVar6 + -0x3f0) + 1;
  unaff_x27 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
  goto code_r0x004eb154;
code_r0x004ec774:
  lVar10 = lVar10 + 600;
  if (lVar20 * 600 == lVar10) goto code_r0x004ec7fc;
  goto code_r0x004ec780;
LAB_004ee0c0:
  do {
    uVar33 = *(undefined8 *)(lVar32 + 8);
    uVar11 = *(ulong *)(lVar32 + 0x10);
    func_0x0052a488(puVar6 + -400,puVar6 + -0x310,lVar10,0,uVar33,uVar11,2);
    if (*(long *)(puVar6 + -400) == 0) {
      lVar32 = *(long *)(puVar6 + -0x188);
      func_0x004ea7c4(puVar6 + -0x290);
      uVar29 = *(undefined8 *)(puVar6 + -0x3f0);
      if (lVar28 != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar6 + -0x400),lVar28,1);
      }
      puVar36 = *(ulong **)(puVar6 + -0x418);
      goto code_r0x004ee218;
    }
    *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x188);
    *(undefined8 *)(puVar6 + -0x210) = *(undefined8 *)(puVar6 + -400);
    *(undefined8 *)(puVar6 + -0x1f8) = *(undefined8 *)(puVar6 + -0x178);
    *(undefined8 *)(puVar6 + -0x200) = *(undefined8 *)(puVar6 + -0x180);
    *(undefined8 *)(puVar6 + -0x120) = 1;
    *(undefined8 *)(puVar6 + -0x118) = 0;
    if ((long)uVar11 < 0) {
      uVar29 = 0;
code_r0x004ee494:
      func_0x007a1f00(uVar29,unaff_x23,&UNK_009e80a0);
      goto code_r0x004ee65c;
    }
    if (uVar11 == 0) {
      unaff_x23 = 1;
    }
    else {
      unaff_x23 = func_0x00187bd0(uVar11,1);
      if (unaff_x23 == 0) {
        unaff_x23 = uVar11;
        goto code_r0x004ee494;
      }
    }
    _memcpy(unaff_x23,uVar33,uVar11);
    *(ulong *)(puVar6 + -400) = uVar11;
    *(ulong *)(puVar6 + -0x188) = unaff_x23;
    *(ulong *)(puVar6 + -0x180) = uVar11;
    func_0x00517aa4(puVar6 + -0x290,puVar6 + -0x120,puVar6 + -0x210,puVar6 + -400);
    lVar32 = lVar32 + 0x18;
  } while (lVar32 != auVar44._8_8_);
code_r0x004ee16c:
  *(undefined8 *)(puVar6 + -0x1c8) = *(undefined8 *)(puVar6 + -0x248);
  *(undefined8 *)(puVar6 + -0x1d0) = *(undefined8 *)(puVar6 + -0x250);
  *(undefined8 *)(puVar6 + -0x1b8) = *(undefined8 *)(puVar6 + -0x238);
  *(undefined8 *)(puVar6 + -0x1c0) = *(undefined8 *)(puVar6 + -0x240);
  *(undefined8 *)(puVar6 + -0x1a8) = *(undefined8 *)(puVar6 + -0x228);
  *(undefined8 *)(puVar6 + -0x1b0) = *(undefined8 *)(puVar6 + -0x230);
  *(undefined8 *)(puVar6 + -0x1a0) = *(undefined8 *)(puVar6 + -0x220);
  *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x288);
  *(undefined8 *)(puVar6 + -0x210) = *(undefined8 *)(puVar6 + -0x290);
  *(undefined8 *)(puVar6 + -0x1f8) = *(undefined8 *)(puVar6 + -0x278);
  *(undefined8 *)(puVar6 + -0x200) = *(undefined8 *)(puVar6 + -0x280);
  *(undefined8 *)(puVar6 + -0x1e8) = *(undefined8 *)(puVar6 + -0x268);
  *(undefined8 *)(puVar6 + -0x1f0) = *(undefined8 *)(puVar6 + -0x270);
  *(undefined8 *)(puVar6 + -0x1d8) = *(undefined8 *)(puVar6 + -600);
  *(undefined8 *)(puVar6 + -0x1e0) = *(undefined8 *)(puVar6 + -0x260);
  func_0x00516ab4(puVar6 + -400,puVar6 + -0x210);
  *(long *)(puVar6 + -0x210) = lVar28;
  *(undefined8 *)(puVar6 + -0x208) = *(undefined8 *)(puVar6 + -0x400);
  *(undefined8 *)(puVar6 + -0x1f0) = *(undefined8 *)(puVar6 + -0x188);
  *(undefined8 *)(puVar6 + -0x1f8) = *(undefined8 *)(puVar6 + -400);
  *(undefined8 *)(puVar6 + -0x1e0) = *(undefined8 *)(puVar6 + -0x178);
  *(undefined8 *)(puVar6 + -0x1e8) = *(undefined8 *)(puVar6 + -0x180);
  *(undefined8 *)(puVar6 + -0x1d0) = *(undefined8 *)(puVar6 + -0x168);
  *(undefined8 *)(puVar6 + -0x1d8) = *(undefined8 *)(puVar6 + -0x170);
  *(long *)(puVar6 + -0x200) = lVar28;
  *(undefined8 *)(puVar6 + -0x1c8) = *(undefined8 *)(puVar6 + -0x160);
  puVar36 = *(ulong **)(puVar6 + -0x418);
  func_0x005174c8(puVar36,puVar6 + -0x210);
  uVar29 = *(undefined8 *)(puVar6 + -0x3f0);
  lVar32 = 0;
code_r0x004ee218:
  if (3 < uVar9) {
    if ((code *)*puVar18 != (code *)0x0) {
      (*(code *)*puVar18)(uVar29);
    }
    if (puVar18[1] != 0) {
      func_0x00187bd4(uVar29,puVar18[1],puVar18[2]);
    }
  }
LAB_004ede04:
  lVar28 = *(long *)(puVar6 + -0x3f8);
  lVar20 = *(long *)(puVar6 + -0x3e0);
  if ((lVar20 != -0x8000000000000000) && (lVar20 != 0)) {
    func_0x00187bd4(*(undefined8 *)(puVar6 + -0x3d8),lVar20,1);
  }
  if (lVar32 == 0) {
code_r0x004edf8c:
    lVar32 = func_0x004f15d8(lVar28,puVar36);
    if ((lVar32 == 0) && (lVar32 = func_0x004f2ac4(lVar28,puVar36), lVar32 == 0)) {
      uVar29 = *(undefined8 *)(lVar28 + 0x10);
      func_0x005053c0(puVar6 + -0x210,uVar29);
      *(undefined8 *)(puVar6 + -0x1f8) = uVar29;
      lVar32 = func_0x00521aa8(puVar6 + -0x210,puVar36);
      lVar28 = *(long *)(puVar6 + -0x200);
      if (lVar28 != 0) {
        puVar18 = (undefined8 *)(*(long *)(puVar6 + -0x208) + 8);
        do {
          if (puVar18[-1] != 0) {
            func_0x00187bd4(*puVar18,puVar18[-1] << 3,8);
          }
          puVar18 = puVar18 + 5;
          lVar28 = lVar28 + -1;
        } while (lVar28 != 0);
      }
      if (*(long *)(puVar6 + -0x210) != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar6 + -0x208),*(long *)(puVar6 + -0x210) * 0x28,8);
      }
    }
  }
  else if ((((*(byte *)(*(long *)(lVar28 + 0x10) + 700) & 1) != 0) ||
           ((*(byte *)(*(long *)(lVar28 + 0x10) + 0x2c0) & 1) != 0)) &&
          (lVar28 = func_0x004f2ac4(lVar28,puVar36), lVar28 != 0)) {
    func_0x004e9f14();
  }
  return lVar32;
}

