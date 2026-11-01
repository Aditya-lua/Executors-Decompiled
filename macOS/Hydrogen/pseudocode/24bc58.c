
void FUN_0024bc58(void)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 uVar3;
  code *pcVar4;
  bool bVar5;
  ulong uVar6;
  long *plVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  ulong unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  undefined8 uVar17;
  long unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined8 *puVar18;
  long lVar19;
  long unaff_x26;
  long lVar20;
  ulong unaff_x28;
  long unaff_x29;
  long *in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined2 uStack0000000000000040;
  short sStack0000000000000042;
  undefined4 uStack0000000000000044;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined2 uStack0000000000000070;
  short sStack0000000000000072;
  undefined4 uStack0000000000000074;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  undefined8 *in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  undefined8 *in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  
  lVar19 = *(long *)(unaff_x24 + 8);
  while( true ) {
    uVar8 = in_stack_00000020;
    func_0x0024cfa4(&uStack0000000000000028);
    if (uStack0000000000000028 != unaff_x26) {
      in_stack_000000c8 =
           CONCAT44(uStack0000000000000044,CONCAT22(sStack0000000000000042,uStack0000000000000040));
      in_stack_000000b8 = in_stack_00000030;
      uStack00000000000000b0 = uStack0000000000000028;
      in_stack_000000c0 = (undefined8 *)in_stack_00000038;
      in_stack_000000d8 = in_stack_00000050;
      in_stack_000000d0 = in_stack_00000048;
      in_stack_000000e0 = in_stack_00000058;
      func_0x00253cc8(unaff_x29 + -0x98,&uStack00000000000000b0);
      in_stack_000000f8 = *(long *)(unaff_x29 + -0x90);
      in_stack_000000f0 = *(long *)(unaff_x29 + -0x98);
      in_stack_00000108 = *(long *)(unaff_x29 + -0x80);
      in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
      in_stack_00000118 = *(long *)(unaff_x29 + -0x70);
      in_stack_00000110 = *(long *)(unaff_x29 + -0x78);
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x68);
      if (*in_stack_00000010 == unaff_x26) {
        uVar17 = *(undefined8 *)(unaff_x20 + 0x3f0);
        puVar18 = *(undefined8 **)(unaff_x20 + 0x3f8);
        if ((code *)*puVar18 != (code *)0x0) {
          (*(code *)*puVar18)(uVar17);
        }
        if (puVar18[1] != 0) {
          func_0x00187bd4(uVar17,puVar18[1],puVar18[2]);
        }
      }
      else {
        func_0x00245b38(in_stack_00000010);
      }
      in_stack_00000010[1] = in_stack_000000f8;
      *in_stack_00000010 = in_stack_000000f0;
      in_stack_00000010[3] = in_stack_00000108;
      in_stack_00000010[2] = in_stack_00000100;
      in_stack_00000010[5] = in_stack_00000118;
      in_stack_00000010[4] = in_stack_00000110;
      in_stack_00000010[6] = *(long *)(unaff_x29 + -0xa0);
      lVar20 = unaff_x19 - in_stack_00000020;
      if (unaff_x19 < in_stack_00000020 || lVar20 == 0) {
        lVar20 = 0;
      }
      else {
        _memmove(lVar19,lVar19 + in_stack_00000020,lVar20);
      }
      *(long *)(unaff_x24 + 0x18) = lVar20;
      unaff_x21[1] = in_stack_000000b8;
      *unaff_x21 = uStack00000000000000b0;
      unaff_x21[3] = in_stack_000000c8;
      unaff_x21[2] = (long)in_stack_000000c0;
      unaff_x21[5] = in_stack_000000d8;
      unaff_x21[4] = in_stack_000000d0;
      unaff_x21[6] = in_stack_000000e0;
      if ((code *)*unaff_x23 != (code *)0x0) {
        (*(code *)*unaff_x23)(unaff_x22);
      }
      if (unaff_x23[1] == 0) {
        return;
      }
      func_0x00187bd4(unaff_x22,unaff_x23[1],unaff_x23[2]);
      return;
    }
    if (sStack0000000000000042 == 10) break;
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000060 = in_stack_00000030;
    uStack0000000000000070 = uStack0000000000000040;
    sStack0000000000000072 = sStack0000000000000042;
    uStack0000000000000074 = uStack0000000000000044;
    func_0x0024eec8(&uStack0000000000000078);
    unaff_x23 = in_stack_00000088;
    unaff_x22 = in_stack_00000080;
    if (uStack0000000000000078 != unaff_x26) {
      in_stack_000000b8 = in_stack_00000080;
      uStack00000000000000b0 = uStack0000000000000078;
      in_stack_000000c8 = in_stack_00000090;
      in_stack_000000c0 = in_stack_00000088;
      in_stack_000000d8 = in_stack_000000a0;
      in_stack_000000d0 = in_stack_00000098;
      in_stack_000000e0 = in_stack_000000a8;
      func_0x00253cc8(unaff_x29 + -0x98,&uStack00000000000000b0);
      in_stack_000000f8 = *(long *)(unaff_x29 + -0x90);
      in_stack_000000f0 = *(long *)(unaff_x29 + -0x98);
      in_stack_00000108 = *(long *)(unaff_x29 + -0x80);
      in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
      in_stack_00000118 = *(long *)(unaff_x29 + -0x70);
      in_stack_00000110 = *(long *)(unaff_x29 + -0x78);
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x68);
      if (*in_stack_00000010 == unaff_x26) {
        uVar17 = *(undefined8 *)(unaff_x20 + 0x3f0);
        puVar18 = *(undefined8 **)(unaff_x20 + 0x3f8);
        if ((code *)*puVar18 != (code *)0x0) {
          (*(code *)*puVar18)(uVar17);
        }
        if (puVar18[1] != 0) {
          func_0x00187bd4(uVar17,puVar18[1],puVar18[2]);
        }
      }
      else {
        func_0x00245b38(in_stack_00000010);
      }
      in_stack_00000010[1] = in_stack_000000f8;
      *in_stack_00000010 = in_stack_000000f0;
      in_stack_00000010[3] = in_stack_00000108;
      in_stack_00000010[2] = in_stack_00000100;
      in_stack_00000010[5] = in_stack_00000118;
      in_stack_00000010[4] = in_stack_00000110;
      in_stack_00000010[6] = *(long *)(unaff_x29 + -0xa0);
      lVar20 = unaff_x19 - in_stack_00000020;
      if (unaff_x19 < in_stack_00000020 || lVar20 == 0) {
        lVar20 = 0;
      }
      else {
        _memmove(lVar19,lVar19 + in_stack_00000020,lVar20);
      }
      *(long *)(unaff_x24 + 0x18) = lVar20;
      unaff_x21[1] = in_stack_000000b8;
      *unaff_x21 = uStack00000000000000b0;
      unaff_x21[3] = in_stack_000000c8;
      unaff_x21[2] = (long)in_stack_000000c0;
      unaff_x21[5] = in_stack_000000d8;
      unaff_x21[4] = in_stack_000000d0;
      unaff_x21[6] = in_stack_000000e0;
      return;
    }
    if ((*(byte *)(unaff_x20 + 0x337) & 1) != 0) {
      in_stack_00000020 = in_stack_00000020 + unaff_x19;
      lVar20 = unaff_x19 - in_stack_00000020;
      if (in_stack_00000020 <= unaff_x19 && lVar20 != 0) goto code_r0x0024be8c;
code_r0x0024bf3c:
      lVar20 = 0;
      goto code_r0x0024bf40;
    }
    bVar5 = in_stack_00000020 <= in_stack_00000018;
    in_stack_00000020 = in_stack_00000018 - in_stack_00000020;
    in_stack_00000018 = 0;
    if (bVar5) {
      in_stack_00000018 = in_stack_00000020;
    }
    in_stack_00000020 = 0;
    bVar5 = uVar8 <= unaff_x19;
    uVar6 = unaff_x19 - uVar8;
    unaff_x19 = 0;
    if (bVar5 && uVar6 != 0) {
      _memmove(lVar19,lVar19 + uVar8,uVar6);
      unaff_x19 = uVar6;
    }
    *(ulong *)(unaff_x24 + 0x18) = unaff_x19;
    unaff_x26 = -0x7fffffffffffffd9;
    if (unaff_x28 < unaff_x19) {
      func_0x007a28b0(unaff_x19);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x24c43c);
      (*pcVar4)();
    }
  }
  lVar20 = unaff_x19 - in_stack_00000020;
  if (unaff_x19 < in_stack_00000020 || lVar20 == 0) goto code_r0x0024bf3c;
