
/* WARNING: Removing unreachable block (ram,0x00716260) */

undefined8 FUN_00716078(void)

{
  long *plVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long unaff_x19;
  uint *unaff_x20;
  undefined8 uVar12;
  undefined8 uVar13;
  long lVar14;
  long *unaff_x23;
  int unaff_w24;
  long lVar15;
  long unaff_x26;
  long unaff_x29;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  undefined8 uStack0000000000000040;
  undefined8 uStack00000000000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined1 in_stack_000000f0;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
  func_0x0072415c();
  uVar7 = *(undefined8 *)(unaff_x19 + 0x84);
  uVar13 = *(undefined8 *)(unaff_x19 + 0x128);
  *(undefined8 *)(unaff_x29 + -0x70) = uVar7;
  *(undefined8 *)(unaff_x29 + -0x68) = uVar7;
  *(undefined8 *)(unaff_x29 + -0x78) = uVar13;
  if ((*(long *)(unaff_x19 + 0x98) == 0) ||
     (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x98),"extends"), iVar4 != 0)) {
    uVar7 = 0;
    uStack0000000000000040 = 0;
  }
  else {
    func_0x00710d48();
    if (*(int *)(unaff_x19 + 0x80) == 0x119) {
      uVar7 = *(undefined8 *)(unaff_x19 + 0x98);
      func_0x00710d48();
    }
    else {
      func_0x0072415c();
      uVar7 = *(undefined8 *)(unaff_x19 + 0x128);
    }
    uStack0000000000000040 = 1;
  }
  if (unaff_w24 == 0) {
    if ((*(long *)(unaff_x19 + 0x98) == 0) ||
       (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x98),"with"), iVar4 != 0)) {
      func_0x007181dc();
    }
    else {
      func_0x00710d48();
    }
  }
  lVar15 = 0;
  lVar9 = *(long *)(unaff_x19 + 0x330);
  lVar11 = *(long *)(unaff_x19 + 0x328);
  *(long *)(unaff_x29 + -0xa0) = unaff_x19 + 0x328;
  *(long *)(unaff_x29 + -0x98) = (lVar9 - lVar11 >> 3) * 0x6db6db6db6db6db7;
  *(undefined8 *)(unaff_x29 + -0x90) = 0;
  uVar2 = *(uint *)(unaff_x19 + 0x80);
  if (uVar2 != 0x128) {
    lVar15 = 0;
    do {
      in_stack_00000110 = 0;
      in_stack_00000118 = 0;
      auVar21 = ZEXT816(0);
      if ((uVar2 & 0xfffffffe) == 0x11c) {
        auVar21 = func_0x007188d4();
        if (*unaff_x20 != 299) {
          *(undefined8 *)(unaff_x29 + -0xd0) = 0;
          *(undefined8 *)(unaff_x29 + -200) = 0;
          *(undefined8 *)(unaff_x29 + -0xe8) = 0;
          *(undefined8 *)(unaff_x29 + -0xe0) = 0;
          _in_stack_00000110 = auVar21;
          func_0x0070aa74(&uStack00000000000000d0);
          uVar13 = func_0x00716770();
          if (in_stack_000000e0 < 0) {
            __ZdlPv(uStack00000000000000d0);
          }
          goto code_r0x00716240;
        }
code_r0x007162f4:
        _in_stack_00000110 = auVar21;
        func_0x0071a218(&uStack00000000000000d0);
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      }
      else if (uVar2 == 0x5b) {
        uVar13 = *(undefined8 *)unaff_x20;
        uVar16 = *(undefined8 *)(unaff_x20 + 6);
        uVar12 = *(undefined8 *)(unaff_x20 + 4);
        *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x20 + 2);
        *(undefined8 *)(unaff_x29 + -0xd0) = uVar13;
        *(undefined8 *)(unaff_x29 + -0xb8) = uVar16;
        *(undefined8 *)(unaff_x29 + -0xc0) = uVar12;
        func_0x00710d48();
        if ((*unaff_x20 & 0xfffffffe) == 0x116) {
          func_0x0070c3d0(&uStack00000000000000d0,unaff_x19 + 0x60);
          if ((int)uStack00000000000000d0 == 0x5d) {
            lVar11 = *(long *)(unaff_x19 + 0x84);
            func_0x0071af20(unaff_x29 + -0xe8);
            lVar9 = *(long *)(unaff_x19 + 0xa8);
            uStack00000000000000d0 =
                 CONCAT44(uStack00000000000000d0._4_4_,*(undefined4 *)(unaff_x29 + -0xd0));
            *(undefined8 *)(unaff_x26 + 4) = *(undefined8 *)(unaff_x26 + 0x94);
            if (*(int *)(unaff_x19 + 0x80) == 0x5d) {
              func_0x00710d48();
            }
            else {
              func_0x00721808();
              func_0x007244d4();
            }
            if (*unaff_x20 == 0x3a) {
              func_0x00710d48();
            }
            else {
              func_0x0072447c();
            }
            uVar3 = *(undefined4 *)(unaff_x19 + 0x114);
            in_stack_000000d8 = unaff_x23[1];
            uStack00000000000000d0 = *unaff_x23;
            if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
              func_0x0071f5c8();
              *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
            }
            uVar13 = func_0x0071cf0c();
            *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
            if (*(char *)(unaff_x29 + -0xd8) != '\0') {
              lVar14 = *(long *)(unaff_x29 + -0xe8);
              lVar6 = _memchr(lVar14,0,*(undefined8 *)(unaff_x29 + -0xe0));
              if (lVar6 == 0) {
                in_stack_000000f0 = 0;
                *(undefined8 *)(unaff_x26 + 0x24) = *(undefined8 *)(unaff_x26 + 0x94);
                *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
                uStack00000000000000d0 = lVar14;
                in_stack_000000d8 = lVar11;
                in_stack_000000e0 = lVar9;
                in_stack_000000e8 = uVar13;
                func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
                goto code_r0x007162ac;
              }
            }
            func_0x007181dc();
            goto code_r0x007162ac;
          }
        }
        if (lVar15 == 0) {
          func_0x0071b1d4(&uStack00000000000000d0);
          lVar15 = uStack00000000000000d0;
        }
        else {
          func_0x0071b1d4(&uStack00000000000000d0);
          func_0x007181dc();
        }
      }
      else {
        if (uVar2 == 299) goto code_r0x007162f4;
        if (uVar2 != 0x119) {
          func_0x0072415c();
          break;
        }
        lVar9 = *unaff_x23;
        lVar11 = *(long *)(unaff_x19 + 0x98);
        in_stack_000000d8 = unaff_x23[1];
        uStack00000000000000d0 = *unaff_x23;
        func_0x00710d48();
        *(long *)(unaff_x29 + -200) = in_stack_000000d8;
        *(long *)(unaff_x29 + -0xd0) = uStack00000000000000d0;
        if (*unaff_x20 == 0x3a) {
          func_0x00710d48();
        }
        else {
          func_0x0072447c();
        }
        uVar3 = *(undefined4 *)(unaff_x19 + 0x114);
        in_stack_000000d8 = unaff_x23[1];
        uStack00000000000000d0 = *unaff_x23;
        if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
          func_0x0071f5c8();
          *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
        }
        in_stack_000000e8 = func_0x0071cf0c();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
        in_stack_000000e0 = *(long *)(unaff_x29 + -200);
        in_stack_000000d8 = *(long *)(unaff_x29 + -0xd0);
        in_stack_000000f0 = 0;
        *(long *)(unaff_x26 + 0x24) = lVar9;
        *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
        uStack00000000000000d0 = lVar11;
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      }
code_r0x007162ac:
      uVar2 = *unaff_x20;
    } while (uVar2 != 0x128);
  }
  uVar12 = *(undefined8 *)(unaff_x19 + 0x8c);
  func_0x00710d48();
  uVar13 = *(undefined8 *)(unaff_x19 + 0xd8);
  lVar9 = *(long *)(unaff_x29 + -0x90);
  in_stack_000000d8 = uVar12;
  if (lVar9 == 0) {
    puVar5 = (undefined8 *)0x0;
  }
  else {
    lVar11 = *(long *)(unaff_x29 + -0x98);
    lVar14 = **(long **)(unaff_x29 + -0xa0);
    puVar5 = (undefined8 *)func_0x00704c24(uVar13,lVar9 * 0x38);
    puVar8 = (undefined8 *)(lVar14 + lVar11 * 0x38);
    puVar10 = puVar5;
    lVar11 = lVar9;
    do {
      uVar16 = puVar8[1];
      uVar12 = *puVar8;
      uVar18 = puVar8[3];
      uVar17 = puVar8[2];
      uVar20 = puVar8[5];
      uVar19 = puVar8[4];
      puVar10[6] = puVar8[6];
      puVar10[3] = uVar18;
      puVar10[2] = uVar17;
      puVar10[5] = uVar20;
      puVar10[4] = uVar19;
      puVar10[1] = uVar16;
      *puVar10 = uVar12;
      puVar8 = puVar8 + 7;
      lVar11 = lVar11 + -1;
      puVar10 = puVar10 + 7;
    } while (lVar11 != 0);
  }
  *(undefined8 **)(unaff_x29 + -0xd0) = puVar5;
  *(long *)(unaff_x29 + -200) = lVar9;
  uVar13 = func_0x00704c24(uVar13,0x50);
  func_0x00707bb8(uVar13,&uStack00000000000000d0,unaff_x29 + -0x78,uVar7,uStack0000000000000040,
                  unaff_x29 + -0xd0,lVar15);
code_r0x00716240:
  plVar1 = *(long **)(unaff_x29 + -0xa0);
  lVar15 = *plVar1 + *(long *)(unaff_x29 + -0x98) * 0x38;
  if (lVar15 != plVar1[1]) {
    plVar1[1] = lVar15;
  }
  return uVar13;
}

