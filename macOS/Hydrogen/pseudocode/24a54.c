
void FUN_00024a54(undefined1 *param_1,undefined1 *param_2)

{
  long *plVar1;
  code *pcVar2;
  undefined1 in_ZR;
  uint uVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  long unaff_x20;
  long lVar14;
  undefined1 *unaff_x21;
  long lVar15;
  undefined1 *unaff_x22;
  long lVar16;
  undefined1 *unaff_x23;
  undefined1 *puVar17;
  undefined1 *puVar18;
  undefined1 *unaff_x24;
  long unaff_x25;
  undefined1 *unaff_x26;
  undefined1 *puVar19;
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
  
code_r0x00024a54:
  if (!(bool)in_ZR) goto LAB_000255f4;
LAB_00025618:
  *unaff_x19 = (long)param_1;
  unaff_x19[1] = (long)unaff_x24;
  unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
  param_2 = param_1;
joined_r0x00025624:
  if (unaff_x22 != (undefined1 *)0x0) {
    __ZdlPv(param_2,unaff_x22);
  }
  unaff_x19[1] = (long)unaff_x24;
LAB_00024734:
  unaff_x25 = unaff_x25 + 1;
  if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
    if (0 < *(int *)(unaff_x20 + 0x8c)) {
      lVar16 = 0;
      do {
        func_0x000245c0(&uStack0000000000000008,
                        *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar16 * 8));
        func_0x00026614();
        if (uStack0000000000000008 != 0) {
          in_stack_00000010 = uStack0000000000000008;
          __ZdlPv();
        }
        lVar16 = lVar16 + 1;
      } while (lVar16 < *(int *)(unaff_x20 + 0x8c));
    }
    func_0x000262e0();
    return;
  }
  lVar16 = *(long *)(unaff_x20 + 8);
  plVar1 = (long *)(lVar16 + unaff_x25 * 0x10);
  switch(*(undefined4 *)((long)plVar1 + 0xc)) {
  case 0:
    unaff_x22 = (undefined1 *)unaff_x19[1];
    if (unaff_x22 < (undefined1 *)unaff_x19[2]) {
      *unaff_x22 = 0;
      unaff_x19[1] = (long)(unaff_x22 + 1);
      goto LAB_00024734;
    }
    puVar6 = (undefined1 *)*unaff_x19;
    puVar10 = unaff_x22 + -(long)puVar6;
    puVar12 = puVar10 + 1;
    if ((long)puVar12 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar4 = unaff_x19[2] - (long)puVar6;
    unaff_x21 = (undefined1 *)(uVar4 * 2);
    if (unaff_x21 <= puVar12) {
      unaff_x21 = puVar12;
    }
    if (unaff_x28 <= uVar4) {
      unaff_x21 = unaff_x27;
    }
    if (unaff_x21 == (undefined1 *)0x0) {
      param_2 = (undefined1 *)0x0;
      *puVar10 = 0;
      param_1 = puVar10;
    }
    else {
      param_2 = (undefined1 *)__Znwm(unaff_x21);
      param_1 = param_2 + (long)puVar10;
      *param_1 = 0;
    }
    unaff_x24 = param_1 + 1;
    if (unaff_x22 == puVar6) goto LAB_00025618;
    puVar12 = unaff_x22;
    if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - (long)param_2) < 0x40))
    goto code_r0x00025ed8;
    if (puVar10 < &segment_command_00000020.vmsize) {
      puVar19 = (undefined1 *)0x0;
      goto code_r0x000257ac;
    }
    puVar19 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
    puVar9 = (undefined8 *)(unaff_x22 + -0x20);
    puVar13 = (undefined8 *)(param_2 + (long)puVar10 + -0x20);
    puVar12 = puVar19;
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
    if (puVar10 == puVar19) goto code_r0x00025fc8;
    if (((ulong)puVar10 & 0x38) == 0) {
      param_1 = param_1 + -(long)puVar19;
      puVar12 = unaff_x22 + -(long)puVar19;
    }
    else {
code_r0x000257ac:
      puVar7 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
      puVar12 = unaff_x22 + -(long)puVar7;
      param_1 = param_1 + -(long)puVar7;
      puVar13 = (undefined8 *)(unaff_x22 + -(long)puVar19);
      puVar9 = (undefined8 *)(param_2 + ((long)puVar13 - (long)puVar6));
      lVar16 = (long)puVar19 - (long)puVar7;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar16 = lVar16 + 8;
      } while (lVar16 != 0);
      if (puVar10 == puVar7) goto code_r0x00025fc8;
    }
