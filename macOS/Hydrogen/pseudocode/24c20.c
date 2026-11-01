
void FUN_00024c20(void)

{
  code *pcVar1;
  long lVar2;
  uint uVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  ulong uVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  long lVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long lVar14;
  undefined1 *unaff_x22;
  undefined1 *puVar15;
  undefined1 *puVar16;
  undefined1 *puVar17;
  long unaff_x25;
  undefined1 *puVar18;
  undefined1 *unaff_x27;
  undefined1 uVar19;
  undefined4 uVar20;
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
  
code_r0x00024c20:
  puVar4 = (undefined1 *)unaff_x19[2];
  if (unaff_x22 < puVar4) goto LAB_00024bcc;
code_r0x00024c2c:
  puVar17 = (undefined1 *)*unaff_x19;
  puVar18 = unaff_x22 + -(long)puVar17;
  puVar5 = puVar18 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x2613c);
    (*pcVar1)();
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar17) * 2);
  if (puVar8 <= puVar5) {
    puVar8 = puVar5;
  }
  if (unaff_x28 <= (ulong)((long)puVar4 - (long)puVar17)) {
    puVar8 = unaff_x27;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar2 = 0;
    puVar15 = puVar18 + 1;
    *puVar18 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar5 = (undefined1 *)0x0;
    puVar4 = puVar18;
    if (unaff_x22 == puVar17) goto LAB_00024dac;
LAB_00024c78:
    if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
LAB_00024ca0:
      do {
        puVar4 = puVar4 + -1;
        unaff_x22 = unaff_x22 + -1;
        *puVar4 = *unaff_x22;
      } while (unaff_x22 != puVar17);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
      puVar16 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(unaff_x22 + -0x20);
      puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
      puVar8 = puVar16;
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
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar18 != puVar16) {
        if (((ulong)puVar18 & 0x38) == 0) {
          puVar4 = puVar4 + -(long)puVar16;
          unaff_x22 = unaff_x22 + -(long)puVar16;
          goto LAB_00024ca0;
        }
        goto code_r0x00025940;
      }
    }
    else {
      puVar16 = (undefined1 *)0x0;
code_r0x00025940:
      puVar8 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
      puVar4 = puVar4 + -(long)puVar8;
      puVar13 = (undefined8 *)(unaff_x22 + -(long)puVar16);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
      lVar12 = (long)puVar16 - (long)puVar8;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      unaff_x22 = unaff_x22 + -(long)puVar8;
      if (puVar18 != puVar8) goto LAB_00024ca0;
    }
    unaff_x22 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)puVar15;
    unaff_x19[2] = (long)puVar5;
    if (unaff_x22 == (undefined1 *)0x0) {
      unaff_x19[1] = (long)puVar15;
      uVar20 = (undefined4)*unaff_x21;
      uVar19 = (undefined1)*unaff_x21;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar4 <= puVar15) goto LAB_00024dd4;
      goto LAB_00024cd8;
    }
  }
  else {
    lVar2 = __Znwm(puVar8);
    puVar4 = puVar18 + lVar2;
    puVar8 = puVar8 + lVar2;
    puVar15 = puVar4 + 1;
    *puVar4 = 0;
    puVar5 = puVar8;
    if (unaff_x22 != puVar17) goto LAB_00024c78;
LAB_00024dac:
    *unaff_x19 = (long)puVar4;
    unaff_x19[1] = (long)puVar15;
    unaff_x19[2] = (long)puVar8;
  }
  __ZdlPv(unaff_x22);
  unaff_x19[1] = (long)puVar15;
  uVar20 = (undefined4)*unaff_x21;
  uVar19 = (undefined1)*unaff_x21;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar4 <= puVar15) goto LAB_00024dd4;
LAB_00024cd8:
  puVar4 = puVar15 + 1;
  *puVar15 = (char)uVar20;
  unaff_x19[1] = (long)puVar4;
  puVar5 = (undefined1 *)unaff_x19[2];
  if (puVar4 < puVar5) goto LAB_00024e80;
LAB_00024cf8:
  puVar18 = (undefined1 *)*unaff_x19;
  puVar8 = puVar4 + -(long)puVar18;
  puVar17 = puVar8 + 1;
  if (-1 < (long)puVar17) {
    puVar15 = (undefined1 *)(((long)puVar5 - (long)puVar18) * 2);
    if (puVar15 <= puVar17) {
      puVar15 = puVar17;
    }
    if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar18)) {
      puVar15 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar15 == (undefined1 *)0x0) {
      lVar2 = 0;
      *puVar8 = 0;
      puVar15 = (undefined1 *)0x0;
      puVar5 = puVar8;
    }
    else {
      lVar2 = __Znwm(puVar15);
      puVar5 = puVar8 + lVar2;
      puVar15 = puVar15 + lVar2;
      *puVar5 = 0;
    }
    puVar17 = puVar5 + 1;
    if (puVar4 == puVar18) {
      *unaff_x19 = (long)puVar5;
      unaff_x19[1] = (long)puVar17;
      unaff_x19[2] = (long)puVar15;
      goto LAB_00024f1c;
    }
    if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar2) < 0x40)) {
LAB_00024d6c:
      do {
        puVar5 = puVar5 + -1;
        puVar4 = puVar4 + -1;
        *puVar5 = *puVar4;
      } while (puVar4 != puVar18);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
      puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(puVar4 + -0x20);
      puVar13 = (undefined8 *)(puVar8 + lVar2 + -0x20);
      puVar16 = puVar11;
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
        puVar16 = puVar16 + -0x40;
      } while (puVar16 != (undefined1 *)0x0);
      if (puVar8 != puVar11) {
        if (((ulong)puVar8 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar11;
          puVar4 = puVar4 + -(long)puVar11;
          goto LAB_00024d6c;
        }
        goto code_r0x00025a48;
      }
    }
    else {
      puVar11 = (undefined1 *)0x0;
code_r0x00025a48:
      puVar16 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar16;
      puVar13 = (undefined8 *)(puVar4 + -(long)puVar11);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar18));
      lVar12 = (long)puVar11 - (long)puVar16;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      puVar4 = puVar4 + -(long)puVar16;
      if (puVar8 != puVar16) goto LAB_00024d6c;
    }
    puVar4 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)puVar17;
    unaff_x19[2] = (long)puVar15;
    if (puVar4 == (undefined1 *)0x0) goto LAB_00024e88;
