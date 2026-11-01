
/* WARNING: Removing unreachable block (ram,0x00716260) */

undefined8 FUN_007164c8(undefined8 *param_1)

{
  long *plVar1;
  uint uVar2;
  undefined4 uVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long unaff_x19;
  undefined8 uVar9;
  long lVar10;
  uint *unaff_x20;
  undefined8 *unaff_x21;
  long lVar11;
  long lVar12;
  long *unaff_x23;
  long lVar13;
  long unaff_x26;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack00000000000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined1 in_stack_000000f0;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
  do {
    func_0x0071b1d4(param_1);
    lVar10 = uStack00000000000000d0;
LAB_007162ac:
    uVar2 = *unaff_x20;
    if (uVar2 == 0x128) {
code_r0x0071617c:
      uVar9 = *(undefined8 *)(unaff_x19 + 0x8c);
      func_0x00710d48();
      uVar6 = *(undefined8 *)(unaff_x19 + 0xd8);
      uStack00000000000000d0 = in_stack_00000048;
      lVar12 = *(long *)(unaff_x29 + -0x90);
      in_stack_000000d8 = uVar9;
      if (lVar12 == 0) {
        puVar4 = (undefined8 *)0x0;
      }
      else {
        lVar13 = *(long *)(unaff_x29 + -0x98);
        lVar11 = **(long **)(unaff_x29 + -0xa0);
        puVar4 = (undefined8 *)func_0x00704c24(uVar6,lVar12 * 0x38);
        puVar7 = (undefined8 *)(lVar11 + lVar13 * 0x38);
        puVar8 = puVar4;
        lVar13 = lVar12;
        do {
          uVar14 = puVar7[1];
          uVar9 = *puVar7;
          uVar16 = puVar7[3];
          uVar15 = puVar7[2];
          uVar18 = puVar7[5];
          uVar17 = puVar7[4];
          puVar8[6] = puVar7[6];
          puVar8[3] = uVar16;
          puVar8[2] = uVar15;
          puVar8[5] = uVar18;
          puVar8[4] = uVar17;
          puVar8[1] = uVar14;
          *puVar8 = uVar9;
          puVar7 = puVar7 + 7;
          lVar13 = lVar13 + -1;
          puVar8 = puVar8 + 7;
        } while (lVar13 != 0);
      }
      *(undefined8 **)(unaff_x29 + -0xd0) = puVar4;
      *(long *)(unaff_x29 + -200) = lVar12;
      uVar6 = func_0x00704c24(uVar6,0x50);
      func_0x00707bb8(uVar6,&uStack00000000000000d0,unaff_x29 + -0x78,unaff_x28,in_stack_00000040,
                      unaff_x29 + -0xd0,lVar10);
code_r0x00716240:
      plVar1 = *(long **)(unaff_x29 + -0xa0);
      lVar10 = *plVar1 + *(long *)(unaff_x29 + -0x98) * 0x38;
      if (lVar10 != plVar1[1]) {
        plVar1[1] = lVar10;
      }
      return uVar6;
    }
    in_stack_00000110 = 0;
    in_stack_00000118 = 0;
    auVar19 = ZEXT816(0);
    if ((uVar2 & 0xfffffffe) == 0x11c) {
      auVar19 = func_0x007188d4();
      if (*unaff_x20 != 299) {
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        _in_stack_00000110 = auVar19;
        func_0x0070aa74(&uStack00000000000000d0);
        uVar6 = func_0x00716770();
        if (in_stack_000000e0 < 0) {
          __ZdlPv(uStack00000000000000d0);
        }
        goto code_r0x00716240;
      }
code_r0x007162f4:
      _in_stack_00000110 = auVar19;
      func_0x0071a218(&uStack00000000000000d0);
      func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      goto LAB_007162ac;
    }
    if (uVar2 != 0x5b) {
      if (uVar2 != 299) {
        if (uVar2 != 0x119) {
          func_0x0072415c();
          goto code_r0x0071617c;
        }
        lVar12 = *unaff_x23;
        lVar13 = *(long *)(unaff_x19 + 0x98);
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
        uVar6 = *(undefined8 *)(unaff_x29 + -0xd0);
        unaff_x21[1] = *(undefined8 *)(unaff_x29 + -200);
        *unaff_x21 = uVar6;
        in_stack_000000f0 = 0;
        *(long *)(unaff_x26 + 0x24) = lVar12;
        *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
        uStack00000000000000d0 = lVar13;
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
        goto LAB_007162ac;
      }
      goto code_r0x007162f4;
    }
    uVar6 = *(undefined8 *)unaff_x20;
    uVar14 = *(undefined8 *)(unaff_x20 + 6);
    uVar9 = *(undefined8 *)(unaff_x20 + 4);
    *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x20 + 2);
    *(undefined8 *)(unaff_x29 + -0xd0) = uVar6;
    *(undefined8 *)(unaff_x29 + -0xb8) = uVar14;
    *(undefined8 *)(unaff_x29 + -0xc0) = uVar9;
    func_0x00710d48();
    if ((*unaff_x20 & 0xfffffffe) == 0x116) {
      func_0x0070c3d0(&uStack00000000000000d0,in_stack_00000038);
      if ((int)uStack00000000000000d0 == 0x5d) {
        lVar13 = *(long *)(unaff_x19 + 0x84);
        func_0x0071af20(unaff_x29 + -0xe8);
        lVar12 = *(long *)(unaff_x19 + 0xa8);
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
        uVar6 = func_0x0071cf0c();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar3;
        if (*(char *)(unaff_x29 + -0xd8) != '\0') {
          lVar11 = *(long *)(unaff_x29 + -0xe8);
          lVar5 = _memchr(lVar11,0,*(undefined8 *)(unaff_x29 + -0xe0));
          if (lVar5 == 0) {
            in_stack_000000f0 = 0;
            *(undefined8 *)(unaff_x26 + 0x24) = *(undefined8 *)(unaff_x26 + 0x94);
            *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
            uStack00000000000000d0 = lVar11;
            in_stack_000000d8 = lVar13;
            in_stack_000000e0 = lVar12;
            in_stack_000000e8 = uVar6;
            func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
            goto LAB_007162ac;
          }
        }
        func_0x007181dc();
        goto LAB_007162ac;
      }
    }
    if (lVar10 != 0) {
      func_0x0071b1d4(&uStack00000000000000d0);
      func_0x007181dc();
      goto LAB_007162ac;
    }
    param_1 = &uStack00000000000000d0;
  } while( true );
}

