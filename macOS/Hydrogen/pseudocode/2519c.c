
void FUN_0002519c(undefined1 *param_1,long param_2)

{
  long *plVar1;
  code *pcVar2;
  uint uVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  ulong uVar6;
  undefined1 *in_x9;
  undefined1 *puVar7;
  ulong in_x10;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  long lVar13;
  undefined8 *puVar14;
  long *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  long lVar15;
  long lVar16;
  undefined1 *unaff_x22;
  undefined1 *puVar17;
  undefined1 *unaff_x23;
  undefined1 *puVar18;
  undefined1 *unaff_x24;
  undefined1 *puVar19;
  long unaff_x25;
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
  
code_r0x0002519c:
  if (0x3f < in_x10) {
    if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x24) {
      puVar5 = (undefined1 *)((ulong)unaff_x24 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(unaff_x23 + -0x20);
      puVar14 = (undefined8 *)(unaff_x24 + param_2 + -0x20);
      puVar4 = puVar5;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar4 = puVar4 + -0x40;
      } while (puVar4 != (undefined1 *)0x0);
      if (unaff_x24 == puVar5) goto code_r0x000251bc;
      if (((ulong)unaff_x24 & 0x38) == 0) {
        in_x9 = in_x9 + -(long)puVar5;
        unaff_x23 = unaff_x23 + -(long)puVar5;
        goto LAB_000251ac;
      }
    }
    else {
      puVar5 = (undefined1 *)0x0;
    }
    puVar4 = (undefined1 *)((ulong)unaff_x24 & 0xfffffffffffffff8);
    in_x9 = in_x9 + -(long)puVar4;
    puVar14 = (undefined8 *)(unaff_x23 + -(long)puVar5);
    puVar10 = (undefined8 *)((long)puVar14 + (param_2 - (long)unaff_x22));
    lVar15 = (long)puVar5 - (long)puVar4;
    do {
      puVar14 = puVar14 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar14;
      lVar15 = lVar15 + 8;
    } while (lVar15 != 0);
    unaff_x23 = unaff_x23 + -(long)puVar4;
    if (unaff_x24 == puVar4) goto code_r0x000251bc;
  }
LAB_000251ac:
  do {
    in_x9 = in_x9 + -1;
    unaff_x23 = unaff_x23 + -1;
    *in_x9 = *unaff_x23;
  } while (unaff_x23 != unaff_x22);
code_r0x000251bc:
  unaff_x23 = (undefined1 *)*unaff_x19;
  *unaff_x19 = param_2;
  unaff_x19[1] = (long)unaff_x21;
  unaff_x19[2] = (long)param_1;
  if (unaff_x23 != (undefined1 *)0x0) goto LAB_0002521c;
  unaff_x19[1] = (long)unaff_x21;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar4 <= unaff_x21) goto LAB_00025234;
LAB_000251dc:
  puVar4 = unaff_x21 + 1;
  *unaff_x21 = 0;
  unaff_x19[1] = (long)puVar4;
  puVar5 = (undefined1 *)unaff_x19[2];
  if (puVar5 <= puVar4) goto LAB_00025330;
LAB_000252d8:
  puVar5 = puVar4 + 1;
  *puVar4 = 0;
  unaff_x19[1] = (long)puVar5;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar4 <= puVar5) goto LAB_0002541c;
FUN_000253d4:
  puVar4 = puVar5 + 1;
  *puVar5 = 0;
LAB_000254e0:
  unaff_x19[1] = (long)puVar4;
  uVar20 = (undefined1)*(undefined4 *)(in_stack_00000000 + unaff_x25 * 0x10 + 8);
  if (puVar4 < (undefined1 *)unaff_x19[2]) {
    *puVar4 = uVar20;
    unaff_x19[1] = (long)(puVar4 + 1);
    goto LAB_00024734;
  }
  puVar18 = (undefined1 *)*unaff_x19;
  puVar19 = puVar4 + -(long)puVar18;
  puVar5 = puVar19 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  uVar6 = unaff_x19[2] - (long)puVar18;
  puVar9 = (undefined1 *)(uVar6 * 2);
  if (puVar9 <= puVar5) {
    puVar9 = puVar5;
  }
  if (unaff_x28 <= uVar6) {
    puVar9 = unaff_x27;
  }
  if (puVar9 == (undefined1 *)0x0) {
    lVar15 = 0;
    puVar17 = puVar19 + 1;
    *puVar19 = uVar20;
    puVar9 = (undefined1 *)0x0;
    puVar8 = (undefined1 *)0x0;
    puVar5 = puVar19;
    if (puVar4 == puVar18) goto LAB_000255c0;
LAB_00025558:
    if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar15) < 0x40)) {
LAB_00025580:
      do {
        puVar5 = puVar5 + -1;
        puVar4 = puVar4 + -1;
        *puVar5 = *puVar4;
      } while (puVar4 != puVar18);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
      puVar12 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(puVar4 + -0x20);
      puVar14 = (undefined8 *)(puVar19 + lVar15 + -0x20);
      puVar9 = puVar12;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar19 != puVar12) {
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar12;
          puVar4 = puVar4 + -(long)puVar12;
          goto LAB_00025580;
        }
        goto LAB_00025de4;
      }
    }
    else {
      puVar12 = (undefined1 *)0x0;
LAB_00025de4:
      puVar9 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar9;
      puVar14 = (undefined8 *)(puVar4 + -(long)puVar12);
      puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar18));
      lVar13 = (long)puVar12 - (long)puVar9;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar13 = lVar13 + 8;
      } while (lVar13 != 0);
      puVar4 = puVar4 + -(long)puVar9;
      if (puVar19 != puVar9) goto LAB_00025580;
    }
    puVar4 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar15;
    unaff_x19[1] = (long)puVar17;
    unaff_x19[2] = (long)puVar8;
    if (puVar4 != (undefined1 *)0x0) goto LAB_000255c8;
  }
  else {
    lVar15 = __Znwm(puVar9);
    puVar5 = puVar19 + lVar15;
    puVar9 = puVar9 + lVar15;
    puVar17 = puVar5 + 1;
    *puVar5 = uVar20;
    puVar8 = puVar9;
    if (puVar4 != puVar18) goto LAB_00025558;
LAB_000255c0:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar17;
    unaff_x19[2] = (long)puVar9;
LAB_000255c8:
    __ZdlPv(puVar4);
  }
  unaff_x19[1] = (long)puVar17;
