
void FUN_00024838(void)

{
  long *plVar1;
  code *pcVar2;
  undefined1 *puVar3;
  uint uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined8 *puVar12;
  long *unaff_x19;
  long unaff_x20;
  long lVar13;
  long lVar14;
  undefined1 *unaff_x22;
  undefined1 *puVar15;
  long lVar16;
  undefined1 *puVar17;
  undefined1 *puVar18;
  long unaff_x25;
  undefined1 *puVar19;
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
  
code_r0x00024838:
  unaff_x19[1] = (long)unaff_x22;
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
    puVar15 = (undefined1 *)unaff_x19[1];
    if (puVar15 < (undefined1 *)unaff_x19[2]) {
      *puVar15 = 0;
      unaff_x19[1] = (long)(puVar15 + 1);
      goto LAB_00024734;
    }
    puVar17 = (undefined1 *)*unaff_x19;
    puVar19 = puVar15 + -(long)puVar17;
    puVar6 = puVar19 + 1;
    if ((long)puVar6 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar5 = unaff_x19[2] - (long)puVar17;
    puVar8 = (undefined1 *)(uVar5 * 2);
    if (puVar8 <= puVar6) {
      puVar8 = puVar6;
    }
    if (unaff_x28 <= uVar5) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      puVar3 = (undefined1 *)0x0;
      *puVar19 = 0;
      puVar6 = puVar19;
    }
    else {
      puVar3 = (undefined1 *)__Znwm(puVar8);
      puVar6 = puVar3 + (long)puVar19;
      *puVar6 = 0;
    }
    puVar18 = puVar6 + 1;
    if (puVar15 == puVar17) {
code_r0x00025618:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)(puVar3 + (long)puVar8);
      goto joined_r0x00025fdc;
    }
    puVar11 = puVar15;
    if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar19) &&
       (0x3f < (ulong)((long)puVar17 - (long)puVar3))) {
      if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar15 + -0x20);
        puVar12 = (undefined8 *)(puVar3 + (long)puVar19 + -0x20);
        puVar11 = puVar7;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar12[1] = puVar9[1];
          *puVar12 = uVar23;
          puVar12[3] = uVar22;
          puVar12[2] = uVar21;
          puVar12[-3] = uVar27;
          puVar12[-4] = uVar26;
          puVar12[-1] = uVar25;
          puVar12[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar12 = puVar12 + -8;
          puVar11 = puVar11 + -0x40;
        } while (puVar11 != (undefined1 *)0x0);
        if (puVar19 == puVar7) break;
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar6 = puVar6 + -(long)puVar7;
          puVar11 = puVar15 + -(long)puVar7;
          goto code_r0x00025ed8;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
      }
      puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar11 = puVar15 + -(long)puVar10;
      puVar6 = puVar6 + -(long)puVar10;
      puVar12 = (undefined8 *)(puVar15 + -(long)puVar7);
      puVar9 = (undefined8 *)(puVar3 + ((long)puVar12 - (long)puVar17));
      lVar16 = (long)puVar7 - (long)puVar10;
      do {
        puVar12 = puVar12 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar12;
        lVar16 = lVar16 + 8;
      } while (lVar16 != 0);
      if (puVar19 == puVar10) break;
    }
