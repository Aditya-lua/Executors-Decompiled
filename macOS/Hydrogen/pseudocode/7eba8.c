
/* WARNING: Possible PIC construction at 0x0007f1d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007f218: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007f2ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007f284: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007f25c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007ece0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007ed00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007ed84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007eda4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007edc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0007eefc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0007edc8) */
/* WARNING: Removing unreachable block (ram,0x0007eda8) */
/* WARNING: Removing unreachable block (ram,0x0007edb4) */
/* WARNING: Removing unreachable block (ram,0x0007ed88) */
/* WARNING: Removing unreachable block (ram,0x0007eedc) */
/* WARNING: Removing unreachable block (ram,0x0007eee4) */
/* WARNING: Removing unreachable block (ram,0x0007ef18) */
/* WARNING: Removing unreachable block (ram,0x0007eeec) */
/* WARNING: Removing unreachable block (ram,0x0007ed04) */
/* WARNING: Removing unreachable block (ram,0x0007ed10) */
/* WARNING: Removing unreachable block (ram,0x0007ed18) */
/* WARNING: Removing unreachable block (ram,0x0007ed70) */
/* WARNING: Removing unreachable block (ram,0x0007ed20) */
/* WARNING: Removing unreachable block (ram,0x0007edd4) */
/* WARNING: Removing unreachable block (ram,0x0007ece4) */
/* WARNING: Removing unreachable block (ram,0x0007ed24) */
/* WARNING: Removing unreachable block (ram,0x0007ecf0) */
/* WARNING: Removing unreachable block (ram,0x0007f260) */
/* WARNING: Removing unreachable block (ram,0x0007f288) */
/* WARNING: Removing unreachable block (ram,0x0007f2b0) */
/* WARNING: Removing unreachable block (ram,0x0007f2c0) */
/* WARNING: Removing unreachable block (ram,0x0007f21c) */
/* WARNING: Removing unreachable block (ram,0x0007f1dc) */
/* WARNING: Removing unreachable block (ram,0x0007f1ec) */
/* WARNING: Removing unreachable block (ram,0x0007f248) */
/* WARNING: Removing unreachable block (ram,0x0007f254) */
/* WARNING: Removing unreachable block (ram,0x0007f1f8) */
/* WARNING: Removing unreachable block (ram,0x0007f1fc) */
/* WARNING: Removing unreachable block (ram,0x0007f270) */
/* WARNING: Removing unreachable block (ram,0x0007f2c4) */
/* WARNING: Removing unreachable block (ram,0x0007f2d0) */
/* WARNING: Removing unreachable block (ram,0x0007f298) */
/* WARNING: Removing unreachable block (ram,0x0007f2f0) */
/* WARNING: Removing unreachable block (ram,0x0007f2fc) */
/* WARNING: Removing unreachable block (ram,0x0007f2a4) */
/* WARNING: Removing unreachable block (ram,0x0007f2ec) */
/* WARNING: Removing unreachable block (ram,0x0007f22c) */
/* WARNING: Removing unreachable block (ram,0x0007f244) */
/* WARNING: Removing unreachable block (ram,0x0007f318) */
/* WARNING: Removing unreachable block (ram,0x0007f32c) */
/* WARNING: Removing unreachable block (ram,0x0007f35c) */
/* WARNING: Removing unreachable block (ram,0x0007f338) */
/* WARNING: Removing unreachable block (ram,0x0007f324) */
/* WARNING: Removing unreachable block (ram,0x0007f33c) */
/* WARNING: Removing unreachable block (ram,0x0007f27c) */
/* WARNING: Removing unreachable block (ram,0x0007f214) */
/* WARNING: Removing unreachable block (ram,0x0007ef00) */
/* WARNING: Removing unreachable block (ram,0x0007ed94) */
/* WARNING: Removing unreachable block (ram,0x0007ef0c) */
/* WARNING: Removing unreachable block (ram,0x0007ef2c) */

int FUN_0007eba8(long *param_1)

