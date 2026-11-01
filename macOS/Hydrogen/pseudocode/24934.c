
void FUN_00024934(ulong param_1)

{
  long *plVar1;
  code *pcVar2;
  undefined1 *puVar3;
  uint uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined1 *in_x9;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *in_x10;
  undefined8 *puVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  undefined1 *puVar14;
  undefined8 *puVar15;
  long *unaff_x19;
  long unaff_x20;
  long lVar16;
  long lVar17;
  undefined1 *unaff_x22;
  long lVar18;
  undefined1 *unaff_x23;
  undefined1 *puVar19;
  long unaff_x25;
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
  
code_r0x00024934:
  if (in_x10 <= in_x9) {
    in_x10 = in_x9;
  }
  if (unaff_x28 <= param_1) {
    in_x10 = unaff_x27;
  }
  if (in_x10 == (undefined1 *)0x0) {
    puVar3 = (undefined1 *)0x0;
    *unaff_x26 = 0;
    puVar6 = unaff_x26;
  }
  else {
    puVar3 = (undefined1 *)__Znwm(in_x10);
    puVar6 = puVar3 + (long)unaff_x26;
    *puVar6 = 0;
  }
  puVar19 = puVar6 + 1;
  if (unaff_x22 == unaff_x23) goto LAB_00025618;
  puVar14 = unaff_x22;
  if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < unaff_x26) &&
     (0x3f < (ulong)((long)unaff_x23 - (long)puVar3))) {
    if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x26) {
      puVar8 = (undefined1 *)((ulong)unaff_x26 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(unaff_x22 + -0x20);
      puVar15 = (undefined8 *)(puVar3 + (long)unaff_x26 + -0x20);
      puVar14 = puVar8;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar15[1] = puVar10[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar15 = puVar15 + -8;
        puVar14 = puVar14 + -0x40;
      } while (puVar14 != (undefined1 *)0x0);
      if (unaff_x26 == puVar8) goto code_r0x00025fc8;
      if (((ulong)unaff_x26 & 0x38) == 0) {
        puVar6 = puVar6 + -(long)puVar8;
        puVar14 = unaff_x22 + -(long)puVar8;
        goto code_r0x00025ed8;
      }
    }
    else {
      puVar8 = (undefined1 *)0x0;
    }
    puVar11 = (undefined1 *)((ulong)unaff_x26 & 0xfffffffffffffff8);
    puVar14 = unaff_x22 + -(long)puVar11;
    puVar6 = puVar6 + -(long)puVar11;
    puVar15 = (undefined8 *)(unaff_x22 + -(long)puVar8);
    puVar10 = (undefined8 *)(puVar3 + ((long)puVar15 - (long)unaff_x23));
    lVar18 = (long)puVar8 - (long)puVar11;
    do {
      puVar15 = puVar15 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar15;
      lVar18 = lVar18 + 8;
    } while (lVar18 != 0);
    if (unaff_x26 == puVar11) goto code_r0x00025fc8;
  }
code_r0x00025ed8:
  do {
    puVar6 = puVar6 + -1;
    puVar14 = puVar14 + -1;
    *puVar6 = *puVar14;
  } while (puVar14 != unaff_x23);
code_r0x00025fc8:
  unaff_x22 = (undefined1 *)*unaff_x19;
  *unaff_x19 = (long)puVar3;
  unaff_x19[1] = (long)puVar19;
  unaff_x19[2] = (long)(puVar3 + (long)in_x10);
  puVar6 = puVar3;
joined_r0x00025fdc:
  if (unaff_x22 != (undefined1 *)0x0) {
    __ZdlPv(puVar6,unaff_x22);
  }
  unaff_x19[1] = (long)puVar19;