code_r0x00025ed8:
    do {
      param_1 = param_1 + -1;
      puVar12 = puVar12 + -1;
      *param_1 = *puVar12;
    } while (puVar12 != puVar6);
    goto code_r0x00025fc8;
  case 1:
    goto code_r0x0002481c;
  default:
    goto LAB_00024734;
  case 3:
    func_0x000262e0();
    goto LAB_00024734;
  case 4:
    puVar12 = (undefined1 *)unaff_x19[1];
    if (puVar12 < (undefined1 *)unaff_x19[2]) {
      puVar18 = puVar12 + 1;
      *puVar12 = 0;
    }
    else {
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar12 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar10;
      puVar7 = (undefined1 *)(uVar4 * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (0x3ffffffffffffffe < uVar4) {
        puVar7 = unaff_x27;
      }
      if (puVar7 == (undefined1 *)0x0) {
        puVar17 = (undefined1 *)0x0;
        puVar18 = puVar19 + 1;
        *puVar19 = 0;
        puVar6 = puVar19;
        if (puVar12 != puVar10) goto code_r0x000249b4;
code_r0x00024ae0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)(puVar17 + (long)puVar7);
      }
      else {
        puVar17 = (undefined1 *)__Znwm(puVar7);
        puVar6 = puVar17 + (long)puVar19;
        puVar18 = puVar6 + 1;
        *puVar6 = 0;
        if (puVar12 == puVar10) goto code_r0x00024ae0;
code_r0x000249b4:
        puVar11 = puVar12;
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - (long)puVar17) < 0x40))
        {
code_r0x00025ef8:
          do {
            puVar6 = puVar6 + -1;
            puVar11 = puVar11 + -1;
            *puVar6 = *puVar11;
          } while (puVar11 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar5 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar12 + -0x20);
          puVar13 = (undefined8 *)(puVar17 + (long)puVar19 + -0x20);
          puVar11 = puVar5;
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
          if (puVar19 != puVar5) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar5;
              puVar11 = puVar12 + -(long)puVar5;
              goto code_r0x00025ef8;
            }
            goto code_r0x00025834;
          }
        }
        else {
          puVar5 = (undefined1 *)0x0;
code_r0x00025834:
          puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar11 = puVar12 + -(long)puVar8;
          puVar6 = puVar6 + -(long)puVar8;
          puVar13 = (undefined8 *)(puVar12 + -(long)puVar5);
          puVar9 = (undefined8 *)(puVar17 + ((long)puVar13 - (long)puVar10));
          lVar14 = (long)puVar5 - (long)puVar8;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          if (puVar19 != puVar8) goto code_r0x00025ef8;
        }
        puVar12 = (undefined1 *)*unaff_x19;
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)(puVar17 + (long)puVar7);
        puVar6 = puVar17;
      }
      unaff_x28 = 0x3fffffffffffffff;
      if (puVar12 != (undefined1 *)0x0) {
        unaff_x28 = 0x3fffffffffffffff;
        __ZdlPv(puVar6,puVar12);
      }
    }
    unaff_x19[1] = (long)puVar18;
    if (puVar18 < (undefined1 *)unaff_x19[2]) {
      puVar17 = puVar18 + 1;
      *puVar18 = 0;
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar12 <= puVar17) goto code_r0x00024c2c;
LAB_00024bcc:
      puVar12 = puVar17 + 1;
      *puVar17 = 0;
      unaff_x19[1] = (long)puVar12;
      uVar20 = (undefined1)*plVar1;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar12) goto LAB_00024dd4;
LAB_00024cd8:
      puVar17 = puVar12 + 1;
      *puVar12 = uVar20;
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar17 < puVar12) goto LAB_00024e80;
LAB_00024cf8:
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar17 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar12 - (long)puVar10) * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar12 - (long)puVar10)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 != (undefined1 *)0x0) {
        lVar14 = __Znwm(puVar7);
        puVar12 = puVar19 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar18 = puVar12 + 1;
        *puVar12 = 0;
        puVar6 = puVar7;
        if (puVar17 == puVar10) goto LAB_00024f14;
code_r0x00024d44:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - lVar14) < 0x40)) {
LAB_00024d6c:
          do {
            puVar12 = puVar12 + -1;
            puVar17 = puVar17 + -1;
            *puVar12 = *puVar17;
          } while (puVar17 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
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
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar12 = puVar12 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto LAB_00024d6c;
            }
            goto code_r0x00025a48;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025a48:
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar12 = puVar12 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar10));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar17 = puVar17 + -(long)puVar7;
          if (puVar19 != puVar7) goto LAB_00024d6c;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar6;
        if (puVar17 != (undefined1 *)0x0) goto LAB_00024f1c;
        goto LAB_00024e88;
      }
      lVar14 = 0;
      puVar18 = puVar19 + 1;
      *puVar19 = 0;
      puVar7 = (undefined1 *)0x0;
      puVar6 = (undefined1 *)0x0;
      puVar12 = puVar19;
      if (puVar17 != puVar10) goto code_r0x00024d44;
LAB_00024f14:
      *unaff_x19 = (long)puVar12;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar7;
