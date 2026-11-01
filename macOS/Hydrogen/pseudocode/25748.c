
void FUN_00025748(undefined1 *param_1,undefined1 *param_2)

{
  long *plVar1;
  code *pcVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  long in_x9;
  undefined1 *in_x10;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined1 *in_x11;
  undefined1 *puVar12;
  undefined8 *in_x12;
  undefined8 *in_x13;
  undefined8 *puVar13;
  long *unaff_x19;
  long unaff_x20;
  long lVar14;
  undefined1 *unaff_x21;
  long lVar15;
  undefined1 *puVar16;
  long lVar17;
  undefined1 *puVar18;
  undefined1 *unaff_x23;
  undefined1 *unaff_x24;
  long unaff_x25;
  undefined1 *puVar19;
  undefined1 *unaff_x26;
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
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  
code_r0x00025748:
  do {
    *in_x12 = *in_x13;
    in_x9 = in_x9 + 8;
    in_x12 = in_x12 + -1;
    in_x13 = in_x13 + -1;
  } while (in_x9 != 0);
  puVar16 = in_x11;
  if (unaff_x26 != in_x10) goto LAB_00025eb8;
LAB_00025fc8:
  puVar16 = (undefined1 *)*unaff_x19;
  *unaff_x19 = (long)param_2;
  unaff_x19[1] = (long)unaff_x24;
  unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
  if (puVar16 == (undefined1 *)0x0) goto LAB_00025fe8;
code_r0x00025fe0:
  __ZdlPv(param_2,puVar16);
LAB_00025fe8:
  unaff_x19[1] = (long)unaff_x24;
LAB_00024734:
  unaff_x25 = unaff_x25 + 1;
  if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
    if (0 < *(int *)(unaff_x20 + 0x8c)) {
      lVar17 = 0;
      do {
        func_0x000245c0(&uStack0000000000000008,
                        *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar17 * 8));
        func_0x00026614();
        if (uStack0000000000000008 != 0) {
          in_stack_00000010 = uStack0000000000000008;
          __ZdlPv();
        }
        lVar17 = lVar17 + 1;
      } while (lVar17 < *(int *)(unaff_x20 + 0x8c));
    }
    func_0x000262e0();
    return;
  }
  lVar17 = *(long *)(unaff_x20 + 8);
  plVar1 = (long *)(lVar17 + unaff_x25 * 0x10);
  switch(*(undefined4 *)((long)plVar1 + 0xc)) {
  case 0:
    puVar16 = (undefined1 *)unaff_x19[1];
    if (puVar16 < (undefined1 *)unaff_x19[2]) {
      *puVar16 = 0;
      unaff_x19[1] = (long)(puVar16 + 1);
      goto LAB_00024734;
    }
    puVar18 = (undefined1 *)*unaff_x19;
    puVar19 = puVar16 + -(long)puVar18;
    puVar5 = puVar19 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar4 = unaff_x19[2] - (long)puVar18;
    unaff_x21 = (undefined1 *)(uVar4 * 2);
    if (unaff_x21 <= puVar5) {
      unaff_x21 = puVar5;
    }
    if (unaff_x28 <= uVar4) {
      unaff_x21 = unaff_x27;
    }
    if (unaff_x21 == (undefined1 *)0x0) {
      param_2 = (undefined1 *)0x0;
      *puVar19 = 0;
      puVar5 = puVar19;
    }
    else {
      param_2 = (undefined1 *)__Znwm(unaff_x21);
      puVar5 = param_2 + (long)puVar19;
      *puVar5 = 0;
    }
    unaff_x24 = puVar5 + 1;
    if (puVar16 == puVar18) goto code_r0x00025618;
    puVar12 = puVar16;
    if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - (long)param_2) < 0x40))
    goto code_r0x00025ed8;
    if (puVar19 < &segment_command_00000020.vmsize) {
      puVar7 = (undefined1 *)0x0;
      goto code_r0x000257ac;
    }
    puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
    puVar9 = (undefined8 *)(puVar16 + -0x20);
    puVar13 = (undefined8 *)(param_2 + (long)puVar19 + -0x20);
    puVar12 = puVar7;
    do {
      uVar23 = *puVar9;
      uVar22 = puVar9[3];
      uVar21 = puVar9[2];
      uVar27 = puVar9[-3];
      uVar26 = puVar9[-4];
      uVar25 = puVar9[-1];
      uVar24 = puVar9[-2];
      puVar13[1] = puVar9[1];
      *puVar13 = uVar23;
      puVar13[3] = uVar22;
      puVar13[2] = uVar21;
      puVar13[-3] = uVar27;
      puVar13[-4] = uVar26;
      puVar13[-1] = uVar25;
      puVar13[-2] = uVar24;
      puVar9 = puVar9 + -8;
      puVar13 = puVar13 + -8;
      puVar12 = puVar12 + -0x40;
    } while (puVar12 != (undefined1 *)0x0);
    if (puVar19 != puVar7) {
      if (((ulong)puVar19 & 0x38) == 0) {
        puVar5 = puVar5 + -(long)puVar7;
        puVar12 = puVar16 + -(long)puVar7;
      }
      else {
code_r0x000257ac:
        puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar12 = puVar16 + -(long)puVar10;
        puVar5 = puVar5 + -(long)puVar10;
        puVar13 = (undefined8 *)(puVar16 + -(long)puVar7);
        puVar9 = (undefined8 *)(param_2 + ((long)puVar13 - (long)puVar18));
        lVar17 = (long)puVar7 - (long)puVar10;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar17 = lVar17 + 8;
        } while (lVar17 != 0);
        if (puVar19 == puVar10) goto LAB_00025fc8;
      }