LAB_00024f1c:
    __ZdlPv(puVar4);
    unaff_x19[1] = (long)puVar17;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar17 < puVar4) goto code_r0x00024e98;
LAB_00024f34:
    puVar18 = (undefined1 *)*unaff_x19;
    puVar8 = puVar17 + -(long)puVar18;
    puVar5 = puVar8 + 1;
    if (-1 < (long)puVar5) {
      puVar15 = (undefined1 *)(((long)puVar4 - (long)puVar18) * 2);
      if (puVar15 <= puVar5) {
        puVar15 = puVar5;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar18)) {
        puVar15 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar15 == (undefined1 *)0x0) {
        lVar2 = 0;
        puVar16 = puVar8 + 1;
        *puVar8 = 0;
        puVar15 = (undefined1 *)0x0;
        puVar5 = (undefined1 *)0x0;
        puVar4 = puVar8;
        if (puVar17 == puVar18) goto LAB_00025014;
LAB_00024f80:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar2) < 0x40)) {
LAB_00024fa8:
          do {
            puVar4 = puVar4 + -1;
            puVar17 = puVar17 + -1;
            *puVar4 = *puVar17;
          } while (puVar17 != puVar18);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar9 = (undefined8 *)(puVar17 + -0x20);
          puVar13 = (undefined8 *)(puVar8 + lVar2 + -0x20);
          puVar15 = puVar11;
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
            puVar15 = puVar15 + -0x40;
          } while (puVar15 != (undefined1 *)0x0);
          if (puVar8 != puVar11) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar4 = puVar4 + -(long)puVar11;
              puVar17 = puVar17 + -(long)puVar11;
              goto LAB_00024fa8;
            }
            goto code_r0x00025acc;
          }
        }
        else {
          puVar11 = (undefined1 *)0x0;
code_r0x00025acc:
          puVar15 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar4 = puVar4 + -(long)puVar15;
          puVar13 = (undefined8 *)(puVar17 + -(long)puVar11);
          puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar18));
          lVar12 = (long)puVar11 - (long)puVar15;
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
            lVar12 = lVar12 + 8;
          } while (lVar12 != 0);
          puVar17 = puVar17 + -(long)puVar15;
          if (puVar8 != puVar15) goto LAB_00024fa8;
        }
        puVar17 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar2;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar5;
        if (puVar17 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar16;
          puVar4 = (undefined1 *)unaff_x19[2];
          if (puVar4 <= puVar16) goto LAB_00025034;
          goto LAB_00024fd8;
        }
      }
      else {
        lVar2 = __Znwm(puVar15);
        puVar4 = puVar8 + lVar2;
        puVar15 = puVar15 + lVar2;
        puVar16 = puVar4 + 1;
        *puVar4 = 0;
        puVar5 = puVar15;
        if (puVar17 != puVar18) goto LAB_00024f80;
LAB_00025014:
        *unaff_x19 = (long)puVar4;
        unaff_x19[1] = (long)puVar16;
        unaff_x19[2] = (long)puVar15;
      }
      __ZdlPv(puVar17);
      unaff_x19[1] = (long)puVar16;
      puVar4 = (undefined1 *)unaff_x19[2];
      if (puVar4 <= puVar16) goto LAB_00025034;
LAB_00024fd8:
      puVar4 = puVar16 + 1;
      *puVar16 = 0;
      unaff_x19[1] = (long)puVar4;
      uVar19 = (undefined1)*(undefined4 *)((long)unaff_x21 + 4);
      puVar5 = (undefined1 *)unaff_x19[2];
      if (puVar4 < puVar5) goto LAB_000250dc;
LAB_00025138:
      puVar18 = (undefined1 *)*unaff_x19;
      puVar8 = puVar4 + -(long)puVar18;
      puVar17 = puVar8 + 1;
      if (-1 < (long)puVar17) {
        puVar15 = (undefined1 *)(((long)puVar5 - (long)puVar18) * 2);
        if (puVar15 <= puVar17) {
          puVar15 = puVar17;
        }
        if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar18)) {
          puVar15 = (undefined1 *)0x7fffffffffffffff;
        }
        if (puVar15 == (undefined1 *)0x0) {
          lVar2 = 0;
          puVar16 = puVar8 + 1;
          *puVar8 = uVar19;
          puVar15 = (undefined1 *)0x0;
          puVar17 = (undefined1 *)0x0;
          puVar5 = puVar8;
          if (puVar4 == puVar18) goto code_r0x00025214;
code_r0x00025184:
          if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar2) < 0x40)) {
LAB_000251ac:
            do {
              puVar5 = puVar5 + -1;
              puVar4 = puVar4 + -1;
              *puVar5 = *puVar4;
            } while (puVar4 != puVar18);
          }
          else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
            puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
            puVar9 = (undefined8 *)(puVar4 + -0x20);
            puVar13 = (undefined8 *)(puVar8 + lVar2 + -0x20);
            puVar15 = puVar11;
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
              puVar15 = puVar15 + -0x40;
            } while (puVar15 != (undefined1 *)0x0);
            if (puVar8 != puVar11) {
              if (((ulong)puVar8 & 0x38) == 0) {
                puVar5 = puVar5 + -(long)puVar11;
                puVar4 = puVar4 + -(long)puVar11;
                goto LAB_000251ac;
              }
              goto code_r0x00025bd4;
            }
          }
          else {
            puVar11 = (undefined1 *)0x0;
code_r0x00025bd4:
            puVar15 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
            puVar5 = puVar5 + -(long)puVar15;
            puVar13 = (undefined8 *)(puVar4 + -(long)puVar11);
            puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar18));
            lVar12 = (long)puVar11 - (long)puVar15;
            do {
              puVar13 = puVar13 + -1;
              puVar9 = puVar9 + -1;
              *puVar9 = *puVar13;
              lVar12 = lVar12 + 8;
            } while (lVar12 != 0);
            puVar4 = puVar4 + -(long)puVar15;
            if (puVar8 != puVar15) goto LAB_000251ac;
          }
          puVar4 = (undefined1 *)*unaff_x19;
          *unaff_x19 = lVar2;
          unaff_x19[1] = (long)puVar16;
          unaff_x19[2] = (long)puVar17;
          if (puVar4 == (undefined1 *)0x0) {
            unaff_x19[1] = (long)puVar16;
            puVar4 = (undefined1 *)unaff_x19[2];
            if (puVar4 <= puVar16) goto LAB_00025234;
            goto LAB_000251dc;
          }
        }
        else {
          lVar2 = __Znwm(puVar15);
          puVar5 = puVar8 + lVar2;
          puVar15 = puVar15 + lVar2;
          puVar16 = puVar5 + 1;
          *puVar5 = uVar19;
          puVar17 = puVar15;
          if (puVar4 != puVar18) goto code_r0x00025184;
code_r0x00025214:
          *unaff_x19 = (long)puVar5;
          unaff_x19[1] = (long)puVar16;
          unaff_x19[2] = (long)puVar15;
        }
        __ZdlPv(puVar4);
        unaff_x19[1] = (long)puVar16;
        puVar4 = (undefined1 *)unaff_x19[2];
        if (puVar4 <= puVar16) goto LAB_00025234;