code_r0x00025ed8:
    do {
      puVar6 = puVar6 + -1;
      puVar11 = puVar11 + -1;
      *puVar6 = *puVar11;
    } while (puVar11 != puVar17);
    break;
  case 1:
    goto code_r0x0002481c;
  default:
    goto LAB_00024734;
  case 3:
    func_0x000262e0();
    goto LAB_00024734;
  case 4:
    puVar15 = (undefined1 *)unaff_x19[1];
    if (puVar15 < (undefined1 *)unaff_x19[2]) {
      puVar18 = puVar15 + 1;
      *puVar15 = 0;
    }
    else {
      puVar17 = (undefined1 *)*unaff_x19;
      puVar19 = puVar15 + -(long)puVar17;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar17;
      puVar8 = (undefined1 *)(uVar5 * 2);
      if (puVar8 <= puVar6) {
        puVar8 = puVar6;
      }
      if (0x3ffffffffffffffe < uVar5) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        puVar3 = (undefined1 *)0x0;
        puVar18 = puVar19 + 1;
        *puVar19 = 0;
        puVar6 = puVar19;
        if (puVar15 == puVar17) goto code_r0x00024ae0;
code_r0x000249b4:
        puVar11 = puVar15;
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - (long)puVar3) < 0x40)) {
code_r0x00025ef8:
          do {
            puVar6 = puVar6 + -1;
            puVar11 = puVar11 + -1;
            *puVar6 = *puVar11;
          } while (puVar11 != puVar17);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar3 + (long)puVar19 + -0x20);
          puVar11 = puVar7;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar11 = puVar11 + -0x40;
          } while (puVar11 != (undefined1 *)0x0);
          if (puVar19 != puVar7) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar7;
              puVar11 = puVar15 + -(long)puVar7;
              goto code_r0x00025ef8;
            }
            goto code_r0x00025834;
          }
        }
        else {
          puVar7 = (undefined1 *)0x0;
code_r0x00025834:
          puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar11 = puVar15 + -(long)puVar10;
          puVar6 = puVar6 + -(long)puVar10;
          puVar12 = (undefined8 *)(puVar15 + -(long)puVar7);
          puVar9 = (undefined8 *)(puVar3 + ((long)puVar12 - (long)puVar17));
          lVar13 = (long)puVar7 - (long)puVar10;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar13 = lVar13 + 8;
          } while (lVar13 != 0);
          if (puVar19 != puVar10) goto code_r0x00025ef8;
        }
        puVar15 = (undefined1 *)*unaff_x19;
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)(puVar3 + (long)puVar8);
      }
      else {
        puVar3 = (undefined1 *)__Znwm(puVar8);
        puVar6 = puVar3 + (long)puVar19;
        puVar18 = puVar6 + 1;
        *puVar6 = 0;
        if (puVar15 != puVar17) goto code_r0x000249b4;
code_r0x00024ae0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)(puVar3 + (long)puVar8);
        puVar3 = puVar6;
      }
      unaff_x28 = 0x3fffffffffffffff;
      if (puVar15 != (undefined1 *)0x0) {
        unaff_x28 = 0x3fffffffffffffff;
        __ZdlPv(puVar3,puVar15);
      }
    }
    unaff_x19[1] = (long)puVar18;
    if (puVar18 < (undefined1 *)unaff_x19[2]) {
      puVar3 = puVar18 + 1;
      *puVar18 = 0;
      unaff_x19[1] = (long)puVar3;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar3 < puVar15) goto code_r0x00024bcc;
LAB_00024c2c:
      puVar17 = (undefined1 *)*unaff_x19;
      puVar19 = puVar3 + -(long)puVar17;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar15 - (long)puVar17) * 2);
      if (puVar8 <= puVar6) {
        puVar8 = puVar6;
      }
      if (unaff_x28 <= (ulong)((long)puVar15 - (long)puVar17)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 != (undefined1 *)0x0) {
        lVar13 = __Znwm(puVar8);
        puVar15 = puVar19 + lVar13;
        puVar8 = puVar8 + lVar13;
        puVar18 = puVar15 + 1;
        *puVar15 = 0;
        puVar6 = puVar8;
        if (puVar3 != puVar17) goto code_r0x00024c78;
code_r0x00024dac:
        *unaff_x19 = (long)puVar15;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar8;
code_r0x00024db8:
        __ZdlPv(puVar3);
        unaff_x19[1] = (long)puVar18;
        uVar20 = (undefined1)*plVar1;
        puVar15 = (undefined1 *)unaff_x19[2];
        if (puVar18 < puVar15) goto LAB_00024cd8;
        goto LAB_00024dd4;
      }
      lVar13 = 0;
      puVar18 = puVar19 + 1;
      *puVar19 = 0;
      puVar8 = (undefined1 *)0x0;
      puVar6 = (undefined1 *)0x0;
      puVar15 = puVar19;
      if (puVar3 == puVar17) goto code_r0x00024dac;
code_r0x00024c78:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar13) < 0x40)) {
code_r0x00024ca0:
        do {
          puVar15 = puVar15 + -1;
          puVar3 = puVar3 + -1;
          *puVar15 = *puVar3;
        } while (puVar3 != puVar17);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar3 + -0x20);
        puVar12 = (undefined8 *)(puVar19 + lVar13 + -0x20);
        puVar8 = puVar11;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar12[1] = puVar9[1];
          *puVar12 = uVar23;
          puVar12[3] = uVar22;
          puVar12[2] = uVar21;
          puVar12[-3] = uVar27;
          puVar12[-4] = uVar26;
          puVar12[-1] = uVar25;
          puVar12[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar12 = puVar12 + -8;
          puVar8 = puVar8 + -0x40;
        } while (puVar8 != (undefined1 *)0x0);
        if (puVar19 != puVar11) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar15 = puVar15 + -(long)puVar11;
            puVar3 = puVar3 + -(long)puVar11;
            goto code_r0x00024ca0;
          }
          goto code_r0x00025940;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x00025940:
        puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar15 = puVar15 + -(long)puVar8;
        puVar12 = (undefined8 *)(puVar3 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar17));
        lVar14 = (long)puVar11 - (long)puVar8;
        do {
          puVar12 = puVar12 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar12;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar3 = puVar3 + -(long)puVar8;
        if (puVar19 != puVar8) goto code_r0x00024ca0;
      }
      puVar3 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar13;
      unaff_x19[1] = (long)puVar18;
      unaff_x19[2] = (long)puVar6;
      if (puVar3 != (undefined1 *)0x0) goto code_r0x00024db8;
      unaff_x19[1] = (long)puVar18;
      uVar20 = (undefined1)*plVar1;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar18) goto LAB_00024dd4;