LAB_00024f1c:
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar18;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar18 < puVar12) goto code_r0x00024e98;
LAB_00024f34:
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar18 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar12 - (long)puVar10) * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar12 - (long)puVar10)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar12 = puVar19 + 1;
        *puVar19 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar17 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar18 != puVar10) goto LAB_00024f80;
LAB_00025014:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar7;
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar6 = puVar19 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar12 = puVar6 + 1;
        *puVar6 = 0;
        puVar17 = puVar7;
        if (puVar18 == puVar10) goto LAB_00025014;
LAB_00024f80:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - lVar14) < 0x40)) {
LAB_00024fa8:
          do {
            puVar6 = puVar6 + -1;
            puVar18 = puVar18 + -1;
            *puVar6 = *puVar18;
          } while (puVar18 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar18 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
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
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar18 = puVar18 + -(long)puVar11;
              goto LAB_00024fa8;
            }
            goto code_r0x00025acc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025acc:
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar18 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar10));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar18 = puVar18 + -(long)puVar7;
          if (puVar19 != puVar7) goto LAB_00024fa8;
        }
        puVar18 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar17;
        if (puVar18 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar12;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar6 <= puVar12) goto LAB_00025034;
          goto LAB_00024fd8;
        }
      }
      __ZdlPv(puVar18);
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar12 < puVar6) goto LAB_00024fd8;
LAB_00025034:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar7 = puVar12 + -(long)puVar19;
      puVar10 = puVar7 + 1;
      if ((long)puVar10 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar18 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar18 <= puVar10) {
        puVar18 = puVar10;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar18 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar18 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar17 = puVar7 + 1;
        *puVar7 = 0;
        puVar18 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar6 = puVar7;
        if (puVar12 != puVar19) goto LAB_00025080;
LAB_00025114:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar18;
LAB_0002511c:
        __ZdlPv(puVar12);
        unaff_x19[1] = (long)puVar17;
        uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
        puVar12 = (undefined1 *)unaff_x19[2];
        if (puVar12 <= puVar17) goto LAB_00025138;
        goto LAB_000250dc;
      }
      lVar14 = __Znwm(puVar18);
      puVar6 = puVar7 + lVar14;
      puVar18 = puVar18 + lVar14;
      puVar17 = puVar6 + 1;
      *puVar6 = 0;
      puVar10 = puVar18;
      if (puVar12 == puVar19) goto LAB_00025114;
LAB_00025080:
      if ((puVar7 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
LAB_000250a8:
        do {
          puVar6 = puVar6 + -1;
          puVar12 = puVar12 + -1;
          *puVar6 = *puVar12;
        } while (puVar12 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar7) {
        puVar11 = (undefined1 *)((ulong)puVar7 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar12 + -0x20);
        puVar13 = (undefined8 *)(puVar7 + lVar14 + -0x20);
        puVar18 = puVar11;
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
        if (puVar7 != puVar11) {
          if (((ulong)puVar7 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar11;
            puVar12 = puVar12 + -(long)puVar11;
            goto LAB_000250a8;
          }
          goto code_r0x00025b50;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x00025b50:
        puVar18 = (undefined1 *)((ulong)puVar7 & 0xfffffffffffffff8);
        puVar6 = puVar6 + -(long)puVar18;
        puVar13 = (undefined8 *)(puVar12 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
        lVar15 = (long)puVar11 - (long)puVar18;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        puVar12 = puVar12 + -(long)puVar18;
        if (puVar7 != puVar18) goto LAB_000250a8;
      }
      puVar12 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar14;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)puVar10;
      if (puVar12 != (undefined1 *)0x0) goto LAB_0002511c;
      unaff_x19[1] = (long)puVar17;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar17 < puVar12) goto LAB_000250dc;
LAB_00025138:
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar17 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar12 - (long)puVar10) * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar12 - (long)puVar10)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar12 = puVar19 + 1;
        *puVar19 = uVar20;
        puVar7 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar17 != puVar10) goto code_r0x00025184;
code_r0x00025214:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar7;
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar6 = puVar19 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar12 = puVar6 + 1;
        *puVar6 = uVar20;
        puVar18 = puVar7;
        if (puVar17 == puVar10) goto code_r0x00025214;