{
  byte *pbVar1;
  uint uVar2;
  byte bVar3;
  undefined1 uVar4;
  undefined1 in_CY;
  undefined1 *puVar5;
  long *plVar6;
  undefined4 *puVar7;
  int *piVar8;
  long *plVar9;
  long lVar10;
  undefined1 *puVar11;
  ulong uVar12;
  ulong uVar13;
  undefined1 *puVar14;
  ulong uVar15;
  ulong in_x9;
  long lVar16;
  long *plVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  long *plVar20;
  long lVar21;
  long *plVar22;
  long *plVar23;
  long *plVar24;
  undefined8 *puVar25;
  undefined8 *puVar26;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  long *unaff_x23;
  long *plVar27;
  undefined1 *unaff_x26;
  uint uVar28;
  undefined1 *unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar29;
  long lVar30;
  long lVar31;
  long lVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  long lVar36;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  
code_r0x0007eba8:
  if ((bool)in_CY) {
    param_1 = (long *)(in_x9 + 1);
  }
  plVar6 = (long *)__Znwm(param_1);
  if (unaff_x22 == 0) goto LAB_0007ebd4;
code_r0x0007ebbc:
  _memmove(plVar6,unaff_x23,unaff_x22);
  uVar15 = unaff_x22;
  if (unaff_x22 == 0x16) goto LAB_0007ebdc;
LAB_0007ebd4:
  __ZdlPv(unaff_x23);
  uVar15 = unaff_x22;
LAB_0007ebdc:
  unaff_x19[10] = (long)plVar6;
  unaff_x19[0xc] = (ulong)param_1 | 0x8000000000000000;
LAB_0007ebf4:
  unaff_x19[0xb] = uVar15 + 1;
LAB_0007e954:
  *(undefined1 *)((long)plVar6 + uVar15) = (char)unaff_x26;
  ((undefined1 *)((long)plVar6 + uVar15))[1] = 0;
  unaff_x19[5] = unaff_x19[5] + in_stack_00000018;
  unaff_x19[4] = unaff_x19[4] + in_stack_00000010;
  if ((char)unaff_x19[3] == '\0') {
    pbVar1 = (byte *)*unaff_x19;
    if (pbVar1 == (byte *)unaff_x19[1]) {
      *(undefined4 *)((long)unaff_x19 + 0x14) = 0xffffffff;
    }
    else {
      uVar28 = (uint)*pbVar1;
      *unaff_x19 = (long)(pbVar1 + 1);
      *(uint *)((long)unaff_x19 + 0x14) = uVar28;
      if (uVar28 != 0xffffffff) goto code_r0x0007e9ac;
    }
code_r0x0007ec2c:
    uVar28 = in_stack_00000008._4_4_;
  }
  else {
    *(undefined1 *)(unaff_x19 + 3) = 0;
    uVar28 = *(uint *)((long)unaff_x19 + 0x14);
    if (uVar28 == 0xffffffff) goto code_r0x0007ec2c;
code_r0x0007e9ac:
    plVar27 = (long *)unaff_x19[8];
    uVar4 = (undefined1)uVar28;
    if (plVar27 < (long *)unaff_x19[9]) {
      param_1 = (long *)((long)plVar27 + 1);
      *(undefined1 *)plVar27 = uVar4;
      plVar27 = param_1;
    }
    else {
      plVar6 = (long *)*unaff_x21;
      unaff_x26 = (undefined1 *)((long)plVar27 - (long)plVar6);
      puVar11 = unaff_x26 + 1;
      if ((long)puVar11 < 0) {
        func_0x00017f90();
        goto code_r0x0007ef5c;
      }
      uVar15 = unaff_x19[9] - (long)plVar6;
      puVar18 = (undefined1 *)(uVar15 * 2);
      if (puVar18 <= puVar11) {
        puVar18 = puVar11;
      }
      if (0x3ffffffffffffffe < uVar15) {
        puVar18 = unaff_x28;
      }
      if (puVar18 == (undefined1 *)0x0) {
        puVar5 = (undefined1 *)0x0;
        *unaff_x26 = uVar4;
        puVar11 = unaff_x26;
      }
      else {
        puVar5 = (undefined1 *)__Znwm(puVar18);
        puVar11 = puVar5 + (long)unaff_x26;
        *puVar11 = uVar4;
      }
      param_1 = (long *)(puVar11 + 1);
      if (plVar27 != plVar6) {
        plVar9 = plVar27;
        if ((unaff_x26 < &MACH_HEADER.cpusubtype) || ((ulong)((long)plVar6 - (long)puVar5) < 0x40))
        {
code_r0x0007eae4:
          do {
            puVar11 = puVar11 + -1;
            plVar9 = (long *)((long)plVar9 + -1);
            *puVar11 = *(undefined1 *)plVar9;
          } while (plVar9 != plVar6);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x26) {
          puVar14 = (undefined1 *)((ulong)unaff_x26 & 0xffffffffffffffc0);
          plVar9 = plVar27 + -4;
          plVar17 = (long *)(puVar5 + (long)unaff_x26 + -0x20);
          puVar19 = puVar14;
          do {
            lVar10 = *plVar9;
            lVar30 = plVar9[3];
            lVar16 = plVar9[2];
            lVar33 = plVar9[-3];
            lVar32 = plVar9[-4];
            lVar31 = plVar9[-1];
            lVar21 = plVar9[-2];
            plVar17[1] = plVar9[1];
            *plVar17 = lVar10;
            plVar17[3] = lVar30;
            plVar17[2] = lVar16;
            plVar17[-3] = lVar33;
            plVar17[-4] = lVar32;
            plVar17[-1] = lVar31;
            plVar17[-2] = lVar21;
            plVar9 = plVar9 + -8;
            plVar17 = plVar17 + -8;
            puVar19 = puVar19 + -0x40;
          } while (puVar19 != (undefined1 *)0x0);
          if (unaff_x26 != puVar14) {
            if (((ulong)unaff_x26 & 0x38) == 0) {
              puVar11 = puVar11 + -(long)puVar14;
              plVar9 = (long *)((long)plVar27 - (long)puVar14);
              goto code_r0x0007eae4;
            }
            goto code_r0x0007ea94;
          }
        }
        else {
          puVar14 = (undefined1 *)0x0;
code_r0x0007ea94:
          puVar19 = (undefined1 *)((ulong)unaff_x26 & 0xfffffffffffffff8);
          plVar9 = (long *)((long)plVar27 - (long)puVar19);
          puVar11 = puVar11 + -(long)puVar19;
          puVar25 = (undefined8 *)((long)plVar27 - (long)puVar14);
          puVar26 = (undefined8 *)(puVar5 + ((long)puVar25 - (long)plVar6));
          lVar16 = (long)puVar14 - (long)puVar19;
          do {
            puVar25 = puVar25 + -1;
            puVar26 = puVar26 + -1;
            *puVar26 = *puVar25;
            lVar16 = lVar16 + 8;
          } while (lVar16 != 0);
          if (unaff_x26 != puVar19) goto code_r0x0007eae4;
        }
        plVar27 = (long *)*unaff_x21;
        puVar11 = puVar5;
      }
      unaff_x19[7] = (long)puVar11;
      unaff_x19[8] = (long)param_1;
      unaff_x19[9] = (long)(puVar5 + (long)puVar18);
      if (plVar27 != (long *)0x0) {
        __ZdlPv(plVar27);
      }
    }
    unaff_x19[8] = (long)param_1;
    uVar2 = *(uint *)((long)unaff_x19 + 0x14);
    unaff_x26 = (undefined1 *)(ulong)uVar2;
    if (uVar2 - 0x30 < 10) {
      bVar3 = *(byte *)((long)unaff_x19 + 0x67);
      if ((char)bVar3 < '\0') goto code_r0x0007eb48;
      if (bVar3 == 0x16) {
        unaff_x22 = 0x16;
        unaff_x23 = unaff_x20;
        goto code_r0x0007eb7c;
      }
      uVar15 = (ulong)bVar3;
      *(byte *)((long)unaff_x19 + 0x67) = bVar3 + 1 & 0x7f;
      plVar6 = unaff_x20;
      goto LAB_0007e954;
    }
    plVar9 = unaff_x19;
    uVar28 = in_stack_00000008._4_4_;
    if ((int)uVar2 < 0x45) {
      uVar15 = (ulong)in_stack_00000008._4_4_;
      if (uVar2 != 10) {
        if (uVar2 != 0x2e) goto code_r0x0007edd8;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
        if ((char)*(byte *)((long)unaff_x19 + 0x67) < '\0') {
          uVar12 = unaff_x19[0xb];
        }
        else {
          uVar12 = (ulong)*(byte *)((long)unaff_x19 + 0x67);
        }
        unaff_x19[0x12] = uVar12 - 1;
        puVar29 = &UNK_0007ece4;
        goto code_r0x0007ef6c;
      }
      unaff_x19[5] = 0;
      unaff_x19[6] = unaff_x19[6] + 1;
    }
    else {
      uVar15 = (ulong)in_stack_00000008._4_4_;
      if ((uVar2 == 0x45) || (uVar2 == 0x65)) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
        puVar29 = &UNK_0007ed88;
        goto code_r0x0007ef6c;
      }
    }
  }