LAB_000251dc:
        puVar4 = puVar16 + 1;
        *puVar16 = 0;
        unaff_x19[1] = (long)puVar4;
        puVar5 = (undefined1 *)unaff_x19[2];
        if (puVar4 < puVar5) goto LAB_000252d8;
LAB_00025330:
        puVar18 = (undefined1 *)*unaff_x19;
        puVar8 = puVar4 + -(long)puVar18;
        puVar17 = puVar8 + 1;
        if (-1 < (long)puVar17) {
          puVar15 = (undefined1 *)(((long)puVar5 - (long)puVar18) * 2);
          if (puVar15 <= puVar17) {
            puVar15 = puVar17;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar5 - (long)puVar18)) {
            puVar15 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar15 == (undefined1 *)0x0) {
            lVar2 = 0;
            puVar16 = puVar8 + 1;
            *puVar8 = 0;
            puVar15 = (undefined1 *)0x0;
            puVar17 = (undefined1 *)0x0;
            puVar5 = puVar8;
            if (puVar4 == puVar18) goto LAB_000253fc;
code_r0x0002537c:
            if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar18 - lVar2) < 0x40)) {
code_r0x000253a4:
              do {
                puVar5 = puVar5 + -1;
                puVar4 = puVar4 + -1;
                *puVar5 = *puVar4;
              } while (puVar4 != puVar18);
            }
            else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
              puVar11 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
              puVar9 = (undefined8 *)(puVar4 + -0x20);
              puVar13 = (undefined8 *)(puVar8 + lVar2 + -0x20);
              puVar15 = puVar11;
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
                puVar15 = puVar15 + -0x40;
              } while (puVar15 != (undefined1 *)0x0);
              if (puVar8 != puVar11) {
                if (((ulong)puVar8 & 0x38) == 0) {
                  puVar5 = puVar5 + -(long)puVar11;
                  puVar4 = puVar4 + -(long)puVar11;
                  goto code_r0x000253a4;
                }
                goto code_r0x00025cdc;
              }
            }
            else {
              puVar11 = (undefined1 *)0x0;
code_r0x00025cdc:
              puVar15 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
              puVar5 = puVar5 + -(long)puVar15;
              puVar13 = (undefined8 *)(puVar4 + -(long)puVar11);
              puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar18));
              lVar12 = (long)puVar11 - (long)puVar15;
              do {
                puVar13 = puVar13 + -1;
                puVar9 = puVar9 + -1;
                *puVar9 = *puVar13;
                lVar12 = lVar12 + 8;
              } while (lVar12 != 0);
              puVar4 = puVar4 + -(long)puVar15;
              if (puVar8 != puVar15) goto code_r0x000253a4;
            }
            puVar4 = (undefined1 *)*unaff_x19;
            *unaff_x19 = lVar2;
            unaff_x19[1] = (long)puVar16;
            unaff_x19[2] = (long)puVar17;
            if (puVar4 == (undefined1 *)0x0) {
              unaff_x19[1] = (long)puVar16;
              puVar4 = (undefined1 *)unaff_x19[2];
              if (puVar4 <= puVar16) goto LAB_0002541c;
              goto FUN_000253d4;
            }
          }
          else {
            lVar2 = __Znwm(puVar15);
            puVar5 = puVar8 + lVar2;
            puVar15 = puVar15 + lVar2;
            puVar16 = puVar5 + 1;
            *puVar5 = 0;
            puVar17 = puVar15;
            if (puVar4 != puVar18) goto code_r0x0002537c;
LAB_000253fc:
            *unaff_x19 = (long)puVar5;
            unaff_x19[1] = (long)puVar16;
            unaff_x19[2] = (long)puVar15;
          }
          __ZdlPv(puVar4);
          unaff_x19[1] = (long)puVar16;
          puVar4 = (undefined1 *)unaff_x19[2];
          if (puVar4 <= puVar16) goto LAB_0002541c;
FUN_000253d4:
          puVar4 = puVar16 + 1;
          *puVar16 = 0;