code_r0x00025184:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - lVar14) < 0x40)) {
LAB_000251ac:
          do {
            puVar6 = puVar6 + -1;
            puVar17 = puVar17 + -1;
            *puVar6 = *puVar17;
          } while (puVar17 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
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
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto LAB_000251ac;
            }
            goto code_r0x00025bd4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025bd4:
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar10));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar17 = puVar17 + -(long)puVar7;
          if (puVar19 != puVar7) goto LAB_000251ac;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar18;
        if (puVar17 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar12;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar6 <= puVar12) goto LAB_00025234;
          goto LAB_000251dc;
        }
      }
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar12 < puVar6) goto LAB_000251dc;
LAB_00025234:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar7 = puVar12 + -(long)puVar19;
      puVar10 = puVar7 + 1;
      if ((long)puVar10 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar18 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar18 <= puVar10) {
        puVar18 = puVar10;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar18 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar18 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar17 = puVar7 + 1;
        *puVar7 = 0;
        puVar18 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar6 = puVar7;
        if (puVar12 != puVar19) goto LAB_00025280;
LAB_00025310:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar18;
LAB_00025318:
        __ZdlPv(puVar12);
        unaff_x19[1] = (long)puVar17;
        puVar12 = (undefined1 *)unaff_x19[2];
        if (puVar12 <= puVar17) goto LAB_00025330;
        goto LAB_000252d8;
      }
      lVar14 = __Znwm(puVar18);
      puVar6 = puVar7 + lVar14;
      puVar18 = puVar18 + lVar14;
      puVar17 = puVar6 + 1;
      *puVar6 = 0;
      puVar10 = puVar18;
      if (puVar12 == puVar19) goto LAB_00025310;
LAB_00025280:
      if ((puVar7 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
LAB_000252a8:
        do {
          puVar6 = puVar6 + -1;
          puVar12 = puVar12 + -1;
          *puVar6 = *puVar12;
        } while (puVar12 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar7) {
        puVar11 = (undefined1 *)((ulong)puVar7 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar12 + -0x20);
        puVar13 = (undefined8 *)(puVar7 + lVar14 + -0x20);
        puVar18 = puVar11;
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
        if (puVar7 != puVar11) {
          if (((ulong)puVar7 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar11;
            puVar12 = puVar12 + -(long)puVar11;
            goto LAB_000252a8;
          }
          goto code_r0x00025c58;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x00025c58:
        puVar18 = (undefined1 *)((ulong)puVar7 & 0xfffffffffffffff8);
        puVar6 = puVar6 + -(long)puVar18;
        puVar13 = (undefined8 *)(puVar12 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
        lVar15 = (long)puVar11 - (long)puVar18;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        puVar12 = puVar12 + -(long)puVar18;
        if (puVar7 != puVar18) goto LAB_000252a8;
      }
      puVar12 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar14;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)puVar10;
      if (puVar12 != (undefined1 *)0x0) goto LAB_00025318;
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar17 < puVar12) goto LAB_000252d8;
LAB_00025330:
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar17 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar12 - (long)puVar10) * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar12 - (long)puVar10)) {
        puVar7 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar12 = puVar19 + 1;
        *puVar19 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar17 != puVar10) goto code_r0x0002537c;
LAB_000253fc:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar7;
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar6 = puVar19 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar12 = puVar6 + 1;
        *puVar6 = 0;
        puVar18 = puVar7;
        if (puVar17 == puVar10) goto LAB_000253fc;