code_r0x00025ed8:
      do {
        puVar5 = puVar5 + -1;
        puVar12 = puVar12 + -1;
        *puVar5 = *puVar12;
      } while (puVar12 != puVar18);
    }
    goto LAB_00025fc8;
  case 1:
    puVar16 = (undefined1 *)unaff_x19[1];
    uVar20 = (undefined1)*plVar1;
    if (puVar16 < (undefined1 *)unaff_x19[2]) {
      *puVar16 = uVar20;
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      unaff_x19[1] = (long)(puVar16 + 1);
      goto LAB_00024734;
    }
    unaff_x23 = (undefined1 *)*unaff_x19;
    unaff_x26 = puVar16 + -(long)unaff_x23;
    puVar5 = unaff_x26 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar4 = unaff_x19[2] - (long)unaff_x23;
    unaff_x21 = (undefined1 *)(uVar4 * 2);
    if (unaff_x21 <= puVar5) {
      unaff_x21 = puVar5;
    }
    if (unaff_x28 <= uVar4) {
      unaff_x21 = (undefined1 *)0x7fffffffffffffff;
    }
    if (unaff_x21 == (undefined1 *)0x0) {
      param_2 = (undefined1 *)0x0;
      *unaff_x26 = uVar20;
      param_1 = unaff_x26;
    }
    else {
      param_2 = (undefined1 *)__Znwm(unaff_x21);
      param_1 = param_2 + (long)unaff_x26;
      *param_1 = uVar20;
    }
    unaff_x24 = param_1 + 1;
    if (puVar16 == unaff_x23) {
      unaff_x27 = (undefined1 *)0x7fffffffffffffff;
      *unaff_x19 = (long)param_1;
      unaff_x19[1] = (long)unaff_x24;
      unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
      param_2 = param_1;
      goto joined_r0x00024a84;
    }
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    if ((unaff_x26 < &MACH_HEADER.cpusubtype) || ((ulong)((long)unaff_x23 - (long)param_2) < 0x40))
    goto LAB_00025eb8;
    if (unaff_x26 < &segment_command_00000020.vmsize) {
      puVar5 = (undefined1 *)0x0;
      goto code_r0x00025724;
    }
    puVar5 = (undefined1 *)((ulong)unaff_x26 & 0xffffffffffffffc0);
    puVar9 = (undefined8 *)(puVar16 + -0x20);
    puVar13 = (undefined8 *)(param_2 + (long)unaff_x26 + -0x20);
    puVar18 = puVar5;
    do {
      uVar23 = *puVar9;
      uVar22 = puVar9[3];
      uVar21 = puVar9[2];
      uVar27 = puVar9[-3];
      uVar26 = puVar9[-4];
      uVar25 = puVar9[-1];
      uVar24 = puVar9[-2];
      puVar13[1] = puVar9[1];
      *puVar13 = uVar23;
      puVar13[3] = uVar22;
      puVar13[2] = uVar21;
      puVar13[-3] = uVar27;
      puVar13[-4] = uVar26;
      puVar13[-1] = uVar25;
      puVar13[-2] = uVar24;
      puVar9 = puVar9 + -8;
      puVar13 = puVar13 + -8;
      puVar18 = puVar18 + -0x40;
    } while (puVar18 != (undefined1 *)0x0);
    if (unaff_x26 != puVar5) {
      if (((ulong)unaff_x26 & 0x38) != 0) goto code_r0x00025724;
      param_1 = param_1 + -(long)puVar5;
      puVar16 = puVar16 + -(long)puVar5;
LAB_00025eb8:
      do {
        param_1 = param_1 + -1;
        puVar16 = puVar16 + -1;
        *param_1 = *puVar16;
      } while (puVar16 != unaff_x23);
    }
    goto LAB_00025fc8;
  default:
    goto LAB_00024734;
  case 3:
    func_0x000262e0();
    goto LAB_00024734;
  case 4:
    puVar16 = (undefined1 *)unaff_x19[1];
    if (puVar16 < (undefined1 *)unaff_x19[2]) {
      puVar7 = puVar16 + 1;
      *puVar16 = 0;
    }
    else {
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar16 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if ((long)puVar5 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar18;
      puVar12 = (undefined1 *)(uVar4 * 2);
      if (puVar12 <= puVar5) {
        puVar12 = puVar5;
      }
      if (0x3ffffffffffffffe < uVar4) {
        puVar12 = unaff_x27;
      }
      if (puVar12 == (undefined1 *)0x0) {
        puVar10 = (undefined1 *)0x0;
        puVar7 = puVar19 + 1;
        *puVar19 = 0;
        puVar5 = puVar19;
        if (puVar16 == puVar18) goto code_r0x00024ae0;
code_r0x000249b4:
        puVar11 = puVar16;
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - (long)puVar10) < 0x40))
        {
code_r0x00025ef8:
          do {
            puVar5 = puVar5 + -1;
            puVar11 = puVar11 + -1;
            *puVar5 = *puVar11;
          } while (puVar11 != puVar18);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar6 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar16 + -0x20);
          puVar13 = (undefined8 *)(puVar10 + (long)puVar19 + -0x20);
          puVar11 = puVar6;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar11 = puVar11 + -0x40;
          } while (puVar11 != (undefined1 *)0x0);
          if (puVar19 != puVar6) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar5 = puVar5 + -(long)puVar6;
              puVar11 = puVar16 + -(long)puVar6;
              goto code_r0x00025ef8;
            }
            goto code_r0x00025834;
          }
        }
        else {
          puVar6 = (undefined1 *)0x0;
code_r0x00025834:
          puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar11 = puVar16 + -(long)puVar8;
          puVar5 = puVar5 + -(long)puVar8;
          puVar13 = (undefined8 *)(puVar16 + -(long)puVar6);
          puVar9 = (undefined8 *)(puVar10 + ((long)puVar13 - (long)puVar18));
          lVar14 = (long)puVar6 - (long)puVar8;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          if (puVar19 != puVar8) goto code_r0x00025ef8;
        }
        puVar16 = (undefined1 *)*unaff_x19;
        *unaff_x19 = (long)puVar10;
        unaff_x19[1] = (long)puVar7;
        unaff_x19[2] = (long)(puVar10 + (long)puVar12);
        puVar5 = puVar10;
      }
      else {
        puVar10 = (undefined1 *)__Znwm(puVar12);
        puVar5 = puVar10 + (long)puVar19;
        puVar7 = puVar5 + 1;
        *puVar5 = 0;
        if (puVar16 != puVar18) goto code_r0x000249b4;
code_r0x00024ae0:
        *unaff_x19 = (long)puVar5;
        unaff_x19[1] = (long)puVar7;
        unaff_x19[2] = (long)(puVar10 + (long)puVar12);
      }
      unaff_x28 = 0x3fffffffffffffff;
      if (puVar16 != (undefined1 *)0x0) {
        unaff_x28 = 0x3fffffffffffffff;
        __ZdlPv(puVar5,puVar16);
      }
    }
    unaff_x19[1] = (long)puVar7;
    if (puVar7 < (undefined1 *)unaff_x19[2]) {
      puVar10 = puVar7 + 1;
      *puVar7 = 0;
      unaff_x19[1] = (long)puVar10;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar10 < puVar16) goto code_r0x00024bcc;