LAB_00024734:
  unaff_x25 = unaff_x25 + 1;
  if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
    if (0 < *(int *)(unaff_x20 + 0x8c)) {
      lVar15 = 0;
      do {
        func_0x000245c0(&uStack0000000000000008,
                        *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar15 * 8));
        func_0x00026614();
        if (uStack0000000000000008 != 0) {
          in_stack_00000010 = uStack0000000000000008;
          __ZdlPv();
        }
        lVar15 = lVar15 + 1;
      } while (lVar15 < *(int *)(unaff_x20 + 0x8c));
    }
    func_0x000262e0();
    return;
  }
  in_stack_00000000 = *(long *)(unaff_x20 + 8);
  plVar1 = (long *)(in_stack_00000000 + unaff_x25 * 0x10);
  switch(*(undefined4 *)((long)plVar1 + 0xc)) {
  case 0:
    puVar4 = (undefined1 *)unaff_x19[1];
    if ((undefined1 *)unaff_x19[2] <= puVar4) {
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar4 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if (-1 < (long)puVar5) {
        uVar6 = unaff_x19[2] - (long)puVar18;
        puVar9 = (undefined1 *)(uVar6 * 2);
        if (puVar9 <= puVar5) {
          puVar9 = puVar5;
        }
        if (unaff_x28 <= uVar6) {
          puVar9 = unaff_x27;
        }
        if (puVar9 == (undefined1 *)0x0) {
          puVar8 = (undefined1 *)0x0;
          *puVar19 = 0;
          puVar5 = puVar19;
        }
        else {
          puVar8 = (undefined1 *)__Znwm(puVar9);
          puVar5 = puVar8 + (long)puVar19;
          *puVar5 = 0;
        }
        puVar17 = puVar5 + 1;
        if (puVar4 != puVar18) {
          puVar12 = puVar4;
          if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar19) &&
             (0x3f < (ulong)((long)puVar18 - (long)puVar8))) {
            if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
              puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
              puVar10 = (undefined8 *)(puVar4 + -0x20);
              puVar14 = (undefined8 *)(puVar8 + (long)puVar19 + -0x20);
              puVar12 = puVar7;
              do {
                uVar23 = *puVar10;
                uVar22 = puVar10[3];
                uVar21 = puVar10[2];
                uVar27 = puVar10[-3];
                uVar26 = puVar10[-4];
                uVar25 = puVar10[-1];
                uVar24 = puVar10[-2];
                puVar14[1] = puVar10[1];
                *puVar14 = uVar23;
                puVar14[3] = uVar22;
                puVar14[2] = uVar21;
                puVar14[-3] = uVar27;
                puVar14[-4] = uVar26;
                puVar14[-1] = uVar25;
                puVar14[-2] = uVar24;
                puVar10 = puVar10 + -8;
                puVar14 = puVar14 + -8;
                puVar12 = puVar12 + -0x40;
              } while (puVar12 != (undefined1 *)0x0);
              if (puVar19 == puVar7) break;
              if (((ulong)puVar19 & 0x38) == 0) {
                puVar5 = puVar5 + -(long)puVar7;
                puVar12 = puVar4 + -(long)puVar7;
                goto code_r0x00025ed8;
              }
            }
            else {
              puVar7 = (undefined1 *)0x0;
            }
            puVar11 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
            puVar12 = puVar4 + -(long)puVar11;
            puVar5 = puVar5 + -(long)puVar11;
            puVar14 = (undefined8 *)(puVar4 + -(long)puVar7);
            puVar10 = (undefined8 *)(puVar8 + ((long)puVar14 - (long)puVar18));
            lVar15 = (long)puVar7 - (long)puVar11;
            do {
              puVar14 = puVar14 + -1;
              puVar10 = puVar10 + -1;
              *puVar10 = *puVar14;
              lVar15 = lVar15 + 8;
            } while (lVar15 != 0);
            if (puVar19 == puVar11) break;
          }
code_r0x00025ed8:
          do {
            puVar5 = puVar5 + -1;
            puVar12 = puVar12 + -1;
            *puVar5 = *puVar12;
          } while (puVar12 != puVar18);
          break;
        }
code_r0x00025618:
        *unaff_x19 = (long)puVar5;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)(puVar8 + (long)puVar9);
        goto joined_r0x00025fdc;
      }
      func_0x00017f90();
      goto code_r0x00026138;
    }
    *puVar4 = 0;
    unaff_x19[1] = (long)(puVar4 + 1);
    goto LAB_00024734;
  case 1:
    puVar4 = (undefined1 *)unaff_x19[1];
    uVar20 = (undefined1)*plVar1;
    if (puVar4 < (undefined1 *)unaff_x19[2]) {
      *puVar4 = uVar20;
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      unaff_x19[1] = (long)(puVar4 + 1);
      goto LAB_00024734;
    }
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar4 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar18;
    puVar9 = (undefined1 *)(uVar6 * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (unaff_x28 <= uVar6) {
      puVar9 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar9 == (undefined1 *)0x0) {
      puVar8 = (undefined1 *)0x0;
      *puVar19 = uVar20;
      puVar5 = puVar19;
    }
    else {
      puVar8 = (undefined1 *)__Znwm(puVar9);
      puVar5 = puVar8 + (long)puVar19;
      *puVar5 = uVar20;
    }
    puVar17 = puVar5 + 1;
    if (puVar4 == puVar18) {
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      *unaff_x19 = (long)puVar5;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)(puVar8 + (long)puVar9);
      goto joined_r0x00025fdc;
    }
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    puVar12 = puVar4;
    if ((&MACH_HEADER.cpusubtype <= puVar19) && (0x3f < (ulong)((long)puVar18 - (long)puVar8))) {
      if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar4 + -0x20);
        puVar14 = (undefined8 *)(puVar8 + (long)puVar19 + -0x20);
        puVar12 = puVar7;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar12 = puVar12 + -0x40;
        } while (puVar12 != (undefined1 *)0x0);
        if (puVar19 == puVar7) break;
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar7;
          puVar12 = puVar4 + -(long)puVar7;
          goto code_r0x00025eb8;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
      }
      puVar11 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar12 = puVar4 + -(long)puVar11;
      puVar5 = puVar5 + -(long)puVar11;
      puVar14 = (undefined8 *)(puVar4 + -(long)puVar7);
      puVar10 = (undefined8 *)(puVar8 + ((long)puVar14 - (long)puVar18));
      lVar15 = (long)puVar7 - (long)puVar11;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar15 = lVar15 + 8;
      } while (lVar15 != 0);
      if (puVar19 == puVar11) break;
    }