code_r0x0002537c:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - lVar14) < 0x40)) {
code_r0x000253a4:
          do {
            puVar6 = puVar6 + -1;
            puVar17 = puVar17 + -1;
            *puVar6 = *puVar17;
          } while (puVar17 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
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
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto code_r0x000253a4;
            }
            goto code_r0x00025cdc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025cdc:
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar10));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar17 = puVar17 + -(long)puVar7;
          if (puVar19 != puVar7) goto code_r0x000253a4;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar18;
        if (puVar17 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar12;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar6 <= puVar12) goto LAB_0002541c;
          goto FUN_000253d4;
        }
      }
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar12 < puVar6) goto FUN_000253d4;
LAB_0002541c:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar7 = puVar12 + -(long)puVar19;
      puVar10 = puVar7 + 1;
      if ((long)puVar10 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar18 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar18 <= puVar10) {
        puVar18 = puVar10;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar18 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar18 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar17 = puVar7 + 1;
        *puVar7 = 0;
        puVar18 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar6 = puVar7;
        if (puVar12 != puVar19) goto code_r0x00025468;
code_r0x000254d0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar18;
code_r0x000254d8:
        __ZdlPv(puVar12);
      }
      else {
        lVar14 = __Znwm(puVar18);
        puVar6 = puVar7 + lVar14;
        puVar18 = puVar18 + lVar14;
        puVar17 = puVar6 + 1;
        *puVar6 = 0;
        puVar10 = puVar18;
        if (puVar12 == puVar19) goto code_r0x000254d0;
code_r0x00025468:
        if ((puVar7 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
code_r0x00025490:
          do {
            puVar6 = puVar6 + -1;
            puVar12 = puVar12 + -1;
            *puVar6 = *puVar12;
          } while (puVar12 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar7) {
          puVar11 = (undefined1 *)((ulong)puVar7 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar12 + -0x20);
          puVar13 = (undefined8 *)(puVar7 + lVar14 + -0x20);
          puVar18 = puVar11;
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
          if (puVar7 != puVar11) {
            if (((ulong)puVar7 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar12 = puVar12 + -(long)puVar11;
              goto code_r0x00025490;
            }
            goto code_r0x00025d60;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025d60:
          puVar18 = (undefined1 *)((ulong)puVar7 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar18;
          puVar13 = (undefined8 *)(puVar12 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
          lVar15 = (long)puVar11 - (long)puVar18;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar12 = puVar12 + -(long)puVar18;
          if (puVar7 != puVar18) goto code_r0x00025490;
        }
        puVar12 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar10;
        if (puVar12 != (undefined1 *)0x0) goto code_r0x000254d8;
      }
    }
    else {
      puVar6 = (undefined1 *)*unaff_x19;
      puVar10 = puVar18 + -(long)puVar6;
      puVar12 = puVar10 + 1;
      if ((long)puVar12 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar6;
      puVar19 = (undefined1 *)(uVar4 * 2);
      if (puVar19 <= puVar12) {
        puVar19 = puVar12;
      }
      if (unaff_x28 <= uVar4) {
        puVar19 = unaff_x27;
      }
      if (puVar19 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar17 = puVar10 + 1;
        *puVar10 = 0;
        puVar19 = (undefined1 *)0x0;
        puVar7 = (undefined1 *)0x0;
        puVar12 = puVar10;
        if (puVar18 != puVar6) goto code_r0x00024b74;
code_r0x00024c0c:
        *unaff_x19 = (long)puVar12;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar19;
      }
      else {
        lVar14 = __Znwm(puVar19);
        puVar12 = puVar10 + lVar14;
        puVar19 = puVar19 + lVar14;
        puVar17 = puVar12 + 1;
        *puVar12 = 0;
        puVar7 = puVar19;
        if (puVar18 == puVar6) goto code_r0x00024c0c;
code_r0x00024b74:
        if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar14) < 0x40)) {
code_r0x00024b9c:
          do {
            puVar12 = puVar12 + -1;
            puVar18 = puVar18 + -1;
            *puVar12 = *puVar18;
          } while (puVar18 != puVar6);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
          puVar11 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar18 + -0x20);
          puVar13 = (undefined8 *)(puVar10 + lVar14 + -0x20);
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
          if (puVar10 != puVar11) {
            if (((ulong)puVar10 & 0x38) == 0) {
              puVar12 = puVar12 + -(long)puVar11;
              puVar18 = puVar18 + -(long)puVar11;
              goto code_r0x00024b9c;
            }
            goto code_r0x000258bc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x000258bc:
          puVar19 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
          puVar12 = puVar12 + -(long)puVar19;
          puVar13 = (undefined8 *)(puVar18 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar6));
          lVar15 = (long)puVar11 - (long)puVar19;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar18 = puVar18 + -(long)puVar19;
          if (puVar10 != puVar19) goto code_r0x00024b9c;
        }
        puVar18 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar7;
        if (puVar18 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar17;
          puVar12 = (undefined1 *)unaff_x19[2];
          if (puVar17 < puVar12) goto LAB_00024bcc;
          goto code_r0x00024c2c;
        }
      }
      __ZdlPv(puVar18);
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar17 < puVar12) goto LAB_00024bcc;
code_r0x00024c2c:
      puVar10 = (undefined1 *)*unaff_x19;
      puVar19 = puVar17 + -(long)puVar10;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar7 = (undefined1 *)(((long)puVar12 - (long)puVar10) * 2);
      if (puVar7 <= puVar6) {
        puVar7 = puVar6;
      }
      if (unaff_x28 <= (ulong)((long)puVar12 - (long)puVar10)) {
        puVar7 = unaff_x27;
      }
      if (puVar7 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar12 = puVar19 + 1;
        *puVar19 = 0;
        puVar7 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar17 != puVar10) goto LAB_00024c78;
LAB_00024dac:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar7;
      }
      else {
        lVar14 = __Znwm(puVar7);
        puVar6 = puVar19 + lVar14;
        puVar7 = puVar7 + lVar14;
        puVar12 = puVar6 + 1;
        *puVar6 = 0;
        puVar18 = puVar7;
        if (puVar17 == puVar10) goto LAB_00024dac;
LAB_00024c78:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar10 - lVar14) < 0x40)) {
LAB_00024ca0:
          do {
            puVar6 = puVar6 + -1;
            puVar17 = puVar17 + -1;
            *puVar6 = *puVar17;
          } while (puVar17 != puVar10);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar19 + lVar14 + -0x20);
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
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto LAB_00024ca0;
            }
            goto code_r0x00025940;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025940:
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar7;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar10));
          lVar15 = (long)puVar11 - (long)puVar7;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar15 = lVar15 + 8;
          } while (lVar15 != 0);
          puVar17 = puVar17 + -(long)puVar7;
          if (puVar19 != puVar7) goto LAB_00024ca0;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar14;
        unaff_x19[1] = (long)puVar12;
        unaff_x19[2] = (long)puVar18;
        if (puVar17 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar12;
          uVar20 = (undefined1)*plVar1;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar6 <= puVar12) goto LAB_00024dd4;
          goto LAB_00024cd8;
        }
      }
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar12;
      uVar20 = (undefined1)*plVar1;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar12 < puVar6) goto LAB_00024cd8;
