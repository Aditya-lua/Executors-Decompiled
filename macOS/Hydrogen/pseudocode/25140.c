
void FUN_00025140(undefined1 *param_1)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  uint uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  long lVar14;
  undefined8 *puVar15;
  long *unaff_x19;
  long unaff_x20;
  undefined1 *puVar16;
  long lVar17;
  undefined1 *unaff_x22;
  undefined1 *puVar18;
  undefined1 *unaff_x23;
  undefined1 *puVar19;
  undefined1 *unaff_x24;
  long unaff_x25;
  undefined4 unaff_w26;
  undefined1 *unaff_x27;
  undefined1 uVar20;
  ulong unaff_x28;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  long in_stack_00000000;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  
code_r0x00025140:
  puVar6 = unaff_x24 + 1;
  if ((long)puVar6 < 0) {
    func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
    (*pcVar2)();
  }
  puVar8 = (undefined1 *)(((long)param_1 - (long)unaff_x22) * 2);
  if (puVar8 <= puVar6) {
    puVar8 = puVar6;
  }
  if (unaff_x28 <= (ulong)((long)param_1 - (long)unaff_x22)) {
    puVar8 = unaff_x27;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar3 = 0;
    puVar16 = unaff_x24 + 1;
    *unaff_x24 = (char)unaff_w26;
    puVar8 = (undefined1 *)0x0;
    puVar19 = (undefined1 *)0x0;
    puVar6 = unaff_x24;
    if (unaff_x23 == unaff_x22) goto LAB_00025214;
code_r0x00025184:
    if ((unaff_x24 < &MACH_HEADER.cpusubtype) || ((ulong)((long)unaff_x22 - lVar3) < 0x40)) {
code_r0x000251ac:
      do {
        puVar6 = puVar6 + -1;
        unaff_x23 = unaff_x23 + -1;
        *puVar6 = *unaff_x23;
      } while (unaff_x23 != unaff_x22);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x24) {
      puVar10 = (undefined1 *)((ulong)unaff_x24 & 0xffffffffffffffc0);
      puVar11 = (undefined8 *)(unaff_x23 + -0x20);
      puVar15 = (undefined8 *)(unaff_x24 + lVar3 + -0x20);
      puVar8 = puVar10;
      do {
        uVar23 = *puVar11;
        uVar22 = puVar11[3];
        uVar21 = puVar11[2];
        uVar27 = puVar11[-3];
        uVar26 = puVar11[-4];
        uVar25 = puVar11[-1];
        uVar24 = puVar11[-2];
        puVar15[1] = puVar11[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar11 = puVar11 + -8;
        puVar15 = puVar15 + -8;
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (unaff_x24 != puVar10) {
        if (((ulong)unaff_x24 & 0x38) == 0) {
          puVar6 = puVar6 + -(long)puVar10;
          unaff_x23 = unaff_x23 + -(long)puVar10;
          goto code_r0x000251ac;
        }
        goto code_r0x00025bd4;
      }
    }
    else {
      puVar10 = (undefined1 *)0x0;
code_r0x00025bd4:
      puVar8 = (undefined1 *)((ulong)unaff_x24 & 0xfffffffffffffff8);
      puVar6 = puVar6 + -(long)puVar8;
      puVar15 = (undefined8 *)(unaff_x23 + -(long)puVar10);
      puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)unaff_x22));
      lVar14 = (long)puVar10 - (long)puVar8;
      do {
        puVar15 = puVar15 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar15;
        lVar14 = lVar14 + 8;
      } while (lVar14 != 0);
      unaff_x23 = unaff_x23 + -(long)puVar8;
      if (unaff_x24 != puVar8) goto code_r0x000251ac;
    }
    unaff_x23 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar3;
    unaff_x19[1] = (long)puVar16;
    unaff_x19[2] = (long)puVar19;
    if (unaff_x23 == (undefined1 *)0x0) {
      unaff_x19[1] = (long)puVar16;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar16) goto code_r0x00025234;
      goto code_r0x000251dc;
    }
  }
  else {
    lVar3 = __Znwm(puVar8);
    puVar6 = unaff_x24 + lVar3;
    puVar8 = puVar8 + lVar3;
    puVar16 = puVar6 + 1;
    *puVar6 = (char)unaff_w26;
    puVar19 = puVar8;
    if (unaff_x23 != unaff_x22) goto code_r0x00025184;
LAB_00025214:
    *unaff_x19 = (long)puVar6;
    unaff_x19[1] = (long)puVar16;
    unaff_x19[2] = (long)puVar8;
  }
  __ZdlPv(unaff_x23);
  unaff_x19[1] = (long)puVar16;
  puVar6 = (undefined1 *)unaff_x19[2];
  if (puVar6 <= puVar16) goto code_r0x00025234;
code_r0x000251dc:
  puVar6 = puVar16 + 1;
  *puVar16 = 0;
  unaff_x19[1] = (long)puVar6;
  puVar8 = (undefined1 *)unaff_x19[2];
  if (puVar8 <= puVar6) goto code_r0x00025330;
code_r0x000252d8:
  puVar8 = puVar6 + 1;
  *puVar6 = 0;
  unaff_x19[1] = (long)puVar8;
  puVar6 = (undefined1 *)unaff_x19[2];
  if (puVar6 <= puVar8) goto code_r0x0002541c;
code_r0x000253d4:
  puVar6 = puVar8 + 1;
  *puVar8 = 0;
