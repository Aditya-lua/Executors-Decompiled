
/* WARNING: Removing unreachable block (ram,0x00716260) */

undefined8 FUN_00716548(void)

{
  long *plVar1;
  uint uVar2;
  undefined4 uVar3;
  undefined1 in_ZR;
  undefined8 *puVar4;
  undefined8 uVar5;
  long lVar6;
  int in_w8;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long unaff_x19;
  undefined8 uVar9;
  long lVar10;
  uint *unaff_x20;
  undefined8 *unaff_x21;
  long lVar11;
  long unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  undefined4 unaff_w28;
  long unaff_x29;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  long in_stack_00000028;
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
  
code_r0x00716548:
  if ((!(bool)in_ZR) && (in_w8 != 0x7c)) {
    func_0x0071f5c8();
    *(undefined4 *)(unaff_x19 + 0x114) = unaff_w28;
  }
  uVar5 = func_0x0071cf0c();
  *(undefined4 *)(unaff_x19 + 0x114) = unaff_w28;
  if (*(char *)(unaff_x29 + -0xd8) != '\0') {
    lVar10 = *(long *)(unaff_x29 + -0xe8);
    lVar6 = _memchr(lVar10,0,*(undefined8 *)(unaff_x29 + -0xe0));
    if (lVar6 == 0) {
      in_stack_000000e0 = in_stack_00000028;
      in_stack_000000f0 = 0;
      *(undefined8 *)(unaff_x26 + 0x24) = *(undefined8 *)(unaff_x26 + 0x94);
      *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
      uStack00000000000000d0 = lVar10;
      in_stack_000000d8 = unaff_x22;
      in_stack_000000e8 = uVar5;
      func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
      goto LAB_007162ac;
    }
  }
  func_0x007181dc();
LAB_007162ac:
  do {
    uVar2 = *unaff_x20;
    if (uVar2 == 0x128) {
code_r0x0071617c:
      uVar9 = *(undefined8 *)(unaff_x19 + 0x8c);
      func_0x00710d48();
      uVar5 = *(undefined8 *)(unaff_x19 + 0xd8);
      uStack00000000000000d0 = in_stack_00000048;
      lVar10 = *(long *)(unaff_x29 + -0x90);
      in_stack_000000d8 = uVar9;
      if (lVar10 == 0) {
        puVar4 = (undefined8 *)0x0;
      }
      else {
        lVar6 = *(long *)(unaff_x29 + -0x98);
        lVar11 = **(long **)(unaff_x29 + -0xa0);
        puVar4 = (undefined8 *)func_0x00704c24(uVar5,lVar10 * 0x38);
        puVar7 = (undefined8 *)(lVar11 + lVar6 * 0x38);
        puVar8 = puVar4;
        lVar6 = lVar10;
        do {
          uVar12 = puVar7[1];
          uVar9 = *puVar7;
          uVar14 = puVar7[3];
          uVar13 = puVar7[2];
          uVar16 = puVar7[5];
          uVar15 = puVar7[4];
          puVar8[6] = puVar7[6];
          puVar8[3] = uVar14;
          puVar8[2] = uVar13;
          puVar8[5] = uVar16;
          puVar8[4] = uVar15;
          puVar8[1] = uVar12;
          *puVar8 = uVar9;
          puVar7 = puVar7 + 7;
          lVar6 = lVar6 + -1;
          puVar8 = puVar8 + 7;
        } while (lVar6 != 0);
      }
      *(undefined8 **)(unaff_x29 + -0xd0) = puVar4;
      *(long *)(unaff_x29 + -200) = lVar10;
      uVar5 = func_0x00704c24(uVar5,0x50);
      func_0x00707bb8(uVar5,&uStack00000000000000d0,unaff_x29 + -0x78,unaff_x25,in_stack_00000040,
                      unaff_x29 + -0xd0,unaff_x24);
code_r0x00716240:
      plVar1 = *(long **)(unaff_x29 + -0xa0);
      lVar10 = *plVar1 + *(long *)(unaff_x29 + -0x98) * 0x38;
      if (lVar10 != plVar1[1]) {
        plVar1[1] = lVar10;
      }
      return uVar5;
    }
    in_stack_00000110 = 0;
    in_stack_00000118 = 0;
    auVar17 = ZEXT816(0);
    if ((uVar2 & 0xfffffffe) == 0x11c) {
      auVar17 = func_0x007188d4();
      if (*unaff_x20 != 299) {
        *(undefined8 *)(unaff_x29 + -0xd0) = 0;
        *(undefined8 *)(unaff_x29 + -200) = 0;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        _in_stack_00000110 = auVar17;
        func_0x0070aa74(&uStack00000000000000d0);
        uVar5 = func_0x00716770();
        if (in_stack_000000e0 < 0) {
          __ZdlPv(uStack00000000000000d0);
        }
        goto code_r0x00716240;
      }
    }
    else {
      if (uVar2 == 0x5b) {
        uVar5 = *(undefined8 *)unaff_x20;
        uVar12 = *(undefined8 *)(unaff_x20 + 6);
        uVar9 = *(undefined8 *)(unaff_x20 + 4);
        *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x20 + 2);
        *(undefined8 *)(unaff_x29 + -0xd0) = uVar5;
        *(undefined8 *)(unaff_x29 + -0xb8) = uVar12;
        *(undefined8 *)(unaff_x29 + -0xc0) = uVar9;
        func_0x00710d48();
        if ((*unaff_x20 & 0xfffffffe) == 0x116) {
          func_0x0070c3d0(&uStack00000000000000d0,in_stack_00000038);
          if ((int)uStack00000000000000d0 == 0x5d) break;
        }
        if (unaff_x24 == 0) {
          func_0x0071b1d4(&uStack00000000000000d0);
          unaff_x24 = uStack00000000000000d0;
        }
        else {
          func_0x0071b1d4(&uStack00000000000000d0);
          func_0x007181dc();
        }
        goto LAB_007162ac;
      }
      if (uVar2 != 299) {
        if (uVar2 != 0x119) {
          func_0x0072415c();
          goto code_r0x0071617c;
        }
        lVar10 = *unaff_x23;
        lVar6 = *(long *)(unaff_x19 + 0x98);
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
        uVar5 = *(undefined8 *)(unaff_x29 + -0xd0);
        unaff_x21[1] = *(undefined8 *)(unaff_x29 + -200);
        *unaff_x21 = uVar5;
        in_stack_000000f0 = 0;
        *(long *)(unaff_x26 + 0x24) = lVar10;
        *(undefined8 *)(unaff_x26 + 0x2c) = *(undefined8 *)(unaff_x19 + 0xa8);
        uStack00000000000000d0 = lVar6;
        func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
        goto LAB_007162ac;
      }
    }
    _in_stack_00000110 = auVar17;
    func_0x0071a218(&uStack00000000000000d0);
    func_0x0071ad94(unaff_x29 + -0xa0,&uStack00000000000000d0);
  } while( true );
  unaff_x22 = *(long *)(unaff_x19 + 0x84);
  func_0x0071af20(unaff_x29 + -0xe8);
  in_stack_00000028 = *(long *)(unaff_x19 + 0xa8);
  uStack00000000000000d0 = CONCAT44(uStack00000000000000d0._4_4_,*(undefined4 *)(unaff_x29 + -0xd0))
  ;
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
  unaff_w28 = *(undefined4 *)(unaff_x19 + 0x114);
  in_stack_000000d8 = unaff_x23[1];
  uStack00000000000000d0 = *unaff_x23;
  in_w8 = *(int *)(unaff_x19 + 0x80);
  in_ZR = in_w8 == 0x26;
  goto code_r0x00716548;
}