LAB_00024dd4:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar7 = puVar12 + -(long)puVar19;
      puVar10 = puVar7 + 1;
      if ((long)puVar10 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar18 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar18 <= puVar10) {
        puVar18 = puVar10;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar18 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar18 == (undefined1 *)0x0) {
        lVar14 = 0;
        puVar17 = puVar7 + 1;
        *puVar7 = uVar20;
        puVar18 = (undefined1 *)0x0;
        puVar10 = (undefined1 *)0x0;
        puVar6 = puVar7;
        if (puVar12 != puVar19) goto code_r0x00024e24;
LAB_00024ed0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar17;
        unaff_x19[2] = (long)puVar18;
LAB_00024edc:
        __ZdlPv(puVar12);
        unaff_x19[1] = (long)puVar17;
        puVar12 = (undefined1 *)unaff_x19[2];
        if (puVar17 < puVar12) goto LAB_00024e80;
        goto LAB_00024cf8;
      }
      lVar14 = __Znwm(puVar18);
      puVar6 = puVar7 + lVar14;
      puVar18 = puVar18 + lVar14;
      puVar17 = puVar6 + 1;
      *puVar6 = uVar20;
      puVar10 = puVar18;
      if (puVar12 == puVar19) goto LAB_00024ed0;
code_r0x00024e24:
      if ((puVar7 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar14) < 0x40)) {
LAB_00024e50:
        do {
          puVar6 = puVar6 + -1;
          puVar12 = puVar12 + -1;
          *puVar6 = *puVar12;
        } while (puVar12 != puVar19);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar7) {
        puVar11 = (undefined1 *)((ulong)puVar7 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar12 + -0x20);
        puVar13 = (undefined8 *)(puVar7 + lVar14 + -0x20);
        puVar18 = puVar11;
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
        if (puVar7 != puVar11) {
          if (((ulong)puVar7 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar11;
            puVar12 = puVar12 + -(long)puVar11;
            goto LAB_00024e50;
          }
          goto code_r0x000259c4;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x000259c4:
        puVar18 = (undefined1 *)((ulong)puVar7 & 0xfffffffffffffff8);
        puVar6 = puVar6 + -(long)puVar18;
        puVar13 = (undefined8 *)(puVar12 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar13 + (lVar14 - (long)puVar19));
        lVar15 = (long)puVar11 - (long)puVar18;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar15 = lVar15 + 8;
        } while (lVar15 != 0);
        puVar12 = puVar12 + -(long)puVar18;
        if (puVar7 != puVar18) goto LAB_00024e50;
      }
      puVar12 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar14;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)puVar10;
      if (puVar12 != (undefined1 *)0x0) goto LAB_00024edc;
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar12 <= puVar17) goto LAB_00024cf8;
LAB_00024e80:
      puVar18 = puVar17 + 1;
      *puVar17 = 0;
LAB_00024e88:
      unaff_x19[1] = (long)puVar18;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar12 <= puVar18) goto LAB_00024f34;
code_r0x00024e98:
      puVar12 = puVar18 + 1;
      *puVar18 = 0;
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar12) goto LAB_00025034;
LAB_00024fd8:
      puVar17 = puVar12 + 1;
      *puVar12 = 0;
      unaff_x19[1] = (long)puVar17;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar12 <= puVar17) goto LAB_00025138;
LAB_000250dc:
      puVar12 = puVar17 + 1;
      *puVar17 = uVar20;
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar12) goto LAB_00025234;
LAB_000251dc:
      puVar17 = puVar12 + 1;
      *puVar12 = 0;
      unaff_x19[1] = (long)puVar17;
      puVar12 = (undefined1 *)unaff_x19[2];
      if (puVar12 <= puVar17) goto LAB_00025330;
LAB_000252d8:
      puVar12 = puVar17 + 1;
      *puVar17 = 0;
      unaff_x19[1] = (long)puVar12;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar12) goto LAB_0002541c;