LAB_000254e0:
          unaff_x19[1] = (long)puVar4;
          uVar19 = (undefined1)*(undefined4 *)(in_stack_00000000 + unaff_x25 * 0x10 + 8);
          if (puVar4 < (undefined1 *)unaff_x19[2]) {
            *puVar4 = uVar19;
            unaff_x19[1] = (long)(puVar4 + 1);
            goto LAB_00024734;
          }
          puVar17 = (undefined1 *)*unaff_x19;
          puVar18 = puVar4 + -(long)puVar17;
          puVar5 = puVar18 + 1;
          if (-1 < (long)puVar5) {
            uVar6 = unaff_x19[2] - (long)puVar17;
            puVar8 = (undefined1 *)(uVar6 * 2);
            if (puVar8 <= puVar5) {
              puVar8 = puVar5;
            }
            if (0x3ffffffffffffffe < uVar6) {
              puVar8 = (undefined1 *)0x7fffffffffffffff;
            }
            if (puVar8 == (undefined1 *)0x0) {
              lVar2 = 0;
              puVar16 = puVar18 + 1;
              *puVar18 = uVar19;
              puVar8 = (undefined1 *)0x0;
              puVar15 = (undefined1 *)0x0;
              puVar5 = puVar18;
              if (puVar4 == puVar17) goto LAB_000255c0;
LAB_00025558:
              if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
LAB_00025580:
                do {
                  puVar5 = puVar5 + -1;
                  puVar4 = puVar4 + -1;
                  *puVar5 = *puVar4;
                } while (puVar4 != puVar17);
              }
              else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
                puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
                puVar9 = (undefined8 *)(puVar4 + -0x20);
                puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
                puVar8 = puVar11;
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
                  puVar8 = puVar8 + -0x40;
                } while (puVar8 != (undefined1 *)0x0);
                if (puVar18 != puVar11) {
                  if (((ulong)puVar18 & 0x38) == 0) {
                    puVar5 = puVar5 + -(long)puVar11;
                    puVar4 = puVar4 + -(long)puVar11;
                    goto LAB_00025580;
                  }
                  goto LAB_00025de4;
                }
              }
              else {
                puVar11 = (undefined1 *)0x0;
LAB_00025de4:
                puVar8 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
                puVar5 = puVar5 + -(long)puVar8;
                puVar13 = (undefined8 *)(puVar4 + -(long)puVar11);
                puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
                lVar12 = (long)puVar11 - (long)puVar8;
                do {
                  puVar13 = puVar13 + -1;
                  puVar9 = puVar9 + -1;
                  *puVar9 = *puVar13;
                  lVar12 = lVar12 + 8;
                } while (lVar12 != 0);
                puVar4 = puVar4 + -(long)puVar8;
                if (puVar18 != puVar8) goto LAB_00025580;
              }
              puVar4 = (undefined1 *)*unaff_x19;
              *unaff_x19 = lVar2;
              unaff_x19[1] = (long)puVar16;
              unaff_x19[2] = (long)puVar15;
              if (puVar4 != (undefined1 *)0x0) goto LAB_000255c8;
            }
            else {
              lVar2 = __Znwm(puVar8);
              puVar5 = puVar18 + lVar2;
              puVar8 = puVar8 + lVar2;
              puVar16 = puVar5 + 1;
              *puVar5 = uVar19;
              puVar15 = puVar8;
              if (puVar4 != puVar17) goto LAB_00025558;
LAB_000255c0:
              *unaff_x19 = (long)puVar5;
              unaff_x19[1] = (long)puVar16;
              unaff_x19[2] = (long)puVar8;
LAB_000255c8:
              __ZdlPv(puVar4);
            }
            unaff_x19[1] = (long)puVar16;
LAB_00024734:
            unaff_x27 = (undefined1 *)0x7fffffffffffffff;
            unaff_x25 = unaff_x25 + 1;
            if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
              if (0 < *(int *)(unaff_x20 + 0x8c)) {
                lVar2 = 0;
                do {
                  func_0x000245c0(&uStack0000000000000008,
                                  *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar2 * 8));
                  func_0x00026614();
                  if (uStack0000000000000008 != 0) {
                    in_stack_00000010 = uStack0000000000000008;
                    __ZdlPv();
                  }
                  lVar2 = lVar2 + 1;
                } while (lVar2 < *(int *)(unaff_x20 + 0x8c));
              }
              func_0x000262e0();
              return;
            }
            in_stack_00000000 = *(long *)(unaff_x20 + 8);
            unaff_x21 = (long *)(in_stack_00000000 + unaff_x25 * 0x10);
            switch(*(undefined4 *)((long)unaff_x21 + 0xc)) {
            case 0:
              puVar4 = (undefined1 *)unaff_x19[1];
              if ((undefined1 *)unaff_x19[2] <= puVar4) {
                puVar17 = (undefined1 *)*unaff_x19;
                puVar18 = puVar4 + -(long)puVar17;
                puVar5 = puVar18 + 1;
                if (-1 < (long)puVar5) {
                  uVar6 = unaff_x19[2] - (long)puVar17;
                  puVar8 = (undefined1 *)(uVar6 * 2);
                  if (puVar8 <= puVar5) {
                    puVar8 = puVar5;
                  }
                  if (0x3ffffffffffffffe < uVar6) {
                    puVar8 = (undefined1 *)0x7fffffffffffffff;
                  }
                  if (puVar8 == (undefined1 *)0x0) {
                    puVar15 = (undefined1 *)0x0;
                    *puVar18 = 0;
                    puVar5 = puVar18;
                  }
                  else {
                    puVar15 = (undefined1 *)__Znwm(puVar8);
                    puVar5 = puVar15 + (long)puVar18;
                    *puVar5 = 0;
                  }
                  puVar16 = puVar5 + 1;
                  if (puVar4 != puVar17) {
                    puVar11 = puVar4;
                    if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar18) &&
                       (0x3f < (ulong)((long)puVar17 - (long)puVar15))) {
                      if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
                        puVar7 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
                        puVar9 = (undefined8 *)(puVar4 + -0x20);
                        puVar13 = (undefined8 *)(puVar15 + (long)puVar18 + -0x20);
                        puVar11 = puVar7;
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
                        if (puVar18 == puVar7) break;
                        if (((ulong)puVar18 & 0x38) == 0) {
                          puVar5 = puVar5 + -(long)puVar7;
                          puVar11 = puVar4 + -(long)puVar7;
                          goto code_r0x00025ed8;
                        }
                      }
                      else {
                        puVar7 = (undefined1 *)0x0;
                      }
                      puVar10 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
                      puVar11 = puVar4 + -(long)puVar10;
                      puVar5 = puVar5 + -(long)puVar10;
                      puVar13 = (undefined8 *)(puVar4 + -(long)puVar7);
                      puVar9 = (undefined8 *)(puVar15 + ((long)puVar13 - (long)puVar17));
                      lVar2 = (long)puVar7 - (long)puVar10;
                      do {
                        puVar13 = puVar13 + -1;
                        puVar9 = puVar9 + -1;
                        *puVar9 = *puVar13;
                        lVar2 = lVar2 + 8;
                      } while (lVar2 != 0);
                      if (puVar18 == puVar10) break;
                    }
code_r0x00025ed8:
                    do {
                      puVar5 = puVar5 + -1;
                      puVar11 = puVar11 + -1;
                      *puVar5 = *puVar11;
                    } while (puVar11 != puVar17);
                    break;
                  }