LAB_00024734:
  unaff_x25 = unaff_x25 + 1;
  if (*(int *)(unaff_x20 + 0x98) <= unaff_x25) {
    if (0 < *(int *)(unaff_x20 + 0x8c)) {
      lVar18 = 0;
      do {
        func_0x000245c0(&uStack0000000000000008,
                        *(undefined8 *)(*(long *)(unaff_x20 + 0x18) + lVar18 * 8));
        func_0x00026614();
        if (uStack0000000000000008 != 0) {
          in_stack_00000010 = uStack0000000000000008;
          __ZdlPv();
        }
        lVar18 = lVar18 + 1;
      } while (lVar18 < *(int *)(unaff_x20 + 0x8c));
    }
    func_0x000262e0();
    return;
  }
  lVar18 = *(long *)(unaff_x20 + 8);
  plVar1 = (long *)(lVar18 + unaff_x25 * 0x10);
  switch(*(undefined4 *)((long)plVar1 + 0xc)) {
  case 0:
    unaff_x22 = (undefined1 *)unaff_x19[1];
    if ((undefined1 *)unaff_x19[2] <= unaff_x22) {
      unaff_x23 = (undefined1 *)*unaff_x19;
      unaff_x26 = unaff_x22 + -(long)unaff_x23;
      in_x9 = unaff_x26 + 1;
      if ((long)in_x9 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      param_1 = unaff_x19[2] - (long)unaff_x23;
      in_x10 = (undefined1 *)(param_1 * 2);
      goto code_r0x00024934;
    }
    *unaff_x22 = 0;
    unaff_x19[1] = (long)(unaff_x22 + 1);
    goto LAB_00024734;
  case 1:
    goto code_r0x0002481c;
  default:
    goto LAB_00024734;
  case 3:
    func_0x000262e0();
    goto LAB_00024734;
  case 4:
    puVar6 = (undefined1 *)unaff_x19[1];
    if (puVar6 < (undefined1 *)unaff_x19[2]) {
      puVar11 = puVar6 + 1;
      *puVar6 = 0;
    }
    else {
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar6 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar19;
      puVar8 = (undefined1 *)(uVar5 * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (0x3ffffffffffffffe < uVar5) {
        puVar8 = unaff_x27;
      }
      if (puVar8 == (undefined1 *)0x0) {
        puVar9 = (undefined1 *)0x0;
        puVar11 = puVar14 + 1;
        *puVar14 = 0;
        puVar3 = puVar14;
        if (puVar6 != puVar19) goto code_r0x000249b4;
code_r0x00024ae0:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar11;
        unaff_x19[2] = (long)(puVar9 + (long)puVar8);
      }
      else {
        puVar9 = (undefined1 *)__Znwm(puVar8);
        puVar3 = puVar9 + (long)puVar14;
        puVar11 = puVar3 + 1;
        *puVar3 = 0;
        if (puVar6 == puVar19) goto code_r0x00024ae0;
code_r0x000249b4:
        puVar13 = puVar6;
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - (long)puVar9) < 0x40)) {
code_r0x00025ef8:
          do {
            puVar3 = puVar3 + -1;
            puVar13 = puVar13 + -1;
            *puVar3 = *puVar13;
          } while (puVar13 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar7 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar6 + -0x20);
          puVar15 = (undefined8 *)(puVar9 + (long)puVar14 + -0x20);
          puVar13 = puVar7;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar13 = puVar13 + -0x40;
          } while (puVar13 != (undefined1 *)0x0);
          if (puVar14 != puVar7) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar7;
              puVar13 = puVar6 + -(long)puVar7;
              goto code_r0x00025ef8;
            }
            goto code_r0x00025834;
          }
        }
        else {
          puVar7 = (undefined1 *)0x0;
code_r0x00025834:
          puVar12 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar13 = puVar6 + -(long)puVar12;
          puVar3 = puVar3 + -(long)puVar12;
          puVar15 = (undefined8 *)(puVar6 + -(long)puVar7);
          puVar10 = (undefined8 *)(puVar9 + ((long)puVar15 - (long)puVar19));
          lVar16 = (long)puVar7 - (long)puVar12;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar16 = lVar16 + 8;
          } while (lVar16 != 0);
          if (puVar14 != puVar12) goto code_r0x00025ef8;
        }
        puVar6 = (undefined1 *)*unaff_x19;
        *unaff_x19 = (long)puVar9;
        unaff_x19[1] = (long)puVar11;
        unaff_x19[2] = (long)(puVar9 + (long)puVar8);
        puVar3 = puVar9;
      }
      unaff_x28 = 0x3fffffffffffffff;
      if (puVar6 != (undefined1 *)0x0) {
        unaff_x28 = 0x3fffffffffffffff;
        __ZdlPv(puVar3,puVar6);
      }
    }
    unaff_x19[1] = (long)puVar11;
    if (puVar11 < (undefined1 *)unaff_x19[2]) {
      puVar9 = puVar11 + 1;
      *puVar11 = 0;
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar9) goto code_r0x00024c2c;
LAB_00024bcc:
      puVar6 = puVar9 + 1;
      *puVar9 = 0;
      unaff_x19[1] = (long)puVar6;
      uVar20 = (undefined1)*plVar1;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar3 <= puVar6) goto LAB_00024dd4;
LAB_00024cd8:
      puVar9 = puVar6 + 1;
      *puVar6 = uVar20;
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar9 < puVar6) goto LAB_00024e80;
LAB_00024cf8:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar9 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 != (undefined1 *)0x0) {
        lVar16 = __Znwm(puVar8);
        puVar6 = puVar14 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar11 = puVar6 + 1;
        *puVar6 = 0;
        puVar3 = puVar8;
        if (puVar9 == puVar19) goto LAB_00024f14;
code_r0x00024d44:
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar16) < 0x40)) {
LAB_00024d6c:
          do {
            puVar6 = puVar6 + -1;
            puVar9 = puVar9 + -1;
            *puVar6 = *puVar9;
          } while (puVar9 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar13 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar9 + -0x20);
          puVar15 = (undefined8 *)(puVar14 + lVar16 + -0x20);
          puVar8 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar14 != puVar13) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar13;
              puVar9 = puVar9 + -(long)puVar13;
              goto LAB_00024d6c;
            }
            goto code_r0x00025a48;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025a48:
          puVar8 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar8;
          puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar19));
          lVar17 = (long)puVar13 - (long)puVar8;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar9 = puVar9 + -(long)puVar8;
          if (puVar14 != puVar8) goto LAB_00024d6c;
        }
        puVar9 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar11;
        unaff_x19[2] = (long)puVar3;
        if (puVar9 != (undefined1 *)0x0) goto LAB_00024f1c;
        goto LAB_00024e88;
      }
      lVar16 = 0;
      puVar11 = puVar14 + 1;
      *puVar14 = 0;
      puVar8 = (undefined1 *)0x0;
      puVar3 = (undefined1 *)0x0;
      puVar6 = puVar14;
      if (puVar9 != puVar19) goto code_r0x00024d44;
LAB_00024f14:
      *unaff_x19 = (long)puVar6;
      unaff_x19[1] = (long)puVar11;
      unaff_x19[2] = (long)puVar8;
LAB_00024f1c:
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)puVar11;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar11 < puVar6) goto code_r0x00024e98;
LAB_00024f34:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar11 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar6 = puVar14 + 1;
        *puVar14 = 0;
        puVar8 = (undefined1 *)0x0;
        puVar9 = (undefined1 *)0x0;
        puVar3 = puVar14;
        if (puVar11 != puVar19) goto LAB_00024f80;