FUN_000253d4:
      puVar17 = puVar12 + 1;
      *puVar12 = 0;
    }
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x19[1] = (long)puVar17;
    uVar20 = (undefined1)*(undefined4 *)(lVar16 + unaff_x25 * 0x10 + 8);
    if (puVar17 < (undefined1 *)unaff_x19[2]) {
      *puVar17 = uVar20;
      unaff_x19[1] = (long)(puVar17 + 1);
    }
    else {
      puVar6 = (undefined1 *)*unaff_x19;
      puVar10 = puVar17 + -(long)puVar6;
      puVar12 = puVar10 + 1;
      if ((long)puVar12 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar4 = unaff_x19[2] - (long)puVar6;
      puVar19 = (undefined1 *)(uVar4 * 2);
      if (puVar19 <= puVar12) {
        puVar19 = puVar12;
      }
      if (0x3ffffffffffffffe < uVar4) {
        puVar19 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar19 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar18 = puVar10 + 1;
        *puVar10 = uVar20;
        puVar19 = (undefined1 *)0x0;
        puVar7 = (undefined1 *)0x0;
        puVar12 = puVar10;
        if (puVar17 != puVar6) goto LAB_00025558;
LAB_000255c0:
        *unaff_x19 = (long)puVar12;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar19;
LAB_000255c8:
        __ZdlPv(puVar17);
      }
      else {
        lVar16 = __Znwm(puVar19);
        puVar12 = puVar10 + lVar16;
        puVar19 = puVar19 + lVar16;
        puVar18 = puVar12 + 1;
        *puVar12 = uVar20;
        puVar7 = puVar19;
        if (puVar17 == puVar6) goto LAB_000255c0;
LAB_00025558:
        if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar16) < 0x40)) {
LAB_00025580:
          do {
            puVar12 = puVar12 + -1;
            puVar17 = puVar17 + -1;
            *puVar12 = *puVar17;
          } while (puVar17 != puVar6);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar10) {
          puVar11 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar10 + lVar16 + -0x20);
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
          if (puVar10 != puVar11) {
            if (((ulong)puVar10 & 0x38) == 0) {
              puVar12 = puVar12 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto LAB_00025580;
            }
            goto LAB_00025de4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
LAB_00025de4:
          puVar19 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
          puVar12 = puVar12 + -(long)puVar19;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar16 - (long)puVar6));
          lVar14 = (long)puVar11 - (long)puVar19;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar17 = puVar17 + -(long)puVar19;
          if (puVar10 != puVar19) goto LAB_00025580;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar7;
        if (puVar17 != (undefined1 *)0x0) goto LAB_000255c8;
      }
      unaff_x19[1] = (long)puVar18;
    }
    goto LAB_00024734;
  case 5:
    func_0x000262e0();
    goto LAB_00024734;
  case 6:
    lVar14 = *plVar1;
    lVar15 = *(long *)(lVar14 + 0x20);
    lVar16 = __dyld_get_image_header(0);
    if ((lVar15 != lVar16 + 0x4e8dec0) &&
       (uVar3 = (uint)*(byte *)(lVar14 + 6), *(byte *)(lVar14 + 6) != 0x1f)) {
      lVar15 = 0;
      lVar16 = 0;
      do {
        if ((*(uint *)(*(long *)(lVar14 + 0x20) + lVar15 + 0x1c) & 0xf) == 5) {
          func_0x000262e0();
          uVar3 = (uint)*(byte *)(lVar14 + 6);
        }
        lVar16 = lVar16 + 1;
        lVar15 = lVar15 + 0x20;
      } while (lVar16 < 1 << (ulong)(uVar3 & 0x1f));
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
  unaff_x22 = (undefined1 *)unaff_x19[1];
  if (unaff_x22 < (undefined1 *)unaff_x19[2]) {
    *unaff_x22 = 0x43;
    unaff_x19[1] = (long)(unaff_x22 + 1);
    goto LAB_00024734;
  }
  unaff_x23 = (undefined1 *)*unaff_x19;
  param_1 = unaff_x22 + -(long)unaff_x23;
  puVar12 = param_1 + 1;
  if ((long)puVar12 < 0) {
    func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
    (*pcVar2)();
  }
  uVar4 = unaff_x19[2] - (long)unaff_x23;
  unaff_x21 = (undefined1 *)(uVar4 * 2);
  if (unaff_x21 <= puVar12) {
    unaff_x21 = puVar12;
  }
  if (unaff_x28 <= uVar4) {
    unaff_x21 = unaff_x27;
  }
  unaff_x26 = param_1;
  if (unaff_x21 != (undefined1 *)0x0) {
    param_2 = (undefined1 *)__Znwm(unaff_x21);
    param_1 = param_2 + (long)param_1;
    unaff_x24 = param_1 + 1;
    *param_1 = 0x43;
    in_ZR = unaff_x22 == unaff_x23;
    goto code_r0x00024a54;
  }
  param_2 = (undefined1 *)0x0;
  unaff_x24 = param_1 + 1;
  *param_1 = 0x43;
  if (unaff_x22 == unaff_x23) goto LAB_00025618;
LAB_000255f4:
  puVar12 = unaff_x22;
  if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < unaff_x26) &&
     (0x3f < (ulong)((long)unaff_x23 - (long)param_2))) {
    if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x26) {
      puVar6 = (undefined1 *)((ulong)unaff_x26 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(unaff_x22 + -0x20);
      puVar13 = (undefined8 *)(param_2 + (long)unaff_x26 + -0x20);
      puVar12 = puVar6;
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
      if (unaff_x26 == puVar6) goto code_r0x00025fc8;
      if (((ulong)unaff_x26 & 0x38) == 0) {
        param_1 = param_1 + -(long)puVar6;
        puVar12 = unaff_x22 + -(long)puVar6;
        goto code_r0x00025fb8;
      }
    }
    else {
      puVar6 = (undefined1 *)0x0;
    }
    puVar10 = (undefined1 *)((ulong)unaff_x26 & 0xfffffffffffffff8);
    puVar12 = unaff_x22 + -(long)puVar10;
    param_1 = param_1 + -(long)puVar10;
    puVar13 = (undefined8 *)(unaff_x22 + -(long)puVar6);
    puVar9 = (undefined8 *)(param_2 + ((long)puVar13 - (long)unaff_x23));
    lVar16 = (long)puVar6 - (long)puVar10;
    do {
      puVar13 = puVar13 + -1;
      puVar9 = puVar9 + -1;
      *puVar9 = *puVar13;
      lVar16 = lVar16 + 8;
    } while (lVar16 != 0);
    if (unaff_x26 == puVar10) goto code_r0x00025fc8;
  }