LAB_00024cd8:
      puVar3 = puVar18 + 1;
      *puVar18 = uVar20;
      unaff_x19[1] = (long)puVar3;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar3) goto code_r0x00024cf8;
code_r0x00024e80:
      puVar15 = puVar3 + 1;
      *puVar3 = 0;
code_r0x00024e88:
      unaff_x19[1] = (long)puVar15;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar15 < puVar6) goto code_r0x00024e98;
code_r0x00024f34:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar15 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar6 = puVar8 + 1;
        *puVar8 = 0;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar15 == puVar19) goto code_r0x00025014;
code_r0x00024f80:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x00024fa8:
          do {
            puVar17 = puVar17 + -1;
            puVar15 = puVar15 + -1;
            *puVar17 = *puVar15;
          } while (puVar15 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar15 = puVar15 + -(long)puVar11;
              goto code_r0x00024fa8;
            }
            goto code_r0x00025acc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025acc:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar15 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar15 = puVar15 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x00024fa8;
        }
        puVar15 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar18;
        if (puVar15 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar15 = (undefined1 *)unaff_x19[2];
          if (puVar6 < puVar15) goto code_r0x00024fd8;
          goto code_r0x00025034;
        }
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar6 = puVar17 + 1;
        *puVar17 = 0;
        puVar18 = puVar3;
        if (puVar15 != puVar19) goto code_r0x00024f80;
code_r0x00025014:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar15);
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar6) goto code_r0x00025034;
code_r0x00024fd8:
      puVar15 = puVar6 + 1;
      *puVar6 = 0;
      unaff_x19[1] = (long)puVar15;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar15 < puVar6) goto code_r0x000250dc;
code_r0x00025138:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar15 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar6 = puVar8 + 1;
        *puVar8 = uVar20;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar15 == puVar19) goto LAB_00025214;
code_r0x00025184:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x000251ac:
          do {
            puVar17 = puVar17 + -1;
            puVar15 = puVar15 + -1;
            *puVar17 = *puVar15;
          } while (puVar15 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar15 = puVar15 + -(long)puVar11;
              goto code_r0x000251ac;
            }
            goto code_r0x00025bd4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025bd4:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar15 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar15 = puVar15 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x000251ac;
        }
        puVar15 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar18;
        if (puVar15 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar15 = (undefined1 *)unaff_x19[2];
          if (puVar6 < puVar15) goto code_r0x000251dc;
          goto code_r0x00025234;
        }
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar6 = puVar17 + 1;
        *puVar17 = uVar20;
        puVar18 = puVar3;
        if (puVar15 != puVar19) goto code_r0x00025184;
LAB_00025214:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar15);
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar6) goto code_r0x00025234;
code_r0x000251dc:
      puVar15 = puVar6 + 1;
      *puVar6 = 0;
      unaff_x19[1] = (long)puVar15;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar15 < puVar6) goto code_r0x000252d8;
code_r0x00025330:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar15 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar6 = puVar8 + 1;
        *puVar8 = 0;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar15 == puVar19) goto code_r0x000253fc;
code_r0x0002537c:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x000253a4:
          do {
            puVar17 = puVar17 + -1;
            puVar15 = puVar15 + -1;
            *puVar17 = *puVar15;
          } while (puVar15 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar15 = puVar15 + -(long)puVar11;
              goto code_r0x000253a4;
            }
            goto code_r0x00025cdc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025cdc:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar15 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar15 = puVar15 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x000253a4;
        }
        puVar15 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar18;
        if (puVar15 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar15 = (undefined1 *)unaff_x19[2];
          if (puVar6 < puVar15) goto code_r0x000253d4;
          goto code_r0x0002541c;
        }
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar6 = puVar17 + 1;
        *puVar17 = 0;
        puVar18 = puVar3;
        if (puVar15 != puVar19) goto code_r0x0002537c;