code_r0x00025eb8:
    do {
      puVar5 = puVar5 + -1;
      puVar12 = puVar12 + -1;
      *puVar5 = *puVar12;
    } while (puVar12 != puVar18);
    break;
  default:
    goto LAB_00024734;
  case 3:
    func_0x000262e0();
    goto LAB_00024734;
  case 4:
    goto code_r0x00024870;
  case 5:
    func_0x000262e0();
    goto LAB_00024734;
  case 6:
    lVar13 = *plVar1;
    lVar16 = *(long *)(lVar13 + 0x20);
    lVar15 = __dyld_get_image_header(0);
    if ((lVar16 != lVar15 + 0x4e8dec0) &&
       (uVar3 = (uint)*(byte *)(lVar13 + 6), *(byte *)(lVar13 + 6) != 0x1f)) {
      lVar16 = 0;
      lVar15 = 0;
      do {
        if ((*(uint *)(*(long *)(lVar13 + 0x20) + lVar16 + 0x1c) & 0xf) == 5) {
          func_0x000262e0();
          uVar3 = (uint)*(byte *)(lVar13 + 6);
        }
        lVar15 = lVar15 + 1;
        lVar16 = lVar16 + 0x20;
      } while (lVar15 < 1 << (ulong)(uVar3 & 0x1f));
    }
    goto LAB_00024734;
  case 7:
    if (*(char *)(*plVar1 + 3) == '\0') {
      func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*plVar1 + 0x18));
      func_0x00026614();
      if (uStack0000000000000008 != 0) {
        in_stack_00000010 = uStack0000000000000008;
        __ZdlPv();
      }
      goto LAB_00024734;
    }
    puVar4 = (undefined1 *)unaff_x19[1];
    if (puVar4 < (undefined1 *)unaff_x19[2]) {
      *puVar4 = 0x43;
      unaff_x19[1] = (long)(puVar4 + 1);
      goto LAB_00024734;
    }
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar4 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar18;
    puVar9 = (undefined1 *)(uVar6 * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (unaff_x28 <= uVar6) {
      puVar9 = unaff_x27;
    }
    if (puVar9 == (undefined1 *)0x0) {
      puVar8 = (undefined1 *)0x0;
      *puVar19 = 0x43;
      puVar5 = puVar19;
    }
    else {
      puVar8 = (undefined1 *)__Znwm(puVar9);
      puVar5 = puVar8 + (long)puVar19;
      *puVar5 = 0x43;
    }
    puVar17 = puVar5 + 1;
    if (puVar4 == puVar18) goto code_r0x00025618;
    puVar12 = puVar4;
    if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar19) &&
       (0x3f < (ulong)((long)puVar18 - (long)puVar8))) {
      if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar4 + -0x20);
        puVar14 = (undefined8 *)(puVar8 + (long)puVar19 + -0x20);
        puVar12 = puVar7;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar12 = puVar12 + -0x40;
        } while (puVar12 != (undefined1 *)0x0);
        if (puVar19 == puVar7) break;
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar7;
          puVar12 = puVar4 + -(long)puVar7;
          goto code_r0x00025fb8;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
      }
      puVar11 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar12 = puVar4 + -(long)puVar11;
      puVar5 = puVar5 + -(long)puVar11;
      puVar14 = (undefined8 *)(puVar4 + -(long)puVar7);
      puVar10 = (undefined8 *)(puVar8 + ((long)puVar14 - (long)puVar18));
      lVar15 = (long)puVar7 - (long)puVar11;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar15 = lVar15 + 8;
      } while (lVar15 != 0);
      if (puVar19 == puVar11) break;
    }
code_r0x00025fb8:
    do {
      puVar5 = puVar5 + -1;
      puVar12 = puVar12 + -1;
      *puVar5 = *puVar12;
    } while (puVar12 != puVar18);
  }
  puVar4 = (undefined1 *)*unaff_x19;
  *unaff_x19 = (long)puVar8;
  unaff_x19[1] = (long)puVar17;
  unaff_x19[2] = (long)(puVar8 + (long)puVar9);
  puVar5 = puVar8;
joined_r0x00025fdc:
  if (puVar4 != (undefined1 *)0x0) {
    __ZdlPv(puVar5,puVar4);
  }
  unaff_x19[1] = (long)puVar17;
  goto LAB_00024734;
code_r0x00024870:
  puVar4 = (undefined1 *)unaff_x19[1];
  if (puVar4 < (undefined1 *)unaff_x19[2]) {
    puVar17 = puVar4 + 1;
    *puVar4 = 0;
  }
  else {
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar4 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar18;
    puVar9 = (undefined1 *)(uVar6 * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (0x3ffffffffffffffe < uVar6) {
      puVar9 = unaff_x27;
    }
    if (puVar9 == (undefined1 *)0x0) {
      puVar8 = (undefined1 *)0x0;
      puVar17 = puVar19 + 1;
      *puVar19 = 0;
      puVar5 = puVar19;
      if (puVar4 == puVar18) goto code_r0x00024ae0;
code_r0x000249b4:
      puVar12 = puVar4;
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - (long)puVar8) < 0x40)) {
code_r0x00025ef8:
        do {
          puVar5 = puVar5 + -1;
          puVar12 = puVar12 + -1;
          *puVar5 = *puVar12;
        } while (puVar12 != puVar18);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar4 + -0x20);
        puVar14 = (undefined8 *)(puVar8 + (long)puVar19 + -0x20);
        puVar12 = puVar7;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar12 = puVar12 + -0x40;
        } while (puVar12 != (undefined1 *)0x0);
        if (puVar19 != puVar7) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar5 = puVar5 + -(long)puVar7;
            puVar12 = puVar4 + -(long)puVar7;
            goto code_r0x00025ef8;
          }
          goto code_r0x00025834;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