code_r0x0007edd8:
  plVar6 = unaff_x19 + 5;
  lVar16 = *plVar6;
  *(undefined1 *)(unaff_x19 + 3) = 1;
  unaff_x19[4] = unaff_x19[4] + -1;
  if (lVar16 == 0) {
    plVar6 = unaff_x19 + 6;
    lVar16 = *plVar6;
    if (lVar16 == 0) goto code_r0x0007ee0c;
  }
  *plVar6 = lVar16 + -1;
code_r0x0007ee0c:
  if (*(int *)((long)unaff_x19 + 0x14) != -1) {
    unaff_x19[8] = unaff_x19[8] + -1;
  }
  uStack0000000000000028 = 0;
  puVar7 = (undefined4 *)___error();
  *puVar7 = 0;
  if (uVar28 == 6) {
    lVar16 = _strtoll();
    piVar8 = (int *)___error();
    if (*piVar8 != 0x22) {
      unaff_x19[0xe] = lVar16;
      return 6;
    }
  }
  else if (uVar28 == 5) {
    lVar16 = _strtoull();
    piVar8 = (int *)___error();
    if (*piVar8 != 0x22) {
      unaff_x19[0xf] = lVar16;
      return 5;
    }
  }
  if (*(char *)((long)unaff_x19 + 0x67) < '\0') {
    unaff_x20 = (long *)*unaff_x20;
  }
  lVar16 = _strtod(unaff_x20,&uStack0000000000000028);
  unaff_x19[0x10] = lVar16;
  return 7;