code_r0x000254e0:
  unaff_x19[1] = (long)puVar6;
  uVar20 = (undefined1)*(undefined4 *)(in_stack_00000000 + unaff_x25 * 0x10 + 8);
  if (puVar6 < (undefined1 *)unaff_x19[2]) {
    *puVar6 = uVar20;
    unaff_x19[1] = (long)(puVar6 + 1);
    goto code_r0x00024734;
  }
  puVar19 = (undefined1 *)*unaff_x19;
  puVar16 = puVar6 + -(long)puVar19;
  puVar8 = puVar16 + 1;
  if (-1 < (long)puVar8) {
    uVar5 = unaff_x19[2] - (long)puVar19;
    puVar10 = (undefined1 *)(uVar5 * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (unaff_x28 <= uVar5) {
      puVar10 = unaff_x27;
    }
    if (puVar10 == (undefined1 *)0x0) {
      lVar3 = 0;
      puVar18 = puVar16 + 1;
      *puVar16 = uVar20;
      puVar10 = (undefined1 *)0x0;
      puVar9 = (undefined1 *)0x0;
      puVar8 = puVar16;
      if (puVar6 == puVar19) goto code_r0x000255c0;
code_r0x00025558:
      if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x00025580:
        do {
          puVar8 = puVar8 + -1;
          puVar6 = puVar6 + -1;
          *puVar8 = *puVar6;
        } while (puVar6 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
        puVar13 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar16 + lVar3 + -0x20);
        puVar10 = puVar13;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar10 = puVar10 + -0x40;
        } while (puVar10 != (undefined1 *)0x0);
        if (puVar16 != puVar13) {
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar13;
            puVar6 = puVar6 + -(long)puVar13;
            goto code_r0x00025580;
          }
          goto code_r0x00025de4;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x00025de4:
        puVar10 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar8 = puVar8 + -(long)puVar10;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
        puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
        lVar14 = (long)puVar13 - (long)puVar10;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar6 = puVar6 + -(long)puVar10;
        if (puVar16 != puVar10) goto code_r0x00025580;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar3;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar9;
      if (puVar6 != (undefined1 *)0x0) goto code_r0x000255c8;
    }
    else {
      lVar3 = __Znwm(puVar10);
      puVar8 = puVar16 + lVar3;
      puVar10 = puVar10 + lVar3;
      puVar18 = puVar8 + 1;
      *puVar8 = uVar20;
      puVar9 = puVar10;
      if (puVar6 != puVar19) goto code_r0x00025558;
code_r0x000255c0:
      *unaff_x19 = (long)puVar8;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar10;
code_r0x000255c8:
      __ZdlPv(puVar6);
    }
    unaff_x19[1] = (long)puVar18;
code_r0x00024734:
    unaff_x25 = unaff_x25 + 1;
    if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
      if (0 < *(int *)(unaff_x20 + 0x8c)) {
        lVar3 = 0;
        do {
          func_0x000245c0(&uStack0000000000000008,
                          *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar3 * 8));
          func_0x00026614();
          if (uStack0000000000000008 != 0) {
            in_stack_00000010 = uStack0000000000000008;
            __ZdlPv();
          }
          lVar3 = lVar3 + 1;
        } while (lVar3 < *(int *)(unaff_x20 + 0x8c));
      }
      func_0x000262e0();
      return;
    }
    in_stack_00000000 = *(long *)(unaff_x20 + 8);
    plVar1 = (long *)(in_stack_00000000 + unaff_x25 * 0x10);
    switch(*(undefined4 *)((long)plVar1 + 0xc)) {
    case 0:
      puVar6 = (undefined1 *)unaff_x19[1];
      if ((undefined1 *)unaff_x19[2] <= puVar6) {
        puVar19 = (undefined1 *)*unaff_x19;
        puVar16 = puVar6 + -(long)puVar19;
        puVar8 = puVar16 + 1;
        if (-1 < (long)puVar8) {
          uVar5 = unaff_x19[2] - (long)puVar19;
          puVar10 = (undefined1 *)(uVar5 * 2);
          if (puVar10 <= puVar8) {
            puVar10 = puVar8;
          }
          if (unaff_x28 <= uVar5) {
            puVar10 = unaff_x27;
          }
          if (puVar10 == (undefined1 *)0x0) {
            puVar9 = (undefined1 *)0x0;
            *puVar16 = 0;
            puVar8 = puVar16;
          }
          else {
            puVar9 = (undefined1 *)__Znwm(puVar10);
            puVar8 = puVar9 + (long)puVar16;
            *puVar8 = 0;
          }
          puVar18 = puVar8 + 1;
          if (puVar6 != puVar19) {
            puVar13 = puVar6;
            if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar16) &&
               (0x3f < (ulong)((long)puVar19 - (long)puVar9))) {
              if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
                puVar7 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
                puVar11 = (undefined8 *)(puVar6 + -0x20);
                puVar15 = (undefined8 *)(puVar9 + (long)puVar16 + -0x20);
                puVar13 = puVar7;
                do {
                  uVar23 = *puVar11;
                  uVar22 = puVar11[3];
                  uVar21 = puVar11[2];
                  uVar27 = puVar11[-3];
                  uVar26 = puVar11[-4];
                  uVar25 = puVar11[-1];
                  uVar24 = puVar11[-2];
                  puVar15[1] = puVar11[1];
                  *puVar15 = uVar23;
                  puVar15[3] = uVar22;
                  puVar15[2] = uVar21;
                  puVar15[-3] = uVar27;
                  puVar15[-4] = uVar26;
                  puVar15[-1] = uVar25;
                  puVar15[-2] = uVar24;
                  puVar11 = puVar11 + -8;
                  puVar15 = puVar15 + -8;
                  puVar13 = puVar13 + -0x40;
                } while (puVar13 != (undefined1 *)0x0);
                if (puVar16 == puVar7) break;
                if (((ulong)puVar16 & 0x38) == 0) {
                  puVar8 = puVar8 + -(long)puVar7;
                  puVar13 = puVar6 + -(long)puVar7;
                  goto code_r0x00025ed8;
                }
              }
              else {
                puVar7 = (undefined1 *)0x0;
              }
              puVar12 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
              puVar13 = puVar6 + -(long)puVar12;
              puVar8 = puVar8 + -(long)puVar12;
              puVar15 = (undefined8 *)(puVar6 + -(long)puVar7);
              puVar11 = (undefined8 *)(puVar9 + ((long)puVar15 - (long)puVar19));
              lVar3 = (long)puVar7 - (long)puVar12;
              do {
                puVar15 = puVar15 + -1;
                puVar11 = puVar11 + -1;
                *puVar11 = *puVar15;
                lVar3 = lVar3 + 8;
              } while (lVar3 != 0);
              if (puVar16 == puVar12) break;
            }
code_r0x00025ed8:
            do {
              puVar8 = puVar8 + -1;
              puVar13 = puVar13 + -1;
              *puVar8 = *puVar13;
            } while (puVar13 != puVar19);
            break;
          }