code_r0x00024c2c:
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar10 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if ((long)puVar5 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar12 = (undefined1 *)(((long)puVar16 - (long)puVar18) * 2);
      if (puVar12 <= puVar5) {
        puVar12 = puVar5;
      }
      if (unaff_x28 <= (ulong)((long)puVar16 - (long)puVar18)) {
        puVar12 = unaff_x27;
      }
      if (puVar12 != (undefined1 *)0x0) {
        lVar14 = __Znwm(puVar12);
        puVar16 = puVar19 + lVar14;
        puVar12 = puVar12 + lVar14;
        puVar7 = puVar16 + 1;
        *puVar16 = 0;
        puVar5 = puVar12;
        if (puVar10 != puVar18) goto code_r0x00024c78;
code_r0x00024dac:
        *unaff_x19 = (long)puVar16;
        unaff_x19[1] = (long)puVar7;
        unaff_x19[2] = (long)puVar12;
code_r0x00024db8:
        __ZdlPv(puVar10);
        unaff_x19[1] = (long)puVar7;
        uVar20 = (undefined1)*plVar1;
        puVar16 = (undefined1 *)unaff_x19[2];
        if (puVar7 < puVar16) goto code_r0x00024cd8;
        goto code_r0x00024dd4;
      }
      lVar14 = 0;
      puVar7 = puVar19 + 1;
      *puVar19 = 0;
      puVar12 = (undefined1 *)0x0;
      puVar5 = (undefined1 *)0x0;
      puVar16 = puVar19;
      if (puVar10 == puVar18) goto code_r0x00024dac;
code_r0x00024c78:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar14) < 0x40)) {
code_r0x00024ca0:
        do {
          puVar16 = puVar16 + -1;
          puVar10 = puVar10 + -1;
          *puVar16 = *puVar10;
        } while (puVar10 != puVar18);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar10 + -0x20);
        puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
        puVar12 = puVar11;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar13[1] = puVar9[1];
          *puVar13 = uVar23;
          puVar13[3] = uVar22;
          puVar13[2] = uVar21;
          puVar13[-3] = uVar27;
          puVar13[-4] = uVar26;
          puVar13[-1] = uVar25;
          puVar13[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar13 = puVar13 + -8;
          puVar12 = puVar12 + -0x40;
        } while (puVar12 != (undefined1 *)0x0);
        if (puVar19 != puVar11) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar16 = puVar16 + -(long)puVar11;
            puVar10 = puVar10 + -(long)puVar11;
            goto code_r0x00024ca0;
          }
          goto code_r0x00025940;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x00025940:
        puVar12 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar16 = puVar16 + -(long)puVar12;
        puVar13 = (undefined8 *)(puVar10 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar18));
        lVar15 = (long)puVar11 - (long)puVar12;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        puVar10 = puVar10 + -(long)puVar12;
        if (puVar19 != puVar12) goto code_r0x00024ca0;
      }
      puVar10 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar14;
      unaff_x19[1] = (long)puVar7;
      unaff_x19[2] = (long)puVar5;
      if (puVar10 != (undefined1 *)0x0) goto code_r0x00024db8;
      unaff_x19[1] = (long)puVar7;
      uVar20 = (undefined1)*plVar1;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar7) goto code_r0x00024dd4;