code_r0x0007eb48:
  uVar15 = unaff_x19[0xb];
  unaff_x22 = (unaff_x19[0xc] & 0x7fffffffffffffffU) - 1;
  if (uVar15 == unaff_x22) goto code_r0x0007eb5c;
  plVar6 = (long *)*unaff_x20;
  goto LAB_0007ebf4;
code_r0x0007eb5c:
  uVar15 = unaff_x22;
  if ((unaff_x19[0xc] & 0x7fffffffffffffffU) == 0x7ffffffffffffff8) {
code_r0x0007ef5c:
    func_0x0001748c();
    func_0x0001753c();
    puVar29 = &DAT_0007ef6c;
    plVar9 = (long *)func_0x0001753c();
    goto code_r0x0007ef6c;
  }
  unaff_x23 = (long *)*unaff_x20;
  if (unaff_x22 < 0x3ffffffffffffff3) {
code_r0x0007eb7c:
    uVar15 = unaff_x22 * 2;
    if (uVar15 < unaff_x22 + 1) {
      uVar15 = unaff_x22 + 1;
    }
    in_x9 = (uVar15 & 0x7ffffffffffffff8) + 8;
    if ((uVar15 | 7) != 0x17) {
      in_x9 = uVar15 | 7;
    }
    in_CY = 0x16 < uVar15;
    param_1 = (long *)((long)&MACH_HEADER.sizeofcmds + 3);
    goto code_r0x0007eba8;
  }
  param_1 = (long *)0x7ffffffffffffff7;
  plVar6 = (long *)__Znwm(0x7ffffffffffffff7);
  if (unaff_x22 != 0) goto code_r0x0007ebbc;
  goto LAB_0007ebd4;