code_r0x00025618:
          *unaff_x19 = (long)puVar8;
          unaff_x19[1] = (long)puVar18;
          unaff_x19[2] = (long)(puVar9 + (long)puVar10);
          goto joined_r0x00025fdc;
        }
        func_0x00017f90();
        goto code_r0x00026138;
      }
      *puVar6 = 0;
      unaff_x19[1] = (long)(puVar6 + 1);
      goto code_r0x00024734;
    case 1:
      puVar6 = (undefined1 *)unaff_x19[1];
      uVar20 = (undefined1)*plVar1;
      if (puVar6 < (undefined1 *)unaff_x19[2]) {
        *puVar6 = uVar20;
        unaff_x27 = (undefined1 *)0x7fffffffffffffff;
        unaff_x19[1] = (long)(puVar6 + 1);
        goto code_r0x00024734;
      }
      puVar19 = (undefined1 *)*unaff_x19;
      puVar16 = puVar6 + -(long)puVar19;
      puVar8 = puVar16 + 1;
      if ((long)puVar8 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar19;
      puVar10 = (undefined1 *)(uVar5 * 2);
      if (puVar10 <= puVar8) {
        puVar10 = puVar8;
      }
      if (unaff_x28 <= uVar5) {
        puVar10 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar10 == (undefined1 *)0x0) {
        puVar9 = (undefined1 *)0x0;
        *puVar16 = uVar20;
        puVar8 = puVar16;
      }
      else {
        puVar9 = (undefined1 *)__Znwm(puVar10);
        puVar8 = puVar9 + (long)puVar16;
        *puVar8 = uVar20;
      }
      puVar18 = puVar8 + 1;
      if (puVar6 == puVar19) {
        unaff_x27 = (undefined1 *)0x7fffffffffffffff;
        *unaff_x19 = (long)puVar8;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)(puVar9 + (long)puVar10);
        goto joined_r0x00025fdc;
      }
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      puVar13 = puVar6;
      if ((&MACH_HEADER.cpusubtype <= puVar16) && (0x3f < (ulong)((long)puVar19 - (long)puVar9))) {
        if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
          puVar7 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
          puVar11 = (undefined8 *)(puVar6 + -0x20);
          puVar15 = (undefined8 *)(puVar9 + (long)puVar16 + -0x20);
          puVar13 = puVar7;
          do {
            uVar23 = *puVar11;
            uVar22 = puVar11[3];
            uVar21 = puVar11[2];
            uVar27 = puVar11[-3];
            uVar26 = puVar11[-4];
            uVar25 = puVar11[-1];
            uVar24 = puVar11[-2];
            puVar15[1] = puVar11[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar11 = puVar11 + -8;
            puVar15 = puVar15 + -8;
            puVar13 = puVar13 + -0x40;
          } while (puVar13 != (undefined1 *)0x0);
          if (puVar16 == puVar7) break;
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar7;
            puVar13 = puVar6 + -(long)puVar7;
            goto code_r0x00025eb8;
          }
        }
        else {
          puVar7 = (undefined1 *)0x0;
        }
        puVar12 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar13 = puVar6 + -(long)puVar12;
        puVar8 = puVar8 + -(long)puVar12;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar7);
        puVar11 = (undefined8 *)(puVar9 + ((long)puVar15 - (long)puVar19));
        lVar3 = (long)puVar7 - (long)puVar12;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar3 = lVar3 + 8;
        } while (lVar3 != 0);
        if (puVar16 == puVar12) break;
      }
code_r0x00025eb8:
      do {
        puVar8 = puVar8 + -1;
        puVar13 = puVar13 + -1;
        *puVar8 = *puVar13;
      } while (puVar13 != puVar19);
      break;
    default:
      goto code_r0x00024734;
    case 3:
      func_0x000262e0();
      goto code_r0x00024734;
    case 4:
      goto code_r0x00024870;
    case 5:
      func_0x000262e0();
      goto code_r0x00024734;
    case 6:
      lVar14 = *plVar1;
      lVar17 = *(long *)(lVar14 + 0x20);
      lVar3 = __dyld_get_image_header(0);
      if ((lVar17 != lVar3 + 0x4e8dec0) &&
         (uVar4 = (uint)*(byte *)(lVar14 + 6), *(byte *)(lVar14 + 6) != 0x1f)) {
        lVar17 = 0;
        lVar3 = 0;
        do {
          if ((*(uint *)(*(long *)(lVar14 + 0x20) + lVar17 + 0x1c) & 0xf) == 5) {
            func_0x000262e0();
            uVar4 = (uint)*(byte *)(lVar14 + 6);
          }
          lVar3 = lVar3 + 1;
          lVar17 = lVar17 + 0x20;
        } while (lVar3 < 1 << (ulong)(uVar4 & 0x1f));
      }
      goto code_r0x00024734;
    case 7:
      if (*(char *)(*plVar1 + 3) == '\0') {
        func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*plVar1 + 0x18));
        func_0x00026614();
        if (uStack0000000000000008 != 0) {
          in_stack_00000010 = uStack0000000000000008;
          __ZdlPv();
        }
        goto code_r0x00024734;
      }
      puVar6 = (undefined1 *)unaff_x19[1];
      if (puVar6 < (undefined1 *)unaff_x19[2]) {
        *puVar6 = 0x43;
        unaff_x19[1] = (long)(puVar6 + 1);
        goto code_r0x00024734;
      }
      puVar19 = (undefined1 *)*unaff_x19;
      puVar16 = puVar6 + -(long)puVar19;
      puVar8 = puVar16 + 1;
      if ((long)puVar8 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar19;
      puVar10 = (undefined1 *)(uVar5 * 2);
      if (puVar10 <= puVar8) {
        puVar10 = puVar8;
      }
      if (unaff_x28 <= uVar5) {
        puVar10 = unaff_x27;
      }
      if (puVar10 == (undefined1 *)0x0) {
        puVar9 = (undefined1 *)0x0;
        *puVar16 = 0x43;
        puVar8 = puVar16;
      }
      else {
        puVar9 = (undefined1 *)__Znwm(puVar10);
        puVar8 = puVar9 + (long)puVar16;
        *puVar8 = 0x43;
      }
      puVar18 = puVar8 + 1;
      if (puVar6 == puVar19) goto code_r0x00025618;
      puVar13 = puVar6;
      if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar16) &&
         (0x3f < (ulong)((long)puVar19 - (long)puVar9))) {
        if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
          puVar7 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
          puVar11 = (undefined8 *)(puVar6 + -0x20);
          puVar15 = (undefined8 *)(puVar9 + (long)puVar16 + -0x20);
          puVar13 = puVar7;
          do {
            uVar23 = *puVar11;
            uVar22 = puVar11[3];
            uVar21 = puVar11[2];
            uVar27 = puVar11[-3];
            uVar26 = puVar11[-4];
            uVar25 = puVar11[-1];
            uVar24 = puVar11[-2];
            puVar15[1] = puVar11[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar11 = puVar11 + -8;
            puVar15 = puVar15 + -8;
            puVar13 = puVar13 + -0x40;
          } while (puVar13 != (undefined1 *)0x0);
          if (puVar16 == puVar7) break;
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar7;
            puVar13 = puVar6 + -(long)puVar7;
            goto code_r0x00025fb8;
          }
        }
        else {
          puVar7 = (undefined1 *)0x0;
        }
        puVar12 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar13 = puVar6 + -(long)puVar12;
        puVar8 = puVar8 + -(long)puVar12;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar7);
        puVar11 = (undefined8 *)(puVar9 + ((long)puVar15 - (long)puVar19));
        lVar3 = (long)puVar7 - (long)puVar12;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar3 = lVar3 + 8;
        } while (lVar3 != 0);
        if (puVar16 == puVar12) break;
      }
code_r0x00025fb8:
      do {
        puVar8 = puVar8 + -1;
        puVar13 = puVar13 + -1;
        *puVar8 = *puVar13;
      } while (puVar13 != puVar19);
    }
    puVar6 = (undefined1 *)*unaff_x19;
    *unaff_x19 = (long)puVar9;
    unaff_x19[1] = (long)puVar18;
    unaff_x19[2] = (long)(puVar9 + (long)puVar10);
    puVar8 = puVar9;
joined_r0x00025fdc:
    if (puVar6 != (undefined1 *)0x0) {
      __ZdlPv(puVar8,puVar6);
    }
    unaff_x19[1] = (long)puVar18;
    goto code_r0x00024734;
  }
  func_0x00017f90();
  goto code_r0x00026138;