code_r0x0024be8c:
  _memmove(lVar19,lVar19 + in_stack_00000020,lVar20);
code_r0x0024bf40:
  *(long *)(unaff_x24 + 0x18) = lVar20;
  if (*in_stack_00000010 == -0x7fffffffffffffd9) {
    uVar17 = *(undefined8 *)(unaff_x20 + 0x3f0);
    puVar18 = *(undefined8 **)(unaff_x20 + 0x3f8);
    if ((code *)*puVar18 != (code *)0x0) {
      (*(code *)*puVar18)(uVar17);
    }
    if (puVar18[1] != 0) {
      func_0x00187bd4(uVar17,puVar18[1],puVar18[2]);
    }
  }
  else {
    func_0x00245b38(in_stack_00000010);
  }
  *(undefined8 *)(unaff_x20 + 1000) = 0x8000000000000027;
  *(long *)(unaff_x20 + 0x3f0) = unaff_x22;
  *(undefined8 **)(unaff_x20 + 0x3f8) = unaff_x23;
  uVar8 = *(ulong *)(unaff_x20 + 0xb0);
  if (uVar8 == 0) {
    lVar19 = 0;
  }
  else {
    lVar19 = 0;
    lVar20 = *(long *)(unaff_x20 + 0xa0);
    uVar2 = *(ulong *)(unaff_x20 + 0xa8);
    uVar10 = *(ulong *)(unaff_x20 + 0x98);
    uVar6 = 0;
    if (uVar10 <= uVar2) {
      uVar6 = uVar10;
    }
    lVar11 = uVar2 - uVar6;
    uVar9 = uVar10 - lVar11;
    if (uVar8 <= uVar9) {
      uVar10 = lVar11 + uVar8;
    }
    uVar1 = 0;
    if (uVar9 <= uVar8) {
      uVar1 = uVar8 - uVar9;
    }
    if (uVar10 - lVar11 != 0) {
      uVar10 = (uVar10 - lVar11) * 0x18;
      uVar12 = uVar10 / 0x18;
      if (uVar10 < 0x60) {
        lVar19 = 0;
        uVar13 = 0;
      }
      else {
        lVar19 = 0;
        lVar11 = 0;
        lVar14 = 0;
        lVar15 = 0;
        uVar13 = uVar12 & 0xffffffffffffffc;
        plVar7 = (long *)(uVar2 * 0x18 + uVar6 * -0x18 + lVar20 + 0x40);
        uVar10 = uVar13;
        do {
          lVar19 = plVar7[-6] + lVar19;
          lVar11 = plVar7[-3] + lVar11;
          lVar14 = *plVar7 + lVar14;
          lVar15 = plVar7[3] + lVar15;
          plVar7 = plVar7 + 0xc;
          uVar10 = uVar10 - 4;
        } while (uVar10 != 0);
        lVar19 = lVar15 + lVar14 + lVar11 + lVar19;
        if (uVar12 == uVar13) goto LAB_0024c1a0;
      }
      lVar11 = uVar13 - uVar12;
      plVar7 = (long *)(uVar2 * 0x18 + uVar13 * 0x18 + uVar6 * -0x18 + lVar20 + 0x10);
      do {
        lVar19 = *plVar7 + lVar19;
        bVar5 = lVar11 != -1;
        lVar11 = lVar11 + 1;
        plVar7 = plVar7 + 3;
      } while (bVar5);
    }
LAB_0024c1a0:
    if (uVar9 < uVar8) {
      if (uVar1 < 4) {
        uVar10 = 0;
      }
      else {
        lVar11 = 0;
        lVar14 = 0;
        lVar15 = 0;
        uVar10 = uVar1 & 0xfffffffffffffffc;
        plVar7 = (long *)(lVar20 + 0x40);
        uVar6 = uVar10;
        do {
          lVar19 = plVar7[-6] + lVar19;
          lVar11 = plVar7[-3] + lVar11;
          lVar14 = *plVar7 + lVar14;
          lVar15 = plVar7[3] + lVar15;
          plVar7 = plVar7 + 0xc;
          uVar6 = uVar6 - 4;
        } while (uVar6 != 0);
        lVar19 = lVar15 + lVar14 + lVar11 + lVar19;
        if (uVar1 == uVar10) goto LAB_0024c23c;
      }
      uVar6 = uVar8;
      if (uVar9 <= uVar8) {
        uVar6 = uVar9;
      }
      lVar11 = (uVar10 + uVar6) - uVar8;
      plVar7 = (long *)(lVar20 + uVar10 * 0x18 + 0x10);
      do {
        lVar19 = *plVar7 + lVar19;
        bVar5 = lVar11 != -1;
        lVar11 = lVar11 + 1;
        plVar7 = plVar7 + 3;
      } while (bVar5);
    }
  }