code_r0x0007ef6c:
  *(undefined1 **)((long)register0x00000008 + -0x50) = unaff_x26;
  *(long **)((long)register0x00000008 + -0x48) = param_1;
  *(long **)((long)register0x00000008 + -0x40) = plVar6;
  *(long **)((long)register0x00000008 + -0x38) = plVar27;
  *(ulong *)((long)register0x00000008 + -0x30) = uVar15;
  *(long **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(long **)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long **)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar29;
  plVar9[5] = plVar9[5] + 1;
  plVar9[4] = plVar9[4] + 1;
  if ((char)plVar9[3] == '\0') {
    pbVar1 = (byte *)*plVar9;
    if (pbVar1 == (byte *)plVar9[1]) {
      *(undefined4 *)((long)plVar9 + 0x14) = 0xffffffff;
      return -1;
    }
    bVar3 = *pbVar1;
    param_1 = (long *)(ulong)bVar3;
    *plVar9 = (long)(pbVar1 + 1);
    uVar28 = (uint)bVar3;
    *(uint *)((long)plVar9 + 0x14) = uVar28;
  }
  else {
    *(undefined1 *)(plVar9 + 3) = 0;
    uVar28 = *(uint *)((long)plVar9 + 0x14);
    param_1 = (long *)(ulong)uVar28;
  }
  if (uVar28 == 0xffffffff) {
    return -1;
  }
  unaff_x21 = (long *)plVar9[8];
  uVar4 = SUB81(param_1,0);
  if (unaff_x21 < (long *)plVar9[9]) {
    lVar16 = (long)unaff_x21 + 1;
    *(undefined1 *)unaff_x21 = uVar4;
    goto code_r0x0007f174;
  }
  unaff_x20 = plVar9 + 7;
  plVar27 = (long *)*unaff_x20;
  plVar6 = (long *)((long)unaff_x21 - (long)plVar27);
  uVar12 = (long)plVar6 + 1;
  if (-1 < (long)uVar12) goto code_r0x0007efe0;
  unaff_x19 = (long *)func_0x00017f90(unaff_x20);
  *(ulong *)((long)register0x00000008 + -0x80) = uVar15;
  *(long **)((long)register0x00000008 + -0x78) = unaff_x21;
  *(long **)((long)register0x00000008 + -0x70) = unaff_x20;
  *(long **)((long)register0x00000008 + -0x68) = plVar9;
  *(undefined1 **)((long)register0x00000008 + -0x60) =
       (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x58) = &DAT_0007f1c4;
  unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x60);
  puVar29 = &UNK_0007f1dc;
  register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x80);
  plVar9 = unaff_x19;
  goto code_r0x0007ef6c;