code_r0x000253fc:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar15);
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar6) goto code_r0x0002541c;
code_r0x000253d4:
      puVar15 = puVar6 + 1;
      *puVar6 = 0;
    }
    else {
      puVar6 = (undefined1 *)*unaff_x19;
      puVar17 = puVar18 + -(long)puVar6;
      puVar15 = puVar17 + 1;
      if ((long)puVar15 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar6;
      puVar19 = (undefined1 *)(uVar5 * 2);
      if (puVar19 <= puVar15) {
        puVar19 = puVar15;
      }
      if (unaff_x28 <= uVar5) {
        puVar19 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar19 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar3 = puVar17 + 1;
        *puVar17 = 0;
        puVar19 = (undefined1 *)0x0;
        puVar8 = (undefined1 *)0x0;
        puVar15 = puVar17;
        if (puVar18 == puVar6) goto LAB_00024c0c;
code_r0x00024b74:
        if ((puVar17 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar6 - lVar13) < 0x40)) {
LAB_00024b9c:
          do {
            puVar15 = puVar15 + -1;
            puVar18 = puVar18 + -1;
            *puVar15 = *puVar18;
          } while (puVar18 != puVar6);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar17) {
          puVar11 = (undefined1 *)((ulong)puVar17 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar18 + -0x20);
          puVar12 = (undefined8 *)(puVar17 + lVar13 + -0x20);
          puVar19 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar19 = puVar19 + -0x40;
          } while (puVar19 != (undefined1 *)0x0);
          if (puVar17 != puVar11) {
            if (((ulong)puVar17 & 0x38) == 0) {
              puVar15 = puVar15 + -(long)puVar11;
              puVar18 = puVar18 + -(long)puVar11;
              goto LAB_00024b9c;
            }
            goto code_r0x000258bc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x000258bc:
          puVar19 = (undefined1 *)((ulong)puVar17 & 0xfffffffffffffff8);
          puVar15 = puVar15 + -(long)puVar19;
          puVar12 = (undefined8 *)(puVar18 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar6));
          lVar14 = (long)puVar11 - (long)puVar19;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar18 = puVar18 + -(long)puVar19;
          if (puVar17 != puVar19) goto LAB_00024b9c;
        }
        puVar18 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar3;
        unaff_x19[2] = (long)puVar8;
        if (puVar18 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar3;
          puVar15 = (undefined1 *)unaff_x19[2];
          if (puVar15 <= puVar3) goto LAB_00024c2c;
          goto code_r0x00024bcc;
        }
      }
      else {
        lVar13 = __Znwm(puVar19);
        puVar15 = puVar17 + lVar13;
        puVar19 = puVar19 + lVar13;
        puVar3 = puVar15 + 1;
        *puVar15 = 0;
        puVar8 = puVar19;
        if (puVar18 != puVar6) goto code_r0x00024b74;
LAB_00024c0c:
        *unaff_x19 = (long)puVar15;
        unaff_x19[1] = (long)puVar3;
        unaff_x19[2] = (long)puVar19;
      }
      __ZdlPv(puVar18);
      unaff_x19[1] = (long)puVar3;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar15 <= puVar3) goto LAB_00024c2c;
code_r0x00024bcc:
      puVar18 = puVar3 + 1;
      *puVar3 = 0;
      unaff_x19[1] = (long)puVar18;
      uVar20 = (undefined1)*plVar1;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar18 < puVar15) goto LAB_00024cd8;
LAB_00024dd4:
      puVar17 = (undefined1 *)*unaff_x19;
      puVar19 = puVar18 + -(long)puVar17;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar15 - (long)puVar17) * 2);
      if (puVar8 <= puVar6) {
        puVar8 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar15 - (long)puVar17)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 != (undefined1 *)0x0) {
        lVar13 = __Znwm(puVar8);
        puVar15 = puVar19 + lVar13;
        puVar8 = puVar8 + lVar13;
        puVar3 = puVar15 + 1;
        *puVar15 = uVar20;
        puVar6 = puVar8;
        if (puVar18 != puVar17) goto code_r0x00024e24;
code_r0x00024ed0:
        *unaff_x19 = (long)puVar15;
        unaff_x19[1] = (long)puVar3;
        unaff_x19[2] = (long)puVar8;
code_r0x00024edc:
        __ZdlPv(puVar18);
        unaff_x19[1] = (long)puVar3;
        puVar15 = (undefined1 *)unaff_x19[2];
        if (puVar15 <= puVar3) goto code_r0x00024cf8;
        goto code_r0x00024e80;
      }
      lVar13 = 0;
      puVar3 = puVar19 + 1;
      *puVar19 = uVar20;
      puVar8 = (undefined1 *)0x0;
      puVar6 = (undefined1 *)0x0;
      puVar15 = puVar19;
      if (puVar18 == puVar17) goto code_r0x00024ed0;