code_r0x00025fb8:
  do {
    param_1 = param_1 + -1;
    puVar12 = puVar12 + -1;
    *param_1 = *puVar12;
  } while (puVar12 != unaff_x23);
code_r0x00025fc8:
  unaff_x22 = (undefined1 *)*unaff_x19;
  *unaff_x19 = (long)param_2;
  unaff_x19[1] = (long)unaff_x24;
  unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
  goto joined_r0x00025624;
code_r0x0002481c:
  unaff_x22 = (undefined1 *)unaff_x19[1];
  uVar20 = (undefined1)*plVar1;
  if (unaff_x22 < (undefined1 *)unaff_x19[2]) {
    *unaff_x22 = uVar20;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x19[1] = (long)(unaff_x22 + 1);
    goto LAB_00024734;
  }
  puVar6 = (undefined1 *)*unaff_x19;
  puVar10 = unaff_x22 + -(long)puVar6;
  puVar12 = puVar10 + 1;
  if ((long)puVar12 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  uVar4 = unaff_x19[2] - (long)puVar6;
  unaff_x21 = (undefined1 *)(uVar4 * 2);
  if (unaff_x21 <= puVar12) {
    unaff_x21 = puVar12;
  }
  if (unaff_x28 <= uVar4) {
    unaff_x21 = (undefined1 *)0x7fffffffffffffff;
  }
  if (unaff_x21 == (undefined1 *)0x0) {
    param_2 = (undefined1 *)0x0;
    *puVar10 = uVar20;
    puVar12 = puVar10;
  }
  else {
    param_2 = (undefined1 *)__Znwm(unaff_x21);
    puVar12 = param_2 + (long)puVar10;
    *puVar12 = uVar20;
  }
  unaff_x24 = puVar12 + 1;
  if (unaff_x22 == puVar6) {
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    *unaff_x19 = (long)puVar12;
    unaff_x19[1] = (long)unaff_x24;
    unaff_x19[2] = (long)(param_2 + (long)unaff_x21);
    param_2 = puVar12;
    goto joined_r0x00025624;
  }
  unaff_x27 = (undefined1 *)0x7fffffffffffffff;
  puVar19 = unaff_x22;
  if ((puVar10 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - (long)param_2) < 0x40))
  goto code_r0x00025eb8;
  if (puVar10 < &segment_command_00000020.vmsize) {
    puVar7 = (undefined1 *)0x0;
    goto code_r0x00025724;
  }
  puVar7 = (undefined1 *)((ulong)puVar10 & 0xffffffffffffffc0);
  puVar9 = (undefined8 *)(unaff_x22 + -0x20);
  puVar13 = (undefined8 *)(param_2 + (long)puVar10 + -0x20);
  puVar19 = puVar7;
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
  if (puVar10 != puVar7) {
    if (((ulong)puVar10 & 0x38) == 0) {
      puVar12 = puVar12 + -(long)puVar7;
      puVar19 = unaff_x22 + -(long)puVar7;
    }
    else {
code_r0x00025724:
      puVar18 = (undefined1 *)((ulong)puVar10 & 0xfffffffffffffff8);
      puVar19 = unaff_x22 + -(long)puVar18;
      puVar12 = puVar12 + -(long)puVar18;
      puVar13 = (undefined8 *)(unaff_x22 + -(long)puVar7);
      puVar9 = (undefined8 *)(param_2 + ((long)puVar13 - (long)puVar6));
      lVar16 = (long)puVar7 - (long)puVar18;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar16 = lVar16 + 8;
      } while (lVar16 != 0);
      if (puVar10 == puVar18) goto code_r0x00025fc8;
    }
code_r0x00025eb8:
    do {
      puVar12 = puVar12 + -1;
      puVar19 = puVar19 + -1;
      *puVar12 = *puVar19;
    } while (puVar19 != puVar6);
  }
  goto code_r0x00025fc8;
}