code_r0x0007efe0:
  uVar13 = plVar9[9] - (long)plVar27;
  uVar15 = uVar13 * 2;
  if (uVar15 <= uVar12) {
    uVar15 = uVar12;
  }
  if (0x3ffffffffffffffe < uVar13) {
    uVar15 = 0x7fffffffffffffff;
  }
  if (uVar15 == 0) {
    lVar10 = 0;
    *(undefined1 *)plVar6 = uVar4;
    lVar30 = 0;
    plVar17 = plVar6;
  }
  else {
    lVar10 = __Znwm(uVar15);
    plVar17 = (long *)(lVar10 + (long)plVar6);
    lVar30 = lVar10 + uVar15;
    *(undefined1 *)plVar17 = uVar4;
  }
  lVar16 = (long)plVar17 + 1;
  if (unaff_x21 == plVar27) {
    plVar9[7] = (long)plVar17;
    plVar9[8] = lVar16;
    plVar9[9] = lVar30;
    goto joined_r0x0007f0b4;
  }
  plVar24 = unaff_x21;
  if ((plVar6 < &MACH_HEADER.cpusubtype) || ((ulong)((long)plVar27 - lVar10) < 0x40)) {
code_r0x0007f14c:
    do {
      plVar17 = (long *)((long)plVar17 + -1);
      plVar24 = (long *)((long)plVar24 + -1);
      *(undefined1 *)plVar17 = *(undefined1 *)plVar24;
    } while (plVar24 != plVar27);
  }
  else if ((long *)((long)&segment_command_00000020.vmaddr + 7) < plVar6) {
    plVar20 = (long *)((ulong)plVar6 & 0xffffffffffffffc0);
    plVar22 = unaff_x21 + -4;
    plVar24 = (long *)((long)plVar22 + (lVar10 - (long)plVar27));
    plVar23 = plVar20;
    do {
      lVar32 = *plVar22;
      lVar31 = plVar22[3];
      lVar21 = plVar22[2];
      lVar36 = plVar22[-3];
      lVar35 = plVar22[-4];
      lVar34 = plVar22[-1];
      lVar33 = plVar22[-2];
      plVar24[1] = plVar22[1];
      *plVar24 = lVar32;
      plVar24[3] = lVar31;
      plVar24[2] = lVar21;
      plVar24[-3] = lVar36;
      plVar24[-4] = lVar35;
      plVar24[-1] = lVar34;
      plVar24[-2] = lVar33;
      plVar22 = plVar22 + -8;
      plVar24 = plVar24 + -8;
      plVar23 = plVar23 + -8;
    } while (plVar23 != (long *)0x0);
    if (plVar6 != plVar20) {
      if (((ulong)plVar6 & 0x38) == 0) {
        plVar17 = (long *)((long)plVar17 - (long)plVar20);
        plVar24 = (long *)((long)unaff_x21 - (long)plVar20);
        goto code_r0x0007f14c;
      }
      goto code_r0x0007f100;
    }
  }
  else {
    plVar20 = (long *)0x0;
code_r0x0007f100:
    plVar23 = (long *)((ulong)plVar6 & 0xfffffffffffffff8);
    plVar24 = (long *)((long)unaff_x21 - (long)plVar23);
    plVar17 = (long *)((long)plVar17 - (long)plVar23);
    puVar26 = (undefined8 *)((long)unaff_x21 + (-8 - (long)plVar20));
    lVar21 = (long)plVar20 - (long)plVar23;
    puVar25 = (undefined8 *)((long)puVar26 + (lVar10 - (long)plVar27));
    do {
      *puVar25 = *puVar26;
      lVar21 = lVar21 + 8;
      puVar26 = puVar26 + -1;
      puVar25 = puVar25 + -1;
    } while (lVar21 != 0);
    if (plVar6 != plVar23) goto code_r0x0007f14c;
  }
  unaff_x21 = (long *)*unaff_x20;
  plVar9[7] = lVar10;
  plVar9[8] = lVar16;
  plVar9[9] = lVar30;
joined_r0x0007f0b4:
  if (unaff_x21 != (long *)0x0) {
    __ZdlPv(unaff_x21);
  }
code_r0x0007f174:
  plVar9[8] = lVar16;
  if (*(int *)((long)plVar9 + 0x14) == 10) {
    plVar9[5] = 0;
    plVar9[6] = plVar9[6] + 1;
  }
  return *(int *)((long)plVar9 + 0x14);
}

