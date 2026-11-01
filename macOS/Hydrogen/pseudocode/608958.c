
/* WARNING: Possible PIC construction at 0x006089a0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006089a4) */

long FUN_00608958(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  uint in_w8;
  int iVar10;
  uint uVar11;
  uint uVar12;
  long in_x9;
  uint uVar13;
  ulong uVar14;
  long unaff_x19;
  undefined8 *puVar15;
  undefined8 unaff_x20;
  ulong uVar16;
  long unaff_x21;
  long unaff_x22;
  int unaff_w25;
  long unaff_x26;
  uint unaff_w27;
  ulong unaff_x28;
  ulong uVar17;
  undefined8 unaff_x29;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined1 uStack00000000000000b0;
  
  uVar17 = unaff_x28;
  do {
    if (unaff_x19 + unaff_x22 == 0) goto LAB_00608d94;
    lVar9 = unaff_x22 * 8;
    unaff_x22 = unaff_x22 + -1;
    uVar13 = (int)unaff_x28 + 1;
    unaff_x28 = (ulong)uVar13;
    uVar4 = (int)uVar17 - 1;
    uVar17 = (ulong)uVar4;
  } while (*(long *)(in_x9 + unaff_x19 * 8 + -8 + lVar9) == 0);
  iVar10 = (int)unaff_x19 + (int)unaff_x22;
  if (iVar10 == -1) {
LAB_00608d94:
    uVar8 = ___cxa_allocate_exception(0x28);
    func_0x00608e48();
    ___cxa_throw(uVar8,&UNK_009f5db8,&DAT_00608eec);
    iVar10 = ___cxa_guard_acquire(0xa3c150);
    if (iVar10 != 0) {
      func_0x005fe1e8(0xa3c168,0);
      ___cxa_atexit(&SUB_00087574,0xa3c168,0);
      ___cxa_guard_release(0xa3c150);
    }
    param_3 = 0xa3c168;
    register0x00000008 = (BADSPACEBASE *)&uStack00000000000000b0;
    unaff_x21 = in_stack_00000028;
    unaff_x19 = in_stack_00000098;
    unaff_x20 = in_stack_00000090;
    lVar9 = in_stack_00000088;
    unaff_x22 = in_stack_00000080;
    unaff_x29 = in_stack_000000a0;
    uVar8 = in_stack_000000a8;
  }
  else {
    if (iVar10 + 1U <= in_w8) {
      uVar12 = unaff_w27 & 1;
      uVar17 = (unaff_x28 & 1) + unaff_x19 + unaff_x22 + 1;
      in_stack_00000010 = uVar17 & 0xffffffff;
      uVar11 = (uint)uVar17;
      in_stack_00000018 = param_4;
      in_stack_00000020 = param_3;
      if (uVar11 < 9) {
        uVar16 = (ulong)*(uint *)(&UNK_008babcc + in_stack_00000010 * 4);
        in_stack_00000008 = (ulong)(unaff_w25 + uVar12);
        uVar17 = *(ulong *)(unaff_x21 + 0x18);
        lVar9 = *(long *)(unaff_x21 + 0x20);
        if (uVar17 != uVar16) goto LAB_00608afc;
LAB_00608b2c:
        lVar6 = in_stack_00000020;
        *(ulong *)(unaff_x21 + 0x18) = uVar16;
        *(long *)(unaff_x21 + 0x20) = lVar9;
        if (lVar9 != 0) {
          _bzero(lVar9,uVar16 << 3);
        }
      }
      else {
        if (uVar11 < 0x11) {
          uVar16 = 0x10;
          in_stack_00000008 = (ulong)(unaff_w25 + uVar12);
          uVar17 = *(ulong *)(unaff_x21 + 0x18);
          lVar9 = *(long *)(unaff_x21 + 0x20);
          if (uVar17 != 0x10) goto LAB_00608afc;
          goto LAB_00608b2c;
        }
        if (uVar11 < 0x21) {
          uVar16 = 0x20;
          in_stack_00000008 = (ulong)(unaff_w25 + uVar12);
          uVar17 = *(ulong *)(unaff_x21 + 0x18);
          lVar9 = *(long *)(unaff_x21 + 0x20);
          if (uVar17 != 0x20) goto LAB_00608afc;
          goto LAB_00608b2c;
        }
        if (0x40 < uVar11) {
          uVar11 = 0;
          uVar17 = 0x40;
          do {
            uVar2 = uVar11 + (uint)uVar17 >> 1;
            uVar3 = uVar2;
            if (in_stack_00000010 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
              uVar3 = (uint)uVar17;
              uVar11 = uVar2;
            }
            uVar17 = (ulong)uVar3;
          } while (1 < uVar3 - uVar11);
          uVar16 = 1L << (uVar17 & 0x3f);
          in_stack_00000008 = (ulong)(unaff_w25 + uVar12);
          uVar17 = *(ulong *)(unaff_x21 + 0x18);
          lVar9 = *(long *)(unaff_x21 + 0x20);
          if (uVar17 != uVar16) goto LAB_00608afc;
          goto LAB_00608b2c;
        }
        uVar16 = 0x40;
        in_stack_00000008 = (ulong)(unaff_w25 + uVar12);
        uVar17 = *(ulong *)(unaff_x21 + 0x18);
        lVar9 = *(long *)(unaff_x21 + 0x20);
        if (uVar17 == 0x40) goto LAB_00608b2c;
LAB_00608afc:
        if (lVar9 != 0) {
          if (uVar17 != 0) {
            do {
              *(undefined8 *)(lVar9 + -8 + uVar17 * 8) = 0;
              uVar17 = uVar17 - 1;
            } while (uVar17 != 0);
          }
          func_0x00611644();
        }
        func_0x006108a0(uVar16);
        if (uVar16 != 0) {
          lVar9 = func_0x006115d0(uVar16 << 3);
          goto LAB_00608b2c;
        }
        *(undefined8 *)(unaff_x21 + 0x18) = 0;
        *(undefined8 *)(unaff_x21 + 0x20) = 0;
        lVar6 = in_stack_00000020;
      }
      lVar9 = in_stack_00000028;
      *(undefined8 *)(unaff_x21 + 0x10) = 0x1fffffffffffffff;
      *(undefined4 *)(unaff_x21 + 0x28) = 0;
      iVar10 = (int)unaff_x26;
      uVar16 = (ulong)(((unaff_w25 + (unaff_w27 & 1)) - ((int)unaff_x19 + (uVar13 & 1))) + iVar10 +
                      1) - unaff_x22;
      uVar17 = uVar16 & 0xffffffff;
      uVar12 = (uint)uVar16;
      if (uVar12 < 9) {
        uVar16 = (ulong)*(uint *)(&UNK_008babcc + uVar17 * 4);
        uVar17 = *(ulong *)(in_stack_00000028 + 0x18);
        lVar7 = *(long *)(in_stack_00000028 + 0x20);
        if (uVar17 != uVar16) goto LAB_00608c4c;
      }
      else if (uVar12 < 0x11) {
        uVar16 = 0x10;
        uVar17 = *(ulong *)(in_stack_00000028 + 0x18);
        lVar7 = *(long *)(in_stack_00000028 + 0x20);
        if (uVar17 != 0x10) goto LAB_00608c4c;
      }
      else if (uVar12 < 0x21) {
        uVar16 = 0x20;
        uVar17 = *(ulong *)(in_stack_00000028 + 0x18);
        lVar7 = *(long *)(in_stack_00000028 + 0x20);
        if (uVar17 != 0x20) goto LAB_00608c4c;
      }
      else if (uVar12 < 0x41) {
        uVar16 = 0x40;
        uVar17 = *(ulong *)(in_stack_00000028 + 0x18);
        lVar7 = *(long *)(in_stack_00000028 + 0x20);
        if (uVar17 != 0x40) {
LAB_00608c4c:
          puVar15 = (undefined8 *)(in_stack_00000028 + 0x18);
          if (lVar7 != 0) {
            if (uVar17 != 0) {
              do {
                *(undefined8 *)(lVar7 + -8 + uVar17 * 8) = 0;
                uVar17 = uVar17 - 1;
              } while (uVar17 != 0);
            }
            func_0x00611644();
          }
          func_0x006108a0(uVar16);
          if (uVar16 == 0) {
            *puVar15 = 0;
            *(undefined8 *)(lVar9 + 0x20) = 0;
            uVar17 = in_stack_00000008;
            goto LAB_00608ca0;
          }
          lVar7 = func_0x006115d0(uVar16 << 3);
        }
      }
      else {
        uVar12 = 0;
        uVar16 = 0x40;
        do {
          uVar3 = uVar12 + (uint)uVar16 >> 1;
          uVar11 = uVar3;
          if (uVar17 - 1 >> ((ulong)uVar3 & 0x3f) != 0) {
            uVar11 = (uint)uVar16;
            uVar12 = uVar3;
          }
          uVar16 = (ulong)uVar11;
        } while (1 < uVar11 - uVar12);
        uVar16 = 1L << (uVar16 & 0x3f);
        uVar17 = *(ulong *)(in_stack_00000028 + 0x18);
        lVar7 = *(long *)(in_stack_00000028 + 0x20);
        if (uVar17 != uVar16) goto LAB_00608c4c;
      }
      uVar17 = in_stack_00000008;
      *(ulong *)(in_stack_00000028 + 0x18) = uVar16;
      *(long *)(in_stack_00000028 + 0x20) = lVar7;
      if (lVar7 != 0) {
        _bzero(lVar7,uVar16 << 3);
      }
LAB_00608ca0:
      *(undefined8 *)(in_stack_00000028 + 0x10) = 0x1fffffffffffffff;
      *(undefined4 *)(in_stack_00000028 + 0x28) = 0;
      iVar5 = (uVar4 + (uVar13 & 1)) * 3;
      iVar1 = iVar5 + unaff_w25 + (unaff_w27 & 1) + iVar10;
      uVar16 = (ulong)(iVar5 + unaff_w25 + (unaff_w27 & 1) + iVar10 + 6);
      in_stack_00000038 = 0x1fffffffffffffff;
      in_stack_00000040 = uVar16;
      func_0x006108a0(uVar16);
      if (iVar1 == -6) {
        lVar9 = 0;
      }
      else {
        lVar9 = func_0x006115d0(uVar16 << 3);
      }
      in_stack_00000048 = lVar9;
      lVar6 = func_0x005fcef8(*(undefined8 *)(unaff_x21 + 0x20),
                              *(undefined8 *)(in_stack_00000028 + 0x20),lVar9,
                              *(undefined8 *)(lVar6 + 0x20),uVar17 + unaff_x26 & 0xffffffff,
                              *(undefined8 *)(in_stack_00000018 + 0x20),in_stack_00000010);
      if (lVar9 != 0) {
        if (iVar1 != -6) {
          lVar6 = (ulong)((uVar4 + (uVar13 & 1)) * 3 + unaff_w25 + (unaff_w27 & 1) + iVar10 + 6) <<
                  3;
          do {
            *(undefined8 *)(lVar9 + -8 + lVar6) = 0;
            lVar6 = lVar6 + -8;
          } while (lVar6 != 0);
        }
        lVar6 = func_0x00611644(lVar9);
      }
      return lVar6;
    }
    lVar9 = unaff_x21;
    uVar8 = 0x6089a4;
  }
  *(long *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(long *)((long)register0x00000008 + -0x28) = lVar9;
  *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar8;
  if (unaff_x21 == param_3) {
    return unaff_x21;
  }
  uVar17 = *(ulong *)(unaff_x21 + 0x18);
  lVar9 = *(long *)(param_3 + 0x20);
  if ((uVar17 == *(ulong *)(param_3 + 0x18)) &&
     (*(long *)(lVar9 + (uVar17 & 0x3ffffffffffffffe) * 4) != 0)) {
    lVar6 = *(long *)(unaff_x21 + 0x20);
    uVar16 = uVar17;
    if (lVar6 == lVar9) goto code_r0x005ffdc4;
  }
  else {
    uVar16 = *(ulong *)(param_3 + 0x18);
    do {
      uVar14 = 0;
      if (uVar16 == 0) goto code_r0x005ffd44;
      uVar14 = uVar16 - 1;
      lVar6 = uVar16 * 8;
      uVar16 = uVar14;
    } while (*(long *)(lVar9 + -8 + lVar6) == 0);
    uVar13 = (int)uVar14 + 1;
    uVar14 = (ulong)uVar13;
    if (uVar13 < 9) {
code_r0x005ffd44:
      uVar16 = (ulong)*(uint *)(&UNK_008babcc + uVar14 * 4);
    }
    else if (uVar14 < 0x11) {
      uVar16 = 0x10;
    }
    else if (uVar14 < 0x21) {
      uVar16 = 0x20;
    }
    else if (uVar14 < 0x41) {
      uVar16 = 0x40;
    }
    else {
      uVar13 = 0;
      uVar16 = 0x40;
      do {
        uVar12 = uVar13 + (uint)uVar16 >> 1;
        uVar4 = uVar12;
        if (uVar14 - 1 >> ((ulong)uVar12 & 0x3f) != 0) {
          uVar4 = (uint)uVar16;
          uVar13 = uVar12;
        }
        uVar16 = (ulong)uVar4;
      } while (1 < uVar4 - uVar13);
      uVar16 = 1L << (uVar16 & 0x3f);
    }
    lVar6 = *(long *)(unaff_x21 + 0x20);
    if (uVar17 != uVar16) {
      if (lVar6 != 0) {
        if (uVar17 != 0) {
          do {
            *(undefined8 *)(lVar6 + -8 + uVar17 * 8) = 0;
            uVar17 = uVar17 - 1;
          } while (uVar17 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar16);
      if (uVar16 == 0) {
        lVar6 = 0;
      }
      else {
        lVar6 = func_0x006115d0(uVar16 << 3);
      }
    }
    *(ulong *)(unaff_x21 + 0x18) = uVar16;
    *(long *)(unaff_x21 + 0x20) = lVar6;
    *(undefined8 *)(unaff_x21 + 0x10) = 0x1fffffffffffffff;
    lVar9 = *(long *)(param_3 + 0x20);
    if (lVar6 == lVar9) goto code_r0x005ffdc4;
  }
  _memcpy(lVar6,lVar9,uVar16 << 3);
code_r0x005ffdc4:
  *(undefined4 *)(unaff_x21 + 0x28) = *(undefined4 *)(param_3 + 0x28);
  return unaff_x21;
}