code_r0x00025834:
        puVar11 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar12 = puVar4 + -(long)puVar11;
        puVar5 = puVar5 + -(long)puVar11;
        puVar14 = (undefined8 *)(puVar4 + -(long)puVar7);
        puVar10 = (undefined8 *)(puVar8 + ((long)puVar14 - (long)puVar18));
        lVar15 = (long)puVar7 - (long)puVar11;
        do {
          puVar14 = puVar14 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar14;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        if (puVar19 != puVar11) goto code_r0x00025ef8;
      }
      puVar4 = (undefined1 *)*unaff_x19;
      *unaff_x19 = (long)puVar8;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)(puVar8 + (long)puVar9);
    }
    else {
      puVar8 = (undefined1 *)__Znwm(puVar9);
      puVar5 = puVar8 + (long)puVar19;
      puVar17 = puVar5 + 1;
      *puVar5 = 0;
      if (puVar4 != puVar18) goto code_r0x000249b4;
code_r0x00024ae0:
      *unaff_x19 = (long)puVar5;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)(puVar8 + (long)puVar9);
      puVar8 = puVar5;
    }
    unaff_x28 = 0x3fffffffffffffff;
    if (puVar4 != (undefined1 *)0x0) {
      unaff_x28 = 0x3fffffffffffffff;
      __ZdlPv(puVar8,puVar4);
    }
  }
  unaff_x19[1] = (long)puVar17;
  if (puVar17 < (undefined1 *)unaff_x19[2]) {
    puVar8 = puVar17 + 1;
    *puVar17 = 0;
    unaff_x19[1] = (long)puVar8;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar8 < puVar4) goto code_r0x00024bcc;
code_r0x00024c2c:
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar8 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar9 = (undefined1 *)(((long)puVar4 - (long)puVar18) * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (unaff_x28 <= (ulong)((long)puVar4 - (long)puVar18)) {
      puVar9 = unaff_x27;
    }
    if (puVar9 != (undefined1 *)0x0) {
      lVar15 = __Znwm(puVar9);
      puVar4 = puVar19 + lVar15;
      puVar9 = puVar9 + lVar15;
      puVar17 = puVar4 + 1;
      *puVar4 = 0;
      puVar5 = puVar9;
      if (puVar8 != puVar18) goto code_r0x00024c78;
code_r0x00024dac:
      *unaff_x19 = (long)puVar4;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)puVar9;
code_r0x00024db8:
      __ZdlPv(puVar8);
      unaff_x19[1] = (long)puVar17;
      uVar20 = (undefined1)*plVar1;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar17 < puVar4) goto code_r0x00024cd8;
      goto code_r0x00024dd4;
    }
    lVar15 = 0;
    puVar17 = puVar19 + 1;
    *puVar19 = 0;
    puVar9 = (undefined1 *)0x0;
    puVar5 = (undefined1 *)0x0;
    puVar4 = puVar19;
    if (puVar8 == puVar18) goto code_r0x00024dac;
code_r0x00024c78:
    if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar15) < 0x40)) {
code_r0x00024ca0:
      do {
        puVar4 = puVar4 + -1;
        puVar8 = puVar8 + -1;
        *puVar4 = *puVar8;
      } while (puVar8 != puVar18);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
      puVar12 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(puVar8 + -0x20);
      puVar14 = (undefined8 *)(puVar19 + lVar15 + -0x20);
      puVar9 = puVar12;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar19 != puVar12) {
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar4 = puVar4 + -(long)puVar12;
          puVar8 = puVar8 + -(long)puVar12;
          goto code_r0x00024ca0;
        }
        goto code_r0x00025940;
      }
    }
    else {
      puVar12 = (undefined1 *)0x0;
code_r0x00025940:
      puVar9 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar4 = puVar4 + -(long)puVar9;
      puVar14 = (undefined8 *)(puVar8 + -(long)puVar12);
      puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar18));
      lVar13 = (long)puVar12 - (long)puVar9;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar13 = lVar13 + 8;
      } while (lVar13 != 0);
      puVar8 = puVar8 + -(long)puVar9;
      if (puVar19 != puVar9) goto code_r0x00024ca0;
    }
    puVar8 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar15;
    unaff_x19[1] = (long)puVar17;
    unaff_x19[2] = (long)puVar5;
    if (puVar8 != (undefined1 *)0x0) goto code_r0x00024db8;
    unaff_x19[1] = (long)puVar17;
    uVar20 = (undefined1)*plVar1;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= puVar17) goto code_r0x00024dd4;
code_r0x00024cd8:
    puVar8 = puVar17 + 1;
    *puVar17 = uVar20;
    unaff_x19[1] = (long)puVar8;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= puVar8) goto code_r0x00024cf8;
code_r0x00024e80:
    puVar4 = puVar8 + 1;
    *puVar8 = 0;
code_r0x00024e88:
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar4 < puVar5) goto code_r0x00024e98;
code_r0x00024f34:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar9 = puVar4 + -(long)puVar19;
    puVar18 = puVar9 + 1;
    if ((long)puVar18 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar8 = (undefined1 *)(((long)puVar5 - (long)puVar19) * 2);
    if (puVar8 <= puVar18) {
      puVar8 = puVar18;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar19)) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      lVar15 = 0;
      puVar5 = puVar9 + 1;
      *puVar9 = 0;
      puVar8 = (undefined1 *)0x0;
      puVar17 = (undefined1 *)0x0;
      puVar18 = puVar9;
      if (puVar4 == puVar19) goto code_r0x00025014;
code_r0x00024f80:
      if ((puVar9 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar15) < 0x40)) {
code_r0x00024fa8:
        do {
          puVar18 = puVar18 + -1;
          puVar4 = puVar4 + -1;
          *puVar18 = *puVar4;
        } while (puVar4 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar9) {
        puVar12 = (undefined1 *)((ulong)puVar9 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar4 + -0x20);
        puVar14 = (undefined8 *)(puVar9 + lVar15 + -0x20);
        puVar8 = puVar12;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar8 = puVar8 + -0x40;
        } while (puVar8 != (undefined1 *)0x0);
        if (puVar9 != puVar12) {
          if (((ulong)puVar9 & 0x38) == 0) {
            puVar18 = puVar18 + -(long)puVar12;
            puVar4 = puVar4 + -(long)puVar12;
            goto code_r0x00024fa8;
          }
          goto code_r0x00025acc;
        }
      }
      else {
        puVar12 = (undefined1 *)0x0;
code_r0x00025acc:
        puVar8 = (undefined1 *)((ulong)puVar9 & 0xfffffffffffffff8);
        puVar18 = puVar18 + -(long)puVar8;
        puVar14 = (undefined8 *)(puVar4 + -(long)puVar12);
        puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar19));
        lVar13 = (long)puVar12 - (long)puVar8;
        do {
          puVar14 = puVar14 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar14;
          lVar13 = lVar13 + 8;
        } while (lVar13 != 0);
        puVar4 = puVar4 + -(long)puVar8;
        if (puVar9 != puVar8) goto code_r0x00024fa8;
      }
      puVar4 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar15;
      unaff_x19[1] = (long)puVar5;
      unaff_x19[2] = (long)puVar17;
      if (puVar4 != (undefined1 *)0x0) goto code_r0x0002501c;
      unaff_x19[1] = (long)puVar5;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar4 <= puVar5) goto code_r0x00025034;
    }
    else {
      lVar15 = __Znwm(puVar8);
      puVar18 = puVar9 + lVar15;
      puVar8 = puVar8 + lVar15;
      puVar5 = puVar18 + 1;
      *puVar18 = 0;
      puVar17 = puVar8;
      if (puVar4 != puVar19) goto code_r0x00024f80;
code_r0x00025014:
      *unaff_x19 = (long)puVar18;
      unaff_x19[1] = (long)puVar5;
      unaff_x19[2] = (long)puVar8;
code_r0x0002501c:
      __ZdlPv(puVar4);
      unaff_x19[1] = (long)puVar5;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar4 <= puVar5) goto code_r0x00025034;
    }