LAB_0024c23c:
  uVar8 = *(ulong *)(unaff_x20 + 0x78);
  if (uVar8 == 0) {
    lVar20 = 0;
    goto LAB_0024c3ec;
  }
  lVar20 = 0;
  lVar11 = *(long *)(unaff_x20 + 0x68);
  uVar2 = *(ulong *)(unaff_x20 + 0x70);
  uVar10 = *(ulong *)(unaff_x20 + 0x60);
  uVar6 = 0;
  if (uVar10 <= uVar2) {
    uVar6 = uVar10;
  }
  lVar14 = uVar2 - uVar6;
  uVar9 = uVar10 - lVar14;
  if (uVar8 <= uVar9) {
    uVar10 = lVar14 + uVar8;
  }
  uVar1 = 0;
  if (uVar9 <= uVar8) {
    uVar1 = uVar8 - uVar9;
  }
  if (uVar10 - lVar14 != 0) {
    uVar10 = (uVar10 - lVar14) * 0x18;
    uVar12 = uVar10 / 0x18;
    if (uVar10 < 0x60) {
      lVar20 = 0;
      uVar13 = 0;
    }
    else {
      lVar20 = 0;
      lVar14 = 0;
      lVar15 = 0;
      lVar16 = 0;
      uVar13 = uVar12 & 0xffffffffffffffc;
      plVar7 = (long *)(uVar2 * 0x18 + uVar6 * -0x18 + lVar11 + 0x40);
      uVar10 = uVar13;
      do {
        lVar20 = plVar7[-6] + lVar20;
        lVar14 = plVar7[-3] + lVar14;
        lVar15 = *plVar7 + lVar15;
        lVar16 = plVar7[3] + lVar16;
        plVar7 = plVar7 + 0xc;
        uVar10 = uVar10 - 4;
      } while (uVar10 != 0);
      lVar20 = lVar16 + lVar15 + lVar14 + lVar20;
      if (uVar12 == uVar13) goto LAB_0024c350;
    }
    lVar14 = uVar13 - uVar12;
    plVar7 = (long *)(uVar2 * 0x18 + uVar13 * 0x18 + uVar6 * -0x18 + lVar11 + 0x10);
    do {
      lVar20 = *plVar7 + lVar20;
      bVar5 = lVar14 != -1;
      lVar14 = lVar14 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar5);
  }