code_r0x00025618:
                  *unaff_x19 = (long)puVar5;
                  unaff_x19[1] = (long)puVar16;
                  unaff_x19[2] = (long)(puVar15 + (long)puVar8);
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
              uVar19 = (undefined1)*unaff_x21;
              if (puVar4 < (undefined1 *)unaff_x19[2]) {
                *puVar4 = uVar19;
                unaff_x19[1] = (long)(puVar4 + 1);
                goto LAB_00024734;
              }
              puVar17 = (undefined1 *)*unaff_x19;
              puVar18 = puVar4 + -(long)puVar17;
              puVar5 = puVar18 + 1;
              if ((long)puVar5 < 0) {
                func_0x00017f90();
                goto code_r0x00026138;
              }
              uVar6 = unaff_x19[2] - (long)puVar17;
              puVar8 = (undefined1 *)(uVar6 * 2);
              if (puVar8 <= puVar5) {
                puVar8 = puVar5;
              }
              if (0x3ffffffffffffffe < uVar6) {
                puVar8 = (undefined1 *)0x7fffffffffffffff;
              }
              if (puVar8 == (undefined1 *)0x0) {
                puVar15 = (undefined1 *)0x0;
                *puVar18 = uVar19;
                puVar5 = puVar18;
              }
              else {
                puVar15 = (undefined1 *)__Znwm(puVar8);
                puVar5 = puVar15 + (long)puVar18;
                *puVar5 = uVar19;
              }
              puVar16 = puVar5 + 1;
              if (puVar4 == puVar17) {
                *unaff_x19 = (long)puVar5;
                unaff_x19[1] = (long)puVar16;
                unaff_x19[2] = (long)(puVar15 + (long)puVar8);
                goto joined_r0x00025fdc;
              }
              puVar11 = puVar4;
              if ((&MACH_HEADER.cpusubtype <= puVar18) &&
                 (0x3f < (ulong)((long)puVar17 - (long)puVar15))) {
                if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
                  puVar7 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
                  puVar9 = (undefined8 *)(puVar4 + -0x20);
                  puVar13 = (undefined8 *)(puVar15 + (long)puVar18 + -0x20);
                  puVar11 = puVar7;
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
                  if (puVar18 == puVar7) break;
                  if (((ulong)puVar18 & 0x38) == 0) {
                    puVar5 = puVar5 + -(long)puVar7;
                    puVar11 = puVar4 + -(long)puVar7;
                    goto code_r0x00025eb8;
                  }
                }
                else {
                  puVar7 = (undefined1 *)0x0;
                }
                puVar10 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
                puVar11 = puVar4 + -(long)puVar10;
                puVar5 = puVar5 + -(long)puVar10;
                puVar13 = (undefined8 *)(puVar4 + -(long)puVar7);
                puVar9 = (undefined8 *)(puVar15 + ((long)puVar13 - (long)puVar17));
                lVar2 = (long)puVar7 - (long)puVar10;
                do {
                  puVar13 = puVar13 + -1;
                  puVar9 = puVar9 + -1;
                  *puVar9 = *puVar13;
                  lVar2 = lVar2 + 8;
                } while (lVar2 != 0);
                if (puVar18 == puVar10) break;
              }
code_r0x00025eb8:
              do {
                puVar5 = puVar5 + -1;
                puVar11 = puVar11 + -1;
                *puVar5 = *puVar11;
              } while (puVar11 != puVar17);
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
              lVar12 = *unaff_x21;
              lVar14 = *(long *)(lVar12 + 0x20);
              lVar2 = __dyld_get_image_header(0);
              if ((lVar14 != lVar2 + 0x4e8dec0) &&
                 (uVar3 = (uint)*(byte *)(lVar12 + 6), *(byte *)(lVar12 + 6) != 0x1f)) {
                lVar14 = 0;
                lVar2 = 0;
                do {
                  if ((*(uint *)(*(long *)(lVar12 + 0x20) + lVar14 + 0x1c) & 0xf) == 5) {
                    func_0x000262e0();
                    uVar3 = (uint)*(byte *)(lVar12 + 6);
                  }
                  lVar2 = lVar2 + 1;
                  lVar14 = lVar14 + 0x20;
                } while (lVar2 < 1 << (ulong)(uVar3 & 0x1f));
              }
              goto LAB_00024734;
            case 7:
              if (*(char *)(*unaff_x21 + 3) == '\0') {
                func_0x000245c0(&uStack0000000000000008,*(undefined8 *)(*unaff_x21 + 0x18));
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
              puVar17 = (undefined1 *)*unaff_x19;
              puVar18 = puVar4 + -(long)puVar17;
              puVar5 = puVar18 + 1;
              if ((long)puVar5 < 0) {
                func_0x00017f90();
                goto code_r0x00026138;
              }
              uVar6 = unaff_x19[2] - (long)puVar17;
              puVar8 = (undefined1 *)(uVar6 * 2);
              if (puVar8 <= puVar5) {
                puVar8 = puVar5;
              }
              if (0x3ffffffffffffffe < uVar6) {
                puVar8 = (undefined1 *)0x7fffffffffffffff;
              }
              if (puVar8 == (undefined1 *)0x0) {
                puVar15 = (undefined1 *)0x0;
                *puVar18 = 0x43;
                puVar5 = puVar18;
              }
              else {
                puVar15 = (undefined1 *)__Znwm(puVar8);
                puVar5 = puVar15 + (long)puVar18;
                *puVar5 = 0x43;
              }
              puVar16 = puVar5 + 1;
              if (puVar4 == puVar17) goto code_r0x00025618;
              puVar11 = puVar4;
              if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar18) &&
                 (0x3f < (ulong)((long)puVar17 - (long)puVar15))) {
                if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
                  puVar7 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
                  puVar9 = (undefined8 *)(puVar4 + -0x20);
                  puVar13 = (undefined8 *)(puVar15 + (long)puVar18 + -0x20);
                  puVar11 = puVar7;
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
                  if (puVar18 == puVar7) break;
                  if (((ulong)puVar18 & 0x38) == 0) {
                    puVar5 = puVar5 + -(long)puVar7;
                    puVar11 = puVar4 + -(long)puVar7;
                    goto code_r0x00025fb8;
                  }
                }
                else {
                  puVar7 = (undefined1 *)0x0;
                }
                puVar10 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
                puVar11 = puVar4 + -(long)puVar10;
                puVar5 = puVar5 + -(long)puVar10;
                puVar13 = (undefined8 *)(puVar4 + -(long)puVar7);
                puVar9 = (undefined8 *)(puVar15 + ((long)puVar13 - (long)puVar17));
                lVar2 = (long)puVar7 - (long)puVar10;
                do {
                  puVar13 = puVar13 + -1;
                  puVar9 = puVar9 + -1;
                  *puVar9 = *puVar13;
                  lVar2 = lVar2 + 8;
                } while (lVar2 != 0);
                if (puVar18 == puVar10) break;
              }
code_r0x00025fb8:
              do {
                puVar5 = puVar5 + -1;
                puVar11 = puVar11 + -1;
                *puVar5 = *puVar11;
              } while (puVar11 != puVar17);
            }
            puVar4 = (undefined1 *)*unaff_x19;
            *unaff_x19 = (long)puVar15;
            unaff_x19[1] = (long)puVar16;
            unaff_x19[2] = (long)(puVar15 + (long)puVar8);
            puVar5 = puVar15;