code_r0x00024e24:
      if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar13) < 0x40)) {
code_r0x00024e50:
        do {
          puVar15 = puVar15 + -1;
          puVar18 = puVar18 + -1;
          *puVar15 = *puVar18;
        } while (puVar18 != puVar17);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar18 + -0x20);
        puVar12 = (undefined8 *)(puVar19 + lVar13 + -0x20);
        puVar8 = puVar11;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar12[1] = puVar9[1];
          *puVar12 = uVar23;
          puVar12[3] = uVar22;
          puVar12[2] = uVar21;
          puVar12[-3] = uVar27;
          puVar12[-4] = uVar26;
          puVar12[-1] = uVar25;
          puVar12[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar12 = puVar12 + -8;
          puVar8 = puVar8 + -0x40;
        } while (puVar8 != (undefined1 *)0x0);
        if (puVar19 != puVar11) {
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar15 = puVar15 + -(long)puVar11;
            puVar18 = puVar18 + -(long)puVar11;
            goto code_r0x00024e50;
          }
          goto code_r0x000259c4;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
code_r0x000259c4:
        puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar15 = puVar15 + -(long)puVar8;
        puVar12 = (undefined8 *)(puVar18 + -(long)puVar11);
        puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar17));
        lVar14 = (long)puVar11 - (long)puVar8;
        do {
          puVar12 = puVar12 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar12;
          lVar14 = lVar14 + 8;
        } while (lVar14 != 0);
        puVar18 = puVar18 + -(long)puVar8;
        if (puVar19 != puVar8) goto code_r0x00024e50;
      }
      puVar18 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar13;
      unaff_x19[1] = (long)puVar3;
      unaff_x19[2] = (long)puVar6;
      if (puVar18 != (undefined1 *)0x0) goto code_r0x00024edc;
      unaff_x19[1] = (long)puVar3;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar3 < puVar15) goto code_r0x00024e80;
code_r0x00024cf8:
      puVar17 = (undefined1 *)*unaff_x19;
      puVar19 = puVar3 + -(long)puVar17;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar15 - (long)puVar17) * 2);
      if (puVar8 <= puVar6) {
        puVar8 = puVar6;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar15 - (long)puVar17)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar15 = puVar19 + 1;
        *puVar19 = 0;
        puVar8 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar3 == puVar17) goto code_r0x00024f14;
code_r0x00024d44:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar13) < 0x40)) {
code_r0x00024d6c:
          do {
            puVar6 = puVar6 + -1;
            puVar3 = puVar3 + -1;
            *puVar6 = *puVar3;
          } while (puVar3 != puVar17);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar3 + -0x20);
          puVar12 = (undefined8 *)(puVar19 + lVar13 + -0x20);
          puVar8 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar3 = puVar3 + -(long)puVar11;
              goto code_r0x00024d6c;
            }
            goto code_r0x00025a48;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025a48:
          puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar8;
          puVar12 = (undefined8 *)(puVar3 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar17));
          lVar14 = (long)puVar11 - (long)puVar8;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar3 = puVar3 + -(long)puVar8;
          if (puVar19 != puVar8) goto code_r0x00024d6c;
        }
        puVar3 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar18;
        if (puVar3 == (undefined1 *)0x0) goto code_r0x00024e88;
      }
      else {
        lVar13 = __Znwm(puVar8);
        puVar6 = puVar19 + lVar13;
        puVar8 = puVar8 + lVar13;
        puVar15 = puVar6 + 1;
        *puVar6 = 0;
        puVar18 = puVar8;
        if (puVar3 != puVar17) goto code_r0x00024d44;
code_r0x00024f14:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar8;
      }
      __ZdlPv(puVar3);
      unaff_x19[1] = (long)puVar15;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar15) goto code_r0x00024f34;
code_r0x00024e98:
      puVar6 = puVar15 + 1;
      *puVar15 = 0;
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar15) goto code_r0x00024fd8;
code_r0x00025034:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar15 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar15 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar15 = puVar8 + 1;
        *puVar8 = 0;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar6 == puVar19) goto code_r0x00025114;
code_r0x00025080:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x000250a8:
          do {
            puVar17 = puVar17 + -1;
            puVar6 = puVar6 + -1;
            *puVar17 = *puVar6;
          } while (puVar6 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar6 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar6 = puVar6 + -(long)puVar11;
              goto code_r0x000250a8;
            }
            goto code_r0x00025b50;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025b50:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar6 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar6 = puVar6 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x000250a8;
        }
        puVar6 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar18;
        if (puVar6 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar15;
          uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar15 < puVar6) goto code_r0x000250dc;
          goto code_r0x00025138;
        }
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar15 = puVar17 + 1;
        *puVar17 = 0;
        puVar18 = puVar3;
        if (puVar6 != puVar19) goto code_r0x00025080;
code_r0x00025114:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar6);
      unaff_x19[1] = (long)puVar15;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar15) goto code_r0x00025138;
code_r0x000250dc:
      puVar6 = puVar15 + 1;
      *puVar15 = uVar20;
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar15) goto code_r0x000251dc;
code_r0x00025234:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar15 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar15 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar15 = puVar8 + 1;
        *puVar8 = 0;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar6 == puVar19) goto code_r0x00025310;