LAB_00025014:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar8;
      }
      else {
        lVar16 = __Znwm(puVar8);
        puVar3 = puVar14 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar6 = puVar3 + 1;
        *puVar3 = 0;
        puVar9 = puVar8;
        if (puVar11 == puVar19) goto LAB_00025014;
LAB_00024f80:
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar16) < 0x40)) {
LAB_00024fa8:
          do {
            puVar3 = puVar3 + -1;
            puVar11 = puVar11 + -1;
            *puVar3 = *puVar11;
          } while (puVar11 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar13 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar11 + -0x20);
          puVar15 = (undefined8 *)(puVar14 + lVar16 + -0x20);
          puVar8 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar14 != puVar13) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar13;
              puVar11 = puVar11 + -(long)puVar13;
              goto LAB_00024fa8;
            }
            goto code_r0x00025acc;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025acc:
          puVar8 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar3 = puVar3 + -(long)puVar8;
          puVar15 = (undefined8 *)(puVar11 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar19));
          lVar17 = (long)puVar13 - (long)puVar8;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar11 = puVar11 + -(long)puVar8;
          if (puVar14 != puVar8) goto LAB_00024fa8;
        }
        puVar11 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar9;
        if (puVar11 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar6) goto LAB_00025034;
          goto LAB_00024fd8;
        }
      }
      __ZdlPv(puVar11);
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar3) goto LAB_00024fd8;
LAB_00025034:
      puVar14 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar14;
      puVar19 = puVar8 + 1;
      if ((long)puVar19 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar11 = (undefined1 *)(((long)puVar3 - (long)puVar14) * 2);
      if (puVar11 <= puVar19) {
        puVar11 = puVar19;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar14)) {
        puVar11 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar11 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar9 = puVar8 + 1;
        *puVar8 = 0;
        puVar11 = (undefined1 *)0x0;
        puVar19 = (undefined1 *)0x0;
        puVar3 = puVar8;
        if (puVar6 != puVar14) goto LAB_00025080;
LAB_00025114:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar11;
LAB_0002511c:
        __ZdlPv(puVar6);
        unaff_x19[1] = (long)puVar9;
        uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
        puVar6 = (undefined1 *)unaff_x19[2];
        if (puVar6 <= puVar9) goto LAB_00025138;
        goto LAB_000250dc;
      }
      lVar16 = __Znwm(puVar11);
      puVar3 = puVar8 + lVar16;
      puVar11 = puVar11 + lVar16;
      puVar9 = puVar3 + 1;
      *puVar3 = 0;
      puVar19 = puVar11;
      if (puVar6 == puVar14) goto LAB_00025114;
LAB_00025080:
      if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar14 - lVar16) < 0x40)) {
LAB_000250a8:
        do {
          puVar3 = puVar3 + -1;
          puVar6 = puVar6 + -1;
          *puVar3 = *puVar6;
        } while (puVar6 != puVar14);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
        puVar13 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar8 + lVar16 + -0x20);
        puVar11 = puVar13;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar15[1] = puVar10[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar15 = puVar15 + -8;
          puVar11 = puVar11 + -0x40;
        } while (puVar11 != (undefined1 *)0x0);
        if (puVar8 != puVar13) {
          if (((ulong)puVar8 & 0x38) == 0) {
            puVar3 = puVar3 + -(long)puVar13;
            puVar6 = puVar6 + -(long)puVar13;
            goto LAB_000250a8;
          }
          goto code_r0x00025b50;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x00025b50:
        puVar11 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
        puVar3 = puVar3 + -(long)puVar11;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
        puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar14));
        lVar17 = (long)puVar13 - (long)puVar11;
        do {
          puVar15 = puVar15 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar15;
          lVar17 = lVar17 + 8;
        } while (lVar17 != 0);
        puVar6 = puVar6 + -(long)puVar11;
        if (puVar8 != puVar11) goto LAB_000250a8;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar16;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar19;
      if (puVar6 != (undefined1 *)0x0) goto LAB_0002511c;
      unaff_x19[1] = (long)puVar9;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar9 < puVar6) goto LAB_000250dc;
LAB_00025138:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar9 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar6 = puVar14 + 1;
        *puVar14 = uVar20;
        puVar8 = (undefined1 *)0x0;
        puVar11 = (undefined1 *)0x0;
        puVar3 = puVar14;
        if (puVar9 != puVar19) goto code_r0x00025184;
code_r0x00025214:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar8;
      }
      else {
        lVar16 = __Znwm(puVar8);
        puVar3 = puVar14 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar6 = puVar3 + 1;
        *puVar3 = uVar20;
        puVar11 = puVar8;
        if (puVar9 == puVar19) goto code_r0x00025214;
code_r0x00025184:
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar16) < 0x40)) {
LAB_000251ac:
          do {
            puVar3 = puVar3 + -1;
            puVar9 = puVar9 + -1;
            *puVar3 = *puVar9;
          } while (puVar9 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar13 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar9 + -0x20);
          puVar15 = (undefined8 *)(puVar14 + lVar16 + -0x20);
          puVar8 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar14 != puVar13) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar13;
              puVar9 = puVar9 + -(long)puVar13;
              goto LAB_000251ac;
            }
            goto code_r0x00025bd4;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025bd4:
          puVar8 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar3 = puVar3 + -(long)puVar8;
          puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar19));
          lVar17 = (long)puVar13 - (long)puVar8;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar9 = puVar9 + -(long)puVar8;
          if (puVar14 != puVar8) goto LAB_000251ac;
        }
        puVar9 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar11;
        if (puVar9 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar6) goto LAB_00025234;
          goto LAB_000251dc;
        }
      }
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar3) goto LAB_000251dc;
LAB_00025234:
      puVar14 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar14;
      puVar19 = puVar8 + 1;
      if ((long)puVar19 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar11 = (undefined1 *)(((long)puVar3 - (long)puVar14) * 2);
      if (puVar11 <= puVar19) {
        puVar11 = puVar19;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar14)) {
        puVar11 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar11 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar9 = puVar8 + 1;
        *puVar8 = 0;
        puVar11 = (undefined1 *)0x0;
        puVar19 = (undefined1 *)0x0;
        puVar3 = puVar8;
        if (puVar6 != puVar14) goto LAB_00025280;
LAB_00025310:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar11;
LAB_00025318:
        __ZdlPv(puVar6);
        unaff_x19[1] = (long)puVar9;
        puVar6 = (undefined1 *)unaff_x19[2];
        if (puVar6 <= puVar9) goto LAB_00025330;
        goto LAB_000252d8;
      }
      lVar16 = __Znwm(puVar11);
      puVar3 = puVar8 + lVar16;
      puVar11 = puVar11 + lVar16;
      puVar9 = puVar3 + 1;
      *puVar3 = 0;
      puVar19 = puVar11;
      if (puVar6 == puVar14) goto LAB_00025310;