code_r0x00024870:
  puVar6 = (undefined1 *)unaff_x19[1];
  if (puVar6 < (undefined1 *)unaff_x19[2]) {
    puVar18 = puVar6 + 1;
    *puVar6 = 0;
  }
  else {
    puVar19 = (undefined1 *)*unaff_x19;
    puVar16 = puVar6 + -(long)puVar19;
    puVar8 = puVar16 + 1;
    if ((long)puVar8 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar5 = unaff_x19[2] - (long)puVar19;
    puVar10 = (undefined1 *)(uVar5 * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (0x3ffffffffffffffe < uVar5) {
      puVar10 = unaff_x27;
    }
    if (puVar10 == (undefined1 *)0x0) {
      puVar9 = (undefined1 *)0x0;
      puVar18 = puVar16 + 1;
      *puVar16 = 0;
      puVar8 = puVar16;
      if (puVar6 == puVar19) goto code_r0x00024ae0;
code_r0x000249b4:
      puVar13 = puVar6;
      if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - (long)puVar9) < 0x40)) {
code_r0x00025ef8:
        do {
          puVar8 = puVar8 + -1;
          puVar13 = puVar13 + -1;
          *puVar8 = *puVar13;
        } while (puVar13 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
        puVar7 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar9 + (long)puVar16 + -0x20);
        puVar13 = puVar7;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar13 = puVar13 + -0x40;
        } while (puVar13 != (undefined1 *)0x0);
        if (puVar16 != puVar7) {
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar7;
            puVar13 = puVar6 + -(long)puVar7;
            goto code_r0x00025ef8;
          }
          goto code_r0x00025834;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
code_r0x00025834:
        puVar12 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar13 = puVar6 + -(long)puVar12;
        puVar8 = puVar8 + -(long)puVar12;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar7);
        puVar11 = (undefined8 *)(puVar9 + ((long)puVar15 - (long)puVar19));
        lVar3 = (long)puVar7 - (long)puVar12;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar3 = lVar3 + 8;
        } while (lVar3 != 0);
        if (puVar16 != puVar12) goto code_r0x00025ef8;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = (long)puVar9;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)(puVar9 + (long)puVar10);
    }
    else {
      puVar9 = (undefined1 *)__Znwm(puVar10);
      puVar8 = puVar9 + (long)puVar16;
      puVar18 = puVar8 + 1;
      *puVar8 = 0;
      if (puVar6 != puVar19) goto code_r0x000249b4;
code_r0x00024ae0:
      *unaff_x19 = (long)puVar8;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)(puVar9 + (long)puVar10);
      puVar9 = puVar8;
    }
    unaff_x28 = 0x3fffffffffffffff;
    if (puVar6 != (undefined1 *)0x0) {
      unaff_x28 = 0x3fffffffffffffff;
      __ZdlPv(puVar9,puVar6);
    }
  }
  unaff_x19[1] = (long)puVar18;
  if (puVar18 < (undefined1 *)unaff_x19[2]) {
    puVar9 = puVar18 + 1;
    *puVar18 = 0;
    unaff_x19[1] = (long)puVar9;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar9 < puVar6) goto code_r0x00024bcc;
code_r0x00024c2c:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar16 = puVar9 + -(long)puVar19;
    puVar8 = puVar16 + 1;
    if ((long)puVar8 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar10 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (unaff_x28 <= (ulong)((long)puVar6 - (long)puVar19)) {
      puVar10 = unaff_x27;
    }
    if (puVar10 != (undefined1 *)0x0) {
      lVar3 = __Znwm(puVar10);
      puVar6 = puVar16 + lVar3;
      puVar10 = puVar10 + lVar3;
      puVar18 = puVar6 + 1;
      *puVar6 = 0;
      puVar8 = puVar10;
      if (puVar9 != puVar19) goto code_r0x00024c78;
code_r0x00024dac:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar10;
code_r0x00024db8:
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)puVar18;
      uVar20 = (undefined1)*plVar1;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar18) goto code_r0x00024dd4;
      goto code_r0x00024cd8;
    }
    lVar3 = 0;
    puVar18 = puVar16 + 1;
    *puVar16 = 0;
    puVar10 = (undefined1 *)0x0;
    puVar8 = (undefined1 *)0x0;
    puVar6 = puVar16;
    if (puVar9 == puVar19) goto code_r0x00024dac;
code_r0x00024c78:
    if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x00024ca0:
      do {
        puVar6 = puVar6 + -1;
        puVar9 = puVar9 + -1;
        *puVar6 = *puVar9;
      } while (puVar9 != puVar19);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
      puVar13 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
      puVar11 = (undefined8 *)(puVar9 + -0x20);
      puVar15 = (undefined8 *)(puVar16 + lVar3 + -0x20);
      puVar10 = puVar13;
      do {
        uVar23 = *puVar11;
        uVar22 = puVar11[3];
        uVar21 = puVar11[2];
        uVar27 = puVar11[-3];
        uVar26 = puVar11[-4];
        uVar25 = puVar11[-1];
        uVar24 = puVar11[-2];
        puVar15[1] = puVar11[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar11 = puVar11 + -8;
        puVar15 = puVar15 + -8;
        puVar10 = puVar10 + -0x40;
      } while (puVar10 != (undefined1 *)0x0);
      if (puVar16 != puVar13) {
        if (((ulong)puVar16 & 0x38) == 0) {
          puVar6 = puVar6 + -(long)puVar13;
          puVar9 = puVar9 + -(long)puVar13;
          goto code_r0x00024ca0;
        }
        goto code_r0x00025940;
      }
    }
    else {
      puVar13 = (undefined1 *)0x0;
code_r0x00025940:
      puVar10 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
      puVar6 = puVar6 + -(long)puVar10;
      puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
      puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
      lVar14 = (long)puVar13 - (long)puVar10;
      do {
        puVar15 = puVar15 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar15;
        lVar14 = lVar14 + 8;
      } while (lVar14 != 0);
      puVar9 = puVar9 + -(long)puVar10;
      if (puVar16 != puVar10) goto code_r0x00024ca0;
    }
    puVar9 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar3;
    unaff_x19[1] = (long)puVar18;
    unaff_x19[2] = (long)puVar8;
    if (puVar9 != (undefined1 *)0x0) goto code_r0x00024db8;
    unaff_x19[1] = (long)puVar18;
    uVar20 = (undefined1)*plVar1;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar18 < puVar6) goto code_r0x00024cd8;