code_r0x00024cd8:
      puVar10 = puVar7 + 1;
      *puVar7 = uVar20;
      unaff_x19[1] = (long)puVar10;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar10) goto code_r0x00024cf8;
code_r0x00024e80:
      puVar16 = puVar10 + 1;
      *puVar10 = 0;
code_r0x00024e88:
      unaff_x19[1] = (long)puVar16;
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar16 < puVar5) goto code_r0x00024e98;
code_r0x00024f34:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar16 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar5 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar16 == puVar19) goto code_r0x00025014;
code_r0x00024f80:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x00024fa8:
          do {
            puVar18 = puVar18 + -1;
            puVar16 = puVar16 + -1;
            *puVar18 = *puVar16;
          } while (puVar16 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar16 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar16 = puVar16 + -(long)puVar11;
              goto code_r0x00024fa8;
            }
            goto code_r0x00025acc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025acc:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar16 = puVar16 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x00024fa8;
        }
        puVar16 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar10;
        if (puVar16 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar5;
          puVar16 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar16) goto code_r0x00024fd8;
          goto code_r0x00025034;
        }
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar5 = puVar18 + 1;
        *puVar18 = 0;
        puVar10 = puVar7;
        if (puVar16 != puVar19) goto code_r0x00024f80;
code_r0x00025014:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar16);
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar5) goto code_r0x00025034;
code_r0x00024fd8:
      puVar16 = puVar5 + 1;
      *puVar5 = 0;
      unaff_x19[1] = (long)puVar16;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar16 < puVar5) goto code_r0x000250dc;
code_r0x00025138:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar16 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar5 = puVar12 + 1;
        *puVar12 = uVar20;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar16 == puVar19) goto code_r0x00025214;
code_r0x00025184:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x000251ac:
          do {
            puVar18 = puVar18 + -1;
            puVar16 = puVar16 + -1;
            *puVar18 = *puVar16;
          } while (puVar16 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar16 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar16 = puVar16 + -(long)puVar11;
              goto code_r0x000251ac;
            }
            goto code_r0x00025bd4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025bd4:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar16 = puVar16 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x000251ac;
        }
        puVar16 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar10;
        if (puVar16 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar5;
          puVar16 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar16) goto code_r0x000251dc;
          goto code_r0x00025234;
        }
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar5 = puVar18 + 1;
        *puVar18 = uVar20;
        puVar10 = puVar7;
        if (puVar16 != puVar19) goto code_r0x00025184;
code_r0x00025214:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar16);
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar5) goto code_r0x00025234;
code_r0x000251dc:
      puVar16 = puVar5 + 1;
      *puVar5 = 0;
      unaff_x19[1] = (long)puVar16;
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar16 < puVar5) goto code_r0x000252d8;
code_r0x00025330:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar16 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar5 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar5 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar16 == puVar19) goto code_r0x000253fc;
code_r0x0002537c:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x000253a4:
          do {
            puVar18 = puVar18 + -1;
            puVar16 = puVar16 + -1;
            *puVar18 = *puVar16;
          } while (puVar16 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar16 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar16 = puVar16 + -(long)puVar11;
              goto code_r0x000253a4;
            }
            goto code_r0x00025cdc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025cdc:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar16 = puVar16 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x000253a4;
        }
        puVar16 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar10;
        if (puVar16 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar5;
          puVar16 = (undefined1 *)unaff_x19[2];
          if (puVar5 < puVar16) goto code_r0x000253d4;
          goto code_r0x0002541c;
        }
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar5 = puVar18 + 1;
        *puVar18 = 0;
        puVar10 = puVar7;
        if (puVar16 != puVar19) goto code_r0x0002537c;