LAB_00025280:
      if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar14 - lVar16) < 0x40)) {
LAB_000252a8:
        do {
          puVar3 = puVar3 + -1;
          puVar6 = puVar6 + -1;
          *puVar3 = *puVar6;
        } while (puVar6 != puVar14);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
        puVar13 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar8 + lVar16 + -0x20);
        puVar11 = puVar13;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar15[1] = puVar10[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar15 = puVar15 + -8;
          puVar11 = puVar11 + -0x40;
        } while (puVar11 != (undefined1 *)0x0);
        if (puVar8 != puVar13) {
          if (((ulong)puVar8 & 0x38) == 0) {
            puVar3 = puVar3 + -(long)puVar13;
            puVar6 = puVar6 + -(long)puVar13;
            goto LAB_000252a8;
          }
          goto code_r0x00025c58;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x00025c58:
        puVar11 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
        puVar3 = puVar3 + -(long)puVar11;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
        puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar14));
        lVar17 = (long)puVar13 - (long)puVar11;
        do {
          puVar15 = puVar15 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar15;
          lVar17 = lVar17 + 8;
        } while (lVar17 != 0);
        puVar6 = puVar6 + -(long)puVar11;
        if (puVar8 != puVar11) goto LAB_000252a8;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar16;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar19;
      if (puVar6 != (undefined1 *)0x0) goto LAB_00025318;
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar9 < puVar6) goto LAB_000252d8;
LAB_00025330:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar9 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar6 - (long)puVar19)) {
        puVar8 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar6 = puVar14 + 1;
        *puVar14 = 0;
        puVar8 = (undefined1 *)0x0;
        puVar11 = (undefined1 *)0x0;
        puVar3 = puVar14;
        if (puVar9 != puVar19) goto code_r0x0002537c;
LAB_000253fc:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar8;
      }
      else {
        lVar16 = __Znwm(puVar8);
        puVar3 = puVar14 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar6 = puVar3 + 1;
        *puVar3 = 0;
        puVar11 = puVar8;
        if (puVar9 == puVar19) goto LAB_000253fc;
code_r0x0002537c:
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar16) < 0x40)) {
code_r0x000253a4:
          do {
            puVar3 = puVar3 + -1;
            puVar9 = puVar9 + -1;
            *puVar3 = *puVar9;
          } while (puVar9 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar13 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar9 + -0x20);
          puVar15 = (undefined8 *)(puVar14 + lVar16 + -0x20);
          puVar8 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar14 != puVar13) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar13;
              puVar9 = puVar9 + -(long)puVar13;
              goto code_r0x000253a4;
            }
            goto code_r0x00025cdc;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025cdc:
          puVar8 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar3 = puVar3 + -(long)puVar8;
          puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar19));
          lVar17 = (long)puVar13 - (long)puVar8;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar9 = puVar9 + -(long)puVar8;
          if (puVar14 != puVar8) goto code_r0x000253a4;
        }
        puVar9 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar11;
        if (puVar9 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar6) goto LAB_0002541c;
          goto FUN_000253d4;
        }
      }
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar3) goto FUN_000253d4;
LAB_0002541c:
      puVar14 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar14;
      puVar19 = puVar8 + 1;
      if ((long)puVar19 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar11 = (undefined1 *)(((long)puVar3 - (long)puVar14) * 2);
      if (puVar11 <= puVar19) {
        puVar11 = puVar19;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar14)) {
        puVar11 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar11 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar9 = puVar8 + 1;
        *puVar8 = 0;
        puVar11 = (undefined1 *)0x0;
        puVar19 = (undefined1 *)0x0;
        puVar3 = puVar8;
        if (puVar6 != puVar14) goto code_r0x00025468;
code_r0x000254d0:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar11;
code_r0x000254d8:
        __ZdlPv(puVar6);
      }
      else {
        lVar16 = __Znwm(puVar11);
        puVar3 = puVar8 + lVar16;
        puVar11 = puVar11 + lVar16;
        puVar9 = puVar3 + 1;
        *puVar3 = 0;
        puVar19 = puVar11;
        if (puVar6 == puVar14) goto code_r0x000254d0;
code_r0x00025468:
        if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar14 - lVar16) < 0x40)) {
code_r0x00025490:
          do {
            puVar3 = puVar3 + -1;
            puVar6 = puVar6 + -1;
            *puVar3 = *puVar6;
          } while (puVar6 != puVar14);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
          puVar13 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar6 + -0x20);
          puVar15 = (undefined8 *)(puVar8 + lVar16 + -0x20);
          puVar11 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar11 = puVar11 + -0x40;
          } while (puVar11 != (undefined1 *)0x0);
          if (puVar8 != puVar13) {
            if (((ulong)puVar8 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar13;
              puVar6 = puVar6 + -(long)puVar13;
              goto code_r0x00025490;
            }
            goto code_r0x00025d60;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025d60:
          puVar11 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
          puVar3 = puVar3 + -(long)puVar11;
          puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar14));
          lVar17 = (long)puVar13 - (long)puVar11;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar6 = puVar6 + -(long)puVar11;
          if (puVar8 != puVar11) goto code_r0x00025490;
        }
        puVar6 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar19;
        if (puVar6 != (undefined1 *)0x0) goto code_r0x000254d8;
      }
    }
    else {
      puVar3 = (undefined1 *)*unaff_x19;
      puVar19 = puVar11 + -(long)puVar3;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar3;
      puVar14 = (undefined1 *)(uVar5 * 2);
      if (puVar14 <= puVar6) {
        puVar14 = puVar6;
      }
      if (unaff_x28 <= uVar5) {
        puVar14 = unaff_x27;
      }
      if (puVar14 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar9 = puVar19 + 1;
        *puVar19 = 0;
        puVar14 = (undefined1 *)0x0;
        puVar8 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar11 != puVar3) goto code_r0x00024b74;
code_r0x00024c0c:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar14;
      }
      else {
        lVar16 = __Znwm(puVar14);
        puVar6 = puVar19 + lVar16;
        puVar14 = puVar14 + lVar16;
        puVar9 = puVar6 + 1;
        *puVar6 = 0;
        puVar8 = puVar14;
        if (puVar11 == puVar3) goto code_r0x00024c0c;
code_r0x00024b74:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar3 - lVar16) < 0x40)) {
code_r0x00024b9c:
          do {
            puVar6 = puVar6 + -1;
            puVar11 = puVar11 + -1;
            *puVar6 = *puVar11;
          } while (puVar11 != puVar3);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar13 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar11 + -0x20);
          puVar15 = (undefined8 *)(puVar19 + lVar16 + -0x20);
          puVar14 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar14 = puVar14 + -0x40;
          } while (puVar14 != (undefined1 *)0x0);
          if (puVar19 != puVar13) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar13;
              puVar11 = puVar11 + -(long)puVar13;
              goto code_r0x00024b9c;
            }
            goto code_r0x000258bc;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x000258bc:
          puVar14 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar14;
          puVar15 = (undefined8 *)(puVar11 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar3));
          lVar17 = (long)puVar13 - (long)puVar14;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar11 = puVar11 + -(long)puVar14;
          if (puVar19 != puVar14) goto code_r0x00024b9c;
        }
        puVar11 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar8;
        if (puVar11 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar9;
          puVar6 = (undefined1 *)unaff_x19[2];
          if (puVar9 < puVar6) goto LAB_00024bcc;
          goto code_r0x00024c2c;
        }
      }
      __ZdlPv(puVar11);
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar9 < puVar6) goto LAB_00024bcc;
code_r0x00024c2c:
      puVar19 = (undefined1 *)*unaff_x19;
      puVar14 = puVar9 + -(long)puVar19;
      puVar3 = puVar14 + 1;
      if ((long)puVar3 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar8 = (undefined1 *)(((long)puVar6 - (long)puVar19) * 2);
      if (puVar8 <= puVar3) {
        puVar8 = puVar3;
      }
      if (unaff_x28 <= (ulong)((long)puVar6 - (long)puVar19)) {
        puVar8 = unaff_x27;
      }
      if (puVar8 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar6 = puVar14 + 1;
        *puVar14 = 0;
        puVar8 = (undefined1 *)0x0;
        puVar11 = (undefined1 *)0x0;
        puVar3 = puVar14;
        if (puVar9 != puVar19) goto LAB_00024c78;
LAB_00024dac:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar8;
      }
      else {
        lVar16 = __Znwm(puVar8);
        puVar3 = puVar14 + lVar16;
        puVar8 = puVar8 + lVar16;
        puVar6 = puVar3 + 1;
        *puVar3 = 0;
        puVar11 = puVar8;
        if (puVar9 == puVar19) goto LAB_00024dac;
LAB_00024c78:
        if ((puVar14 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar19 - lVar16) < 0x40)) {
LAB_00024ca0:
          do {
            puVar3 = puVar3 + -1;
            puVar9 = puVar9 + -1;
            *puVar3 = *puVar9;
          } while (puVar9 != puVar19);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar14) {
          puVar13 = (undefined1 *)((ulong)puVar14 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar9 + -0x20);
          puVar15 = (undefined8 *)(puVar14 + lVar16 + -0x20);
          puVar8 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar8 = puVar8 + -0x40;
          } while (puVar8 != (undefined1 *)0x0);
          if (puVar14 != puVar13) {
            if (((ulong)puVar14 & 0x38) == 0) {
              puVar3 = puVar3 + -(long)puVar13;
              puVar9 = puVar9 + -(long)puVar13;
              goto LAB_00024ca0;
            }
            goto code_r0x00025940;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
code_r0x00025940:
          puVar8 = (undefined1 *)((ulong)puVar14 & 0xfffffffffffffff8);
          puVar3 = puVar3 + -(long)puVar8;
          puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar19));
          lVar17 = (long)puVar13 - (long)puVar8;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar17 = lVar17 + 8;
          } while (lVar17 != 0);
          puVar9 = puVar9 + -(long)puVar8;
          if (puVar14 != puVar8) goto LAB_00024ca0;
        }
        puVar9 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar16;
        unaff_x19[1] = (long)puVar6;
        unaff_x19[2] = (long)puVar11;
        if (puVar9 == (undefined1 *)0x0) {
          unaff_x19[1] = (long)puVar6;
          uVar20 = (undefined1)*plVar1;
          puVar3 = (undefined1 *)unaff_x19[2];
          if (puVar3 <= puVar6) goto LAB_00024dd4;
          goto LAB_00024cd8;
        }
      }
      __ZdlPv(puVar9);
      unaff_x19[1] = (long)puVar6;
      uVar20 = (undefined1)*plVar1;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar6 < puVar3) goto LAB_00024cd8;