code_r0x00024dd4:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar16 = puVar18 + -(long)puVar19;
    puVar8 = puVar16 + 1;
    if ((long)puVar8 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar10 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
      puVar10 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar10 == (undefined1 *)0x0) {
      lVar3 = 0;
      puVar6 = puVar16 + 1;
      *puVar16 = uVar20;
      puVar10 = (undefined1 *)0x0;
      puVar9 = (undefined1 *)0x0;
      puVar8 = puVar16;
      if (puVar18 == puVar19) goto code_r0x00024ed0;
code_r0x00024e24:
      if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x00024e50:
        do {
          puVar8 = puVar8 + -1;
          puVar18 = puVar18 + -1;
          *puVar8 = *puVar18;
        } while (puVar18 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
        puVar13 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar18 + -0x20);
        puVar15 = (undefined8 *)(puVar16 + lVar3 + -0x20);
        puVar10 = puVar13;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar10 = puVar10 + -0x40;
        } while (puVar10 != (undefined1 *)0x0);
        if (puVar16 != puVar13) {
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar13;
            puVar18 = puVar18 + -(long)puVar13;
            goto code_r0x00024e50;
          }
          goto code_r0x000259c4;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x000259c4:
        puVar10 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar8 = puVar8 + -(long)puVar10;
        puVar15 = (undefined8 *)(puVar18 + -(long)puVar13);
        puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
        lVar14 = (long)puVar13 - (long)puVar10;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar18 = puVar18 + -(long)puVar10;
        if (puVar16 != puVar10) goto code_r0x00024e50;
      }
      puVar18 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar3;
      unaff_x19[1] = (long)puVar6;
      unaff_x19[2] = (long)puVar9;
      if (puVar18 == (undefined1 *)0x0) {
        unaff_x19[1] = (long)puVar6;
        puVar8 = (undefined1 *)unaff_x19[2];
        if (puVar8 <= puVar6) goto code_r0x00024cf8;
        goto code_r0x00024e80;
      }
    }
    else {
      lVar3 = __Znwm(puVar10);
      puVar8 = puVar16 + lVar3;
      puVar10 = puVar10 + lVar3;
      puVar6 = puVar8 + 1;
      *puVar8 = uVar20;
      puVar9 = puVar10;
      if (puVar18 != puVar19) goto code_r0x00024e24;
code_r0x00024ed0:
      *unaff_x19 = (long)puVar8;
      unaff_x19[1] = (long)puVar6;
      unaff_x19[2] = (long)puVar10;
    }
    __ZdlPv(puVar18);
    unaff_x19[1] = (long)puVar6;
    puVar8 = (undefined1 *)unaff_x19[2];
    if (puVar6 < puVar8) goto code_r0x00024e80;
code_r0x00024cf8:
    puVar16 = (undefined1 *)*unaff_x19;
    puVar10 = puVar6 + -(long)puVar16;
    puVar19 = puVar10 + 1;
    if ((long)puVar19 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar9 = (undefined1 *)(((long)puVar8 - (long)puVar16) * 2);
    if (puVar9 <= puVar19) {
      puVar9 = puVar19;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar8 - (long)puVar16)) {
      puVar9 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar9 == (undefined1 *)0x0) {
      lVar3 = 0;
      puVar18 = puVar10 + 1;
      *puVar10 = 0;
      puVar9 = (undefined1 *)0x0;
      puVar19 = (undefined1 *)0x0;
      puVar8 = puVar10;
      if (puVar6 == puVar16) goto code_r0x00024f14;
code_r0x00024d44:
      if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar16 - lVar3) < 0x40)) {
code_r0x00024d6c:
        do {
          puVar8 = puVar8 + -1;
          puVar6 = puVar6 + -1;
          *puVar8 = *puVar6;
        } while (puVar6 != puVar16);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
        puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar10 + lVar3 + -0x20);
        puVar9 = puVar13;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar9 = puVar9 + -0x40;
        } while (puVar9 != (undefined1 *)0x0);
        if (puVar10 != puVar13) {
          if (((ulong)puVar10 & 0x38) == 0) {
            puVar8 = puVar8 + -(long)puVar13;
            puVar6 = puVar6 + -(long)puVar13;
            goto code_r0x00024d6c;
          }
          goto code_r0x00025a48;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x00025a48:
        puVar9 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
        puVar8 = puVar8 + -(long)puVar9;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
        puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar16));
        lVar14 = (long)puVar13 - (long)puVar9;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar6 = puVar6 + -(long)puVar9;
        if (puVar10 != puVar9) goto code_r0x00024d6c;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar3;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar19;
      if (puVar6 != (undefined1 *)0x0) goto code_r0x00024f1c;
      goto code_r0x00024e88;
    }
    lVar3 = __Znwm(puVar9);
    puVar8 = puVar10 + lVar3;
    puVar9 = puVar9 + lVar3;
    puVar18 = puVar8 + 1;
    *puVar8 = 0;
    puVar19 = puVar9;
    if (puVar6 != puVar16) goto code_r0x00024d44;
code_r0x00024f14:
    *unaff_x19 = (long)puVar8;
    unaff_x19[1] = (long)puVar18;
    unaff_x19[2] = (long)puVar9;
code_r0x00024f1c:
    __ZdlPv(puVar6);
    unaff_x19[1] = (long)puVar18;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar6 <= puVar18) goto code_r0x00024f34;
code_r0x00024e98:
    puVar9 = puVar18 + 1;
    *puVar18 = 0;
    unaff_x19[1] = (long)puVar9;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar9 < puVar6) goto code_r0x00024fd8;
code_r0x00025034:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar16 = puVar9 + -(long)puVar19;
    puVar8 = puVar16 + 1;
    if ((long)puVar8 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar10 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
      puVar10 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar10 == (undefined1 *)0x0) {
      lVar3 = 0;
      unaff_x23 = puVar16 + 1;
      *puVar16 = 0;
      puVar10 = (undefined1 *)0x0;
      puVar8 = (undefined1 *)0x0;
      puVar6 = puVar16;
      if (puVar9 == puVar19) goto code_r0x00025114;
code_r0x00025080:
      if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x000250a8:
        do {
          puVar6 = puVar6 + -1;
          puVar9 = puVar9 + -1;
          *puVar6 = *puVar9;
        } while (puVar9 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
        puVar18 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar9 + -0x20);
        puVar15 = (undefined8 *)(puVar16 + lVar3 + -0x20);
        puVar10 = puVar18;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar10 = puVar10 + -0x40;
        } while (puVar10 != (undefined1 *)0x0);
        if (puVar16 != puVar18) {
          if (((ulong)puVar16 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar18;
            puVar9 = puVar9 + -(long)puVar18;
            goto code_r0x000250a8;
          }
          goto code_r0x00025b50;
        }
      }
      else {
        puVar18 = (undefined1 *)0x0;
code_r0x00025b50:
        puVar10 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
        puVar6 = puVar6 + -(long)puVar10;
        puVar15 = (undefined8 *)(puVar9 + -(long)puVar18);
        puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
        lVar14 = (long)puVar18 - (long)puVar10;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar9 = puVar9 + -(long)puVar10;
        if (puVar16 != puVar10) goto code_r0x000250a8;
      }
      puVar9 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar3;
      unaff_x19[1] = (long)unaff_x23;
      unaff_x19[2] = (long)puVar8;
      if (puVar9 != (undefined1 *)0x0) goto code_r0x0002511c;
      unaff_x19[1] = (long)unaff_x23;
      unaff_w26 = *(undefined4 *)((long)plVar1 + 4);
      uVar20 = (undefined1)unaff_w26;
      param_1 = (undefined1 *)unaff_x19[2];
      if (param_1 <= unaff_x23) goto code_r0x00025138;
    }
    else {
      lVar3 = __Znwm(puVar10);
      puVar6 = puVar16 + lVar3;
      puVar10 = puVar10 + lVar3;
      unaff_x23 = puVar6 + 1;
      *puVar6 = 0;
      puVar8 = puVar10;
      if (puVar9 != puVar19) goto code_r0x00025080;
code_r0x00025114:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)unaff_x23;
      unaff_x19[2] = (long)puVar10;