joined_r0x00025fdc:
            if (puVar4 != (undefined1 *)0x0) {
              __ZdlPv(puVar5,puVar4);
            }
            unaff_x19[1] = (long)puVar16;
            goto LAB_00024734;
          }
          func_0x00017f90();
          goto code_r0x00026138;
        }
        func_0x00017f90();
        goto code_r0x00026138;
      }
      func_0x00017f90();
      goto code_r0x00026138;
    }
    func_0x00017f90();
    goto code_r0x00026138;
  }
  func_0x00017f90();
  goto code_r0x00026138;
code_r0x00024870:
  puVar4 = (undefined1 *)unaff_x19[1];
  if (puVar4 < (undefined1 *)unaff_x19[2]) {
    puVar16 = puVar4 + 1;
    *puVar4 = 0;
  }
  else {
    puVar17 = (undefined1 *)*unaff_x19;
    puVar18 = puVar4 + -(long)puVar17;
    puVar5 = puVar18 + 1;
    if ((long)puVar5 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar17;
    puVar8 = (undefined1 *)(uVar6 * 2);
    if (puVar8 <= puVar5) {
      puVar8 = puVar5;
    }
    if (0x3ffffffffffffffe < uVar6) {
      puVar8 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar8 == (undefined1 *)0x0) {
      puVar15 = (undefined1 *)0x0;
      puVar16 = puVar18 + 1;
      *puVar18 = 0;
      puVar5 = puVar18;
      if (puVar4 == puVar17) goto code_r0x00024ae0;
code_r0x000249b4:
      puVar11 = puVar4;
      if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - (long)puVar15) < 0x40)) {
code_r0x00025ef8:
        do {
          puVar5 = puVar5 + -1;
          puVar11 = puVar11 + -1;
          *puVar5 = *puVar11;
        } while (puVar11 != puVar17);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
        puVar7 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
        puVar9 = (undefined8 *)(puVar4 + -0x20);
        puVar13 = (undefined8 *)(puVar15 + (long)puVar18 + -0x20);
        puVar11 = puVar7;
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
        if (puVar18 != puVar7) {
          if (((ulong)puVar18 & 0x38) == 0) {
            puVar5 = puVar5 + -(long)puVar7;
            puVar11 = puVar4 + -(long)puVar7;
            goto code_r0x00025ef8;
          }
          goto code_r0x00025834;
        }
      }
      else {
        puVar7 = (undefined1 *)0x0;
code_r0x00025834:
        puVar10 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
        puVar11 = puVar4 + -(long)puVar10;
        puVar5 = puVar5 + -(long)puVar10;
        puVar13 = (undefined8 *)(puVar4 + -(long)puVar7);
        puVar9 = (undefined8 *)(puVar15 + ((long)puVar13 - (long)puVar17));
        lVar2 = (long)puVar7 - (long)puVar10;
        do {
          puVar13 = puVar13 + -1;
          puVar9 = puVar9 + -1;
          *puVar9 = *puVar13;
          lVar2 = lVar2 + 8;
        } while (lVar2 != 0);
        if (puVar18 != puVar10) goto code_r0x00025ef8;
      }
      puVar4 = (undefined1 *)*unaff_x19;
      *unaff_x19 = (long)puVar15;
      unaff_x19[1] = (long)puVar16;
      unaff_x19[2] = (long)(puVar15 + (long)puVar8);
    }
    else {
      puVar15 = (undefined1 *)__Znwm(puVar8);
      puVar5 = puVar15 + (long)puVar18;
      puVar16 = puVar5 + 1;
      *puVar5 = 0;
      if (puVar4 != puVar17) goto code_r0x000249b4;
code_r0x00024ae0:
      *unaff_x19 = (long)puVar5;
      unaff_x19[1] = (long)puVar16;
      unaff_x19[2] = (long)(puVar15 + (long)puVar8);
      puVar15 = puVar5;
    }
    if (puVar4 != (undefined1 *)0x0) {
      __ZdlPv(puVar15,puVar4);
    }
  }
  unaff_x28 = 0x3fffffffffffffff;
  unaff_x19[1] = (long)puVar16;
  if (puVar16 < (undefined1 *)unaff_x19[2]) {
    unaff_x22 = puVar16 + 1;
    *puVar16 = 0;
    unaff_x19[1] = (long)unaff_x22;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= unaff_x22) goto code_r0x00024c2c;
  }
  else {
    puVar5 = (undefined1 *)*unaff_x19;
    puVar17 = puVar16 + -(long)puVar5;
    puVar4 = puVar17 + 1;
    if ((long)puVar4 < 0) {
      func_0x00017f90();
      goto code_r0x00026138;
    }
    uVar6 = unaff_x19[2] - (long)puVar5;
    puVar18 = (undefined1 *)(uVar6 * 2);
    if (puVar18 <= puVar4) {
      puVar18 = puVar4;
    }
    if (0x3ffffffffffffffe < uVar6) {
      puVar18 = (undefined1 *)0x7fffffffffffffff;
    }
    if (puVar18 == (undefined1 *)0x0) {
      lVar2 = 0;
      *puVar17 = 0;
      puVar18 = (undefined1 *)0x0;
      puVar4 = puVar17;
    }
    else {
      lVar2 = __Znwm(puVar18);
      puVar4 = puVar17 + lVar2;
      puVar18 = puVar18 + lVar2;
      *puVar4 = 0;
    }
    unaff_x22 = puVar4 + 1;
    if (puVar16 == puVar5) {
      *unaff_x19 = (long)puVar4;
      unaff_x19[1] = (long)unaff_x22;
      unaff_x19[2] = (long)puVar18;
code_r0x00024c14:
      __ZdlPv(puVar16);
      unaff_x19[1] = (long)unaff_x22;
      goto code_r0x00024c20;
    }
    if ((puVar17 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar5 - lVar2) < 0x40)) {
code_r0x00024b9c:
      do {
        puVar4 = puVar4 + -1;
        puVar16 = puVar16 + -1;
        *puVar4 = *puVar16;
      } while (puVar16 != puVar5);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar17) {
      puVar15 = (undefined1 *)((ulong)puVar17 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(puVar16 + -0x20);
      puVar13 = (undefined8 *)(puVar17 + lVar2 + -0x20);
      puVar8 = puVar15;
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
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar17 != puVar15) {
        if (((ulong)puVar17 & 0x38) == 0) {
          puVar4 = puVar4 + -(long)puVar15;
          puVar16 = puVar16 + -(long)puVar15;
          goto code_r0x00024b9c;
        }
        goto code_r0x000258bc;
      }
    }
    else {
      puVar15 = (undefined1 *)0x0;
code_r0x000258bc:
      puVar8 = (undefined1 *)((ulong)puVar17 & 0xfffffffffffffff8);
      puVar4 = puVar4 + -(long)puVar8;
      puVar13 = (undefined8 *)(puVar16 + -(long)puVar15);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar5));
      lVar12 = (long)puVar15 - (long)puVar8;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      puVar16 = puVar16 + -(long)puVar8;
      if (puVar17 != puVar8) goto code_r0x00024b9c;
    }
    puVar16 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)unaff_x22;
    unaff_x19[2] = (long)puVar18;
    if (puVar16 != (undefined1 *)0x0) goto code_r0x00024c14;
    unaff_x19[1] = (long)unaff_x22;
    puVar4 = (undefined1 *)unaff_x19[2];
    if (puVar4 <= unaff_x22) goto code_r0x00024c2c;
  }