LAB_00024dd4:
      puVar14 = (undefined1 *)*unaff_x19;
      puVar8 = puVar6 + -(long)puVar14;
      puVar19 = puVar8 + 1;
      if ((long)puVar19 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      puVar11 = (undefined1 *)(((long)puVar3 - (long)puVar14) * 2);
      if (puVar11 <= puVar19) {
        puVar11 = puVar19;
      }
      if (0x3ffffffffffffffe < (ulong)((long)puVar3 - (long)puVar14)) {
        puVar11 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar11 == (undefined1 *)0x0) {
        lVar16 = 0;
        puVar9 = puVar8 + 1;
        *puVar8 = uVar20;
        puVar11 = (undefined1 *)0x0;
        puVar19 = (undefined1 *)0x0;
        puVar3 = puVar8;
        if (puVar6 != puVar14) goto code_r0x00024e24;
LAB_00024ed0:
        *unaff_x19 = (long)puVar3;
        unaff_x19[1] = (long)puVar9;
        unaff_x19[2] = (long)puVar11;
LAB_00024edc:
        __ZdlPv(puVar6);
        unaff_x19[1] = (long)puVar9;
        puVar6 = (undefined1 *)unaff_x19[2];
        if (puVar9 < puVar6) goto LAB_00024e80;
        goto LAB_00024cf8;
      }
      lVar16 = __Znwm(puVar11);
      puVar3 = puVar8 + lVar16;
      puVar11 = puVar11 + lVar16;
      puVar9 = puVar3 + 1;
      *puVar3 = uVar20;
      puVar19 = puVar11;
      if (puVar6 == puVar14) goto LAB_00024ed0;
code_r0x00024e24:
      if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar14 - lVar16) < 0x40)) {
LAB_00024e50:
        do {
          puVar3 = puVar3 + -1;
          puVar6 = puVar6 + -1;
          *puVar3 = *puVar6;
        } while (puVar6 != puVar14);
      }
      else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
        puVar13 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
        puVar10 = (undefined8 *)(puVar6 + -0x20);
        puVar15 = (undefined8 *)(puVar8 + lVar16 + -0x20);
        puVar11 = puVar13;
        do {
          uVar23 = *puVar10;
          uVar22 = puVar10[3];
          uVar21 = puVar10[2];
          uVar27 = puVar10[-3];
          uVar26 = puVar10[-4];
          uVar25 = puVar10[-1];
          uVar24 = puVar10[-2];
          puVar15[1] = puVar10[1];
          *puVar15 = uVar23;
          puVar15[3] = uVar22;
          puVar15[2] = uVar21;
          puVar15[-3] = uVar27;
          puVar15[-4] = uVar26;
          puVar15[-1] = uVar25;
          puVar15[-2] = uVar24;
          puVar10 = puVar10 + -8;
          puVar15 = puVar15 + -8;
          puVar11 = puVar11 + -0x40;
        } while (puVar11 != (undefined1 *)0x0);
        if (puVar8 != puVar13) {
          if (((ulong)puVar8 & 0x38) == 0) {
            puVar3 = puVar3 + -(long)puVar13;
            puVar6 = puVar6 + -(long)puVar13;
            goto LAB_00024e50;
          }
          goto code_r0x000259c4;
        }
      }
      else {
        puVar13 = (undefined1 *)0x0;
code_r0x000259c4:
        puVar11 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
        puVar3 = puVar3 + -(long)puVar11;
        puVar15 = (undefined8 *)(puVar6 + -(long)puVar13);
        puVar10 = (undefined8 *)((long)puVar15 + (lVar16 - (long)puVar14));
        lVar17 = (long)puVar13 - (long)puVar11;
        do {
          puVar15 = puVar15 + -1;
          puVar10 = puVar10 + -1;
          *puVar10 = *puVar15;
          lVar17 = lVar17 + 8;
        } while (lVar17 != 0);
        puVar6 = puVar6 + -(long)puVar11;
        if (puVar8 != puVar11) goto LAB_00024e50;
      }
      puVar6 = (undefined1 *)*unaff_x19;
      *unaff_x19 = lVar16;
      unaff_x19[1] = (long)puVar9;
      unaff_x19[2] = (long)puVar19;
      if (puVar6 != (undefined1 *)0x0) goto LAB_00024edc;
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar9) goto LAB_00024cf8;
LAB_00024e80:
      puVar11 = puVar9 + 1;
      *puVar9 = 0;
