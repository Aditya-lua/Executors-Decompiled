
/* WARNING: Type propagation algorithm not settling */

int FUN_0007efdc(long param_1)

{
  int iVar1;
  uint uVar2;
  undefined1 *puVar3;
  uint uVar4;
  bool in_NG;
  long lVar5;
  long lVar6;
  uint uVar7;
  ulong in_x9;
  undefined1 *puVar8;
  undefined1 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined1 *puVar13;
  undefined8 *puVar14;
  undefined1 *puVar15;
  long unaff_x19;
  uint uVar16;
  undefined8 *unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x23;
  undefined1 *unaff_x24;
  undefined1 unaff_w25;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  
  if (in_NG) {
    lVar6 = func_0x00017f90();
    func_0x0007ef6c();
    iVar1 = *(int *)(lVar6 + 0x14);
    uVar16 = iVar1 - 0x30;
    if (9 < uVar16) {
      if (5 < iVar1 - 0x41U) {
        if (5 < iVar1 - 0x61U) {
          return -1;
        }
        uVar16 = iVar1 - 0x57;
        func_0x0007ef6c(lVar6);
        iVar1 = *(int *)(lVar6 + 0x14);
        goto joined_r0x0007f210;
      }
      uVar16 = iVar1 - 0x37;
    }
    func_0x0007ef6c(lVar6);
    iVar1 = *(int *)(lVar6 + 0x14);
joined_r0x0007f210:
    uVar4 = iVar1 - 0x30;
    if (uVar4 < 10) {
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    else if (iVar1 - 0x41U < 6) {
      uVar4 = iVar1 - 0x37;
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    else {
      if (5 < iVar1 - 0x61U) {
        return -1;
      }
      uVar4 = iVar1 - 0x57;
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    uVar2 = iVar1 - 0x30;
    if (uVar2 < 10) {
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    else if (iVar1 - 0x41U < 6) {
      uVar2 = iVar1 - 0x37;
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    else {
      if (5 < iVar1 - 0x61U) {
        return -1;
      }
      uVar2 = iVar1 - 0x57;
      func_0x0007ef6c(lVar6);
      iVar1 = *(int *)(lVar6 + 0x14);
    }
    uVar7 = iVar1 - 0x30;
    if (9 < uVar7) {
      if (iVar1 - 0x41U < 6) {
        uVar7 = iVar1 - 0x37;
      }
      else {
        if (5 < iVar1 - 0x61U) {
          return -1;
        }
        uVar7 = iVar1 - 0x57;
      }
    }
    return uVar7 + uVar16 * 0x1000 + uVar4 * 0x100 + uVar2 * 0x10;
  }
  uVar11 = (param_1 - (long)unaff_x23) * 2;
  if (uVar11 <= in_x9) {
    uVar11 = in_x9;
  }
  if (0x3ffffffffffffffe < (ulong)(param_1 - (long)unaff_x23)) {
    uVar11 = 0x7fffffffffffffff;
  }
  if (uVar11 == 0) {
    lVar5 = 0;
    *unaff_x24 = unaff_w25;
    lVar6 = 0;
    puVar8 = unaff_x24;
  }
  else {
    lVar5 = __Znwm(uVar11);
    puVar8 = unaff_x24 + lVar5;
    lVar6 = lVar5 + uVar11;
    *puVar8 = unaff_w25;
  }
  puVar3 = puVar8 + 1;
  if (unaff_x21 == unaff_x23) {
    *(undefined1 **)(unaff_x19 + 0x38) = puVar8;
    *(undefined1 **)(unaff_x19 + 0x40) = puVar3;
    *(long *)(unaff_x19 + 0x48) = lVar6;
    goto joined_r0x0007f168;
  }
  puVar15 = unaff_x21;
  if ((unaff_x24 < &MACH_HEADER.cpusubtype) || ((ulong)((long)unaff_x23 - lVar5) < 0x40)) {
LAB_0007f14c:
    do {
      puVar8 = puVar8 + -1;
      puVar15 = puVar15 + -1;
      *puVar8 = *puVar15;
    } while (puVar15 != unaff_x23);
  }
  else if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x24) {
    puVar9 = (undefined1 *)((ulong)unaff_x24 & 0xffffffffffffffc0);
    puVar12 = (undefined8 *)(unaff_x21 + -0x20);
    puVar14 = (undefined8 *)((long)puVar12 + (lVar5 - (long)unaff_x23));
    puVar15 = puVar9;
    do {
      uVar19 = *puVar12;
      uVar18 = puVar12[3];
      uVar17 = puVar12[2];
      uVar23 = puVar12[-3];
      uVar22 = puVar12[-4];
      uVar21 = puVar12[-1];
      uVar20 = puVar12[-2];
      puVar14[1] = puVar12[1];
      *puVar14 = uVar19;
      puVar14[3] = uVar18;
      puVar14[2] = uVar17;
      puVar14[-3] = uVar23;
      puVar14[-4] = uVar22;
      puVar14[-1] = uVar21;
      puVar14[-2] = uVar20;
      puVar12 = puVar12 + -8;
      puVar14 = puVar14 + -8;
      puVar15 = puVar15 + -0x40;
    } while (puVar15 != (undefined1 *)0x0);
    if (unaff_x24 != puVar9) {
      if (((ulong)unaff_x24 & 0x38) == 0) {
        puVar8 = puVar8 + -(long)puVar9;
        puVar15 = unaff_x21 + -(long)puVar9;
        goto LAB_0007f14c;
      }
      goto LAB_0007f100;
    }
  }
  else {
    puVar9 = (undefined1 *)0x0;
LAB_0007f100:
    puVar13 = (undefined1 *)((ulong)unaff_x24 & 0xfffffffffffffff8);
    puVar15 = unaff_x21 + -(long)puVar13;
    puVar8 = puVar8 + -(long)puVar13;
    lVar10 = (long)puVar9 - (long)puVar13;
    puVar14 = (undefined8 *)(unaff_x21 + (-8 - (long)puVar9));
    puVar12 = (undefined8 *)((long)(unaff_x21 + (-8 - (long)puVar9)) + (lVar5 - (long)unaff_x23));
    do {
      *puVar12 = *puVar14;
      lVar10 = lVar10 + 8;
      puVar14 = puVar14 + -1;
      puVar12 = puVar12 + -1;
    } while (lVar10 != 0);
    if (unaff_x24 != puVar13) goto LAB_0007f14c;
  }
  unaff_x21 = (undefined1 *)*unaff_x20;
  *(long *)(unaff_x19 + 0x38) = lVar5;
  *(undefined1 **)(unaff_x19 + 0x40) = puVar3;
  *(long *)(unaff_x19 + 0x48) = lVar6;
joined_r0x0007f168:
  if (unaff_x21 != (undefined1 *)0x0) {
    __ZdlPv(unaff_x21);
  }
  *(undefined1 **)(unaff_x19 + 0x40) = puVar3;
  if (*(int *)(unaff_x19 + 0x14) == 10) {
    *(undefined8 *)(unaff_x19 + 0x28) = 0;
    *(long *)(unaff_x19 + 0x30) = *(long *)(unaff_x19 + 0x30) + 1;
  }
  return *(int *)(unaff_x19 + 0x14);
}