code_r0x00024fd8:
    unaff_x23 = puVar5 + 1;
    *puVar5 = 0;
    unaff_x19[1] = (long)unaff_x23;
    uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= unaff_x23) goto code_r0x00025138;
code_r0x000250dc:
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x21 = unaff_x23 + 1;
    *unaff_x23 = uVar20;
    unaff_x19[1] = (long)unaff_x21;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (unaff_x21 < puVar4) goto LAB_000251dc;
  }
  else {
    puVar5 = (undefined1 *)*unaff_x19;
    puVar18 = puVar17 + -(long)puVar5;
    puVar4 = puVar18 + 1;
    if ((long)puVar4 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar5;
    puVar19 = (undefined1 *)(uVar6 * 2);
    if (puVar19 <= puVar4) {
      puVar19 = puVar4;
    }
    if (unaff_x28 <= uVar6) {
      puVar19 = unaff_x27;
    }
    if (puVar19 == (undefined1 *)0x0) {
      lVar15 = 0;
      puVar8 = puVar18 + 1;
      *puVar18 = 0;
      puVar19 = (undefined1 *)0x0;
      puVar9 = (undefined1 *)0x0;
      puVar4 = puVar18;
      if (puVar17 == puVar5) goto code_r0x00024c0c;
code_r0x00024b74:
      if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar5 - lVar15) < 0x40)) {
code_r0x00024b9c:
        do {
          puVar4 = puVar4 + -1;
          puVar17 = puVar17 + -1;
          *puVar4 = *puVar17;
        } while (puVar17 != puVar5);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
        puVar12 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar17 + -0x20);
        puVar14 = (undefined8 *)(puVar18 + lVar15 + -0x20);
        puVar19 = puVar12;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar19 = puVar19 + -0x40;
        } while (puVar19 != (undefined1 *)0x0);
        if (puVar18 != puVar12) {
          if (((ulong)puVar18 & 0x38) == 0) {
            puVar4 = puVar4 + -(long)puVar12;
            puVar17 = puVar17 + -(long)puVar12;
            goto code_r0x00024b9c;
          }
          goto code_r0x000258bc;
        }
      }
      else {
        puVar12 = (undefined1 *)0x0;
code_r0x000258bc:
        puVar19 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
        puVar4 = puVar4 + -(long)puVar19;
        puVar14 = (undefined8 *)(puVar17 + -(long)puVar12);
        puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar5));
        lVar13 = (long)puVar12 - (long)puVar19;
        do {
          puVar14 = puVar14 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar14;
          lVar13 = lVar13 + 8;
        } while (lVar13 != 0);
        puVar17 = puVar17 + -(long)puVar19;
        if (puVar18 != puVar19) goto code_r0x00024b9c;
      }
      puVar17 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar15;
      unaff_x19[1] = (long)puVar8;
      unaff_x19[2] = (long)puVar9;
      if (puVar17 == (undefined1 *)0x0) {
        unaff_x19[1] = (long)puVar8;
        puVar4 = (undefined1 *)unaff_x19[2];
        if (puVar4 <= puVar8) goto code_r0x00024c2c;
        goto code_r0x00024bcc;
      }
    }
    else {
      lVar15 = __Znwm(puVar19);
      puVar4 = puVar18 + lVar15;
      puVar19 = puVar19 + lVar15;
      puVar8 = puVar4 + 1;
      *puVar4 = 0;
      puVar9 = puVar19;
      if (puVar17 != puVar5) goto code_r0x00024b74;
code_r0x00024c0c:
      *unaff_x19 = (long)puVar4;
      unaff_x19[1] = (long)puVar8;
      unaff_x19[2] = (long)puVar19;
    }
    __ZdlPv(puVar17);
    unaff_x19[1] = (long)puVar8;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= puVar8) goto code_r0x00024c2c;
code_r0x00024bcc:
    puVar17 = puVar8 + 1;
    *puVar8 = 0;
    unaff_x19[1] = (long)puVar17;
    uVar20 = (undefined1)*plVar1;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar17 < puVar4) goto code_r0x00024cd8;
code_r0x00024dd4:
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar17 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar9 = (undefined1 *)(((long)puVar4 - (long)puVar18) * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar18)) {
      puVar9 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar9 != (undefined1 *)0x0) {
      lVar15 = __Znwm(puVar9);
      puVar4 = puVar19 + lVar15;
      puVar9 = puVar9 + lVar15;
      puVar8 = puVar4 + 1;
      *puVar4 = uVar20;
      puVar5 = puVar9;
      if (puVar17 != puVar18) goto code_r0x00024e24;
code_r0x00024ed0:
      *unaff_x19 = (long)puVar4;
      unaff_x19[1] = (long)puVar8;
      unaff_x19[2] = (long)puVar9;
code_r0x00024edc:
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar8;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar4 <= puVar8) goto code_r0x00024cf8;
      goto code_r0x00024e80;
    }
    lVar15 = 0;
    puVar8 = puVar19 + 1;
    *puVar19 = uVar20;
    puVar9 = (undefined1 *)0x0;
    puVar5 = (undefined1 *)0x0;
    puVar4 = puVar19;
    if (puVar17 == puVar18) goto code_r0x00024ed0;