LAB_00024e88:
      unaff_x19[1] = (long)puVar11;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar11) goto LAB_00024f34;
code_r0x00024e98:
      puVar6 = puVar11 + 1;
      *puVar11 = 0;
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar3 <= puVar6) goto LAB_00025034;
LAB_00024fd8:
      puVar9 = puVar6 + 1;
      *puVar6 = 0;
      unaff_x19[1] = (long)puVar9;
      uVar20 = (undefined1)*(undefined4 *)((long)plVar1 + 4);
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar9) goto LAB_00025138;
LAB_000250dc:
      puVar6 = puVar9 + 1;
      *puVar9 = uVar20;
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar3 <= puVar6) goto LAB_00025234;
LAB_000251dc:
      puVar9 = puVar6 + 1;
      *puVar6 = 0;
      unaff_x19[1] = (long)puVar9;
      puVar6 = (undefined1 *)unaff_x19[2];
      if (puVar6 <= puVar9) goto LAB_00025330;
LAB_000252d8:
      puVar6 = puVar9 + 1;
      *puVar9 = 0;
      unaff_x19[1] = (long)puVar6;
      puVar3 = (undefined1 *)unaff_x19[2];
      if (puVar3 <= puVar6) goto LAB_0002541c;
FUN_000253d4:
      puVar9 = puVar6 + 1;
      *puVar6 = 0;
    }
    unaff_x28 = 0x3fffffffffffffff;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x19[1] = (long)puVar9;
    uVar20 = (undefined1)*(undefined4 *)(lVar18 + unaff_x25 * 0x10 + 8);
    if (puVar9 < (undefined1 *)unaff_x19[2]) {
      *puVar9 = uVar20;
      unaff_x19[1] = (long)(puVar9 + 1);
    }
    else {
      puVar3 = (undefined1 *)*unaff_x19;
      puVar19 = puVar9 + -(long)puVar3;
      puVar6 = puVar19 + 1;
      if ((long)puVar6 < 0) {
        func_0x00017f90();
        goto code_r0x00026138;
      }
      uVar5 = unaff_x19[2] - (long)puVar3;
      puVar14 = (undefined1 *)(uVar5 * 2);
      if (puVar14 <= puVar6) {
        puVar14 = puVar6;
      }
      if (0x3ffffffffffffffe < uVar5) {
        puVar14 = (undefined1 *)0x7fffffffffffffff;
      }
      if (puVar14 == (undefined1 *)0x0) {
        lVar18 = 0;
        puVar11 = puVar19 + 1;
        *puVar19 = uVar20;
        puVar14 = (undefined1 *)0x0;
        puVar8 = (undefined1 *)0x0;
        puVar6 = puVar19;
        if (puVar9 != puVar3) goto LAB_00025558;
LAB_000255c0:
        *unaff_x19 = (long)puVar6;
        unaff_x19[1] = (long)puVar11;
        unaff_x19[2] = (long)puVar14;
LAB_000255c8:
        __ZdlPv(puVar9);
      }
      else {
        lVar18 = __Znwm(puVar14);
        puVar6 = puVar19 + lVar18;
        puVar14 = puVar14 + lVar18;
        puVar11 = puVar6 + 1;
        *puVar6 = uVar20;
        puVar8 = puVar14;
        if (puVar9 == puVar3) goto LAB_000255c0;
LAB_00025558:
        if ((puVar19 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar3 - lVar18) < 0x40)) {
LAB_00025580:
          do {
            puVar6 = puVar6 + -1;
            puVar9 = puVar9 + -1;
            *puVar6 = *puVar9;
          } while (puVar9 != puVar3);
        }
        else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar19) {
          puVar13 = (undefined1 *)((ulong)puVar19 & 0xffffffffffffffc0);
          puVar10 = (undefined8 *)(puVar9 + -0x20);
          puVar15 = (undefined8 *)(puVar19 + lVar18 + -0x20);
          puVar14 = puVar13;
          do {
            uVar23 = *puVar10;
            uVar22 = puVar10[3];
            uVar21 = puVar10[2];
            uVar27 = puVar10[-3];
            uVar26 = puVar10[-4];
            uVar25 = puVar10[-1];
            uVar24 = puVar10[-2];
            puVar15[1] = puVar10[1];
            *puVar15 = uVar23;
            puVar15[3] = uVar22;
            puVar15[2] = uVar21;
            puVar15[-3] = uVar27;
            puVar15[-4] = uVar26;
            puVar15[-1] = uVar25;
            puVar15[-2] = uVar24;
            puVar10 = puVar10 + -8;
            puVar15 = puVar15 + -8;
            puVar14 = puVar14 + -0x40;
          } while (puVar14 != (undefined1 *)0x0);
          if (puVar19 != puVar13) {
            if (((ulong)puVar19 & 0x38) == 0) {
              puVar6 = puVar6 + -(long)puVar13;
              puVar9 = puVar9 + -(long)puVar13;
              goto LAB_00025580;
            }
            goto LAB_00025de4;
          }
        }
        else {
          puVar13 = (undefined1 *)0x0;
LAB_00025de4:
          puVar14 = (undefined1 *)((ulong)puVar19 & 0xfffffffffffffff8);
          puVar6 = puVar6 + -(long)puVar14;
          puVar15 = (undefined8 *)(puVar9 + -(long)puVar13);
          puVar10 = (undefined8 *)((long)puVar15 + (lVar18 - (long)puVar3));
          lVar16 = (long)puVar13 - (long)puVar14;
          do {
            puVar15 = puVar15 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar15;
            lVar16 = lVar16 + 8;
          } while (lVar16 != 0);
          puVar9 = puVar9 + -(long)puVar14;
          if (puVar19 != puVar14) goto LAB_00025580;
        }
        puVar9 = (undefined1 *)*unaff_x19;
        *unaff_x19 = lVar18;
        unaff_x19[1] = (long)puVar11;
        unaff_x19[2] = (long)puVar8;
        if (puVar9 != (undefined1 *)0x0) goto LAB_000255c8;
      }
      unaff_x19[1] = (long)puVar11;
    }
    goto LAB_00024734;
  case 5:
    func_0x000262e0();
    goto LAB_00024734;
  case 6:
    lVar16 = *plVar1;
    lVar17 = *(long *)(lVar16 + 0x20);
    lVar18 = __dyld_get_image_header(0);
    if ((lVar17 != lVar18 + 0x4e8dec0) &&
       (uVar4 = (uint)*(byte *)(lVar16 + 6), *(byte *)(lVar16 + 6) != 0x1f)) {
      lVar17 = 0;
      lVar18 = 0;
      do {
        if ((*(uint *)(*(long *)(lVar16 + 0x20) + lVar17 + 0x1c) & 0xf) == 5) {
          func_0x000262e0();
          uVar4 = (uint)*(byte *)(lVar16 + 6);
        }
        lVar18 = lVar18 + 1;
        lVar17 = lVar17 + 0x20;
      } while (lVar18 < 1 << (ulong)(uVar4 & 0x1f));
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
    unaff_x22 = (undefined1 *)unaff_x19[1];
    if (unaff_x22 < (undefined1 *)unaff_x19[2]) {
      *unaff_x22 = 0x43;
      unaff_x19[1] = (long)(unaff_x22 + 1);
      goto LAB_00024734;
    }
    puVar14 = (undefined1 *)*unaff_x19;
    puVar8 = unaff_x22 + -(long)puVar14;
    puVar6 = puVar8 + 1;
    if ((long)puVar6 < 0) {
      func_0x00017f90();
code_r0x00026138:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x2613c);
      (*pcVar2)();
    }
    uVar5 = unaff_x19[2] - (long)puVar14;
    in_x10 = (undefined1 *)(uVar5 * 2);
    if (in_x10 <= puVar6) {
      in_x10 = puVar6;
    }
    if (unaff_x28 <= uVar5) {
      in_x10 = unaff_x27;
    }
    if (in_x10 == (undefined1 *)0x0) {
      puVar3 = (undefined1 *)0x0;
      *puVar8 = 0x43;
      puVar6 = puVar8;
    }
    else {
      puVar3 = (undefined1 *)__Znwm(in_x10);
      puVar6 = puVar3 + (long)puVar8;
      *puVar6 = 0x43;
    }
    puVar19 = puVar6 + 1;
    if (unaff_x22 != puVar14) break;