code_r0x000253fc:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar5;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar16);
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar5) goto code_r0x0002541c;
code_r0x000253d4:
      puVar16 = puVar5 + 1;
      *puVar5 = 0;
    }
    else {
      puVar5 = (undefined1 *)*unaff_x19;
      puVar18 = puVar7 + -(long)puVar5;
      puVar16 = puVar18 + 1;
      if ((long)puVar16 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar5;
      puVar19 = (undefined1 *)(uVar4 * 2);
      if (puVar19 <= puVar16) {
        puVar19 = puVar16;
      }
      if (unaff_x28 <= uVar4) {
        puVar19 = unaff_x27;
      }
      if (puVar19 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar10 = puVar18 + 1;
        *puVar18 = 0;
        puVar19 = (undefined1 *)0x0;
        puVar12 = (undefined1 *)0x0;
        puVar16 = puVar18;
        if (puVar7 == puVar5) goto code_r0x00024c0c;
code_r0x00024b74:
        if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar5 - lVar14) < 0x40)) {
code_r0x00024b9c:
          do {
            puVar16 = puVar16 + -1;
            puVar7 = puVar7 + -1;
            *puVar16 = *puVar7;
          } while (puVar7 != puVar5);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
          puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar7 + -0x20);
          puVar13 = (undefined8 *)(puVar18 + lVar14 + -0x20);
          puVar19 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar19 = puVar19 + -0x40;
          } while (puVar19 != (undefined1 *)0x0);
          if (puVar18 != puVar11) {
            if (((ulong)puVar18 & 0x38) == 0) {
              puVar16 = puVar16 + -(long)puVar11;
              puVar7 = puVar7 + -(long)puVar11;
              goto code_r0x00024b9c;
            }
            goto code_r0x000258bc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x000258bc:
          puVar19 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
          puVar16 = puVar16 + -(long)puVar19;
          puVar13 = (undefined8 *)(puVar7 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar5));
          lVar15 = (long)puVar11 - (long)puVar19;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar7 = puVar7 + -(long)puVar19;
          if (puVar18 != puVar19) goto code_r0x00024b9c;
        }
        puVar7 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar10;
        unaff_x19[2] = (long)puVar12;
        if (puVar7 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar10;
          puVar16 = (undefined1 *)unaff_x19[2];
          if (puVar16 <= puVar10) goto code_r0x00024c2c;
          goto code_r0x00024bcc;
        }
      }
      else {
        lVar14 = __Znwm(puVar19);
        puVar16 = puVar18 + lVar14;
        puVar19 = puVar19 + lVar14;
        puVar10 = puVar16 + 1;
        *puVar16 = 0;
        puVar12 = puVar19;
        if (puVar7 != puVar5) goto code_r0x00024b74;
code_r0x00024c0c:
        *unaff_x19 = (long)puVar16;
        unaff_x19[1] = (long)puVar10;
        unaff_x19[2] = (long)puVar19;
      }
      __ZdlPv(puVar7);
      unaff_x19[1] = (long)puVar10;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar16 <= puVar10) goto code_r0x00024c2c;
code_r0x00024bcc:
      puVar7 = puVar10 + 1;
      *puVar10 = 0;
      unaff_x19[1] = (long)puVar7;
      uVar20 = (undefined1)*plVar1;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar7 < puVar16) goto code_r0x00024cd8;
code_r0x00024dd4:
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar7 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if ((long)puVar5 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar12 = (undefined1 *)(((long)puVar16 - (long)puVar18) * 2);
      if (puVar12 <= puVar5) {
        puVar12 = puVar5;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar16 - (long)puVar18)) {
        puVar12 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar12 != (undefined1 *)0x0) {
        lVar14 = __Znwm(puVar12);
        puVar16 = puVar19 + lVar14;
        puVar12 = puVar12 + lVar14;
        puVar10 = puVar16 + 1;
        *puVar16 = uVar20;
        puVar5 = puVar12;
        if (puVar7 != puVar18) goto code_r0x00024e24;
code_r0x00024ed0:
        *unaff_x19 = (long)puVar16;
        unaff_x19[1] = (long)puVar10;
        unaff_x19[2] = (long)puVar12;
code_r0x00024edc:
        __ZdlPv(puVar7);
        unaff_x19[1] = (long)puVar10;
        puVar16 = (undefined1 *)unaff_x19[2];
        if (puVar16 <= puVar10) goto code_r0x00024cf8;
        goto code_r0x00024e80;
      }
      lVar14 = 0;
      puVar10 = puVar19 + 1;
      *puVar19 = uVar20;
      puVar12 = (undefined1 *)0x0;
      puVar5 = (undefined1 *)0x0;
      puVar16 = puVar19;
      if (puVar7 == puVar18) goto code_r0x00024ed0;
code_r0x00024e24:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar14) < 0x40)) {
code_r0x00024e50:
        do {
          puVar16 = puVar16 + -1;
          puVar7 = puVar7 + -1;
          *puVar16 = *puVar7;
        } while (puVar7 != puVar18);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar7 + -0x20);
        puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
        puVar12 = puVar11;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar13[1] = puVar9[1];
          *puVar13 = uVar23;
          puVar13[3] = uVar22;
          puVar13[2] = uVar21;
          puVar13[-3] = uVar27;
          puVar13[-4] = uVar26;
          puVar13[-1] = uVar25;
          puVar13[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar13 = puVar13 + -8;
          puVar12 = puVar12 + -0x40;
        } while (puVar12 != (undefined1 *)0x0);
        if (puVar19 != puVar11) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar16 = puVar16 + -(long)puVar11;
            puVar7 = puVar7 + -(long)puVar11;
            goto code_r0x00024e50;
          }
          goto code_r0x000259c4;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x000259c4:
        puVar12 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar16 = puVar16 + -(long)puVar12;
        puVar13 = (undefined8 *)(puVar7 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar18));
        lVar15 = (long)puVar11 - (long)puVar12;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        puVar7 = puVar7 + -(long)puVar12;
        if (puVar19 != puVar12) goto code_r0x00024e50;
      }
      puVar7 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar14;
      unaff_x19[1] = (long)puVar10;
      unaff_x19[2] = (long)puVar5;
      if (puVar7 != (undefined1 *)0x0) goto code_r0x00024edc;
      unaff_x19[1] = (long)puVar10;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar10 < puVar16) goto code_r0x00024e80;