LAB_00024bcc:
  puVar15 = unaff_x22 + 1;
  *unaff_x22 = 0;
  unaff_x19[1] = (long)puVar15;
  uVar20 = (undefined4)*unaff_x21;
  uVar19 = (undefined1)*unaff_x21;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar15 < puVar4) goto LAB_00024cd8;
LAB_00024dd4:
  puVar17 = (undefined1 *)*unaff_x19;
  puVar18 = puVar15 + -(long)puVar17;
  puVar5 = puVar18 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar17) * 2);
  if (puVar8 <= puVar5) {
    puVar8 = puVar5;
  }
  if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar17)) {
    puVar8 = (undefined1 *)0x7fffffffffffffff;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar2 = 0;
    puVar4 = puVar18 + 1;
    *puVar18 = uVar19;
    puVar8 = (undefined1 *)0x0;
    puVar16 = (undefined1 *)0x0;
    puVar5 = puVar18;
    if (puVar15 == puVar17) goto LAB_00024ed0;
code_r0x00024e24:
    if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
LAB_00024e50:
      do {
        puVar5 = puVar5 + -1;
        puVar15 = puVar15 + -1;
        *puVar5 = *puVar15;
      } while (puVar15 != puVar17);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
      puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(puVar15 + -0x20);
      puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
      puVar8 = puVar11;
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
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar18 != puVar11) {
        if (((ulong)puVar18 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar11;
          puVar15 = puVar15 + -(long)puVar11;
          goto LAB_00024e50;
        }
        goto code_r0x000259c4;
      }
    }
    else {
      puVar11 = (undefined1 *)0x0;
code_r0x000259c4:
      puVar8 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar8;
      puVar13 = (undefined8 *)(puVar15 + -(long)puVar11);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
      lVar12 = (long)puVar11 - (long)puVar8;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      puVar15 = puVar15 + -(long)puVar8;
      if (puVar18 != puVar8) goto LAB_00024e50;
    }
    puVar15 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar16;
    if (puVar15 != (undefined1 *)0x0) goto LAB_00024edc;
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00024cf8;
  }
  else {
    lVar2 = __Znwm(puVar8);
    puVar5 = puVar18 + lVar2;
    puVar8 = puVar8 + lVar2;
    puVar4 = puVar5 + 1;
    *puVar5 = uVar19;
    puVar16 = puVar8;
    if (puVar15 != puVar17) goto code_r0x00024e24;
LAB_00024ed0:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
LAB_00024edc:
    __ZdlPv(puVar15);
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00024cf8;
  }
LAB_00024e80:
  puVar17 = puVar4 + 1;
  *puVar4 = 0;
LAB_00024e88:
  unaff_x19[1] = (long)puVar17;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar4 <= puVar17) goto LAB_00024f34;
code_r0x00024e98:
  puVar16 = puVar17 + 1;
  *puVar17 = 0;
  unaff_x19[1] = (long)puVar16;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar16 < puVar4) goto LAB_00024fd8;
LAB_00025034:
  puVar17 = (undefined1 *)*unaff_x19;
  puVar18 = puVar16 + -(long)puVar17;
  puVar5 = puVar18 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar17) * 2);
  if (puVar8 <= puVar5) {
    puVar8 = puVar5;
  }
  if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar17)) {
    puVar8 = (undefined1 *)0x7fffffffffffffff;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar2 = 0;
    puVar4 = puVar18 + 1;
    *puVar18 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar15 = (undefined1 *)0x0;
    puVar5 = puVar18;
    if (puVar16 == puVar17) goto LAB_00025114;
LAB_00025080:
    if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
LAB_000250a8:
      do {
        puVar5 = puVar5 + -1;
        puVar16 = puVar16 + -1;
        *puVar5 = *puVar16;
      } while (puVar16 != puVar17);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
      puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(puVar16 + -0x20);
      puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
      puVar8 = puVar11;
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
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar18 != puVar11) {
        if (((ulong)puVar18 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar11;
          puVar16 = puVar16 + -(long)puVar11;
          goto LAB_000250a8;
        }
        goto code_r0x00025b50;
      }
    }
    else {
      puVar11 = (undefined1 *)0x0;
code_r0x00025b50:
      puVar8 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar8;
      puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
      lVar12 = (long)puVar11 - (long)puVar8;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      puVar16 = puVar16 + -(long)puVar8;
      if (puVar18 != puVar8) goto LAB_000250a8;
    }
    puVar16 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar15;
    if (puVar16 != (undefined1 *)0x0) goto LAB_0002511c;
    unaff_x19[1] = (long)puVar4;
    uVar19 = (undefined1)*(undefined4 *)((long)unaff_x21 + 4);
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00025138;
  }
  else {
    lVar2 = __Znwm(puVar8);
    puVar5 = puVar18 + lVar2;
    puVar8 = puVar8 + lVar2;
    puVar4 = puVar5 + 1;
    *puVar5 = 0;
    puVar15 = puVar8;
    if (puVar16 != puVar17) goto LAB_00025080;
LAB_00025114:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
LAB_0002511c:
    __ZdlPv(puVar16);
    unaff_x19[1] = (long)puVar4;
    uVar19 = (undefined1)*(undefined4 *)((long)unaff_x21 + 4);
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00025138;
  }