LAB_00025618:
    *unaff_x19 = (long)puVar6;
    unaff_x19[1] = (long)puVar19;
    unaff_x19[2] = (long)(puVar3 + (long)in_x10);
    goto joined_r0x00025fdc;
  }
  puVar11 = unaff_x22;
  if (((undefined1 *)((long)&MACH_HEADER.cputype + 3) < puVar8) &&
     (0x3f < (ulong)((long)puVar14 - (long)puVar3))) {
    if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < puVar8) {
      puVar9 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
      puVar10 = (undefined8 *)(unaff_x22 + -0x20);
      puVar15 = (undefined8 *)(puVar3 + (long)puVar8 + -0x20);
      puVar11 = puVar9;
      do {
        uVar23 = *puVar10;
        uVar22 = puVar10[3];
        uVar21 = puVar10[2];
        uVar27 = puVar10[-3];
        uVar26 = puVar10[-4];
        uVar25 = puVar10[-1];
        uVar24 = puVar10[-2];
        puVar15[1] = puVar10[1];
        *puVar15 = uVar23;
        puVar15[3] = uVar22;
        puVar15[2] = uVar21;
        puVar15[-3] = uVar27;
        puVar15[-4] = uVar26;
        puVar15[-1] = uVar25;
        puVar15[-2] = uVar24;
        puVar10 = puVar10 + -8;
        puVar15 = puVar15 + -8;
        puVar11 = puVar11 + -0x40;
      } while (puVar11 != (undefined1 *)0x0);
      if (puVar8 == puVar9) goto code_r0x00025fc8;
      if (((ulong)puVar8 & 0x38) == 0) {
        puVar6 = puVar6 + -(long)puVar9;
        puVar11 = unaff_x22 + -(long)puVar9;
        goto code_r0x00025fb8;
      }
    }
    else {
      puVar9 = (undefined1 *)0x0;
    }
    puVar13 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
    puVar11 = unaff_x22 + -(long)puVar13;
    puVar6 = puVar6 + -(long)puVar13;
    puVar15 = (undefined8 *)(unaff_x22 + -(long)puVar9);
    puVar10 = (undefined8 *)(puVar3 + ((long)puVar15 - (long)puVar14));
    lVar18 = (long)puVar9 - (long)puVar13;
    do {
      puVar15 = puVar15 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar15;
      lVar18 = lVar18 + 8;
    } while (lVar18 != 0);
    if (puVar8 == puVar13) goto code_r0x00025fc8;
  }