code_r0x00024cf8:
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar10 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if ((long)puVar5 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar12 = (undefined1 *)(((long)puVar16 - (long)puVar18) * 2);
      if (puVar12 <= puVar5) {
        puVar12 = puVar5;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar16 - (long)puVar18)) {
        puVar12 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar12 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar16 = puVar19 + 1;
        *puVar19 = 0;
        puVar12 = (undefined1 *)0x0;
        puVar7 = (undefined1 *)0x0;
        puVar5 = puVar19;
        if (puVar10 == puVar18) goto code_r0x00024f14;
code_r0x00024d44:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar14) < 0x40)) {
code_r0x00024d6c:
          do {
            puVar5 = puVar5 + -1;
            puVar10 = puVar10 + -1;
            *puVar5 = *puVar10;
          } while (puVar10 != puVar18);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar10 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
          puVar12 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar12 = puVar12 + -0x40;
          } while (puVar12 != (undefined1 *)0x0);
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar5 = puVar5 + -(long)puVar11;
              puVar10 = puVar10 + -(long)puVar11;
              goto code_r0x00024d6c;
            }
            goto code_r0x00025a48;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025a48:
          puVar12 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar5 = puVar5 + -(long)puVar12;
          puVar13 = (undefined8 *)(puVar10 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar18));
          lVar15 = (long)puVar11 - (long)puVar12;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar10 = puVar10 + -(long)puVar12;
          if (puVar19 != puVar12) goto code_r0x00024d6c;
        }
        puVar10 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar7;
        if (puVar10 == (undefined1 *)0x0) goto code_r0x00024e88;
      }
      else {
        lVar14 = __Znwm(puVar12);
        puVar5 = puVar19 + lVar14;
        puVar12 = puVar12 + lVar14;
        puVar16 = puVar5 + 1;
        *puVar5 = 0;
        puVar7 = puVar12;
        if (puVar10 != puVar18) goto code_r0x00024d44;
code_r0x00024f14:
        *unaff_x19 = (long)puVar5;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar12;
      }
      __ZdlPv(puVar10);
      unaff_x19[1] = (long)puVar16;
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar5 <= puVar16) goto code_r0x00024f34;
code_r0x00024e98:
      puVar5 = puVar16 + 1;
      *puVar16 = 0;
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar5 < puVar16) goto code_r0x00024fd8;
code_r0x00025034:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar5 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar16 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar16 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar16 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar5 == puVar19) goto code_r0x00025114;
code_r0x00025080:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x000250a8:
          do {
            puVar18 = puVar18 + -1;
            puVar5 = puVar5 + -1;
            *puVar18 = *puVar5;
          } while (puVar5 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar5 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar5 = puVar5 + -(long)puVar11;
              goto code_r0x000250a8;
            }
            goto code_r0x00025b50;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025b50:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar5 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar5 = puVar5 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x000250a8;
        }
        puVar5 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar10;
        if (puVar5 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar16;
          uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar16 < puVar5) goto code_r0x000250dc;
          goto code_r0x00025138;
        }
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar16 = puVar18 + 1;
        *puVar18 = 0;
        puVar10 = puVar7;
        if (puVar5 != puVar19) goto code_r0x00025080;
code_r0x00025114:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar5);
      unaff_x19[1] = (long)puVar16;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar5 <= puVar16) goto code_r0x00025138;
code_r0x000250dc:
      puVar5 = puVar16 + 1;
      *puVar16 = uVar20;
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar5 < puVar16) goto code_r0x000251dc;
code_r0x00025234:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar5 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar16 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar16 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar16 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar5 == puVar19) goto code_r0x00025310;
code_r0x00025280:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x000252a8:
          do {
            puVar18 = puVar18 + -1;
            puVar5 = puVar5 + -1;
            *puVar18 = *puVar5;
          } while (puVar5 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar5 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar5 = puVar5 + -(long)puVar11;
              goto code_r0x000252a8;
            }
            goto code_r0x00025c58;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025c58:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar5 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar5 = puVar5 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x000252a8;
        }
        puVar5 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar10;
        if (puVar5 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar16;
          puVar5 = (undefined1 *)unaff_x19[2];
          if (puVar16 < puVar5) goto code_r0x000252d8;
          goto code_r0x00025330;
        }
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar16 = puVar18 + 1;
        *puVar18 = 0;
        puVar10 = puVar7;
        if (puVar5 != puVar19) goto code_r0x00025280;
code_r0x00025310:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar5);
      unaff_x19[1] = (long)puVar16;
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar5 <= puVar16) goto code_r0x00025330;
code_r0x000252d8:
      puVar5 = puVar16 + 1;
      *puVar16 = 0;
      unaff_x19[1] = (long)puVar5;
      puVar16 = (undefined1 *)unaff_x19[2];
      if (puVar5 < puVar16) goto code_r0x000253d4;
code_r0x0002541c:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar12 = puVar5 + -(long)puVar19;
      puVar18 = puVar12 + 1;
      if ((long)puVar18 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar16 - (long)puVar19) * 2);
      if (puVar7 <= puVar18) {
        puVar7 = puVar18;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar16 - (long)puVar19)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar16 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar18 = puVar12;
        if (puVar5 == puVar19) goto code_r0x000254d0;