code_r0x00025280:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x000252a8:
          do {
            puVar17 = puVar17 + -1;
            puVar6 = puVar6 + -1;
            *puVar17 = *puVar6;
          } while (puVar6 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar6 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar6 = puVar6 + -(long)puVar11;
              goto code_r0x000252a8;
            }
            goto code_r0x00025c58;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025c58:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar6 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar6 = puVar6 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x000252a8;
        }
        puVar6 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar18;
        if (puVar6 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar15;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar15 < puVar6) goto code_r0x000252d8;
          goto code_r0x00025330;
        }
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar15 = puVar17 + 1;
        *puVar17 = 0;
        puVar18 = puVar3;
        if (puVar6 != puVar19) goto code_r0x00025280;
code_r0x00025310:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar6);
      unaff_x19[1] = (long)puVar15;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar15) goto code_r0x00025330;
code_r0x000252d8:
      puVar6 = puVar15 + 1;
      *puVar15 = 0;
      unaff_x19[1] = (long)puVar6;
      puVar15 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar15) goto code_r0x000253d4;
code_r0x0002541c:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar19;
      puVar17 = puVar8 + 1;
      if ((long)puVar17 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar3 = (undefined1 *)(((long)puVar15 - (long)puVar19) * 2);
      if (puVar3 <= puVar17) {
        puVar3 = puVar17;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar15 - (long)puVar19)) {
        puVar3 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar3 == (undefined1 *)0x0) {
        lVar13 = 0;
        puVar15 = puVar8 + 1;
        *puVar8 = 0;
        puVar3 = (undefined1 *)0x0;
        puVar18 = (undefined1 *)0x0;
        puVar17 = puVar8;
        if (puVar6 == puVar19) goto code_r0x000254d0;
code_r0x00025468:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar13) < 0x40)) {
code_r0x00025490:
          do {
            puVar17 = puVar17 + -1;
            puVar6 = puVar6 + -1;
            *puVar17 = *puVar6;
          } while (puVar6 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar6 + -0x20);
          puVar12 = (undefined8 *)(puVar8 + lVar13 + -0x20);
          puVar3 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar3 = puVar3 + -0x40;
          } while (puVar3 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar17 = puVar17 + -(long)puVar11;
              puVar6 = puVar6 + -(long)puVar11;
              goto code_r0x00025490;
            }
            goto code_r0x00025d60;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025d60:
          puVar3 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar17 = puVar17 + -(long)puVar3;
          puVar12 = (undefined8 *)(puVar6 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar13 - (long)puVar19));
          lVar14 = (long)puVar11 - (long)puVar3;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar14 = lVar14 + 8;
          } while (lVar14 != 0);
          puVar6 = puVar6 + -(long)puVar3;
          if (puVar8 != puVar3) goto code_r0x00025490;
        }
        puVar6 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar13;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar18;
        if (puVar6 == (undefined1 *)0x0) goto code_r0x000254e0;
      }
      else {
        lVar13 = __Znwm(puVar3);
        puVar17 = puVar8 + lVar13;
        puVar3 = puVar3 + lVar13;
        puVar15 = puVar17 + 1;
        *puVar17 = 0;
        puVar18 = puVar3;
        if (puVar6 != puVar19) goto code_r0x00025468;
code_r0x000254d0:
        *unaff_x19 = (long)puVar17;
        unaff_x19[1] = (long)puVar15;
        unaff_x19[2] = (long)puVar3;
      }
      __ZdlPv(puVar6);
    }
code_r0x000254e0:
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x19[1] = (long)puVar15;
    uVar20 = (undefined1)*(undefined4 *)(lVar16 + unaff_x25 * 0x10 + 8);
    if (puVar15 < (undefined1 *)unaff_x19[2]) {
      *puVar15 = uVar20;
      unaff_x19[1] = (long)(puVar15 + 1);
    }
    else {
      puVar17 = (undefined1 *)*unaff_x19;
      puVar19 = puVar15 + -(long)puVar17;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
        (*pcVar2)();
      }
      uVar5 = unaff_x19[2] - (long)puVar17;
      puVar8 = (undefined1 *)(uVar5 * 2);
      if (puVar8 <= puVar6) {
        puVar8 = puVar6;
      }
      if (0x3ffffffffffffffe < uVar5) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar18 = puVar19 + 1;
        *puVar19 = uVar20;
        puVar8 = (undefined1 *)0x0;
        puVar3 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar15 == puVar17) goto code_r0x000255c0;