LAB_0024c350:
  if (uVar9 < uVar8) {
    if (uVar1 < 4) {
      uVar10 = 0;
    }
    else {
      lVar14 = 0;
      lVar15 = 0;
      lVar16 = 0;
      uVar10 = uVar1 & 0xfffffffffffffffc;
      plVar7 = (long *)(lVar11 + 0x40);
      uVar6 = uVar10;
      do {
        lVar20 = plVar7[-6] + lVar20;
        lVar14 = plVar7[-3] + lVar14;
        lVar15 = *plVar7 + lVar15;
        lVar16 = plVar7[3] + lVar16;
        plVar7 = plVar7 + 0xc;
        uVar6 = uVar6 - 4;
      } while (uVar6 != 0);
      lVar20 = lVar16 + lVar15 + lVar14 + lVar20;
      if (uVar1 == uVar10) goto LAB_0024c3ec;
    }
    uVar6 = uVar8;
    if (uVar9 <= uVar8) {
      uVar6 = uVar9;
    }
    lVar14 = (uVar10 + uVar6) - uVar8;
    plVar7 = (long *)(lVar11 + uVar10 * 0x18 + 0x10);
    do {
      lVar20 = *plVar7 + lVar20;
      bVar5 = lVar14 != -1;
      lVar14 = lVar14 + 1;
      plVar7 = plVar7 + 3;
    } while (bVar5);
  }
LAB_0024c3ec:
  lVar11 = *(long *)(unaff_x20 + 0x80);
  uVar3 = *(undefined1 *)(unaff_x20 + 0x337);
  unaff_x21[1] = lVar19 - *(long *)(unaff_x20 + 0xb8);
  unaff_x21[2] = lVar20 - lVar11;
  *(undefined1 *)(unaff_x21 + 3) = uVar3;
  *unaff_x21 = -0x7fffffffffffffd9;
  return;
}