code_r0x00024e24:
    if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar15) < 0x40)) {
code_r0x00024e50:
      do {
        puVar4 = puVar4 + -1;
        puVar17 = puVar17 + -1;
        *puVar4 = *puVar17;
      } while (puVar17 != puVar18);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
      puVar12 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(puVar17 + -0x20);
      puVar14 = (undefined8 *)(puVar19 + lVar15 + -0x20);
      puVar9 = puVar12;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar19 != puVar12) {
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar4 = puVar4 + -(long)puVar12;
          puVar17 = puVar17 + -(long)puVar12;
          goto code_r0x00024e50;
        }
        goto code_r0x000259c4;
      }
    }
    else {
      puVar12 = (undefined1 *)0x0;
code_r0x000259c4:
      puVar9 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar4 = puVar4 + -(long)puVar9;
      puVar14 = (undefined8 *)(puVar17 + -(long)puVar12);
      puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar18));
      lVar13 = (long)puVar12 - (long)puVar9;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar13 = lVar13 + 8;
      } while (lVar13 != 0);
      puVar17 = puVar17 + -(long)puVar9;
      if (puVar19 != puVar9) goto code_r0x00024e50;
    }
    puVar17 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar15;
    unaff_x19[1] = (long)puVar8;
    unaff_x19[2] = (long)puVar5;
    if (puVar17 != (undefined1 *)0x0) goto code_r0x00024edc;
    unaff_x19[1] = (long)puVar8;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar8 < puVar4) goto code_r0x00024e80;
code_r0x00024cf8:
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar8 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar9 = (undefined1 *)(((long)puVar4 - (long)puVar18) * 2);
    if (puVar9 <= puVar5) {
      puVar9 = puVar5;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar18)) {
      puVar9 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar9 == (undefined1 *)0x0) {
      lVar15 = 0;
      puVar4 = puVar19 + 1;
      *puVar19 = 0;
      puVar9 = (undefined1 *)0x0;
      puVar17 = (undefined1 *)0x0;
      puVar5 = puVar19;
      if (puVar8 == puVar18) goto code_r0x00024f14;
code_r0x00024d44:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar15) < 0x40)) {
code_r0x00024d6c:
        do {
          puVar5 = puVar5 + -1;
          puVar8 = puVar8 + -1;
          *puVar5 = *puVar8;
        } while (puVar8 != puVar18);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar12 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar8 + -0x20);
        puVar14 = (undefined8 *)(puVar19 + lVar15 + -0x20);
        puVar9 = puVar12;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar9 = puVar9 + -0x40;
        } while (puVar9 != (undefined1 *)0x0);
        if (puVar19 != puVar12) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar5 = puVar5 + -(long)puVar12;
            puVar8 = puVar8 + -(long)puVar12;
            goto code_r0x00024d6c;
          }
          goto code_r0x00025a48;
        }
      }
      else {
        puVar12 = (undefined1 *)0x0;
code_r0x00025a48:
        puVar9 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar5 = puVar5 + -(long)puVar9;
        puVar14 = (undefined8 *)(puVar8 + -(long)puVar12);
        puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar18));
        lVar13 = (long)puVar12 - (long)puVar9;
        do {
          puVar14 = puVar14 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar14;
          lVar13 = lVar13 + 8;
        } while (lVar13 != 0);
        puVar8 = puVar8 + -(long)puVar9;
        if (puVar19 != puVar9) goto code_r0x00024d6c;
      }
      puVar8 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar15;
      unaff_x19[1] = (long)puVar4;
      unaff_x19[2] = (long)puVar17;
      if (puVar8 == (undefined1 *)0x0) goto code_r0x00024e88;
    }
    else {
      lVar15 = __Znwm(puVar9);
      puVar5 = puVar19 + lVar15;
      puVar9 = puVar9 + lVar15;
      puVar4 = puVar5 + 1;
      *puVar5 = 0;
      puVar17 = puVar9;
      if (puVar8 != puVar18) goto code_r0x00024d44;
code_r0x00024f14:
      *unaff_x19 = (long)puVar5;
      unaff_x19[1] = (long)puVar4;
      unaff_x19[2] = (long)puVar9;
    }
    __ZdlPv(puVar8);
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto code_r0x00024f34;
code_r0x00024e98:
    puVar5 = puVar4 + 1;
    *puVar4 = 0;
    unaff_x19[1] = (long)puVar5;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar5 < puVar4) goto code_r0x00024fd8;
code_r0x00025034:
    puVar19 = (undefined1 *)*unaff_x19;
    puVar9 = puVar5 + -(long)puVar19;
    puVar18 = puVar9 + 1;
    if ((long)puVar18 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar19) * 2);
    if (puVar8 <= puVar18) {
      puVar8 = puVar18;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar19)) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      lVar15 = 0;
      unaff_x23 = puVar9 + 1;
      *puVar9 = 0;
      puVar8 = (undefined1 *)0x0;
      puVar18 = (undefined1 *)0x0;
      puVar4 = puVar9;
      if (puVar5 == puVar19) goto code_r0x00025114;
code_r0x00025080:
      if ((puVar9 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar15) < 0x40)) {
code_r0x000250a8:
        do {
          puVar4 = puVar4 + -1;
          puVar5 = puVar5 + -1;
          *puVar4 = *puVar5;
        } while (puVar5 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar9) {
        puVar17 = (undefined1 *)((ulong)puVar9 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar5 + -0x20);
        puVar14 = (undefined8 *)(puVar9 + lVar15 + -0x20);
        puVar8 = puVar17;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar14[1] = puVar10[1];
          *puVar14 = uVar23;
          puVar14[3] = uVar22;
          puVar14[2] = uVar21;
          puVar14[-3] = uVar27;
          puVar14[-4] = uVar26;
          puVar14[-1] = uVar25;
          puVar14[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar14 = puVar14 + -8;
          puVar8 = puVar8 + -0x40;
        } while (puVar8 != (undefined1 *)0x0);
        if (puVar9 != puVar17) {
          if (((ulong)puVar9 & 0x38) == 0) {
            puVar4 = puVar4 + -(long)puVar17;
            puVar5 = puVar5 + -(long)puVar17;
            goto code_r0x000250a8;
          }
          goto code_r0x00025b50;
        }
      }
      else {
        puVar17 = (undefined1 *)0x0;
code_r0x00025b50:
        puVar8 = (undefined1 *)((ulong)puVar9 & 0xfffffffffffffff8);
        puVar4 = puVar4 + -(long)puVar8;
        puVar14 = (undefined8 *)(puVar5 + -(long)puVar17);
        puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar19));
        lVar13 = (long)puVar17 - (long)puVar8;
        do {
          puVar14 = puVar14 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar14;
          lVar13 = lVar13 + 8;
        } while (lVar13 != 0);
        puVar5 = puVar5 + -(long)puVar8;
        if (puVar9 != puVar8) goto code_r0x000250a8;
      }
      puVar5 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar15;
      unaff_x19[1] = (long)unaff_x23;
      unaff_x19[2] = (long)puVar18;
      if (puVar5 == (undefined1 *)0x0) {
        unaff_x19[1] = (long)unaff_x23;
        uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
        puVar4 = (undefined1 *)unaff_x19[2];
        if (unaff_x23 < puVar4) goto code_r0x000250dc;
        goto code_r0x00025138;
      }
    }
    else {
      lVar15 = __Znwm(puVar8);
      puVar4 = puVar9 + lVar15;
      puVar8 = puVar8 + lVar15;
      unaff_x23 = puVar4 + 1;
      *puVar4 = 0;
      puVar18 = puVar8;
      if (puVar5 != puVar19) goto code_r0x00025080;
code_r0x00025114:
      *unaff_x19 = (long)puVar4;
      unaff_x19[1] = (long)unaff_x23;
      unaff_x19[2] = (long)puVar8;
    }
    __ZdlPv(puVar5);
    unaff_x19[1] = (long)unaff_x23;
    uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
    puVar4 = (undefined1 *)unaff_x19[2];
    if (unaff_x23 < puVar4) goto code_r0x000250dc;