code_r0x00025468:
        if ((puVar12 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x00025490:
          do {
            puVar18 = puVar18 + -1;
            puVar5 = puVar5 + -1;
            *puVar18 = *puVar5;
          } while (puVar5 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar12) {
          puVar11 = (undefined1 *)((ulong)puVar12 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar5 + -0x20);
          puVar13 = (undefined8 *)(puVar12 + lVar14 + -0x20);
          puVar7 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar7 = puVar7 + -0x40;
          } while (puVar7 != (undefined1 *)0x0);
          if (puVar12 != puVar11) {
            if (((ulong)puVar12 & 0x38) == 0) {
              puVar18 = puVar18 + -(long)puVar11;
              puVar5 = puVar5 + -(long)puVar11;
              goto code_r0x00025490;
            }
            goto code_r0x00025d60;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025d60:
          puVar7 = (undefined1 *)((ulong)puVar12 & 0xfffffffffffffff8);
          puVar18 = puVar18 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar5 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar5 = puVar5 + -(long)puVar7;
          if (puVar12 != puVar7) goto code_r0x00025490;
        }
        puVar5 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar10;
        if (puVar5 == (undefined1 *)0x0) goto code_r0x000254e0;
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar18 = puVar12 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar16 = puVar18 + 1;
        *puVar18 = 0;
        puVar10 = puVar7;
        if (puVar5 != puVar19) goto code_r0x00025468;
code_r0x000254d0:
        *unaff_x19 = (long)puVar18;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar7;
      }
      __ZdlPv(puVar5);
    }
code_r0x000254e0:
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x19[1] = (long)puVar16;
    uVar20 = (undefined1)*(undefined4 *)(lVar17 + unaff_x25 * 0x10 + 8);
    if (puVar16 < (undefined1 *)unaff_x19[2]) {
      *puVar16 = uVar20;
      unaff_x19[1] = (long)(puVar16 + 1);
    }
    else {
      puVar18 = (undefined1 *)*unaff_x19;
      puVar19 = puVar16 + -(long)puVar18;
      puVar5 = puVar19 + 1;
      if ((long)puVar5 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar18;
      puVar12 = (undefined1 *)(uVar4 * 2);
      if (puVar12 <= puVar5) {
        puVar12 = puVar5;
      }
      if (0x3ffffffffffffffe < uVar4) {
        puVar12 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar12 == (undefined1 *)0x0) {
        lVar17 = 0;
        puVar10 = puVar19 + 1;
        *puVar19 = uVar20;
        puVar12 = (undefined1 *)0x0;
        puVar7 = (undefined1 *)0x0;
        puVar5 = puVar19;
        if (puVar16 == puVar18) goto code_r0x000255c0;
code_r0x00025558:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar17) < 0x40)) {
code_r0x00025580:
          do {
            puVar5 = puVar5 + -1;
            puVar16 = puVar16 + -1;
            *puVar5 = *puVar16;
          } while (puVar16 != puVar18);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar16 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar17 + -0x20);
          puVar12 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar13[1] = puVar9[1];
            *puVar13 = uVar23;
            puVar13[3] = uVar22;
            puVar13[2] = uVar21;
            puVar13[-3] = uVar27;
            puVar13[-4] = uVar26;
            puVar13[-1] = uVar25;
            puVar13[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar13 = puVar13 + -8;
            puVar12 = puVar12 + -0x40;
          } while (puVar12 != (undefined1 *)0x0);
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar5 = puVar5 + -(long)puVar11;
              puVar16 = puVar16 + -(long)puVar11;
              goto code_r0x00025580;
            }
            goto code_r0x00025de4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025de4:
          puVar12 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar5 = puVar5 + -(long)puVar12;
          puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar17 - (long)puVar18));
          lVar14 = (long)puVar11 - (long)puVar12;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar16 = puVar16 + -(long)puVar12;
          if (puVar19 != puVar12) goto code_r0x00025580;
        }
        puVar16 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar17;
        unaff_x19[1] = (long)puVar10;
        unaff_x19[2] = (long)puVar7;
        if (puVar16 != (undefined1 *)0x0) goto code_r0x000255c8;
      }
      else {
        lVar17 = __Znwm(puVar12);
        puVar5 = puVar19 + lVar17;
        puVar12 = puVar12 + lVar17;
        puVar10 = puVar5 + 1;
        *puVar5 = uVar20;
        puVar7 = puVar12;
        if (puVar16 != puVar18) goto code_r0x00025558;
code_r0x000255c0:
        *unaff_x19 = (long)puVar5;
        unaff_x19[1] = (long)puVar10;
        unaff_x19[2] = (long)puVar12;
code_r0x000255c8:
        __ZdlPv(puVar16);
      }
      unaff_x19[1] = (long)puVar10;
    }
    goto LAB_00024734;
  case 5:
    func_0x000262e0();
    goto LAB_00024734;
  case 6:
    lVar14 = *plVar1;
    lVar15 = *(long *)(lVar14 + 0x20);
    lVar17 = __dyld_get_image_header(0);
    if ((lVar15 != lVar17 + 0x4e8dec0) &&
       (uVar3 = (uint)*(byte *)(lVar14 + 6), *(byte *)(lVar14 + 6) != 0x1f)) {
      lVar15 = 0;
      lVar17 = 0;
      do {
        if ((*(uint *)(*(long *)(lVar14 + 0x20) + lVar15 + 0x1c) & 0xf) == 5) {
          func_0x000262e0();
          uVar3 = (uint)*(byte *)(lVar14 + 6);
        }
        lVar17 = lVar17 + 1;
        lVar15 = lVar15 + 0x20;
      } while (lVar17 < 1 << (ulong)(uVar3 & 0x1f));
    }
    goto LAB_00024734;
  case 7:
    break;
  }
  if (*(char *)(*plVar1 + 3) == '\0') {
    func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*plVar1 + 0x18));
    func_0x00026614();
    if (uStack0000000000000008 != 0) {
      in_stack_00000010 = uStack0000000000000008;
      __ZdlPv();
    }
    goto LAB_00024734;
  }
  puVar16 = (undefined1 *)unaff_x19[1];
  if (puVar16 < (undefined1 *)unaff_x19[2]) {
    *puVar16 = 0x43;
    unaff_x19[1] = (long)(puVar16 + 1);
    goto LAB_00024734;
  }
  puVar18 = (undefined1 *)*unaff_x19;
  puVar19 = puVar16 + -(long)puVar18;
  puVar5 = puVar19 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
    (*pcVar2)();
  }
  uVar4 = unaff_x19[2] - (long)puVar18;
  unaff_x21 = (undefined1 *)(uVar4 * 2);
  if (unaff_x21 <= puVar5) {
    unaff_x21 = puVar5;
  }
  if (unaff_x28 <= uVar4) {
    unaff_x21 = unaff_x27;
  }
  if (unaff_x21 == (undefined1 *)0x0) {
    param_2 = (undefined1 *)0x0;
    unaff_x24 = puVar19 + 1;
    *puVar19 = 0x43;
    puVar5 = puVar19;
    if (puVar16 != puVar18) goto code_r0x000255f4;
code_r0x00025618:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)unaff_x24;
    unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
    param_2 = puVar5;