code_r0x0002511c:
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)unaff_x23;
      unaff_w26 = *(undefined4 *)((long)plVar1 + 4);
      uVar20 = (undefined1)unaff_w26;
      param_1 = (undefined1 *)unaff_x19[2];
      if (param_1 <= unaff_x23) goto code_r0x00025138;
    }
  }
  else {
    puVar8 = (undefined1 *)*unaff_x19;
    puVar19 = puVar18 + -(long)puVar8;
    puVar6 = puVar19 + 1;
    if ((long)puVar6 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar5 = unaff_x19[2] - (long)puVar8;
    puVar16 = (undefined1 *)(uVar5 * 2);
    if (puVar16 <= puVar6) {
      puVar16 = puVar6;
    }
    if (unaff_x28 <= uVar5) {
      puVar16 = unaff_x27;
    }
    if (puVar16 == (undefined1 *)0x0) {
      lVar3 = 0;
      puVar9 = puVar19 + 1;
      *puVar19 = 0;
      puVar16 = (undefined1 *)0x0;
      puVar10 = (undefined1 *)0x0;
      puVar6 = puVar19;
      if (puVar18 == puVar8) goto code_r0x00024c0c;
code_r0x00024b74:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar8 - lVar3) < 0x40)) {
code_r0x00024b9c:
        do {
          puVar6 = puVar6 + -1;
          puVar18 = puVar18 + -1;
          *puVar6 = *puVar18;
        } while (puVar18 != puVar8);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar13 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar11 = (undefined8 *)(puVar18 + -0x20);
        puVar15 = (undefined8 *)(puVar19 + lVar3 + -0x20);
        puVar16 = puVar13;
        do {
          uVar23 = *puVar11;
          uVar22 = puVar11[3];
          uVar21 = puVar11[2];
          uVar27 = puVar11[-3];
          uVar26 = puVar11[-4];
          uVar25 = puVar11[-1];
          uVar24 = puVar11[-2];
          puVar15[1] = puVar11[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar11 = puVar11 + -8;
          puVar15 = puVar15 + -8;
          puVar16 = puVar16 + -0x40;
        } while (puVar16 != (undefined1 *)0x0);
        if (puVar19 != puVar13) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar13;
            puVar18 = puVar18 + -(long)puVar13;
            goto code_r0x00024b9c;
          }
          goto code_r0x000258bc;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x000258bc:
        puVar16 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar6 = puVar6 + -(long)puVar16;
        puVar15 = (undefined8 *)(puVar18 + -(long)puVar13);
        puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar8));
        lVar14 = (long)puVar13 - (long)puVar16;
        do {
          puVar15 = puVar15 + -1;
          puVar11 = puVar11 + -1;
          *puVar11 = *puVar15;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar18 = puVar18 + -(long)puVar16;
        if (puVar19 != puVar16) goto code_r0x00024b9c;
      }
      puVar18 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar3;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar10;
      if (puVar18 == (undefined1 *)0x0) {
        unaff_x19[1] = (long)puVar9;
        puVar6 = (undefined1 *)unaff_x19[2];
        if (puVar6 <= puVar9) goto code_r0x00024c2c;
        goto code_r0x00024bcc;
      }
    }
    else {
      lVar3 = __Znwm(puVar16);
      puVar6 = puVar19 + lVar3;
      puVar16 = puVar16 + lVar3;
      puVar9 = puVar6 + 1;
      *puVar6 = 0;
      puVar10 = puVar16;
      if (puVar18 != puVar8) goto code_r0x00024b74;
code_r0x00024c0c:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar16;
    }
    __ZdlPv(puVar18);
    unaff_x19[1] = (long)puVar9;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar6 <= puVar9) goto code_r0x00024c2c;
code_r0x00024bcc:
    puVar18 = puVar9 + 1;
    *puVar9 = 0;
    unaff_x19[1] = (long)puVar18;
    uVar20 = (undefined1)*plVar1;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar6 <= puVar18) goto code_r0x00024dd4;
code_r0x00024cd8:
    puVar6 = puVar18 + 1;
    *puVar18 = uVar20;
    unaff_x19[1] = (long)puVar6;
    puVar8 = (undefined1 *)unaff_x19[2];
    if (puVar8 <= puVar6) goto code_r0x00024cf8;
code_r0x00024e80:
    puVar18 = puVar6 + 1;
    *puVar6 = 0;
code_r0x00024e88:
    unaff_x19[1] = (long)puVar18;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar18 < puVar6) goto code_r0x00024e98;
code_r0x00024f34:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar16 = puVar18 + -(long)puVar19;
    puVar8 = puVar16 + 1;
    if ((long)puVar8 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar10 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
    if (puVar10 <= puVar8) {
      puVar10 = puVar8;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
      puVar10 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar10 != (undefined1 *)0x0) {
      lVar3 = __Znwm(puVar10);
      puVar6 = puVar16 + lVar3;
      puVar10 = puVar10 + lVar3;
      puVar9 = puVar6 + 1;
      *puVar6 = 0;
      puVar8 = puVar10;
      if (puVar18 != puVar19) goto code_r0x00024f80;
code_r0x00025014:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar10;
code_r0x0002501c:
      __ZdlPv(puVar18);
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar9 < puVar6) goto code_r0x00024fd8;
      goto code_r0x00025034;
    }
    lVar3 = 0;
    puVar9 = puVar16 + 1;
    *puVar16 = 0;
    puVar10 = (undefined1 *)0x0;
    puVar8 = (undefined1 *)0x0;
    puVar6 = puVar16;
    if (puVar18 == puVar19) goto code_r0x00025014;