LAB_000250dc:
  puVar16 = puVar4 + 1;
  *puVar4 = uVar19;
  unaff_x19[1] = (long)puVar16;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar16 < puVar4) goto LAB_000251dc;
LAB_00025234:
  puVar17 = (undefined1 *)*unaff_x19;
  puVar18 = puVar16 + -(long)puVar17;
  puVar5 = puVar18 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar17) * 2);
  if (puVar8 <= puVar5) {
    puVar8 = puVar5;
  }
  if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar17)) {
    puVar8 = (undefined1 *)0x7fffffffffffffff;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar2 = 0;
    puVar4 = puVar18 + 1;
    *puVar18 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar15 = (undefined1 *)0x0;
    puVar5 = puVar18;
    if (puVar16 == puVar17) goto LAB_00025310;
LAB_00025280:
    if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
LAB_000252a8:
      do {
        puVar5 = puVar5 + -1;
        puVar16 = puVar16 + -1;
        *puVar5 = *puVar16;
      } while (puVar16 != puVar17);
    }
    else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
      puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
      puVar9 = (undefined8 *)(puVar16 + -0x20);
      puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
      puVar8 = puVar11;
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
        puVar8 = puVar8 + -0x40;
      } while (puVar8 != (undefined1 *)0x0);
      if (puVar18 != puVar11) {
        if (((ulong)puVar18 & 0x38) == 0) {
          puVar5 = puVar5 + -(long)puVar11;
          puVar16 = puVar16 + -(long)puVar11;
          goto LAB_000252a8;
        }
        goto code_r0x00025c58;
      }
    }
    else {
      puVar11 = (undefined1 *)0x0;
code_r0x00025c58:
      puVar8 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
      puVar5 = puVar5 + -(long)puVar8;
      puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
      puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
      lVar12 = (long)puVar11 - (long)puVar8;
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
        lVar12 = lVar12 + 8;
      } while (lVar12 != 0);
      puVar16 = puVar16 + -(long)puVar8;
      if (puVar18 != puVar8) goto LAB_000252a8;
    }
    puVar16 = (undefined1 *)*unaff_x19;
    *unaff_x19 = lVar2;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar15;
    if (puVar16 != (undefined1 *)0x0) goto LAB_00025318;
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00025330;
  }
  else {
    lVar2 = __Znwm(puVar8);
    puVar5 = puVar18 + lVar2;
    puVar8 = puVar8 + lVar2;
    puVar4 = puVar5 + 1;
    *puVar5 = 0;
    puVar15 = puVar8;
    if (puVar16 != puVar17) goto LAB_00025280;
LAB_00025310:
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
LAB_00025318:
    __ZdlPv(puVar16);
    unaff_x19[1] = (long)puVar4;
    puVar5 = (undefined1 *)unaff_x19[2];
    if (puVar5 <= puVar4) goto LAB_00025330;
  }
LAB_000252d8:
  puVar16 = puVar4 + 1;
  *puVar4 = 0;
  unaff_x19[1] = (long)puVar16;
  puVar4 = (undefined1 *)unaff_x19[2];
  if (puVar16 < puVar4) goto FUN_000253d4;
LAB_0002541c:
  puVar17 = (undefined1 *)*unaff_x19;
  puVar18 = puVar16 + -(long)puVar17;
  puVar5 = puVar18 + 1;
  if ((long)puVar5 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  puVar8 = (undefined1 *)(((long)puVar4 - (long)puVar17) * 2);
  if (puVar8 <= puVar5) {
    puVar8 = puVar5;
  }
  if (0x3ffffffffffffffe < (ulong)((long)puVar4 - (long)puVar17)) {
    puVar8 = (undefined1 *)0x7fffffffffffffff;
  }
  if (puVar8 == (undefined1 *)0x0) {
    lVar2 = 0;
    *puVar18 = 0;
    puVar8 = (undefined1 *)0x0;
    puVar5 = puVar18;
  }
  else {
    lVar2 = __Znwm(puVar8);
    puVar5 = puVar18 + lVar2;
    puVar8 = puVar8 + lVar2;
    *puVar5 = 0;
  }
  puVar4 = puVar5 + 1;
  if (puVar16 == puVar17) {
    *unaff_x19 = (long)puVar5;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = (long)puVar8;
    goto code_r0x000254d8;
  }
  if ((puVar18 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar17 - lVar2) < 0x40)) {
code_r0x00025490:
    do {
      puVar5 = puVar5 + -1;
      puVar16 = puVar16 + -1;
      *puVar5 = *puVar16;
    } while (puVar16 != puVar17);
  }
  else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar18) {
    puVar11 = (undefined1 *)((ulong)puVar18 & 0xffffffffffffffc0);
    puVar9 = (undefined8 *)(puVar16 + -0x20);
    puVar13 = (undefined8 *)(puVar18 + lVar2 + -0x20);
    puVar15 = puVar11;
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
      puVar15 = puVar15 + -0x40;
    } while (puVar15 != (undefined1 *)0x0);
    if (puVar18 != puVar11) {
      if (((ulong)puVar18 & 0x38) == 0) {
        puVar5 = puVar5 + -(long)puVar11;
        puVar16 = puVar16 + -(long)puVar11;
        goto code_r0x00025490;
      }
      goto code_r0x00025d60;
    }
  }
  else {
    puVar11 = (undefined1 *)0x0;
code_r0x00025d60:
    puVar15 = (undefined1 *)((ulong)puVar18 & 0xfffffffffffffff8);
    puVar5 = puVar5 + -(long)puVar15;
    puVar13 = (undefined8 *)(puVar16 + -(long)puVar11);
    puVar9 = (undefined8 *)((long)puVar13 + (lVar2 - (long)puVar17));
    lVar12 = (long)puVar11 - (long)puVar15;
    do {
      puVar13 = puVar13 + -1;
      puVar9 = puVar9 + -1;
      *puVar9 = *puVar13;
      lVar12 = lVar12 + 8;
    } while (lVar12 != 0);
    puVar16 = puVar16 + -(long)puVar15;
    if (puVar18 != puVar15) goto code_r0x00025490;
  }
  puVar16 = (undefined1 *)*unaff_x19;
  *unaff_x19 = lVar2;
  unaff_x19[1] = (long)puVar4;
  unaff_x19[2] = (long)puVar8;
  if (puVar16 == (undefined1 *)0x0) goto LAB_000254e0;
code_r0x000254d8:
  __ZdlPv(puVar16);
  goto LAB_000254e0;
}