joined_r0x00024a84:
    if (puVar16 != (undefined1 *)0x0) goto code_r0x00025fe0;
    goto LAB_00025fe8;
  }
  param_2 = (undefined1 *)__Znwm(unaff_x21);
  puVar5 = param_2 + (long)puVar19;
  unaff_x24 = puVar5 + 1;
  *puVar5 = 0x43;
  if (puVar16 == puVar18) goto code_r0x00025618;
code_r0x000255f4:
  puVar12 = puVar16;
  if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - (long)param_2) < 0x40))
  goto code_r0x00025fb8;
  if (puVar19 < &segment_command_00000020.vmsize) {
    puVar7 = (undefined1 *)0x0;
    goto code_r0x00025e68;
  }
  puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
  puVar9 = (undefined8 *)(puVar16 + -0x20);
  puVar13 = (undefined8 *)(param_2 + (long)puVar19 + -0x20);
  puVar12 = puVar7;
  do {
    uVar23 = *puVar9;
    uVar22 = puVar9[3];
    uVar21 = puVar9[2];
    uVar27 = puVar9[-3];
    uVar26 = puVar9[-4];
    uVar25 = puVar9[-1];
    uVar24 = puVar9[-2];
    puVar13[1] = puVar9[1];
    *puVar13 = uVar23;
    puVar13[3] = uVar22;
    puVar13[2] = uVar21;
    puVar13[-3] = uVar27;
    puVar13[-4] = uVar26;
    puVar13[-1] = uVar25;
    puVar13[-2] = uVar24;
    puVar9 = puVar9 + -8;
    puVar13 = puVar13 + -8;
    puVar12 = puVar12 + -0x40;
  } while (puVar12 != (undefined1 *)0x0);
  if (puVar19 != puVar7) {
    if (((ulong)puVar19 & 0x38) == 0) {
      puVar5 = puVar5 + -(long)puVar7;
      puVar12 = puVar16 + -(long)puVar7;
    }
    else {
code_r0x00025e68:
      puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar12 = puVar16 + -(long)puVar10;
      puVar5 = puVar5 + -(long)puVar10;
      puVar13 = (undefined8 *)(puVar16 + -(long)puVar7);
      puVar9 = (undefined8 *)(param_2 + ((long)puVar13 - (long)puVar18));
      lVar17 = (long)puVar7 - (long)puVar10;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar17 = lVar17 + 8;
      } while (lVar17 != 0);
      if (puVar19 == puVar10) goto LAB_00025fc8;
    }
code_r0x00025fb8:
    do {
      puVar5 = puVar5 + -1;
      puVar12 = puVar12 + -1;
      *puVar5 = *puVar12;
    } while (puVar12 != puVar18);
  }
  goto LAB_00025fc8;
code_r0x00025724:
  in_x10 = (undefined1 *)((ulong)unaff_x26 & 0xfffffffffffffff8);
  in_x11 = puVar16 + -(long)in_x10;
  param_1 = param_1 + -(long)in_x10;
  in_x12 = (undefined8 *)(param_2 + (long)(puVar16 + (-(long)unaff_x23 - (long)puVar5) + -8));
  in_x13 = (undefined8 *)(puVar16 + (-8 - (long)puVar5));
  in_x9 = (long)puVar5 - (long)in_x10;
  goto code_r0x00025748;
}