code_r0x00025558:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar16) < 0x40)) {
code_r0x00025580:
          do {
            puVar6 = puVar6 + -1;
            puVar15 = puVar15 + -1;
            *puVar6 = *puVar15;
          } while (puVar15 != puVar17);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar11 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar19 + lVar16 + -0x20);
          puVar8 = puVar11;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar19 != puVar11) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar11;
              puVar15 = puVar15 + -(long)puVar11;
              goto code_r0x00025580;
            }
            goto code_r0x00025de4;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025de4:
          puVar8 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar8;
          puVar12 = (undefined8 *)(puVar15 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar12 + (lVar16 - (long)puVar17));
          lVar13 = (long)puVar11 - (long)puVar8;
          do {
            puVar12 = puVar12 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar12;
            lVar13 = lVar13 + 8;
          } while (lVar13 != 0);
          puVar15 = puVar15 + -(long)puVar8;
          if (puVar19 != puVar8) goto code_r0x00025580;
        }
        puVar15 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar3;
        if (puVar15 != (undefined1 *)0x0) goto code_r0x000255c8;
      }
      else {
        lVar16 = __Znwm(puVar8);
        puVar6 = puVar19 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar18 = puVar6 + 1;
        *puVar6 = uVar20;
        puVar3 = puVar8;
        if (puVar15 != puVar17) goto code_r0x00025558;
code_r0x000255c0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar18;
        unaff_x19[2] = (long)puVar8;
code_r0x000255c8:
        __ZdlPv(puVar15);
      }
      unaff_x19[1] = (long)puVar18;
    }
    goto LAB_00024734;
  case 5:
    func_0x000262e0();
    goto LAB_00024734;
  case 6:
    lVar13 = *plVar1;
    lVar14 = *(long *)(lVar13 + 0x20);
    lVar16 = __dyld_get_image_header(0);
    if ((lVar14 != lVar16 + 0x4e8dec0) &&
       (uVar4 = (uint)*(byte *)(lVar13 + 6), *(byte *)(lVar13 + 6) != 0x1f)) {
      lVar14 = 0;
      lVar16 = 0;
      do {
        if ((*(uint *)(*(long *)(lVar13 + 0x20) + lVar14 + 0x1c) & 0xf) == 5) {
          func_0x000262e0();
          uVar4 = (uint)*(byte *)(lVar13 + 6);
        }
        lVar16 = lVar16 + 1;
        lVar14 = lVar14 + 0x20;
      } while (lVar16 < 1 << (ulong)(uVar4 & 0x1f));
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
    puVar15 = (undefined1 *)unaff_x19[1];
    if (puVar15 < (undefined1 *)unaff_x19[2]) {
      *puVar15 = 0x43;
      unaff_x19[1] = (long)(puVar15 + 1);
      goto LAB_00024734;
    }
    puVar17 = (undefined1 *)*unaff_x19;
    puVar19 = puVar15 + -(long)puVar17;
    puVar6 = puVar19 + 1;
    if ((long)puVar6 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar5 = unaff_x19[2] - (long)puVar17;
    puVar8 = (undefined1 *)(uVar5 * 2);
    if (puVar8 <= puVar6) {
      puVar8 = puVar6;
    }
    if (unaff_x28 <= uVar5) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      puVar3 = (undefined1 *)0x0;
      *puVar19 = 0x43;
      puVar6 = puVar19;
    }
    else {
      puVar3 = (undefined1 *)__Znwm(puVar8);
      puVar6 = puVar3 + (long)puVar19;
      *puVar6 = 0x43;
    }
    puVar18 = puVar6 + 1;
    if (puVar15 == puVar17) goto code_r0x00025618;
    puVar11 = puVar15;
    if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar19) &&
       (0x3f < (ulong)((long)puVar17 - (long)puVar3))) {
      if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
        puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar15 + -0x20);
        puVar12 = (undefined8 *)(puVar3 + (long)puVar19 + -0x20);
        puVar11 = puVar7;
        do {
          uVar23 = *puVar9;
          uVar22 = puVar9[3];
          uVar21 = puVar9[2];
          uVar27 = puVar9[-3];
          uVar26 = puVar9[-4];
          uVar25 = puVar9[-1];
          uVar24 = puVar9[-2];
          puVar12[1] = puVar9[1];
          *puVar12 = uVar23;
          puVar12[3] = uVar22;
          puVar12[2] = uVar21;
          puVar12[-3] = uVar27;
          puVar12[-4] = uVar26;
          puVar12[-1] = uVar25;
          puVar12[-2] = uVar24;
          puVar9 = puVar9 + -8;
          puVar12 = puVar12 + -8;
          puVar11 = puVar11 + -0x40;
        } while (puVar11 != (undefined1 *)0x0);
        if (puVar19 == puVar7) break;
        if (((ulong)puVar19 & 0x38) == 0) {
          puVar6 = puVar6 + -(long)puVar7;
          puVar11 = puVar15 + -(long)puVar7;
          goto code_r0x00025fb8;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
      }
      puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
      puVar11 = puVar15 + -(long)puVar10;
      puVar6 = puVar6 + -(long)puVar10;
      puVar12 = (undefined8 *)(puVar15 + -(long)puVar7);
      puVar9 = (undefined8 *)(puVar3 + ((long)puVar12 - (long)puVar17));
      lVar16 = (long)puVar7 - (long)puVar10;
      do {
        puVar12 = puVar12 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar12;
        lVar16 = lVar16 + 8;
      } while (lVar16 != 0);
      if (puVar19 == puVar10) break;
    }