code_r0x00024f80:
    if ((puVar16 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x00024fa8:
      do {
        puVar6 = puVar6 + -1;
        puVar18 = puVar18 + -1;
        *puVar6 = *puVar18;
      } while (puVar18 != puVar19);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar16) {
      puVar13 = (undefined1 *)((ulong)puVar16 & 0xffffffffffffffc0);
      puVar11 = (undefined8 *)(puVar18 + -0x20);
      puVar15 = (undefined8 *)(puVar16 + lVar3 + -0x20);
      puVar10 = puVar13;
      do {
        uVar23 = *puVar11;
        uVar22 = puVar11[3];
        uVar21 = puVar11[2];
        uVar27 = puVar11[-3];
        uVar26 = puVar11[-4];
        uVar25 = puVar11[-1];
        uVar24 = puVar11[-2];
        puVar15[1] = puVar11[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar11 = puVar11 + -8;
        puVar15 = puVar15 + -8;
        puVar10 = puVar10 + -0x40;
      } while (puVar10 != (undefined1 *)0x0);
      if (puVar16 != puVar13) {
        if (((ulong)puVar16 & 0x38) == 0) {
          puVar6 = puVar6 + -(long)puVar13;
          puVar18 = puVar18 + -(long)puVar13;
          goto code_r0x00024fa8;
        }
        goto code_r0x00025acc;
      }
    }
    else {
      puVar13 = (undefined1 *)0x0;
code_r0x00025acc:
      puVar10 = (undefined1 *)((ulong)puVar16 & 0xfffffffffffffff8);
      puVar6 = puVar6 + -(long)puVar10;
      puVar15 = (undefined8 *)(puVar18 + -(long)puVar13);
      puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
      lVar14 = (long)puVar13 - (long)puVar10;
      do {
        puVar15 = puVar15 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar15;
        lVar14 = lVar14 + 8;
      } while (lVar14 != 0);
      puVar18 = puVar18 + -(long)puVar10;
      if (puVar16 != puVar10) goto code_r0x00024fa8;
    }
    puVar18 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar3;
    unaff_x19[1] = (long)puVar9;
    unaff_x19[2] = (long)puVar8;
    if (puVar18 != (undefined1 *)0x0) goto code_r0x0002501c;
    unaff_x19[1] = (long)puVar9;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar6 <= puVar9) goto code_r0x00025034;
code_r0x00024fd8:
    unaff_x23 = puVar9 + 1;
    *puVar9 = 0;
    unaff_x19[1] = (long)unaff_x23;
    unaff_w26 = *(undefined4 *)((long)plVar1 + 4);
    uVar20 = (undefined1)unaff_w26;
    param_1 = (undefined1 *)unaff_x19[2];
    if (param_1 <= unaff_x23) {
code_r0x00025138:
      unaff_x28 = 0x3fffffffffffffff;
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      unaff_x22 = (undefined1 *)*unaff_x19;
      unaff_x24 = unaff_x23 + -(long)unaff_x22;
      goto code_r0x00025140;
    }
  }
  unaff_x28 = 0x3fffffffffffffff;
  unaff_x27 = (undefined1 *)0x7fffffffffffffff;
  puVar16 = unaff_x23 + 1;
  *unaff_x23 = uVar20;
  unaff_x19[1] = (long)puVar16;
  puVar6 = (undefined1 *)unaff_x19[2];
  if (puVar16 < puVar6) goto code_r0x000251dc;
code_r0x00025234:
  puVar19 = (undefined1 *)*unaff_x19;
  puVar10 = puVar16 + -(long)puVar19;
  puVar8 = puVar10 + 1;
  if ((long)puVar8 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar9 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
  if (puVar9 <= puVar8) {
    puVar9 = puVar8;
  }
  if (unaff_x28 <= (ulong)((long)puVar6 - (long)puVar19)) {
    puVar9 = unaff_x27;
  }
  if (puVar9 == (undefined1 *)0x0) {
    lVar3 = 0;
    puVar6 = puVar10 + 1;
    *puVar10 = 0;
    puVar9 = (undefined1 *)0x0;
    puVar18 = (undefined1 *)0x0;
    puVar8 = puVar10;
    if (puVar16 == puVar19) goto code_r0x00025310;
code_r0x00025280:
    if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar3) < 0x40)) {
code_r0x000252a8:
      do {
        puVar8 = puVar8 + -1;
        puVar16 = puVar16 + -1;
        *puVar8 = *puVar16;
      } while (puVar16 != puVar19);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
      puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
      puVar11 = (undefined8 *)(puVar16 + -0x20);
      puVar15 = (undefined8 *)(puVar10 + lVar3 + -0x20);
      puVar9 = puVar13;
      do {
        uVar23 = *puVar11;
        uVar22 = puVar11[3];
        uVar21 = puVar11[2];
        uVar27 = puVar11[-3];
        uVar26 = puVar11[-4];
        uVar25 = puVar11[-1];
        uVar24 = puVar11[-2];
        puVar15[1] = puVar11[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar11 = puVar11 + -8;
        puVar15 = puVar15 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar10 != puVar13) {
        if (((ulong)puVar10 & 0x38) == 0) {
          puVar8 = puVar8 + -(long)puVar13;
          puVar16 = puVar16 + -(long)puVar13;
          goto code_r0x000252a8;
        }
        goto code_r0x00025c58;
      }
    }
    else {
      puVar13 = (undefined1 *)0x0;
code_r0x00025c58:
      puVar9 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
      puVar8 = puVar8 + -(long)puVar9;
      puVar15 = (undefined8 *)(puVar16 + -(long)puVar13);
      puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar19));
      lVar14 = (long)puVar13 - (long)puVar9;
      do {
        puVar15 = puVar15 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar15;
        lVar14 = lVar14 + 8;
      } while (lVar14 != 0);
      puVar16 = puVar16 + -(long)puVar9;
      if (puVar10 != puVar9) goto code_r0x000252a8;
    }
    puVar16 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar3;
    unaff_x19[1] = (long)puVar6;
    unaff_x19[2] = (long)puVar18;
    if (puVar16 != (undefined1 *)0x0) goto code_r0x00025318;
    unaff_x19[1] = (long)puVar6;
    puVar8 = (undefined1 *)unaff_x19[2];
    if (puVar6 < puVar8) goto code_r0x000252d8;
  }
  else {
    lVar3 = __Znwm(puVar9);
    puVar8 = puVar10 + lVar3;
    puVar9 = puVar9 + lVar3;
    puVar6 = puVar8 + 1;
    *puVar8 = 0;
    puVar18 = puVar9;
    if (puVar16 != puVar19) goto code_r0x00025280;
code_r0x00025310:
    *unaff_x19 = (long)puVar8;
    unaff_x19[1] = (long)puVar6;
    unaff_x19[2] = (long)puVar9;
code_r0x00025318:
    __ZdlPv(puVar16);
    unaff_x19[1] = (long)puVar6;
    puVar8 = (undefined1 *)unaff_x19[2];
    if (puVar6 < puVar8) goto code_r0x000252d8;
  }