code_r0x00025fb8:
  do {
    puVar6 = puVar6 + -1;
    puVar11 = puVar11 + -1;
    *puVar6 = *puVar11;
  } while (puVar11 != puVar14);
  goto code_r0x00025fc8;
code_r0x0002481c:
  unaff_x22 = (undefined1 *)unaff_x19[1];
  uVar20 = (undefined1)*plVar1;
  if (unaff_x22 < (undefined1 *)unaff_x19[2]) {
    *unaff_x22 = uVar20;
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    unaff_x19[1] = (long)(unaff_x22 + 1);
    goto LAB_00024734;
  }
  puVar14 = (undefined1 *)*unaff_x19;
  puVar8 = unaff_x22 + -(long)puVar14;
  puVar6 = puVar8 + 1;
  if ((long)puVar6 < 0) {
    func_0x00017f90();
    goto code_r0x00026138;
  }
  uVar5 = unaff_x19[2] - (long)puVar14;
  in_x10 = (undefined1 *)(uVar5 * 2);
  if (in_x10 <= puVar6) {
    in_x10 = puVar6;
  }
  if (unaff_x28 <= uVar5) {
    in_x10 = (undefined1 *)0x7fffffffffffffff;
  }
  if (in_x10 == (undefined1 *)0x0) {
    puVar3 = (undefined1 *)0x0;
    *puVar8 = uVar20;
    puVar6 = puVar8;
  }
  else {
    puVar3 = (undefined1 *)__Znwm(in_x10);
    puVar6 = puVar3 + (long)puVar8;
    *puVar6 = uVar20;
  }
  puVar19 = puVar6 + 1;
  if (unaff_x22 == puVar14) {
    unaff_x27 = (undefined1 *)0x7fffffffffffffff;
    *unaff_x19 = (long)puVar6;
    unaff_x19[1] = (long)puVar19;
    unaff_x19[2] = (long)(puVar3 + (long)in_x10);
    goto joined_r0x00025fdc;
  }
  unaff_x27 = (undefined1 *)0x7fffffffffffffff;
  puVar11 = unaff_x22;
  if ((puVar8 < &MACH_HEADER.cpusubtype) || ((ulong)((long)puVar14 - (long)puVar3) < 0x40))
  goto code_r0x00025eb8;
  if (puVar8 < &segment_command_00000020.vmsize) {
    puVar9 = (undefined1 *)0x0;
    goto code_r0x00025724;
  }
  puVar9 = (undefined1 *)((ulong)puVar8 & 0xffffffffffffffc0);
  puVar10 = (undefined8 *)(unaff_x22 + -0x20);
  puVar15 = (undefined8 *)(puVar3 + (long)puVar8 + -0x20);
  puVar11 = puVar9;
  do {
    uVar23 = *puVar10;
    uVar22 = puVar10[3];
    uVar21 = puVar10[2];
    uVar27 = puVar10[-3];
    uVar26 = puVar10[-4];
    uVar25 = puVar10[-1];
    uVar24 = puVar10[-2];
    puVar15[1] = puVar10[1];
    *puVar15 = uVar23;
    puVar15[3] = uVar22;
    puVar15[2] = uVar21;
    puVar15[-3] = uVar27;
    puVar15[-4] = uVar26;
    puVar15[-1] = uVar25;
    puVar15[-2] = uVar24;
    puVar10 = puVar10 + -8;
    puVar15 = puVar15 + -8;
    puVar11 = puVar11 + -0x40;
  } while (puVar11 != (undefined1 *)0x0);
  if (puVar8 == puVar9) goto code_r0x00025fc8;
  if (((ulong)puVar8 & 0x38) == 0) {
    puVar6 = puVar6 + -(long)puVar9;
    puVar11 = unaff_x22 + -(long)puVar9;
  }
  else {
code_r0x00025724:
    puVar13 = (undefined1 *)((ulong)puVar8 & 0xfffffffffffffff8);
    puVar11 = unaff_x22 + -(long)puVar13;
    puVar6 = puVar6 + -(long)puVar13;
    puVar15 = (undefined8 *)(unaff_x22 + -(long)puVar9);
    puVar10 = (undefined8 *)(puVar3 + ((long)puVar15 - (long)puVar14));
    lVar18 = (long)puVar9 - (long)puVar13;
    do {
      puVar15 = puVar15 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *puVar15;
      lVar18 = lVar18 + 8;
    } while (lVar18 != 0);
    if (puVar8 == puVar13) goto code_r0x00025fc8;
  }
code_r0x00025eb8:
  do {
    puVar6 = puVar6 + -1;
    puVar11 = puVar11 + -1;
    *puVar6 = *puVar11;
  } while (puVar11 != puVar14);
  goto code_r0x00025fc8;
}