code_r0x00025fb8:
    do {
      puVar6 = puVar6 + -1;
      puVar11 = puVar11 + -1;
      *puVar6 = *puVar11;
    } while (puVar11 != puVar17);
  }
code_r0x00025fc8:
  puVar15 = (undefined1 *)*unaff_x19;
  *unaff_x19 = (long)puVar3;
  unaff_x19[1] = (long)puVar18;
  unaff_x19[2] = (long)(puVar3 + (long)puVar8);
  puVar6 = puVar3;
joined_r0x00025fdc:
  if (puVar15 != (undefined1 *)0x0) {
    __ZdlPv(puVar6,puVar15);
  }
  unaff_x19[1] = (long)puVar18;
  goto LAB_00024734;
code_r0x0002481c:
  puVar15 = (undefined1 *)unaff_x19[1];
  uVar20 = (undefined1)*plVar1;
  if ((undefined1 *)unaff_x19[2] <= puVar15) {
    puVar17 = (undefined1 *)*unaff_x19;
    puVar19 = puVar15 + -(long)puVar17;
    puVar6 = puVar19 + 1;
    if ((long)puVar6 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar5 = unaff_x19[2] - (long)puVar17;
    puVar8 = (undefined1 *)(uVar5 * 2);
    if (puVar8 <= puVar6) {
      puVar8 = puVar6;
    }
    if (unaff_x28 <= uVar5) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      puVar3 = (undefined1 *)0x0;
      *puVar19 = uVar20;
      puVar6 = puVar19;
    }
    else {
      puVar3 = (undefined1 *)__Znwm(puVar8);
      puVar6 = puVar3 + (long)puVar19;
      *puVar6 = uVar20;
    }
    puVar18 = puVar6 + 1;
    if (puVar15 != puVar17) {
      puVar11 = puVar15;
      if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar19) &&
         (0x3f < (ulong)((long)puVar17 - (long)puVar3))) {
        if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar7 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar15 + -0x20);
          puVar12 = (undefined8 *)(puVar3 + (long)puVar19 + -0x20);
          puVar11 = puVar7;
          do {
            uVar23 = *puVar9;
            uVar22 = puVar9[3];
            uVar21 = puVar9[2];
            uVar27 = puVar9[-3];
            uVar26 = puVar9[-4];
            uVar25 = puVar9[-1];
            uVar24 = puVar9[-2];
            puVar12[1] = puVar9[1];
            *puVar12 = uVar23;
            puVar12[3] = uVar22;
            puVar12[2] = uVar21;
            puVar12[-3] = uVar27;
            puVar12[-4] = uVar26;
            puVar12[-1] = uVar25;
            puVar12[-2] = uVar24;
            puVar9 = puVar9 + -8;
            puVar12 = puVar12 + -8;
            puVar11 = puVar11 + -0x40;
          } while (puVar11 != (undefined1 *)0x0);
          if (puVar19 == puVar7) goto code_r0x00025fc8;
          if (((ulong)puVar19 & 0x38) == 0) {
            puVar6 = puVar6 + -(long)puVar7;
            puVar11 = puVar15 + -(long)puVar7;
            goto code_r0x00025eb8;
          }
        }
        else {
          puVar7 = (undefined1 *)0x0;
        }
        puVar10 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
        puVar11 = puVar15 + -(long)puVar10;
        puVar6 = puVar6 + -(long)puVar10;
        puVar12 = (undefined8 *)(puVar15 + -(long)puVar7);
        puVar9 = (undefined8 *)(puVar3 + ((long)puVar12 - (long)puVar17));
        lVar16 = (long)puVar7 - (long)puVar10;
        do {
          puVar12 = puVar12 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar12;
          lVar16 = lVar16 + 8;
        } while (lVar16 != 0);
        if (puVar19 == puVar10) goto code_r0x00025fc8;
      }
code_r0x00025eb8:
      do {
        puVar6 = puVar6 + -1;
        puVar11 = puVar11 + -1;
        *puVar6 = *puVar11;
      } while (puVar11 != puVar17);
      goto code_r0x00025fc8;
    }
    *unaff_x19 = (long)puVar6;
    unaff_x19[1] = (long)puVar18;
    unaff_x19[2] = (long)(puVar3 + (long)puVar8);
    goto joined_r0x00025fdc;
  }
  unaff_x22 = puVar15 + 1;
  *puVar15 = uVar20;
  goto code_r0x00024838;
}

