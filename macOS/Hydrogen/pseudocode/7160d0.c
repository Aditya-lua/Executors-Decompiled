
/* WARNING: Removing unreachable block (ram,0x00716260) */

undefined8 FUN_007160d0(void)

{
  long *plVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  long unaff_x19;
  undefined8 uVar11;
  uint *unaff_x20;
  undefined8 uVar12;
  long lVar13;
  long *unaff_x23;
  int unaff_w24;
  long lVar14;
  long unaff_x26;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined8 in_stack_00000048;
  undefined8 uStack00000000000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined1 in_stack_000000f0;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
  func_0x00710d48();
  if (unaff_w24 == 0) {
    if ((*(long *)(unaff_x19 + 0x98) == 0) ||
       (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x98),"with"), iVar4 != 0)) {
      func_0x007181dc();
    }
    else {
      func_0x00710d48();
    }
  }
  lVar14 = 0;
  lVar8 = *(long *)(unaff_x19 + 0x330);
  lVar10 = *(long *)(unaff_x19 + 0x328);
  *(long *)(unaff_x29 + -0xa0) = unaff_x19 + 0x328;
  *(long *)(unaff_x29 + -0x98) = (lVar8 - lVar10 >> 3) * 0x6db6db6db6db6db7;
  *(undefined8 *)(unaff_x29 + -0x90) = 0;
  uVar2 = *(uint *)(unaff_x19 + 0x80);
  if (uVar2 != 0x128) {
    lVar14 = 0;
    do {
      in_stack_00000110 = 0;
      in_stack_00000118 = 0;
      auVar20 = ZEXT816(0);
      if ((uVar2 & 0xfffffffe) == 0x11c) {
        auVar20 = func_0x007188d4();
        if (*unaff_x20 != 299) {
          *(undefined8 *)(unaff_x29 + -0xd0) = 0;
          *(undefined8 *)(unaff_x29 + -200) = 0;
          *(undefined8 *)(unaff_x29 + -0xe8) = 0;
          *(undefined8 *)(unaff_x29 + -0xe0) = 0;
          _in_stack_00000110 = auVar20;
          func_0x0070aa74(&uStack00000000000000d0);
          uVar11 = func_0x00716770();
          if (in_stack_000000e0 < 0) {
            __ZdlPv(uStack00000000000000d0);
          }
          goto code_r0x00716240;
        }
LAB_007162f4:
        _in_stack_00000110 = auVar20;
        func_0x0071a218(&uStack00000000000000d0);
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      }
      else if (uVar2 == 0x5b) {
        uVar11 = *(undefined8 *)unaff_x20;
        uVar15 = *(undefined8 *)(unaff_x20 + 6);
        uVar12 = *(undefined8 *)(unaff_x20 + 4);
        *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x20 + 2);
        *(undefined8 *)(unaff_x29 + -0xd0) = uVar11;
        *(undefined8 *)(unaff_x29 + -0xb8) = uVar15;
        *(undefined8 *)(unaff_x29 + -0xc0) = uVar12;
        func_0x00710d48();
        if ((*unaff_x20 & 0xfffffffe) == 0x116) {
          func_0x0070c3d0(&uStack00000000000000d0,unaff_x19 + 0x60);
          if ((int)uStack00000000000000d0 == 0x5d) {
            lVar10 = *(long *)(unaff_x19 + 0x84);
            func_0x0071af20(unaff_x29 + -0xe8);
            lVar8 = *(long *)(unaff_x19 + 0xa8);
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
            uVar11 = func_0x0071cf0c();
            *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
            if (*(char *)(unaff_x29 + -0xd8) != '\0') {
              lVar13 = *(long *)(unaff_x29 + -0xe8);
              lVar6 = _memchr(lVar13,0,*(undefined8 *)(unaff_x29 + -0xe0));
              if (lVar6 == 0) {
                in_stack_000000f0 = 0;
                *(undefined8 *)(unaff_x26 + 0x24) = *(undefined8 *)(unaff_x26 + 0x94);
                *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
                uStack00000000000000d0 = lVar13;
                in_stack_000000d8 = lVar10;
                in_stack_000000e0 = lVar8;
                in_stack_000000e8 = uVar11;
                func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
                goto code_r0x007162ac;
              }
            }
            func_0x007181dc();
            goto code_r0x007162ac;
          }
        }
        if (lVar14 == 0) {
          func_0x0071b1d4(&uStack00000000000000d0);
          lVar14 = uStack00000000000000d0;
        }
        else {
          func_0x0071b1d4(&uStack00000000000000d0);
          func_0x007181dc();
        }
      }
      else {
        if (uVar2 == 299) goto LAB_007162f4;
        if (uVar2 != 0x119) {
          func_0x0072415c();
          break;
        }
        lVar8 = *unaff_x23;
        lVar10 = *(long *)(unaff_x19 + 0x98);
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
        *(long *)(unaff_x26 + 0x24) = lVar8;
        *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
        uStack00000000000000d0 = lVar10;
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      }
code_r0x007162ac:
      uVar2 = *unaff_x20;
    } while (uVar2 != 0x128);
  }
  uVar12 = *(undefined8 *)(unaff_x19 + 0x8c);
  func_0x00710d48();
  uVar11 = *(undefined8 *)(unaff_x19 + 0xd8);
  uStack00000000000000d0 = in_stack_00000048;
  lVar8 = *(long *)(unaff_x29 + -0x90);
  in_stack_000000d8 = uVar12;
  if (lVar8 == 0) {
    puVar5 = (undefined8 *)0x0;
  }
  else {
    lVar10 = *(long *)(unaff_x29 + -0x98);
    lVar13 = **(long **)(unaff_x29 + -0xa0);
    puVar5 = (undefined8 *)func_0x00704c24(uVar11,lVar8 * 0x38);
    puVar7 = (undefined8 *)(lVar13 + lVar10 * 0x38);
    puVar9 = puVar5;
    lVar10 = lVar8;
    do {
      uVar15 = puVar7[1];
      uVar12 = *puVar7;
      uVar17 = puVar7[3];
      uVar16 = puVar7[2];
      uVar19 = puVar7[5];
      uVar18 = puVar7[4];
      puVar9[6] = puVar7[6];
      puVar9[3] = uVar17;
      puVar9[2] = uVar16;
      puVar9[5] = uVar19;
      puVar9[4] = uVar18;
      puVar9[1] = uVar15;
      *puVar9 = uVar12;
      puVar7 = puVar7 + 7;
      lVar10 = lVar10 + -1;
      puVar9 = puVar9 + 7;
    } while (lVar10 != 0);
  }
  *(undefined8 **)(unaff_x29 + -0xd0) = puVar5;
  *(long *)(unaff_x29 + -200) = lVar8;
  uVar11 = func_0x00704c24(uVar11,0x50);
  func_0x00707bb8(uVar11,&uStack00000000000000d0,unaff_x29 + -0x78,unaff_x28,1,unaff_x29 + -0xd0,
                  lVar14);
code_r0x00716240:
  plVar1 = *(long **)(unaff_x29 + -0xa0);
  lVar14 = *plVar1 + *(long *)(unaff_x29 + -0x98) * 0x38;
  if (lVar14 != plVar1[1]) {
    plVar1[1] = lVar14;
  }
  return uVar11;
}