code_r0x00025330:
  puVar16 = (undefined1 *)*unaff_x19;
  puVar10 = puVar6 + -(long)puVar16;
  puVar19 = puVar10 + 1;
  if ((long)puVar19 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar9 = (undefined1 *)(((long)puVar8 - (long)puVar16) * 2);
  if (puVar9 <= puVar19) {
    puVar9 = puVar19;
  }
  if (unaff_x28 <= (ulong)((long)puVar8 - (long)puVar16)) {
    puVar9 = unaff_x27;
  }
  if (puVar9 == (undefined1 *)0x0) {
    lVar3 = 0;
    puVar8 = puVar10 + 1;
    *puVar10 = 0;
    puVar9 = (undefined1 *)0x0;
    puVar18 = (undefined1 *)0x0;
    puVar19 = puVar10;
    if (puVar6 == puVar16) goto code_r0x000253fc;
code_r0x0002537c:
    if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar16 - lVar3) < 0x40)) {
code_r0x000253a4:
      do {
        puVar19 = puVar19 + -1;
        puVar6 = puVar6 + -1;
        *puVar19 = *puVar6;
      } while (puVar6 != puVar16);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
      puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
      puVar11 = (undefined8 *)(puVar6 + -0x20);
      puVar15 = (undefined8 *)(puVar10 + lVar3 + -0x20);
      puVar9 = puVar13;
      do {
        uVar23 = *puVar11;
        uVar22 = puVar11[3];
        uVar21 = puVar11[2];
        uVar27 = puVar11[-3];
        uVar26 = puVar11[-4];
        uVar25 = puVar11[-1];
        uVar24 = puVar11[-2];
        puVar15[1] = puVar11[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar11 = puVar11 + -8;
        puVar15 = puVar15 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar10 != puVar13) {
        if (((ulong)puVar10 & 0x38) == 0) {
          puVar19 = puVar19 + -(long)puVar13;
          puVar6 = puVar6 + -(long)puVar13;
          goto code_r0x000253a4;
        }
        goto code_r0x00025cdc;
      }
    }
    else {
      puVar13 = (undefined1 *)0x0;
code_r0x00025cdc:
      puVar9 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
      puVar19 = puVar19 + -(long)puVar9;
      puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
      puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar16));
      lVar14 = (long)puVar13 - (long)puVar9;
      do {
        puVar15 = puVar15 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar15;
        lVar14 = lVar14 + 8;
      } while (lVar14 != 0);
      puVar6 = puVar6 + -(long)puVar9;
      if (puVar10 != puVar9) goto code_r0x000253a4;
    }
    puVar6 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar3;
    unaff_x19[1] = (long)puVar8;
    unaff_x19[2] = (long)puVar18;
    if (puVar6 != (undefined1 *)0x0) goto code_r0x00025404;
    unaff_x19[1] = (long)puVar8;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar8 < puVar6) goto code_r0x000253d4;
  }
  else {
    lVar3 = __Znwm(puVar9);
    puVar19 = puVar10 + lVar3;
    puVar9 = puVar9 + lVar3;
    puVar8 = puVar19 + 1;
    *puVar19 = 0;
    puVar18 = puVar9;
    if (puVar6 != puVar16) goto code_r0x0002537c;
code_r0x000253fc:
    *unaff_x19 = (long)puVar19;
    unaff_x19[1] = (long)puVar8;
    unaff_x19[2] = (long)puVar9;
code_r0x00025404:
    __ZdlPv(puVar6);
    unaff_x19[1] = (long)puVar8;
    puVar6 = (undefined1 *)unaff_x19[2];
    if (puVar8 < puVar6) goto code_r0x000253d4;
  }
code_r0x0002541c:
  puVar16 = (undefined1 *)*unaff_x19;
  puVar10 = puVar8 + -(long)puVar16;
  puVar19 = puVar10 + 1;
  if ((long)puVar19 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar9 = (undefined1 *)(((long)puVar6 - (long)puVar16) * 2);
  if (puVar9 <= puVar19) {
    puVar9 = puVar19;
  }
  if (unaff_x28 <= (ulong)((long)puVar6 - (long)puVar16)) {
    puVar9 = unaff_x27;
  }
  if (puVar9 == (undefined1 *)0x0) {
    lVar3 = 0;
    *puVar10 = 0;
    puVar9 = (undefined1 *)0x0;
    puVar19 = puVar10;
  }
  else {
    lVar3 = __Znwm(puVar9);
    puVar19 = puVar10 + lVar3;
    puVar9 = puVar9 + lVar3;
    *puVar19 = 0;
  }
  puVar6 = puVar19 + 1;
  if (puVar8 == puVar16) {
    *unaff_x19 = (long)puVar19;
    unaff_x19[1] = (long)puVar6;
    unaff_x19[2] = (long)puVar9;
    goto code_r0x000254d8;
  }
  if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar16 - lVar3) < 0x40)) {
code_r0x00025490:
    do {
      puVar19 = puVar19 + -1;
      puVar8 = puVar8 + -1;
      *puVar19 = *puVar8;
    } while (puVar8 != puVar16);
  }
  else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
    puVar13 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
    puVar11 = (undefined8 *)(puVar8 + -0x20);
    puVar15 = (undefined8 *)(puVar10 + lVar3 + -0x20);
    puVar18 = puVar13;
    do {
      uVar23 = *puVar11;
      uVar22 = puVar11[3];
      uVar21 = puVar11[2];
      uVar27 = puVar11[-3];
      uVar26 = puVar11[-4];
      uVar25 = puVar11[-1];
      uVar24 = puVar11[-2];
      puVar15[1] = puVar11[1];
      *puVar15 = uVar23;
      puVar15[3] = uVar22;
      puVar15[2] = uVar21;
      puVar15[-3] = uVar27;
      puVar15[-4] = uVar26;
      puVar15[-1] = uVar25;
      puVar15[-2] = uVar24;
      puVar11 = puVar11 + -8;
      puVar15 = puVar15 + -8;
      puVar18 = puVar18 + -0x40;
    } while (puVar18 != (undefined1 *)0x0);
    if (puVar10 != puVar13) {
      if (((ulong)puVar10 & 0x38) == 0) {
        puVar19 = puVar19 + -(long)puVar13;
        puVar8 = puVar8 + -(long)puVar13;
        goto code_r0x00025490;
      }
      goto code_r0x00025d60;
    }
  }
  else {
    puVar13 = (undefined1 *)0x0;
code_r0x00025d60:
    puVar18 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
    puVar19 = puVar19 + -(long)puVar18;
    puVar15 = (undefined8 *)(puVar8 + -(long)puVar13);
    puVar11 = (undefined8 *)((long)puVar15 + (lVar3 - (long)puVar16));
    lVar14 = (long)puVar13 - (long)puVar18;
    do {
      puVar15 = puVar15 + -1;
      puVar11 = puVar11 + -1;
      *puVar11 = *puVar15;
      lVar14 = lVar14 + 8;
    } while (lVar14 != 0);
    puVar8 = puVar8 + -(long)puVar18;
    if (puVar10 != puVar18) goto code_r0x00025490;
  }
  puVar8 = (undefined1 *)*unaff_x19;
  *unaff_x19 = lVar3;
  unaff_x19[1] = (long)puVar6;
  unaff_x19[2] = (long)puVar9;
  if (puVar8 == (undefined1 *)0x0) goto code_r0x000254e0;
code_r0x000254d8:
  __ZdlPv(puVar8);
  goto code_r0x000254e0;
}