code_r0x00025138:
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x22 = (undefined1 *)*unaff_x19;
    unaff_x24 = unaff_x23 + -(long)unaff_x22;
    puVar5 = unaff_x24 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
      (*pcVar2)();
    }
    param_1 = (undefined1 *)(((long)puVar4 - (long)unaff_x22) * 2);
    if (param_1 <= puVar5) {
      param_1 = puVar5;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)unaff_x22)) {
      param_1 = (undefined1 *)0x7fffffffffffffff;
    }
    if (param_1 == (undefined1 *)0x0) {
      param_2 = 0;
      *unaff_x24 = uVar20;
      param_1 = (undefined1 *)0x0;
      in_x9 = unaff_x24;
    }
    else {
      param_2 = __Znwm(param_1);
      in_x9 = unaff_x24 + param_2;
      param_1 = param_1 + param_2;
      *in_x9 = uVar20;
    }
    unaff_x21 = in_x9 + 1;
    if (unaff_x23 != unaff_x22) {
      if (unaff_x24 < &MACH_HEADER.cpusubtype) goto LAB_000251ac;
      in_x10 = (long)unaff_x22 - param_2;
      goto code_r0x0002519c;
    }
    *unaff_x19 = (long)in_x9;
    unaff_x19[1] = (long)unaff_x21;
    unaff_x19[2] = (long)param_1;
LAB_0002521c:
    __ZdlPv(unaff_x23);
    unaff_x19[1] = (long)unaff_x21;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (unaff_x21 < puVar4) goto LAB_000251dc;
  }
LAB_00025234:
  puVar18 = (undefined1 *)*unaff_x19;
  puVar19 = unaff_x21 + -(long)puVar18;
  puVar5 = puVar19 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar9 = (undefined1 *)(((long)puVar4 - (long)puVar18) * 2);
  if (puVar9 <= puVar5) {
    puVar9 = puVar5;
  }
  if (unaff_x28 <= (ulong)((long)puVar4 - (long)puVar18)) {
    puVar9 = unaff_x27;
  }
  if (puVar9 == (undefined1 *)0x0) {
    lVar15 = 0;
    puVar4 = puVar19 + 1;
    *puVar19 = 0;
    puVar9 = (undefined1 *)0x0;
    puVar8 = (undefined1 *)0x0;
    puVar5 = puVar19;
    if (unaff_x21 == puVar18) goto LAB_00025310;
LAB_00025280:
    if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar15) < 0x40)) {
LAB_000252a8:
      do {
        puVar5 = puVar5 + -1;
        unaff_x21 = unaff_x21 + -1;
        *puVar5 = *unaff_x21;
      } while (unaff_x21 != puVar18);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
      puVar17 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(unaff_x21 + -0x20);
      puVar14 = (undefined8 *)(puVar19 + lVar15 + -0x20);
      puVar9 = puVar17;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar9 = puVar9 + -0x40;
      } while (puVar9 != (undefined1 *)0x0);
      if (puVar19 != puVar17) {
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar17;
          unaff_x21 = unaff_x21 + -(long)puVar17;
          goto LAB_000252a8;
        }
        goto code_r0x00025c58;
      }
    }
    else {
      puVar17 = (undefined1 *)0x0;
code_r0x00025c58:
      puVar9 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar9;
      puVar14 = (undefined8 *)(unaff_x21 + -(long)puVar17);
      puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar18));
      lVar13 = (long)puVar17 - (long)puVar9;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar13 = lVar13 + 8;
      } while (lVar13 != 0);
      unaff_x21 = unaff_x21 + -(long)puVar9;
      if (puVar19 != puVar9) goto LAB_000252a8;
    }
    unaff_x21 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar15;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
    if (unaff_x21 != (undefined1 *)0x0) goto LAB_00025318;
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar4 < puVar5) goto LAB_000252d8;
  }
  else {
    lVar15 = __Znwm(puVar9);
    puVar5 = puVar19 + lVar15;
    puVar9 = puVar9 + lVar15;
    puVar4 = puVar5 + 1;
    *puVar5 = 0;
    puVar8 = puVar9;
    if (unaff_x21 != puVar18) goto LAB_00025280;
LAB_00025310:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar9;
LAB_00025318:
    __ZdlPv(unaff_x21);
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar4 < puVar5) goto LAB_000252d8;
  }
LAB_00025330:
  puVar19 = (undefined1 *)*unaff_x19;
  puVar9 = puVar4 + -(long)puVar19;
  puVar18 = puVar9 + 1;
  if ((long)puVar18 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar5 - (long)puVar19) * 2);
  if (puVar8 <= puVar18) {
    puVar8 = puVar18;
  }
  if (unaff_x28 <= (ulong)((long)puVar5 - (long)puVar19)) {
    puVar8 = unaff_x27;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar15 = 0;
    puVar5 = puVar9 + 1;
    *puVar9 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar17 = (undefined1 *)0x0;
    puVar18 = puVar9;
    if (puVar4 == puVar19) goto LAB_000253fc;
code_r0x0002537c:
    if ((puVar9 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar15) < 0x40)) {
code_r0x000253a4:
      do {
        puVar18 = puVar18 + -1;
        puVar4 = puVar4 + -1;
        *puVar18 = *puVar4;
      } while (puVar4 != puVar19);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar9) {
      puVar12 = (undefined1 *)((ulong)puVar9 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(puVar4 + -0x20);
      puVar14 = (undefined8 *)(puVar9 + lVar15 + -0x20);
      puVar8 = puVar12;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar14[1] = puVar10[1];
        *puVar14 = uVar23;
        puVar14[3] = uVar22;
        puVar14[2] = uVar21;
        puVar14[-3] = uVar27;
        puVar14[-4] = uVar26;
        puVar14[-1] = uVar25;
        puVar14[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar14 = puVar14 + -8;
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar9 != puVar12) {
        if (((ulong)puVar9 & 0x38) == 0) {
          puVar18 = puVar18 + -(long)puVar12;
          puVar4 = puVar4 + -(long)puVar12;
          goto code_r0x000253a4;
        }
        goto code_r0x00025cdc;
      }
    }
    else {
      puVar12 = (undefined1 *)0x0;
code_r0x00025cdc:
      puVar8 = (undefined1 *)((ulong)puVar9 & 0xfffffffffffffff8);
      puVar18 = puVar18 + -(long)puVar8;
      puVar14 = (undefined8 *)(puVar4 + -(long)puVar12);
      puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar19));
      lVar13 = (long)puVar12 - (long)puVar8;
      do {
        puVar14 = puVar14 + -1;
        puVar10 = puVar10 + -1;
        *puVar10 = *puVar14;
        lVar13 = lVar13 + 8;
      } while (lVar13 != 0);
      puVar4 = puVar4 + -(long)puVar8;
      if (puVar9 != puVar8) goto code_r0x000253a4;
    }
    puVar4 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar15;
    unaff_x19[1] = (long)puVar5;
    unaff_x19[2] = (long)puVar17;
    if (puVar4 != (undefined1 *)0x0) goto code_r0x00025404;
    unaff_x19[1] = (long)puVar5;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar5 < puVar4) goto FUN_000253d4;
  }
  else {
    lVar15 = __Znwm(puVar8);
    puVar18 = puVar9 + lVar15;
    puVar8 = puVar8 + lVar15;
    puVar5 = puVar18 + 1;
    *puVar18 = 0;
    puVar17 = puVar8;
    if (puVar4 != puVar19) goto code_r0x0002537c;
LAB_000253fc:
    *unaff_x19 = (long)puVar18;
    unaff_x19[1] = (long)puVar5;
    unaff_x19[2] = (long)puVar8;
code_r0x00025404:
    __ZdlPv(puVar4);
    unaff_x19[1] = (long)puVar5;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar5 < puVar4) goto FUN_000253d4;
  }
LAB_0002541c:
  puVar19 = (undefined1 *)*unaff_x19;
  puVar9 = puVar5 + -(long)puVar19;
  puVar18 = puVar9 + 1;
  if ((long)puVar18 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar19) * 2);
  if (puVar8 <= puVar18) {
    puVar8 = puVar18;
  }
  if (unaff_x28 <= (ulong)((long)puVar4 - (long)puVar19)) {
    puVar8 = unaff_x27;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar15 = 0;
    *puVar9 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar18 = puVar9;
  }
  else {
    lVar15 = __Znwm(puVar8);
    puVar18 = puVar9 + lVar15;
    puVar8 = puVar8 + lVar15;
    *puVar18 = 0;
  }
  puVar4 = puVar18 + 1;
  if (puVar5 == puVar19) {
    *unaff_x19 = (long)puVar18;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
    goto code_r0x000254d8;
  }
  if ((puVar9 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar15) < 0x40)) {
code_r0x00025490:
    do {
      puVar18 = puVar18 + -1;
      puVar5 = puVar5 + -1;
      *puVar18 = *puVar5;
    } while (puVar5 != puVar19);
  }
  else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar9) {
    puVar12 = (undefined1 *)((ulong)puVar9 & 0xffffffffffffffc0);
    puVar10 = (undefined8 *)(puVar5 + -0x20);
    puVar14 = (undefined8 *)(puVar9 + lVar15 + -0x20);
    puVar17 = puVar12;
    do {
      uVar23 = *puVar10;
      uVar22 = puVar10[3];
      uVar21 = puVar10[2];
      uVar27 = puVar10[-3];
      uVar26 = puVar10[-4];
      uVar25 = puVar10[-1];
      uVar24 = puVar10[-2];
      puVar14[1] = puVar10[1];
      *puVar14 = uVar23;
      puVar14[3] = uVar22;
      puVar14[2] = uVar21;
      puVar14[-3] = uVar27;
      puVar14[-4] = uVar26;
      puVar14[-1] = uVar25;
      puVar14[-2] = uVar24;
      puVar10 = puVar10 + -8;
      puVar14 = puVar14 + -8;
      puVar17 = puVar17 + -0x40;
    } while (puVar17 != (undefined1 *)0x0);
    if (puVar9 != puVar12) {
      if (((ulong)puVar9 & 0x38) == 0) {
        puVar18 = puVar18 + -(long)puVar12;
        puVar5 = puVar5 + -(long)puVar12;
        goto code_r0x00025490;
      }
      goto code_r0x00025d60;
    }
  }
  else {
    puVar12 = (undefined1 *)0x0;
code_r0x00025d60:
    puVar17 = (undefined1 *)((ulong)puVar9 & 0xfffffffffffffff8);
    puVar18 = puVar18 + -(long)puVar17;
    puVar14 = (undefined8 *)(puVar5 + -(long)puVar12);
    puVar10 = (undefined8 *)((long)puVar14 + (lVar15 - (long)puVar19));
    lVar13 = (long)puVar12 - (long)puVar17;
    do {
      puVar14 = puVar14 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar14;
      lVar13 = lVar13 + 8;
    } while (lVar13 != 0);
    puVar5 = puVar5 + -(long)puVar17;
    if (puVar9 != puVar17) goto code_r0x00025490;
  }
  puVar5 = (undefined1 *)*unaff_x19;
  *unaff_x19 = lVar15;
  unaff_x19[1] = (long)puVar4;
  unaff_x19[2] = (long)puVar8;
  if (puVar5 == (undefined1 *)0x0) goto LAB_000254e0;
code_r0x000254d8:
  __ZdlPv(puVar5);
  goto LAB_000254e0;
}

